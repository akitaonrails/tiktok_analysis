package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01CP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CP implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2;
        ArrayList arrayList = new ArrayList();
        for (WeakReference<C01CN> weakReference : C01CM.LIZ) {
            C01CN c01cn = weakReference.get();
            if (c01cn != null) {
                activity2 = c01cn.LIZ;
            } else {
                activity2 = null;
            }
            if (Intrinsics.LJFF(activity2, activity)) {
                arrayList.add(weakReference);
                final C5182020e c5182020e = new C5182020e(weakReference, (WeakReference<C01CN>) 274);
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C1326370kcV.LIZ, new Runnable() { // from class: X.01CO
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SimpleWorker@88d7.postInUI$1");
                        try {
                            c5182020e.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SimpleWorker@88d7.postInUI$1");
                    }
                });
            }
        }
        if (!arrayList.isEmpty()) {
            C01CM.LIZ.removeAll(C13LP.LLIIJI(arrayList));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = C01CQ.LIZ - 1;
        C01CQ.LIZ = i;
        if (i == 0) {
            C1743710vTd.LIZJ = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C01CR.LIZ = new WeakReference<>(activity);
        C01CQ.LIZ++;
        C1743710vTd.LIZJ = false;
    }
}
