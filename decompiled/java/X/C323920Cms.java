package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveSkylightComprehensionSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Cms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323920Cms extends C09AY implements Function0<Boolean> {
    public C323920Cms() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        LiveSkylightComprehensionSetting liveSkylightComprehensionSetting = LiveSkylightComprehensionSetting.INSTANCE;
        boolean dynamicValue = liveSkylightComprehensionSetting.getDynamicValue();
        boolean z = LiveSkylightComprehensionSetting.DEFAULT;
        return dynamicValue != z ? Boolean.valueOf(liveSkylightComprehensionSetting.getDynamicValue()) : Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("enable_skylight_fyp_only", z));
    }
}
