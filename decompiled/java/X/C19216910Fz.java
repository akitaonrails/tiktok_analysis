package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.lemon.Lemon8ProfileContentSyncConfig;

/* JADX INFO: renamed from: X.10Fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19216910Fz {
    public static final Lemon8ProfileContentSyncConfig LIZ = new Lemon8ProfileContentSyncConfig(-1, "", "", "", "", "", "", "", "", "", "", "", "", false, null, null, null, 0, 0, 0, null, null, false, null, null, false, 1);

    public static final Lemon8ProfileContentSyncConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfig = LIZ;
        Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfig2 = (Lemon8ProfileContentSyncConfig) settingsManagerLIZLLL.LJIIIIZZ("lemon8_silence_sync_tt_article_auth_popup", Lemon8ProfileContentSyncConfig.class, lemon8ProfileContentSyncConfig);
        return lemon8ProfileContentSyncConfig2 != null ? lemon8ProfileContentSyncConfig2 : lemon8ProfileContentSyncConfig;
    }
}
