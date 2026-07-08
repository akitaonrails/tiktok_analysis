package X;

import com.bytedance.ies.ugc.aweme.network.config.NetDispatchConfig;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310430CEv extends C09AY implements Function0<NetDispatchConfig> {
    public C310430CEv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.ies.ugc.aweme.network.config.NetDispatchConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final NetDispatchConfig invoke() {
        if (C104100aN.LIZ().isNewUser() && C1787906zN.LIZ()) {
            C310440CEw.LIZ.getClass();
            return C310440CEw.LIZJ;
        }
        String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("net_dispatch_config", "");
        if (!C123100dR.LIZ(string)) {
            C310440CEw.LIZ.getClass();
            return C310440CEw.LIZIZ;
        }
        ?? LIZ = C309390CAv.LIZ(string, NetDispatchConfig.class);
        if (LIZ != 0) {
            return LIZ;
        }
        C310440CEw.LIZ.getClass();
        return C310440CEw.LIZIZ;
    }
}
