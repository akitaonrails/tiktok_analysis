package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.experiment.EcomTTSNewOspArchConfig;

/* JADX INFO: renamed from: X.03pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C963303pf {
    public static final EcomTTSNewOspArchConfig LIZ = new EcomTTSNewOspArchConfig(false, false);

    public static boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomTTSNewOspArchConfig ecomTTSNewOspArchConfig = LIZ;
        EcomTTSNewOspArchConfig ecomTTSNewOspArchConfig2 = (EcomTTSNewOspArchConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_new_osp_arch_settings", EcomTTSNewOspArchConfig.class, ecomTTSNewOspArchConfig);
        if (ecomTTSNewOspArchConfig2 != null) {
            ecomTTSNewOspArchConfig = ecomTTSNewOspArchConfig2;
        }
        return ecomTTSNewOspArchConfig.enable;
    }

    public static boolean LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomTTSNewOspArchConfig ecomTTSNewOspArchConfig = LIZ;
        EcomTTSNewOspArchConfig ecomTTSNewOspArchConfig2 = (EcomTTSNewOspArchConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_new_osp_arch_settings", EcomTTSNewOspArchConfig.class, ecomTTSNewOspArchConfig);
        if (ecomTTSNewOspArchConfig2 != null) {
            ecomTTSNewOspArchConfig = ecomTTSNewOspArchConfig2;
        }
        return ecomTTSNewOspArchConfig.enableSeaCombinedSku;
    }
}
