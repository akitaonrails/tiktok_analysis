package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryRawAdInfo;

/* JADX INFO: renamed from: X.0cuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029880cuI {
    public static final /* synthetic */ int LIZ = 0;

    public static AdWebHistoryRawAdInfo LIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return null;
        }
        LandingPageConfig landingPageConfig = new LandingPageConfig(false, awemeRawAd.getLandingPageConfig().landingPageBottomBarType, awemeRawAd.getLandingPageConfig().webGeckoChannels, awemeRawAd.getLandingPageConfig().shouldAddUserInteractionRecord, awemeRawAd.getLandingPageConfig().forwardBackButtonPosition, null, null, null, 0, 60, awemeRawAd.getLandingPageConfig().strictUsePureLink, awemeRawAd.getLandingPageConfig().iabHistory, 0, 0, -1, -1, -1, -1, -1, null, 0);
        return new AdWebHistoryRawAdInfo(awemeRawAd.getCreativeId(), awemeRawAd.getClickTrackUrlList(), awemeRawAd.getLogExtra(), awemeRawAd.getAdId(), awemeRawAd.isReportEnable(), awemeRawAd.isEnableWebReport(), awemeRawAd.getSystemOrigin(), awemeRawAd.getLandingPageInfo(), awemeRawAd.getCommerceAceSurveyInfo(), awemeRawAd.getEnableWebGoogleLogin(), awemeRawAd.isDisableLeftSlideFollow(), awemeRawAd.getWebTitle(), awemeRawAd.getWebUrl(), awemeRawAd.getPreloadWeb(), awemeRawAd.getPreloadH5Type(), awemeRawAd.isAmazonAd(), awemeRawAd.getShopifyData(), awemeRawAd.getOmVast(), awemeRawAd.getIabAutoJumpAllowList(), awemeRawAd.getTtclid(), awemeRawAd.getEnableClickIdAttach(), landingPageConfig, awemeRawAd.getNativeSiteCustomData(), awemeRawAd.getEcUgVSAData(), awemeRawAd.getAutofillModel());
    }
}
