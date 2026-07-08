package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0l2A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342280l2A {
    public static final float LIZ = ((Number) C07D1.LIZ.getValue()).floatValue();
    public static final int LIZIZ = ((Number) C1096104Ql.LIZ.getValue()).intValue();
    public static boolean LIZJ = true;
    public static final Keva LIZLLL = Keva.getRepo("COMMENT_PHOTO_GUIDE");
    public static final Set<String> LJ = new LinkedHashSet();

    public static boolean LIZLLL() {
        if (!LIZJ) {
            return false;
        }
        Keva keva = LIZLLL;
        long j = keva.getLong("COMMENT_PHOTO_GUIDE_SHOW_NEW_STRATEGY", 0L);
        int i = keva.getInt("COMMENT_PHOTO_GUIDE_SHOW_NEW_STRATEGY_TIMES", 0);
        if (j == 0) {
            return true;
        }
        if (j == -1) {
            return false;
        }
        return ((double) (System.currentTimeMillis() - j)) / 8.64E7d >= 14.0d || i > 3;
    }

    public static boolean LIZIZ(boolean z) {
        boolean z2 = LIZJ;
        if (z2) {
            Keva keva = LIZLLL;
            long j = keva.getLong("COMMENT_PHOTO_GUIDE_SHOW_NEW_STRATEGY", 0L);
            int i = keva.getInt("COMMENT_PHOTO_GUIDE_SHOW_NEW_STRATEGY_TIMES", 0);
            if (j == 0) {
                if (z) {
                    LJFF(i + 1, false);
                }
                return true;
            }
            if (j == -1) {
                LIZJ = false;
                return false;
            }
            if ((System.currentTimeMillis() - j) / 8.64E7d < 14.0d && i <= 3) {
                LIZJ = false;
                return false;
            }
            if (z) {
                LJFF(i + 1, false);
            }
            return true;
        }
        return z2;
    }

    public static boolean LIZJ(Aweme aweme) {
        AwemeStatistics statistics;
        if ((aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() == 0) || !LIZJ) {
            return false;
        }
        Keva keva = LIZLLL;
        long j = keva.getLong("COMMENT_AI_PHOTO_GUIDE_STRATEGY", 0L);
        int i = keva.getInt("COMMENT_AI_PHOTO_GUIDE_SHOW_STRATEGY_TIMES", 0);
        if (j == 0) {
            return true;
        }
        if (j == -1) {
            return false;
        }
        if ((System.currentTimeMillis() - j) / 8.64E7d >= LIZ || i > LIZIZ) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(Aweme aweme, boolean z) {
        AwemeStatistics statistics;
        if ((aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() == 0) || !LIZJ) {
            return false;
        }
        Keva keva = LIZLLL;
        long j = keva.getLong("COMMENT_AI_PHOTO_GUIDE_STRATEGY", 0L);
        int i = keva.getInt("COMMENT_AI_PHOTO_GUIDE_SHOW_STRATEGY_TIMES", 0);
        if (j == 0) {
            if (z) {
                LJ(i + 1, false);
            }
            return true;
        }
        if (j == -1) {
            LIZJ = false;
            return false;
        }
        if ((System.currentTimeMillis() - j) / 8.64E7d < LIZ && i <= LIZIZ) {
            LIZJ = false;
            return false;
        }
        if (z) {
            LJ(i + 1, false);
        }
        return true;
    }

    public static void LJ(int i, boolean z) {
        LIZJ = false;
        if (z) {
            LIZLLL.storeLong("COMMENT_AI_PHOTO_GUIDE_STRATEGY", -1L);
            return;
        }
        Keva keva = LIZLLL;
        keva.storeLong("COMMENT_AI_PHOTO_GUIDE_STRATEGY", System.currentTimeMillis());
        keva.storeInt("COMMENT_AI_PHOTO_GUIDE_SHOW_STRATEGY_TIMES", i);
        if (i < LIZIZ) {
            return;
        }
        keva.storeLong("COMMENT_AI_PHOTO_GUIDE_STRATEGY", -1L);
    }

    public static void LJFF(int i, boolean z) {
        LIZJ = false;
        if (z) {
            LIZLLL.storeLong("COMMENT_PHOTO_GUIDE_SHOW_NEW_STRATEGY", -1L);
            return;
        }
        Keva keva = LIZLLL;
        keva.storeLong("COMMENT_PHOTO_GUIDE_SHOW_NEW_STRATEGY", System.currentTimeMillis());
        keva.storeInt("COMMENT_PHOTO_GUIDE_SHOW_NEW_STRATEGY_TIMES", i);
        if (i < 3) {
            return;
        }
        keva.storeLong("COMMENT_PHOTO_GUIDE_SHOW_NEW_STRATEGY", -1L);
    }
}
