package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0N1V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1V {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null || AwemeExtKt.isAdTraffic(aweme) || aweme.getIsTikTokStory()) {
            return false;
        }
        if (aweme.getAwemeType() != 0 && aweme.getAwemeType() != 51 && aweme.getAwemeType() != 53 && aweme.getAwemeType() != 54 && aweme.getAwemeType() != 55 && aweme.getAwemeType() != 58 && aweme.getAwemeType() != 61 && aweme.getAwemeType() != 160) {
            return false;
        }
        return true;
    }
}
