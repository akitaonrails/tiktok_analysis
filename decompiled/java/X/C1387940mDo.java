package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.CommentPreloadInfo;

/* JADX INFO: renamed from: X.0mDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387940mDo {
    public static final int LIZ(Aweme aweme) {
        AwemeCommentConfig commentConfig;
        CommentPreloadInfo commentPreloadInfo;
        if (aweme != null && (commentConfig = aweme.getCommentConfig()) != null && (commentPreloadInfo = commentConfig.preload) != null) {
            return commentPreloadInfo.type;
        }
        return 0;
    }
}
