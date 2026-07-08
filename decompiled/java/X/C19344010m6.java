package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10m6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19344010m6 extends C19345210mI {
    public final EnumC19355010ns LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final Integer LJIILL;

    @Override // X.C19345210mI, X.C186X
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LJIIIZ);
    }

    @Override // X.C19345210mI, X.C186X
    public final Float LIZJ() {
        return Float.valueOf(this.LJIIJ);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LJIIJJI);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LJFF() {
        return Integer.valueOf(this.LJIILIIL);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LJI() {
        return Integer.valueOf(this.LJIILJJIL);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LJII() {
        return Integer.valueOf(this.LJIIL);
    }

    @Override // X.C19345210mI, X.C186X
    public final Integer LIZ() {
        return this.LJIILL;
    }

    @Override // X.C19345210mI, X.C186X
    public final EnumC19355010ns LJ() {
        return this.LJIIIIZZ;
    }

    public C19344010m6(Integer num, int i) {
        EnumC19355010ns enumC19355010ns;
        int i2;
        float fLIZIZ;
        int iLIZIZ;
        int iLIZIZ2;
        int i3;
        if ((i & 1) != 0) {
            enumC19355010ns = EnumC19355010ns.TRANSPARENT_BG_WITH_BRACKETS;
        } else {
            enumC19355010ns = null;
        }
        if ((i & 2) != 0) {
            i2 = R.attr.a04;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            fLIZIZ = C418440Gaw.LIZIZ(4);
        } else {
            fLIZIZ = 0.0f;
        }
        if ((i & 8) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
        } else {
            iLIZIZ = 0;
        }
        if ((i & 16) != 0) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iLIZIZ2 = 0;
        }
        if ((i & 32) != 0) {
            i3 = R.attr.ee;
        } else {
            i3 = 0;
        }
        int i4 = (i & 64) != 0 ? 92 : 0;
        num = (i & 128) != 0 ? Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))) : num;
        this.LJIIIIZZ = enumC19355010ns;
        this.LJIIIZ = i2;
        this.LJIIJ = fLIZIZ;
        this.LJIIJJI = iLIZIZ;
        this.LJIIL = iLIZIZ2;
        this.LJIILIIL = i3;
        this.LJIILJJIL = i4;
        this.LJIILL = num;
    }
}
