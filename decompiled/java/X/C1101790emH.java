package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0emH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101790emH {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1101790emH)) {
            return false;
        }
        C1101790emH c1101790emH = (C1101790emH) obj;
        return Intrinsics.LJFF(this.LIZ, c1101790emH.LIZ) && this.LIZIZ == c1101790emH.LIZIZ && this.LIZJ == c1101790emH.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1101790emH.LIZLLL) && Intrinsics.LJFF(this.LJ, c1101790emH.LJ) && Intrinsics.LJFF(this.LJFF, c1101790emH.LJFF) && Intrinsics.LJFF(this.LJI, c1101790emH.LJI) && this.LJII == c1101790emH.LJII;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31;
        Boolean bool = this.LJ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJI;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShortTouchRequestResult(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", biz=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", failedReason=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", frequencyControlledReason=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", component=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1101790emH(String str, int i, int i2, String str2, Boolean bool, String str3, String str4, int i3, int i4) {
        bool = (i4 & 16) != 0 ? null : bool;
        str3 = (i4 & 32) != 0 ? null : str3;
        str4 = (i4 & 64) != 0 ? null : str4;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
        this.LJ = bool;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = i3;
    }
}
