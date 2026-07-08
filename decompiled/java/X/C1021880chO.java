package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0chO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021880chO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AwemeRawAd awemeRawAd, String str, String str2, String str3) {
        if (!C00ZB.LIZ() || awemeRawAd == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        C998510c5h.LIZ("open_google_play", str, awemeRawAd, C2097608Jq.LJIIJ(new Pair("package_name", str2), new Pair("click_id", str3)));
    }

    public static void LIZIZ(AwemeRawAd awemeRawAd, String str, String str2, String str3) {
        if (!C00ZB.LIZ() || awemeRawAd == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        C998510c5h.LIZ("open_google_play_success", str, awemeRawAd, C2097608Jq.LJIIJ(new Pair("package_name", str2), new Pair("click_id", str3)));
    }
}
