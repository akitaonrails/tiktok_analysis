package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vYR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746690vYR {
    public static final C1746690vYR LIZ = new C1746690vYR();
    public static Map<String, ? extends Object> LIZIZ = C2097608Jq.LJ();

    public static void LIZ(C1746690vYR c1746690vYR, String str) {
        c1746690vYR.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button_name", str);
        LIZJ("tiktokec_button_click", linkedHashMap);
    }

    public static void LIZIZ(C1746690vYR c1746690vYR, String str) {
        c1746690vYR.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button_name", str);
        LIZJ("tiktokec_button_show", linkedHashMap);
    }

    public static void LIZJ(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        C1018503yZ.LIZIZ(str, linkedHashMap, false);
    }
}
