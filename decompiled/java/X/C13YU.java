package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.13YU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YU<T> {
    public final AtomicReference<C13YV> LIZ = new AtomicReference<>(C13YW.LIZ);
    public final Object LIZIZ = new Object();
    public T LIZJ;

    public final T LIZ() {
        long jLIZ = C13YX.LIZ();
        if (jLIZ == C05QJ.LIZ) {
            return this.LIZJ;
        }
        C13YV c13yv = this.LIZ.get();
        int iLIZ = c13yv.LIZ(jLIZ);
        if (iLIZ >= 0) {
            return (T) c13yv.LIZJ[iLIZ];
        }
        return null;
    }

    public final void LIZIZ(T t) {
        long jLIZ = C13YX.LIZ();
        if (jLIZ == C05QJ.LIZ) {
            this.LIZJ = t;
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                C13YV c13yv = this.LIZ.get();
                int iLIZ = c13yv.LIZ(jLIZ);
                if (iLIZ < 0) {
                    this.LIZ.set(c13yv.LIZIZ(jLIZ, t));
                } else {
                    c13yv.LIZJ[iLIZ] = t;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
