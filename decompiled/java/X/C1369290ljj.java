package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ljj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369290ljj {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1369290ljj)) {
            return false;
        }
        C1369290ljj c1369290ljj = (C1369290ljj) obj;
        return Intrinsics.LJFF(this.LIZ, c1369290ljj.LIZ) && this.LIZIZ == c1369290ljj.LIZIZ && this.LIZJ == c1369290ljj.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1369290ljj.LIZLLL) && Intrinsics.LJFF(this.LJ, c1369290ljj.LJ) && Intrinsics.LJFF(this.LJFF, c1369290ljj.LJFF) && Intrinsics.LJFF(this.LJI, c1369290ljj.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelSearchCandidate(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", relationRank=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sourceIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", alias=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", username=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", groupName=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1369290ljj(String str, String str2, int i, int i2, String str3, String str4, String str5, int i3) {
        str2 = (i3 & 8) != 0 ? null : str2;
        str3 = (i3 & 16) != 0 ? null : str3;
        str4 = (i3 & 32) != 0 ? null : str4;
        str5 = (i3 & 64) != 0 ? null : str5;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
    }
}
