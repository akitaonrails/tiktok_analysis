package com.appsflyer.internal;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1bSDK extends AFg1fSDK {
    public final boolean AFInAppEventParameterName = true;
    public final AFd1kSDK valueOf;

    @Override // com.appsflyer.internal.AFg1fSDK
    public final boolean getShouldExtendMsg() {
        return this.AFInAppEventParameterName;
    }

    public AFg1bSDK(AFd1kSDK aFd1kSDK) {
        this.valueOf = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(AFg1aSDK aFg1aSDK, String str) {
        this.valueOf.v().AFKeystoreWrapper("F", values(str, aFg1aSDK));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(AFg1aSDK aFg1aSDK, String str, boolean z) {
        if (z) {
            this.valueOf.v().AFKeystoreWrapper("D", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(AFg1aSDK aFg1aSDK, String str, boolean z) {
        if (z) {
            this.valueOf.v().AFKeystoreWrapper("I", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(AFg1aSDK aFg1aSDK, String str, boolean z) {
        if (z) {
            this.valueOf.v().AFKeystoreWrapper("V", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(AFg1aSDK aFg1aSDK, String str, boolean z) {
        if (z) {
            this.valueOf.v().AFKeystoreWrapper("W", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            this.valueOf.v().AFKeystoreWrapper("E", values(str, aFg1aSDK));
            this.valueOf.v().values(th);
        }
    }
}
