package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868420yim {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ = false;
    public final Integer LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868420yim)) {
            return false;
        }
        C1868420yim c1868420yim = (C1868420yim) obj;
        return this.LIZ == c1868420yim.LIZ && this.LIZIZ == c1868420yim.LIZIZ && this.LIZJ == c1868420yim.LIZJ && this.LIZLLL == c1868420yim.LIZLLL && this.LJ == c1868420yim.LJ && Intrinsics.LJFF(this.LJFF, c1868420yim.LJFF);
    }

    public final int hashCode() {
        int iZ2 = ((((((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Integer num = this.LJFF;
        return iZ2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchImageLoadInfo(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromPreload=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isImageLoaded=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isDownShift=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868420yim(int i, int i2, boolean z, boolean z2, Integer num) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJFF = num;
    }
}
