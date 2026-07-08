package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027640cqg {
    public static void LIZJ(Context context, Bundle bundle) {
        if (context != null) {
            bundle.putInt("bundle_app_ad_from", 1);
            bundle.putBoolean("bundle_is_ad_fake", true);
        }
    }

    public static void LIZ(Context context, Bundle bundle, Aweme aweme) {
        if (context != null && aweme != null && aweme.getAwemeRawAd() != null) {
            C786410Ut5.LJJJI("url", aweme.getAwemeRawAd().getWebUrl(), bundle);
            C786410Ut5.LJJJI("aweme_id", aweme.getAid(), bundle);
            bundle.putBoolean("control_request_url", true);
            C786410Ut5.LJJJI("request_id", aweme.getRequestId(), bundle);
        }
    }

    public static void LIZIZ(Context context, Bundle bundle, Aweme aweme) {
        String webTitle;
        if (context != null && aweme != null && aweme.getAwemeRawAd() != null) {
            Long creativeId = aweme.getAwemeRawAd().getCreativeId();
            C786410Ut5.LJJJI("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()), bundle);
            String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
            if (!TextUtils.isEmpty(downloadUrl)) {
                bundle.putBoolean("bundle_is_from_app_ad", true);
                C786410Ut5.LJJJI("bundle_download_url", downloadUrl, bundle);
                C786410Ut5.LJJJI("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl(), bundle);
                C786410Ut5.LJJJI("aweme_package_name", aweme.getAwemeRawAd().getPackageName(), bundle);
                if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                    C786410Ut5.LJJJI("bundle_download_app_name", aweme.getAwemeRawAd().getAppName(), bundle);
                }
                bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
                bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
                bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
                C786410Ut5.LJJJI("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl(), bundle);
                C786410Ut5.LJJJI("bundle_web_url", aweme.getAwemeRawAd().getWebUrl(), bundle);
            }
            C786410Ut5.LJJJI("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra(), bundle);
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
                webTitle = aweme.getAwemeRawAd().getSource();
            } else {
                webTitle = aweme.getAwemeRawAd().getWebTitle();
            }
            C786410Ut5.LJJJI("bundle_download_app_name", webTitle, bundle);
            bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
            String packageName = aweme.getAwemeRawAd().getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                C786410Ut5.LJJJI("aweme_package_name", packageName, bundle);
            }
            C786410Ut5.LJJJI("aweme_json_extra", C786410Ut5.J3(C1019030ccn.LJIIIZ(context, aweme)), bundle);
            Long groupId = aweme.getAwemeRawAd().getGroupId();
            if (groupId != null && groupId.longValue() != 0) {
                C786410Ut5.LJJJI("aweme_group_id", String.valueOf(groupId), bundle);
            }
            if (aweme.getAwemeRawAd().getCreativeId() != null) {
                if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
                    C786410Ut5.LJJJI("aweme_creative_id", String.valueOf(creativeId), bundle);
                }
                bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
            }
            C786410Ut5.LJJJI("ad_type", aweme.getAwemeRawAd().getType(), bundle);
            bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
            bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
            bundle.putBoolean("enable_web_google_login", aweme.getAwemeRawAd().isEnableWebGoogleLogin());
            C786410Ut5.LJJJI("preload_channel_name", aweme.getAwemeRawAd().getChannelName(), bundle);
            bundle.putInt("preload_web_second_page", aweme.getAwemeRawAd().getPreloadWebSecondPage());
            C786410Ut5.LJJJI("preload_scene", "feed", bundle);
            bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
            bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
            bundle.putInt("preload_is_web_url", 1);
            C786410Ut5.LJJJI("commerce_enter_from", "feedad", bundle);
            bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
            bundle.putBoolean("bundle_forbidden_jump", true);
            C786410Ut5.LJJJI("ad_js_url", SharePrefCache.inst().getJsActlogUrl().LIZ(), bundle);
            C786410Ut5.LJJJI("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo(), bundle);
            C786410Ut5.LJJJI("page_id", aweme.getAwemeRawAd().getPageId(), bundle);
            C786410Ut5.LJJJI("browser_config", GsonProtectorUtils.toJson(C08JS.LIZIZ(), aweme.getAwemeRawAd().getBrowserConfig()), bundle);
        }
    }

    public static void LIZLLL(Context context, Bundle bundle, Aweme aweme) {
        if (context != null && aweme != null && aweme.getAwemeRawAd() != null) {
            String webTitle = aweme.getAwemeRawAd().getWebTitle();
            if (TextUtils.isEmpty(webTitle)) {
                webTitle = " ";
            }
            C786410Ut5.LJJJI("bundle_web_title", webTitle, bundle);
            boolean z = true;
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            int iIntValue = -1;
            if (aweme.getAwemeRawAd().isUseDefaultColor()) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                bundle.putInt("bundle_webview_background", iIntValue);
            } else {
                bundle.putInt("bundle_webview_background", -1);
            }
            bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
            bundle.putBoolean("web_apply_camera", aweme.getAwemeRawAd().getWebApplyCamera());
            if (aweme.getAwemeRawAd().getAutofillModel() != null) {
                C786410Ut5.LJJIZ(bundle, "autofill", aweme.getAwemeRawAd().getAutofillModel());
            }
            C786410Ut5.LJJJI("ttclid", aweme.getAwemeRawAd().getTtclid(), bundle);
            bundle.putInt("enable_click_id_attach", aweme.getAwemeRawAd().getEnableClickIdAttach());
            if (aweme.getAwemeRawAd().getLandingPageNetworkOptimization() != null) {
                bundle.putInt("network_optimization_type", aweme.getAwemeRawAd().getLandingPageNetworkOptimization().getNetworkOptimization());
            }
            bundle.putBoolean("use_ordinary_web", C1025130cmd.LIZ(aweme.getAwemeRawAd()));
            if (aweme.getAwemeRawAd().getWebviewProgressBar() != 1) {
                z = false;
            }
            bundle.putBoolean("webview_progress_bar", z);
        }
    }
}
