package X;

import com.ss.android.ugc.aweme.ml.model.PreloadCommentMLModel;

/* JADX INFO: renamed from: X.0T1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740020T1c {
    public static boolean LIZ;
    public static PreloadCommentMLModel LIZIZ;
    public static int LIZJ;

    public static PreloadCommentMLModel LIZ() {
        if (!LIZ) {
            PreloadCommentMLModel preloadCommentMLModel = (PreloadCommentMLModel) C0C64.LJIILLIIL().LJJII(PreloadCommentMLModel.class, null, "smart_feed_preload_comment_ml", false);
            LIZIZ = preloadCommentMLModel;
            if (preloadCommentMLModel != null) {
                LIZJ = preloadCommentMLModel.getGroupId();
                LIZIZ.getClientAIThreshold();
                LIZIZ.getRecommendThreshold();
            }
            LIZ = true;
        }
        return LIZIZ;
    }

    public static boolean LIZIZ() {
        if (LIZ() != null) {
            return LIZ().getGroupId() == 5 || LIZJ == 6;
        }
        return false;
    }

    public static boolean LIZJ() {
        return LIZ() != null && LIZ().getGroupId() > 0;
    }
}
