package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777030wLN {
    public final float LIZ;
    public final float LIZIZ;
    public final AbstractC1811570xF5 LIZJ;
    public final C1777050wLP LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777030wLN)) {
            return false;
        }
        C1777030wLN c1777030wLN = (C1777030wLN) obj;
        return Float.compare(this.LIZ, c1777030wLN.LIZ) == 0 && Float.compare(this.LIZIZ, c1777030wLN.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c1777030wLN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1777030wLN.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Params(marginHorizontalDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", marginTopDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", verticalAlign=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dimens=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public C1777030wLN(float f, float f2, AbstractC1811570xF5 abstractC1811570xF5, C1777050wLP c1777050wLP) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = abstractC1811570xF5;
        this.LIZLLL = c1777050wLP;
    }
}
