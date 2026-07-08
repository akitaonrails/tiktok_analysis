package X;

import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankEntranceAnimationTypeConfig;

/* JADX INFO: renamed from: X.0y2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842480y2w {
    public static boolean LIZ(int i) {
        return C1697810uHb.LJIIJJI(RankAnimationType.LJIIIZ, RankAnimationType.LJIIJ, RankAnimationType.LJIILLIIL, RankAnimationType.LJIIZILJ, RankAnimationType.LIZIZ, RankAnimationType.LJI, RankAnimationType.LJII).contains(LIZLLL(i));
    }

    public static boolean LIZIZ(int i) {
        return C1697810uHb.LJIIJJI(RankAnimationType.LJ, RankAnimationType.LJIILL, RankAnimationType.LJIIIZ, RankAnimationType.LJIIJ, RankAnimationType.LJIILLIIL, RankAnimationType.LJIIZILJ).contains(LIZLLL(i));
    }

    public static boolean LIZJ(int i) {
        return C1697810uHb.LJIIJJI(RankAnimationType.LIZ, RankAnimationType.LIZIZ, RankAnimationType.LJIIIIZZ, RankAnimationType.LJIILIIL, RankAnimationType.LJIILL).contains(LIZLLL(i));
    }

    public static RankAnimationType LIZLLL(int i) {
        RankAnimationType rankAnimationType = RankEntranceAnimationTypeConfig.INSTANCE.getValue().get(Integer.valueOf(i));
        if (rankAnimationType == null) {
            return RankAnimationType.LIZLLL;
        }
        return rankAnimationType;
    }
}
