package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0DeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344080DeI {
    public static final C344080DeI LIZ = new C344080DeI();

    public static void LIZ(String str, String str2, String str3, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("click_position", str);
        if (str2 != null) {
            linkedHashMap.put("music_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("music_type", str3);
        }
        C20684815ws.LJIILLIIL("livesdk_highlight_music_setting_click", linkedHashMap);
    }
}
