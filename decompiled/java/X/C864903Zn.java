package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.ConfigModel;

/* JADX INFO: renamed from: X.03Zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C864903Zn {
    public static final C864903Zn LIZ = new C864903Zn();
    public static final ConfigModel LIZIZ = new ConfigModel(null, false, false, false, false, false, 63, null);

    public static final ConfigModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ConfigModel configModel = LIZIZ;
        ConfigModel configModel2 = (ConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_installment_rec_opt", ConfigModel.class, configModel);
        return configModel2 != null ? configModel2 : configModel;
    }

    public static boolean LIZ(String str) {
        if (str != null) {
            return LIZIZ().enabledPmList.contains(str);
        }
        return false;
    }
}
