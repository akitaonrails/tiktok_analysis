package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.tako.setting.TakoShortcutModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14FI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FI {
    public static final int LIZ;
    public static final long LIZIZ;
    public static final C2092608Hs<String, Boolean> LIZJ;

    static {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TakoShortcutModel takoShortcutModel = C14FJ.LIZ;
        TakoShortcutModel takoShortcutModel2 = (TakoShortcutModel) settingsManagerLIZLLL.LJIIIIZZ("tako_shortcut_config", TakoShortcutModel.class, takoShortcutModel);
        if (takoShortcutModel2 == null) {
            takoShortcutModel2 = takoShortcutModel;
        }
        LIZ = takoShortcutModel2.item.maxShowCount;
        TakoShortcutModel takoShortcutModel3 = (TakoShortcutModel) SettingsManager.LIZLLL().LJIIIIZZ("tako_shortcut_config", TakoShortcutModel.class, takoShortcutModel);
        if (takoShortcutModel3 != null) {
            takoShortcutModel = takoShortcutModel3;
        }
        LIZIZ = ((long) (takoShortcutModel.item.minShowIntervalDay * 24 * 60 * 60)) * 1000;
        LIZJ = new C2092608Hs<>(10);
    }

    public static void LIZ(String str) {
        if (str == null) {
            return;
        }
        LIZJ.put(str, Boolean.TRUE);
    }

    public static boolean LIZIZ(String str) {
        if (!C18077076d.LIZ()) {
            return false;
        }
        C1860520yW2.LIZ.getClass();
        if (C1860520yW2.LJIIL().getBoolean("tako_shortcut_has_added", false) || C1860520yW2.LJIIL().getInt("tako_shortcut_dialog_show_times", 0) >= LIZ || System.currentTimeMillis() - C1860520yW2.LJIIL().getLong("tako_shortcut_dialog_last_show_time", 0L) <= LIZIZ || str == null || !Intrinsics.LJFF(LIZJ.get(str), Boolean.TRUE)) {
            return false;
        }
        return true;
    }
}
