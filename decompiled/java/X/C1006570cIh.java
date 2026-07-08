package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.minis.api.instantplay.MinisInstantPlayConfigModel;

/* JADX INFO: renamed from: X.0cIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006570cIh {
    public static final MinisInstantPlayConfigModel LIZ = new MinisInstantPlayConfigModel(true, true, EnumC1006810cJ5.High.getScore(), EnumC1006810cJ5.High.getScore(), EnumC1006810cJ5.High.getScore(), 60000);

    public static final MinisInstantPlayConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MinisInstantPlayConfigModel minisInstantPlayConfigModel = LIZ;
        MinisInstantPlayConfigModel minisInstantPlayConfigModel2 = (MinisInstantPlayConfigModel) settingsManagerLIZLLL.LJIIIIZZ("minis_instant_play_config", MinisInstantPlayConfigModel.class, minisInstantPlayConfigModel);
        return minisInstantPlayConfigModel2 != null ? minisInstantPlayConfigModel2 : minisInstantPlayConfigModel;
    }
}
