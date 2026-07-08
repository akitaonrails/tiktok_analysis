package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WP7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WP7 {
    public static PThreadPoolExecutor LIZ(final String str) {
        if (C296490Bjj.LIZ(16)) {
            PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory(str) { // from class: X.0CNF
                public final String LL;

                {
                    this.LL = str;
                }

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    BPEAThread bPEAThread = new BPEAThread(runnable, this.LL);
                    ThreadMethodProxy.setPriority(bPEAThread, 1);
                    return bPEAThread;
                }
            });
            pThreadPoolExecutor.allowCoreThreadTimeOut(true);
            return pThreadPoolExecutor;
        }
        PThreadPoolExecutor pThreadPoolExecutor2 = new PThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: X.0WP6
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                PthreadThread pthreadThread = new PthreadThread(runnable, str);
                ThreadMethodProxy.setPriority(pthreadThread, 10);
                return pthreadThread;
            }
        });
        pThreadPoolExecutor2.allowCoreThreadTimeOut(true);
        return pThreadPoolExecutor2;
    }
}
