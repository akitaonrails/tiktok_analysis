package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.pgc_sub.PGCOfferInfo;
import webcast.api.pgc_sub.PGCTagInfo;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KLY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KLY {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        OfferInfo offerInfo;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PGCTemplateInfo pGCTemplateInfo = (PGCTemplateInfo) it2.next();
            TemplateInfo templateInfo = new TemplateInfo();
            templateInfo.id = pGCTemplateInfo.id;
            templateInfo.iapId = pGCTemplateInfo.iapId;
            templateInfo.tplType = pGCTemplateInfo.tplType;
            templateInfo.payChannel = pGCTemplateInfo.payChannel;
            templateInfo.subCircle = pGCTemplateInfo.subCircle;
            templateInfo.coins = pGCTemplateInfo.coins;
            templateInfo.shouldDisplay = pGCTemplateInfo.shouldDisplay;
            templateInfo.tplName = pGCTemplateInfo.tplName;
            templateInfo.currency = pGCTemplateInfo.currency;
            templateInfo.amount = pGCTemplateInfo.amount;
            templateInfo.moneyDisplay = pGCTemplateInfo.moneyDisplay;
            PGCOfferInfo pGCOfferInfo = pGCTemplateInfo.offerInfo;
            TagInfo tagInfo = null;
            if (pGCOfferInfo != null) {
                offerInfo = new OfferInfo();
                offerInfo.id = pGCOfferInfo.id;
                offerInfo.offerType = pGCOfferInfo.offerType;
                offerInfo.campaignType = pGCOfferInfo.campaignType;
                offerInfo.originalAmount = pGCOfferInfo.originalAmount;
                offerInfo.originalMoneyDisplay = pGCOfferInfo.originalMoneyDisplay;
                offerInfo.discountAmount = pGCOfferInfo.discountAmount;
                offerInfo.discountMoneyDisplay = pGCOfferInfo.discountMoneyDisplay;
                offerInfo.offerEndTimestamp = pGCOfferInfo.offerEndTimestamp;
                offerInfo.discountRate = pGCOfferInfo.discountRate;
                offerInfo.offerStartTimestamp = pGCOfferInfo.offerStartTimestamp;
                offerInfo.offerToken = pGCOfferInfo.offerToken;
                offerInfo.discountUsdPriceAmountMicros = pGCOfferInfo.discountUsdPriceAmountMicros;
                offerInfo.promotionId = pGCOfferInfo.promotionId;
                offerInfo.freeTrialInfo = pGCOfferInfo.freeTrialInfo;
            } else {
                offerInfo = null;
            }
            templateInfo.offerInfo = offerInfo;
            templateInfo.confirmedPrice = pGCTemplateInfo.confirmedPrice;
            String str = pGCTemplateInfo.productTitle;
            templateInfo.renewalPeriod = pGCTemplateInfo.renewalPeriod;
            templateInfo.productTitle = str;
            templateInfo.productDesc = pGCTemplateInfo.productDesc;
            PGCTagInfo pGCTagInfo = pGCTemplateInfo.tagInfo;
            if (pGCTagInfo != null) {
                tagInfo = new TagInfo();
                tagInfo.tagType = pGCTagInfo.tagType;
                tagInfo.jumpLink = pGCTagInfo.jumpLink;
                tagInfo.activityName = pGCTagInfo.activityName;
                tagInfo.promotionTitle = pGCTagInfo.promotionTitle;
                tagInfo.promotionDesc = pGCTagInfo.promotionDesc;
                tagInfo.promotionTermDesc = pGCTagInfo.promotionTermDesc;
                tagInfo.promotionButton = pGCTagInfo.promotionButton;
                tagInfo.clickableDesc = pGCTagInfo.clickableDesc;
                tagInfo.clickableDescExtraInfo = pGCTagInfo.clickableDescExtraInfo;
                tagInfo.packageSubscribeButton = pGCTagInfo.packageSubscribeButton;
                tagInfo.newPromotionDesc = pGCTagInfo.newPromotionDesc;
            }
            templateInfo.tagInfo = tagInfo;
            templateInfo.packageId = pGCTemplateInfo.packageId;
            templateInfo.basePlanId = pGCTemplateInfo.basePlanId;
            templateInfo.usdPriceAmountMicros = pGCTemplateInfo.usdPriceAmountMicros;
            templateInfo.taxDisplay = pGCTemplateInfo.taxDisplay;
            templateInfo.totalMoneyDisplay = pGCTemplateInfo.totalMoneyDisplay;
            templateInfo.gstHstTaxDisplay = pGCTemplateInfo.gstHstTaxDisplay;
            templateInfo.pstQstTaxDisplay = pGCTemplateInfo.pstQstTaxDisplay;
            templateInfo.createContractIntent = pGCTemplateInfo.createContractIntent;
            templateInfo.renewalPeriod = pGCTemplateInfo.renewalPeriod;
            templateInfo.internalIapId = pGCTemplateInfo.internalIapId;
            templateInfo.isChannelActive = pGCTemplateInfo.isChannelActive;
            templateInfo.priceDescription = pGCTemplateInfo.priceDescription;
            templateInfo.planMoneyDisplay = pGCTemplateInfo.planMoneyDisplay;
            templateInfo.isDefaultPackage = pGCTemplateInfo.isDefaultPackage;
            arrayList.add(templateInfo);
        }
        return arrayList;
    }
}
