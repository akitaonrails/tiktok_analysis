package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EComImageConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.18OW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18OW {
    public static final EComImageConfig LIZ = new EComImageConfig(LSPassThroughRecordSizeConfig.DEFAULT, 100, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 1);

    public static final EComImageConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EComImageConfig eComImageConfig = LIZ;
        EComImageConfig eComImageConfig2 = (EComImageConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_image_anchor_settings_config", EComImageConfig.class, eComImageConfig);
        return eComImageConfig2 != null ? eComImageConfig2 : eComImageConfig;
    }
}
