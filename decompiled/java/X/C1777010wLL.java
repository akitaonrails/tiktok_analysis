package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777010wLL {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final AbstractC1811560xF4 LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777010wLL)) {
            return false;
        }
        C1777010wLL c1777010wLL = (C1777010wLL) obj;
        return Float.compare(this.LIZ, c1777010wLL.LIZ) == 0 && Float.compare(this.LIZIZ, c1777010wLL.LIZIZ) == 0 && Float.compare(this.LIZJ, c1777010wLL.LIZJ) == 0 && Float.compare(this.LIZLLL, c1777010wLL.LIZLLL) == 0 && Intrinsics.LJFF(this.LJ, c1777010wLL.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Params(sizeDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", horizontalBias=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", marginTopDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", marginLeftDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", topAnchor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public C1777010wLL(float f, float f2, float f3, float f4, AbstractC1811560xF4 abstractC1811560xF4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = abstractC1811560xF4;
    }
}
