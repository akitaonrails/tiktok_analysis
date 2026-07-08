package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes31.dex */
public final class AFh1ySDK implements AFh1zSDK {
    public AFg1bSDK AFInAppEventParameterName;
    public AFg1hSDK AFInAppEventType;
    public final AFd1kSDK AFKeystoreWrapper;
    public AFg1gSDK values;

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFInAppEventParameterName() {
        AFg1bSDK aFg1bSDK = this.AFInAppEventParameterName;
        if (aFg1bSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1bSDK);
            this.AFInAppEventParameterName = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFInAppEventType() {
        AFg1hSDK aFg1hSDK = this.AFInAppEventType;
        if (aFg1hSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1hSDK);
            this.AFInAppEventType = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFKeystoreWrapper() {
        AFg1gSDK aFg1gSDK = this.values;
        if (aFg1gSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1gSDK);
            this.values = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void registerClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1fSDK[] aFg1fSDKArr = new AFg1fSDK[1];
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new AFg1hSDK();
        }
        aFg1fSDKArr[0] = this.AFInAppEventType;
        aFLogger.registerClient(aFg1fSDKArr);
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void valueOf() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1fSDK[] aFg1fSDKArr = new AFg1fSDK[1];
        if (this.values == null) {
            this.values = new AFg1gSDK(this.AFKeystoreWrapper);
        }
        aFg1fSDKArr[0] = this.values;
        aFLogger.registerClient(aFg1fSDKArr);
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void values() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1fSDK[] aFg1fSDKArr = new AFg1fSDK[1];
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = new AFg1bSDK(this.AFKeystoreWrapper);
        }
        aFg1fSDKArr[0] = this.AFInAppEventParameterName;
        aFLogger.registerClient(aFg1fSDKArr);
    }

    public AFh1ySDK(AFd1kSDK aFd1kSDK) {
        this.AFKeystoreWrapper = aFd1kSDK;
    }
}
