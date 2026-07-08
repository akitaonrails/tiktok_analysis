package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284730jXL {
    public static String LIZ = "main";
    public static ConcurrentHashMap<String, Object> LIZIZ;

    public static void LIZJ(String[] strArr) {
        if (LIZIZ != null) {
            for (String str : strArr) {
                LIZIZ.remove(str);
            }
        }
    }

    public static void LIZ(long j, String str) {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Long.valueOf(j));
        }
    }

    public static void LIZIZ(String str, String str2) {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, str2);
            if (str.equals("te_composition_video_hw_profile")) {
                LIZ = str2;
            }
        }
    }
}
