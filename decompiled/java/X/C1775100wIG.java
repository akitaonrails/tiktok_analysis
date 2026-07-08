package X;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wIG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775100wIG {
    public final float LIZ;
    public final float LIZIZ;
    public final RectF LIZJ;
    public final RectF LIZLLL;
    public final RectF LJ;
    public final RectF LJFF;
    public final RectF LJI;
    public final RectF LJII;
    public final RectF LJIIIIZZ;
    public final RectF LJIIIZ;
    public final RectF LJIIJ;
    public final RectF LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final float LJIILJJIL;
    public final float LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1775100wIG)) {
            return false;
        }
        C1775100wIG c1775100wIG = (C1775100wIG) obj;
        return Float.compare(this.LIZ, c1775100wIG.LIZ) == 0 && Float.compare(this.LIZIZ, c1775100wIG.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c1775100wIG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1775100wIG.LIZLLL) && Intrinsics.LJFF(this.LJ, c1775100wIG.LJ) && Intrinsics.LJFF(this.LJFF, c1775100wIG.LJFF) && Intrinsics.LJFF(this.LJI, c1775100wIG.LJI) && Intrinsics.LJFF(this.LJII, c1775100wIG.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1775100wIG.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1775100wIG.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1775100wIG.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1775100wIG.LJIIJJI) && Float.compare(this.LJIIL, c1775100wIG.LJIIL) == 0 && Float.compare(this.LJIILIIL, c1775100wIG.LJIILIIL) == 0 && Float.compare(this.LJIILJJIL, c1775100wIG.LJIILJJIL) == 0 && Float.compare(this.LJIILL, c1775100wIG.LJIILL) == 0;
    }

    public final String toString() {
        return "OnboardingLayout(bandHeight=" + this.LIZ + ", iconTextSpacing=" + this.LIZIZ + ", collapsedBandFrame=" + this.LIZJ + ", expandedBandFrame=" + this.LIZLLL + ", leadingGradientFrame=" + this.LJ + ", dividerBackdropFrame=" + this.LJFF + ", dividerFrame=" + this.LJI + ", collapsedIconFrame=" + this.LJII + ", expandedIconFrame=" + this.LJIIIIZZ + ", collapsedTextClipFrame=" + this.LJIIIZ + ", expandedTextClipFrame=" + this.LJIIJ + ", textLabelFrame=" + this.LJIIJJI + ", shineWidth=" + this.LJIIL + ", shineHeight=" + this.LJIILIIL + ", shineStartCenterX=" + this.LJIILJJIL + ", shineEndCenterX=" + this.LJIILL + ')';
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + Float.floatToIntBits(this.LJIIL)) * 31) + Float.floatToIntBits(this.LJIILIIL)) * 31) + Float.floatToIntBits(this.LJIILJJIL)) * 31) + Float.floatToIntBits(this.LJIILL);
    }

    public C1775100wIG(float f, float f2, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, RectF rectF8, RectF rectF9, RectF rectF10, float f3, float f4, float f5, float f6) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = rectF;
        this.LIZLLL = rectF2;
        this.LJ = rectF3;
        this.LJFF = rectF4;
        this.LJI = rectF5;
        this.LJII = rectF6;
        this.LJIIIIZZ = rectF7;
        this.LJIIIZ = rectF8;
        this.LJIIJ = rectF9;
        this.LJIIJJI = rectF10;
        this.LJIIL = f3;
        this.LJIILIIL = f4;
        this.LJIILJJIL = f5;
        this.LJIILL = f6;
    }
}
