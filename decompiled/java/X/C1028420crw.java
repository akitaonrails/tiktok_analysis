package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.ss.android.ugc.aweme.landpage.IAdLandPageService;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0crw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028420crw {
    public static void LIZ(NormalSplashAdActivity normalSplashAdActivity, String str, Long l, String str2, C2115308Ql c2115308Ql) {
        boolean z;
        String strReplace;
        Boolean boolValueOf;
        int iLastIndexOf;
        C1031100cwG.LIZ().LJIILLIIL();
        String scheme = UriProtector.parse(str).getScheme();
        boolean z2 = false;
        if (!"sslocal".equalsIgnoreCase(scheme) && !"localsdk".equalsIgnoreCase(scheme)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2184171Adz.LJ("splash_ad", "open_url_app", String.valueOf(l), str2, CardStruct.IStatusCode.DEFAULT).LJII();
            C1031100cwG.LIZ().LIZJ();
        }
        if (str.contains("__back_url__")) {
            strReplace = str.replace("__back_url__", Uri.encode(InterfaceC1029360ctS.LIZ));
        } else {
            strReplace = str;
        }
        C0XI4 c0xi4 = new C0XI4(strReplace);
        if (C2093608Ic.LJ(str)) {
            boolValueOf = Boolean.FALSE;
        } else if (TextUtils.equals("sslocal", str)) {
            boolValueOf = Boolean.TRUE;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("snssdk");
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LJIIJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!C2093608Ic.LJ(strLIZIZ) && TextUtils.equals(strLIZIZ, str)) {
                z2 = true;
            }
            boolValueOf = Boolean.valueOf(z2);
        }
        if (boolValueOf.booleanValue()) {
            c0xi4.LJ("url", str);
        }
        if (str.startsWith("sslocal://user/profile/")) {
            c0xi4.LJ("enter_from", "open_screen_ad");
        }
        String host = UriProtector.parse(str).getHost();
        if (TextUtils.equals(host, "challenge")) {
            c0xi4.LJ("enter_from", "splash");
        }
        if (TextUtils.equals(host, "stickers") && (iLastIndexOf = str.lastIndexOf("/") + 1) < str.length()) {
            String strSubstring = str.substring(iLastIndexOf);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "splash_ad");
            c2344009Gk.LJIIIIZZ("prop_id", strSubstring);
            C20684815ws.LJIILLIIL("enter_prop_detail", c2344009Gk.LIZ);
        }
        C1031100cwG.LIZ().LJJII(normalSplashAdActivity, c0xi4.LJFF());
        if (z) {
            C15O7.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL).LIZLLL(new C1077460e92(new C1028430crx(l, str2), 5));
        }
    }

    public static boolean LIZIZ(NormalSplashAdActivity normalSplashAdActivity, String str, String str2, Long l, String str3, NativeSiteConfig nativeSiteConfig, String str4, String str5) {
        Bundle extras;
        IAdLandPageService iAdLandPageService;
        IAdLandPagePreloadService iAdLandPagePreloadService;
        C2184171Adz.LJ("splash_ad", "open_url_h5", String.valueOf(l), str3, CardStruct.IStatusCode.DEFAULT).LJII();
        C1031100cwG.LIZ().LIZJ();
        Intent intentLJJIIJ = C1031100cwG.LIZ().LJJIIJ(normalSplashAdActivity);
        intentLJJIIJ.setData(UriProtector.parse(str));
        intentLJJIIJ.setFlags(268435456);
        if (TextUtils.isEmpty(str2)) {
            intentLJJIIJ.putExtra("title", " ");
        } else {
            intentLJJIIJ.putExtra("title", str2);
        }
        intentLJJIIJ.putExtra("bundle_forbidden_jump", true);
        intentLJJIIJ.putExtra("ad_id", l);
        intentLJJIIJ.putExtra("bundle_download_app_log_extra", str3);
        intentLJJIIJ.putExtra("bundle_webview_background", C960203pA.LIZ(R.attr.ee, normalSplashAdActivity));
        intentLJJIIJ.putExtra("commerce_enter_from", "splash");
        intentLJJIIJ.putExtra("enter_from", "splash");
        IAdLandPagePreloadService iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService2 != null) {
            String strA0 = iAdLandPagePreloadService2.A0(l);
            if (!TextUtils.isEmpty(strA0)) {
                intentLJJIIJ.putExtra("preload_channel_name", strA0);
                intentLJJIIJ.putExtra("preload_scene", "splash");
                intentLJJIIJ.putExtra("preload_web_status", 4);
                intentLJJIIJ.putExtra("preload_is_web_url", 1);
            }
        }
        try {
            extras = intentLJJIIJ.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        if (extras != null && nativeSiteConfig != null) {
            String str6 = nativeSiteConfig.lynxScheme;
            if (!C2093608Ic.LJ(str6) && str6.startsWith("aweme://lynxview")) {
                extras.putBoolean("is_lynx_landing_page", true);
                extras.putBoolean("hide_nav_bar", true);
                extras.putBoolean("hide_status_bar", false);
                extras.putBoolean("bundle_nav_bar_status_padding", true);
                extras.putBoolean("need_bottom_out", true);
                if (nativeSiteConfig.lynxLandingStyle == 1) {
                    extras.putInt("bundle_webview_background", 0);
                }
                List<String> list = nativeSiteConfig.geckoChannel;
                if (list != null && !list.isEmpty()) {
                    C786410Ut5.LJJJI("lynx_channel_name", (String) ListProtector.get(nativeSiteConfig.geckoChannel, 0), extras);
                }
                C786410Ut5.LJJJI("bundle_native_site_custom_data", str5, extras);
                List<String> list2 = nativeSiteConfig.secondPageGeckoChannel;
                if (list2 != null && !list2.isEmpty()) {
                    String strS0 = "";
                    IAdLandPagePreloadService iAdLandPagePreloadService3 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService3 != null) {
                        strS0 = iAdLandPagePreloadService3.s0(l);
                        iAdLandPagePreloadService3.G0();
                        C1024380clQ.LJIILL(nativeSiteConfig.secondPageGeckoChannel);
                    }
                    C786410Ut5.LJJJI("second_page_preload_channel_prefix", strS0, extras);
                }
                extras.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(normalSplashAdActivity), 1073741824));
                extras.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C12ES.LJIIIIZZ(normalSplashAdActivity) - C497820Jfg.LIZJ(normalSplashAdActivity), 1073741824));
                Uri uri = UriProtector.parse(nativeSiteConfig.lynxScheme);
                if (uri.isHierarchical()) {
                    C786410Ut5.LJJJI("bundle_origin_url", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback_url"), extras);
                    if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "async_layout"), "1")) {
                        extras.putBoolean("preset_safe_point", true);
                        extras.putInt("thread_strategy", 1);
                    }
                }
                Uri.Builder builderBuildUpon = uri.buildUpon();
                n nVar = new n();
                nVar.LJJIII(l, "creativeId");
                nVar.LJJIIJ("logExtra", str3);
                nVar.LJJIIJ("pageData", str4);
                nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(normalSplashAdActivity) ? 1 : 0), "isRTL");
                nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(normalSplashAdActivity)), "topSafeAreaHeight");
                builderBuildUpon.appendQueryParameter("lynx_landing_page_data", nVar.toString());
                builderBuildUpon.appendQueryParameter("lynx_landing_page_title", str2);
                Object objLIZ = C04TD.LIZ(IAdLandPageService.class, false);
                if (objLIZ != null) {
                    iAdLandPageService = (IAdLandPageService) objLIZ;
                } else {
                    if (C04TD.A1 == null) {
                        synchronized (IAdLandPageService.class) {
                            if (C04TD.A1 == null) {
                                C04TD.A1 = new AdLandPageServiceImpl();
                            }
                        }
                    }
                    iAdLandPageService = C04TD.A1;
                }
                if (iAdLandPageService != null) {
                    iAdLandPageService.LIZ();
                }
                IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
                builderBuildUpon.appendQueryParameter("use_spark", "1");
                if (iAdSparkUtilsLJFF != null && (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) != null) {
                    iAdSparkUtilsLJFF.LIZ(normalSplashAdActivity, builderBuildUpon.toString(), extras, iAdLandPagePreloadService.K0("lynx_feed"), C1000150c8L.LIZIZ(), false, null, null, null);
                }
                return true;
            }
        }
        try {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(normalSplashAdActivity, intentLJJIIJ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLJJIIJ, normalSplashAdActivity);
            C2204961BRm.LJJJJJL(normalSplashAdActivity, intentLJJIIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrnefn6WusZG+tByEQn5Gk7b5KDEqEOHEj7wSMyFPdE6XgLFpoPxnyIAvpamf9Y8vlzdIoZBv7qSD0=", null));
            return true;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openSplashScheme: url = ");
            sbLIZ.append(str);
            sbLIZ.append(" e = ");
            sbLIZ.append(e2.toString());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C2344809Gs.LJI(e2);
            return false;
        }
    }
}
