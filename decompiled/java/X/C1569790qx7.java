package X;

import com.ss.android.ugc.aweme.perf.FollowingMemoryOptimizeConfig;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0qx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569790qx7 {
    public static final FollowingMemoryOptimizeConfig LIZ = new FollowingMemoryOptimizeConfig(false, 10);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(625));

    public static int LIZ() {
        C01GW c01gw = LIZIZ;
        if (((FollowingMemoryOptimizeConfig) c01gw.getValue()).enable) {
            return ((FollowingMemoryOptimizeConfig) c01gw.getValue()).leaveCount;
        }
        return -1;
    }
}
