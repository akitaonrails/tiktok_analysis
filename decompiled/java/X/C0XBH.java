package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XBH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XBH {
    public static final ConcurrentHashMap<String, C0XBH> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();

    public C0XBH() {
        new ConcurrentHashMap();
    }

    public static <T> T LIZ(Class<T> cls, String str) {
        C0XBH c0xbh = LIZIZ.get(str);
        if (c0xbh != null) {
            return (T) c0xbh.LIZ.get(cls);
        }
        return null;
    }

    public static void LIZIZ(Class cls, String str, Object obj) {
        ConcurrentHashMap<String, C0XBH> concurrentHashMap = LIZIZ;
        C0XBH c0xbh = concurrentHashMap.get(str);
        if (c0xbh == null) {
            c0xbh = new C0XBH();
            concurrentHashMap.put(str, c0xbh);
        }
        c0xbh.LIZ.put(cls, obj);
    }
}
