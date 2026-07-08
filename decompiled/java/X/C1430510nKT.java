package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nKT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430510nKT {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1430510nKT)) {
            return false;
        }
        C1430510nKT c1430510nKT = (C1430510nKT) obj;
        return Intrinsics.LJFF(this.LIZ, c1430510nKT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1430510nKT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1430510nKT.LIZJ) && this.LIZLLL == c1430510nKT.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorDataDiffReport(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shouldShowWarning=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1430510nKT(String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
    }
}
