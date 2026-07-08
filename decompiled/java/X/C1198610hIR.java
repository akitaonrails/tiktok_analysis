package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198610hIR {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final C1197720hH0 LJI;
    public final Boolean LJII;

    public C1198610hIR() {
        this(0, null, null, 0L, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1198610hIR)) {
            return false;
        }
        C1198610hIR c1198610hIR = (C1198610hIR) obj;
        return this.LIZ == c1198610hIR.LIZ && Intrinsics.LJFF(this.LIZIZ, c1198610hIR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1198610hIR.LIZJ) && this.LIZLLL == c1198610hIR.LIZLLL && Intrinsics.LJFF(this.LJ, c1198610hIR.LJ) && Intrinsics.LJFF(this.LJFF, c1198610hIR.LJFF) && Intrinsics.LJFF(this.LJI, c1198610hIR.LJI) && Intrinsics.LJFF(this.LJII, c1198610hIR.LJII);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str3 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJFF;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        C1197720hH0 c1197720hH0 = this.LJI;
        int iHashCode5 = (iHashCode4 + (c1197720hH0 == null ? 0 : c1197720hH0.hashCode())) * 31;
        Boolean bool = this.LJII;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Extras(pageOrder=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", keyWord=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", searchSessionId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isDisplayDistance=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", searchActionNote=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", usePrefixCache=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1198610hIR(int i, String str, String str2, long j, String str3, Integer num, C1197720hH0 c1197720hH0, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? null : str;
        str2 = (i2 & 4) != 0 ? null : str2;
        j = (i2 & 8) != 0 ? 0L : j;
        str3 = (i2 & 16) != 0 ? null : str3;
        num = (i2 & 32) != 0 ? 0 : num;
        c1197720hH0 = (i2 & 64) != 0 ? null : c1197720hH0;
        Boolean bool = (i2 & 128) != 0 ? Boolean.FALSE : null;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = c1197720hH0;
        this.LJII = bool;
    }
}
