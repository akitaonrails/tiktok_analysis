package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nKU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430520nKU {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1430520nKU)) {
            return false;
        }
        C1430520nKU c1430520nKU = (C1430520nKU) obj;
        return Intrinsics.LJFF(this.LIZ, c1430520nKU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1430520nKU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1430520nKU.LIZJ) && this.LIZLLL == c1430520nKU.LIZLLL;
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
        sbLIZ.append("HashtagDataDiffReport(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", names=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shouldShowWarning=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1430520nKU(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
