package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00cD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C115500cD {
    public static final void LIZ(List<? extends Map<String, ? extends Object>> list, Map<String, String> map) {
        for (Map map2 : (ArrayList) list) {
            if (map2 != null) {
                LIZIZ(map2, map);
            }
        }
    }

    public static final void LIZIZ(Map<String, ? extends Object> map, Map<String, String> map2) {
        int iIntValue;
        Number number;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                int iIntValue2 = 0;
                if (!(value instanceof String) || ((CharSequence) value).length() != 0) {
                    String str = map2.get(key);
                    if (str == null) {
                        map2.put(key, value.toString());
                    } else if (Intrinsics.LJFF(key, "rights_cnt")) {
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
                        if (numLJIIJJI != null) {
                            iIntValue = numLJIIJJI.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if ((value instanceof Number) && (number = (Number) value) != null) {
                            iIntValue2 = number.intValue();
                        }
                        map2.put(key, String.valueOf(iIntValue + iIntValue2));
                    } else if (!Intrinsics.LJFF(key, "promotion_label_level")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(',');
                        sbLIZ.append(value);
                        map2.put(key, C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
    }
}
