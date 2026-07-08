package X;

import android.text.TextUtils;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289790jfV {
    public static Map<String, String> LIZ(ReadableMap readableMap) {
        HashMap map = new HashMap();
        HashMap<String, Object> mapAsHashMap = readableMap.asHashMap();
        for (String str : mapAsHashMap.keySet()) {
            Object obj = mapAsHashMap.get(str);
            if (obj instanceof List) {
                map.put(str, TextUtils.join(",", (Iterable) obj));
            } else if (obj instanceof Number) {
                map.put(str, C1316710kMv.LJII(((Number) obj).doubleValue()));
            } else if (obj != null) {
                map.put(str, obj.toString());
            }
        }
        return map;
    }
}
