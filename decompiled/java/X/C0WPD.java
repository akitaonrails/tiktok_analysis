package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WPD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPD extends C822450WOd implements ScheduledExecutorService {
    public final ScheduledExecutorService LLILLJJLI;

    public C0WPD(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.LLILLJJLI = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C134F c134f = new C134F(Executors.callable(runnable, null));
        return new C0WPG(c134f, this.LLILLJJLI.schedule(c134f, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        C134F c134f = new C134F(callable);
        return new C0WPG(c134f, this.LLILLJJLI.schedule(c134f, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C0WPL c0wpl = new C0WPL(runnable);
        return new C0WPG(c0wpl, this.LLILLJJLI.scheduleAtFixedRate(c0wpl, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C0WPL c0wpl = new C0WPL(runnable);
        return new C0WPG(c0wpl, this.LLILLJJLI.scheduleWithFixedDelay(c0wpl, j, j2, timeUnit));
    }
}
