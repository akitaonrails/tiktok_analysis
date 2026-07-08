package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0keo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1327800keo extends AbstractC1328840kgU<C1323050kX9<AbstractC1327750kej>, C1323050kX9<AbstractC1327750kej>> {
    public boolean LIZJ;
    public C1323050kX9<AbstractC1327750kej> LIZLLL;

    public final boolean LJIIJJI() {
        synchronized (this) {
            try {
                if (this.LIZJ) {
                    return false;
                }
                C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LIZLLL;
                this.LIZLLL = null;
                this.LIZJ = true;
                C1323050kX9.LJII(c1323050kX9);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIL() {
        synchronized (this) {
            try {
                if (this.LIZJ) {
                    return;
                }
                C1323050kX9 c1323050kX9LJFF = C1323050kX9.LJFF(this.LIZLLL);
                try {
                    this.LIZIZ.LIZJ(0, c1323050kX9LJFF);
                    C1323050kX9.LJII(c1323050kX9LJFF);
                } catch (Throwable th) {
                    C1323050kX9.LJII(c1323050kX9LJFF);
                    throw th;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJFF() {
        if (LJIIJJI()) {
            this.LIZIZ.LIZIZ();
        }
    }

    @Override // X.AbstractC1328840kgU, X.AbstractC1327820keq
    public final void LJI(Throwable th) {
        if (LJIIJJI()) {
            this.LIZIZ.onFailure(th);
        }
    }

    @Override // X.AbstractC1327820keq
    public final void LJII(int i, Object obj) {
        C1323050kX9 c1323050kX9 = (C1323050kX9) obj;
        if (!AbstractC1327820keq.LJ(i)) {
            synchronized (this) {
                try {
                    if (!this.LIZJ) {
                        C1323050kX9<AbstractC1327750kej> c1323050kX92 = this.LIZLLL;
                        this.LIZLLL = C1323050kX9.LJFF(c1323050kX9);
                        C1323050kX9.LJII(c1323050kX92);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            LJIIL();
        }
    }

    public C1327800keo(C1327760kek c1327760kek, InterfaceC1328080kfG interfaceC1328080kfG, InterfaceC1327930kf1 interfaceC1327930kf1) {
        super(c1327760kek);
        interfaceC1328080kfG.LIZ();
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0kf9
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                if (this.LIZ.LJIIJJI()) {
                    this.LIZ.LIZIZ.LIZIZ();
                }
            }
        });
    }
}
