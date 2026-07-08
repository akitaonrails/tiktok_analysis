package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;

/* JADX INFO: renamed from: X.0SE5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SE5 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "deal_data_miss_phase_two", true, false);
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (!LIZ()) {
            return false;
        }
        if (aweme != null) {
            if (aweme.isAd()) {
                return false;
            }
            if (aweme != null) {
                if (AwemeSaaSExtKt.isLive(aweme)) {
                    return false;
                }
                if (aweme != null && AwemeBizExtKt.isReferralFakeAweme(aweme)) {
                    return false;
                }
            }
        }
        return true;
    }
}
