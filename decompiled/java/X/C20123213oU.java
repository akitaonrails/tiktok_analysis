package X;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.13oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20123213oU {
    public static Set<String> LIZ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZIZ(Activity activity, boolean z, final InterfaceC20123613oY interfaceC20123613oY) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            final String simpleName = activity.getClass().getSimpleName();
            activity.getFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: X.13oW
                @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
                public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    interfaceC20123613oY.LIZ(fragment, simpleName);
                }
            }, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(Activity activity, boolean z, final InterfaceC20123613oY interfaceC20123613oY) {
        if (!(activity instanceof C19EG)) {
            return;
        }
        final String simpleName = activity.getClass().getSimpleName();
        try {
            ((C19EG) activity).getSupportFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.13oX
                @Override // X.AbstractC813200VvC
                public final void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
                    interfaceC20123613oY.LIZIZ(fragment, simpleName);
                }
            }, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZ(Application application, final boolean z, Activity activity, int i, Set set, final InterfaceC20123613oY interfaceC20123613oY) {
        final boolean z2;
        final boolean z3;
        final boolean z4 = false;
        if (!LIZIZ.compareAndSet(false, true)) {
            return;
        }
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = true;
        }
        LIZ = set;
        if (!z2 && !z3 && !z4) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C09PC() { // from class: X.13oV
            @Override // X.C09PC, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
                if (z2) {
                    interfaceC20123613oY.onActivityDestroyed(activity2);
                }
            }

            @Override // X.C09PC, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
                Set<String> set2 = C20123213oU.LIZ;
                if (set2 != null && !set2.contains(activity2.getClass().getSimpleName())) {
                    return;
                }
                if (z3) {
                    C20123213oU.LIZJ(activity2, z, interfaceC20123613oY);
                }
                if (z4) {
                    C20123213oU.LIZIZ(activity2, z, interfaceC20123613oY);
                }
            }
        });
        if (activity != null) {
            Set<String> set2 = LIZ;
            if (set2 == null || set2.contains(activity.getClass().getSimpleName())) {
                if (z3) {
                    LIZJ(activity, z, interfaceC20123613oY);
                }
                if (z4) {
                    LIZIZ(activity, z, interfaceC20123613oY);
                }
            }
        }
    }
}
