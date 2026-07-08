package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: X.1BXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206511BXl {
    public final C2206531BXn LIZ;
    public final ThreadPoolExecutor LIZIZ;

    public static void LIZ(C2206571BXr c2206571BXr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Execution SCHEDULE | ");
        sbLIZ.append(C1BXU.LIZ(c2206571BXr.LIZ, c2206571BXr.LIZIZ, c2206571BXr.LIZJ, c2206571BXr.LIZLLL, c2206571BXr.LJ, c2206571BXr.LJIIIZ, c2206571BXr.LJIIJ, c2206571BXr.LJIIJJI));
        C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        c2206571BXr.LJI.LIZ(c2206571BXr.LJII, new C2206651BXz(c2206571BXr.LIZ, c2206571BXr.LIZIZ, c2206571BXr.LIZJ, c2206571BXr.LIZLLL, c2206571BXr.LJ, c2206571BXr.LJFF));
    }

    public C2206511BXl(C2206531BXn c2206531BXn, int i) {
        this.LIZ = c2206531BXn;
        final C795780VJo c795780VJo = C795790VJp.LIZ;
        c795780VJo.getClass();
        C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
        c2123408To.LIZJ = i;
        c2123408To.LJI = new ThreadFactory() { // from class: X.0VFT
            public final /* synthetic */ int LLILLJJLI = 5;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                C795780VJo c795780VJo2 = c795780VJo;
                int i2 = this.LLILLJJLI;
                c795780VJo2.getClass();
                BPEAThread bPEAThread = new BPEAThread(runnable);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NewLego_Executor_");
                sbLIZ.append(c795780VJo2.LIZ.incrementAndGet());
                ThreadMethodProxy.setName(bPEAThread, C2188811AlT.LIZIZ(sbLIZ));
                ThreadMethodProxy.setPriority(bPEAThread, i2);
                return bPEAThread;
            }
        };
        this.LIZIZ = (ThreadPoolExecutor) C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }
}
