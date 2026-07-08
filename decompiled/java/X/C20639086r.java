package X;

import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.086r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20639086r {
    public static Choreographer LIZJ;
    public static Method LIZLLL;
    public static Method LJFF;
    public static Method LJI;
    public static boolean LJII;
    public static final C20639086r LIZ = new C20639086r();
    public static int LIZIZ = 4;
    public static final RunnableC20640086s LJ = RunnableC20640086s.LL;

    public final synchronized void LIZIZ() {
        if (LJII) {
            return;
        }
        LIZJ = C786410Ut5.v2();
        LIZLLL = LIZ();
        while (true) {
            int i = LIZIZ;
            if (i < 0) {
                break;
            }
            try {
                LIZLLL.invoke(LIZJ, Integer.valueOf(i), LJ, null, 0);
                break;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = LIZIZ;
                if (i2 == 0) {
                    LIZLLL = null;
                }
                LIZIZ = i2 - 1;
            }
        }
        LIZJ();
        LJII = true;
    }

    public static Method LIZ() {
        try {
            Method declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void LIZJ() {
        if (C20641086t.LIZ) {
            try {
                Choreographer.class.getField("mCallbacksRunning").setAccessible(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    if (LJFF == null) {
                        LJFF = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                    }
                    Method method = LJFF;
                    if (method != null) {
                        Field field = (Field) method.invoke(Choreographer.class, "mCallbacksRunning");
                        if (LJI == null) {
                            LJI = AccessibleObject.class.getDeclaredMethod("setAccessible", Boolean.TYPE);
                        }
                        Method method2 = LJI;
                        if (method2 != null) {
                            method2.invoke(field, Boolean.TRUE);
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    public static boolean LIZLLL(Runnable runnable) {
        Method method;
        boolean z = false;
        if (LJII && (method = LIZLLL) != null) {
            try {
                method.invoke(LIZJ, Integer.valueOf(LIZIZ), runnable, null, 0);
                z = true;
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return z;
    }

    public static void LJ(final Runnable runnable) {
        Method method;
        if (LJII && (method = LIZLLL) != null) {
            try {
                method.invoke(LIZJ, 0, new Runnable() { // from class: X.086q
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ChoreographerOptService@b3c9.postOnCommitToNextFrame$runnableForInput$1");
                        try {
                            Method method2 = C20639086r.LIZLLL;
                            if (method2 != null) {
                                method2.invoke(C20639086r.LIZJ, Integer.valueOf(C20639086r.LIZIZ), runnable, null, 0);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ChoreographerOptService@b3c9.postOnCommitToNextFrame$runnableForInput$1");
                    }
                }, null, 0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "postOnCommitToNextFrame");
                if (C2187451AjH.LJIIJ()) {
                    throw th;
                }
            }
        }
    }
}
