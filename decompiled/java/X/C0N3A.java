package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.ab.abs.prender.PlayerPrerenderConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N3A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N3A extends C09AY implements Function0<PlayerPrerenderConfig> {
    public C0N3A() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final PlayerPrerenderConfig invoke() {
        PlayerPrerenderConfig playerPrerenderConfig;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PlayerPrerenderConfig playerPrerenderConfig2 = C0N3B.LIZIZ;
            PlayerPrerenderConfig playerPrerenderConfig3 = (PlayerPrerenderConfig) c0c64LJIILLIIL.LJJIIJ(true, "player_prerender_config", 31744, PlayerPrerenderConfig.class, playerPrerenderConfig2, 2);
            PlayerPrerenderConfig playerPrerenderConfig4 = playerPrerenderConfig2;
            if (playerPrerenderConfig3 != null) {
                playerPrerenderConfig4 = playerPrerenderConfig3;
            }
            C189200o6.m2constructorimpl(playerPrerenderConfig4);
            playerPrerenderConfig = playerPrerenderConfig4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            playerPrerenderConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(playerPrerenderConfig) != null ? C0N3B.LIZIZ : playerPrerenderConfig;
    }
}
