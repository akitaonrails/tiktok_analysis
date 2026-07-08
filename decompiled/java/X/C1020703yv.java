package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1020703yv {
    public final String LIZ;
    public final C1004603wK LIZIZ;
    public final PromotionWaist LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020703yv)) {
            return false;
        }
        C1020703yv c1020703yv = (C1020703yv) obj;
        return Intrinsics.LJFF(this.LIZ, c1020703yv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1020703yv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1020703yv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1020703yv.LIZLLL) && Intrinsics.LJFF(this.LJ, c1020703yv.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C1004603wK c1004603wK = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1004603wK == null ? 0 : c1004603wK.hashCode())) * 31;
        PromotionWaist promotionWaist = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (promotionWaist == null ? 0 : promotionWaist.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LJ;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaWaistInfoVO(productId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", priceModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", promotionWaist=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pricePanelSchema=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showHotZone=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1020703yv(String str, C1004603wK c1004603wK, PromotionWaist promotionWaist, String str2, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = c1004603wK;
        this.LIZJ = promotionWaist;
        this.LIZLLL = str2;
        this.LJ = bool;
    }
}
