package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopPromotionActivity;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719202rO extends AbstractC756202xM {
    public final String LLILZLL;
    public final Image LLIZ;
    public final String LLIZLLLIL;
    public final Boolean LLJ;
    public final String LLJI;
    public final List<C723002s0> LLJIJIL;
    public final ShopBill LLJILJIL;
    public final String LLJILJILJ;
    public final ShopPromotionActivity LLJILLL;
    public final String LLJJ;
    public final StoreOfficialLabel LLJJI;
    public final boolean LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final ShopOrderStarling LLJJJIL;
    public final Boolean LLJJJJ;
    public final Boolean LLJJJJJIL;
    public final MainOrderSetting LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public List<C719102rN> LLJL;
    public boolean LLJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719202rO)) {
            return false;
        }
        C719202rO c719202rO = (C719202rO) obj;
        return Intrinsics.LJFF(this.LLILZLL, c719202rO.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c719202rO.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c719202rO.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c719202rO.LLJ) && Intrinsics.LJFF(this.LLJI, c719202rO.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c719202rO.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c719202rO.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c719202rO.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c719202rO.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c719202rO.LLJJ) && Intrinsics.LJFF(this.LLJJI, c719202rO.LLJJI) && this.LLJJIII == c719202rO.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c719202rO.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c719202rO.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c719202rO.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c719202rO.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c719202rO.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c719202rO.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c719202rO.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c719202rO.LLJJJJLIIL);
    }

    public final int hashCode() {
        String str = this.LLILZLL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.LLIZ;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LLJ;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.LLJI;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLJIJIL.hashCode()) * 31;
        ShopBill shopBill = this.LLJILJIL;
        int iHashCode6 = (iHashCode5 + (shopBill == null ? 0 : shopBill.hashCode())) * 31;
        String str4 = this.LLJILJILJ;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ShopPromotionActivity shopPromotionActivity = this.LLJILLL;
        int iHashCode8 = (iHashCode7 + (shopPromotionActivity == null ? 0 : shopPromotionActivity.hashCode())) * 31;
        String str5 = this.LLJJ;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StoreOfficialLabel storeOfficialLabel = this.LLJJI;
        int iHashCode10 = (((iHashCode9 + (storeOfficialLabel == null ? 0 : storeOfficialLabel.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31;
        String str6 = this.LLJJIJI;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJJIJIIJIL;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJJIJIL;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJJJ;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        ShopOrderStarling shopOrderStarling = this.LLJJJIL;
        int iHashCode15 = (iHashCode14 + (shopOrderStarling == null ? 0 : shopOrderStarling.hashCode())) * 31;
        Boolean bool2 = this.LLJJJJ;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LLJJJJJIL;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MainOrderSetting mainOrderSetting = this.LLJJJJLIIL;
        return iHashCode17 + (mainOrderSetting != null ? mainOrderSetting.hashCode() : 0);
    }

    public final String toString() {
        return "ShopInfoVO(sellerId=" + this.LLILZLL + ", shopAvatar=" + this.LLIZ + ", shopName=" + this.LLIZLLLIL + ", sellerInfoClickable=" + this.LLJ + ", aboutThisShopSchema=" + this.LLJI + ", mainOrders=" + this.LLJIJIL + ", shopBill=" + this.LLJILJIL + ", sellerCouponCacheKey=" + this.LLJILJILJ + ", promotionActivity=" + this.LLJILLL + ", couponSchema=" + this.LLJJ + ", officialLabel=" + this.LLJJI + ", isHideShop=" + this.LLJJIII + ", title=" + this.LLJJIJI + ", expandAllTitle=" + this.LLJJIJIIJIL + ", sellerText=" + this.LLJJIJIL + ", itemText=" + this.LLJJJ + ", starling=" + this.LLJJJIL + ", isUseSkeleton=" + this.LLJJJJ + ", isPreHandle=" + this.LLJJJJJIL + ", mainOrderSetting=" + this.LLJJJJLIIL + ')';
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        String str;
        OSPPageModuleConfig oSPPageModuleConfig = this.LLILLL;
        return (oSPPageModuleConfig == null || (str = oSPPageModuleConfig.name) == null) ? "shop_orders_new" : str;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shop_orders_new_item_");
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C719202rO) && Intrinsics.LJFF(((C719202rO) interfaceC1891350zJl).LLILZLL, this.LLILZLL)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C719202rO(String str, Image image, String str2, List list, StoreOfficialLabel storeOfficialLabel, Boolean bool, Boolean bool2, int i) {
        this(str, image, str2, null, null, list, null, null, null, null, storeOfficialLabel, false, null, null, null, null, null, (i & 131072) != 0 ? null : bool, (i & 262144) != 0 ? null : bool2, null);
    }

    public static C719202rO LIZIZ(C719202rO c719202rO, String str, Image image, String str2, Boolean bool, String str3, List list, StoreOfficialLabel storeOfficialLabel, Boolean bool2, MainOrderSetting mainOrderSetting, int i) {
        ShopBill shopBill;
        String str4;
        ShopPromotionActivity shopPromotionActivity;
        String str5;
        boolean z;
        String str6;
        String str7;
        String str8;
        String str9;
        ShopOrderStarling shopOrderStarling;
        MainOrderSetting mainOrderSetting2 = mainOrderSetting;
        List list2 = list;
        String str10 = str3;
        StoreOfficialLabel storeOfficialLabel2 = storeOfficialLabel;
        Boolean bool3 = bool;
        String str11 = str2;
        Image image2 = image;
        Boolean bool4 = bool2;
        String str12 = str;
        if ((i & 1) != 0) {
            str12 = c719202rO.LLILZLL;
        }
        if ((i & 2) != 0) {
            image2 = c719202rO.LLIZ;
        }
        if ((i & 4) != 0) {
            str11 = c719202rO.LLIZLLLIL;
        }
        if ((i & 8) != 0) {
            bool3 = c719202rO.LLJ;
        }
        if ((i & 16) != 0) {
            str10 = c719202rO.LLJI;
        }
        if ((i & 32) != 0) {
            list2 = c719202rO.LLJIJIL;
        }
        Boolean bool5 = null;
        if ((i & 64) != 0) {
            shopBill = c719202rO.LLJILJIL;
        } else {
            shopBill = null;
        }
        if ((i & 128) != 0) {
            str4 = c719202rO.LLJILJILJ;
        } else {
            str4 = null;
        }
        if ((i & 256) != 0) {
            shopPromotionActivity = c719202rO.LLJILLL;
        } else {
            shopPromotionActivity = null;
        }
        if ((i & 512) != 0) {
            str5 = c719202rO.LLJJ;
        } else {
            str5 = null;
        }
        if ((i & 1024) != 0) {
            storeOfficialLabel2 = c719202rO.LLJJI;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z = c719202rO.LLJJIII;
        } else {
            z = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str6 = c719202rO.LLJJIJI;
        } else {
            str6 = null;
        }
        if ((i & 8192) != 0) {
            str7 = c719202rO.LLJJIJIIJIL;
        } else {
            str7 = null;
        }
        if ((i & 16384) != 0) {
            str8 = c719202rO.LLJJIJIL;
        } else {
            str8 = null;
        }
        if ((32768 & i) != 0) {
            str9 = c719202rO.LLJJJ;
        } else {
            str9 = null;
        }
        if ((65536 & i) != 0) {
            shopOrderStarling = c719202rO.LLJJJIL;
        } else {
            shopOrderStarling = null;
        }
        if ((131072 & i) != 0) {
            bool4 = c719202rO.LLJJJJ;
        }
        if ((262144 & i) != 0) {
            bool5 = c719202rO.LLJJJJJIL;
        }
        if ((i & 524288) != 0) {
            mainOrderSetting2 = c719202rO.LLJJJJLIIL;
        }
        c719202rO.getClass();
        return new C719202rO(str12, image2, str11, bool3, str10, list2, shopBill, str4, shopPromotionActivity, str5, storeOfficialLabel2, z, str6, str7, str8, str9, shopOrderStarling, bool4, bool5, mainOrderSetting2);
    }

    public C719202rO(String str, Image image, String str2, Boolean bool, String str3, List<C723002s0> list, ShopBill shopBill, String str4, ShopPromotionActivity shopPromotionActivity, String str5, StoreOfficialLabel storeOfficialLabel, boolean z, String str6, String str7, String str8, String str9, ShopOrderStarling shopOrderStarling, Boolean bool2, Boolean bool3, MainOrderSetting mainOrderSetting) {
        this.LLILZLL = str;
        this.LLIZ = image;
        this.LLIZLLLIL = str2;
        this.LLJ = bool;
        this.LLJI = str3;
        this.LLJIJIL = list;
        this.LLJILJIL = shopBill;
        this.LLJILJILJ = str4;
        this.LLJILLL = shopPromotionActivity;
        this.LLJJ = str5;
        this.LLJJI = storeOfficialLabel;
        this.LLJJIII = z;
        this.LLJJIJI = str6;
        this.LLJJIJIIJIL = str7;
        this.LLJJIJIL = str8;
        this.LLJJJ = str9;
        this.LLJJJIL = shopOrderStarling;
        this.LLJJJJ = bool2;
        this.LLJJJJJIL = bool3;
        this.LLJJJJLIIL = mainOrderSetting;
    }
}
