package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LUU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LUU {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LUU)) {
            return false;
        }
        C0LUU c0luu = (C0LUU) obj;
        return Intrinsics.LJFF(this.LIZ, c0luu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0luu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0luu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0luu.LIZLLL) && Intrinsics.LJFF(this.LJ, c0luu.LJ) && Intrinsics.LJFF(this.LJFF, c0luu.LJFF) && Intrinsics.LJFF(this.LJI, c0luu.LJI) && Intrinsics.LJFF(this.LJII, c0luu.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0luu.LJIIIIZZ) && this.LJIIIZ == c0luu.LJIIIZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        String str = this.LJI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJII;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskCommonMobParams(clientTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", traceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", entranceScene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", jobType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", deviceId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", isRetry=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LUU(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = i;
    }
}
