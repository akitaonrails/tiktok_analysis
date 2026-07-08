package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate;

/* JADX INFO: renamed from: X.0Cok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325080Cok {
    public static final C325080Cok LIZ = new C325080Cok();
    public static volatile boolean LIZIZ;

    public static void LIZIZ() {
        C325030Cof.LIZJ = true;
    }

    public final void LIZ() {
        if ((C1863680yb8.LIZLLL() || C1863680yb8.LIZIZ()) && !LIZIZ) {
            synchronized (this) {
                try {
                    LIZ.getClass();
                    if ((C1863680yb8.LIZLLL() || C1863680yb8.LIZIZ()) && !LIZIZ) {
                        ITakoNetworkGate iTakoNetworkGate = (ITakoNetworkGate) ServiceManager.get().getService(ITakoNetworkGate.class);
                        iTakoNetworkGate.LIZ(C325070Coj.LIZ);
                        iTakoNetworkGate.LIZ(C325030Cof.LIZ);
                        LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
