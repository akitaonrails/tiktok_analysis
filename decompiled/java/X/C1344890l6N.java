package X;

import com.ss.android.ugc.aweme.comment.experiment.CommentPollConsumerConfig;
import com.ss.android.ugc.aweme.comment.experiment.CommentPollPublishConfig;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0l6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344890l6N {
    public static final CommentPollConsumerConfig LIZ = new CommentPollConsumerConfig(false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(644));

    public static final boolean LIZIZ() {
        CommentPollConsumerConfig commentPollConsumerConfig = (CommentPollConsumerConfig) LIZIZ.getValue();
        if (commentPollConsumerConfig == null) {
            commentPollConsumerConfig = LIZ;
        }
        if (commentPollConsumerConfig.enable) {
            return true;
        }
        CommentPollPublishConfig commentPollPublishConfig = (CommentPollPublishConfig) C1344900l6O.LIZIZ.getValue();
        if (commentPollPublishConfig == null) {
            commentPollPublishConfig = C1344900l6O.LIZ;
        }
        return commentPollPublishConfig.enable;
    }

    public static final boolean LIZ() {
        if (!LIZIZ()) {
            return false;
        }
        CommentPollConsumerConfig commentPollConsumerConfig = (CommentPollConsumerConfig) LIZIZ.getValue();
        if (commentPollConsumerConfig == null) {
            commentPollConsumerConfig = LIZ;
        }
        return commentPollConsumerConfig.badgeEnable;
    }
}
