package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.04vN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1253504vN {
    public static boolean LIZ() {
        Boolean boolValueOf;
        return (!C1253204vK.LIZ() || (boolValueOf = Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("use_quick_view_monitor", false))) == null) ? C0C64.LJIILLIIL().LJIIIZ(31744, "use_quick_view_monitor", true, false) : boolValueOf.booleanValue();
    }
}
