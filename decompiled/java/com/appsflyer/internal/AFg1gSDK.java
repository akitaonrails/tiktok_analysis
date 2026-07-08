package com.appsflyer.internal;

import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1gSDK extends AFg1fSDK {
    public final AFd1kSDK AFInAppEventParameterName;

    public AFg1gSDK(AFd1kSDK aFd1kSDK) {
        this.AFInAppEventParameterName = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z3) {
            if (a0.LJJJIL(str)) {
                str = "missing label";
            }
            this.AFInAppEventParameterName.getCurrency().values(th, withTag$SDK_prodRelease(str, aFg1aSDK));
        }
    }
}
