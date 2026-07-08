package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.BottomGradualOptimizeConfig;

/* JADX INFO: renamed from: X.0R7B, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R7B {
    public static final int LIZ() {
        BottomGradualOptimizeConfig bottomGradualOptimizeConfig;
        try {
            C0C64.LJIILLIIL().getClass();
            bottomGradualOptimizeConfig = (BottomGradualOptimizeConfig) C0C64.LJJI(BottomGradualOptimizeConfig.class, "feed_bottom_gradual_optimize", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bottomGradualOptimizeConfig = new BottomGradualOptimizeConfig(0, 0.18f);
        }
        if (bottomGradualOptimizeConfig != null) {
            return bottomGradualOptimizeConfig.groupId;
        }
        return 0;
    }
}
