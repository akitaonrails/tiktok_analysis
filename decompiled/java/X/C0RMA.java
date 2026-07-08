package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RMA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RMA {
    public static boolean LIZ(C690870R8b c690870R8b) {
        Integer numValueOf;
        C2189821An6 c2189821An6;
        C728040Sh8.LIZ.getClass();
        if (C728040Sh8.LIZ()) {
            C0RF0 c0rf0 = c690870R8b.LIZLLL;
            String from = null;
            if (c0rf0 != null) {
                numValueOf = Integer.valueOf(c0rf0.LJIILJJIL);
            } else {
                numValueOf = null;
            }
            if (C729510SjV.LJIILLIIL(numValueOf)) {
                C0RJN c0rjnLIZIZ = c690870R8b.LIZIZ();
                if (c0rjnLIZIZ != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null) {
                    from = c2189821An6.getFrom();
                }
                if (!Intrinsics.LJFF(from, "STORY_ENTRANCE_HIGHLIGHTS")) {
                    return true;
                }
                return false;
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
