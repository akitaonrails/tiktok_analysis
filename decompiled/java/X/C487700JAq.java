package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0JAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487700JAq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "commerce_ai_pdp_page_click", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(str, "clickSource");
        c1022820ciuLIZLLL.LIZIZ(str2, "button_type");
        c1022820ciuLIZLLL.LIZIZ(str3, "enter_from");
        c1022820ciuLIZLLL.LJII();
    }
}
