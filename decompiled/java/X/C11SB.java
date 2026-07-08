package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11SB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SB implements Runnable {
    public final long LL;
    public final ConcurrentLinkedQueue<C11SD> LLILLJJLI;
    public final C11NJ LLILLL;
    public final ScheduledExecutorService LLILZ;
    public final Future<?> LLILZIL;
    public final ThreadFactory LLILZLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            if (this.LLILLJJLI.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (C11SD c11sd : this.LLILLJJLI) {
                if (c11sd.LLILLL > jNanoTime) {
                    return;
                }
                if (this.LLILLJJLI.remove(c11sd)) {
                    this.LLILLL.LIZJ(c11sd);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public C11SB(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        long nanos;
        ScheduledExecutorService scheduledExecutorServiceLIZIZ;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        if (timeUnit != null) {
            nanos = timeUnit.toNanos(j);
        } else {
            nanos = 0;
        }
        this.LL = nanos;
        this.LLILLJJLI = new ConcurrentLinkedQueue<>();
        this.LLILLL = new C11NJ();
        this.LLILZLL = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceLIZIZ = C807400Vlq.LIZIZ(C11SA.LJ);
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceLIZIZ.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorServiceLIZIZ = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        this.LLILZ = scheduledExecutorServiceLIZIZ;
        this.LLILZIL = scheduledFutureScheduleWithFixedDelay;
    }
}
