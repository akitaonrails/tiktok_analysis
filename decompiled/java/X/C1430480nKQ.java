package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430480nKQ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1430480nKQ)) {
            return false;
        }
        C1430480nKQ c1430480nKQ = (C1430480nKQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1430480nKQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1430480nKQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1430480nKQ.LIZJ) && this.LIZLLL == c1430480nKQ.LIZLLL;
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
        sbLIZ.append("CommerceTransDataDiffReport(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oriId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", finalId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shouldShowWarning=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1430480nKQ(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
