package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0SG6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SG6 {
    public static String LIZ(Aweme aweme) {
        Integer numValueOf;
        if (aweme != null && (numValueOf = Integer.valueOf(AwemeExtKt.getReviewStatus(aweme))) != null) {
            if (numValueOf.intValue() == 4) {
                return "in_progress";
            }
            if (numValueOf.intValue() == 5) {
                return "failed";
            }
            return "";
        }
        return "";
    }
}
