package Y;

import X.C09JN;
import X.C1587740rQ4;
import X.C1C7U;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabRedDotOptimizationSettings;

/* JADX INFO: loaded from: classes14.dex */
public class AfS1S0000200_13 implements C09JN {
    public final int $t;
    public long j0;
    public long j1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0000200_13 afS1S0000200_13, Object obj) {
        C1C7U.LIZ("RecentGidsService@4f41.deleteExpiredEntities$2");
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        long j = afS1S0000200_13.j0;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - afS1S0000200_13.j1;
        long j2 = FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds;
        c1587740rQ4.getClass();
        C1587740rQ4.LIZ(j, jElapsedRealtime, j2, true);
        C1C7U.LIZIZ("RecentGidsService@4f41.deleteExpiredEntities$2");
    }

    public static final void accept$1(AfS1S0000200_13 afS1S0000200_13, Object obj) {
        C1C7U.LIZ("RecentGidsService@4f41.deleteExpiredEntities$3");
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        long j = afS1S0000200_13.j0;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - afS1S0000200_13.j1;
        long j2 = FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds;
        c1587740rQ4.getClass();
        C1587740rQ4.LIZ(j, jElapsedRealtime, j2, false);
        C1C7U.LIZIZ("RecentGidsService@4f41.deleteExpiredEntities$3");
    }

    public AfS1S0000200_13(long j, long j2, int i) {
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}
