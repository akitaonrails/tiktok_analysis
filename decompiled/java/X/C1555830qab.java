package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555830qab {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public C1555830qab() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555830qab)) {
            return false;
        }
        C1555830qab c1555830qab = (C1555830qab) obj;
        return Intrinsics.LJFF(this.LIZ, c1555830qab.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1555830qab.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1555830qab.LIZJ) && this.LIZLLL == c1555830qab.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoExternalPaymentElement(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paramName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paramValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isEncrypted=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555830qab(String str, String str2, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = false;
    }
}
