package X;

import Y.AObjectS397S0100000_23;
import Y.ARunnableS123S0100000_23;

/* JADX INFO: renamed from: X.0oRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473170oRH extends C1473120oRC {
    public boolean LJ;
    public final AObjectS397S0100000_23 LJFF;

    @Override // X.C1473120oRC, X.InterfaceC1473180oRI
    public final void LJIIIIZZ() {
        this.LJ = true;
    }

    @Override // X.C1473120oRC, X.InterfaceC1473180oRI
    public final void Ur() {
        this.LJ = false;
    }

    @Override // X.C1473120oRC, X.InterfaceC1473180oRI
    public final void LJ() {
        C1475000oUE.LJ.removeCallbacks(new ARunnableS123S0100000_23(this.LJFF, 159));
    }

    @Override // X.InterfaceC1473180oRI
    public final void LJII() {
        if (this.LJ) {
            C786410Ut5.LJLIIL(300L, C1475000oUE.LJ, new ARunnableS123S0100000_23(this.LJFF, 160));
        }
    }

    public C1473170oRH(C1473150oRF c1473150oRF) {
        super(c1473150oRF);
        this.LJFF = new AObjectS397S0100000_23(this, 15);
    }
}
