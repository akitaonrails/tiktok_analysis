package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.13oi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20124613oi {
    public C20124713oj LIZ;
    public C1974807oQ LIZIZ;
    public Executor LIZJ;
    public boolean LIZLLL = true;
    public boolean LJ = true;
    public float LJFF = 0.9f;
    public long LJI = 180000;
    public int LJII = 5;
    public int LJIIIIZZ = 300000;
    public boolean LJIIIZ = true;

    public final C20124513oh LIZ() {
        if (this.LIZ == null) {
            this.LIZ = new C20124713oj(this.LJFF, this.LJI);
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new C1974807oQ(this.LJII, this.LJIIIIZZ, this.LJIIIZ);
        }
        if (this.LIZJ == null) {
            this.LIZJ = C786410Ut5.i4(new ThreadFactory() { // from class: X.0CNE
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    BPEAThread bPEAThread = new BPEAThread(runnable, "MemLeakFix");
                    ThreadMethodProxy.setPriority(bPEAThread, 5);
                    return bPEAThread;
                }
            });
        }
        return new C20124513oh(this.LIZ, this.LIZIZ, this.LIZLLL, this.LJ, this.LIZJ);
    }
}
