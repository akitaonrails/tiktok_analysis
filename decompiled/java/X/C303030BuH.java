package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303030BuH extends C09AY implements Function0<List<? extends String>> {
    public C303030BuH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("cold_boot_request_order", "");
        if (string == null || string.length() == 0) {
            return C303040BuI.LIZ;
        }
        try {
            return (List) C309390CAv.LIZ(string, List.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C303040BuI.LIZ;
        }
    }
}
