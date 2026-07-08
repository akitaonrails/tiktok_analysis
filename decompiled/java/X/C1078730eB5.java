package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePushGuideToFypConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePushGuideToFypExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eB5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078730eB5 extends C09AY implements Function0<LivePushGuideToFypConfig> {
    public C1078730eB5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.watchlive.LivePushGuideToFypConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LivePushGuideToFypConfig invoke() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePushGuideToFypConfig livePushGuideToFypConfig = LivePushGuideToFypExperiment.DEFAULT;
        ?? valueSafely = settingsManager.getValueSafely("live_push_guide_to_fyp", livePushGuideToFypConfig);
        return valueSafely != 0 ? valueSafely : livePushGuideToFypConfig;
    }
}
