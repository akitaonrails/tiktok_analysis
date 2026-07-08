package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C205000qe {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str) {
        boolean z;
        String string;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{";"}, 0, 6).iterator();
        while (it2.hasNext()) {
            String string2 = a0.LJLIIIL((String) it2.next()).toString();
            int iLJJIZ = a0.LJJIZ(string2, '=', 0, false, 6);
            if (iLJJIZ > 0) {
                String string3 = a0.LJLIIIL(string2.substring(0, iLJJIZ)).toString();
                if (iLJJIZ < string2.length() - 1) {
                    string = a0.LJLIIIL(string2.substring(iLJJIZ + 1)).toString();
                } else {
                    string = "";
                }
                linkedHashMap.put(string3, string);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    public static Map LIZIZ(String str) {
        boolean z;
        String strSubstring;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6)) {
            int iLJJIZ = a0.LJJIZ(str2, '=', 0, false, 6);
            if (iLJJIZ > 0) {
                String strSubstring2 = str2.substring(0, iLJJIZ);
                if (iLJJIZ < str2.length() - 1) {
                    strSubstring = str2.substring(iLJJIZ + 1);
                } else {
                    strSubstring = "";
                }
                linkedHashMap.put(strSubstring2, strSubstring);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
