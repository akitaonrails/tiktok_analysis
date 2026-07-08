package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0dK3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045850dK3 {
    public static boolean LIZ(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            if (aweme.getAwemeRawAd().getPivOption() == 1 || aweme.getAwemeRawAd().getPivOption() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
