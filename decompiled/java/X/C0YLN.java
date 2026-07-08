package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0YLN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLN implements ThreadFactory {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C872370YKd LLILLJJLI;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable);
        ThreadMethodProxy.setPriority(bPEAThread, 10);
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL);
            sbLIZ.append("-");
            sbLIZ.append(this.LLILLJJLI.LJIIIIZZ.getAndIncrement());
            ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
            return bPEAThread;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJIIJ.LJ(th);
            return bPEAThread;
        }
    }

    public C0YLN(C872370YKd c872370YKd, String str) {
        this.LLILLJJLI = c872370YKd;
        this.LL = str;
    }
}
