package com.appsflyer.internal;

import X.C08FF;

/* JADX INFO: loaded from: classes31.dex */
public enum AFh1tSDK {
    onReceive,
    logSession,
    logEvent,
    setCustomerIdAndLogSession;

    public static AFh1tSDK valueOf(String str) {
        return (AFh1tSDK) C08FF.LIZ(AFh1tSDK.class, str);
    }
}
