package X;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0VD9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VD9 {
    public volatile ExecutorService LIZ = C786410Ut5.e4(1, new ThreadFactoryC854690Xfv(5));

    public static C0VD9 LIZ() {
        if (C792400V6o.LIZJ) {
            return C0VDA.LIZ;
        }
        return null;
    }

    public final void LIZIZ(Runnable runnable) {
        this.LIZ.submit(runnable);
    }
}
