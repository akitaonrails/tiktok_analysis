package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFd1cSDK implements AFd1bSDK {
    public final AFd1gSDK values;

    public AFd1cSDK(AFd1gSDK aFd1gSDK) {
        this.values = aFd1gSDK;
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void valueOf(byte[] bArr, Map<String, String> map, int i) {
        if (new AFd1aSDK(bArr, map, 2000).AFKeystoreWrapper()) {
            this.values.AFInAppEventType();
        }
    }
}
