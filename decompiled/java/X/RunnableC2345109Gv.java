package X;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: X.09Gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2345109Gv implements Runnable {
    public final Activity LL;
    public final Object LLILLJJLI;
    public final int LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LifeCallProxy@717.run");
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.LLILLJJLI;
            int i = this.LLILLL;
            if (i == 0) {
                activityLifecycleCallbacks.onActivityResumed(this.LL);
            } else if (i == 1) {
                activityLifecycleCallbacks.onActivityPostResumed(this.LL);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LifeCallProxy@717.run");
    }

    public RunnableC2345109Gv(int i, Activity activity, Object obj) {
        this.LL = activity;
        this.LLILLJJLI = obj;
        this.LLILLL = i;
    }
}
