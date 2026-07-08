package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.applog.ConfigModel;

/* JADX INFO: renamed from: X.0CPS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CPS {
    public static final C0CPS LIZ = new C0CPS();
    public static final ConfigModel LIZIZ = new ConfigModel(false, false, null, 7, null);

    public static ConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ConfigModel configModel = LIZIZ;
        ConfigModel configModel2 = (ConfigModel) settingsManagerLIZLLL.LJIIIIZZ("app_log_isolation_settings", ConfigModel.class, configModel);
        return configModel2 != null ? configModel2 : configModel;
    }
}
