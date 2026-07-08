package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.repostfeed.experiment.RepostFeedConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583300rIu {
    public static final C1583300rIu LIZ = new C1583300rIu();
    public static final Map<String, RepostFeedConfig> LIZIZ = new LinkedHashMap();
    public static final RepostFeedConfig LIZJ = new RepostFeedConfig(0, 0, 0, 0, 0);

    static {
        new RepostFeedConfig(1, 1, 1, 0, 0);
        new RepostFeedConfig(1, 2, 1, 0, 0);
        new RepostFeedConfig(1, 2, 2, 0, 0);
        new RepostFeedConfig(1, 2, 5, 0, 0);
        new RepostFeedConfig(1, 6, 5, 0, 0);
        new RepostFeedConfig(1, 6, 5, 1, 0);
    }

    public static RepostFeedConfig LIZ() {
        Map<String, RepostFeedConfig> map = LIZIZ;
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID == null) {
            currentUserID = "";
        }
        Object obj = ((LinkedHashMap) map).get(currentUserID);
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        RepostFeedConfig repostFeedConfig = LIZJ;
        RepostFeedConfig repostFeedConfig2 = (RepostFeedConfig) c0c64LJIILLIIL.LJJII(RepostFeedConfig.class, repostFeedConfig, "repost_feed_in_friends", true);
        if (repostFeedConfig2 != null) {
            repostFeedConfig = repostFeedConfig2;
        }
        if (!Intrinsics.LJFF(obj, repostFeedConfig)) {
            String currentUserID2 = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            map.put(currentUserID2 != null ? currentUserID2 : "", repostFeedConfig);
            C1587150rP7.LIZIZ.LJ();
        }
        return repostFeedConfig;
    }

    public static boolean LIZIZ() {
        RepostFeedConfig repostFeedConfigLIZ = LIZ();
        return repostFeedConfigLIZ != null && repostFeedConfigLIZ.enableRepostFeed > 0;
    }

    public static boolean LIZJ() {
        RepostFeedConfig repostFeedConfigLIZ = LIZ();
        return repostFeedConfigLIZ != null && (repostFeedConfigLIZ.topReminder & 4) == 4;
    }
}
