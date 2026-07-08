package X;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206930hVr {
    public static final C1206930hVr LIZ = new C1206930hVr();

    public static void LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "location_services_setting");
        linkedHashMap.put("action", "delete");
        linkedHashMap.put("result", str);
        C20684815ws.LJIILLIIL("delete_location_history_result", linkedHashMap);
    }

    public static void LIZIZ(String str, String str2, Integer num, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "location_services_setting");
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        linkedHashMap.put("is_allow", String.valueOf(num));
        function1.invoke(linkedHashMap);
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }
}
