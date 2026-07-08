package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;

/* JADX INFO: renamed from: X.0Ntd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608390Ntd {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        long playCount;
        C0NNE c0nneLIZ;
        String str;
        if (!C304900BxI.LIZ()) {
            return false;
        }
        if (((Number) C267630AeH.LIZ.getValue()).intValue() >= 0) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                playCount = statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            if (playCount >= ((Number) r1.getValue()).intValue() && (c0nneLIZ = C600100NgG.LIZ(aweme)) != null && c0nneLIZ.LIZIZ != 1 && (str = c0nneLIZ.LIZJ) != null && str.length() != 0 && c0nneLIZ.LIZJ.length() <= 30) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (!C304900BxI.LIZ() || aweme.getAddYoursRecommendation() == null) {
            return false;
        }
        String topicText = aweme.getAddYoursRecommendation().getTopicText();
        if (!C703302op.LIZ(topicText) || topicText.length() >= 30) {
            return false;
        }
        return true;
    }
}
