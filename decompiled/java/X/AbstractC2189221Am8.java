package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Am8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC2189221Am8 {
    public final int LIZ;
    public final Set<String> LIZIZ;
    public final Map<String, List<Set<String>>> LIZJ;
    public final Map<String, List<Map<String, Object>>> LIZLLL;

    public abstract boolean LIZJ(InterfaceC2189271AmD interfaceC2189271AmD);

    public final int LIZ() {
        int i = this.LIZ;
        if (i <= 0) {
            return -1;
        }
        return i >= 10000 ? 1 : 0;
    }

    public final boolean LIZIZ(String str, JSONObject jSONObject) {
        List<Map<String, Object>> list;
        List<Set<String>> list2;
        Map<String, List<Set<String>>> map = this.LIZJ;
        if (map != null && map.containsKey(str) && (list2 = this.LIZJ.get(str)) != null && !list2.isEmpty()) {
            for (Set<String> set : list2) {
                if (set != null && !set.isEmpty()) {
                    Iterator<String> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!jSONObject.has(it2.next())) {
                            break;
                        }
                    }
                    return true;
                }
            }
        }
        Map<String, List<Map<String, Object>>> map2 = this.LIZLLL;
        if (map2 != null && map2.containsKey(str) && (list = this.LIZLLL.get(str)) != null && !list.isEmpty()) {
            for (Map<String, Object> map3 : list) {
                if (map3 != null && !map3.isEmpty()) {
                    Iterator<String> it3 = map3.keySet().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!jSONObject.has(it3.next())) {
                                break;
                            }
                        } else {
                            for (Map.Entry<String, Object> entry : map3.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (TextUtils.isEmpty(key) || value == null || !value.equals(jSONObject.opt(key))) {
                                    break;
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public AbstractC2189221Am8(int i, Set<String> set, Map<String, List<Set<String>>> map, Map<String, List<Map<String, Object>>> map2) {
        this.LIZ = i;
        this.LIZIZ = set;
        this.LIZJ = map;
        this.LIZLLL = map2;
    }
}
