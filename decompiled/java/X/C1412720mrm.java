package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mrm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412720mrm {
    public final String LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1412720mrm)) {
            return false;
        }
        C1412720mrm c1412720mrm = (C1412720mrm) obj;
        return Intrinsics.LJFF(this.LIZ, c1412720mrm.LIZ) && this.LIZIZ == c1412720mrm.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1412720mrm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1412720mrm.LIZLLL) && this.LJ == c1412720mrm.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZLLL;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Item(assetId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", assetParentType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", assetType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1412720mrm(String str, String str2, int i, int i2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = i2;
    }
}
