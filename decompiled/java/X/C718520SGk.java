package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0SGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718520SGk {
    public static final HashMap<String, String> LIZ(Aweme aweme) {
        return C2097608Jq.LJI(new Pair("reviewed", String.valueOf(AwemeExtKt.isReviewed(aweme))), new Pair("is_prohibited", String.valueOf(AwemeExtKt.isProhibited(aweme))), new Pair("violation_display_status", String.valueOf(AwemeExtKt.getViolationDisplayStatus(aweme))), new Pair("review_status", String.valueOf(AwemeExtKt.getReviewStatus(aweme))));
    }
}
