package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: X.05s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1487405s0 {
    public static HashSet<String> LIZ;
    public static final String LIZIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("real_idle_list", null);

    public static HashSet<String> LIZ() {
        try {
            String str = LIZIZ;
            if (str == null) {
                return LIZ;
            }
            if (LIZ == null) {
                LIZ = new HashSet<>();
                LIZ.addAll((ArrayList) new Gson().LJII(str, ArrayList.class));
            }
            return LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
