package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08Tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC2124508Tz<T> implements Runnable {
    public final AtomicInteger LL = new AtomicInteger(0);

    public abstract void LIZIZ(T t);

    public abstract T LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ(Exception exc);

    public abstract void LJFF(T t);

    public final void LIZ() {
        if (this.LL.compareAndSet(0, 2)) {
            LIZLLL();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("StatefulRunnable@5ae.run");
        try {
            if (this.LL.compareAndSet(0, 1)) {
                try {
                    T tLIZJ = LIZJ();
                    this.LL.set(3);
                    try {
                        LJFF(tLIZJ);
                        LIZIZ(tLIZJ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LIZIZ(tLIZJ);
                        throw th;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LL.set(4);
                    LJ(e);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StatefulRunnable@5ae.run");
    }
}
