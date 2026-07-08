package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcEuConfigurationModel;

/* JADX INFO: renamed from: X.0vWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745770vWx {
    public static final EcEuConfigurationModel LIZ = new EcEuConfigurationModel(false, 0);

    public static final EcEuConfigurationModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcEuConfigurationModel ecEuConfigurationModel = LIZ;
        EcEuConfigurationModel ecEuConfigurationModel2 = (EcEuConfigurationModel) settingsManagerLIZLLL.LJIIIIZZ("ec_address_popup_config", EcEuConfigurationModel.class, ecEuConfigurationModel);
        return ecEuConfigurationModel2 != null ? ecEuConfigurationModel2 : ecEuConfigurationModel;
    }
}
