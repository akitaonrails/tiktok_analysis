package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class ThreadFactoryC2124708Ub implements ThreadFactory {
    public final String LL;
    public final AtomicInteger LLILLJJLI = new AtomicInteger();

    public ThreadFactoryC2124708Ub(String str) {
        this.LL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int iIncrementAndGet = this.LLILLJJLI.incrementAndGet();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("-");
        sbLIZ.append(iIncrementAndGet);
        BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
        if (bPEAThread.isDaemon()) {
            bPEAThread.setDaemon(false);
        }
        if (bPEAThread.getPriority() != 1) {
            ThreadMethodProxy.setPriority(bPEAThread, 1);
        }
        return bPEAThread;
    }
}
