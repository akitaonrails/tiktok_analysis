package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: X.05rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1483905rR {
    public static final String LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("shoot_high_priority_request_set", null);
    public static HashSet<String> LIZIZ = null;

    public static HashSet<String> LIZ() {
        try {
            String str = LIZ;
            if (str == null) {
                return LIZIZ;
            }
            if (LIZIZ == null) {
                LIZIZ = new HashSet<>();
                LIZIZ.addAll((ArrayList) C7740030o.LIZ().getGson().LJII(str, ArrayList.class));
            }
            return LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZIZ;
        }
    }
}
