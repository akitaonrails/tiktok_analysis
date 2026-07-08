package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.147h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202135147h {
    public final float LJ;
    public final int LIZ = 16;
    public final int LIZIZ = 16;
    public final int LIZJ = R.attr.a02;
    public final float LIZLLL = 0.5f;
    public final int LJFF = 43;
    public final int LJI = 81;
    public final int LJII = R.attr.a1k;
    public final int LJIIIIZZ = R.drawable.de3;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C202135147h)) {
            return false;
        }
        C202135147h c202135147h = (C202135147h) obj;
        return this.LIZ == c202135147h.LIZ && this.LIZIZ == c202135147h.LIZIZ && this.LIZJ == c202135147h.LIZJ && Float.compare(this.LIZLLL, c202135147h.LIZLLL) == 0 && Float.compare(this.LJ, c202135147h.LJ) == 0 && this.LJFF == c202135147h.LJFF && this.LJI == c202135147h.LJI && this.LJII == c202135147h.LJII && this.LJIIIIZZ == c202135147h.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisclaimerUiMetrics(bubblePaddingStartDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bubblePaddingEndDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bubbleStrokeColorAttr=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bubbleStrokeWidthDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bubbleCornerRadiusDp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", titleFont=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", contentFont=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", contentTextColorAttr=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dotDrawableRes=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public C202135147h(float f) {
        this.LJ = f;
    }
}
