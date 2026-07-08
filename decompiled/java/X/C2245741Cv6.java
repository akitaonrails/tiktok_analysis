package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.1Cv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245741Cv6 {
    public static final boolean LIZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getMidRollType() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isEnableMidRoll()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getRollType() == 1) {
            C293440Beo.LIZ.getClass();
            if (!C293440Beo.LIZ()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
