package X;

import Y.ARunnableS113S0100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0W0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC816250W0h implements Runnable {
    public final Runnable LL;
    public final AtomicInteger LLILLJJLI = new AtomicInteger(0);
    public final AtomicReference<Throwable> LLILLL = new AtomicReference<>(null);
    public final CountDownLatch LLILZ = new CountDownLatch(1);

    public final void LIZ() {
        if (this.LLILLJJLI.compareAndSet(0, 1)) {
            try {
                this.LL.run();
                this.LLILLJJLI.set(3);
                this.LLILZ.countDown();
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILLJJLI.set(2);
                    this.LLILLL.set(th);
                    throw new RuntimeException(th);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    this.LLILZ.countDown();
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("RunOnceRunnable@ee3f.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RunOnceRunnable@ee3f.run");
    }

    public RunnableC816250W0h(ARunnableS113S0100000_13 aRunnableS113S0100000_13) {
        this.LL = aRunnableS113S0100000_13;
    }
}
