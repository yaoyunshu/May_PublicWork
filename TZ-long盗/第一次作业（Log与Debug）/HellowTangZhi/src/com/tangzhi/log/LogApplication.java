package com.tangzhi.log;

import android.app.Application;

public class LogApplication extends Application{
    @Override  
    public void onCreate() {  
        super.onCreate();  
        CrashHandler crashHandler = CrashHandler.getInstance();  
        // 注册crashHandler  
        crashHandler.init(getApplicationContext());  
        // 发送以前没发送的报告(可选)  
        crashHandler.sendPreviousReportsToServer();  
    }

}
