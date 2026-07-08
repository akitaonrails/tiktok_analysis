package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0kpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1334380kpQ extends AbstractExecutorService {
    public static final Class<?> LLIZLLLIL = C1334380kpQ.class;
    public final String LL;
    public final Executor LLILLJJLI;
    public final BlockingQueue<Runnable> LLILZ;
    public volatile int LLILLL = 1;
    public final RunnableC1334390kpR LLILZIL = new Runnable() { // from class: X.0kpR
        public final void LIZ() {
            try {
                Runnable runnablePoll = this.LL.LLILZ.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                } else {
                    C1328570kg3.LJIIJJI(C1334380kpQ.LLIZLLLIL, "%s: Worker has nothing to run", this.LL.LL);
                }
                int iDecrementAndGet = this.LL.LLILZLL.decrementAndGet();
                if (this.LL.LLILZ.isEmpty()) {
                    C1328570kg3.LJIIL(C1334380kpQ.LLIZLLLIL, "%s: worker finished; %d workers left", this.LL.LL, Integer.valueOf(iDecrementAndGet));
                } else {
                    this.LL.LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int iDecrementAndGet2 = this.LL.LLILZLL.decrementAndGet();
                if (this.LL.LLILZ.isEmpty()) {
                    C1328570kg3.LJIIL(C1334380kpQ.LLIZLLLIL, "%s: worker finished; %d workers left", this.LL.LL, Integer.valueOf(iDecrementAndGet2));
                    throw th;
                }
                this.LL.LIZ();
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("ConstrainedExecutorService$Worker@4170.run");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("ConstrainedExecutorService$Worker@4170.run");
        }
    };
    public final AtomicInteger LLILZLL = new AtomicInteger(0);
    public final AtomicInteger LLIZ = new AtomicInteger(0);

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    public final void LIZ() {
        int i = this.LLILZLL.get();
        while (i < this.LLILLL) {
            int i2 = i + 1;
            boolean zCompareAndSet = this.LLILZLL.compareAndSet(i, i2);
            Class<?> cls = LLIZLLLIL;
            if (zCompareAndSet) {
                C1328570kg3.LJIILIIL(cls, "%s: starting worker %d of %d", this.LL, Integer.valueOf(i2), Integer.valueOf(this.LLILLL));
                this.LLILLJJLI.execute(this.LLILZIL);
                return;
            } else {
                C1328570kg3.LJIIJJI(cls, "%s: race in startWorkerIfNeeded; retrying", this.LL);
                i = this.LLILZLL.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            if (this.LLILZ.offer(runnable)) {
                int size = this.LLILZ.size();
                int i = this.LLIZ.get();
                if (size > i && this.LLIZ.compareAndSet(i, size)) {
                    C1328570kg3.LJIIL(LLIZLLLIL, "%s: max pending work in queue = %d", this.LL, Integer.valueOf(size));
                }
                LIZ();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append(" queue is full, size=");
            sbLIZ.append(this.LLILZ.size());
            throw new RejectedExecutionException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new NullPointerException("runnable parameter is null");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kpR] */
    public C1334380kpQ(String str, Executor executor, BlockingQueue blockingQueue) {
        this.LL = str;
        this.LLILLJJLI = executor;
        this.LLILZ = blockingQueue;
    }
}
