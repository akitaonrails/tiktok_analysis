package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: renamed from: X.0TA6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TA6<Upstream, Downstream> implements InterfaceC742320T9y {
    public final /* synthetic */ AbstractRunnableC2239851Clb LIZ;

    public C0TA6(AbstractRunnableC2239851Clb abstractRunnableC2239851Clb) {
        this.LIZ = abstractRunnableC2239851Clb;
    }

    @Override // X.InterfaceC742320T9y
    public final C098D<Object> LIZIZ(C11NZ<Object> c11nz) {
        final C0TCM value = C0TCM.LJ.getValue();
        final AbstractRunnableC2239851Clb abstractRunnableC2239851Clb = this.LIZ;
        value.getClass();
        return c11nz.LJL(new C11RO(abstractRunnableC2239851Clb) { // from class: X.0TCL
            public final AbstractRunnableC2239851Clb LIZIZ;

            @Override // X.C11RO
            public final C11RN LIZ() {
                C0TCM c0tcm = this.LIZJ;
                synchronized (c0tcm.LIZIZ) {
                    try {
                        if (c0tcm.LIZIZ.get() < c0tcm.LIZJ) {
                            c0tcm.LIZIZ.incrementAndGet();
                            c0tcm.LIZLLL.submit(new ARunnableS112S0100000_12(c0tcm, 361));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return new C0TG2(this.LIZIZ, (PriorityBlockingQueue) this.LIZJ.LIZ.getValue());
            }

            {
                this.LIZIZ = abstractRunnableC2239851Clb;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
