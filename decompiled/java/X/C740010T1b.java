package X;

import com.ss.android.ugc.aweme.ml.model.PreloadCommentMLModel;

/* JADX INFO: renamed from: X.0T1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740010T1b {
    public static final C01GW LIZ = C452501pT.LIZIZ(new AnonymousClass0527());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C740000T1a());

    public static PreloadCommentMLModel LIZIZ() {
        return (PreloadCommentMLModel) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        boolean z = false;
        if (LIZIZ() == null) {
            return false;
        }
        PreloadCommentMLModel preloadCommentMLModelLIZIZ = LIZIZ();
        if (preloadCommentMLModelLIZIZ != null && preloadCommentMLModelLIZIZ.getGroupId() == 0) {
            z = true;
        }
        return !z;
    }

    public static boolean LIZJ() {
        PreloadCommentMLModel preloadCommentMLModelLIZIZ = LIZIZ();
        if (preloadCommentMLModelLIZIZ != null && preloadCommentMLModelLIZIZ.getGroupId() == 4) {
            return true;
        }
        PreloadCommentMLModel preloadCommentMLModelLIZIZ2 = LIZIZ();
        return preloadCommentMLModelLIZIZ2 != null && preloadCommentMLModelLIZIZ2.getGroupId() == 5;
    }
}
