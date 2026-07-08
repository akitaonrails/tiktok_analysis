package X;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.03OJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OJ {
    public static HashMap LIZ(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, int i, int i2, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str != null) {
            linkedHashMap.put("entrance_info", str);
        }
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("total_payment", str2);
        linkedHashMap.put("pay_type", str3);
        if (bool != null) {
            linkedHashMap.put("is_default_first", Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_default_second", Boolean.valueOf(bool2.booleanValue()));
        }
        if (str4 != null) {
            linkedHashMap.put("previous_page", str4);
        }
        linkedHashMap.put("is_delivery_info_complete", Integer.valueOf(i));
        linkedHashMap.put("is_pay_info_complete", Integer.valueOf(i2));
        if (num != null) {
            linkedHashMap.put("delivery_instruction_type", Integer.valueOf(num.intValue()));
        }
        return linkedHashMap;
    }
}
