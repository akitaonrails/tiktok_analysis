package X;

import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0RPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695380RPk {
    public static final C695380RPk LIZ = new C695380RPk();

    public static boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdDislikeInfo dislikeInfo;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dislikeInfo = awemeRawAd.getDislikeInfo()) != null && !dislikeInfo.enableAdShowDislikeIcon) {
            return true;
        }
        return false;
    }
}
