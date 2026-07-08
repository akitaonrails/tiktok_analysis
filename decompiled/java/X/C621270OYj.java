package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0OYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621270OYj {
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, C621280OYk>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, String str2) {
        ConcurrentHashMap<String, C621280OYk> concurrentHashMap;
        if (str.length() != 0 && str2.length() != 0 && (concurrentHashMap = LIZ.get(str)) != null) {
            concurrentHashMap.remove(str2);
        }
    }

    public static void LIZIZ(int i, int i2, String str, String str2) {
        ConcurrentHashMap<String, C621280OYk> concurrentHashMap;
        if (str.length() != 0 && str2.length() != 0 && i > 0 && (concurrentHashMap = LIZ.get(str)) != null) {
            concurrentHashMap.put(str2, new C621280OYk(i, i2));
        }
    }
}
