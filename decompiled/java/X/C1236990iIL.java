package X;

import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0iIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236990iIL {
    public static final SparseArray<Map<String, C851370XaZ>> LIZ = new SparseArray<>();

    public static C851370XaZ LIZ(String str, EnumC852660Xce enumC852660Xce) {
        Map<String, C851370XaZ> map = LIZ.get(enumC852660Xce.getValue());
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static void LIZIZ(String str, C851370XaZ c851370XaZ, EnumC852660Xce enumC852660Xce) {
        SparseArray<Map<String, C851370XaZ>> sparseArray = LIZ;
        Map<String, C851370XaZ> linkedHashMap = sparseArray.get(enumC852660Xce.getValue());
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put(str, c851370XaZ);
        sparseArray.put(enumC852660Xce.getValue(), linkedHashMap);
    }
}
