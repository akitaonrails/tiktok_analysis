package X;

import com.bytedance.ies.ugc.aweme.network.config.NetDispatchConfig;
import com.bytedance.ies.ugc.aweme.network.config.ThreadPoolConfig;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.0CEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310440CEw {
    public static final C310440CEw LIZ = new C310440CEw();
    public static final NetDispatchConfig LIZIZ = new NetDispatchConfig(false, true, true, 3, 0, new ThreadPoolConfig(1, Integer.MAX_VALUE, 10, -19), new ThreadPoolConfig(8, 8, 30, 0), new ThreadPoolConfig(1, 1, 10, 10), new ThreadPoolConfig(8, 8, 10, 10), 2, 5, 65536);
    public static final NetDispatchConfig LIZJ = new NetDispatchConfig(true, true, true, 3, 0, new ThreadPoolConfig(1, Integer.MAX_VALUE, 10, -19), new ThreadPoolConfig(8, 8, 30, 0), new ThreadPoolConfig(1, 1, 10, 10), new ThreadPoolConfig(8, 8, 10, 10), 2, 5, 65536);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C310430CEv());

    public static NetDispatchConfig LIZ() {
        return (NetDispatchConfig) LIZLLL.getValue();
    }

    public static final void LIZIZ() {
        Object objLJJII = C0C64.LJIILLIIL().LJJII(NetDispatchConfig.class, LIZIZ, "net_dispatch_config", true);
        if (objLJJII != null) {
            Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
            String strLIZIZ = C309390CAv.LIZIZ(objLJJII);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            repo.storeString("net_dispatch_config", strLIZIZ);
        }
    }
}
