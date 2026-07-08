package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.subscribe.model.BannerBackground;
import com.bytedance.android.pgcsdk.subscribe.model.PGCBannerBackground;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubLiveBanner;
import webcast.api.pgc_sub.PGCOfferInfo;
import webcast.api.pgc_sub.PGCTagInfo;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KLX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KLX {
    public static PGCTemplateInfo LIZ(TemplateInfo templateInfo) {
        PGCOfferInfo pGCOfferInfo;
        PGCTemplateInfo pGCTemplateInfo = new PGCTemplateInfo();
        pGCTemplateInfo.id = templateInfo.id;
        pGCTemplateInfo.iapId = templateInfo.iapId;
        pGCTemplateInfo.tplType = templateInfo.tplType;
        pGCTemplateInfo.payChannel = templateInfo.payChannel;
        pGCTemplateInfo.subCircle = templateInfo.subCircle;
        pGCTemplateInfo.coins = templateInfo.coins;
        pGCTemplateInfo.shouldDisplay = templateInfo.shouldDisplay;
        pGCTemplateInfo.tplName = templateInfo.tplName;
        pGCTemplateInfo.currency = templateInfo.currency;
        pGCTemplateInfo.amount = templateInfo.amount;
        pGCTemplateInfo.moneyDisplay = templateInfo.moneyDisplay;
        OfferInfo offerInfo = templateInfo.offerInfo;
        PGCTagInfo pGCTagInfo = null;
        if (offerInfo != null) {
            pGCOfferInfo = new PGCOfferInfo();
            pGCOfferInfo.id = offerInfo.id;
            pGCOfferInfo.offerType = offerInfo.offerType;
            pGCOfferInfo.campaignType = offerInfo.campaignType;
            pGCOfferInfo.originalAmount = offerInfo.originalAmount;
            pGCOfferInfo.originalMoneyDisplay = offerInfo.originalMoneyDisplay;
            pGCOfferInfo.discountAmount = offerInfo.discountAmount;
            pGCOfferInfo.discountMoneyDisplay = offerInfo.discountMoneyDisplay;
            pGCOfferInfo.offerEndTimestamp = offerInfo.offerEndTimestamp;
            pGCOfferInfo.discountRate = offerInfo.discountRate;
            pGCOfferInfo.offerStartTimestamp = offerInfo.offerStartTimestamp;
            pGCOfferInfo.discountUsdPriceAmountMicros = offerInfo.discountUsdPriceAmountMicros;
            pGCOfferInfo.promotionId = offerInfo.promotionId;
            pGCOfferInfo.freeTrialInfo = offerInfo.freeTrialInfo;
            pGCOfferInfo.offerToken = offerInfo.offerToken;
        } else {
            pGCOfferInfo = null;
        }
        pGCTemplateInfo.offerInfo = pGCOfferInfo;
        pGCTemplateInfo.confirmedPrice = templateInfo.confirmedPrice;
        pGCTemplateInfo.productTitle = templateInfo.productTitle;
        pGCTemplateInfo.productDesc = templateInfo.productDesc;
        TagInfo tagInfo = templateInfo.tagInfo;
        if (tagInfo != null) {
            pGCTagInfo = new PGCTagInfo();
            pGCTagInfo.tagType = tagInfo.tagType;
            pGCTagInfo.jumpLink = tagInfo.jumpLink;
            pGCTagInfo.activityName = tagInfo.activityName;
            pGCTagInfo.promotionTitle = tagInfo.promotionTitle;
            pGCTagInfo.promotionDesc = tagInfo.promotionDesc;
            pGCTagInfo.promotionTermDesc = tagInfo.promotionTermDesc;
            pGCTagInfo.promotionButton = tagInfo.promotionButton;
            pGCTagInfo.clickableDesc = tagInfo.clickableDesc;
            pGCTagInfo.clickableDescExtraInfo = tagInfo.clickableDescExtraInfo;
            pGCTagInfo.packageSubscribeButton = tagInfo.packageSubscribeButton;
            pGCTagInfo.newPromotionDesc = tagInfo.newPromotionDesc;
        }
        pGCTemplateInfo.tagInfo = pGCTagInfo;
        pGCTemplateInfo.packageId = templateInfo.packageId;
        pGCTemplateInfo.basePlanId = templateInfo.basePlanId;
        pGCTemplateInfo.usdPriceAmountMicros = templateInfo.usdPriceAmountMicros;
        pGCTemplateInfo.taxDisplay = templateInfo.taxDisplay;
        pGCTemplateInfo.totalMoneyDisplay = templateInfo.totalMoneyDisplay;
        pGCTemplateInfo.gstHstTaxDisplay = templateInfo.gstHstTaxDisplay;
        pGCTemplateInfo.pstQstTaxDisplay = templateInfo.pstQstTaxDisplay;
        pGCTemplateInfo.createContractIntent = templateInfo.createContractIntent;
        pGCTemplateInfo.renewalPeriod = templateInfo.renewalPeriod;
        pGCTemplateInfo.isDefaultPackage = templateInfo.isDefaultPackage;
        pGCTemplateInfo.internalIapId = templateInfo.internalIapId;
        pGCTemplateInfo.isChannelActive = templateInfo.isChannelActive;
        pGCTemplateInfo.priceDescription = templateInfo.priceDescription;
        pGCTemplateInfo.planMoneyDisplay = templateInfo.planMoneyDisplay;
        return pGCTemplateInfo;
    }

    public static C0K21 LIZIZ(PGCSubLiveBanner pGCSubLiveBanner) {
        BannerBackground bannerBackground;
        String str = pGCSubLiveBanner.title;
        ImageModel imageModel = pGCSubLiveBanner.image;
        String str2 = pGCSubLiveBanner.text;
        String str3 = pGCSubLiveBanner.activityName;
        String str4 = pGCSubLiveBanner.schemaUrl;
        String str5 = pGCSubLiveBanner.textColor;
        PGCBannerBackground pGCBannerBackground = pGCSubLiveBanner.bannerBackground;
        if (pGCBannerBackground != null) {
            bannerBackground = new BannerBackground();
            bannerBackground.leftBackgroundColor = pGCBannerBackground.leftBackgroundColor;
            bannerBackground.rightBackgroundColor = pGCBannerBackground.rightBackgroundColor;
            bannerBackground.backgroundImage = pGCBannerBackground.backgroundImage;
        } else {
            bannerBackground = null;
        }
        return new C0K21(str, imageModel, str2, str3, str4, str5, bannerBackground, Long.valueOf(pGCSubLiveBanner.id), Boolean.valueOf(pGCSubLiveBanner.hideNavigationBar));
    }
}
