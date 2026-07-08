package X;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.08os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2232408os extends C1DFT implements InterfaceC2239108px {
    public final Executor LL;

    @Override // X.C1DFT, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.LL;
        if (!(executor instanceof ExecutorService) || (executorService = (ExecutorService) executor) == null) {
            return;
        }
        executorService.shutdown();
    }

    public final int hashCode() {
        return System.identityHashCode(this.LL);
    }

    @Override // X.AbstractC2252651DEx
    public final String toString() {
        return this.LL.toString();
    }

    @Override // X.C1DFT
    public final Executor LLIILII() {
        return this.LL;
    }

    public C2232408os(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.LL = executor;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = AnonymousClass0824.LIZ) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2232408os) && ((C2232408os) obj).LL == this.LL) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.LL.execute(runnable);
        } catch (RejectedExecutionException e) {
            C23118094a.LIZJ(coroutineContext, C2239008pw.LIZ("The task was rejected", e));
            C0WQQ.LIZ(C0PEM.LIZJ, coroutineContext, runnable);
        }
    }

    @Override // X.InterfaceC2239108px
    public final void scheduleResumeAfterDelay(long j, InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.LL;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            final C2252611DEt c2252611DEt = (C2252611DEt) interfaceC20236714Gf;
            Runnable runnable = new Runnable(this, c2252611DEt) { // from class: X.08bx
                public final AbstractC2252651DEx LL;
                public final InterfaceC20236714Gf<Unit> LLILLJJLI;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.LLILLJJLI.LJIL(this.LL, Unit.LIZ);
                    } catch (Throwable th) {
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }

                {
                    this.LL = this;
                    this.LLILLJJLI = c2252611DEt;
                }
            };
            CoroutineContext coroutineContext = c2252611DEt.LLILZIL;
            try {
                final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (scheduledFutureSchedule != null) {
                    ((C2252611DEt) interfaceC20236714Gf).LJJII(new AbstractC2236208pU(scheduledFutureSchedule) { // from class: X.08pS
                        public final Future<?> LL;

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("CancelFutureOnCancel[");
                            sbLIZ.append(this.LL);
                            sbLIZ.append(']');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LL = scheduledFutureSchedule;
                        }

                        @Override // X.AbstractC2236108pT
                        public final void LJFF(Throwable th) {
                            if (th != null) {
                                this.LL.cancel(false);
                            }
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            LJFF(th);
                            return Unit.LIZ;
                        }
                    });
                    return;
                }
            } catch (RejectedExecutionException e) {
                C23118094a.LIZJ(coroutineContext, C2239008pw.LIZ("The task was rejected", e));
            }
        }
        RunnableC2252521DEk.LL.scheduleResumeAfterDelay(j, interfaceC20236714Gf);
    }

    @Override // X.InterfaceC2239108px
    public final InterfaceC2238208po invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.LL;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (scheduledFutureSchedule != null) {
                    return new InterfaceC2238208po(scheduledFutureSchedule) { // from class: X.08ot
                        public final Future<?> LL;

                        @Override // X.InterfaceC2238208po
                        public final void dispose() {
                            this.LL.cancel(false);
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("DisposableFutureHandle[");
                            sbLIZ.append(this.LL);
                            sbLIZ.append(']');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LL = scheduledFutureSchedule;
                        }
                    };
                }
            } catch (RejectedExecutionException e) {
                C23118094a.LIZJ(coroutineContext, C2239008pw.LIZ("The task was rejected", e));
            }
        }
        return RunnableC2252521DEk.LL.scheduleInvokeOnTimeout(j, runnable);
    }
}
