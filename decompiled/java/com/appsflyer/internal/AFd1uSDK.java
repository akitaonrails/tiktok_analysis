package com.appsflyer.internal;

import X.C786410Ut5;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFd1xSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes31.dex */
public final class AFd1uSDK implements AFd1xSDK {
    public final ScheduledExecutorService AFInAppEventParameterName;
    public final AFc1vSDK AFInAppEventType;
    public AFd1ySDK AFKeystoreWrapper;
    public final AFi1qSDK valueOf;
    public final Executor values;

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventType() {
        AFd1xSDK.AFa1zSDK aFa1zSDK;
        AFd1ySDK aFd1ySDK = this.AFKeystoreWrapper;
        if (aFd1ySDK == null || (aFa1zSDK = aFd1ySDK.AFInAppEventType) == null) {
            return;
        }
        aFa1zSDK.valueOf();
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final boolean values() {
        return this.AFKeystoreWrapper != null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventType(Context context, AFd1xSDK.AFa1zSDK aFa1zSDK) {
        if (this.AFKeystoreWrapper != null) {
            Context contextN3 = C786410Ut5.N3(context);
            if (contextN3 != null) {
                ((Application) contextN3).unregisterActivityLifecycleCallbacks(this.AFKeystoreWrapper);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        this.AFKeystoreWrapper = null;
        AFd1ySDK aFd1ySDK = new AFd1ySDK(this.values, this.AFInAppEventParameterName, this.AFInAppEventType, this.valueOf, aFa1zSDK);
        this.AFKeystoreWrapper = aFd1ySDK;
        if (context instanceof Activity) {
            aFd1ySDK.onActivityResumed((Activity) context);
        }
        Application applicationAFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(context);
        if (applicationAFInAppEventParameterName != null) {
            applicationAFInAppEventParameterName.registerActivityLifecycleCallbacks(this.AFKeystoreWrapper);
        }
    }

    public AFd1uSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1vSDK aFc1vSDK, AFi1qSDK aFi1qSDK) {
        this.values = executor;
        this.AFInAppEventParameterName = scheduledExecutorService;
        this.AFInAppEventType = aFc1vSDK;
        this.valueOf = aFi1qSDK;
    }
}
