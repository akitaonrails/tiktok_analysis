package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310330CEl extends C09AY implements Function0<DispatchConfig> {
    public C310330CEl() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DispatchConfig invoke() {
        if (C104100aN.LIZ().isNewUser() && C1787906zN.LIZ()) {
            C310420CEu.LIZ.getClass();
            return C310420CEu.LIZJ;
        }
        String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("cold_boot_requests_control", "");
        if (string == null || string.length() == 0) {
            C310420CEu.LIZ.getClass();
            return C310420CEu.LIZIZ;
        }
        try {
            DispatchConfig dispatchConfig = (DispatchConfig) C309390CAv.LIZ(string, DispatchConfig.class);
            if (dispatchConfig != null) {
                return dispatchConfig;
            }
            C310420CEu.LIZ.getClass();
            return C310420CEu.LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C310420CEu.LIZ.getClass();
            return C310420CEu.LIZIZ;
        }
    }
}
