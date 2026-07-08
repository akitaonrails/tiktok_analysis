package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477910Iof {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C477910Iof)) {
            return false;
        }
        C477910Iof c477910Iof = (C477910Iof) obj;
        return Intrinsics.LJFF(this.LIZ, c477910Iof.LIZ) && Intrinsics.LJFF(this.LIZIZ, c477910Iof.LIZIZ) && this.LIZJ == c477910Iof.LIZJ && Intrinsics.LJFF(this.LIZLLL, c477910Iof.LIZLLL) && Intrinsics.LJFF(this.LJ, c477910Iof.LJ) && Intrinsics.LJFF(this.LJFF, c477910Iof.LJFF) && Intrinsics.LJFF(this.LJI, c477910Iof.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJI;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopModuleRequestResultLoggerParams(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C477910Iof(int i, long j, String str, String str2, String str3, String str4, String str5) {
        this(str, str2, j, str3, str4, (String) null, (i & 64) != 0 ? null : str5);
    }

    public C477910Iof(String str, String str2, long j, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
    }
}
