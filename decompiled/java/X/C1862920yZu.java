package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.tako.setting.TakoKeyboardOptParams;

/* JADX INFO: renamed from: X.0yZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862920yZu {
    public static final TakoKeyboardOptParams LIZ = new TakoKeyboardOptParams(true);

    public static boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TakoKeyboardOptParams takoKeyboardOptParams = LIZ;
        TakoKeyboardOptParams takoKeyboardOptParams2 = (TakoKeyboardOptParams) settingsManagerLIZLLL.LJIIIIZZ("tako_keyboard_listener_opt_config", TakoKeyboardOptParams.class, takoKeyboardOptParams);
        if (takoKeyboardOptParams2 != null) {
            takoKeyboardOptParams = takoKeyboardOptParams2;
        }
        return takoKeyboardOptParams.enableOpt;
    }
}
