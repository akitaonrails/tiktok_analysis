package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.ab.abs.PlayerBizFormaterConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867810yhn extends C09AY implements Function0<PlayerBizFormaterConfig> {
    public C1867810yhn() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final PlayerBizFormaterConfig invoke() {
        PlayerBizFormaterConfig playerBizFormaterConfig;
        PlayerBizFormaterConfig playerBizFormaterConfig2;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PlayerBizFormaterConfig playerBizFormaterConfig3 = C1867820yho.LIZIZ;
            PlayerBizFormaterConfig playerBizFormaterConfig4 = (PlayerBizFormaterConfig) c0c64LJIILLIIL.LJJII(PlayerBizFormaterConfig.class, playerBizFormaterConfig3, "player_biz_formater_exp", true);
            if (playerBizFormaterConfig4 == null) {
                C1867820yho.LIZ.getClass();
                playerBizFormaterConfig2 = playerBizFormaterConfig3;
            } else {
                playerBizFormaterConfig2 = playerBizFormaterConfig4;
            }
            C189200o6.m2constructorimpl(playerBizFormaterConfig2);
            playerBizFormaterConfig = playerBizFormaterConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            playerBizFormaterConfig = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(playerBizFormaterConfig) == null) {
            return playerBizFormaterConfig;
        }
        C1867820yho.LIZ.getClass();
        return C1867820yho.LIZIZ;
    }
}
