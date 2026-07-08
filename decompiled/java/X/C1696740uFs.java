package X;

import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696740uFs extends AbstractC1696830uG1 {
    public AbstractC1668700tWe LIZIZ;
    public float LJFF;
    public AbstractC1668700tWe LJI;
    public float LJIIJ;
    public float LJIIL;
    public boolean LJIILL;
    public C1695210uDP LJIILLIIL;
    public final C1695950uEb LJIIZILJ;
    public C1695950uEb LJIJ;
    public final C01GW LJIJI;
    public float LIZJ = 1.0f;
    public List<? extends AbstractC1776680wKo> LIZLLL = C1696220uF2.LIZ;
    public float LJ = 1.0f;
    public int LJII = 0;
    public int LJIIIIZZ = 0;
    public float LJIIIZ = 4.0f;
    public float LJIIJJI = 1.0f;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = true;

    public final void LJ() {
        if ((this.LJIIJ == 0.0f) && this.LJIIJJI == 1.0f) {
            this.LJIJ = this.LJIIZILJ;
            return;
        }
        if (Intrinsics.LJFF(this.LJIJ, this.LJIIZILJ)) {
            this.LJIJ = C1695940uEa.LIZ();
        } else {
            int iLIZIZ = this.LJIJ.LIZIZ();
            this.LJIJ.LJJJJLL();
            this.LJIJ.LJFF(iLIZIZ);
        }
        ((InterfaceC1696840uG2) this.LJIJI.getValue()).LIZ(this.LJIIZILJ);
        float length = ((InterfaceC1696840uG2) this.LJIJI.getValue()).getLength();
        float f = this.LJIIJ;
        float f2 = this.LJIIL;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.LJIIJJI + f2) % 1.0f) * length;
        if (f3 <= f4) {
            ((InterfaceC1696840uG2) this.LJIJI.getValue()).LIZIZ(f3, f4, this.LJIJ);
        } else {
            ((InterfaceC1696840uG2) this.LJIJI.getValue()).LIZIZ(f3, length, this.LJIJ);
            ((InterfaceC1696840uG2) this.LJIJI.getValue()).LIZIZ(0.0f, f4, this.LJIJ);
        }
    }

    public final String toString() {
        return this.LJIIZILJ.toString();
    }

    public C1696740uFs() {
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        this.LJIIZILJ = c1695950uEbLIZ;
        this.LJIJ = c1695950uEbLIZ;
        this.LJIJI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS214S0000000_25.get$arr$(379));
    }

    @Override // X.AbstractC1696830uG1
    public final void LIZ(InterfaceC1675870tiD interfaceC1675870tiD) {
        if (this.LJIILIIL) {
            C1776700wKq.LIZIZ(this.LIZLLL, this.LJIIZILJ);
            LJ();
        } else if (this.LJIILL) {
            LJ();
        }
        this.LJIILIIL = false;
        this.LJIILL = false;
        AbstractC1668700tWe abstractC1668700tWe = this.LIZIZ;
        if (abstractC1668700tWe != null) {
            C1675860tiC.LJII(interfaceC1675870tiD, this.LJIJ, abstractC1668700tWe, this.LIZJ, null, 56);
        }
        AbstractC1668700tWe abstractC1668700tWe2 = this.LJI;
        if (abstractC1668700tWe2 != null) {
            C1695210uDP c1695210uDP = this.LJIILLIIL;
            if (this.LJIILJJIL || c1695210uDP == null) {
                c1695210uDP = new C1695210uDP(this.LJFF, this.LJIIIZ, this.LJII, this.LJIIIIZZ, null, 16);
                this.LJIILLIIL = c1695210uDP;
                this.LJIILJJIL = false;
            }
            C1675860tiC.LJII(interfaceC1675870tiD, this.LJIJ, abstractC1668700tWe2, this.LJ, c1695210uDP, 48);
        }
    }
}
