package X;

import android.animation.AnimatorSet;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* JADX INFO: renamed from: X.0xC5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809710xC5 {
    public boolean LIZ;
    public AnimatorSet LIZIZ;
    public boolean LIZJ;

    public static boolean LIZ(RankListV2Response.Gap gap) {
        RankListV2Response.GapExtra gapExtra;
        RankListV2Response.GapClassRankExtra gapClassRankExtra;
        RankListV2Response.ClassRankLoopTips classRankLoopTips;
        Integer numValueOf;
        if (gap != null && (gapExtra = gap.gapExtra) != null && (gapClassRankExtra = gapExtra.classRankExtra) != null && (classRankLoopTips = gapClassRankExtra.loopTips) != null && (numValueOf = Integer.valueOf(classRankLoopTips.loopTipsType)) != null) {
            if (numValueOf.intValue() == 1 || numValueOf.intValue() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(RankListV2Response.Gap gap) {
        Integer numValueOf;
        RankListV2Response.GapExtra gapExtra;
        RankListV2Response.GapClassRankExtra gapClassRankExtra;
        RankListV2Response.ClassRankLoopTips classRankLoopTips;
        if (gap != null && (gapExtra = gap.gapExtra) != null && (gapClassRankExtra = gapExtra.classRankExtra) != null && (classRankLoopTips = gapClassRankExtra.loopTips) != null) {
            numValueOf = Integer.valueOf(classRankLoopTips.loopTipsType);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() != 2 || gap == null || gap.banInfo != 2) {
            return true;
        }
        return false;
    }
}
