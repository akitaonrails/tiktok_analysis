package com.appsflyer.internal;

/* JADX INFO: loaded from: classes31.dex */
public final class AFh1lSDK extends AFh1kSDK {
    public AFh1lSDK() {
        super("af_purchase", Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        return AFf1zSDK.PURCHASE_VALIDATE;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFa1qSDK valueOf(String str) {
        super.valueOf(AFa1qSDK.AFInAppEventType(str));
        return this;
    }
}
