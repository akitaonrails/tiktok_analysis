package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerCacheSortSetting;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerColdCacheSortConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268971DrT extends C09AY implements Function0<PlayerColdCacheSortConfig> {
    public C2268971DrT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PlayerColdCacheSortConfig invoke() {
        Object c098200Yq;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            c098200Yq = C2268981DrU.LIZIZ;
            PlayerColdCacheSortConfig playerColdCacheSortConfig = (PlayerColdCacheSortConfig) c0c64LJIILLIIL.LJJIIJ(true, "player_cold_cache_sort_setting", 31744, PlayerColdCacheSortConfig.class, c098200Yq, 2);
            if (playerColdCacheSortConfig != null) {
                c098200Yq = playerColdCacheSortConfig;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C2268981DrU.LIZIZ;
        }
        PlayerColdCacheSortConfig playerColdCacheSortConfig2 = (PlayerColdCacheSortConfig) c098200Yq;
        if (playerColdCacheSortConfig2.coldCacheSorterCfg == null) {
            playerColdCacheSortConfig2.coldCacheSorterCfg = new PlayerCacheSortSetting(playerColdCacheSortConfig2.sortType, playerColdCacheSortConfig2.adjustSimilar, playerColdCacheSortConfig2.lowerNonVideoRank, null, playerColdCacheSortConfig2.dimensions, playerColdCacheSortConfig2.coefficients, playerColdCacheSortConfig2.minValues, playerColdCacheSortConfig2.maxValues, playerColdCacheSortConfig2.sortOmega, playerColdCacheSortConfig2.sortEPS, playerColdCacheSortConfig2.chunkSize, playerColdCacheSortConfig2.picPlayTimeParams, playerColdCacheSortConfig2.onlySortNoScore, playerColdCacheSortConfig2.maxLoopCount, playerColdCacheSortConfig2.needLocalSwap, 8, null);
        }
        return playerColdCacheSortConfig2;
    }
}
