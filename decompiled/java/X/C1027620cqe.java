package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.crash.Npth;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.subpage.ICommerceLandPageService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.ss.android.ugc.aweme.web.utils.AdWebUtils;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS35S1110000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1027620cqe extends AbstractC1027370cqF {
    public static final C01GW<IAdLandingPagePopUpService> LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(360));

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZIZ() throws JSONException {
        Bundle bundle;
        String siteId;
        Aweme awemeLJI;
        String strS0;
        Aweme awemeLJI2;
        AwemeRawAd awemeRawAd;
        IAdLandingPagePopUpService value;
        AwemeRawAd awemeRawAd2;
        String aid;
        LandingPageSurveyModel landingPageSurvey;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        LandingPageConfig landingPageConfig;
        AwemeRawAd awemeRawAd5;
        AwemeRawAd awemeRawAd6;
        LandingPageNetworkOptimization landingPageNetworkOptimization;
        AwemeRawAd awemeRawAd7;
        AwemeRawAd awemeRawAd8;
        AwemeRawAd awemeRawAd9;
        Aweme aweme;
        AwemeRawAd awemeRawAd10;
        if (C1027980crE.LIZ) {
            String.valueOf(LJ().LIZ.LIZJ);
        }
        C0BTH.LIZ.getClass();
        if (C0BTH.LIZ() && u.LJJIIJZLJL(LJ().LIZIZ.LIZ, "aweme://lynxview", false) && AdWebUtils.LIZIZ == null && !LJ().LIZIZ.LJJIJLIJ && LJ().LIZIZ.LJJIFFI != 1) {
            C1012040cRW.LIZIZ().LJIIIZ = LJ().LJ.LIZIZ;
            C1012040cRW.LIZIZ().LJIIIIZZ = -1;
            ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJJ(C1027630cqf.LIZ(LJ(), LIZLLL(), LJI()));
            C730040SkM.LIZIZ(LIZLLL(), "click_ad_jsb");
            LJ().LJ.getClass();
            return true;
        }
        if (((C2431009fo.LIZJ(LJIIIIZZ()) && LJ().LIZIZ.LJIJJ == 1 && LJ().LIZIZ.LJIIZILJ == 1) || (C2431009fo.LIZJ(LJIIIIZZ()) && LJ().LIZIZ.LJIJJ == 1 && LJ().LIZIZ.LJIIZILJ != 1)) && !LJ().LIZIZ.LJJIJLIJ) {
            AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 658);
            if (((IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class)).LJIIJJI()) {
                C1554300qY8.LIZLLL(LIZLLL(), LJIIIIZZ(), EnumC822170WNb.Spark, new ThirdPartyBizCert(LJII()), awS560S0100000_16);
                return true;
            }
            awS560S0100000_16.invoke();
            return true;
        }
        Intent intent = new Intent(LIZLLL(), (Class<?>) CrossPlatformActivity.class);
        Uri uriBuild = UriProtector.parse(LJIIIIZZ());
        if (!LJ().LIZIZ.LIZJ.isEmpty()) {
            Uri.Builder builderBuildUpon = UriProtector.parse(LJIIIIZZ()).buildUpon();
            for (Map.Entry<String, String> entry : LJ().LIZIZ.LIZJ.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            uriBuild = builderBuildUpon.build();
        }
        if (LJII() != 0) {
            C2429209fW.LIZ().appendDataFlowId(intent, String.valueOf(LJII()));
        }
        intent.setData(uriBuild);
        C2429209fW.LIZ().appendDataFlowId(intent, "402657282");
        if (!TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "launch_mode"), "standard")) {
            intent.addFlags(268435456);
        }
        if (LJ().LIZIZ.LIZIZ.length() > 0) {
            intent.putExtra("title", LJ().LIZIZ.LIZIZ);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("show_report", LJ().LIZIZ.LJ);
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        intent.putExtra("web_apply_camera", (c1019830ce5LIZ == null || (aweme = c1019830ce5LIZ.LJIIL) == null || (awemeRawAd10 = aweme.getAwemeRawAd()) == null) ? false : awemeRawAd10.getWebApplyCamera());
        Aweme awemeLJI3 = LJI();
        intent.putExtra("autofill", (awemeLJI3 == null || (awemeRawAd9 = awemeLJI3.getAwemeRawAd()) == null) ? null : awemeRawAd9.getAutofillModel());
        Aweme awemeLJI4 = LJI();
        intent.putExtra("ttclid", (awemeLJI4 == null || (awemeRawAd8 = awemeLJI4.getAwemeRawAd()) == null) ? null : awemeRawAd8.getTtclid());
        Aweme awemeLJI5 = LJI();
        intent.putExtra("enable_click_id_attach", (awemeLJI5 == null || (awemeRawAd7 = awemeLJI5.getAwemeRawAd()) == null) ? 0 : awemeRawAd7.getEnableClickIdAttach());
        Aweme awemeLJI6 = LJI();
        intent.putExtra("network_optimization_type", (awemeLJI6 == null || (awemeRawAd6 = awemeLJI6.getAwemeRawAd()) == null || (landingPageNetworkOptimization = awemeRawAd6.getLandingPageNetworkOptimization()) == null) ? 0 : landingPageNetworkOptimization.getNetworkOptimization());
        intent.putExtra("bundle_app_ad_from", LJ().LIZIZ.LJIILIIL);
        if (LJ().LIZ.LIZJ != 0) {
            intent.putExtra("ad_id", LJ().LIZ.LIZJ);
            intent.putExtra("aweme_creative_id", String.valueOf(LJ().LIZ.LIZJ));
            LJIIIZ(intent, "ad_type", LJ().LIZ.LJFF);
            intent.putExtra("ad_system_origin", LJ().LIZ.LJI);
            intent.putExtra("charge_type", LJ().LIZ.LJII);
            LJIIIZ(intent, "bundle_download_app_log_extra", LJ().LIZ.LIZLLL);
            intent.putExtra("landing_page_info", LJ().LIZIZ.LJIJ);
            intent.putExtra("need_bottom_out", LJ().LIZIZ.LJIJI == 1);
        }
        String strLIZ = SharePrefCache.inst().getJsActlogUrl().LIZ();
        if (strLIZ != null && strLIZ.length() > 0) {
            intent.putExtra("ad_js_url", strLIZ);
        }
        intent.putExtra("bundle_disable_download_dialog", LJ().LJFF.LIZLLL);
        if (LJ().LJFF.LIZ.length() > 0) {
            intent.putExtra("bundle_download_url", LJ().LJFF.LIZ);
            LJIIIZ(intent, "aweme_package_name", LJ().LJFF.LIZIZ);
            intent.putExtra("bundle_is_from_app_ad", LJ().LJFF.LJ);
            LJIIIZ(intent, "bundle_ad_quick_app_url", LJ().LJFF.LIZJ);
            intent.putExtra("bundle_download_app_name", LJ().LJFF.LJFF);
            intent.putExtra("bundle_download_mode", LJ().LJFF.LJI);
            intent.putExtra("bundle_link_mode", LJ().LJFF.LJII);
            intent.putExtra("bundle_support_multiple_download", LJ().LJFF.LJIIIIZZ);
            intent.putExtra("bundle_web_url", LJ().LJFF.LJIIIZ);
            intent.putExtra("bundle_web_title", LJ().LJFF.LJIIJ);
            intent.putExtra("bundle_open_url", LJ().LJFF.LJIIJJI);
        }
        Context contextLIZLLL = LIZLLL();
        Aweme awemeLJI7 = LJI();
        String strJ3 = C786410Ut5.J3(C1019030ccn.LJIIL(contextLIZLLL, awemeLJI7 != null ? awemeLJI7.getAwemeRawAd() : null, false, null));
        String str = "";
        if (strJ3 == null) {
            strJ3 = "";
        }
        intent.putExtra("aweme_json_extra", strJ3);
        Long lValueOf = Long.valueOf(LJ().LIZ.LJ);
        if (lValueOf.longValue() > 0) {
            intent.putExtra("group_id", lValueOf.longValue());
        }
        Integer num = LJ().LIZIZ.LJFF;
        if (num != null) {
            intent.putExtra("bundle_webview_background", num.intValue());
        }
        intent.putExtra("aweme_id", LJ().LIZ.LJIIIIZZ);
        intent.putExtra("session_id", UUID.randomUUID().toString());
        Aweme awemeLJI8 = LJI();
        intent.putExtra("preload_h5_type", (awemeLJI8 == null || (awemeRawAd5 = awemeLJI8.getAwemeRawAd()) == null) ? 0 : awemeRawAd5.getPreloadH5Type());
        Aweme awemeLJI9 = LJI();
        intent.putExtra("strict_use_pure_link", (awemeLJI9 == null || (awemeRawAd4 = awemeLJI9.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd4.getLandingPageConfig()) == null) ? false : landingPageConfig.strictUsePureLink);
        Aweme awemeLJI10 = LJI();
        intent.putExtra("page_id", (awemeLJI10 == null || (awemeRawAd3 = awemeLJI10.getAwemeRawAd()) == null) ? null : awemeRawAd3.getPageId());
        intent.putExtra("owner_id", LJ().LIZ.LJIIIZ);
        intent.putExtra("bundle_forbidden_jump", LJ().LIZIZ.LJI);
        intent.putExtra("use_ordinary_web", LJ().LIZIZ.LIZLLL);
        intent.putExtra("preload_channel_name", LJ().LIZIZ.LJIIJ);
        intent.putExtra("preload_scene", "feed");
        intent.putExtra("preload_web_status", LJ().LIZIZ.LJIIIIZZ);
        intent.putExtra("preload_web_status_new", LJ().LIZIZ.LJIIIZ);
        intent.putExtra("preload_is_web_url", LJ().LIZIZ.LJIIJJI);
        intent.putExtra("web_type", LJ().LIZIZ.LJIIL);
        intent.putExtra("user_click_time", LJ().LIZIZ.LJIILJJIL);
        intent.putExtra("is_from_lynx_land_page", LJ().LIZIZ.LJIILL);
        intent.putExtra("is_from_jsb", LJ().LIZIZ.LJJIJIIJIL);
        intent.putExtra("preload_web_second_page", LJ().LIZIZ.LJJIJIL);
        intent.putExtra("second_page_preload_channel_name", LJ().LIZIZ.LJIILLIIL);
        intent.putExtra("refer", LJ().LJ.LIZIZ);
        Aweme awemeLJI11 = LJI();
        C1027910cr7.LIZ = awemeLJI11 != null ? awemeLJI11.getAwemeRawAd() : null;
        Aweme awemeLJI12 = LJI();
        if (awemeLJI12 != null) {
            intent.putExtra("req_id", awemeLJI12.getRequestId());
            AwemeRawAd awemeRawAd11 = awemeLJI12.getAwemeRawAd();
            if (awemeRawAd11 != null && (landingPageSurvey = awemeRawAd11.getLandingPageSurvey()) != null) {
                intent.putExtra("ad_landing_enable_landing_page_survey", landingPageSurvey.enableLandingPageSurvey);
                intent.putExtra("ad_landing_show_survey_time_interval", landingPageSurvey.showSurveyTimeInterval);
                intent.putExtra("ad_landing_page_dwell_time", landingPageSurvey.pageDwellTime);
                intent.putExtra("ad_landing_page_schema_url", landingPageSurvey.schemaUrl);
            }
        }
        if (C1027980crE.LIZ) {
            String.valueOf(LJ().LIZ.LIZJ);
        }
        Context contextLIZLLL2 = LIZLLL();
        try {
            bundle = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bundle = null;
        }
        if (!u.LJJIIJZLJL(LJIIIIZZ(), "aweme://lynxview", false)) {
            LJ().LJ.getClass();
            LJ().LJ.getClass();
            LJ().LJ.getClass();
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF == null) {
                return false;
            }
            String webTitle = LJ().LIZIZ.LIZIZ;
            if ((a0.LJJJIL(webTitle) || webTitle == null) && ((awemeLJI2 = LJI()) == null || (awemeRawAd = awemeLJI2.getAwemeRawAd()) == null || (webTitle = awemeRawAd.getWebTitle()) == null)) {
                webTitle = "";
            }
            AwemeRawAd awemeRawAd12 = LJ().LIZ.LIZ;
            if (awemeRawAd12 == null) {
                Aweme awemeLJI13 = LJI();
                awemeRawAd12 = awemeLJI13 != null ? awemeLJI13.getAwemeRawAd() : null;
            }
            int i = C1012040cRW.LIZIZ().LJIIIIZZ;
            String str2 = LJ().LIZIZ.LIZ;
            int i2 = LJ().LIZIZ.LJIIJJI;
            String str3 = LJ().LJ.LIZ;
            String str4 = LJ().LJ.LIZIZ;
            boolean z = LJ().LIZIZ.LJJIJIIJIL;
            String aid2 = LJ().LIZ.LJIIIIZZ;
            if (aid2 == null) {
                Aweme awemeLJI14 = LJI();
                aid2 = awemeLJI14 != null ? awemeLJI14.getAid() : null;
            }
            String authorUid = LJ().LIZ.LJIIIZ;
            if (authorUid == null) {
                Aweme awemeLJI15 = LJI();
                authorUid = awemeLJI15 != null ? AwemeExtKt.getAuthorUid(awemeLJI15) : null;
            }
            String requestId = LJ().LIZ.LJIIJ;
            if (requestId == null) {
                Aweme awemeLJI16 = LJI();
                requestId = awemeLJI16 != null ? awemeLJI16.getRequestId() : null;
            }
            Aweme awemeLJI17 = LJI();
            UrlModel urlModelLIZLLL = C10EU.LIZLLL(awemeLJI17 != null ? awemeLJI17.getAuthor() : null);
            boolean z2 = LJ().LIZIZ.LJJJ;
            Integer numValueOf = Integer.valueOf(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append('-');
            sbLIZ.append(UUID.randomUUID());
            C1035740d3k c1035740d3k = new C1035740d3k(str2, i2, webTitle, str3, str4, true, "click", z, 0, C2188811AlT.LIZIZ(sbLIZ), false, z2, aid2, authorUid, requestId, urlModelLIZLLL, false, null, null, numValueOf);
            ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).N0();
            String str5 = c1035740d3k.url;
            Aweme awemeLJI18 = LJI();
            AwemeRawAd awemeRawAd13 = awemeLJI18 != null ? awemeLJI18.getAwemeRawAd() : null;
            Aweme awemeLJI19 = LJI();
            if (awemeLJI19 != null && (aid = awemeLJI19.getAid()) != null) {
                str = aid;
            }
            String strLJIIJJI = C1037010d5n.LJIIJJI(awemeRawAd13, str5, str, true);
            if (strLJIIJJI != null) {
                c1035740d3k.setContainerId(strLJIIJJI);
            }
            c1035740d3k.setReportAdExtraData(LJ().LIZ.LJIILJJIL);
            C1035880d3y c1035880d3yRu = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Ru(awemeRawAd12, c1035740d3k);
            ICommerceLandPageService iCommerceLandPageServiceLIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ();
            String strLJIIIIZZ = LJIIIIZZ();
            boolean zIsEnableWebGoogleLogin = awemeRawAd12 != null ? awemeRawAd12.isEnableWebGoogleLogin() : false;
            String str6 = C1030680cva.LJIIJJI(LJI()) ? "splash" : "feed";
            String containerId = c1035880d3yRu.getContainerId();
            Aweme awemeLJI20 = LJI();
            iCommerceLandPageServiceLIZ.vE0(strLJIIIIZZ, c1035880d3yRu, zIsEnableWebGoogleLogin, awemeRawAd12, str6, containerId, awemeLJI20 != null ? awemeLJI20.getRequestId() : null);
            if (!LJ().LIZIZ.LJIJJLI && (((value = LIZJ.getValue()) == null || !value.LJIJI()) && !TextUtils.equals(activityLJFF.getClass().getSimpleName(), "RewardAdActivity"))) {
                boolean z3 = LJ().LIZIZ.LJJIJIIJIL && Intrinsics.LJFF(LJ().LJ.LIZIZ, "landing_page");
                Aweme awemeLJI21 = LJI();
                ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).kv(activityLJFF, c1035880d3yRu, new AwS35S1110000_16(this, (awemeLJI21 == null || (awemeRawAd2 = awemeLJI21.getAwemeRawAd()) == null || !C1017180cZo.LJIL(awemeRawAd2)) ? "homepage_hot" : "general_search", z3, 1));
                return true;
            }
            AdlpExtraModel adlpExtraModelLIZ = LJI() != null ? C1028090crP.LIZ(LJI(), null, 0, LJ().LJ.LIZIZ, null, null, null, null) : new AdlpExtraModel(null, LJ().LIZ.LJIIJ, LJ().LIZ.LJIIIIZZ, null, null, LJ().LJ.LIZIZ, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
            adlpExtraModelLIZ.setReportAdExtraData(LJ().LIZ.LJIILJJIL);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LIZLLL(), "//commercialize/ad_landing_page/fullscreen");
            smartRouteBuildRoute.withParam("keyAdWebModel", new C1026310coX(LJIIIIZZ(), awemeRawAd12, adlpExtraModelLIZ, true, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), null));
            smartRouteBuildRoute.withParam("keyFromScene", Intrinsics.LJFF(adlpExtraModelLIZ.getRefer(), "up_slide") ? EnumC1036160d4Q.FROM_REWARD_AD_FLING : EnumC1036160d4Q.FROM_CUSTOM);
            smartRouteBuildRoute.open();
            return true;
        }
        ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Yu();
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("is_lynx_landing_page", true);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("hide_status_bar", false);
        bundle.putBoolean("need_bottom_out", true);
        if (LJ().LIZIZ.LJJIJIIJI == 1) {
            if (!TextUtils.isEmpty(LJ().LIZIZ.LJJIII)) {
                C786410Ut5.LJJJI("bundle_full_screen_bg_image", LJ().LIZIZ.LJJIII, bundle);
            }
            bundle.putInt("bundle_webview_background", 0);
        }
        C786410Ut5.LJJJI("lynx_channel_name", LJ().LIZIZ.LJJIIJ, bundle);
        C786410Ut5.LJJJI("bundle_native_site_custom_data", LJ().LIZIZ.LJJIIJZLJL, bundle);
        List<String> list = LJ().LIZIZ.LJJIJ;
        if (list != null && !list.isEmpty()) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (iAdLandPagePreloadService == null || (strS0 = iAdLandPagePreloadService.s0(Long.valueOf(LJ().LIZ.LIZIZ))) == null) {
                strS0 = "";
            }
            C786410Ut5.LJJJI("second_page_preload_channel_prefix", strS0, bundle);
            iAdLandPagePreloadService.G0();
            C1024380clQ.LJIILL(LJ().LIZIZ.LJJIJ);
        }
        int i3 = LJ().LIZIZ.LJJIJIL;
        String str7 = LJ().LIZIZ.LJIIJ;
        if (i3 == 1 && str7.length() > 0) {
            bundle.putInt("preload_web_second_page", i3);
        }
        bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(contextLIZLLL2), 1073741824));
        bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C12ES.LJIIIIZZ(contextLIZLLL2) - C497820Jfg.LIZJ(contextLIZLLL2), 1073741824));
        Uri uri = UriProtector.parse(LJIIIIZZ());
        if (uri.isHierarchical()) {
            C786410Ut5.LJJJI("bundle_origin_url", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback_url"), bundle);
            if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "async_layout"), "1")) {
                bundle.putBoolean("preset_safe_point", true);
                bundle.putInt("thread_strategy", 2);
            }
        }
        Uri.Builder builderBuildUpon2 = uri.buildUpon();
        JSONObject jSONObject = LJ().LIZIZ.LJJII;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        PreloadData preloadData = LJ().LIZIZ.LJII;
        if (preloadData == null || (siteId = preloadData.getSiteId()) == null) {
            siteId = "";
        }
        jSONObject.put("siteId", siteId);
        jSONObject.put("adId", String.valueOf(LJ().LIZ.LIZIZ));
        jSONObject.put("creativeId", String.valueOf(LJ().LIZ.LIZJ));
        jSONObject.put("logExtra", LJ().LIZ.LIZLLL);
        jSONObject.put("groupId", String.valueOf(LJ().LIZ.LJ));
        jSONObject.put("webUrl", LJIIIIZZ());
        jSONObject.put("pageData", LJ().LIZIZ.LJJIIZ);
        jSONObject.put("appData", LJ().LIZIZ.LJJIIZI);
        jSONObject.put("isRTL", C444960Hcc.LIZJ(LIZLLL()) ? 1 : 0);
        jSONObject.put("topSafeAreaHeight", C497820Jfg.LIZJ(LIZLLL()));
        IAdAutofillService iAdAutofillService = (IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class);
        Aweme awemeLJI22 = LJI();
        jSONObject.put("isAutoFillEnable", iAdAutofillService.LIZIZ(awemeLJI22 != null ? awemeLJI22.getAwemeRawAd() : null) ? 1 : 0);
        jSONObject.put("enableAutofillV2", C305310Bxx.LIZ());
        jSONObject.put("autoFillInfo", ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIILJJIL());
        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
        Aweme awemeLJI23 = LJI();
        iAdWebUtils.rv(awemeLJI23 != null ? awemeLJI23.getAwemeRawAd() : null, "click", jSONObject);
        builderBuildUpon2.appendQueryParameter("lynx_landing_page_data", C786410Ut5.J3(jSONObject));
        builderBuildUpon2.appendQueryParameter("lynx_landing_page_title", LJ().LIZIZ.LIZIZ);
        AwemeRawAd awemeRawAd14 = LJ().LIZ.LIZ;
        boolean z4 = !(awemeRawAd14 == null && ((awemeLJI = LJI()) == null || (awemeRawAd14 = awemeLJI.getAwemeRawAd()) == null)) && awemeRawAd14.getLandingPageNativeType() == 1 && C292440BdC.LIZ();
        builderBuildUpon2.appendQueryParameter("use_spark", "1");
        IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF != null) {
            String string = builderBuildUpon2.toString();
            IAdLandPagePreloadService iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            String strK0 = iAdLandPagePreloadService2 != null ? iAdLandPagePreloadService2.K0("lynx_feed") : null;
            boolean zLIZIZ = C1000150c8L.LIZIZ();
            boolean z5 = LJ().LIZIZ.LJJI == 1;
            Aweme awemeLJI24 = LJI();
            String string2 = builderBuildUpon2.toString();
            AwemeRawAd awemeRawAd15 = LJ().LIZ.LIZ;
            if (awemeRawAd15 == null) {
                Aweme awemeLJI25 = LJI();
                awemeRawAd15 = awemeLJI25 != null ? awemeLJI25.getAwemeRawAd() : null;
            }
            C1027480cqQ c1027480cqQLJ = LJ();
            Integer num2 = 0;
            AdlpExtraModel adlpExtraModel = new AdlpExtraModel(null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
            adlpExtraModel.setRequestId(c1027480cqQLJ.LIZ.LJIIJ);
            adlpExtraModel.setAid(c1027480cqQLJ.LIZ.LJIIIIZZ);
            adlpExtraModel.setRefer(c1027480cqQLJ.LJ.LIZIZ);
            adlpExtraModel.setLynxShowType(Integer.valueOf(c1027480cqQLJ.LIZIZ.LJJI));
            adlpExtraModel.setLynxPresentationStyle(Integer.valueOf(c1027480cqQLJ.LIZIZ.LJJIFFI));
            num2.intValue();
            adlpExtraModel.setLandingPageStyle(num2);
            iAdSparkUtilsLJFF.LIZ(contextLIZLLL2, string, bundle, strK0, zLIZIZ, z5, awemeLJI24, new C1026310coX(string2, awemeRawAd15, adlpExtraModel, true, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, false, false, Boolean.TRUE, Boolean.valueOf(z4), null, null, null, false, false, false, false, null, Boolean.FALSE)), AFwS240S0000000_9.get$arr$(712));
        }
        LJ().LJ.getClass();
        LJ().LJ.getClass();
        return true;
    }

    public final Aweme LJI() {
        String aid;
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(LJ().LIZ.LJIIIIZZ);
        if (awemeLLILZ == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("creative_id", String.valueOf(LJ().LIZ.LIZJ));
                HashMap map = new HashMap();
                map.put("creative_id", String.valueOf(LJ().LIZ.LIZJ));
                Npth.reportBizException("IAB_aweme_wrong", new Throwable(C786410Ut5.J3(jSONObject)), C786410Ut5.J3(jSONObject), (Map<String, String>) map, true);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        Aweme aweme = c1019830ce5LIZ != null ? c1019830ce5LIZ.LJIIL : null;
        if (awemeLLILZ != null) {
            if (!AwemeExtKt.isAdTraffic(awemeLLILZ)) {
                aid = awemeLLILZ.getAid();
            }
        }
        aid = null;
        return (TextUtils.equals(aid, aweme != null ? aweme.getAid() : null) || awemeLLILZ == null) ? aweme : awemeLLILZ;
    }

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZ() {
        if (LJIIIIZZ().length() == 0 || LJ().LIZIZ.LJJJJ) {
            return false;
        }
        if (!C2431009fo.LIZJ(LJIIIIZZ())) {
            String strLJIIIIZZ = LJIIIIZZ();
            if (TextUtils.isEmpty(strLJIIIIZZ) || !u.LJJIIJZLJL(strLJIIIIZZ.toLowerCase(Locale.ROOT), "aweme://lynxview", false)) {
                return false;
            }
        }
        return true;
    }

    public final int LJII() {
        Integer numLIZ = C1025770cnf.LIZ(LJ().LIZ.LJIIJJI, EnumC1027330cqB.WEBJUMP);
        if (numLIZ != null) {
            return numLIZ.intValue();
        }
        return 402657282;
    }

    public final String LJIIIIZZ() {
        return LJ().LIZIZ.LIZ;
    }

    public static void LJIIIZ(Intent intent, String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            intent.putExtra(str, str2);
        }
    }
}
