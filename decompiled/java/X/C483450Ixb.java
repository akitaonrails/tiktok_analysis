package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveSurveyFeaturesConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveSurveyFeaturesSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ixb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483450Ixb extends C09AY implements Function0<LiveSurveyFeaturesConfig> {
    public C483450Ixb() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.other.LiveSurveyFeaturesConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveSurveyFeaturesConfig invoke() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSurveyFeaturesConfig liveSurveyFeaturesConfig = LiveSurveyFeaturesSetting.DEFAULT;
        ?? valueSafely = settingsManager.getValueSafely("collect_live_survey_features", liveSurveyFeaturesConfig);
        return valueSafely != 0 ? valueSafely : liveSurveyFeaturesConfig;
    }
}
