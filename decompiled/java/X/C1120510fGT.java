package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.framework.settings.PromotionContainerConfig;

/* JADX INFO: renamed from: X.0fGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120510fGT {
    public static final PromotionContainerConfig LIZ = new PromotionContainerConfig(true, 2000, 4000, 30000, Integer.MAX_VALUE);

    public static final PromotionContainerConfig LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PromotionContainerConfig promotionContainerConfig = LIZ;
            PromotionContainerConfig promotionContainerConfig2 = (PromotionContainerConfig) settingsManagerLIZLLL.LJIIIIZZ("ttec_live_promotion_container_config", PromotionContainerConfig.class, promotionContainerConfig);
            return promotionContainerConfig2 != null ? promotionContainerConfig2 : promotionContainerConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
