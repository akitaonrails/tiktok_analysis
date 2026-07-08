package X;

import Y.ARunnableS134S0100000_34;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: X.146p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C202117146p implements Application.ActivityLifecycleCallbacks {
    public final Application LL;
    public boolean LLILLJJLI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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

    public C202117146p(Application application) {
        this.LL = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            C20508081q.LIZ(C786410Ut5.v2(), new ARunnableS134S0100000_34(this, 74));
        }
    }
}
