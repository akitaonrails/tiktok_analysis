package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.13q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20133013q4 {
    public static String LIZ(Class cls) {
        Map<Class<?>, String> map = C20132913q3.LIZIZ;
        String strValue = (String) ((LinkedHashMap) map).get(cls);
        if (strValue == null) {
            InterfaceC20133113q5 interfaceC20133113q5 = (InterfaceC20133113q5) cls.getAnnotation(InterfaceC20133113q5.class);
            if (interfaceC20133113q5 != null) {
                strValue = interfaceC20133113q5.value();
            } else {
                strValue = null;
            }
            if (LIZIZ(strValue)) {
                map.put(cls, strValue);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No @Navigator.Name annotation found for ");
                sbLIZ.append(cls.getSimpleName());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
        }
        return strValue;
    }

    public static boolean LIZIZ(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }
}
