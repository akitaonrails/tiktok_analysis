package X;

import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;

/* JADX INFO: renamed from: X.0l2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342560l2c {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(CommentContextSource commentContextSource, C19EG c19eg, CommentSyncSharedVM commentSyncSharedVM, String str, int i) {
        int i2;
        AwemeStatistics statistics;
        C442480HWs state;
        C291001Au<C446370Het> c291001Au;
        C446370Het c446370Het;
        CommentCommonModel commonModel;
        AwemeStatistics statistics2;
        C442480HWs state2;
        C291001Au<C446370Het> c291001Au2;
        C446370Het c446370Het2;
        CommentCommonModel commonModel2;
        EnumC1342450l2R currSortType;
        if ((i & 4) != 0) {
            commentSyncSharedVM = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if (commentContextSource != null && (currSortType = commentContextSource.getCurrSortType()) != null) {
            i2 = C1342480l2U.LIZ[currSortType.ordinal()];
        } else {
            i2 = -1;
        }
        long commentCount = 0;
        boolean zIsNoPermissionVideoFromCommentHistory = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (str == null) {
                            C1342570l2d c1342570l2d = C1342570l2d.LIZ;
                            Aweme aweme = CommentContextSourceKt.aweme(commentContextSource);
                            if (commentContextSource != null && (commonModel2 = commentContextSource.getCommonModel()) != null) {
                                zIsNoPermissionVideoFromCommentHistory = commonModel2.isNoPermissionVideoFromCommentHistory();
                            }
                            if (commentSyncSharedVM != null && (state2 = commentSyncSharedVM.getState()) != null && (c291001Au2 = state2.LL) != null && (c446370Het2 = c291001Au2.LIZ) != null) {
                                commentCount = c446370Het2.LIZIZ;
                            } else {
                                Aweme aweme2 = CommentContextSourceKt.aweme(commentContextSource);
                                if (aweme2 != null && (statistics2 = aweme2.getStatistics()) != null) {
                                    commentCount = statistics2.getCommentCount();
                                }
                            }
                            c1342570l2d.getClass();
                            return C1342570l2d.LIZ(aweme, zIsNoPermissionVideoFromCommentHistory, commentCount, c19eg);
                        }
                    } else {
                        if (c19eg == null) {
                            return null;
                        }
                        return c19eg.getString(2131829031);
                    }
                } else {
                    if (c19eg == null) {
                        return null;
                    }
                    return c19eg.getString(2131829034);
                }
            } else {
                if (c19eg == null) {
                    return null;
                }
                return c19eg.getString(2131829032);
            }
        } else if (str == null) {
            C1342570l2d c1342570l2d2 = C1342570l2d.LIZ;
            Aweme aweme3 = CommentContextSourceKt.aweme(commentContextSource);
            if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
                zIsNoPermissionVideoFromCommentHistory = commonModel.isNoPermissionVideoFromCommentHistory();
            }
            if (commentSyncSharedVM != null && (state = commentSyncSharedVM.getState()) != null && (c291001Au = state.LL) != null && (c446370Het = c291001Au.LIZ) != null) {
                commentCount = c446370Het.LIZIZ;
            } else {
                Aweme aweme4 = CommentContextSourceKt.aweme(commentContextSource);
                if (aweme4 != null && (statistics = aweme4.getStatistics()) != null) {
                    commentCount = statistics.getCommentCount();
                }
            }
            c1342570l2d2.getClass();
            return C1342570l2d.LIZ(aweme3, zIsNoPermissionVideoFromCommentHistory, commentCount, c19eg);
        }
        return str;
    }
}
