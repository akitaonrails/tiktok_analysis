package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310310CEj extends C09AY implements Function0<DispatchConfig> {
    public C310310CEj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DispatchConfig invoke() {
        String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("xvv_requests_control", "");
        if (string == null || string.length() == 0) {
            C310410CEt.LIZ.getClass();
            return C310410CEt.LIZIZ;
        }
        try {
            DispatchConfig dispatchConfig = (DispatchConfig) C309390CAv.LIZ(string, DispatchConfig.class);
            if (dispatchConfig != null) {
                return dispatchConfig;
            }
            C310410CEt.LIZ.getClass();
            return C310410CEt.LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C310410CEt.LIZ.getClass();
            return C310410CEt.LIZIZ;
        }
    }
}
