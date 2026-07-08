package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0n17, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418510n17 {
    public static void LIZ(long j) {
        ((HashMap) C1418520n18.LIZ.getValue()).remove(Long.valueOf(j));
    }

    public static long LIZIZ(Object... objArr) {
        long jNanoTime = System.nanoTime();
        ((HashMap) C1418520n18.LIZ.getValue()).put(Long.valueOf(jNanoTime), objArr);
        return jNanoTime;
    }
}
