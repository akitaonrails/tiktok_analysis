package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ComboSubSkuExpression;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSKUSaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ProductSafetyModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopPromotionActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RangePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719102rN extends AbstractC756202xM {
    public final String LLILZLL;
    public final int LLIZ;
    public final Image LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final C7735030j LLJILJIL;
    public final String LLJILJILJ;
    public final PickTag LLJILLL;
    public final List<PromotionLogo> LLJJ;
    public final PurchaseNotice LLJJI;
    public final UserRight LLJJIII;
    public final Integer LLJJIJI;
    public final Integer LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final PromotionView LLJJJ;
    public final SkuCardStyleInfo LLJJJIL;
    public final Boolean LLJJJJ;
    public final Boolean LLJJJJJIL;
    public final Integer LLJJJJLIIL;
    public final Float LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final List<PackedSKUSaleProp> LLJL;
    public final Integer LLJLIL;
    public final Boolean LLJLILLLLZIIL;
    public final Integer LLJLL;
    public final String LLJLLIL;
    public final PlatformLinkInfo LLJLLL;
    public final String LLJZ;
    public final String LLJZIJLIL;
    public final Map<String, String> LLL;
    public final QuantityControlInfo LLLF;
    public final String LLLFF;
    public final Integer LLLFFI;
    public final List<Icon> LLLFZ;
    public final String LLLI;
    public final Integer LLLII;
    public final InsuranceModule LLLIIII;
    public final String LLLIIIIL;
    public final ProductSafetyModule LLLIIIL;
    public final List<Integer> LLLIIL;
    public final List<AddonProductPromotionInfo> LLLIILIL;
    public final ComboSubSkuExpression LLLIL;
    public final SnsInfo LLLILZ;
    public final SnsDisplayInfo LLLILZJ;
    public SkuCardExtendInfo LLLILZLLLI;
    public int LLLIZZ;
    public String LLLJ;
    public String LLLJIL;
    public Integer LLLJL;
    public Integer LLLL;
    public Integer LLLLII;
    public Integer LLLLIIIILLL;
    public Boolean LLLLIIL;
    public OrderShopDigest LLLLIILL;
    public CreateOrderSku LLLLIILLL;
    public String LLLLIL;
    public String LLLLILI;
    public String LLLLJ;
    public String LLLLJI;
    public String LLLLL;
    public String LLLLLIL;
    public String LLLLLILLIL;
    public SkuPrice LLLLLJIL;
    public List<C798803Ac> LLLLLJLJLL;
    public HashMap<String, C719102rN> LLLLLL;
    public BcmStandardTrack LLLLLLIL;
    public ShopPromotionActivity LLLLLLJ;
    public List<PromotionSellingPoint> LLLLLLL;
    public String LLLLLLLLL;
    public Integer LLLLLLLLLL;
    public Integer LLLLLLLZIL;
    public RangePrice LLLLLLZ;
    public SinglePriceItem LLLLLLZZ;
    public PromotionLabelVO LLLLLZ;
    public Integer LLLLLZIL;
    public Integer LLLLLZL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719102rN)) {
            return false;
        }
        C719102rN c719102rN = (C719102rN) obj;
        return Intrinsics.LJFF(this.LLILZLL, c719102rN.LLILZLL) && this.LLIZ == c719102rN.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c719102rN.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c719102rN.LLJ) && Intrinsics.LJFF(this.LLJI, c719102rN.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c719102rN.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c719102rN.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c719102rN.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c719102rN.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c719102rN.LLJJ) && Intrinsics.LJFF(this.LLJJI, c719102rN.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c719102rN.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c719102rN.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c719102rN.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c719102rN.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c719102rN.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c719102rN.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c719102rN.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c719102rN.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c719102rN.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c719102rN.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c719102rN.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c719102rN.LLJL) && Intrinsics.LJFF(this.LLJLIL, c719102rN.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c719102rN.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c719102rN.LLJLL) && Intrinsics.LJFF(this.LLJLLIL, c719102rN.LLJLLIL) && Intrinsics.LJFF(this.LLJLLL, c719102rN.LLJLLL) && Intrinsics.LJFF(this.LLJZ, c719102rN.LLJZ) && Intrinsics.LJFF(this.LLJZIJLIL, c719102rN.LLJZIJLIL) && Intrinsics.LJFF(this.LLL, c719102rN.LLL) && Intrinsics.LJFF(this.LLLF, c719102rN.LLLF) && Intrinsics.LJFF(this.LLLFF, c719102rN.LLLFF) && Intrinsics.LJFF(this.LLLFFI, c719102rN.LLLFFI) && Intrinsics.LJFF(this.LLLFZ, c719102rN.LLLFZ) && Intrinsics.LJFF(this.LLLI, c719102rN.LLLI) && Intrinsics.LJFF(this.LLLII, c719102rN.LLLII) && Intrinsics.LJFF(this.LLLIIII, c719102rN.LLLIIII) && Intrinsics.LJFF(this.LLLIIIIL, c719102rN.LLLIIIIL) && Intrinsics.LJFF(this.LLLIIIL, c719102rN.LLLIIIL) && Intrinsics.LJFF(this.LLLIIL, c719102rN.LLLIIL) && Intrinsics.LJFF(this.LLLIILIL, c719102rN.LLLIILIL) && Intrinsics.LJFF(this.LLLIL, c719102rN.LLLIL) && Intrinsics.LJFF(this.LLLILZ, c719102rN.LLLILZ) && Intrinsics.LJFF(this.LLLILZJ, c719102rN.LLLILZJ) && Intrinsics.LJFF(this.LLLILZLLLI, c719102rN.LLLILZLLLI);
    }

    public final int hashCode() {
        String str = this.LLILZLL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LLIZ) * 31;
        Image image = this.LLIZLLLIL;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.LLJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJI;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJIJIL;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLJILJIL.hashCode()) * 31;
        String str5 = this.LLJILJILJ;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PickTag pickTag = this.LLJILLL;
        int iHashCode7 = (iHashCode6 + (pickTag == null ? 0 : pickTag.hashCode())) * 31;
        List<PromotionLogo> list = this.LLJJ;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        PurchaseNotice purchaseNotice = this.LLJJI;
        int iHashCode9 = (iHashCode8 + (purchaseNotice == null ? 0 : purchaseNotice.hashCode())) * 31;
        UserRight userRight = this.LLJJIII;
        int iHashCode10 = (iHashCode9 + (userRight == null ? 0 : userRight.hashCode())) * 31;
        Integer num = this.LLJJIJI;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJJIJIIJIL;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.LLJJIJIL;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PromotionView promotionView = this.LLJJJ;
        int iHashCode14 = (iHashCode13 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        SkuCardStyleInfo skuCardStyleInfo = this.LLJJJIL;
        int iHashCode15 = (iHashCode14 + (skuCardStyleInfo == null ? 0 : skuCardStyleInfo.hashCode())) * 31;
        Boolean bool = this.LLJJJJ;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLJJJJJIL;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.LLJJJJLIIL;
        int iHashCode18 = (iHashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.LLJJL;
        int iHashCode19 = (iHashCode18 + (f == null ? 0 : f.hashCode())) * 31;
        String str7 = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode20 = (iHashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<PackedSKUSaleProp> list2 = this.LLJL;
        int iHashCode21 = (iHashCode20 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num4 = this.LLJLIL;
        int iHashCode22 = (iHashCode21 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool3 = this.LLJLILLLLZIIL;
        int iHashCode23 = (iHashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num5 = this.LLJLL;
        int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.LLJLLIL;
        int iHashCode25 = (iHashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
        PlatformLinkInfo platformLinkInfo = this.LLJLLL;
        int iHashCode26 = (iHashCode25 + (platformLinkInfo == null ? 0 : platformLinkInfo.hashCode())) * 31;
        String str9 = this.LLJZ;
        int iHashCode27 = (iHashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LLJZIJLIL;
        int iHashCode28 = (iHashCode27 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Map<String, String> map = this.LLL;
        int iHashCode29 = (iHashCode28 + (map == null ? 0 : map.hashCode())) * 31;
        QuantityControlInfo quantityControlInfo = this.LLLF;
        int iHashCode30 = (iHashCode29 + (quantityControlInfo == null ? 0 : quantityControlInfo.hashCode())) * 31;
        String str11 = this.LLLFF;
        int iHashCode31 = (iHashCode30 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num6 = this.LLLFFI;
        int iHashCode32 = (iHashCode31 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<Icon> list3 = this.LLLFZ;
        int iHashCode33 = (iHashCode32 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str12 = this.LLLI;
        int iHashCode34 = (iHashCode33 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num7 = this.LLLII;
        int iHashCode35 = (iHashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
        InsuranceModule insuranceModule = this.LLLIIII;
        int iHashCode36 = (iHashCode35 + (insuranceModule == null ? 0 : insuranceModule.hashCode())) * 31;
        String str13 = this.LLLIIIIL;
        int iHashCode37 = (iHashCode36 + (str13 == null ? 0 : str13.hashCode())) * 31;
        ProductSafetyModule productSafetyModule = this.LLLIIIL;
        int iHashCode38 = (iHashCode37 + (productSafetyModule == null ? 0 : productSafetyModule.hashCode())) * 31;
        List<Integer> list4 = this.LLLIIL;
        int iHashCode39 = (iHashCode38 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AddonProductPromotionInfo> list5 = this.LLLIILIL;
        int iHashCode40 = (iHashCode39 + (list5 == null ? 0 : list5.hashCode())) * 31;
        ComboSubSkuExpression comboSubSkuExpression = this.LLLIL;
        int iHashCode41 = (iHashCode40 + (comboSubSkuExpression == null ? 0 : comboSubSkuExpression.hashCode())) * 31;
        SnsInfo snsInfo = this.LLLILZ;
        int iHashCode42 = (iHashCode41 + (snsInfo == null ? 0 : snsInfo.hashCode())) * 31;
        SnsDisplayInfo snsDisplayInfo = this.LLLILZJ;
        int iHashCode43 = (iHashCode42 + (snsDisplayInfo == null ? 0 : snsDisplayInfo.hashCode())) * 31;
        SkuCardExtendInfo skuCardExtendInfo = this.LLLILZLLLI;
        return iHashCode43 + (skuCardExtendInfo != null ? skuCardExtendInfo.hashCode() : 0);
    }

    public final String toString() {
        return "SkuInfoVO(skuId=" + this.LLILZLL + ", quantity=" + this.LLIZ + ", productImg=" + this.LLIZLLLIL + ", productTitle=" + this.LLJ + ", productSpec=" + this.LLJI + ", price=" + this.LLJIJIL + ", quantityLimit=" + this.LLJILJIL + ", lowStockWarning=" + this.LLJILJILJ + ", activityInfo=" + this.LLJILLL + ", promotionLogos=" + this.LLJJ + ", purchaseNotice=" + this.LLJJI + ", userRight=" + this.LLJJIII + ", minBuyQuantity=" + this.LLJJIJI + ", promotionLimitQuantity=" + this.LLJJIJIIJIL + ", sellerId=" + this.LLJJIJIL + ", promotionView=" + this.LLJJJ + ", skuCardStyleInfo=" + this.LLJJJIL + ", isUseSkeleton=" + this.LLJJJJ + ", isSingleSku=" + this.LLJJJJJIL + ", displayType=" + this.LLJJJJLIIL + ", productRating=" + this.LLJJL + ", salesVolume=" + this.LLJJLIIIJLLLLLLLZ + ", packedSKUSaleProps=" + this.LLJL + ", bizType=" + this.LLJLIL + ", isAddonFreeShipping=" + this.LLJLILLLLZIIL + ", purchaseLimitType=" + this.LLJLL + ", purchaseLimitToast=" + this.LLJLLIL + ", platformLinkInfo=" + this.LLJLLL + ", uniqueKey=" + this.LLJZ + ", discount=" + this.LLJZIJLIL + ", extra=" + this.LLL + ", quantityControlInfo=" + this.LLLF + ", giftFrom=" + this.LLLFF + ", authorId=" + this.LLLFFI + ", complianceLabels=" + this.LLLFZ + ", unitPriceDesc=" + this.LLLI + ", stock=" + this.LLLII + ", insuranceModule=" + this.LLLIIII + ", pFandPriceDesc=" + this.LLLIIIIL + ", safetyModule=" + this.LLLIIIL + ", productSaleModes=" + this.LLLIIL + ", promotionInfoList=" + this.LLLIILIL + ", comboSubSkuExpression=" + this.LLLIL + ", snsInfo=" + this.LLLILZ + ", snsDisplayInfo=" + this.LLLILZJ + ", skuCardExtInfo=" + this.LLLILZLLLI + ')';
    }

    public final boolean LIZLLL() {
        Integer num;
        Integer num2;
        Integer num3;
        SkuCardStyleInfo skuCardStyleInfo = this.LLJJJIL;
        if (skuCardStyleInfo != null && (num3 = skuCardStyleInfo.skuCardStyleType) != null && num3.intValue() == 1) {
            return true;
        }
        SkuCardStyleInfo skuCardStyleInfo2 = this.LLJJJIL;
        if (skuCardStyleInfo2 != null && (num2 = skuCardStyleInfo2.skuCardStyleType) != null && num2.intValue() == 3) {
            return true;
        }
        SkuCardStyleInfo skuCardStyleInfo3 = this.LLJJJIL;
        return (skuCardStyleInfo3 == null || (num = skuCardStyleInfo3.skuCardStyleType) == null || num.intValue() != 4) ? false : true;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        String str;
        OSPPageModuleConfig oSPPageModuleConfig = this.LLILLL;
        return (oSPPageModuleConfig == null || (str = oSPPageModuleConfig.name) == null) ? "quantity" : str;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sku_info_item_");
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C719102rN) {
            return Intrinsics.LJFF(this.LLILZLL, ((C719102rN) interfaceC1891350zJl).LLILZLL);
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }

    public static C719102rN LIZIZ(C719102rN c719102rN, int i, Boolean bool, int i2) {
        String str;
        Image image;
        String str2;
        String str3;
        String str4;
        C7735030j c7735030j;
        String str5;
        PickTag pickTag;
        List<PromotionLogo> list;
        PurchaseNotice purchaseNotice;
        UserRight userRight;
        Integer num;
        Integer num2;
        String str6;
        PromotionView promotionView;
        SkuCardStyleInfo skuCardStyleInfo;
        Boolean bool2;
        Integer num3;
        Float f;
        String str7;
        List<PackedSKUSaleProp> list2;
        Integer num4;
        Boolean bool3;
        Integer num5;
        String str8;
        PlatformLinkInfo platformLinkInfo;
        String str9;
        String str10;
        Map<String, String> map;
        Boolean bool4 = bool;
        int i3 = i;
        QuantityControlInfo quantityControlInfo = null;
        if ((i2 & 1) != 0) {
            str = c719102rN.LLILZLL;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i3 = c719102rN.LLIZ;
        }
        if ((i2 & 4) != 0) {
            image = c719102rN.LLIZLLLIL;
        } else {
            image = null;
        }
        if ((i2 & 8) != 0) {
            str2 = c719102rN.LLJ;
        } else {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = c719102rN.LLJI;
        } else {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = c719102rN.LLJIJIL;
        } else {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            c7735030j = c719102rN.LLJILJIL;
        } else {
            c7735030j = null;
        }
        if ((i2 & 128) != 0) {
            str5 = c719102rN.LLJILJILJ;
        } else {
            str5 = null;
        }
        if ((i2 & 256) != 0) {
            pickTag = c719102rN.LLJILLL;
        } else {
            pickTag = null;
        }
        if ((i2 & 512) != 0) {
            list = c719102rN.LLJJ;
        } else {
            list = null;
        }
        if ((i2 & 1024) != 0) {
            purchaseNotice = c719102rN.LLJJI;
        } else {
            purchaseNotice = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            userRight = c719102rN.LLJJIII;
        } else {
            userRight = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num = c719102rN.LLJJIJI;
        } else {
            num = null;
        }
        if ((i2 & 8192) != 0) {
            num2 = c719102rN.LLJJIJIIJIL;
        } else {
            num2 = null;
        }
        if ((i2 & 16384) != 0) {
            str6 = c719102rN.LLJJIJIL;
        } else {
            str6 = null;
        }
        if ((32768 & i2) != 0) {
            promotionView = c719102rN.LLJJJ;
        } else {
            promotionView = null;
        }
        if ((65536 & i2) != 0) {
            skuCardStyleInfo = c719102rN.LLJJJIL;
        } else {
            skuCardStyleInfo = null;
        }
        if ((131072 & i2) != 0) {
            bool4 = c719102rN.LLJJJJ;
        }
        if ((262144 & i2) != 0) {
            bool2 = c719102rN.LLJJJJJIL;
        } else {
            bool2 = null;
        }
        if ((524288 & i2) != 0) {
            num3 = c719102rN.LLJJJJLIIL;
        } else {
            num3 = null;
        }
        if ((1048576 & i2) != 0) {
            f = c719102rN.LLJJL;
        } else {
            f = null;
        }
        if ((2097152 & i2) != 0) {
            str7 = c719102rN.LLJJLIIIJLLLLLLLZ;
        } else {
            str7 = null;
        }
        if ((4194304 & i2) != 0) {
            list2 = c719102rN.LLJL;
        } else {
            list2 = null;
        }
        if ((8388608 & i2) != 0) {
            num4 = c719102rN.LLJLIL;
        } else {
            num4 = null;
        }
        if ((16777216 & i2) != 0) {
            bool3 = c719102rN.LLJLILLLLZIIL;
        } else {
            bool3 = null;
        }
        if ((33554432 & i2) != 0) {
            num5 = c719102rN.LLJLL;
        } else {
            num5 = null;
        }
        if ((67108864 & i2) != 0) {
            str8 = c719102rN.LLJLLIL;
        } else {
            str8 = null;
        }
        if ((134217728 & i2) != 0) {
            platformLinkInfo = c719102rN.LLJLLL;
        } else {
            platformLinkInfo = null;
        }
        if ((268435456 & i2) != 0) {
            str9 = c719102rN.LLJZ;
        } else {
            str9 = null;
        }
        if ((536870912 & i2) != 0) {
            str10 = c719102rN.LLJZIJLIL;
        } else {
            str10 = null;
        }
        if ((1073741824 & i2) != 0) {
            map = c719102rN.LLL;
        } else {
            map = null;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            quantityControlInfo = c719102rN.LLLF;
        }
        String str11 = c719102rN.LLLFF;
        Integer num6 = c719102rN.LLLFFI;
        List<Icon> list3 = c719102rN.LLLFZ;
        String str12 = c719102rN.LLLI;
        Integer num7 = c719102rN.LLLII;
        InsuranceModule insuranceModule = c719102rN.LLLIIII;
        String str13 = c719102rN.LLLIIIIL;
        ProductSafetyModule productSafetyModule = c719102rN.LLLIIIL;
        List<Integer> list4 = c719102rN.LLLIIL;
        List<AddonProductPromotionInfo> list5 = c719102rN.LLLIILIL;
        ComboSubSkuExpression comboSubSkuExpression = c719102rN.LLLIL;
        SnsInfo snsInfo = c719102rN.LLLILZ;
        SnsDisplayInfo snsDisplayInfo = c719102rN.LLLILZJ;
        SkuCardExtendInfo skuCardExtendInfo = c719102rN.LLLILZLLLI;
        c719102rN.getClass();
        return new C719102rN(str, i3, image, str2, str3, str4, c7735030j, str5, pickTag, list, purchaseNotice, userRight, num, num2, str6, promotionView, skuCardStyleInfo, bool4, bool2, num3, f, str7, list2, num4, bool3, num5, str8, platformLinkInfo, str9, str10, map, quantityControlInfo, str11, num6, list3, str12, num7, insuranceModule, str13, productSafetyModule, list4, list5, comboSubSkuExpression, snsInfo, snsDisplayInfo, skuCardExtendInfo);
    }

    public C719102rN(String str, int i, Image image, String str2, String str3, String str4, C7735030j c7735030j, String str5, PickTag pickTag, List<PromotionLogo> list, PurchaseNotice purchaseNotice, UserRight userRight, Integer num, Integer num2, String str6, PromotionView promotionView, SkuCardStyleInfo skuCardStyleInfo, Boolean bool, Boolean bool2, Integer num3, Float f, String str7, List<PackedSKUSaleProp> list2, Integer num4, Boolean bool3, Integer num5, String str8, PlatformLinkInfo platformLinkInfo, String str9, String str10, Map<String, String> map, QuantityControlInfo quantityControlInfo, String str11, Integer num6, List<Icon> list3, String str12, Integer num7, InsuranceModule insuranceModule, String str13, ProductSafetyModule productSafetyModule, List<Integer> list4, List<AddonProductPromotionInfo> list5, ComboSubSkuExpression comboSubSkuExpression, SnsInfo snsInfo, SnsDisplayInfo snsDisplayInfo, SkuCardExtendInfo skuCardExtendInfo) {
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = image;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = str4;
        this.LLJILJIL = c7735030j;
        this.LLJILJILJ = str5;
        this.LLJILLL = pickTag;
        this.LLJJ = list;
        this.LLJJI = purchaseNotice;
        this.LLJJIII = userRight;
        this.LLJJIJI = num;
        this.LLJJIJIIJIL = num2;
        this.LLJJIJIL = str6;
        this.LLJJJ = promotionView;
        this.LLJJJIL = skuCardStyleInfo;
        this.LLJJJJ = bool;
        this.LLJJJJJIL = bool2;
        this.LLJJJJLIIL = num3;
        this.LLJJL = f;
        this.LLJJLIIIJLLLLLLLZ = str7;
        this.LLJL = list2;
        this.LLJLIL = num4;
        this.LLJLILLLLZIIL = bool3;
        this.LLJLL = num5;
        this.LLJLLIL = str8;
        this.LLJLLL = platformLinkInfo;
        this.LLJZ = str9;
        this.LLJZIJLIL = str10;
        this.LLL = map;
        this.LLLF = quantityControlInfo;
        this.LLLFF = str11;
        this.LLLFFI = num6;
        this.LLLFZ = list3;
        this.LLLI = str12;
        this.LLLII = num7;
        this.LLLIIII = insuranceModule;
        this.LLLIIIIL = str13;
        this.LLLIIIL = productSafetyModule;
        this.LLLIIL = list4;
        this.LLLIILIL = list5;
        this.LLLIL = comboSubSkuExpression;
        this.LLLILZ = snsInfo;
        this.LLLILZJ = snsDisplayInfo;
        this.LLLILZLLLI = skuCardExtendInfo;
        this.LLLJL = 0;
        this.LLLL = 0;
        this.LLLLII = 0;
        this.LLLLIIIILLL = 0;
        this.LLLLIIL = Boolean.FALSE;
    }

    public /* synthetic */ C719102rN(String str, int i, Image image, String str2, String str3, String str4, C7735030j c7735030j, String str5, PickTag pickTag, List list, PurchaseNotice purchaseNotice, UserRight userRight, Integer num, Integer num2, String str6, PromotionView promotionView, SkuCardStyleInfo skuCardStyleInfo, Boolean bool, Boolean bool2, Integer num3, Float f, String str7, List list2, Integer num4, Boolean bool3, Integer num5, String str8, PlatformLinkInfo platformLinkInfo, String str9, String str10, Map map, QuantityControlInfo quantityControlInfo, String str11, Integer num6, List list3, String str12, Integer num7, InsuranceModule insuranceModule, String str13, ProductSafetyModule productSafetyModule, List list4, List list5, ComboSubSkuExpression comboSubSkuExpression, SnsInfo snsInfo, SnsDisplayInfo snsDisplayInfo, SkuCardExtendInfo skuCardExtendInfo, int i2, int i3) {
        this(str, (i2 & 2) != 0 ? 1 : i, image, str2, str3, str4, c7735030j, str5, pickTag, list, purchaseNotice, userRight, num, num2, str6, promotionView, (i2 & 65536) != 0 ? null : skuCardStyleInfo, (i2 & 131072) != 0 ? null : bool, (i2 & 262144) != 0 ? null : bool2, (i2 & 524288) != 0 ? null : num3, (i2 & 1048576) != 0 ? null : f, (i2 & 2097152) != 0 ? null : str7, (i2 & 4194304) != 0 ? null : list2, (i2 & 8388608) != 0 ? null : num4, (i2 & 16777216) != 0 ? null : bool3, (i2 & 33554432) != 0 ? null : num5, (i2 & 67108864) != 0 ? null : str8, (i2 & 134217728) != 0 ? null : platformLinkInfo, (i2 & 268435456) != 0 ? null : str9, str10, map, (i2 & Integer.MIN_VALUE) != 0 ? null : quantityControlInfo, (i3 & 1) != 0 ? null : str11, (i3 & 2) != 0 ? null : num6, (i3 & 4) != 0 ? null : list3, (i3 & 8) != 0 ? null : str12, (i3 & 16) != 0 ? null : num7, (i3 & 32) != 0 ? null : insuranceModule, (i3 & 64) != 0 ? null : str13, (i3 & 128) != 0 ? null : productSafetyModule, (i3 & 256) != 0 ? null : list4, (i3 & 512) != 0 ? null : list5, (i3 & 1024) != 0 ? null : comboSubSkuExpression, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : snsInfo, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : snsDisplayInfo, (i3 & 8192) == 0 ? skuCardExtendInfo : null);
    }
}
