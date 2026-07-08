package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GSE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GSE extends C0GSB {
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final float LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;

    @Override // X.C0GSB, X.C0HAI
    public final int LIZIZ() {
        return this.LJIL;
    }

    @Override // X.C0GSB, X.C0HAI
    public final int LIZJ() {
        return this.LJIJJLI;
    }

    @Override // X.C0GSB, X.C0HAI
    public final float LIZLLL() {
        return this.LJIJ;
    }

    @Override // X.C0GSB, X.C0HAI
    public final int LJ() {
        return this.LJIILLIIL;
    }

    @Override // X.C0GSB, X.C0HAI
    public final int LJFF() {
        return this.LJIJJ;
    }

    @Override // X.C0GSB, X.C0HAI
    public final int LJI() {
        return this.LJIJI;
    }

    @Override // X.C0GSB, X.C0HAI
    public final int LJII() {
        return this.LJIILJJIL;
    }

    @Override // X.C0GSB, X.C0HAI
    public final boolean LJIIIIZZ() {
        return this.LJIIL;
    }

    @Override // X.C0GSB, X.C0HAI
    public final int LJIIIZ() {
        return this.LJIIZILJ;
    }

    @Override // X.C0GSB, X.C0HAI
    public final boolean LJIIJ() {
        return this.LJIILIIL;
    }

    @Override // X.C0GSB, X.C0HAI
    public final int getItemHeight() {
        return this.LJIILL;
    }

    public C0GSE(boolean z, int i, int i2, int i3) {
        boolean z2;
        int iLIZIZ;
        int i4;
        int iLIZIZ2;
        int i5;
        if ((i3 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i3 & 2) != 0 ? false : z;
        if ((i3 & 8) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        } else {
            iLIZIZ = 0;
        }
        if ((i3 & 32) != 0) {
            i4 = R.attr.uk;
        } else {
            i4 = 0;
        }
        i = (i3 & 128) != 0 ? R.attr.a1k : i;
        if ((i3 & 256) != 0) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iLIZIZ2 = 0;
        }
        i2 = (i3 & 512) != 0 ? R.attr.a1k : i2;
        if ((i3 & 1024) != 0) {
            i5 = 81;
        } else {
            i5 = 0;
        }
        this.LJIIL = z2;
        this.LJIILIIL = z;
        this.LJIILJJIL = 0;
        this.LJIILL = iLIZIZ;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = i4;
        this.LJIJ = 0.0f;
        this.LJIJI = i;
        this.LJIJJ = iLIZIZ2;
        this.LJIJJLI = i2;
        this.LJIL = i5;
    }
}
