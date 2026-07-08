package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: renamed from: X.0yBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847920yBi implements Application.ActivityLifecycleCallbacks {
    public static final C1847920yBi LL = new C1847920yBi();

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
        C1847990yBp.LIZJ.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Set<Activity> set = C1847990yBp.LIZJ;
        if (!set.contains(activity)) {
            set.add(activity);
        }
        C1847990yBp.LJ = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = C1847990yBp.LIZ;
        C1847990yBp.LIZ = i + 1;
        if (i == 0) {
            C1847990yBp.LIZIZ = true;
            C1848320yCM<InterfaceC1848420yCW> c1848320yCM = C1847990yBp.LIZLLL;
            new C1848380yCS();
            InterfaceC1848420yCW interfaceC1848420yCW = c1848320yCM.LIZ;
            if (interfaceC1848420yCW != null) {
                C1848380yCS.LIZ(interfaceC1848420yCW);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = C1847990yBp.LIZ - 1;
        C1847990yBp.LIZ = i;
        if (i == 0) {
            C1847990yBp.LIZIZ = false;
            C1848320yCM<InterfaceC1848420yCW> c1848320yCM = C1847990yBp.LIZLLL;
            new C1848390yCT();
            InterfaceC1848420yCW interfaceC1848420yCW = c1848320yCM.LIZ;
            if (interfaceC1848420yCW != null) {
                C1848390yCT.LIZ(interfaceC1848420yCW);
            }
        }
    }
}
