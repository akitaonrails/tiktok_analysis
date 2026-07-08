package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.settings.SaveLoginInfoPopupFrequencyModel;

/* JADX INFO: renamed from: X.0ilf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255170ilf {
    public static final SaveLoginInfoPopupFrequencyModel LIZ = new SaveLoginInfoPopupFrequencyModel(14, 3, 5, 24);

    public static final SaveLoginInfoPopupFrequencyModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModel = LIZ;
        SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModel2 = (SaveLoginInfoPopupFrequencyModel) settingsManagerLIZLLL.LJIIIIZZ("save_login_info_popup_frequency", SaveLoginInfoPopupFrequencyModel.class, saveLoginInfoPopupFrequencyModel);
        return saveLoginInfoPopupFrequencyModel2 != null ? saveLoginInfoPopupFrequencyModel2 : saveLoginInfoPopupFrequencyModel;
    }
}
