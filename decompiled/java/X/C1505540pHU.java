package X;

import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0pHU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505540pHU extends C822650WOx {
    public int LL;
    public volatile boolean LLILLJJLI;
    public long LLILLL;

    @Override // X.C822650WOx, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(new RunnableC1492130ovr(runnable, this));
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        Trace.beginSection("beforeExecute");
        while (this.LLILLJJLI) {
            if (this.LLILLJJLI) {
                try {
                    if (this.LLILLL < 100) {
                        Thread.sleep(100L);
                    } else {
                        this.LLILLJJLI = false;
                    }
                    this.LLILLL++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } else {
                this.LLILLL = 0L;
            }
        }
        Trace.endSection();
        super.beforeExecute(thread, runnable);
    }

    public C1505540pHU(long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactoryC1505570pHX threadFactoryC1505570pHX) {
        super(1, 1, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactoryC1505570pHX);
        this.LL = -1;
    }
}
