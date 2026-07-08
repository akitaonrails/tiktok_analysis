package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.detail.amenities.PoiAmenitiesComponentData;
import com.ss.android.ugc.aweme.poi.detail.banner.PoiBannerModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryModule;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule;
import com.ss.android.ugc.aweme.poi.detail.bottomspace.BottomSpaceModule;
import com.ss.android.ugc.aweme.poi.detail.claim.data.PoiDetailClaimResponse;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.background.PoiHeaderImgModule;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.PoiScrollBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.rectangle.PoiRectangleBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.stable.PoiStableBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiDynamicNavBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.normal.PoiNavBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.PoiWorldCupScheduleModule;
import com.ss.android.ugc.aweme.poi.detail.ymal.vertical.PoiDetailYmalModule;
import com.ss.android.ugc.aweme.poi.osp.repo.model.CouponGuildData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.CouponModuleData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DisclaimerInfoData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ExitConfirmModalData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.NavigationBarData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderSummaryData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PaymentInfoData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceSummaryData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuListData;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.desc.PoiRecommendFeatureDetailDescModule;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedModule;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabModule;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar.PoiRecommendFeatureBottomBarModule;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list.PoiRecommendFeatureListModule;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.navbar.PoiRecommendFeatureNavBarModule;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.common.component.transparent.TransparentModule;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel;
import com.ss.android.ugc.aweme.slash.component.lynx.icon.LynxFloatIconModel;
import com.ss.android.ugc.aweme.slash.component.navigation.QuickNavBarModule;
import com.ss.android.ugc.aweme.slash.component.popup.spark.SparkPopupModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208890hZ1 implements InterfaceC1180980gq0 {
    public final int $t;

    public static final int LIZIZ$15(C1208890hZ1 c1208890hZ1) {
        return 50004;
    }

    public static final int LIZIZ$16(C1208890hZ1 c1208890hZ1) {
        return 50003;
    }

    public static final int LIZIZ$37(C1208890hZ1 c1208890hZ1) {
        return 50002;
    }

    public static final int LIZIZ$41(C1208890hZ1 c1208890hZ1) {
        return 50011;
    }

    public static final int LIZIZ$45(C1208890hZ1 c1208890hZ1) {
        return 50012;
    }

    public static final int LIZIZ$46(C1208890hZ1 c1208890hZ1) {
        return 50001;
    }

    public static final BaseComponentData LIZJ$0(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$1(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$10(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$11(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$12(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$13(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$14(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$15(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$16(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$17(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$18(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$19(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$2(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$20(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$21(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$22(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$23(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$24(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$26(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$27(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$28(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$29(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$3(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$30(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$32(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$33(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$34(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$36(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$37(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$38(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$39(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$4(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$40(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$41(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$42(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$43(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$44(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$45(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$46(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$47(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$48(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$49(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$5(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$51(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$52(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$53(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$6(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$7(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$8(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$9(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        return baseComponentData;
    }

    @Override // X.InterfaceC1180980gq0
    public final Class<PoiRecommendFeatureBottomBarModule> LIZ() {
        switch (this.$t) {
            case 0:
                return LIZ$0(this);
            case 1:
                return LIZ$1(this);
            case 2:
                return LIZ$2(this);
            case 3:
                return LIZ$3(this);
            case 4:
                return LIZ$4(this);
            case 5:
                return LIZ$5(this);
            case 6:
                return LIZ$6(this);
            case 7:
                return LIZ$7(this);
            case 8:
                return LIZ$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZ$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZ$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZ$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZ$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LIZ$13(this);
            case 14:
                return LIZ$14(this);
            case 15:
                return LIZ$15(this);
            case 16:
                return LIZ$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LIZ$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return LIZ$18(this);
            case 19:
                return LIZ$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return LIZ$20(this);
            case 21:
                return LIZ$21(this);
            case 22:
                return LIZ$22(this);
            case 23:
                return LIZ$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return LIZ$24(this);
            case 25:
                return LIZ$25(this);
            case 26:
                return LIZ$26(this);
            case 27:
                return LIZ$27(this);
            case 28:
                return LIZ$28(this);
            case 29:
                return LIZ$29(this);
            case 30:
                return LIZ$30(this);
            case 31:
                return LIZ$31(this);
            case 32:
                return LIZ$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return LIZ$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return LIZ$34(this);
            case 35:
                return LIZ$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return LIZ$36(this);
            case 37:
                return LIZ$37(this);
            case 38:
                return LIZ$38(this);
            case 39:
                return LIZ$39(this);
            case 40:
                return LIZ$40(this);
            case 41:
                return LIZ$41(this);
            case 42:
                return LIZ$42(this);
            case 43:
                return LIZ$43(this);
            case 44:
                return LIZ$44(this);
            case 45:
                return LIZ$45(this);
            case 46:
                return LIZ$46(this);
            case 47:
                return LIZ$47(this);
            case 48:
                return LIZ$48(this);
            case 49:
                return LIZ$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return LIZ$50(this);
            case 51:
                return LIZ$51(this);
            case 52:
                return LIZ$52(this);
            case 53:
                return LIZ$53(this);
            default:
                return null;
        }
    }

    @Override // X.InterfaceC1180980gq0
    public final int LIZIZ() {
        switch (this.$t) {
        }
        return C538540LAe.LLJJJIL;
    }

    @Override // X.InterfaceC1180980gq0
    public final BaseComponentData LIZJ(BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        switch (this.$t) {
            case 0:
                return LIZJ$0(this, baseComponentData, baseComponentData2);
            case 1:
                return LIZJ$1(this, baseComponentData, baseComponentData2);
            case 2:
                return LIZJ$2(this, baseComponentData, baseComponentData2);
            case 3:
                return LIZJ$3(this, baseComponentData, baseComponentData2);
            case 4:
                return LIZJ$4(this, baseComponentData, baseComponentData2);
            case 5:
                return LIZJ$5(this, baseComponentData, baseComponentData2);
            case 6:
                return LIZJ$6(this, baseComponentData, baseComponentData2);
            case 7:
                return LIZJ$7(this, baseComponentData, baseComponentData2);
            case 8:
                return LIZJ$8(this, baseComponentData, baseComponentData2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZJ$9(this, baseComponentData, baseComponentData2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZJ$10(this, baseComponentData, baseComponentData2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZJ$11(this, baseComponentData, baseComponentData2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZJ$12(this, baseComponentData, baseComponentData2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LIZJ$13(this, baseComponentData, baseComponentData2);
            case 14:
                return LIZJ$14(this, baseComponentData, baseComponentData2);
            case 15:
                return LIZJ$15(this, baseComponentData, baseComponentData2);
            case 16:
                return LIZJ$16(this, baseComponentData, baseComponentData2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LIZJ$17(this, baseComponentData, baseComponentData2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return LIZJ$18(this, baseComponentData, baseComponentData2);
            case 19:
                return LIZJ$19(this, baseComponentData, baseComponentData2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return LIZJ$20(this, baseComponentData, baseComponentData2);
            case 21:
                return LIZJ$21(this, baseComponentData, baseComponentData2);
            case 22:
                return LIZJ$22(this, baseComponentData, baseComponentData2);
            case 23:
                return LIZJ$23(this, baseComponentData, baseComponentData2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return LIZJ$24(this, baseComponentData, baseComponentData2);
            case 25:
                return LIZJ$25(this, baseComponentData, baseComponentData2);
            case 26:
                return LIZJ$26(this, baseComponentData, baseComponentData2);
            case 27:
                return LIZJ$27(this, baseComponentData, baseComponentData2);
            case 28:
                return LIZJ$28(this, baseComponentData, baseComponentData2);
            case 29:
                return LIZJ$29(this, baseComponentData, baseComponentData2);
            case 30:
                return LIZJ$30(this, baseComponentData, baseComponentData2);
            case 31:
                return LIZJ$31(this, baseComponentData, baseComponentData2);
            case 32:
                return LIZJ$32(this, baseComponentData, baseComponentData2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return LIZJ$33(this, baseComponentData, baseComponentData2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return LIZJ$34(this, baseComponentData, baseComponentData2);
            case 35:
                return LIZJ$35(this, baseComponentData, baseComponentData2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return LIZJ$36(this, baseComponentData, baseComponentData2);
            case 37:
                return LIZJ$37(this, baseComponentData, baseComponentData2);
            case 38:
                return LIZJ$38(this, baseComponentData, baseComponentData2);
            case 39:
                return LIZJ$39(this, baseComponentData, baseComponentData2);
            case 40:
                return LIZJ$40(this, baseComponentData, baseComponentData2);
            case 41:
                return LIZJ$41(this, baseComponentData, baseComponentData2);
            case 42:
                return LIZJ$42(this, baseComponentData, baseComponentData2);
            case 43:
                return LIZJ$43(this, baseComponentData, baseComponentData2);
            case 44:
                return LIZJ$44(this, baseComponentData, baseComponentData2);
            case 45:
                return LIZJ$45(this, baseComponentData, baseComponentData2);
            case 46:
                return LIZJ$46(this, baseComponentData, baseComponentData2);
            case 47:
                return LIZJ$47(this, baseComponentData, baseComponentData2);
            case 48:
                return LIZJ$48(this, baseComponentData, baseComponentData2);
            case 49:
                return LIZJ$49(this, baseComponentData, baseComponentData2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return LIZJ$50(this, baseComponentData, baseComponentData2);
            case 51:
                return LIZJ$51(this, baseComponentData, baseComponentData2);
            case 52:
                return LIZJ$52(this, baseComponentData, baseComponentData2);
            case 53:
                return LIZJ$53(this, baseComponentData, baseComponentData2);
            default:
                return null;
        }
    }

    public C1208890hZ1(int i) {
        this.$t = i;
    }

    public static final Class LIZ$0(C1208890hZ1 c1208890hZ1) {
        return PoiRecommendFeatureBottomBarModule.class;
    }

    public static final Class LIZ$1(C1208890hZ1 c1208890hZ1) {
        return PoiHeaderImgModule.class;
    }

    public static final Class LIZ$10(C1208890hZ1 c1208890hZ1) {
        return DisclaimerInfoData.class;
    }

    public static final Class LIZ$11(C1208890hZ1 c1208890hZ1) {
        return SkuListData.class;
    }

    public static final Class LIZ$12(C1208890hZ1 c1208890hZ1) {
        return PoiRecommendFeatureListModule.class;
    }

    public static final Class LIZ$13(C1208890hZ1 c1208890hZ1) {
        return PoiDiscoveryApi$PoiDiscoveryCardListResponse.class;
    }

    public static final Class LIZ$14(C1208890hZ1 c1208890hZ1) {
        return PoiDiscoveryApi$PoiDiscoveryCardListResponseV2.class;
    }

    public static final Class LIZ$15(C1208890hZ1 c1208890hZ1) {
        return PoiDetailYmalModule.class;
    }

    public static final Class LIZ$16(C1208890hZ1 c1208890hZ1) {
        return PoiDetailYmalModule.class;
    }

    public static final Class LIZ$17(C1208890hZ1 c1208890hZ1) {
        return SlashComposeComponentModel.class;
    }

    public static final Class LIZ$18(C1208890hZ1 c1208890hZ1) {
        return LynxFloatIconModel.class;
    }

    public static final Class LIZ$19(C1208890hZ1 c1208890hZ1) {
        return PoiRecommendFeatureNavBarModule.class;
    }

    public static final Class LIZ$2(C1208890hZ1 c1208890hZ1) {
        return PoiDetailYmalModule.class;
    }

    public static final Class LIZ$20(C1208890hZ1 c1208890hZ1) {
        return PoiHeaderGalleryModule.class;
    }

    public static final Class LIZ$21(C1208890hZ1 c1208890hZ1) {
        return PoiBottomBarModule.class;
    }

    public static final Class LIZ$22(C1208890hZ1 c1208890hZ1) {
        return PoiDiscoveryApi$PoiDiscoveryCardListResponse.class;
    }

    public static final Class LIZ$23(C1208890hZ1 c1208890hZ1) {
        return PoiStableBottomBarModule.class;
    }

    public static final Class LIZ$24(C1208890hZ1 c1208890hZ1) {
        return PoiListApi.PoiMergedListResponse.class;
    }

    public static final Class LIZ$25(C1208890hZ1 c1208890hZ1) {
        return PoiHeaderTopVideosModule.class;
    }

    public static final Class LIZ$26(C1208890hZ1 c1208890hZ1) {
        return PoiScrollBottomBarModule.class;
    }

    public static final Class LIZ$27(C1208890hZ1 c1208890hZ1) {
        return PoiDetailApi.PoiRecommendDishesGroupInfo.class;
    }

    public static final Class LIZ$28(C1208890hZ1 c1208890hZ1) {
        return PoiRectangleBottomBarModule.class;
    }

    public static final Class LIZ$29(C1208890hZ1 c1208890hZ1) {
        return PoiStableBottomBarModule.class;
    }

    public static final Class LIZ$3(C1208890hZ1 c1208890hZ1) {
        return PaymentInfoData.class;
    }

    public static final Class LIZ$30(C1208890hZ1 c1208890hZ1) {
        return PoiDetailApi.PoiGuidesBasicData.class;
    }

    public static final Class LIZ$31(C1208890hZ1 c1208890hZ1) {
        return PoiDetailApi.PoiDetailLynxResponse.class;
    }

    public static final Class LIZ$32(C1208890hZ1 c1208890hZ1) {
        return PoiReviewsApi.PoiReviewListResponse.class;
    }

    public static final Class LIZ$33(C1208890hZ1 c1208890hZ1) {
        return PoiReviewsApi.PoiWriteReviewResponse.class;
    }

    public static final Class LIZ$34(C1208890hZ1 c1208890hZ1) {
        return TransparentModule.class;
    }

    public static final Class LIZ$35(C1208890hZ1 c1208890hZ1) {
        return PoiDynamicNavBarModule.class;
    }

    public static final Class LIZ$36(C1208890hZ1 c1208890hZ1) {
        return BottomSpaceModule.class;
    }

    public static final Class LIZ$37(C1208890hZ1 c1208890hZ1) {
        return PoiListApi.PoiMergedListResponse.class;
    }

    public static final Class LIZ$38(C1208890hZ1 c1208890hZ1) {
        return PoiNavBarModule.class;
    }

    public static final Class LIZ$39(C1208890hZ1 c1208890hZ1) {
        return PoiNearbyModel.class;
    }

    public static final Class LIZ$4(C1208890hZ1 c1208890hZ1) {
        return CouponModuleData.class;
    }

    public static final Class LIZ$40(C1208890hZ1 c1208890hZ1) {
        return QuickNavBarModule.class;
    }

    public static final Class LIZ$41(C1208890hZ1 c1208890hZ1) {
        return PoiDetailApi.ChartsBasicData.class;
    }

    public static final Class LIZ$42(C1208890hZ1 c1208890hZ1) {
        return PoiAmenitiesComponentData.class;
    }

    public static final Class LIZ$43(C1208890hZ1 c1208890hZ1) {
        return SparkPopupModel.class;
    }

    public static final Class LIZ$44(C1208890hZ1 c1208890hZ1) {
        return PoiNearbyV2Model.class;
    }

    public static final Class LIZ$45(C1208890hZ1 c1208890hZ1) {
        return PoiDetailApi.ChartsBasicData.class;
    }

    public static final Class LIZ$46(C1208890hZ1 c1208890hZ1) {
        return PoiListApi.PoiMergedListResponse.class;
    }

    public static final Class LIZ$47(C1208890hZ1 c1208890hZ1) {
        return PoiBannerModel.class;
    }

    public static final Class LIZ$48(C1208890hZ1 c1208890hZ1) {
        return PoiRecommendFeatureDetailDescModule.class;
    }

    public static final Class LIZ$49(C1208890hZ1 c1208890hZ1) {
        return PoiRecommendFeatureDetailFeedModule.class;
    }

    public static final Class LIZ$5(C1208890hZ1 c1208890hZ1) {
        return CouponGuildData.class;
    }

    public static final Class LIZ$50(C1208890hZ1 c1208890hZ1) {
        return PoiListApi.PoiDetailResponse.class;
    }

    public static final Class LIZ$51(C1208890hZ1 c1208890hZ1) {
        return PoiDetailClaimResponse.class;
    }

    public static final Class LIZ$52(C1208890hZ1 c1208890hZ1) {
        return PoiRecommendFeatureDetailTabModule.class;
    }

    public static final Class LIZ$53(C1208890hZ1 c1208890hZ1) {
        return PoiWorldCupScheduleModule.class;
    }

    public static final Class LIZ$6(C1208890hZ1 c1208890hZ1) {
        return ExitConfirmModalData.class;
    }

    public static final Class LIZ$7(C1208890hZ1 c1208890hZ1) {
        return OrderSummaryData.class;
    }

    public static final Class LIZ$8(C1208890hZ1 c1208890hZ1) {
        return NavigationBarData.class;
    }

    public static final Class LIZ$9(C1208890hZ1 c1208890hZ1) {
        return PriceSummaryData.class;
    }

    public static final BaseComponentData LIZJ$25(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        if ((baseComponentData instanceof PoiHeaderTopVideosModule) && (baseComponentData2 instanceof PoiHeaderTopVideosModule)) {
            return ((PoiHeaderTopVideosModule) baseComponentData).merge$poi_release((PoiHeaderTopVideosModule) baseComponentData2);
        }
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$31(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        if ((baseComponentData instanceof PoiDetailApi.PoiDetailLynxResponse) && (baseComponentData2 instanceof PoiDetailApi.PoiDetailLynxResponse)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PoiDetailApi.PoiDetailLynxResponse poiDetailLynxResponse = (PoiDetailApi.PoiDetailLynxResponse) baseComponentData;
            Map<String, String> attachedDataList = poiDetailLynxResponse.getAttachedDataList();
            if (attachedDataList != null) {
                linkedHashMap.putAll(attachedDataList);
            }
            PoiDetailApi.PoiDetailLynxResponse poiDetailLynxResponse2 = (PoiDetailApi.PoiDetailLynxResponse) baseComponentData2;
            String str = poiDetailLynxResponse2.instanceId;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String businessData = poiDetailLynxResponse2.getBusinessData();
            if (businessData != null) {
                str2 = businessData;
            }
            linkedHashMap.put(str, str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("append data current: ");
            sbLIZ.append(poiDetailLynxResponse.instanceId);
            sbLIZ.append(", latest: ");
            sbLIZ.append(poiDetailLynxResponse2.instanceId);
            C2188811AlT.LIZIZ(sbLIZ);
            PoiDetailApi.PoiDetailLynxResponse poiDetailLynxResponseCopy = poiDetailLynxResponse.copy(poiDetailLynxResponse.url, poiDetailLynxResponse.businessData, poiDetailLynxResponse.showBottomBarWhenDisappear, linkedHashMap);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("append data,instanceId:");
            sbLIZ2.append(poiDetailLynxResponseCopy.instanceId);
            sbLIZ2.append(",attachedDataList :");
            sbLIZ2.append(linkedHashMap);
            C2188811AlT.LIZIZ(sbLIZ2);
            return poiDetailLynxResponseCopy;
        }
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$35(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        if ((baseComponentData instanceof PoiDynamicNavBarModule) && (baseComponentData2 instanceof PoiDynamicNavBarModule)) {
            return ((PoiDynamicNavBarModule) baseComponentData).merge$poi_release((PoiDynamicNavBarModule) baseComponentData2);
        }
        return baseComponentData;
    }

    public static final BaseComponentData LIZJ$50(C1208890hZ1 c1208890hZ1, BaseComponentData baseComponentData, BaseComponentData baseComponentData2) {
        if ((baseComponentData instanceof PoiListApi.PoiDetailResponse) && (baseComponentData2 instanceof PoiListApi.PoiDetailResponse)) {
            return ((PoiListApi.PoiDetailResponse) baseComponentData).merge$poi_release((PoiListApi.PoiDetailResponse) baseComponentData2);
        }
        return baseComponentData;
    }
}
