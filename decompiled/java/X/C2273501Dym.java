package X;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: X.1Dym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273501Dym {
    public C2273501Dym LIZ;
    public C2273501Dym LIZIZ;
    public C2273501Dym LIZJ;
    public C2273501Dym LIZLLL;
    public final String LJ;
    public CharSequence LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    public final void LIZJ() {
        C2273501Dym c2273501Dym;
        C2273501Dym c2273501Dym2 = this.LIZLLL;
        if (c2273501Dym2 == null || (c2273501Dym = this.LIZIZ) == null) {
            return;
        }
        C2273501Dym c2273501Dym3 = c2273501Dym2.LIZIZ;
        if (c2273501Dym3 != null) {
            c2273501Dym3.LIZ = null;
        }
        c2273501Dym2.LIZIZ = c2273501Dym.LIZLLL;
        C2273501Dym c2273501Dym4 = this.LIZIZ.LIZLLL;
        if (c2273501Dym4 != null) {
            C2273501Dym c2273501Dym5 = c2273501Dym4.LIZ;
            if (c2273501Dym5 != null) {
                c2273501Dym5.LIZIZ = null;
            }
            this.LIZIZ.LIZLLL.LIZ = c2273501Dym2;
        }
        c2273501Dym2.LIZJ();
    }

    public final void LIZLLL() {
        C2273501Dym c2273501Dym;
        C2273501Dym c2273501Dym2 = this.LIZLLL;
        if (c2273501Dym2 == null || (c2273501Dym = this.LIZ) == null) {
            return;
        }
        C2273501Dym c2273501Dym3 = c2273501Dym2.LIZ;
        if (c2273501Dym3 != null) {
            c2273501Dym3.LIZIZ = null;
        }
        c2273501Dym2.LIZ = c2273501Dym.LIZLLL;
        C2273501Dym c2273501Dym4 = this.LIZ.LIZLLL;
        if (c2273501Dym4 != null) {
            C2273501Dym c2273501Dym5 = c2273501Dym4.LIZIZ;
            if (c2273501Dym5 != null) {
                c2273501Dym5.LIZ = null;
            }
            this.LIZ.LIZLLL.LIZIZ = c2273501Dym2;
        }
        c2273501Dym2.LIZLLL();
    }

    public final C2273501Dym LJ() {
        C2273501Dym c2273501Dym = this.LIZJ;
        C2273501Dym c2273501DymLJ = c2273501Dym != null ? c2273501Dym.LJ() : null;
        C2273501Dym c2273501Dym2 = new C2273501Dym(this);
        if (c2273501DymLJ != null) {
            c2273501DymLJ.LIZ(c2273501Dym2);
            return c2273501Dym2;
        }
        c2273501Dym2.LIZIZ = this.LIZIZ;
        C2273501Dym c2273501Dym3 = this.LIZIZ;
        if (c2273501Dym3 != null) {
            c2273501Dym3.LIZ = c2273501Dym2;
        }
        c2273501Dym2.LIZ = this;
        this.LIZIZ = c2273501Dym2;
        return c2273501Dym2;
    }

    public final void LJFF() {
        C2273501Dym c2273501Dym = this.LIZLLL;
        if (c2273501Dym != null) {
            c2273501Dym.LJFF();
        }
        C2273501Dym c2273501Dym2 = this.LIZ;
        if (c2273501Dym2 != null) {
            c2273501Dym2.LIZIZ = null;
        }
        this.LIZ = null;
        C2273501Dym c2273501Dym3 = this.LIZIZ;
        if (c2273501Dym3 != null) {
            c2273501Dym3.LIZ = null;
        }
        this.LIZIZ = null;
    }

    public final void LJI() {
        C2273501Dym c2273501Dym = this.LIZLLL;
        if (c2273501Dym != null) {
            c2273501Dym.LJI();
        }
        C2273501Dym c2273501Dym2 = this.LIZ;
        if (c2273501Dym2 != null) {
            c2273501Dym2.LIZIZ = this.LIZIZ;
        }
        C2273501Dym c2273501Dym3 = this.LIZIZ;
        if (c2273501Dym3 != null) {
            c2273501Dym3.LIZ = c2273501Dym2;
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

    public C2273501Dym(C2273501Dym c2273501Dym) {
        this.LJ = c2273501Dym.LJ;
        this.LJII = c2273501Dym.LJII;
        this.LJIIIIZZ = c2273501Dym.LJIIIIZZ;
        if (c2273501Dym.LJFF != null) {
            this.LJFF = new SpannableStringBuilder(c2273501Dym.LJFF);
        }
        this.LJI = c2273501Dym.LJI;
    }

    public final void LIZ(C2273501Dym c2273501Dym) {
        C2273501Dym c2273501Dym2 = this.LIZLLL;
        if (c2273501Dym2 != null) {
            c2273501Dym2.LIZJ = null;
        }
        this.LIZLLL = c2273501Dym;
        C2273501Dym c2273501Dym3 = c2273501Dym.LIZJ;
        if (c2273501Dym3 != null) {
            c2273501Dym3.LIZLLL = null;
        }
        c2273501Dym.LIZJ = this;
        LIZJ();
        LIZLLL();
    }

    public final void LIZIZ(C2273501Dym c2273501Dym) {
        if (c2273501Dym == null) {
            this.LIZIZ = null;
            return;
        }
        C2273501Dym c2273501Dym2 = c2273501Dym.LIZIZ;
        if (c2273501Dym2 != null) {
            c2273501Dym2.LIZ = null;
        }
        c2273501Dym.LIZIZ = this.LIZIZ;
        C2273501Dym c2273501Dym3 = this.LIZIZ;
        if (c2273501Dym3 != null) {
            c2273501Dym3.LIZ = c2273501Dym;
        }
        C2273501Dym c2273501Dym4 = c2273501Dym.LIZ;
        if (c2273501Dym4 != null) {
            c2273501Dym4.LIZIZ = null;
        }
        c2273501Dym.LIZ = this;
        this.LIZIZ = c2273501Dym;
        C2273501Dym c2273501Dym5 = this.LIZLLL;
        if (c2273501Dym5 == null) {
            return;
        }
        c2273501Dym5.LIZIZ(c2273501Dym.LIZLLL);
    }

    public C2273501Dym(String str) {
        this.LJ = str;
        this.LJII = 1;
    }
}
