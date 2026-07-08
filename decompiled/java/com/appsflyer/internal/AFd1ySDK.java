package com.appsflyer.internal;

import X.C1C7U;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public final class AFd1ySDK implements Application.ActivityLifecycleCallbacks {
    public final Executor AFInAppEventParameterName;
    public final AFd1xSDK.AFa1zSDK AFInAppEventType;
    public final AFi1qSDK AFKeystoreWrapper;
    public boolean AFLogger;
    public boolean registerClient;
    public final ScheduledExecutorService valueOf;
    public final AFc1vSDK values;

    public static /* synthetic */ void lambda$semisugar$AFInAppEventParameterName$0(AFd1ySDK aFd1ySDK, AFh1xSDK aFh1xSDK) {
        C1C7U.LIZ("AFd1ySDK@fb2d.onActivityResumed$1L");
        AFInAppEventParameterName(aFd1ySDK, aFh1xSDK);
        C1C7U.LIZIZ("AFd1ySDK@fb2d.onActivityResumed$1L");
    }

    public static /* synthetic */ void lambda$semisugar$AFInAppEventType$0(AFd1ySDK aFd1ySDK) {
        C1C7U.LIZ("AFd1ySDK@fb2d.onActivityPaused$1L");
        AFInAppEventType(aFd1ySDK);
        C1C7U.LIZIZ("AFd1ySDK@fb2d.onActivityPaused$1L");
    }

    public static /* synthetic */ void lambda$semisugar$values$0(AFd1ySDK aFd1ySDK) {
        C1C7U.LIZ("AFd1ySDK@fb2d.AFInAppEventType$1L");
        values(aFd1ySDK);
        C1C7U.LIZIZ("AFd1ySDK@fb2d.AFInAppEventType$1L");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public static final void AFInAppEventType(final AFd1ySDK aFd1ySDK) {
        aFd1ySDK.registerClient = true;
        try {
            aFd1ySDK.valueOf.schedule(new Runnable() { // from class: X.13oC
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.lambda$semisugar$values$0(this.LL);
                }
            }, AFd1xSDK.AFa1uSDK.AFInAppEventParameterName(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void values(AFd1ySDK aFd1ySDK) {
        if (aFd1ySDK.AFLogger && aFd1ySDK.registerClient) {
            aFd1ySDK.AFLogger = false;
            try {
                aFd1ySDK.AFInAppEventType.valueOf();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.AFInAppEventParameterName.execute(new Runnable() { // from class: X.13oB
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.lambda$semisugar$AFInAppEventType$0(this.LL);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zLJI = MethodIDManager.LJI(71647);
        final AFh1xSDK aFh1xSDK = new AFh1xSDK(activity, this.AFKeystoreWrapper);
        this.AFInAppEventParameterName.execute(new Runnable() { // from class: X.13o4
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.lambda$semisugar$AFInAppEventParameterName$0(this.LL, aFh1xSDK);
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void AFInAppEventParameterName(AFd1ySDK aFd1ySDK, AFh1xSDK aFh1xSDK) {
        if (!aFd1ySDK.AFLogger) {
            try {
                aFd1ySDK.AFInAppEventType.values(aFh1xSDK);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        aFd1ySDK.registerClient = false;
        aFd1ySDK.AFLogger = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AFc1vSDK aFc1vSDK = this.values;
        Intent intent = activity.getIntent();
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null && intent != aFc1vSDK.AFInAppEventType) {
            aFc1vSDK.AFInAppEventType = intent;
        }
        this.AFKeystoreWrapper.values(activity);
    }

    public AFd1ySDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1vSDK aFc1vSDK, AFi1qSDK aFi1qSDK, AFd1xSDK.AFa1zSDK aFa1zSDK) {
        this.AFInAppEventParameterName = executor;
        this.valueOf = scheduledExecutorService;
        this.values = aFc1vSDK;
        this.AFKeystoreWrapper = aFi1qSDK;
        this.AFInAppEventType = aFa1zSDK;
    }
}
