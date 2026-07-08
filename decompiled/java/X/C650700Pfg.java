package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Pfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650700Pfg {
    public static final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();

    public static final void LIZ(C0N0Y c0n0y) {
        String hexString = Integer.toHexString(c0n0y.hashCode());
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZ;
        concurrentHashMap.remove(hexString);
        concurrentHashMap.size();
    }
}
