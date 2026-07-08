package X;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669560QOc implements Serializable {
    public String backToPage;
    public final String bannerVoucherTypeIds;
    public final String clickRecomSearchEntrance;
    public C672110QXx deepLinkEcParams;
    public final String defaultHintWord;
    public final String ecWordExtraInfo;
    public boolean enableShowCoin;
    public final String hintCouponInfo;
    public Map<String, String> hintExtraTrackParams;
    public final String hintWord;
    public final String hintWordId;
    public final String hintWordProductId;
    public boolean isExistMallTab;
    public boolean isFromMallUGDeepLink;
    public boolean isFromShopVideo;
    public boolean needBackToPage;
    public String pageSchema;
    public final String promotionIconOnly;
    public final String promotionInfo;
    public Map<String, ? extends Object> sessionParamsFromFE;
    public final String singleTabType;
    public final String sourceProductId;
    public String trafficDiversionInfo;
    public String voucherTypeId;
    public String wordRichExpression;

    public C669560QOc() {
        this(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null);
    }

    public final C669560QOc copy(C672110QXx c672110QXx, boolean z, String str, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z4, String str15, Map<String, ? extends Object> map, boolean z5, String str16, String str17, Map<String, String> map2) {
        return new C669560QOc(c672110QXx, z, str, z2, z3, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z4, str15, map, z5, str16, str17, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C669560QOc)) {
            return false;
        }
        C669560QOc c669560QOc = (C669560QOc) obj;
        return Intrinsics.LJFF(this.deepLinkEcParams, c669560QOc.deepLinkEcParams) && this.isFromMallUGDeepLink == c669560QOc.isFromMallUGDeepLink && Intrinsics.LJFF(this.backToPage, c669560QOc.backToPage) && this.isExistMallTab == c669560QOc.isExistMallTab && this.needBackToPage == c669560QOc.needBackToPage && Intrinsics.LJFF(this.pageSchema, c669560QOc.pageSchema) && Intrinsics.LJFF(this.hintWord, c669560QOc.hintWord) && Intrinsics.LJFF(this.hintCouponInfo, c669560QOc.hintCouponInfo) && Intrinsics.LJFF(this.promotionInfo, c669560QOc.promotionInfo) && Intrinsics.LJFF(this.promotionIconOnly, c669560QOc.promotionIconOnly) && Intrinsics.LJFF(this.ecWordExtraInfo, c669560QOc.ecWordExtraInfo) && Intrinsics.LJFF(this.hintWordProductId, c669560QOc.hintWordProductId) && Intrinsics.LJFF(this.bannerVoucherTypeIds, c669560QOc.bannerVoucherTypeIds) && Intrinsics.LJFF(this.hintWordId, c669560QOc.hintWordId) && Intrinsics.LJFF(this.defaultHintWord, c669560QOc.defaultHintWord) && Intrinsics.LJFF(this.singleTabType, c669560QOc.singleTabType) && Intrinsics.LJFF(this.sourceProductId, c669560QOc.sourceProductId) && Intrinsics.LJFF(this.clickRecomSearchEntrance, c669560QOc.clickRecomSearchEntrance) && this.enableShowCoin == c669560QOc.enableShowCoin && Intrinsics.LJFF(this.voucherTypeId, c669560QOc.voucherTypeId) && Intrinsics.LJFF(this.sessionParamsFromFE, c669560QOc.sessionParamsFromFE) && this.isFromShopVideo == c669560QOc.isFromShopVideo && Intrinsics.LJFF(this.trafficDiversionInfo, c669560QOc.trafficDiversionInfo) && Intrinsics.LJFF(this.wordRichExpression, c669560QOc.wordRichExpression) && Intrinsics.LJFF(this.hintExtraTrackParams, c669560QOc.hintExtraTrackParams);
    }

    public int hashCode() {
        C672110QXx c672110QXx = this.deepLinkEcParams;
        int iHashCode = (((c672110QXx == null ? 0 : c672110QXx.hashCode()) * 31) + C786410Ut5.Z2(this.isFromMallUGDeepLink)) * 31;
        String str = this.backToPage;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isExistMallTab)) * 31) + C786410Ut5.Z2(this.needBackToPage)) * 31;
        String str2 = this.pageSchema;
        int iHashCode3 = (((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.hintWord.hashCode()) * 31) + this.hintCouponInfo.hashCode()) * 31) + this.promotionInfo.hashCode()) * 31) + this.promotionIconOnly.hashCode()) * 31) + this.ecWordExtraInfo.hashCode()) * 31) + this.hintWordProductId.hashCode()) * 31;
        String str3 = this.bannerVoucherTypeIds;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.hintWordId.hashCode()) * 31;
        String str4 = this.defaultHintWord;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.singleTabType.hashCode()) * 31;
        String str5 = this.sourceProductId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.clickRecomSearchEntrance;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.enableShowCoin)) * 31;
        String str7 = this.voucherTypeId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, ? extends Object> map = this.sessionParamsFromFE;
        int iHashCode9 = (((iHashCode8 + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.isFromShopVideo)) * 31;
        String str8 = this.trafficDiversionInfo;
        int iHashCode10 = (((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.wordRichExpression.hashCode()) * 31;
        Map<String, String> map2 = this.hintExtraTrackParams;
        return iHashCode10 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "SearchEcommerceModel(deepLinkEcParams=" + this.deepLinkEcParams + ", isFromMallUGDeepLink=" + this.isFromMallUGDeepLink + ", backToPage=" + this.backToPage + ", isExistMallTab=" + this.isExistMallTab + ", needBackToPage=" + this.needBackToPage + ", pageSchema=" + this.pageSchema + ", hintWord=" + this.hintWord + ", hintCouponInfo=" + this.hintCouponInfo + ", promotionInfo=" + this.promotionInfo + ", promotionIconOnly=" + this.promotionIconOnly + ", ecWordExtraInfo=" + this.ecWordExtraInfo + ", hintWordProductId=" + this.hintWordProductId + ", bannerVoucherTypeIds=" + this.bannerVoucherTypeIds + ", hintWordId=" + this.hintWordId + ", defaultHintWord=" + this.defaultHintWord + ", singleTabType=" + this.singleTabType + ", sourceProductId=" + this.sourceProductId + ", clickRecomSearchEntrance=" + this.clickRecomSearchEntrance + ", enableShowCoin=" + this.enableShowCoin + ", voucherTypeId=" + this.voucherTypeId + ", sessionParamsFromFE=" + this.sessionParamsFromFE + ", isFromShopVideo=" + this.isFromShopVideo + ", trafficDiversionInfo=" + this.trafficDiversionInfo + ", wordRichExpression=" + this.wordRichExpression + ", hintExtraTrackParams=" + this.hintExtraTrackParams + ')';
    }

    public final boolean isExistMallTab() {
        return this.isExistMallTab;
    }

    public final boolean isFromMallUGDeepLink() {
        return this.isFromMallUGDeepLink;
    }

    public final boolean isFromShopVideo() {
        return this.isFromShopVideo;
    }

    public final void setBackToPage(String str) {
        this.backToPage = str;
    }

    public final void setDeepLinkEcParams(C672110QXx c672110QXx) {
        this.deepLinkEcParams = c672110QXx;
    }

    public final void setEnableShowCoin(boolean z) {
        this.enableShowCoin = z;
    }

    public final void setExistMallTab(boolean z) {
        this.isExistMallTab = z;
    }

    public final void setFromMallUGDeepLink(boolean z) {
        this.isFromMallUGDeepLink = z;
    }

    public final void setFromShopVideo(boolean z) {
        this.isFromShopVideo = z;
    }

    public final void setHintExtraTrackParams(Map<String, String> map) {
        this.hintExtraTrackParams = map;
    }

    public final void setNeedBackToPage(boolean z) {
        this.needBackToPage = z;
    }

    public final void setPageSchema(String str) {
        this.pageSchema = str;
    }

    public final void setSessionParamsFromFE(Map<String, ? extends Object> map) {
        this.sessionParamsFromFE = map;
    }

    public final void setTrafficDiversionInfo(String str) {
        this.trafficDiversionInfo = str;
    }

    public final void setVoucherTypeId(String str) {
        this.voucherTypeId = str;
    }

    public final void setWordRichExpression(String str) {
        this.wordRichExpression = str;
    }

    public C669560QOc(C672110QXx c672110QXx, boolean z, String str, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z4, String str15, Map<String, ? extends Object> map, boolean z5, String str16, String str17, Map<String, String> map2) {
        this.deepLinkEcParams = c672110QXx;
        this.isFromMallUGDeepLink = z;
        this.backToPage = str;
        this.isExistMallTab = z2;
        this.needBackToPage = z3;
        this.pageSchema = str2;
        this.hintWord = str3;
        this.hintCouponInfo = str4;
        this.promotionInfo = str5;
        this.promotionIconOnly = str6;
        this.ecWordExtraInfo = str7;
        this.hintWordProductId = str8;
        this.bannerVoucherTypeIds = str9;
        this.hintWordId = str10;
        this.defaultHintWord = str11;
        this.singleTabType = str12;
        this.sourceProductId = str13;
        this.clickRecomSearchEntrance = str14;
        this.enableShowCoin = z4;
        this.voucherTypeId = str15;
        this.sessionParamsFromFE = map;
        this.isFromShopVideo = z5;
        this.trafficDiversionInfo = str16;
        this.wordRichExpression = str17;
        this.hintExtraTrackParams = map2;
    }
}
