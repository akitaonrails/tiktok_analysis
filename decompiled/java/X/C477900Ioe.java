package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ioe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477900Ioe {
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
        if (!(obj instanceof C477900Ioe)) {
            return false;
        }
        C477900Ioe c477900Ioe = (C477900Ioe) obj;
        return Intrinsics.LJFF(this.LIZ, c477900Ioe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c477900Ioe.LIZIZ) && this.LIZJ == c477900Ioe.LIZJ && Intrinsics.LJFF(this.LIZLLL, c477900Ioe.LIZLLL) && Intrinsics.LJFF(this.LJ, c477900Ioe.LJ) && Intrinsics.LJFF(this.LJFF, c477900Ioe.LJFF) && Intrinsics.LJFF(this.LJI, c477900Ioe.LJI);
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
        sbLIZ.append("PushRequestResultLoggerParams(scene=");
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

    public C477900Ioe(String str, long j, String str2, String str3, String str4, String str5) {
        this.LIZ = "timing";
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
    }

    public /* synthetic */ C477900Ioe(int i, long j, String str, String str2, String str3, String str4) {
        this(str, j, str2, str3, (String) null, (i & 64) != 0 ? null : str4);
    }
}
