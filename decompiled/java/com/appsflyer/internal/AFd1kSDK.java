package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes31.dex */
public interface AFd1kSDK {
    AFe1ySDK AFInAppEventParameterName();

    AFd1sSDK AFInAppEventType();

    ScheduledExecutorService AFKeystoreWrapper();

    AFh1wSDK AFLogger();

    AFh1zSDK AFLogger$LogLevel();

    AFi1qSDK AFPurchaseDetails();

    AFc1iSDK afDebugLog();

    AFb1tSDK afErrorLog();

    AFd1xSDK afErrorLogForExcManagerOnly();

    AFe1cSDK afInfoLog();

    AFh1cSDK afLogForce();

    AFc1vSDK afRDLog();

    AFe1gSDK afVerboseLog();

    AFi1sSDK afWarnLog();

    AFi1cSDK d();

    AFg1mSDK e();

    AFi1aSDK force();

    AFd1jSDK getCurrency();

    AFd1pSDK getLevel();

    AFc1kSDK getPurchaseToken();

    AFg1tSDK getPurchaseType();

    AFg1wSDK i();

    AFf1bSDK registerClient();

    PurchaseHandler unregisterClient();

    AFb1bSDK v();

    AFd1qSDK valueOf();

    ExecutorService values();

    AFd1lSDK w();
}
