package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;

/* JADX INFO: renamed from: X.0Pwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661290Pwl {
    public static final C661320Pwo LIZ(Aweme aweme) {
        long commentCount;
        AwemeStatistics statistics;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = 0;
        }
        return new C661320Pwo(commentCount);
    }
}
