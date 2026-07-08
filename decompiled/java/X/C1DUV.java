package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1DUV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DUV {
    public static final ConcurrentHashMap<String, C1DUW> LIZ = new ConcurrentHashMap<>();

    public static C1DUW LIZ(String str) {
        ConcurrentHashMap<String, C1DUW> concurrentHashMap = LIZ;
        C1DUW c1duw = concurrentHashMap.get(str);
        if (c1duw == null) {
            C1DUW c1duw2 = new C1DUW(str);
            concurrentHashMap.put(str, c1duw2);
            return c1duw2;
        }
        return c1duw;
    }
}
