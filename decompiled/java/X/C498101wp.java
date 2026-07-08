package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C498101wp {
    public static final Map<String, HashMap<String, String>> LIZ = new LinkedHashMap();

    public static HashMap LIZ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            Map<String, HashMap<String, String>> map = LIZ;
            if (map.containsKey(str)) {
                HashMap map2 = (HashMap) ((LinkedHashMap) map).get(str);
                if (map2 == null) {
                    return new HashMap();
                }
                return map2;
            }
            HashMap<String, String> metaData = TEVideoUtils.getMetaData(str);
            map.put(str, metaData);
            return metaData;
        }
        return new HashMap();
    }
}
