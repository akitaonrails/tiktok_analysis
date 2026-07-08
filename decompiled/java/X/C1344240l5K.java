package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.ZeroCommentOptConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0l5K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344240l5K {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        AwemeStatistics statistics;
        AwemeCommentConfig commentConfig;
        ZeroCommentOptConfig zeroCommentOptConfig;
        Long l;
        if (aweme == null) {
            return false;
        }
        AwemeCommentConfig commentConfig2 = aweme.getCommentConfig();
        if ((commentConfig2 != null && commentConfig2.pollId != null && C1344890l6N.LIZIZ()) || (statistics = aweme.getStatistics()) == null || statistics.getCommentCount() > 0 || (commentConfig = aweme.getCommentConfig()) == null || (zeroCommentOptConfig = commentConfig.zeroCommentOpt) == null || (l = zeroCommentOptConfig.expireTimeInSecond) == null) {
            return false;
        }
        long jLongValue = l.longValue();
        if (jLongValue <= 0 || jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT) < System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public static long LIZIZ(Aweme aweme) {
        AwemeCommentConfig commentConfig;
        ZeroCommentOptConfig zeroCommentOptConfig;
        Long l;
        if (aweme != null && (commentConfig = aweme.getCommentConfig()) != null && (zeroCommentOptConfig = commentConfig.zeroCommentOpt) != null && (l = zeroCommentOptConfig.expireTimeInSecond) != null) {
            return l.longValue();
        }
        return -1L;
    }
}
