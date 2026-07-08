package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g6S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152740g6S extends C09AY implements Function0<LiveDedupOptExp.LiveDedupOptConfig> {
    public C1152740g6S() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp$LiveDedupOptConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveDedupOptExp.LiveDedupOptConfig invoke() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveDedupOptExp.LiveDedupOptConfig liveDedupOptConfig = LiveDedupOptExp.DEFAULT;
        ?? valueSafely = settingsManager.getValueSafely("live_dedup_opt_setting", liveDedupOptConfig);
        return valueSafely != 0 ? valueSafely : liveDedupOptConfig;
    }
}
