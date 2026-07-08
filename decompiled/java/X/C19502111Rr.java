package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19502111Rr extends C11RN {
    public final ScheduledExecutorService LL;
    public volatile boolean LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        this.LL.shutdownNow();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI;
    }

    public C19502111Rr(ThreadFactory threadFactory) {
        this.LL = SchedulerPoolFactory.create(threadFactory);
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZIZ(Runnable runnable) {
        return LIZJ(runnable, 0L, null);
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.LLILLJJLI) {
            return C11JT.INSTANCE;
        }
        return LJ(runnable, j, timeUnit, null);
    }

    public final RunnableC19502511Rv LJ(Runnable runnable, long j, TimeUnit timeUnit, C11S3 c11s3) {
        Future<?> futureSubmit;
        C1701890uOB.LIZ(runnable, "run is null");
        RunnableC19502511Rv runnableC19502511Rv = new RunnableC19502511Rv(runnable, c11s3);
        if (c11s3 != null && !c11s3.LIZ(runnableC19502511Rv)) {
            return runnableC19502511Rv;
        }
        try {
            if (j > 0) {
                futureSubmit = this.LL.schedule((Callable) runnableC19502511Rv, j, timeUnit);
            } else {
                futureSubmit = this.LL.submit((Callable) runnableC19502511Rv);
            }
            runnableC19502511Rv.setFuture(futureSubmit);
            return runnableC19502511Rv;
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            if (c11s3 != null) {
                c11s3.LIZJ(runnableC19502511Rv);
            }
            C19489211Ms.LIZIZ(e);
            return runnableC19502511Rv;
        }
    }
}
