package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.VideoSmartCroppingSettingsConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15c7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20556115c7 extends C09AY implements Function0<VideoSmartCroppingSettingsConfig> {
    public C20556115c7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.experiment.VideoSmartCroppingSettingsConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ VideoSmartCroppingSettingsConfig invoke() {
        if (C293840BfS.LIZIZ) {
            return C20556015c6.LIZIZ;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        VideoSmartCroppingSettingsConfig videoSmartCroppingSettingsConfig = C20556015c6.LIZIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("video_smart_cropping_settings", VideoSmartCroppingSettingsConfig.class, videoSmartCroppingSettingsConfig);
        return LJIIIIZZ == 0 ? videoSmartCroppingSettingsConfig : LJIIIIZZ;
    }
}
