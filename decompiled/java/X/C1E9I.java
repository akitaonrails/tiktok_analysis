package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creation.config.DMCameraSettingsConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E9I, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9I extends C09AY implements Function0<DMCameraSettingsConfig> {
    public C1E9I() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.creation.config.DMCameraSettingsConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final DMCameraSettingsConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DMCameraSettingsConfig dMCameraSettingsConfig = C1E9H.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("dm_camera_settings_config", DMCameraSettingsConfig.class, dMCameraSettingsConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : dMCameraSettingsConfig;
    }
}
