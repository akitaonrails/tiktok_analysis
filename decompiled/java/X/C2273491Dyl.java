package X;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: X.1Dyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273491Dyl {
    public C2273491Dyl LIZ;
    public C2273491Dyl LIZIZ;
    public C2273491Dyl LIZJ;
    public C2273491Dyl LIZLLL;
    public final String LJ;
    public CharSequence LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    public final void LIZJ() {
        C2273491Dyl c2273491Dyl;
        C2273491Dyl c2273491Dyl2 = this.LIZLLL;
        if (c2273491Dyl2 == null || (c2273491Dyl = this.LIZIZ) == null) {
            return;
        }
        C2273491Dyl c2273491Dyl3 = c2273491Dyl2.LIZIZ;
        if (c2273491Dyl3 != null) {
            c2273491Dyl3.LIZ = null;
        }
        c2273491Dyl2.LIZIZ = c2273491Dyl.LIZLLL;
        C2273491Dyl c2273491Dyl4 = this.LIZIZ.LIZLLL;
        if (c2273491Dyl4 != null) {
            C2273491Dyl c2273491Dyl5 = c2273491Dyl4.LIZ;
            if (c2273491Dyl5 != null) {
                c2273491Dyl5.LIZIZ = null;
            }
            this.LIZIZ.LIZLLL.LIZ = c2273491Dyl2;
        }
        c2273491Dyl2.LIZJ();
    }

    public final void LIZLLL() {
        C2273491Dyl c2273491Dyl;
        C2273491Dyl c2273491Dyl2 = this.LIZLLL;
        if (c2273491Dyl2 == null || (c2273491Dyl = this.LIZ) == null) {
            return;
        }
        C2273491Dyl c2273491Dyl3 = c2273491Dyl2.LIZ;
        if (c2273491Dyl3 != null) {
            c2273491Dyl3.LIZIZ = null;
        }
        c2273491Dyl2.LIZ = c2273491Dyl.LIZLLL;
        C2273491Dyl c2273491Dyl4 = this.LIZ.LIZLLL;
        if (c2273491Dyl4 != null) {
            C2273491Dyl c2273491Dyl5 = c2273491Dyl4.LIZIZ;
            if (c2273491Dyl5 != null) {
                c2273491Dyl5.LIZ = null;
            }
            this.LIZ.LIZLLL.LIZIZ = c2273491Dyl2;
        }
        c2273491Dyl2.LIZLLL();
    }

    public final C2273491Dyl LJ() {
        C2273491Dyl c2273491Dyl = this.LIZJ;
        C2273491Dyl c2273491DylLJ = c2273491Dyl != null ? c2273491Dyl.LJ() : null;
        C2273491Dyl c2273491Dyl2 = new C2273491Dyl(this);
        if (c2273491DylLJ != null) {
            c2273491DylLJ.LIZ(c2273491Dyl2);
            return c2273491Dyl2;
        }
        c2273491Dyl2.LIZIZ = this.LIZIZ;
        C2273491Dyl c2273491Dyl3 = this.LIZIZ;
        if (c2273491Dyl3 != null) {
            c2273491Dyl3.LIZ = c2273491Dyl2;
        }
        c2273491Dyl2.LIZ = this;
        this.LIZIZ = c2273491Dyl2;
        return c2273491Dyl2;
    }

    public final void LJFF() {
        C2273491Dyl c2273491Dyl = this.LIZLLL;
        if (c2273491Dyl != null) {
            c2273491Dyl.LJFF();
        }
        C2273491Dyl c2273491Dyl2 = this.LIZ;
        if (c2273491Dyl2 != null) {
            c2273491Dyl2.LIZIZ = null;
        }
        this.LIZ = null;
        C2273491Dyl c2273491Dyl3 = this.LIZIZ;
        if (c2273491Dyl3 != null) {
            c2273491Dyl3.LIZ = null;
        }
        this.LIZIZ = null;
    }

    public final void LJI() {
        C2273491Dyl c2273491Dyl = this.LIZLLL;
        if (c2273491Dyl != null) {
            c2273491Dyl.LJI();
        }
        C2273491Dyl c2273491Dyl2 = this.LIZ;
        if (c2273491Dyl2 != null) {
            c2273491Dyl2.LIZIZ = this.LIZIZ;
        }
        C2273491Dyl c2273491Dyl3 = this.LIZIZ;
        if (c2273491Dyl3 != null) {
            c2273491Dyl3.LIZ = c2273491Dyl2;
        }
        this.LIZIZ = null;
        this.LIZ = null;
    }

    public final void LJII() {
        if (this.LIZJ != null) {
            LJFF();
            this.LIZJ.LIZLLL = null;
        }
        this.LIZJ = null;
    }

    public final String toString() {
        return this.LJ;
    }

    public C2273491Dyl(C2273491Dyl c2273491Dyl) {
        this.LJ = c2273491Dyl.LJ;
        this.LJII = c2273491Dyl.LJII;
        this.LJIIIIZZ = c2273491Dyl.LJIIIIZZ;
        if (c2273491Dyl.LJFF != null) {
            this.LJFF = new SpannableStringBuilder(c2273491Dyl.LJFF);
        }
        this.LJI = c2273491Dyl.LJI;
    }

    public final void LIZ(C2273491Dyl c2273491Dyl) {
        C2273491Dyl c2273491Dyl2 = this.LIZLLL;
        if (c2273491Dyl2 != null) {
            c2273491Dyl2.LIZJ = null;
        }
        this.LIZLLL = c2273491Dyl;
        C2273491Dyl c2273491Dyl3 = c2273491Dyl.LIZJ;
        if (c2273491Dyl3 != null) {
            c2273491Dyl3.LIZLLL = null;
        }
        c2273491Dyl.LIZJ = this;
        LIZJ();
        LIZLLL();
    }

    public final void LIZIZ(C2273491Dyl c2273491Dyl) {
        if (c2273491Dyl == null) {
            this.LIZIZ = null;
            return;
        }
        C2273491Dyl c2273491Dyl2 = c2273491Dyl.LIZIZ;
        if (c2273491Dyl2 != null) {
            c2273491Dyl2.LIZ = null;
        }
        c2273491Dyl.LIZIZ = this.LIZIZ;
        C2273491Dyl c2273491Dyl3 = this.LIZIZ;
        if (c2273491Dyl3 != null) {
            c2273491Dyl3.LIZ = c2273491Dyl;
        }
        C2273491Dyl c2273491Dyl4 = c2273491Dyl.LIZ;
        if (c2273491Dyl4 != null) {
            c2273491Dyl4.LIZIZ = null;
        }
        c2273491Dyl.LIZ = this;
        this.LIZIZ = c2273491Dyl;
        C2273491Dyl c2273491Dyl5 = this.LIZLLL;
        if (c2273491Dyl5 == null) {
            return;
        }
        c2273491Dyl5.LIZIZ(c2273491Dyl.LIZLLL);
    }

    public C2273491Dyl(String str) {
        this.LJ = str;
        this.LJII = 1;
    }
}
