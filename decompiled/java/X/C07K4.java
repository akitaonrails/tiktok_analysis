package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Map;

/* JADX INFO: renamed from: X.07K4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07K4 {
    public static final Map<String, String> LIZ;

    static {
        Map<String, String> map;
        new C07K4();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, String> map2 = null;
        if (settingsManagerLIZLLL != null && (map = (Map) settingsManagerLIZLLL.LJIIIIZZ("octr_target_language_code", Map.class, null)) != null) {
            map2 = map;
        }
        LIZ = map2;
    }
}
