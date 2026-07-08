package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcButtonConfig;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcButtonConfigSetting;
import java.util.Map;

/* JADX INFO: renamed from: X.13Ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20018213Ue {
    public static final EcButtonConfigSetting LIZ = new EcButtonConfigSetting(null, null);

    public static final EcButtonConfigSetting LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcButtonConfigSetting ecButtonConfigSetting = LIZ;
        EcButtonConfigSetting ecButtonConfigSetting2 = (EcButtonConfigSetting) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_common_bottom_button_config", EcButtonConfigSetting.class, ecButtonConfigSetting);
        return ecButtonConfigSetting2 != null ? ecButtonConfigSetting2 : ecButtonConfigSetting;
    }

    public static EcButtonConfig LIZIZ(String str) {
        Map<String, EcButtonConfig> map = LIZ().configs;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
