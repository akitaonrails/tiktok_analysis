package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00A4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A4 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00A4)) {
            return false;
        }
        C00A4 c00a4 = (C00A4) obj;
        return Intrinsics.LJFF(this.LIZ, c00a4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00a4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00a4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00a4.LIZLLL) && this.LJ == c00a4.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShownClusterRecord(clusterId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategyName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", themeName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeBucket=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shownAt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00A4(String str, String str2, String str3, String str4, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = j;
    }
}
