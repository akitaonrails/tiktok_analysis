package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08UW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08UW {
    public static final AtomicInteger LIZ;
    public static final C822650WOx LIZIZ;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        LIZ = new AtomicInteger(1);
        LIZIZ = new C822650WOx(Math.max(2, Math.min(iAvailableProcessors - 1, 4)), (iAvailableProcessors * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactory() { // from class: X.08UX
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AdHybridThreadManager-");
                sbLIZ.append(C08UW.LIZ.getAndIncrement());
                BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
                ThreadMethodProxy.setPriority(bPEAThread, 10);
                return bPEAThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }
}
