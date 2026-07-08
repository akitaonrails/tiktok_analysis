package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C125400do {
    public static final Map<String, String> LIZ(Map<String, String> map, Map<String, String> map2) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                int iIntValue2 = 0;
                if (value.length() != 0) {
                    String str = (String) linkedHashMap.get(key);
                    if (str == null) {
                        linkedHashMap.put(key, value);
                    } else if (!Intrinsics.LJFF(key, "rights_cnt") && !Intrinsics.LJFF(key, "discount_tag_cnt")) {
                        if (!Intrinsics.LJFF(key, "promotion_label_level")) {
                            if (Intrinsics.LJFF(key, "product_promotion_tag")) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str);
                                sbLIZ.append("|||");
                                sbLIZ.append(value);
                                linkedHashMap.put(key, C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(str);
                                sbLIZ2.append(',');
                                sbLIZ2.append(value);
                                linkedHashMap.put(key, C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                    } else {
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
                        if (numLJIIJJI != null) {
                            iIntValue = numLJIIJJI.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(value);
                        if (numLJIIJJI2 != null) {
                            iIntValue2 = numLJIIJJI2.intValue();
                        }
                        linkedHashMap.put(key, String.valueOf(iIntValue + iIntValue2));
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
