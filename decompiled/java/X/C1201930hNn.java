package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201930hNn {
    public static final C1201930hNn LIZ = new C1201930hNn();

    public static void LIZIZ(String str, boolean z) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("key_word", str);
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_success", str2);
        linkedHashMap.put("enable_location", C1204880hSY.LIZ());
        C20684815ws.LJIILLIIL("search_city_result", linkedHashMap);
    }

    public static void LIZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", str);
        if (str2 != null) {
            linkedHashMap.put("city_name", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("previous_region", str3);
        }
        linkedHashMap.put("enable_location", C1204880hSY.LIZ());
        C20684815ws.LJIILLIIL("choose_region", linkedHashMap);
    }
}
