package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0CjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321620CjA {
    public static final ConcurrentHashMap<String, AtomicInteger> LIZ = new ConcurrentHashMap<>();

    public static int LIZ() {
        AtomicInteger atomicInteger = LIZ.get("_global");
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }
}
