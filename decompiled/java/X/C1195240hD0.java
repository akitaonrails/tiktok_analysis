package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195240hD0 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C1195240hD0() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1195240hD0)) {
            return false;
        }
        C1195240hD0 c1195240hD0 = (C1195240hD0) obj;
        return Intrinsics.LJFF(this.LIZ, c1195240hD0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1195240hD0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1195240hD0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1195240hD0.LIZLLL) && Intrinsics.LJFF(this.LJ, c1195240hD0.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentMethodDisplayInfo(paymentMethodId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paymentMethodToken=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", brand=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lastDigits=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1195240hD0(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
