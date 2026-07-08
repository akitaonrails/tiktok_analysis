package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04CB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04CB {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04CB)) {
            return false;
        }
        C04CB c04cb = (C04CB) obj;
        return Intrinsics.LJFF(this.LIZ, c04cb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04cb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c04cb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c04cb.LIZLLL) && Intrinsics.LJFF(this.LJ, c04cb.LJ) && Intrinsics.LJFF(this.LJFF, c04cb.LJFF) && Intrinsics.LJFF(this.LJI, c04cb.LJI) && Intrinsics.LJFF(this.LJII, c04cb.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c04cb.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c04cb.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CouponsDaInfo(couponsIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", voucherTypeIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", voucherNames=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", voucherTypes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", typeInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", costRole=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", couponCnt=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", couponLogoType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", instanceKey=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", benefitType=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04CB(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = str10;
    }
}
