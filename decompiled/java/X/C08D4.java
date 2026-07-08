package X;

import Y.ARunnableS72S0200000_3;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08D4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08D4 implements Application.ActivityLifecycleCallbacks {
    public Object LL;
    public Activity LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public C08D4(Activity activity) {
        this.LLILLJJLI = activity;
        this.LLILLL = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.LLILLJJLI == activity) {
            this.LLILLJJLI = null;
            this.LLILZIL = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.LLILZIL && !this.LLILZLL && !this.LLILZ) {
            Object obj = this.LL;
            int i = this.LLILLL;
            try {
                Object obj2 = C08D3.LIZJ.get(activity);
                if (obj2 == obj && activity.hashCode() == i) {
                    C786410Ut5.LJL(C08D3.LJI, new ARunnableS72S0200000_3(C08D3.LIZIZ.get(activity), obj2, 3));
                    this.LLILZLL = true;
                    this.LL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.LLILLJJLI == activity) {
            this.LLILZ = true;
        }
    }
}
