package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.explore.experiment.performance.ExploreImageCacheStrategyConfig;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0kqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335180kqi {
    public static final ExploreImageCacheStrategyConfig LIZ = new ExploreImageCacheStrategyConfig(false, false, true, false, 30, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(51));

    public static final ExploreImageCacheStrategyConfig LIZJ() {
        return (ExploreImageCacheStrategyConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        return LIZJ().enable && LIZJ().boostPreloadPriority;
    }

    public static boolean LIZIZ() {
        return LIZJ().enable && LIZJ().fallbackToPhotoModeCache;
    }

    public static boolean LIZLLL() {
        if (!LIZJ().enable || !LIZJ().enable || !LIZJ().enableCustomCache) {
            return false;
        }
        EnumC1335310kqv enumC1335310kqvLIZLLL = C1336210ksN.LIZLLL();
        if (enumC1335310kqvLIZLLL == EnumC1335310kqv.EXTREME_LOW || enumC1335310kqvLIZLLL == EnumC1335310kqv.ULTRA_LOW || enumC1335310kqvLIZLLL == EnumC1335310kqv.LOW) {
            return Keva.getRepo("explore_feed_image_repo").getBoolean("has_used_explore_feed_image_disk", false);
        }
        return true;
    }
}
