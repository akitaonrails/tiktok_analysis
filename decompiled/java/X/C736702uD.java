package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02uD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C736702uD {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<Voucher> LJ;
    public final Boolean LJFF;
    public final Boolean LJI;
    public final Boolean LJII;
    public final Integer LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C736702uD)) {
            return false;
        }
        C736702uD c736702uD = (C736702uD) obj;
        return this.LIZ == c736702uD.LIZ && Intrinsics.LJFF(this.LIZIZ, c736702uD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c736702uD.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c736702uD.LIZLLL) && Intrinsics.LJFF(this.LJ, c736702uD.LJ) && Intrinsics.LJFF(this.LJFF, c736702uD.LJFF) && Intrinsics.LJFF(this.LJI, c736702uD.LJI) && Intrinsics.LJFF(this.LJII, c736702uD.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c736702uD.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Boolean bool = this.LJFF;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LJII;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.LJIIIIZZ;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CouponsInfoVO(style=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", discountPrice=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", discounts=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hideEntrance=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", needDivider=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", hasPromotionEntrance=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", pdpCouponModuleStyle=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C736702uD(int i, String str, String str2, String str3, List<Voucher> list, Boolean bool, Boolean bool2, Boolean bool3, Integer num) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = list;
        this.LJFF = bool;
        this.LJI = bool2;
        this.LJII = bool3;
        this.LJIIIIZZ = num;
    }
}
