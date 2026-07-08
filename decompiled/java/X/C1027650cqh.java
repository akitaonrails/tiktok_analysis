package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027650cqh {
    public static void LIZJ(Context context, Bundle bundle) {
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putBoolean("bundle_is_ad_fake", true);
    }

    public static void LIZ(Context context, Bundle bundle, Aweme aweme) {
        String webUrl;
        if (aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                webUrl = awemeRawAd.getWebUrl();
            } else {
                webUrl = null;
            }
            C786410Ut5.LJJJI("url", webUrl, bundle);
            C786410Ut5.LJJJI("aweme_id", aweme.getAid(), bundle);
            bundle.putBoolean("control_request_url", true);
            C786410Ut5.LJJJI("request_id", aweme.getRequestId(), bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r10, android.os.Bundle r11, com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1027650cqh.LIZIZ(android.content.Context, android.os.Bundle, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static void LIZLLL(Context context, Bundle bundle, Aweme aweme) {
        String webTitle;
        boolean z;
        AutofillModel autofillModel;
        if (aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                webTitle = awemeRawAd.getWebTitle();
            } else {
                webTitle = null;
            }
            if (TextUtils.isEmpty(webTitle)) {
                webTitle = " ";
            }
            C786410Ut5.LJJJI("bundle_web_title", webTitle, bundle);
            boolean z2 = true;
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && awemeRawAd2.isUseDefaultColor()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bundle.putInt("bundle_webview_background", C475630Ikz.LIZIZ(R.attr.bx, context));
            } else {
                bundle.putInt("bundle_webview_background", -1);
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                bundle.putBoolean("show_report", awemeRawAd3.isReportEnable());
            }
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                bundle.putBoolean("web_apply_camera", awemeRawAd4.getWebApplyCamera());
            }
            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
            if (awemeRawAd5 != null && (autofillModel = awemeRawAd5.getAutofillModel()) != null) {
                C786410Ut5.LJJIZ(bundle, "autofill", autofillModel);
            }
            AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
            if (awemeRawAd6 != null) {
                C786410Ut5.LJJJI("ttclid", awemeRawAd6.getTtclid(), bundle);
                bundle.putInt("enable_click_id_attach", awemeRawAd6.getEnableClickIdAttach());
            }
            AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
            if (awemeRawAd7 != null) {
                bundle.putBoolean("use_ordinary_web", C1025130cmd.LIZ(awemeRawAd7));
            }
            AwemeRawAd awemeRawAd8 = aweme.getAwemeRawAd();
            if (awemeRawAd8 == null || awemeRawAd8.getWebviewProgressBar() != 1) {
                z2 = false;
            }
            bundle.putBoolean("webview_progress_bar", z2);
        }
    }
}
