package X;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.03Px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC839903Px extends C041O {
    @Override // X.C041O
    public HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        C03O0.LIZ.getClass();
        ConcurrentHashMap<String, Object> concurrentHashMap = C03O0.LIZIZ;
        Object obj = concurrentHashMap.get("source_page_type");
        if (obj != null) {
            map.put("source_page_type", obj);
        }
        Object obj2 = concurrentHashMap.get("anchor_show_type");
        if (obj2 != null) {
            map.put("anchor_show_type", obj2);
        }
        Object obj3 = concurrentHashMap.get("product_id");
        if (obj3 != null) {
            map.put("product_id", obj3);
        }
        Object obj4 = concurrentHashMap.get("biz_type");
        if (obj4 != null) {
            map.put("biz_type", obj4);
        }
        return map;
    }

    public AbstractC839903Px(String str) {
        super(str);
    }
}
