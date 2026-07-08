package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0c60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998700c60 {
    public static boolean LIZ(C1ACA c1aca) {
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        AwemeRawAd awemeRawAd2;
        if (c1aca != null) {
            Aweme aweme2 = c1aca.LIZIZ;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (awemeRawAd != null) {
                if (c1aca != null) {
                    Aweme aweme3 = c1aca.LIZIZ;
                    if (aweme3 != null && aweme3.isAd() && (aweme = c1aca.LIZIZ) != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.isRightStyle()) {
                        return true;
                    }
                } else {
                    return false;
                }
            } else if (c1aca == null) {
                return false;
            }
            Aweme aweme4 = c1aca.LIZIZ;
            if (aweme4 != null && C1017070cZd.LJLIIIL(aweme4)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
