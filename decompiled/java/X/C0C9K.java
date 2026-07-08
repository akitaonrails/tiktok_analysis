package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerColdCachePoolConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C9K, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C9K extends C09AY implements Function0<PlayerColdCachePoolConfig> {
    public C0C9K() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final PlayerColdCachePoolConfig invoke() {
        PlayerColdCachePoolConfig playerColdCachePoolConfig;
        PlayerColdCachePoolConfig playerColdCachePoolConfig2;
        try {
            if (C07JK.LIZ()) {
                playerColdCachePoolConfig2 = C1ES5.LIZJ;
            } else {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                PlayerColdCachePoolConfig playerColdCachePoolConfig3 = C1ES5.LIZIZ;
                PlayerColdCachePoolConfig playerColdCachePoolConfig4 = (PlayerColdCachePoolConfig) c0c64LJIILLIIL.LJJIIJ(true, "player_cold_cache_pool_setting", 31744, PlayerColdCachePoolConfig.class, playerColdCachePoolConfig3, 2);
                playerColdCachePoolConfig2 = playerColdCachePoolConfig3;
                if (playerColdCachePoolConfig4 != null) {
                    playerColdCachePoolConfig2 = playerColdCachePoolConfig4;
                }
            }
            C189200o6.m2constructorimpl(playerColdCachePoolConfig2);
            playerColdCachePoolConfig = playerColdCachePoolConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            playerColdCachePoolConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(playerColdCachePoolConfig) != null ? C1ES5.LIZIZ : playerColdCachePoolConfig;
    }
}
