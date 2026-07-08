package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04mJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1197304mJ {
    public static Map LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("capcut_back_tt", "");
        if (strLJI.length() > 0 && "back_tiktok_m_group".length() > 0) {
            linkedHashMap.put("back_tiktok_m_group", strLJI);
        }
        return linkedHashMap;
    }
}
