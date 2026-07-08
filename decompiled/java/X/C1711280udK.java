package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0udK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711280udK {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1711280udK)) {
            return false;
        }
        C1711280udK c1711280udK = (C1711280udK) obj;
        return Intrinsics.LJFF(this.LIZ, c1711280udK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1711280udK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1711280udK.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefundSelectionResult(refundInfoString=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", refundMethods=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionSchema=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1711280udK(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
