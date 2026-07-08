package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperiment;

/* JADX INFO: renamed from: X.071Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C071Z {
    public static boolean LIZ() {
        if (!ViewStubOptExperiment.hasInit) {
            ViewStubOptExperiment.hasInit = true;
            if (C104100aN.LIZ().isNewUser() && C1787906zN.LIZ()) {
                ViewStubOptExperiment.expVal = true;
            } else {
                ViewStubOptExperiment.expVal = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean(ViewStubOptExperiment.KEY, true);
            }
        }
        return ViewStubOptExperiment.expVal;
    }
}
