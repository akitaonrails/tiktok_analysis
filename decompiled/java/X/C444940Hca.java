package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444940Hca {
    public C419910GdJ LIZ;
    public String LIZJ;
    public Integer LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJII;
    public Function0<Unit> LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public boolean LIZIZ = true;
    public boolean LJI = true;

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LIZ(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C444940Hca.LIZ(android.content.Context):java.lang.CharSequence");
    }

    public final void LIZIZ(int i) {
        C444950Hcb c444950Hcb;
        this.LJ = i;
        int i2 = C1697600uHG.LIZJ(i, true, false).LIZ;
        if (i2 <= 13) {
            c444950Hcb = new C444950Hcb(14, 10, 4);
        } else if (i2 != 14 && i2 != 15) {
            if (i2 == 16) {
                c444950Hcb = new C444950Hcb(18, 12, 4);
            } else if (i2 == 17) {
                c444950Hcb = new C444950Hcb(18, 12, 6);
            } else if (i2 <= 20) {
                c444950Hcb = new C444950Hcb(20, 14, 6);
            } else if (i2 <= 24) {
                c444950Hcb = new C444950Hcb(24, 16, 8);
            } else if (i2 <= 32) {
                c444950Hcb = new C444950Hcb(32, 20, 8);
            } else {
                c444950Hcb = new C444950Hcb(18, 12, 4);
            }
        } else {
            c444950Hcb = new C444950Hcb(16, 12, 4);
        }
        this.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c444950Hcb.LIZ)));
        this.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c444950Hcb.LIZIZ)));
        this.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c444950Hcb.LIZJ)));
    }

    public final void LIZJ(int i) {
        this.LIZLLL = Integer.valueOf(i);
    }

    public final void LIZLLL(int i) {
        Integer numValueOf;
        this.LJFF = i;
        this.LJIIJ = R.raw.icon_chevron_right_offset_fill_ltr;
        this.LJIILJJIL = R.attr.a1p;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                numValueOf = Integer.valueOf(R.attr.a1n);
                            } else {
                                return;
                            }
                        } else {
                            numValueOf = Integer.valueOf(R.attr.zi);
                        }
                    } else {
                        numValueOf = Integer.valueOf(R.attr.a1k);
                    }
                } else {
                    numValueOf = Integer.valueOf(R.attr.a1j);
                }
            } else {
                numValueOf = Integer.valueOf(R.attr.a1h);
            }
        } else {
            numValueOf = Integer.valueOf(R.attr.a1r);
        }
        if (numValueOf != null) {
            this.LJIILIIL = numValueOf.intValue();
        }
    }
}
