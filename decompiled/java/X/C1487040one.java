package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0one, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487040one implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        SimRadar.keyScan("Activity", "onPause", activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        SimRadar.keyScan("Activity", "onResume", activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        if (Intrinsics.LJFF("MainActivity", simpleName)) {
            SimRadar.keyScan("Activity", "onStart", simpleName);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        if (Intrinsics.LJFF("MainActivity", simpleName)) {
            SimRadar.keyScan("Activity", "onStop", simpleName);
        }
    }
}
