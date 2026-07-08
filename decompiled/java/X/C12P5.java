package X;

import android.content.Context;

/* JADX INFO: renamed from: X.12P5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12P5 {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Float LJ;
    public Float LJFF;
    public C12KQ LJI;
    public EnumC197015126j LJII;

    public final C12P3 LIZ(Context context) {
        Integer numLIZJ;
        C12P3 c12p3 = new C12P3();
        int i = this.LIZ;
        if (i >= 0 && c12p3.LIZIZ() != i) {
            c12p3.LJIIIIZZ = null;
            c12p3.LJIILIIL = i;
            c12p3.LIZIZ = i;
            c12p3.invalidateSelf();
        }
        int i2 = this.LIZIZ;
        if (i2 >= 0 && c12p3.LIZ() != i2) {
            c12p3.LJIIIIZZ = null;
            c12p3.LJIILJJIL = i2;
            c12p3.LIZJ = i2;
            c12p3.invalidateSelf();
        }
        Integer num = this.LIZJ;
        if (num != null) {
            c12p3.LJ(num.intValue());
        }
        Integer num2 = this.LIZLLL;
        if (num2 != null && (numLIZJ = C1308910kAL.LIZJ(num2.intValue(), context)) != null) {
            c12p3.LJ(numLIZJ.intValue());
            c12p3.invalidateSelf();
        }
        Float f = this.LJ;
        if (f != null) {
            c12p3.LIZJ(f.floatValue());
        }
        Float f2 = this.LJFF;
        if (f2 != null) {
            c12p3.LIZLLL(f2.floatValue());
        }
        C12KQ c12kq = this.LJI;
        if (c12kq != null && c12p3.LJIIJ != c12kq) {
            c12p3.LJIIIIZZ = null;
            c12p3.LJIIJ = c12kq;
            c12p3.invalidateSelf();
        }
        EnumC197015126j enumC197015126j = this.LJII;
        if (enumC197015126j != null) {
            c12p3.LJFF(enumC197015126j);
        }
        return c12p3;
    }
}
