package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;

/* JADX INFO: renamed from: X.0P0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637980P0q {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_missing_component_optimization", true) == 1) {
            if (aweme != null) {
                if (!aweme.isAd()) {
                    if (aweme != null) {
                        if (!AwemeBizExtKt.isReferralFakeAweme(aweme)) {
                            if (aweme != null) {
                                if (!aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) {
                                    return true;
                                }
                            } else {
                                return true;
                            }
                        }
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
