package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.04tD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1240104tD {
    public static final String LIZ;

    static {
        boolean zLJ;
        try {
            zLJ = C08Q0.LJ(C1BWL.LIZ(), "isInTikTokRegionForAbTestInit", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLJ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("isInTikTokRegionForAbTestInit", false);
        }
        LIZ = zLJ ? "https://libra-sg.tiktokv.com/common" : "https://libra-va.tiktokv.com/common";
    }
}
