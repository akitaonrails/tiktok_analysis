package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C298730BnL {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5378));

    public static boolean LIZIZ() {
        return ((Number) LIZ.getValue()).intValue() == 1 && !C1360460lVU.LIZIZ.LJJIZ();
    }

    public static final boolean LIZ(Comment comment, Aweme aweme, boolean z) {
        if (!LIZIZ() || comment == null || z) {
            return false;
        }
        if (aweme != null && !C1360460lVU.LIZIZ.LJJIIJZLJL(aweme)) {
            return false;
        }
        if (comment.getCommentMediaType() == 5 && ((Number) C264150AWv.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }
}
