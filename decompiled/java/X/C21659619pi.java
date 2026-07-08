package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.19pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21659619pi {
    public String LIZ;
    public Float LIZIZ;
    public Float LIZJ;
    public boolean LJI;
    public EnumC1396040mQs LJII;
    public Integer LJIIIIZZ;
    public Boolean LJIIIZ;
    public boolean LIZLLL = true;
    public boolean LJ = true;
    public boolean LJFF = true;
    public EnumC1995507rl LJIIJ = EnumC1995507rl.BELOW_GRABBER;

    public final C21659719pj LIZ() {
        EnumC21658519pX enumC21658519pX;
        EnumC1396040mQs enumC1396040mQs = this.LJII;
        if (enumC1396040mQs == null) {
            throw new IllegalArgumentException("`panelType` is required");
        }
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        String string = a0.LJLIIIL(str).toString();
        int i = C21659519ph.LIZ[enumC1396040mQs.ordinal()];
        if (i == 1) {
            enumC21658519pX = !this.LJ ? EnumC21658519pX.FIX_HEIGHT : EnumC21658519pX.AUTO;
            this.LIZIZ = Float.valueOf(0.73f);
            this.LJI = false;
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            enumC21658519pX = EnumC21658519pX.FIT_CONTENT;
            this.LIZJ = Float.valueOf(0.6f);
            this.LIZLLL = false;
            this.LJ = false;
            this.LJFF = false;
        }
        Float f = this.LIZIZ;
        Float f2 = this.LIZJ;
        int[] iArr = C21659519ph.LIZIZ;
        int i2 = iArr[enumC21658519pX.ordinal()];
        Float f3 = null;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                throw new C1954807lC();
            }
            f = null;
        }
        int i3 = iArr[enumC21658519pX.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                f3 = f2;
            } else if (i3 != 4) {
                throw new C1954807lC();
            }
        }
        Boolean bool = this.LJIIIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num = this.LJIIIIZZ;
        boolean z = this.LJ;
        return new C21659719pj(enumC21658519pX, num, string, f, f3, !z ? false : this.LIZLLL, z, this.LJFF, this.LJI, zBooleanValue, this.LJIIJ, null, null);
    }
}
