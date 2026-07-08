package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s8Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615330s8Z {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final Boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1615330s8Z)) {
            return false;
        }
        C1615330s8Z c1615330s8Z = (C1615330s8Z) obj;
        return this.LIZ == c1615330s8Z.LIZ && Intrinsics.LJFF(this.LIZIZ, c1615330s8Z.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1615330s8Z.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1615330s8Z.LIZLLL) && Intrinsics.LJFF(this.LJ, c1615330s8Z.LJ) && Intrinsics.LJFF(this.LJFF, c1615330s8Z.LJFF) && Intrinsics.LJFF(this.LJI, c1615330s8Z.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJFF;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJI;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapProductSpec(optionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iapId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", discountIapId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", basePlanId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", offerId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cycleType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isAutoRenew=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1615330s8Z(int i, String str, String str2, String str3, String str4, Integer num, Boolean bool) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = num;
        this.LJI = bool;
    }
}
