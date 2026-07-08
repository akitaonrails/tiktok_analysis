package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FeedbackConfig;
import com.ss.android.ugc.aweme.experiment.RapButtonConfig;

/* JADX INFO: renamed from: X.0u3U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689060u3U {
    public static final FeedbackConfig LIZ;
    public static final FeedbackConfig LIZIZ;

    static {
        FeedbackConfig feedbackConfig = new FeedbackConfig(false, "https://feedback.tiktokv.com/feedback/offline/session_list?hide_nav_bar=1&container_color_auto_dark=1&use_spark=1&trans_status_bar=1&_pia_=1&enter_from=rap_main_na&entrance=rap_main&version=1.0.0&disable_ttnet_proxy=0&bdhm_bid=csp_im_inapp_hybrid", "https://feedback.tiktokv.com/feedback/offline/faq_detail?hide_nav_bar=1&container_color_auto_dark=1&use_spark=1&trans_status_bar=1&_pia_=1&enter_from=rap_main_na&entrance=rap_main&version=1.0.0&disable_ttnet_proxy=0&bdhm_bid=csp_im_inapp_hybrid", "https://feedback.tiktokv.com/feedback/offline/search?hide_nav_bar=1&container_color_auto_dark=1&use_spark=1&trans_status_bar=1&_pia_=1&enter_from=rap_main_na&entrance=rap_main&version=1.0.0&disable_ttnet_proxy=0&bdhm_bid=csp_im_inapp_hybrid", "https://feedback.tiktokv.com/feedback/offline/search?hide_nav_bar=1&container_color_auto_dark=1&use_spark=1&trans_status_bar=1&_pia_=1&version=1.0.0&disable_ttnet_proxy=0&bdhm_bid=csp_im_inapp_hybrid", false, true, 1, 1.0f, new RapButtonConfig("", "", "Chat with us", "aweme://webview?url=https%3A%2F%2Ffeedback.tiktokv.com%2Ffeedback%2Fim%2Fchat%3Fdisable_ttnet_proxy%3D0%26trans_status_bar%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26container_color_auto_dark%3D1%26_pia_%3D1%26version%3D1.0.0%26bdhm_bid%3Dcsp_im_inapp_hybrid%26is_bot%3Dtrue%26entrance%3Drap_main_na%26enter_from%3Drap_main_na", "sticky"));
        LIZ = feedbackConfig;
        try {
            FeedbackConfig feedbackConfig2 = (FeedbackConfig) C0C64.LJIILLIIL().LJJII(FeedbackConfig.class, feedbackConfig, "csp_detail_page_native_opt", true);
            if (feedbackConfig2 != null) {
                feedbackConfig = feedbackConfig2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            feedbackConfig = LIZ;
        }
        LIZIZ = feedbackConfig;
    }

    public static String LIZ(String str) {
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(LIZIZ.faqDetail).buildUpon();
            builderBuildUpon.appendQueryParameter("faq_id", str);
            return builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
