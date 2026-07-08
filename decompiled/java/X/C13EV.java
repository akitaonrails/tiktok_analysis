package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13EV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EV<T> extends AbstractC19977113Ej {
    public C13E1<? extends T> LIZJ;
    public int LIZLLL;
    public int LJ;

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZIZ() {
        return LIZJ(C13YE.LJIIIZ().LJI());
    }

    @Override // X.AbstractC19977113Ej
    public final void LIZ(AbstractC19977113Ej abstractC19977113Ej) {
        synchronized (C13EX.LIZ) {
            try {
                this.LIZJ = ((C13EV) abstractC19977113Ej).LIZJ;
                this.LIZLLL = ((C13EV) abstractC19977113Ej).LIZLLL;
                this.LJ = ((C13EV) abstractC19977113Ej).LJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZJ(long j) {
        return new C13EV(j, this.LIZJ);
    }

    public C13EV(long j, C13E1<? extends T> c13e1) {
        super(j);
        this.LIZJ = c13e1;
    }
}
