package X;

import com.ss.android.ugc.aweme.comment.experiment.CommentLongPressConfig;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0kyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339940kyO {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(650));

    public static boolean LIZ(Comment comment, boolean z) {
        CommentLongPressConfig commentLongPressConfig = (CommentLongPressConfig) LIZ.getValue();
        if (commentLongPressConfig != null && commentLongPressConfig.enable == 1 && !z) {
            if (comment == null || comment.getAliasAweme() == null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
