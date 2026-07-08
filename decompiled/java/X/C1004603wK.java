package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03wK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1004603wK {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;
    public final List<PromotionLabel> LJFF;
    public final Boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1004603wK)) {
            return false;
        }
        C1004603wK c1004603wK = (C1004603wK) obj;
        return Intrinsics.LJFF(this.LIZ, c1004603wK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1004603wK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1004603wK.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1004603wK.LIZLLL) && Intrinsics.LJFF(this.LJ, c1004603wK.LJ) && Intrinsics.LJFF(this.LJFF, c1004603wK.LJFF) && Intrinsics.LJFF(this.LJI, c1004603wK.LJI) && Intrinsics.LJFF(this.LJII, c1004603wK.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1004603wK.LJIIIIZZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        List<PromotionLabel> list = this.LJFF;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.LJI;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.LJII;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIIIZZ;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaistPriceModel(realPrice=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", realPriceDecimal=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", originPrice=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", needIcon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", discount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", priceLabel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isSelectedSku=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", priceDaInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", pricePrefix=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1004603wK(String str, String str2, String str3, Boolean bool, String str4, List<PromotionLabel> list, Boolean bool2, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = bool;
        this.LJ = str4;
        this.LJFF = list;
        this.LJI = bool2;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
    }
}
