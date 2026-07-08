package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.legoImp.task.TryCatchConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Btm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302720Btm extends C09AY implements Function0<TryCatchConfig> {
    public C302720Btm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TryCatchConfig invoke() {
        String string;
        TryCatchConfig tryCatchConfig;
        try {
            string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("dynamic_try_catch_ab", "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C01GW c01gw = C302710Btl.LIZ;
        }
        if (string != null && string.length() != 0 && (tryCatchConfig = (TryCatchConfig) C309390CAv.LIZ(string, TryCatchConfig.class)) != null) {
            return tryCatchConfig;
        }
        C01GW c01gw2 = C302710Btl.LIZ;
        return null;
    }
}
