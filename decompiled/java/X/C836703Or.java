package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsCashierCommonFallbackConfig;

/* JADX INFO: renamed from: X.03Or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C836703Or {
    public static final PipoTtsCashierCommonFallbackConfig LIZ = new PipoTtsCashierCommonFallbackConfig(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);

    public static final PipoTtsCashierCommonFallbackConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsCashierCommonFallbackConfig pipoTtsCashierCommonFallbackConfig = LIZ;
        PipoTtsCashierCommonFallbackConfig pipoTtsCashierCommonFallbackConfig2 = (PipoTtsCashierCommonFallbackConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_cashier_common_fallback_config", PipoTtsCashierCommonFallbackConfig.class, pipoTtsCashierCommonFallbackConfig);
        return pipoTtsCashierCommonFallbackConfig2 != null ? pipoTtsCashierCommonFallbackConfig2 : pipoTtsCashierCommonFallbackConfig;
    }
}
