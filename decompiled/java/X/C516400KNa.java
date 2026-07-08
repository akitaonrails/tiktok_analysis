package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516400KNa implements Application.ActivityLifecycleCallbacks {
    public static final /* synthetic */ int LLIZ = 0;
    public final Activity LL;
    public long LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    public C516400KNa(Activity activity) {
        Application application;
        SystemClock.uptimeMillis();
        this.LL = activity;
        if (activity != null && (application = activity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (Intrinsics.LJFF(this.LL, activity) && this.LLILLJJLI == 0) {
            this.LLILLJJLI = SystemClock.uptimeMillis();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (Intrinsics.LJFF(this.LL, activity)) {
            if (this.LLILLL) {
                this.LLILZ++;
            }
            if (this.LLILZIL) {
                this.LLILZLL++;
            }
        }
    }
}
