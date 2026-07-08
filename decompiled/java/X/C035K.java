package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomOspModulePluginConfig;

/* JADX INFO: renamed from: X.035K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035K {
    public static final EcomOspModulePluginConfig LIZ = new EcomOspModulePluginConfig(true, true, true, true, null);

    public static final EcomOspModulePluginConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomOspModulePluginConfig ecomOspModulePluginConfig = LIZ;
        EcomOspModulePluginConfig ecomOspModulePluginConfig2 = (EcomOspModulePluginConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_osp_module_plugin_fallback_settings", EcomOspModulePluginConfig.class, ecomOspModulePluginConfig);
        return ecomOspModulePluginConfig2 != null ? ecomOspModulePluginConfig2 : ecomOspModulePluginConfig;
    }
}
