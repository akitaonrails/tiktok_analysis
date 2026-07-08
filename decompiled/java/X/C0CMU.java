package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0CMU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CMU {
    public static final C0CMU LIZ = new C0CMU();
    public static volatile C0CBL LIZIZ = C0CBL.IDLE;
    public static final CopyOnWriteArrayList<C0CMV> LIZJ = new CopyOnWriteArrayList<>();

    public final void LIZ() {
        synchronized (this) {
            try {
                C0CBL c0cbl = LIZIZ;
                C0CBL c0cbl2 = C0CBL.EXITED;
                if (c0cbl == c0cbl2) {
                    return;
                }
                LIZIZ = c0cbl2;
                Iterator<C0CMV> it2 = LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().onExit();
                }
                LIZJ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(C0CMV c0cmv) {
        synchronized (this) {
            try {
                if (LIZIZ == C0CBL.EXITED) {
                    return;
                }
                LIZJ.add(c0cmv);
                if (LIZIZ == C0CBL.ENTERED) {
                    c0cmv.LIZJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
