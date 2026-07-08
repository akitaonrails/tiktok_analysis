package X;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.03ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C882603ce {
    public final LinkedHashMap<String, Object> LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public C882603ce(Integer num, String str, HashMap map) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.LIZ = linkedHashMap;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "secure_payments");
        linkedHashMap.put("previous_page", "ccdc_card_info");
        if (num != null) {
            linkedHashMap.put("is_with_delivery_info", Integer.valueOf(num.intValue()));
        }
        if (str != null) {
            linkedHashMap.put("fill_type", str);
        }
    }
}
