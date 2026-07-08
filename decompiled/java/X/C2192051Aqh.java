package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1Aqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2192051Aqh {
    public final ScheduledExecutorService LIZ;
    public final Runnable LIZIZ;
    public ScheduledFuture<?> LIZJ;

    public void LIZ(long j) {
        Runnable runnable;
        ScheduledFuture<?> scheduledFuture = this.LIZJ;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = null;
        this.LIZJ = null;
        if (j > 0 && j < Long.MAX_VALUE && (runnable = this.LIZIZ) != null) {
            ScheduledExecutorService scheduledExecutorService = this.LIZ;
            if (scheduledExecutorService != null) {
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorService.scheduleWithFixedDelay(runnable, 0L, j, TimeUnit.SECONDS);
            }
            this.LIZJ = scheduledFutureScheduleWithFixedDelay;
        }
    }

    public C2192051Aqh(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j) {
        this.LIZ = scheduledExecutorService;
        this.LIZIZ = runnable;
        LIZ(j);
    }
}
