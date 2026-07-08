package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0N1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587350N1x {
    public static final String LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAdLIZIZ = LIZIZ(aweme);
        if (awemeRawAdLIZIZ != null) {
            return awemeRawAdLIZIZ.getCreativeIdStr();
        }
        return null;
    }

    public static final AwemeRawAd LIZIZ(Aweme aweme) {
        Aweme aweme2;
        if (AwemeExtKt.isPseudoAd(aweme)) {
            aweme2 = aweme;
        } else {
            aweme2 = null;
        }
        AwemeRawAd awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme2);
        if (awemeRawAdLJJIJL == null) {
            if (!AwemeExtKt.isAdTraffic(aweme) || aweme == null) {
                return null;
            }
            return aweme.getAwemeRawAd();
        }
        return awemeRawAdLJJIJL;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (!AwemeExtKt.isPseudoAd(aweme) && !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        return true;
    }
}
