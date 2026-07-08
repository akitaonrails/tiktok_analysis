package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001150c9x {
    public static final C1001150c9x LIZ = new C1001150c9x();

    public static void LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        C2184171Adz.LIZLLL("homepage_ad", "button_show", awemeRawAd).LJIIIIZZ();
        if (aweme != null) {
            if (C1017070cZd.LJJZZI(aweme) || C1017070cZd.LJJZZIII(aweme)) {
                C2184171Adz.LIZLLL("homepage_ad", "profile_banner_show", aweme.getAwemeRawAd()).LJII();
            }
        }
    }

    public static void LIZIZ(AwemeRawAd awemeRawAd) {
        C1001140c9w c1001140c9w = new C1001140c9w();
        c1001140c9w.LIZ = awemeRawAd;
        JSONObject jSONObjectLIZ = c1001140c9w.LIZ();
        if (awemeRawAd != null) {
            C994130byd.LIZ("homepage_ad", "button_show", jSONObjectLIZ, awemeRawAd);
        }
    }
}
