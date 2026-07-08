package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.setting.SecureSDKConfigSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ae1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184191Ae1 extends C09AY implements Function0<SecureSDKConfigSetting.SecureSDkConfig> {
    public C2184191Ae1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.setting.SecureSDKConfigSetting$SecureSDkConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SecureSDKConfigSetting.SecureSDkConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SecureSDKConfigSetting.SecureSDkConfig secureSDkConfig = SecureSDKConfigSetting.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("commerce_sercurity_center_config", SecureSDKConfigSetting.SecureSDkConfig.class, secureSDkConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : secureSDkConfig;
    }
}
