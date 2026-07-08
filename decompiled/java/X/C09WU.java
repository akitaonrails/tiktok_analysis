package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09WU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09WU {
    public final boolean LIZ;
    public final String LIZIZ;
    public final Number LIZJ;
    public final Number LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Number LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09WU)) {
            return false;
        }
        C09WU c09wu = (C09WU) obj;
        return this.LIZ == c09wu.LIZ && Intrinsics.LJFF(this.LIZIZ, c09wu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c09wu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c09wu.LIZLLL) && Intrinsics.LJFF(this.LJ, c09wu.LJ) && Intrinsics.LJFF(this.LJFF, c09wu.LJFF) && Intrinsics.LJFF(this.LJI, c09wu.LJI) && Intrinsics.LJFF(this.LJII, c09wu.LJII);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        Number number = this.LIZJ;
        int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
        Number number2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (number2 == null ? 0 : number2.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Number number3 = this.LJI;
        int iHashCode6 = (iHashCode5 + (number3 == null ? 0 : number3.hashCode())) * 31;
        String str4 = this.LJII;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageUploadResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", md5=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fileCs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09WU(boolean z, String str, Number number, Number number2, String str2, String str3, Number number3, String str4, int i) {
        str = (i & 2) != 0 ? null : str;
        number = (i & 4) != 0 ? null : number;
        number2 = (i & 8) != 0 ? null : number2;
        str2 = (i & 16) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        number3 = (i & 64) != 0 ? null : number3;
        str4 = (i & 128) != 0 ? null : str4;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = number;
        this.LIZLLL = number2;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = number3;
        this.LJII = str4;
    }
}
