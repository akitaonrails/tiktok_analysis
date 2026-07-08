package X;

import Y.ARunnableS135S0100000_35;

/* JADX INFO: renamed from: X.1DDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252251DDj {
    public final C2252261DDk LIZ;
    public int LIZIZ = C341940Daq.LIZ(40.0d);
    public int LIZJ = 2;
    public int LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public final ARunnableS135S0100000_35 LJIIIIZZ;

    public final void LIZ() {
        if (this.LJFF) {
            this.LJFF = false;
            if (this.LJ) {
                this.LIZ.scrollBy(this.LJII, 0);
            } else {
                this.LIZ.scrollBy(-this.LJII, 0);
            }
            this.LJII = 0;
        }
    }

    public C2252251DDj(C2252261DDk c2252261DDk) {
        this.LIZ = c2252261DDk;
        this.LJ = c2252261DDk.getLayoutDirection() == 1;
        this.LJIIIIZZ = new ARunnableS135S0100000_35(this, 12);
    }
}
