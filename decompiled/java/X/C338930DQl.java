package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338930DQl implements InterfaceC319170CfD {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C338930DQl)) {
            return false;
        }
        C338930DQl c338930DQl = (C338930DQl) obj;
        return this.LIZ == c338930DQl.LIZ && Intrinsics.LJFF(this.LIZIZ, c338930DQl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c338930DQl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c338930DQl.LIZLLL) && Intrinsics.LJFF(this.LJ, c338930DQl.LJ) && Intrinsics.LJFF(this.LJFF, c338930DQl.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentAdjusted(remainingDays=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", adjustedPrice=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", normalPrice=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contractExpiryDate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", adjustedPriceEuro=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", normalPriceEuro=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C338930DQl(int i, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
