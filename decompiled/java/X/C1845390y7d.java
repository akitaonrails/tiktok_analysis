package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0y7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845390y7d {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map, String str, String str2) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("message_id", str);
        linkedHashMap.put("panel_source", "share");
        linkedHashMap.put("action_type", str2);
        c20235014FoLIZ.LIZ("tikbot_panel_click", linkedHashMap);
    }

    public static void LIZIZ(Map map, String str, String str2) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("message_id", str);
        linkedHashMap.put("toast_type", str2);
        c20235014FoLIZ.LIZ("tikbot_toast_show", linkedHashMap);
    }
}
