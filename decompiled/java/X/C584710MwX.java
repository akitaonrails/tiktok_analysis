package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0MwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584710MwX {
    public static int LIZIZ;
    public static final ConcurrentHashMap<String, Integer> LIZ = new ConcurrentHashMap<>();
    public static String LIZJ = "";

    public static int LIZ(String str, String str2) {
        if (str == null) {
            return 0;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        Integer num = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void LIZIZ(Integer num, String str, String str2) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), num);
    }
}
