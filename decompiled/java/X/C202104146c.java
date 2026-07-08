package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.146c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202104146c {
    public static final ConcurrentHashMap<String, C146A>[] LIZ;

    static {
        ConcurrentHashMap<String, C146A>[] concurrentHashMapArr = new ConcurrentHashMap[3];
        int i = 0;
        do {
            concurrentHashMapArr[i] = new ConcurrentHashMap<>();
            i++;
        } while (i < 3);
        LIZ = concurrentHashMapArr;
    }
}
