package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477890Iod {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C477890Iod)) {
            return false;
        }
        C477890Iod c477890Iod = (C477890Iod) obj;
        return Intrinsics.LJFF(this.LIZ, c477890Iod.LIZ) && Intrinsics.LJFF(this.LIZIZ, c477890Iod.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c477890Iod.LIZJ) && this.LIZLLL == c477890Iod.LIZLLL && Intrinsics.LJFF(this.LJ, c477890Iod.LJ) && Intrinsics.LJFF(this.LJFF, c477890Iod.LJFF) && Intrinsics.LJFF(this.LJI, c477890Iod.LJI) && Intrinsics.LJFF(this.LJII, c477890Iod.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJII;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCardRequestResultLoggerParams(enterMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C477890Iod(int i, long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, j, str3, str4, str5, (String) null, (i & 128) != 0 ? null : str6);
    }

    public C477890Iod(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = j;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
    }
}
