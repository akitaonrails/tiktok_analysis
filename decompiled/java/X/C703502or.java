package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C703502or implements InterfaceC997603vC {
    public final String LL;
    public final Image LLILLJJLI;
    public final String LLILLL;
    public final Long LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final StoreOfficialLabel LLIZLLLIL;
    public final boolean LLJ;
    public final List<SellerDetailInfo> LLJI;
    public final Integer LLJIJIL;
    public final Integer LLJILJIL;
    public final Boolean LLJILJILJ;
    public final String LLJILLL;
    public final SellerSellingPoint LLJJ;
    public final SellerDetailInfo LLJJI;
    public final ShopBenefitInfo LLJJIII;
    public final int LLJJIJI = EnumC1752690vi7.SELLER_INFO.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703502or)) {
            return false;
        }
        C703502or c703502or = (C703502or) obj;
        return Intrinsics.LJFF(this.LL, c703502or.LL) && Intrinsics.LJFF(this.LLILLJJLI, c703502or.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c703502or.LLILLL) && Intrinsics.LJFF(this.LLILZ, c703502or.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c703502or.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c703502or.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c703502or.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c703502or.LLIZLLLIL) && this.LLJ == c703502or.LLJ && Intrinsics.LJFF(this.LLJI, c703502or.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c703502or.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c703502or.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c703502or.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c703502or.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c703502or.LLJJ) && Intrinsics.LJFF(this.LLJJI, c703502or.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c703502or.LLJJIII);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (image == null ? 0 : image.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        Long l = this.LLILZ;
        int iHashCode3 = (((((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        String str2 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StoreOfficialLabel storeOfficialLabel = this.LLIZLLLIL;
        int iHashCode5 = (((iHashCode4 + (storeOfficialLabel == null ? 0 : storeOfficialLabel.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        List<SellerDetailInfo> list = this.LLJI;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.LLJIJIL;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJILJIL;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.LLJILJILJ;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.LLJILLL;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SellerSellingPoint sellerSellingPoint = this.LLJJ;
        int iHashCode11 = (iHashCode10 + (sellerSellingPoint == null ? 0 : sellerSellingPoint.hashCode())) * 31;
        SellerDetailInfo sellerDetailInfo = this.LLJJI;
        int iHashCode12 = (iHashCode11 + (sellerDetailInfo == null ? 0 : sellerDetailInfo.hashCode())) * 31;
        ShopBenefitInfo shopBenefitInfo = this.LLJJIII;
        return iHashCode12 + (shopBenefitInfo != null ? shopBenefitInfo.hashCode() : 0);
    }

    public final String toString() {
        return "ShopProfileVO(seller=" + this.LL + ", shopImage=" + this.LLILLJJLI + ", shopName=" + this.LLILLL + ", shopCount=" + this.LLILZ + ", shopRate=" + this.LLILZIL + ", link=" + this.LLILZLL + ", shopLink=" + this.LLIZ + ", officialLabel=" + this.LLIZLLLIL + ", hasDivider=" + this.LLJ + ", shopDetailInfos=" + this.LLJI + ", ratingPercentile=" + this.LLJIJIL + ", ratingStyle=" + this.LLJILJIL + ", ratingShowNA=" + this.LLJILJILJ + ", sloganText=" + this.LLJILLL + ", sellerSellingPoint=" + this.LLJJ + ", salesInfo=" + this.LLJJI + ", benefitInfo=" + this.LLJJIII + ')';
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLJJIJI;
    }

    public C703502or(String str, Image image, String str2, Long l, String str3, String str4, String str5, StoreOfficialLabel storeOfficialLabel, boolean z, List<SellerDetailInfo> list, Integer num, Integer num2, Boolean bool, String str6, SellerSellingPoint sellerSellingPoint, SellerDetailInfo sellerDetailInfo, ShopBenefitInfo shopBenefitInfo) {
        this.LL = str;
        this.LLILLJJLI = image;
        this.LLILLL = str2;
        this.LLILZ = l;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = storeOfficialLabel;
        this.LLJ = z;
        this.LLJI = list;
        this.LLJIJIL = num;
        this.LLJILJIL = num2;
        this.LLJILJILJ = bool;
        this.LLJILLL = str6;
        this.LLJJ = sellerSellingPoint;
        this.LLJJI = sellerDetailInfo;
        this.LLJJIII = shopBenefitInfo;
    }
}
