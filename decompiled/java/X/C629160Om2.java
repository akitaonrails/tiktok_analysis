package X;

import com.ss.android.ugc.aweme.vibefeed.experiment.SharedFeedDynamicConfig;

/* JADX INFO: renamed from: X.0Om2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629160Om2 {
    public static final C629160Om2 LIZ = new C629160Om2();
    public static final SharedFeedDynamicConfig LIZIZ = new SharedFeedDynamicConfig(true, 15, 15, 15, 15);

    public static boolean LIZ() {
        return LIZIZ().enable;
    }

    public static SharedFeedDynamicConfig LIZIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SharedFeedDynamicConfig sharedFeedDynamicConfig = LIZIZ;
        SharedFeedDynamicConfig sharedFeedDynamicConfig2 = (SharedFeedDynamicConfig) c0c64LJIILLIIL.LJJII(SharedFeedDynamicConfig.class, sharedFeedDynamicConfig, "tt_shared_feed_config_count", true);
        return sharedFeedDynamicConfig2 != null ? sharedFeedDynamicConfig2 : sharedFeedDynamicConfig;
    }
}
