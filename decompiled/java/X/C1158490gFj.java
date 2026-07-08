package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.CommentFilterSpeedConfig;
import com.ss.android.ugc.aweme.experiment.ResolvedCommentFilterSpeedConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158490gFj {
    public static final CommentFilterSpeedConfig LIZ = new CommentFilterSpeedConfig(Boolean.FALSE, 0, 100, 0);

    public static ResolvedCommentFilterSpeedConfig LIZIZ() {
        CommentFilterSpeedConfig commentFilterSpeedConfig;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            commentFilterSpeedConfig = LIZ;
            CommentFilterSpeedConfig commentFilterSpeedConfig2 = (CommentFilterSpeedConfig) c0c64LJIILLIIL.LJJII(CommentFilterSpeedConfig.class, commentFilterSpeedConfig, "tt_comment_filter_speed_exp_v1", true);
            if (commentFilterSpeedConfig2 != null) {
                commentFilterSpeedConfig = commentFilterSpeedConfig2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            commentFilterSpeedConfig = LIZ;
        }
        boolean zLJFF = Intrinsics.LJFF(commentFilterSpeedConfig.enableClickLatencyReduction, Boolean.TRUE);
        Integer num = commentFilterSpeedConfig.animationDurationMs;
        int iIntValue = 0;
        int iIntValue2 = (num == null || num.intValue() <= 0) ? 0 : num.intValue();
        Integer num2 = commentFilterSpeedConfig.openDelayMs;
        int iIntValue3 = (num2 == null || num2.intValue() < 0) ? 100 : num2.intValue();
        Integer num3 = commentFilterSpeedConfig.filterIconHitAreaSize;
        if (num3 != null && num3.intValue() > 0) {
            iIntValue = num3.intValue();
        }
        return new ResolvedCommentFilterSpeedConfig(zLJFF, iIntValue2, iIntValue3, iIntValue);
    }

    public static boolean LIZ() {
        return LIZIZ().enableClickLatencyReduction;
    }
}
