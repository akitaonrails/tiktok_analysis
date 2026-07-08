package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598080Nd0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Map map, Integer num, Boolean bool) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (str != null) {
            linkedHashMap.put("api", str);
        }
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("isSuccess", str2);
        }
        if (num != null) {
            num.intValue();
            linkedHashMap.put("code", num.toString());
        }
        C100C.LIZ.LIZJ().LIZ("change_region_api_status", linkedHashMap);
    }
}
