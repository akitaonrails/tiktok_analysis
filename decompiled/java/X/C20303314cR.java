package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14cR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20303314cR {
    public final int LIZ;
    public final int LIZIZ;
    public final Boolean LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final int LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20303314cR)) {
            return false;
        }
        C20303314cR c20303314cR = (C20303314cR) obj;
        return this.LIZ == c20303314cR.LIZ && this.LIZIZ == c20303314cR.LIZIZ && Intrinsics.LJFF(this.LIZJ, c20303314cR.LIZJ) && this.LIZLLL == c20303314cR.LIZLLL && Float.compare(this.LJ, c20303314cR.LJ) == 0 && this.LJFF == c20303314cR.LJFF && this.LJI == c20303314cR.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Caption(textResId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textMaxWidthInDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textAnchorStart=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textAnchorGuideBeginInDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", textVerticalBias=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", textFontSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", textColorAttr=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Boolean bool = this.LIZJ;
        return ((((((((i + (bool == null ? 0 : bool.hashCode())) * 31) + this.LIZLLL) * 31) + Float.floatToIntBits(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public C20303314cR(int i, int i2, Boolean bool, int i3, int i4, int i5) {
        float f;
        bool = (i5 & 4) != 0 ? Boolean.TRUE : bool;
        i3 = (i5 & 8) != 0 ? 0 : i3;
        if ((i5 & 16) != 0) {
            f = 0.5f;
        } else {
            f = 0.0f;
        }
        i4 = (i5 & 32) != 0 ? 7 : i4;
        int i6 = (i5 & 64) != 0 ? R.attr.a1j : 0;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = bool;
        this.LIZLLL = i3;
        this.LJ = f;
        this.LJFF = i4;
        this.LJI = i6;
    }
}
