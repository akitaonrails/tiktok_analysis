package X;

import com.bytedance.frameworks.baselib.network.dispatcher.NetThreadPoolManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0otN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490590otN {
    public static volatile boolean LIZ = true;
    public static volatile C1490600otO LIZIZ;
    public static volatile C1490590otN LIZJ;

    public static C1490590otN LIZJ() {
        if (LIZJ == null) {
            synchronized (C1490590otN.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1490590otN();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static C1490600otO LIZLLL() {
        if (LIZIZ == null) {
            synchronized (C1490590otN.class) {
                try {
                    if (LIZIZ == null) {
                        C1490580otM c1490580otM = new C1490580otM();
                        c1490580otM.LJ = 8;
                        c1490580otM.LJI = 8;
                        c1490580otM.LJFF = 8;
                        c1490580otM.LJII = 8;
                        c1490580otM.LJIIIIZZ = 30L;
                        c1490580otM.LJIIJ = 10L;
                        c1490580otM.LJIIIZ = 10L;
                        c1490580otM.LJIIJJI = true;
                        LIZIZ = new C1490600otO(c1490580otM);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C1490590otN() {
        if (LIZIZ == null) {
            C1490580otM c1490580otM = new C1490580otM();
            c1490580otM.LJ = 8;
            c1490580otM.LJI = 8;
            c1490580otM.LJFF = 8;
            c1490580otM.LJII = 8;
            c1490580otM.LJIIIIZZ = 30L;
            c1490580otM.LJIIJ = 10L;
            c1490580otM.LJIIIZ = 10L;
            c1490580otM.LJIIJJI = true;
            LIZIZ = new C1490600otO(c1490580otM);
        }
    }

    public static synchronized void LJ(boolean z) {
        LIZ = z;
        if (LIZIZ != null) {
            LIZIZ.LJIIJJI = LIZ;
        }
    }

    public final synchronized void LIZ(C1490630otR c1490630otR) {
        NetThreadPoolManager.INSTANCE.executeApi(c1490630otR);
    }

    public final synchronized void LIZIZ(C1490630otR c1490630otR) {
        NetThreadPoolManager.INSTANCE.executeDownload(c1490630otR);
    }
}
