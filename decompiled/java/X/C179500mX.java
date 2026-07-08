package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.00mX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C179500mX {
    public static final C179500mX LIZ = new C179500mX();
    public static final ConcurrentHashMap<String, Map<String, C1550570qS7>> LIZIZ = new ConcurrentHashMap<>();

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str, String str2) {
        for (Map.Entry<String, Map<String, C1550570qS7>> entry : LIZIZ.entrySet()) {
            if (entry.getValue().containsKey(LIZ(str, str2))) {
                return entry.getKey();
            }
        }
        return "";
    }
}
