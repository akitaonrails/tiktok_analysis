package X;

import Y.AObjectS398S0100000_24;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.perf.FollowingLowMemTrimV2Config;

/* JADX INFO: renamed from: X.0rRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588490rRH implements InterfaceC1569780qx6 {
    public final /* synthetic */ FeedFollowFragment LIZ;

    @Override // X.InterfaceC1569780qx6
    public final void onRelease() {
        this.LIZ.LLL = true;
        C01GW c01gw = C1588530rRL.LIZIZ;
        if (((FollowingLowMemTrimV2Config) c01gw.getValue()).enable) {
            int i = ((FollowingLowMemTrimV2Config) c01gw.getValue()).trigger;
            if (i == 0 || i == 2) {
                C494201wC.LIZIZ(((FollowingLowMemTrimV2Config) c01gw.getValue()).leaveTabDelayMs, new AObjectS398S0100000_24(this, 12));
            }
        }
    }

    public C1588490rRH(FeedFollowFragment feedFollowFragment) {
        this.LIZ = feedFollowFragment;
    }
}
