package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0qTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ExecutorC1551550qTh implements Executor {
    public final C822650WOx LL;
    public final C1551560qTi LLILLJJLI;

    public ExecutorC1551550qTh() {
        C1551560qTi c1551560qTi = new C1551560qTi();
        this.LLILLJJLI = c1551560qTi;
        this.LL = new C822650WOx(1, 1, 30L, TimeUnit.SECONDS, c1551560qTi.LIZ, new ThreadFactory() { // from class: X.0qTg
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                BPEAThread bPEAThread = new BPEAThread(runnable);
                ThreadMethodProxy.setName(bPEAThread, "gecko-update-thread");
                ThreadMethodProxy.setPriority(bPEAThread, 3);
                return bPEAThread;
            }
        });
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LL.execute(runnable);
    }
}
