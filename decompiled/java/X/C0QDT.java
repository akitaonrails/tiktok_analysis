package X;

import android.util.ArrayMap;

/* JADX INFO: renamed from: X.0QDT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDT {
    public static final ArrayMap<String, String> LIZ = new ArrayMap<>(4);

    public static String LIZ(String str) {
        if (str != null && str.length() != 0) {
            ArrayMap<String, String> arrayMap = LIZ;
            if (arrayMap.containsKey(str)) {
                return arrayMap.get(str);
            }
            return "";
        }
        return "";
    }
}
