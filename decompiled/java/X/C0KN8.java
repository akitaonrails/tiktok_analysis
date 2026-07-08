package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KN8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KN8 {
    public final C0KNY LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Throwable LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KN8)) {
            return false;
        }
        C0KN8 c0kn8 = (C0KN8) obj;
        return Intrinsics.LJFF(this.LIZ, c0kn8.LIZ) && this.LIZIZ == c0kn8.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0kn8.LIZJ) && this.LIZLLL == c0kn8.LIZLLL && Intrinsics.LJFF(this.LJ, c0kn8.LJ) && Intrinsics.LJFF(this.LJFF, c0kn8.LJFF) && Intrinsics.LJFF(this.LJI, c0kn8.LJI) && this.LJII == c0kn8.LJII;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.LJI;
        return ((iHashCode2 + (th != null ? th.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryStatusLogData(payload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", orderId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", iapStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", throwable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isQueryEnd=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KN8(C0KNY c0kny, long j, String str, int i, String str2, String str3, Throwable th, boolean z) {
        this.LIZ = c0kny;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = th;
        this.LJII = z;
    }
}
