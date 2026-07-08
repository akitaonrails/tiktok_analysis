package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08U6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08U6 implements ThreadFactory {
    public final String LL;
    public final ThreadGroup LLILLJJLI;
    public final AtomicInteger LLILLL = new AtomicInteger(1);
    public final boolean LLILZ;

    public C08U6(String str) {
        ThreadGroup threadGroup;
        this.LL = str;
        this.LLILZ = (C1937307iN.LIZ() & 262144) == 262144;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.LLILLJJLI = threadGroup;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        boolean z = this.LLILZ;
        ThreadGroup threadGroup = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(this.LLILLL.getAndIncrement());
        BPEAThread bPEAThread = new BPEAThread(threadGroup, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (bPEAThread.isDaemon()) {
            bPEAThread.setDaemon(false);
        }
        if (bPEAThread.getPriority() != 5) {
            ThreadMethodProxy.setPriority(bPEAThread, 5);
        }
        return bPEAThread;
    }
}
