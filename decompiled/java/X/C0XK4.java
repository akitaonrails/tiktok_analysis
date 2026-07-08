package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0XK4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XK4 {
    public static long LIZ;
    public static long LIZIZ;
    public static final List<C0XK6> LIZJ = new CopyOnWriteArrayList();

    public static int LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZ;
        if (j > 0) {
            jCurrentTimeMillis = (j + jCurrentTimeMillis) - LIZIZ;
        }
        return (int) (jCurrentTimeMillis / 1000);
    }

    public static long LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZ;
        return j > 0 ? (j + jCurrentTimeMillis) - LIZIZ : jCurrentTimeMillis;
    }
}
