package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1bSDK implements AFe1fSDK {
    public final Object AFInAppEventParameterName = new Object();
    public final AFd1sSDK AFInAppEventType;
    public final AFg1wSDK AFKeystoreWrapper;
    public AFh1aSDK AFLogger;
    public final AFg1zSDK d;
    public final AFe1ySDK e;
    public AFf1gSDK registerClient;
    public final AFe1cSDK unregisterClient;
    public final AFg1xSDK valueOf;
    public final AFg1ySDK values;

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void values(AFe1dSDK<?> aFe1dSDK) {
    }

    public final AFh1aSDK values() {
        AFh1aSDK aFh1aSDK;
        synchronized (this.AFInAppEventParameterName) {
            try {
                aFh1aSDK = this.AFLogger;
                this.AFLogger = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return aFh1aSDK;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        if (aFe1dSDK instanceof AFf1fSDK) {
            AFf1fSDK aFf1fSDK = (AFf1fSDK) aFe1dSDK;
            synchronized (this.AFInAppEventParameterName) {
                try {
                    this.AFLogger = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            AFInAppEventType(AFf1gSDK.FAILURE, aFf1fSDK.registerClient);
        }
    }

    public final void AFKeystoreWrapper(AFf1eSDK aFf1eSDK) {
        AFf1fSDK aFf1fSDK = new AFf1fSDK(this.values, this.AFInAppEventType, this.AFKeystoreWrapper, this.valueOf, this.e, this.d, "v1", aFf1eSDK);
        AFe1cSDK aFe1cSDK = this.unregisterClient;
        aFe1cSDK.valueOf.execute(aFe1cSDK.new AnonymousClass2(aFf1fSDK));
    }

    private void AFInAppEventType(AFf1gSDK aFf1gSDK, AFf1eSDK aFf1eSDK) {
        synchronized (this.AFInAppEventParameterName) {
            try {
                this.registerClient = aFf1gSDK;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (aFf1eSDK != null) {
            aFf1eSDK.onRemoteConfigUpdateFinished(aFf1gSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void values(AFe1dSDK<?> aFe1dSDK, AFe1bSDK aFe1bSDK) {
        if (aFe1dSDK instanceof AFf1fSDK) {
            AFf1fSDK aFf1fSDK = (AFf1fSDK) aFe1dSDK;
            AFf1gSDK aFf1gSDK = aFf1fSDK.d;
            if (aFf1gSDK == null) {
                AFLogger.INSTANCE.w(AFg1aSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1gSDK = AFf1gSDK.FAILURE;
            }
            if (aFf1gSDK != AFf1gSDK.USE_CACHED) {
                AFh1aSDK aFh1aSDK = aFf1fSDK.AFLogger;
                synchronized (this.AFInAppEventParameterName) {
                    try {
                        this.AFLogger = aFh1aSDK;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            AFInAppEventType(aFf1gSDK, aFf1fSDK.registerClient);
        }
    }

    public AFf1bSDK(AFg1ySDK aFg1ySDK, AFd1sSDK aFd1sSDK, AFg1wSDK aFg1wSDK, AFg1xSDK aFg1xSDK, AFe1ySDK aFe1ySDK, AFg1zSDK aFg1zSDK, AFe1cSDK aFe1cSDK) {
        this.values = aFg1ySDK;
        this.AFInAppEventType = aFd1sSDK;
        this.AFKeystoreWrapper = aFg1wSDK;
        this.valueOf = aFg1xSDK;
        this.e = aFe1ySDK;
        this.d = aFg1zSDK;
        this.unregisterClient = aFe1cSDK;
        aFe1cSDK.AFInAppEventParameterName.add(this);
    }
}
