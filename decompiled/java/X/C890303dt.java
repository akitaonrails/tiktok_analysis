package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.03dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C890303dt {
    public static final Map<String, String> LIZ = new LinkedHashMap();

    public static final Map<String, String> LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, String> map = LIZ;
        Map<String, String> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("ecom_ccdc_bind_error", Map.class, map);
        return map2 != null ? map2 : map;
    }
}
