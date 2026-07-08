package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.exp.groupshot.DMAIGroupShotInboxConfig;

/* JADX INFO: renamed from: X.0ZaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902300ZaW {
    public static final DMAIGroupShotInboxConfig LIZ = new DMAIGroupShotInboxConfig(null, null, 0, null, 0, 0, 63, null);

    public static final DMAIGroupShotInboxConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DMAIGroupShotInboxConfig dMAIGroupShotInboxConfig = LIZ;
        DMAIGroupShotInboxConfig dMAIGroupShotInboxConfig2 = (DMAIGroupShotInboxConfig) settingsManagerLIZLLL.LJIIIIZZ("im_group_shot_feature_inbox_config", DMAIGroupShotInboxConfig.class, dMAIGroupShotInboxConfig);
        return dMAIGroupShotInboxConfig2 != null ? dMAIGroupShotInboxConfig2 : dMAIGroupShotInboxConfig;
    }
}
