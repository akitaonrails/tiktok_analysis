package X;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Jen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497270Jen {
    public static int LIZ(int i) {
        try {
            i = C12ES.LJIILJJIL(C497820Jfg.LIZJ(r1.getApplicationContext()), C2213981Bky.LIZIZ.getApplicationContext());
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    public static void LIZIZ(Activity activity) {
        activity.getWindow().setFlags(1024, 1024);
        try {
            Class<?> clsLoadClass = C786410Ut5.L3(activity).getClassLoader().loadClass("android.os.SystemProperties");
            if (((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, "ro.miui.notch", 0)).intValue() == 1) {
                if (Build.VERSION.SDK_INT < 28) {
                    try {
                        Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(activity.getWindow(), 768);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LIZJ(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
    }

    public static void LJFF(Activity activity) {
        Window window = activity.getWindow();
        if (window.getStatusBarColor() == 0) {
            return;
        }
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public static void LIZLLL(int i, Activity activity) {
        activity.getWindow().setStatusBarColor(i);
    }

    public static void LJ(Activity activity, boolean z) {
        int i;
        if (activity != null) {
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & (-8193);
            }
            if (i != systemUiVisibility) {
                activity.getWindow().getDecorView().setSystemUiVisibility(i);
            }
        }
    }
}
