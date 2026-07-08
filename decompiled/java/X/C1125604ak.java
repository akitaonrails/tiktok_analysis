package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.promote.model.BottomBannerFrequencySettingModel;

/* JADX INFO: renamed from: X.04ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1125604ak {
    public static final BottomBannerFrequencySettingModel LIZ = new BottomBannerFrequencySettingModel(4, 2, 4, 3, 30, Boolean.FALSE);

    public static final BottomBannerFrequencySettingModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            BottomBannerFrequencySettingModel bottomBannerFrequencySettingModel = LIZ;
            BottomBannerFrequencySettingModel bottomBannerFrequencySettingModel2 = (BottomBannerFrequencySettingModel) settingsManagerLIZLLL.LJIIIIZZ("promote_bottom_banner_frequency_setting", BottomBannerFrequencySettingModel.class, bottomBannerFrequencySettingModel);
            return bottomBannerFrequencySettingModel2 != null ? bottomBannerFrequencySettingModel2 : bottomBannerFrequencySettingModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return LIZ;
        }
    }
}
