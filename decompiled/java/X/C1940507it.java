package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: X.07it, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1940507it {
    public static final String LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("app_background_list", null);
    public static HashSet<String> LIZIZ = null;

    public static HashSet<String> LIZ() {
        try {
            String str = LIZ;
            if (str == null) {
                return LIZIZ;
            }
            if (LIZIZ == null) {
                LIZIZ = new HashSet<>();
                LIZIZ.addAll((ArrayList) new Gson().LJII(str, ArrayList.class));
            }
            return LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZIZ;
        }
    }
}
