package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03xK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1010803xK {
    public final Integer LIZ;
    public final SellerInfo LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Image LJII;
    public final PromotionView LJIIIIZZ;
    public final String LJIIIZ;
    public final List<SaleProp> LJIIJ;
    public final List<SkuItem> LJIIJJI;
    public final List<LogisticDTO> LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final boolean LJIIZILJ;
    public final SnsInfo LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;

    public C1010803xK() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1010803xK)) {
            return false;
        }
        C1010803xK c1010803xK = (C1010803xK) obj;
        return Intrinsics.LJFF(this.LIZ, c1010803xK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1010803xK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1010803xK.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1010803xK.LIZLLL) && Intrinsics.LJFF(this.LJ, c1010803xK.LJ) && Intrinsics.LJFF(this.LJFF, c1010803xK.LJFF) && Intrinsics.LJFF(this.LJI, c1010803xK.LJI) && Intrinsics.LJFF(this.LJII, c1010803xK.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1010803xK.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1010803xK.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1010803xK.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1010803xK.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1010803xK.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1010803xK.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1010803xK.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1010803xK.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1010803xK.LJIILLIIL) && this.LJIIZILJ == c1010803xK.LJIIZILJ && Intrinsics.LJFF(this.LJIJ, c1010803xK.LJIJ) && Intrinsics.LJFF(this.LJIJI, c1010803xK.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c1010803xK.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c1010803xK.LJIJJLI);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        SellerInfo sellerInfo = this.LIZIZ;
        int iHashCode2 = (iHashCode + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Image image = this.LJII;
        int iHashCode8 = (iHashCode7 + (image == null ? 0 : image.hashCode())) * 31;
        PromotionView promotionView = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        String str6 = this.LJIIIZ;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<SaleProp> list = this.LJIIJ;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<SkuItem> list2 = this.LJIIJJI;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LogisticDTO> list3 = this.LJIIL;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str7 = this.LJIILIIL;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIILJJIL;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIILL;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIILLIIL;
        int iHashCode17 = (((iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31;
        SnsInfo snsInfo = this.LJIJ;
        int iHashCode18 = (iHashCode17 + (snsInfo == null ? 0 : snsInfo.hashCode())) * 31;
        String str11 = this.LJIJI;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJIJJ;
        int iHashCode20 = (iHashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LJIJJLI;
        return iHashCode20 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        return "ProductInfoPack(status=" + this.LIZ + ", sellerInfo=" + this.LIZIZ + ", activityInfoLogExtra=" + this.LIZJ + ", originPrice=" + this.LIZLLL + ", realPrice=" + this.LJ + ", discount=" + this.LJFF + ", productTitle=" + this.LJI + ", productImage=" + this.LJII + ", promotionView=" + this.LJIIIIZZ + ", flashStatus=" + this.LJIIIZ + ", saleProps=" + this.LJIIJ + ", skus=" + this.LJIIJJI + ", logistics=" + this.LJIIL + ", productId=" + this.LJIILIIL + ", sellerId=" + this.LJIILJJIL + ", buyNowSchema=" + this.LJIILL + ", flashSaleActivityId=" + this.LJIILLIIL + ", isPlatform=" + this.LJIIZILJ + ", snsInfo=" + this.LJIJ + ", billInfoParams=" + this.LJIJI + ", defaultAddressId=" + this.LJIJJ + ", isMixProduct=" + this.LJIJJLI + ')';
    }

    public C1010803xK(Integer num, SellerInfo sellerInfo, String str, String str2, String str3, String str4, String str5, Image image, PromotionView promotionView, List list, List list2, List list3, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.LIZ = num;
        this.LIZIZ = sellerInfo;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = image;
        this.LJIIIIZZ = promotionView;
        this.LJIIIZ = null;
        this.LJIIJ = list;
        this.LJIIJJI = list2;
        this.LJIIL = list3;
        this.LJIILIIL = str6;
        this.LJIILJJIL = str7;
        this.LJIILL = str8;
        this.LJIILLIIL = str9;
        this.LJIIZILJ = z;
        this.LJIJ = null;
        this.LJIJI = str10;
        this.LJIJJ = null;
        this.LJIJJLI = null;
    }
}
