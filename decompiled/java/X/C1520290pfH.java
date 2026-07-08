package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520290pfH {
    public static void LIZ(C1521200pgk c1521200pgk, C1521090pgZ c1521090pgZ) {
        boolean z;
        Object obj;
        String str;
        String strLJIIJJI;
        if (c1521090pgZ == null) {
            return;
        }
        c1521090pgZ.LIZJ = "web";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1521200pgk != null) {
            Map<String, Object> map = c1521200pgk.LLILLL;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            Map<String, Object> map2 = c1521200pgk.LLILZ;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
        }
        String str2 = c1521090pgZ.LIZ;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str3 = "";
        if (z) {
            if (c1521200pgk == null) {
                strLJIIJJI = "";
            } else {
                strLJIIJJI = c1521200pgk.LJIIJJI();
            }
            c1521090pgZ.LIZ = strLJIIJJI;
        }
        String str4 = c1521090pgZ.LIZLLL;
        if ((str4 == null || str4.length() == 0) && (obj = linkedHashMap.get("native_page")) != null) {
            if ((obj instanceof String) && (str = (String) obj) != null) {
                str3 = str;
            }
            c1521090pgZ.LIZLLL = str3;
        }
    }
}
