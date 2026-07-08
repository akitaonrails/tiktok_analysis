package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395960mQk {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("analytics", "aweme://lynxview/?bundle=pages%2Fpromote%2Ftemplate.js&channel=tiktok_promote_lynx&dynamic=3&enable_canvas=1&group=tiktok_promote_lynx&hide_nav_bar=1&hide_status_bar=0&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Fpromote%2Ftiktok_promote_lynx%2Fpages%2Fpromote%2Ftemplate.js&trans_status_bar=1&use_bdx=1&webview_clear_color=1&pageModule=promote-center&enable_code_cache=1&enable_prefetch=1&disable_back_press=1&enter_from=business_suite_analytics&enable_pre_code_cache=1&use_forest=1&gecko_url_redirection=1"), new Pair("ba_coupon_list", "aweme://lynxview/?bundle=pages%2Fpromote%2Ftemplate.js&channel=tiktok_promote_lynx&dynamic=3&enable_canvas=1&group=tiktok_promote_lynx&hide_nav_bar=1&hide_status_bar=0&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Fpromote%2Ftiktok_promote_lynx%2Fpages%2Fpromote%2Ftemplate.js&trans_status_bar=1&use_bdx=1&webview_clear_color=1&pageModule=coupon-list&enable_code_cache=1&enable_prefetch=1&disable_back_press=1&enter_from=business_suite&enable_pre_code_cache=1&use_forest=1&gecko_url_redirection=1"), new Pair("live", "aweme://lynxview_popup/?bundle=pages%2Fpromote%2Ftemplate.js&channel=tiktok_promote_lynx&dynamic=3&enable_canvas=1&group=tiktok_promote_lynx&hide_nav_bar=1&hide_status_bar=0&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Fpromote%2Ftiktok_promote_lynx%2Fpages%2Fpromote%2Ftemplate.js&trans_status_bar=1&use_bdx=1&webview_clear_color=1&is_from_live=1&is_popup=1&pageModule=delivery&popup_enter_type=bottom&container_bgcolor=00000000&enable_code_cache=1&bypass_presentation_hook=0&enable_prefetch=1&disable_back_press=1&enable_pre_code_cache=1&use_forest=1&gecko_url_redirection=1"), new Pair("settings", "aweme://webview/?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ftiktok_promote_pia_next%2Fpromote-center.html%3F_pia_%3D1%26use_spark%3D1&disable_ttnet_proxy=0&hide_nav_bar=1&hide_status_bar=0&use_spark=1&dynamic=3&trans_status_bar=1&disable_bounces=1&webview_clear_color=1&use_forest=1"), new Pair("video", "aweme://webview/?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ftiktok_promote_pia_next%2Fdelivery.html%3F_pia_%3D1%26use_spark%3D1&disable_ttnet_proxy=0&hide_nav_bar=1&hide_status_bar=0&use_spark=1&dynamic=3&trans_status_bar=1&disable_bounces=1&webview_clear_color=1&use_forest=1"), new Pair("video_analytics", "aweme://lynxview/?bundle=pages%2Fpromote%2Ftemplate.js&channel=tiktok_promote_lynx&dynamic=3&enable_canvas=1&group=tiktok_promote_lynx&hide_nav_bar=1&hide_status_bar=0&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Fpromote%2Ftiktok_promote_lynx%2Fpages%2Fpromote%2Ftemplate.js&trans_status_bar=1&use_bdx=1&webview_clear_color=1&pageModule=delivery&enable_code_cache=1&enable_prefetch=1&disable_back_press=1&enable_pre_code_cache=1&enter_from=video_analytics&use_forest=1&gecko_url_redirection=1"), new Pair("capcut_toggle", "aweme://webview_popup/?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_promote_pia_next%2Fsimplify-creation.html%3F_pia_%3D1%26use_spark%3D1%26enter_from%3Dcapcut_toggle%26is_popup%3D1&disable_ttnet_proxy=0&hide_nav_bar=1&hide_status_bar=0&use_spark=1&dynamic=3&trans_status_bar=1&disable_bounces=1&webview_clear_color=1&use_forest=1&is_popup=1"), new Pair("ads_subscription_cta", "aweme://webview/?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ftiktok_promote_pia_next%2Fpromote-center.html%3F_pia_%3D1&disable_ttnet_proxy=0&hide_nav_bar=1&hide_status_bar=0&use_spark=1&dynamic=3&trans_status_bar=1&disable_bounces=1&webview_clear_color=1&use_forest=1&enter_from=ttplus"));

    public static final Map<String, String> LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            Map<String, String> map = LIZ;
            Map<String, String> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("promote_entrance_schema_pia", Map.class, map);
            return map2 != null ? map2 : map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return LIZ;
        }
    }
}
