package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3FeedsDBConfig;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0rHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582260rHE {
    public final FriendsV3FeedResponse LIZ;
    public final EnumC599100Nee LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    public final C0N2U LIZ() {
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        return jCurrentTimeMillis <= ((long) C1582230rHB.LIZ().preloadExpiredTimeSecs) ? C0N2U.FRESH_ENOUGH : jCurrentTimeMillis <= ((long) (((FriendsV3FeedsDBConfig) C806540VkS.LIZIZ.getValue()).expiredTimeMins * 60)) ? C0N2U.NEED_UPDATE : C0N2U.OUT_OF_DATE;
    }

    public C1582260rHE(FriendsV3FeedResponse friendsV3FeedResponse, EnumC599100Nee enumC599100Nee, long j, int i) {
        this.LIZ = friendsV3FeedResponse;
        this.LIZIZ = enumC599100Nee;
        this.LIZJ = j;
        this.LIZLLL = i;
    }
}
