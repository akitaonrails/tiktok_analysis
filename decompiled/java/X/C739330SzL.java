package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;

/* JADX INFO: renamed from: X.0SzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739330SzL {
    public static final boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (splashInfo = awemeRawAd.getSplashInfo()) != null) {
            return splashInfo.isLogTopViewBreak();
        }
        return false;
    }
}
