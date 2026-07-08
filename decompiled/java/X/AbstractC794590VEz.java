package X;

import Y.ARunnableS18S0100100_13;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0VEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC794590VEz implements InterfaceC807030VlF {
    public final C794620VFc LIZ;
    public long LIZIZ;
    public long LIZJ;

    @Override // X.InterfaceC807030VlF
    public void cancel() {
        LJI(this.LIZJ);
        C794620VFc c794620VFc = this.LIZ;
        synchronized (c794620VFc) {
            if (c794620VFc.LJII || !c794620VFc.LJI) {
                return;
            }
            C794530VEt c794530VEt = c794620VFc.LJ;
            c794530VEt.LJI.set(true);
            ((CopyOnWriteArrayList) c794530VEt.LJ).clear();
            ((CopyOnWriteArrayList) c794530VEt.LJFF).clear();
            c794620VFc.LJ = null;
            c794620VFc.LJII = true;
        }
    }

    @Override // X.InterfaceC807030VlF
    public final String getTraceId() {
        return this.LIZ.LIZJ;
    }

    public AbstractC794590VEz(C794620VFc c794620VFc) {
        this.LIZ = c794620VFc;
    }

    public static void LJI(long j) {
        if (C792400V6o.LJIIIIZZ() && C786410Ut5.u3().getId() != j) {
            throw new IllegalStateException("ITracingWrapper start() should invoke in same thread as end()");
        }
    }

    @Override // X.InterfaceC807030VlF
    public void LIZLLL(long j) {
        LJI(this.LIZJ);
        C794620VFc c794620VFc = this.LIZ;
        synchronized (c794620VFc) {
            if (!c794620VFc.LJII && c794620VFc.LJI) {
                C787900UvU.LIZ.LIZJ(new ARunnableS18S0100100_13(j, c794620VFc, 5));
                c794620VFc.LJII = true;
            }
        }
    }

    @Override // X.InterfaceC807030VlF
    public void LJ(long j) {
        long id = C786410Ut5.u3().getId();
        this.LIZIZ = id;
        this.LIZJ = id;
        this.LIZ.LIZIZ(j);
    }
}
