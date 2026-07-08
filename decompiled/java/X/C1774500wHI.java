package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774500wHI {
    public final C1774740wHg LIZ;
    public final C1774520wHK LIZIZ;
    public final C1774520wHK LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.LJ;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.LJFF;
        int iIntValue3 = (iIntValue2 + (num3 != null ? num3.intValue() : 0)) * 31;
        Integer num4 = this.LJI;
        return ((((((((iIntValue3 + (num4 != null ? num4.intValue() : 0)) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + ((int) this.LJIIIZ)) * 31) + ((int) this.LJIIJ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1774500wHI) {
            C1774500wHI c1774500wHI = (C1774500wHI) obj;
            if (!Intrinsics.LJFF(this.LIZ, c1774500wHI.LIZ) || !Intrinsics.LJFF(this.LIZIZ, c1774500wHI.LIZIZ) || !Intrinsics.LJFF(this.LIZJ, c1774500wHI.LIZJ) || !Intrinsics.LJFF(this.LIZLLL, c1774500wHI.LIZLLL) || !Intrinsics.LJFF(this.LJ, c1774500wHI.LJ) || !Intrinsics.LJFF(this.LJFF, c1774500wHI.LJFF) || !Intrinsics.LJFF(this.LJI, c1774500wHI.LJI) || this.LJII != c1774500wHI.LJII || this.LJIIIIZZ != c1774500wHI.LJIIIIZZ || this.LJIIIZ != c1774500wHI.LJIIIZ || this.LJIIJ != c1774500wHI.LJIIJ) {
                return false;
            }
            return true;
        }
        return super.equals(obj);
    }

    public C1774500wHI(C1774740wHg c1774740wHg, C1774520wHK c1774520wHK, C1774520wHK c1774520wHK2, Integer num, Integer num2, Integer num3, Integer num4, int i, int i2, float f, float f2) {
        this.LIZ = c1774740wHg;
        this.LIZIZ = c1774520wHK;
        this.LIZJ = c1774520wHK2;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = num3;
        this.LJI = num4;
        this.LJII = i;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = f;
        this.LJIIJ = f2;
    }
}
