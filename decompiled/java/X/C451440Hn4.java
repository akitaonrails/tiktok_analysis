package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Hn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451440Hn4 {
    public static C451440Hn4 LIZ;

    public static boolean LIZ(int i) {
        boolean zBooleanValue;
        Map<Integer, Boolean> map = C451560HnG.LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(Integer.valueOf(i)) == null) {
            int i2 = i & 7;
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 7) {
                zBooleanValue = false;
            } else {
                zBooleanValue = true;
            }
            map.put(Integer.valueOf(i), Boolean.valueOf(zBooleanValue));
        } else {
            Boolean bool = (Boolean) linkedHashMap.get(Integer.valueOf(i));
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return true;
        }
        if (!zBooleanValue) {
            return false;
        }
        return true;
    }

    public static List LIZIZ(int i) {
        if (!LIZ(i)) {
            return null;
        }
        return C451560HnG.LIZ.LIZIZ(i);
    }
}
