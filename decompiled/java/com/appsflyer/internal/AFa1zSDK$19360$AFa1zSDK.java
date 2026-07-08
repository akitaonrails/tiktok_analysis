package com.appsflyer.internal;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum AFa1zSDK$19360$AFa1zSDK {
    HOOKING("hk"),
    DEBUGGABLE("dbg");

    public String AFKeystoreWrapper;

    public static AFa1zSDK$19360$AFa1zSDK valueOf(String str) {
        return (AFa1zSDK$19360$AFa1zSDK) C08FF.LIZ(AFa1zSDK$19360$AFa1zSDK.class, str);
    }

    AFa1zSDK$19360$AFa1zSDK(String str) {
        this.AFKeystoreWrapper = str;
    }
}
