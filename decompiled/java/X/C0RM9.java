package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RM9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RM9 {
    public static boolean LIZ(C690870R8b c690870R8b) {
        String from;
        C2189821An6 c2189821An6;
        C728030Sh7.LIZ.getClass();
        if (C728030Sh7.LIZ() && C289420BWa.LIZ()) {
            C0RJN c0rjnLIZIZ = c690870R8b.LIZIZ();
            if (c0rjnLIZIZ != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null) {
                from = c2189821An6.getFrom();
            } else {
                from = null;
            }
            if (Intrinsics.LJFF(from, "STORY_ENTRANCE_HIGHLIGHTS")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme = videoItemParams.getAweme();
        if (!AwemeExtKt.isInReviewing(aweme) && !C729510SjV.LJIJ(aweme) && !AwemeExtKt.shouldShowReviewStatus(aweme) && !C726800Sf8.LIZ(aweme) && !C726800Sf8.LIZIZ(aweme)) {
            return LIZ(c690870R8b);
        }
        return false;
    }
}
