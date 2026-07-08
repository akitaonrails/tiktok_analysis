package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0S9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716820S9w {
    public static final C716820S9w LIZ = new C716820S9w();

    public static final long LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return 0L;
        }
        return C1029590ctp.LIZLLL().LJJIJIL(awemeRawAd);
    }

    public static final void LIZIZ(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
        String str4 = "draw_ad";
        if (TextUtils.equals(str2, "challenge") || TextUtils.equals(str2, "challenge_fresh")) {
            if (TextUtils.equals("draw_ad", "background_ad")) {
                str4 = "background_ads";
            } else {
                str4 = "topic_ads";
            }
        }
        C1029590ctp.LIZLLL().LJJIFFI(j, context, str4, str, str3, jSONObject);
    }
}
