package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.147i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202136147i {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final Integer LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C202136147i)) {
            return false;
        }
        C202136147i c202136147i = (C202136147i) obj;
        return this.LIZ == c202136147i.LIZ && this.LIZIZ == c202136147i.LIZIZ && this.LIZJ == c202136147i.LIZJ && Intrinsics.LJFF(this.LIZLLL, c202136147i.LIZLLL) && Float.compare(this.LJ, c202136147i.LJ) == 0 && Float.compare(this.LJFF, c202136147i.LJFF) == 0 && Intrinsics.LJFF(this.LJI, c202136147i.LJI) && this.LJII == c202136147i.LJII && this.LJIIIIZZ == c202136147i.LJIIIIZZ && this.LJIIIZ == c202136147i.LJIIIZ && this.LJIIJ == c202136147i.LJIIJ;
    }

    public final String toString() {
        return "DisclaimerMetrics(bubblePaddingStartDp=" + this.LIZ + ", bubblePaddingEndDp=" + this.LIZIZ + ", bubbleDrawType=" + this.LIZJ + ", bubbleStrokeColorAttr=" + this.LIZLLL + ", bubbleStrokeWidthDp=" + this.LJ + ", bubbleCornerRadiusDp=" + this.LJFF + ", bubbleBackgroundColorAttr=" + this.LJI + ", titleFont=" + this.LJII + ", contentFont=" + this.LJIIIIZZ + ", contentTextColorAttr=" + this.LJIIIZ + ", dotDrawableRes=" + this.LJIIJ + ')';
    }

    public final int hashCode() {
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        int iHashCode = (((((i + (num == null ? 0 : num.hashCode())) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31;
        Integer num2 = this.LJI;
        return ((((((((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ;
    }

    public C202136147i(int i, int i2, int i3, Integer num, float f, float f2, Integer num2, int i4, int i5, int i6, int i7) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = num;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = num2;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = i6;
        this.LJIIJ = i7;
    }
}
