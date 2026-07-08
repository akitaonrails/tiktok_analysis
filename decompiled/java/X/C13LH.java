package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13LH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LH {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13LH)) {
            return false;
        }
        C13LH c13lh = (C13LH) obj;
        return Intrinsics.LJFF(this.LIZ, c13lh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c13lh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c13lh.LIZJ) && this.LIZLLL == c13lh.LIZLLL && Intrinsics.LJFF(this.LJ, c13lh.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Integer num = this.LJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialResourceRecord(resourceKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", md5=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isAssetMaterial=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", assetType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13LH(String str, Integer num, String str2, boolean z, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = num;
    }
}
