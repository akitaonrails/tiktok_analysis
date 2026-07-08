package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.SparkLynxBridgeThreadDispatcherSettings;

/* JADX INFO: renamed from: X.0qHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544100qHg {
    public static final C1544100qHg LIZ = new C1544100qHg();
    public static final Object LIZIZ = new Object();
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    public static void LIZ() {
        if (LIZJ) {
            return;
        }
        synchronized (LIZIZ) {
            try {
                if (LIZJ) {
                    return;
                }
                LIZLLL = true;
                try {
                    C1544010qHX.LIZ.getClass();
                    C1544010qHX.LIZLLL();
                    C1544010qHX.LIZ();
                    if (SparkLynxBridgeThreadDispatcherSettings.LIZ().enable) {
                        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                        C1543410qGZ.LJIIL = new C1544110qHh();
                    }
                    C1544010qHX.LIZIZ();
                    C1544010qHX.LIZJ();
                    C1063910dnB.LIZ("true", "BDXBridgeInitStatefulTask_finish");
                    LIZJ = true;
                    if (!LIZJ) {
                        LIZLLL = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!LIZJ) {
                        LIZLLL = false;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
