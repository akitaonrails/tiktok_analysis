package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.AdaptExpConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15Dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20483815Dg extends C09AY implements Function0<AdaptExpConfig> {
    public C20483815Dg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.AdaptExpConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AdaptExpConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveInnerDowngradeAdaptExp.class);
        return valueSafely == 0 ? LiveInnerDowngradeAdaptExp.DEFAULT : valueSafely;
    }
}
