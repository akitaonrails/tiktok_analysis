package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerColdCacheFetchConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867870yht extends C09AY implements Function0<PlayerColdCacheFetchConfig> {
    public C1867870yht() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final PlayerColdCacheFetchConfig invoke() {
        PlayerColdCacheFetchConfig playerColdCacheFetchConfig;
        PlayerColdCacheFetchConfig playerColdCacheFetchConfig2;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PlayerColdCacheFetchConfig playerColdCacheFetchConfig3 = C1ENV.LIZIZ;
            PlayerColdCacheFetchConfig playerColdCacheFetchConfig4 = (PlayerColdCacheFetchConfig) c0c64LJIILLIIL.LJJIIJ(true, "player_cold_cache_fetch_setting", 31744, PlayerColdCacheFetchConfig.class, playerColdCacheFetchConfig3, 2);
            if (playerColdCacheFetchConfig4 == null) {
                C1ENV.LIZ.getClass();
                playerColdCacheFetchConfig2 = playerColdCacheFetchConfig3;
            } else {
                playerColdCacheFetchConfig2 = playerColdCacheFetchConfig4;
            }
            C189200o6.m2constructorimpl(playerColdCacheFetchConfig2);
            playerColdCacheFetchConfig = playerColdCacheFetchConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            playerColdCacheFetchConfig = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(playerColdCacheFetchConfig) == null) {
            return playerColdCacheFetchConfig;
        }
        C1ENV.LIZ.getClass();
        return C1ENV.LIZIZ;
    }
}
