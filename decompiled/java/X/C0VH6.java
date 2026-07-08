package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VH6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VH6 {
    public static final ExecutorService LIZ;

    static {
        final String str = "GAC_Executor";
        C822650WOx c822650WOx = new C822650WOx(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(str) { // from class: X.0VH5
            public final String LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger();
            public final ThreadFactory LLILLL = Executors.defaultThreadFactory();

            {
                this.LL = str;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.LLILLL.newThread(new AnonymousClass0862(runnable));
                threadNewThread.setName(this.LL + e3.e + this.LLILLJJLI.getAndIncrement() + e3.f);
                return threadNewThread;
            }
        });
        c822650WOx.allowCoreThreadTimeOut(true);
        LIZ = Executors.unconfigurableExecutorService(c822650WOx);
    }
}
