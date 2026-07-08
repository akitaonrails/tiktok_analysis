package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcProductAddConfig;

/* JADX INFO: renamed from: X.13Tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20017113Tt {
    public static final EcProductAddConfig LIZ = new EcProductAddConfig(false, 7, 7, 10, 30);

    public static final EcProductAddConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcProductAddConfig ecProductAddConfig = LIZ;
        EcProductAddConfig ecProductAddConfig2 = (EcProductAddConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_show_add_product_bottom_button_config", EcProductAddConfig.class, ecProductAddConfig);
        return ecProductAddConfig2 != null ? ecProductAddConfig2 : ecProductAddConfig;
    }
}
