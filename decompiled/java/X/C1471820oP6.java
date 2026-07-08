package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0oP6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471820oP6 {
    public static volatile ExecutorService LIZ;
    public static C822650WOx LIZIZ;

    public static synchronized ExecutorService LIZIZ() {
        ExecutorService executorService;
        if (LIZ != null) {
            executorService = LIZ;
        } else {
            if (LIZIZ == null) {
                LIZIZ = new C822650WOx(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
            }
            executorService = LIZIZ;
        }
        return executorService;
    }

    public static synchronized void LIZ(Runnable runnable) {
        LIZIZ().submit(runnable);
    }
}
