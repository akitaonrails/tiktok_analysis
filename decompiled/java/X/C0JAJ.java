package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInjectLiveFeatureSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JAJ extends C09AY implements Function0<Boolean> {
    public C0JAJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("live_inject_feature_for_feed", LiveInjectLiveFeatureSetting.DEFAULT));
    }
}
