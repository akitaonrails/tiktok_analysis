package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308970kAR {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static Map<String, Object> LIZLLL;
    public static Map<String, Object> LJ;

    public static Map<String, String> LIZ(Map<String, Object> map) {
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    map2.put(entry.getKey(), entry.getValue().toString());
                }
            }
            return map2;
        }
        return null;
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("us-east-1")) {
            return LIZ;
        }
        if (!str.equals("api.tiktokv.com")) {
            return "api.tiktokv.com";
        }
        return LIZIZ;
    }
}
