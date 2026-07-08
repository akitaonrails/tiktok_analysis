package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0Mri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581720Mri {
    public static boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isEnableVideoResume()) {
            return true;
        }
        return false;
    }
}
