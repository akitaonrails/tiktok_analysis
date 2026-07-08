package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493800oyY implements InterfaceC1493340oxo {
    public static final C1493800oyY LIZ = new C1493800oyY();
    public static boolean LIZIZ = false;
    public static boolean LIZJ = false;

    public static final void LIZIZ(Object obj, String str) {
        try {
            C1494600ozq c1494600ozq = (C1494600ozq) obj;
            if (LIZJ && !c1494600ozq.LJJJJLL.compareAndSet(false, true)) {
                return;
            }
            if (LIZIZ) {
                C1494230ozF.LJIIJJI(str, c1494600ozq);
            } else {
                C1494230ozF.LJIIJ(str, c1494600ozq);
            }
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZ(Object obj, String str, Throwable th) {
        try {
            C1494600ozq c1494600ozq = (C1494600ozq) obj;
            if (LIZJ && !c1494600ozq.LJJJJLL.compareAndSet(false, true)) {
                return;
            }
            if (LIZIZ) {
                C1494230ozF.LJIIIIZZ(str, c1494600ozq, th);
            } else {
                C1494230ozF.LJII(str, c1494600ozq, th);
            }
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
