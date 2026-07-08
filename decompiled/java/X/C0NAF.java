package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NAF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0NAF {
    public static C589440N9y LIZ;
    public static C589440N9y LIZIZ;

    public static void LIZ() {
        if (LIZIZ == null && LIZ == null) {
            synchronized (C0NAF.class) {
                try {
                    if (LIZ == null) {
                        C589440N9y c589440N9y = new C589440N9y();
                        if (c589440N9y.LJI == null) {
                            C0NAA c0naa = new C0NAA();
                            c0naa.LIZIZ();
                            c589440N9y.LJI = c0naa;
                        }
                        LIZ = c589440N9y;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
