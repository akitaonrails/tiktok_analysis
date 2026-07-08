package X;

import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Wbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826710Wbt {
    public static volatile ConcurrentLinkedDeque<Pair<Long, Integer>> LIZ = new ConcurrentLinkedDeque<>();

    public static void LIZ(int i, long j) {
        long jLongValue;
        LIZ.add(new Pair<>(Long.valueOf(j), Integer.valueOf(i)));
        long j2 = j - ((long) C538540LAe.LLJJJIL);
        while (true) {
            Pair pair = (Pair) C13LP.LJJJLIIL(LIZ);
            if (pair != null) {
                jLongValue = ((Number) pair.getFirst()).longValue();
            } else {
                jLongValue = Long.MAX_VALUE;
            }
            if (jLongValue < j2) {
                LIZ.pollFirst();
            } else {
                return;
            }
        }
    }
}
