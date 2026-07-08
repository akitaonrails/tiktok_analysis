package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveSecondaryBoardItemMaxInputSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.SecondaryBoardInputConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g6R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152730g6R extends C09AY implements Function0<SecondaryBoardInputConfig> {
    public C1152730g6R() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.SecondaryBoardInputConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SecondaryBoardInputConfig invoke() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SecondaryBoardInputConfig secondaryBoardInputConfig = LiveSecondaryBoardItemMaxInputSetting.DEFAULT;
        ?? valueSafely = settingsManager.getValueSafely("live_secondary_board_item_max_input", secondaryBoardInputConfig);
        return valueSafely != 0 ? valueSafely : secondaryBoardInputConfig;
    }
}
