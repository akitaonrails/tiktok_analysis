package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14D7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14D7 {
    public final int LIZ;
    public final Integer LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final Integer LJII;
    public final Integer LJIIIIZZ;
    public final Integer LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14D7)) {
            return false;
        }
        C14D7 c14d7 = (C14D7) obj;
        return this.LIZ == c14d7.LIZ && Intrinsics.LJFF(this.LIZIZ, c14d7.LIZIZ) && this.LIZJ == c14d7.LIZJ && this.LIZLLL == c14d7.LIZLLL && Intrinsics.LJFF(this.LJ, c14d7.LJ) && Intrinsics.LJFF(this.LJFF, c14d7.LJFF) && Intrinsics.LJFF(this.LJI, c14d7.LJI) && Intrinsics.LJFF(this.LJII, c14d7.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c14d7.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c14d7.LJIIIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        int iHashCode = (((((i + (num == null ? 0 : num.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        Integer num2 = this.LJ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJI;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LJII;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.LJIIIZ;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSugEnhancedStyle(font=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fillBgColorAttr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textColorAttr=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", arrowTintAttr=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", itemHorizontalPaddingDp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", itemVerticalPaddingDp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", arrowSizeDp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", gapTextArrowDp=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", itemTopMarginDp=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", cardTopGapDp=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C14D7(int i, Integer num, int i2, int i3, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.LIZ = i;
        this.LIZIZ = num;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = num2;
        this.LJFF = num3;
        this.LJI = num4;
        this.LJII = num5;
        this.LJIIIIZZ = num6;
        this.LJIIIZ = num7;
    }
}
