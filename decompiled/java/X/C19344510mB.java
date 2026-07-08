package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10mB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19344510mB extends C19345210mI {
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final EnumC19355010ns LJIIJ;
    public final int LJIIJJI;
    public final float LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;

    @Override // X.C19345210mI, X.C186X
    public final Integer LIZ() {
        return Integer.valueOf(this.LJIIIZ);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LJIIJJI);
    }

    @Override // X.C19345210mI, X.C186X
    public final Float LIZJ() {
        return Float.valueOf(this.LJIIL);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LJIIIIZZ);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LJFF() {
        return Integer.valueOf(this.LJIILJJIL);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LJI() {
        return Integer.valueOf(this.LJIILL);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LJII() {
        return Integer.valueOf(this.LJIILIIL);
    }

    @Override // X.C19345210mI, X.C186X
    public final EnumC19355010ns LJ() {
        return this.LJIIJ;
    }

    public C19344510mB(int i, int i2) {
        int iLIZIZ;
        EnumC19355010ns enumC19355010ns;
        int i3;
        int i4;
        int i5;
        if ((i2 & 1) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        } else {
            iLIZIZ = 0;
        }
        i = (i2 & 2) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))) : i;
        if ((i2 & 4) != 0) {
            enumC19355010ns = EnumC19355010ns.TRANSPARENT_BG_WITH_BRACKETS;
        } else {
            enumC19355010ns = null;
        }
        if ((i2 & 8) != 0) {
            i3 = R.attr.uk;
        } else {
            i3 = 0;
        }
        if ((i2 & 64) != 0) {
            i4 = R.attr.a04;
        } else {
            i4 = 0;
        }
        if ((i2 & 128) != 0) {
            i5 = 81;
        } else {
            i5 = 0;
        }
        this.LJIIIIZZ = iLIZIZ;
        this.LJIIIZ = i;
        this.LJIIJ = enumC19355010ns;
        this.LJIIJJI = i3;
        this.LJIIL = 0.0f;
        this.LJIILIIL = 0;
        this.LJIILJJIL = i4;
        this.LJIILL = i5;
    }
}
