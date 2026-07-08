package X;

import com.ss.android.ugc.aweme.ml.ab.FeedLoadMorePlan;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreStrategyConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0olX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485730olX {
    public static SmartFeedLoadMoreStrategyConfig LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static HashMap<Boolean, String> LIZLLL;

    public static SmartFeedLoadMoreStrategyConfig LIZ() {
        if (!LIZIZ) {
            SmartFeedLoadMoreStrategyConfig smartFeedLoadMoreStrategyConfig = null;
            SmartFeedLoadMoreStrategyConfig smartFeedLoadMoreStrategyConfig2 = (SmartFeedLoadMoreStrategyConfig) C0C64.LJIILLIIL().LJJII(SmartFeedLoadMoreStrategyConfig.class, null, "feed_load_more_strategy", true);
            LIZ = smartFeedLoadMoreStrategyConfig2;
            if (smartFeedLoadMoreStrategyConfig2 == null) {
                C2280591EOj.LIZ.getClass();
                C1511110pQT.LIZ.getClass();
                if (C1511110pQT.LIZ() && C2280591EOj.LIZJ.contains(C2280591EOj.LIZIZ)) {
                    smartFeedLoadMoreStrategyConfig = new SmartFeedLoadMoreStrategyConfig();
                    smartFeedLoadMoreStrategyConfig.setDefaultIndex(1);
                    smartFeedLoadMoreStrategyConfig.setLabelIndexMapping(C1697810uHb.LJ("lt_40s", "gt_40s"));
                    FeedLoadMorePlan feedLoadMorePlan = new FeedLoadMorePlan();
                    feedLoadMorePlan.setDelay(16);
                    feedLoadMorePlan.setPreload(true);
                    smartFeedLoadMoreStrategyConfig.setPlans(C1697810uHb.LJ(feedLoadMorePlan, new FeedLoadMorePlan()));
                }
                LIZ = smartFeedLoadMoreStrategyConfig;
            }
            LIZIZ = true;
        }
        return LIZ;
    }
}
