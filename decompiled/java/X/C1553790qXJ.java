package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0qXJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553790qXJ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(56));

    public static boolean LIZ() {
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("new_user_exp_flag", false) ? ((Number) LIZ.getValue()).intValue() == 1 : C104100aN.LIZ().LJJIJ(AFwS212S0000000_23.get$arr$(57));
    }
}
