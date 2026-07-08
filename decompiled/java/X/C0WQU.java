package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WQU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQU implements ThreadFactory {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        int iIncrementAndGet = C0WQT.LIZ.incrementAndGet();
        BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: X.0WQV
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    int i = this.LLILLJJLI.LLILLL;
                    AtomicInteger atomicInteger = C0WQT.LIZ;
                    try {
                        Process.setThreadPriority(i);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    runnable.run();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (!C2179971ATj.LIZ(th2)) {
                        throw th2;
                    }
                }
            }
        });
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("-");
        sbLIZ.append(iIncrementAndGet);
        ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
        bPEAThread.setDaemon(this.LLILLJJLI);
        return bPEAThread;
    }

    public C0WQU(String str, boolean z, int i) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }
}
