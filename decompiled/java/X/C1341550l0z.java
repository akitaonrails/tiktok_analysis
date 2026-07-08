package X;

import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0l0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341550l0z {
    public static final C1341550l0z LIZ = new C1341550l0z();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1185));

    public static boolean LIZ(Aweme aweme) {
        if (((Number) LIZIZ.getValue()).intValue() > 0 && aweme != null) {
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(AwemeExtKt.getAuthorUid(aweme))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        boolean z;
        AwemeStatistics statistics;
        if (LIZ(CommentContextSourceKt.aweme(commentContextSource)) && ((Number) LIZIZ.getValue()).intValue() == 2) {
            if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
                boolean zIsLandscapeMode = commonModel.isLandscapeMode();
                boolean z2 = commonModel.blockSortFeatInFriendsV3;
                Aweme aweme = commonModel.aweme;
                if (aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!zIsLandscapeMode && !z2 && !z) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
