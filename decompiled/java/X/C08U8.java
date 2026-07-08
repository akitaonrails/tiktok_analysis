package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08U8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08U8 {
    public final C822650WOx LIZ = new C822650WOx(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.08U7
        public final ThreadGroup LL;
        public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
        public final String LLILLL;

        {
            SecurityManager securityManager = System.getSecurityManager();
            this.LL = securityManager != null ? securityManager.getThreadGroup() : C786410Ut5.u3().getThreadGroup();
            this.LLILLL = "live-sdk-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(this.LLILLJJLI.getAndIncrement());
            BPEAThread bPEAThread = new BPEAThread(threadGroup, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
            if (bPEAThread.isDaemon()) {
                bPEAThread.setDaemon(false);
            }
            if (bPEAThread.getPriority() != 5) {
                ThreadMethodProxy.setPriority(bPEAThread, 5);
            }
            return bPEAThread;
        }
    });
}
