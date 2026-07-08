package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;

/* JADX INFO: renamed from: X.0DF0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DF0 {
    public static void LIZ(Context context, Aweme aweme, String str, String str2, String str3) {
        String str4 = str;
        if (str4 == null) {
            str4 = str2;
        }
        AwemeRawAd awemeRawAd = null;
        Boolean boolValueOf = null;
        try {
            AdlpExtraModel adlpExtraModelLIZ = C1028090crP.LIZ(aweme, null, 0, str3, null, null, null, null);
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C1026310coX c1026310coX = new C1026310coX(str4, awemeRawAd, adlpExtraModelLIZ, false, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), null);
            Boolean bool = Boolean.TRUE;
            IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) PluggableExtentionKt.pluggableSpi$default(IAdLandingPagePopUpService.class, false, false, false, 14, null);
            if (iAdLandingPagePopUpService != null) {
                boolValueOf = Boolean.valueOf(iAdLandingPagePopUpService.LJIIJJI(c1026310coX, bool));
            }
            c1026310coX.setPopUpCustomConfig(new C1028100crQ(bool, null, Boolean.FALSE, false, false, Boolean.TRUE, boolValueOf, null, null, null, false, false, false, false, str2, Boolean.FALSE));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//commercialize/ad_landing_page/fullscreen");
            smartRouteBuildRoute.withParam("keyAdWebModel", c1026310coX);
            smartRouteBuildRoute.withParam("keyFromScene", EnumC1036160d4Q.FROM_FEED_AD_FLING);
            smartRouteBuildRoute.open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
