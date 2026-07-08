package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel;

/* JADX INFO: renamed from: X.0C48, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C48 {
    public static final PromoteIconFlipFrequencySettingsModel LIZ = new PromoteIconFlipFrequencySettingsModel(false, 3000, Mp4ScreenVideoLoadTimeout.CONTROL, 3, 7);

    public static final PromoteIconFlipFrequencySettingsModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PromoteIconFlipFrequencySettingsModel promoteIconFlipFrequencySettingsModel = LIZ;
            PromoteIconFlipFrequencySettingsModel promoteIconFlipFrequencySettingsModel2 = (PromoteIconFlipFrequencySettingsModel) settingsManagerLIZLLL.LJIIIIZZ("promote_icon_flip_frequency_setting", PromoteIconFlipFrequencySettingsModel.class, promoteIconFlipFrequencySettingsModel);
            return promoteIconFlipFrequencySettingsModel2 != null ? promoteIconFlipFrequencySettingsModel2 : promoteIconFlipFrequencySettingsModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return LIZ;
        }
    }
}
