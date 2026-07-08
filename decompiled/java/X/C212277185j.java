package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.EcomLivePinFlipperConfig;

/* JADX INFO: renamed from: X.185j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212277185j {
    public static final EcomLivePinFlipperConfig LIZ = new EcomLivePinFlipperConfig(20000, 1);

    public static final EcomLivePinFlipperConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomLivePinFlipperConfig ecomLivePinFlipperConfig = LIZ;
        EcomLivePinFlipperConfig ecomLivePinFlipperConfig2 = (EcomLivePinFlipperConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_live_pin_flipper_setting", EcomLivePinFlipperConfig.class, ecomLivePinFlipperConfig);
        return ecomLivePinFlipperConfig2 != null ? ecomLivePinFlipperConfig2 : ecomLivePinFlipperConfig;
    }
}
