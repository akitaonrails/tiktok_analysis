package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19996613Lw {
    public static final ConcurrentHashMap<String, InterfaceC20004513Ox> LIZ = new ConcurrentHashMap<>();

    public static InterfaceC20004513Ox LIZ(String str) {
        if (C504670Jqj.LIZIZ(str)) {
            return null;
        }
        ConcurrentHashMap<String, InterfaceC20004513Ox> concurrentHashMap = LIZ;
        if (!concurrentHashMap.containsKey(str)) {
            return null;
        }
        return concurrentHashMap.get(str);
    }
}
