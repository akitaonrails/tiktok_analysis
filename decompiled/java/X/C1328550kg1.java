package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328550kg1 implements InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> {
    public final InterfaceC1330410kj1 LIZ;
    public final Executor LIZIZ;
    public final InterfaceC1330200kig LIZJ;
    public final InterfaceC1330460kj6 LIZLLL;
    public final InterfaceC1327390ke9<C1328480kfu> LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final boolean LJIIIZ;

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1) {
        AbstractC1328470kft abstractC1328470kft;
        try {
            C1336010ks3.LIZIZ();
            if (!C1325880kbi.LJ(interfaceC1327930kf1.LJFF().LIZIZ)) {
                final boolean z = this.LJII;
                final int i = this.LJIIIIZZ;
                abstractC1328470kft = new AbstractC1328470kft(this, interfaceC1328020kfA, interfaceC1327930kf1, z, i) { // from class: X.0kgG
                    @Override // X.AbstractC1328470kft
                    public final InterfaceC529960KqQ LJIILJJIL() {
                        return new C1328060kfE(0, false, false);
                    }

                    @Override // X.AbstractC1328470kft
                    public final int LJIILIIL(C1328480kfu c1328480kfu) {
                        return c1328480kfu.LJIILL();
                    }

                    @Override // X.AbstractC1328470kft
                    public final synchronized boolean LJIJJ(C1328480kfu c1328480kfu, int i2) {
                        if (AbstractC1327820keq.LJ(i2)) {
                            return false;
                        }
                        return this.LJII.LJI(c1328480kfu, i2);
                    }
                };
            } else {
                final C1328610kg7 c1328610kg7 = new C1328610kg7(this.LIZ);
                final C1328670kgD c1328670kgD = new C1328670kgD(this.LIZ);
                final InterfaceC1330460kj6 interfaceC1330460kj6 = this.LIZLLL;
                final boolean z2 = this.LJII;
                final int i2 = this.LJIIIIZZ;
                abstractC1328470kft = new AbstractC1328470kft(this, interfaceC1328020kfA, interfaceC1327930kf1, c1328610kg7, interfaceC1330460kj6, c1328670kgD, z2, i2) { // from class: X.0kg2
                    public final C1328610kg7 LJIIIZ;
                    public final InterfaceC1330460kj6 LJIIJ;
                    public final C1328670kgD LJIIJJI;
                    public final InterfaceC1327930kf1 LJIIL;
                    public int LJIILIIL;

                    @Override // X.AbstractC1328470kft
                    public final InterfaceC529960KqQ LJIILJJIL() {
                        return this.LJIIJ.LIZIZ(this.LJIIIZ.LJ);
                    }

                    @Override // X.AbstractC1328470kft
                    public final int LJIILIIL(C1328480kfu c1328480kfu) throws Throwable {
                        c1328480kfu.LJIJJLI();
                        if (c1328480kfu.LLILLL == C1328580kg4.LIZ) {
                            return this.LJIIIZ.LJFF;
                        }
                        c1328480kfu.LJIJJLI();
                        if (c1328480kfu.LLILLL == C1328580kg4.LJIIIZ) {
                            return this.LJIIJJI.LIZLLL;
                        }
                        return 0;
                    }

                    @Override // X.AbstractC1328470kft
                    public final synchronized boolean LJIJJ(C1328480kfu c1328480kfu, int i3) {
                        boolean zLJI = this.LJII.LJI(c1328480kfu, i3);
                        if ((AbstractC1327820keq.LJ(i3) || AbstractC1327820keq.LJIIJ(i3, 8)) && !AbstractC1327820keq.LJIIJ(i3, 4) && C1328480kfu.LJIIZILJ(c1328480kfu)) {
                            c1328480kfu.LJIJJLI();
                            if (c1328480kfu.LLILLL == C1328580kg4.LIZ) {
                                if (!this.LJIIL.LJFF().LJFF) {
                                    return false;
                                }
                                if (!this.LJIIIZ.LIZIZ(c1328480kfu)) {
                                    return false;
                                }
                                int i4 = this.LJIIIZ.LJ;
                                int i5 = this.LJIILIIL;
                                if (i4 <= i5) {
                                    return false;
                                }
                                if (i4 < this.LJIIJ.LIZ(i5) && !this.LJIIIZ.LJI) {
                                    return false;
                                }
                                this.LJIILIIL = i4;
                            } else {
                                c1328480kfu.LJIJJLI();
                                if (c1328480kfu.LLILLL == C1328580kg4.LJIIIZ) {
                                    if (!this.LJIIL.LJFF().LJII) {
                                        return false;
                                    }
                                    if (!this.LJIIJJI.LIZIZ(c1328480kfu)) {
                                        return false;
                                    }
                                    int i6 = this.LJIIJJI.LIZJ;
                                    if (i6 - this.LJIILIIL < this.LJIIL.LJFF().LJJIIJ && this.LJIILIIL != 0) {
                                        return false;
                                    }
                                    this.LJIILIIL = i6;
                                } else {
                                    c1328480kfu.LJIJJLI();
                                    if (C1328580kg4.LIZ(c1328480kfu.LLILLL) && !this.LJIIL.LJFF().LJI) {
                                        return false;
                                    }
                                }
                            }
                        }
                        return zLJI;
                    }

                    {
                        this.LJIIIZ = c1328610kg7;
                        interfaceC1330460kj6.getClass();
                        this.LJIIJ = interfaceC1330460kj6;
                        this.LJIIJJI = c1328670kgD;
                        this.LJIIL = interfaceC1327930kf1;
                        this.LJIILIIL = 0;
                    }
                };
            }
            this.LJ.LIZIZ(abstractC1328470kft, interfaceC1327930kf1);
            C1336010ks3.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public C1328550kg1(InterfaceC1330410kj1 interfaceC1330410kj1, Executor executor, InterfaceC1330200kig interfaceC1330200kig, InterfaceC1330460kj6 interfaceC1330460kj6, boolean z, boolean z2, boolean z3, InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke9, int i, boolean z4) {
        interfaceC1330410kj1.getClass();
        this.LIZ = interfaceC1330410kj1;
        executor.getClass();
        this.LIZIZ = executor;
        interfaceC1330200kig.getClass();
        this.LIZJ = interfaceC1330200kig;
        interfaceC1330460kj6.getClass();
        this.LIZLLL = interfaceC1330460kj6;
        this.LJFF = z;
        this.LJI = z2;
        interfaceC1327390ke9.getClass();
        this.LJ = interfaceC1327390ke9;
        this.LJII = z3;
        this.LJIIIIZZ = i;
        this.LJIIIZ = z4;
    }
}
