package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08UJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08UJ implements ThreadFactory {
    public final String LL;
    public final AtomicInteger LLILLJJLI = new AtomicInteger();

    public C08UJ(String str) {
        this.LL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int iIncrementAndGet = this.LLILLJJLI.incrementAndGet();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("btm-");
        sbLIZ.append(this.LL);
        sbLIZ.append('-');
        sbLIZ.append(iIncrementAndGet);
        BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
        if (bPEAThread.isDaemon()) {
            bPEAThread.setDaemon(false);
        }
        if (bPEAThread.getPriority() != 5) {
            ThreadMethodProxy.setPriority(bPEAThread, 5);
        }
        return bPEAThread;
    }
}
