package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.measurement.video.VideoMeasurementConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Msj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C582350Msj extends C09AY implements Function0<VideoMeasurementConfig> {
    public C582350Msj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.measurement.video.VideoMeasurementConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final VideoMeasurementConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        VideoMeasurementConfig videoMeasurementConfig = C582340Msi.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("commerce_video_measurement_config", VideoMeasurementConfig.class, videoMeasurementConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : videoMeasurementConfig;
    }
}
