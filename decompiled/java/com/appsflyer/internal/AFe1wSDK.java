package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFe1wSDK extends AFd1mSDK {
    public AFd1sSDK AFInAppEventType;
    public final boolean AFKeystoreWrapper;
    public final AFe1uSDK d;

    /* JADX WARN: Multi-variable type inference failed */
    public AFe1wSDK(AFd1sSDK aFd1sSDK, byte[] bArr) {
        this(aFd1sSDK, bArr, null, 0, 12, 0 == true ? 1 : 0);
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final String AFInAppEventParameterName() {
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType, null, 2, null);
        return aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.d) + aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName();
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final boolean AFInAppEventType() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFe1uSDK values() {
        return this.d;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final String AFInAppEventType(String str) {
        return "[RD]: ".concat(String.valueOf(str));
    }

    public AFe1wSDK(AFd1sSDK aFd1sSDK, byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        this.AFInAppEventType = aFd1sSDK;
        this.d = AFe1uSDK.OCTET_STREAM;
    }

    public /* synthetic */ AFe1wSDK(AFd1sSDK aFd1sSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? 2000 : i);
    }
}
