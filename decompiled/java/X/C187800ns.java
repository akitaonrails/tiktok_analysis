package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.FullyCustomizedInputConfig;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveFullyCustomizedBoardItemMaxInputSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C187800ns extends C09AY implements Function0<FullyCustomizedInputConfig> {
    public C187800ns() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.FullyCustomizedInputConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FullyCustomizedInputConfig invoke() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FullyCustomizedInputConfig fullyCustomizedInputConfig = LiveFullyCustomizedBoardItemMaxInputSetting.DEFAULT;
        ?? valueSafely = settingsManager.getValueSafely("live_fully_customized_board_item_max_input", fullyCustomizedInputConfig);
        return valueSafely != 0 ? valueSafely : fullyCustomizedInputConfig;
    }
}
