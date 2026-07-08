package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.launcershortcut.ab.FeedLauncherShortcutAddSettingsModel;
import com.ss.android.ugc.aweme.launcershortcut.ab.FeedLauncherShortcutAddSettingsModelItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816080Vzq {
    public static final Map<String, FeedLauncherShortcutAddSettingsModelItem> LIZ;

    static {
        FeedLauncherShortcutAddSettingsModel feedLauncherShortcutAddSettingsModel = new FeedLauncherShortcutAddSettingsModel(null, 1, null);
        FeedLauncherShortcutAddSettingsModel feedLauncherShortcutAddSettingsModel2 = (FeedLauncherShortcutAddSettingsModel) SettingsManager.LIZLLL().LJIIIIZZ("feed_launcher_shortcut_add_settings", FeedLauncherShortcutAddSettingsModel.class, feedLauncherShortcutAddSettingsModel);
        if (feedLauncherShortcutAddSettingsModel2 != null) {
            feedLauncherShortcutAddSettingsModel = feedLauncherShortcutAddSettingsModel2;
        }
        List listLJJJJLI = C13LP.LJJJJLI(feedLauncherShortcutAddSettingsModel.config);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJJJJLI, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : (ArrayList) listLJJJJLI) {
            linkedHashMap.put(((FeedLauncherShortcutAddSettingsModelItem) obj).type, obj);
        }
        LIZ = linkedHashMap;
    }
}
