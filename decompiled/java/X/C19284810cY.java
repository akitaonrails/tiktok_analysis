package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10cY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19284810cY {
    public static final C19284810cY LIZ = new C19284810cY();

    public static String LIZ(C19EG c19eg) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        InterfaceC1910030znt interfaceC1910030zntLJIIL;
        String strLIZJ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (interfaceC1910030zntLJIIL = i18nManagerServiceApiLIZ.LJIIL(c19eg)) == null || (strLIZJ = interfaceC1910030zntLJIIL.LIZJ()) == null) {
            return "";
        }
        return strLIZJ;
    }

    public static SpannableStringBuilder LIZIZ(String str, String str2, final String str3, final AwemeRawAd awemeRawAd, final Long l, final TuxSheet tuxSheet) {
        boolean z = false;
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        if (iLJJJ == -1) {
            return new SpannableStringBuilder(str);
        }
        if (str3 == null || a0.LJJJIL(str3)) {
            z = true;
        }
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 33);
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        C786410Ut5.q2(spannableStringBuilder2, new ClickableSpan() { // from class: X.10cZ
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                long jCurrentTimeMillis;
                C19284810cY c19284810cY = C19284810cY.LIZ;
                String str4 = str3;
                TuxSheet tuxSheet2 = tuxSheet;
                AwemeRawAd awemeRawAd2 = awemeRawAd;
                Long l2 = l;
                c19284810cY.getClass();
                C844470XAv.LIZ.getClass();
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://webview");
                smartRouteBuildRoute.withParam("url", str4);
                smartRouteBuildRoute.withParam("use_spark", true);
                smartRouteBuildRoute.withParam("use_webview_title", true);
                smartRouteBuildRoute.open();
                if (TextUtils.equals("https://www.tiktok.com/safety/en/ads-and-data/", str4)) {
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("about_this_ad", "exit", awemeRawAd2);
                    c1022820ciuLIZLLL.LIZIZ("how_tiktok_ads_work", "close_method");
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (l2 != null) {
                        jCurrentTimeMillis = l2.longValue();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    c1022820ciuLIZLLL.LIZIZ(Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), "page_stay_time");
                    c1022820ciuLIZLLL.LJII();
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("about_this_ad", "otherclick", awemeRawAd2);
                    c1022820ciuLIZLLL2.LIZIZ("how_tiktok_ads_work", "click_source");
                    c1022820ciuLIZLLL2.LJII();
                }
                if (tuxSheet2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_not_other_exit", true);
                    tuxSheet2.setArguments(bundle);
                    tuxSheet2.dismiss();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, str2.length() + iLJJJ, 33);
        C786410Ut5.q2(spannableStringBuilder2, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 33);
        return spannableStringBuilder2;
    }
}
