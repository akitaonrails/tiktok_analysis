package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516160KMc {
    public final C0KNY LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final Throwable LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C516160KMc)) {
            return false;
        }
        C516160KMc c516160KMc = (C516160KMc) obj;
        return Intrinsics.LJFF(this.LIZ, c516160KMc.LIZ) && this.LIZIZ == c516160KMc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c516160KMc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c516160KMc.LIZLLL) && Intrinsics.LJFF(this.LJ, c516160KMc.LJ) && Intrinsics.LJFF(this.LJFF, c516160KMc.LJFF) && Intrinsics.LJFF(this.LJI, c516160KMc.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Integer num = this.LJFF;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Throwable th = this.LJI;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateContractLogData(payload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contractId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C516160KMc(C0KFM c0kfm, long j, String str, String str2, String str3, Integer num, Throwable th) {
        this.LIZ = c0kfm;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = th;
    }
}
