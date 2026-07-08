package X;

import com.ss.android.ugc.aweme.experiment.IncentiveLauncherShortcutAddItem;
import com.ss.android.ugc.aweme.experiment.IncentiveLauncherShortcutAddSettingsModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0WHP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WHP {
    public static String LIZ;
    public static final IncentiveLauncherShortcutAddSettingsModel LIZIZ;

    static {
        IncentiveLauncherShortcutAddSettingsModel incentiveLauncherShortcutAddSettingsModel = new IncentiveLauncherShortcutAddSettingsModel(new ArrayList());
        LIZ = "";
        IncentiveLauncherShortcutAddSettingsModel incentiveLauncherShortcutAddSettingsModel2 = (IncentiveLauncherShortcutAddSettingsModel) C0C64.LJIILLIIL().LJJII(IncentiveLauncherShortcutAddSettingsModel.class, incentiveLauncherShortcutAddSettingsModel, "incentive_launcher_shortcut_add_exp", true);
        if (incentiveLauncherShortcutAddSettingsModel2 != null) {
            incentiveLauncherShortcutAddSettingsModel = incentiveLauncherShortcutAddSettingsModel2;
        }
        LIZIZ = incentiveLauncherShortcutAddSettingsModel;
    }

    public static IncentiveLauncherShortcutAddItem LIZ() {
        List<IncentiveLauncherShortcutAddItem> list = LIZIZ.config;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (IncentiveLauncherShortcutAddItem incentiveLauncherShortcutAddItem : list) {
            IncentiveLauncherShortcutAddItem incentiveLauncherShortcutAddItem2 = incentiveLauncherShortcutAddItem;
            linkedHashMap.put(incentiveLauncherShortcutAddItem2 != null ? incentiveLauncherShortcutAddItem2.type : null, incentiveLauncherShortcutAddItem);
        }
        return (IncentiveLauncherShortcutAddItem) linkedHashMap.get(LIZ);
    }
}
