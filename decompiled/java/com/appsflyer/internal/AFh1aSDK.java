package com.appsflyer.internal;

/* JADX INFO: loaded from: classes31.dex */
public final class AFh1aSDK {
    public final int AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final long AFKeystoreWrapper;
    public final AFh1bSDK e;
    public final String registerClient;
    public final Throwable unregisterClient;
    public final String valueOf;
    public final long values;

    public AFh1aSDK(String str, String str2, long j, long j2, int i, AFh1bSDK aFh1bSDK, String str3, Throwable th) {
        this.AFInAppEventType = str;
        this.valueOf = str2;
        this.values = j;
        this.AFKeystoreWrapper = j2;
        this.AFInAppEventParameterName = i;
        this.e = aFh1bSDK;
        this.registerClient = str3;
        this.unregisterClient = th;
    }
}
