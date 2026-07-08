package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerColdCacheFetchFrequencyConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867880yhu extends C09AY implements Function0<PlayerColdCacheFetchFrequencyConfig> {
    public C1867880yhu() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final PlayerColdCacheFetchFrequencyConfig invoke() {
        PlayerColdCacheFetchFrequencyConfig playerColdCacheFetchFrequencyConfig;
        PlayerColdCacheFetchFrequencyConfig playerColdCacheFetchFrequencyConfig2;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PlayerColdCacheFetchFrequencyConfig playerColdCacheFetchFrequencyConfig3 = C2281291ERb.LIZIZ;
            PlayerColdCacheFetchFrequencyConfig playerColdCacheFetchFrequencyConfig4 = (PlayerColdCacheFetchFrequencyConfig) c0c64LJIILLIIL.LJJIIJ(true, "player_cold_cache_fetch_frequency_exp", 31744, PlayerColdCacheFetchFrequencyConfig.class, playerColdCacheFetchFrequencyConfig3, 2);
            if (playerColdCacheFetchFrequencyConfig4 == null) {
                C2281291ERb.LIZ.getClass();
                playerColdCacheFetchFrequencyConfig2 = playerColdCacheFetchFrequencyConfig3;
            } else {
                playerColdCacheFetchFrequencyConfig2 = playerColdCacheFetchFrequencyConfig4;
            }
            C189200o6.m2constructorimpl(playerColdCacheFetchFrequencyConfig2);
            playerColdCacheFetchFrequencyConfig = playerColdCacheFetchFrequencyConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            playerColdCacheFetchFrequencyConfig = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(playerColdCacheFetchFrequencyConfig) == null) {
            return playerColdCacheFetchFrequencyConfig;
        }
        C2281291ERb.LIZ.getClass();
        return C2281291ERb.LIZIZ;
    }
}
