package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0VHM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VHM {
    public final int LJFF;
    public final Executor LIZ = LIZ(false);
    public final Executor LIZIZ = LIZ(true);
    public final C0VHV LIZJ = new C0VHW() { // from class: X.0VHV
    };
    public final C0VHY LIZLLL = new C0VHZ() { // from class: X.0VHY
    };
    public final C0VHJ LJ = new C0VHJ();
    public final int LJI = Integer.MAX_VALUE;
    public final int LJII = 20;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VHV] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0VHY] */
    public C0VHM(C0VHN c0vhn) {
        this.LJFF = c0vhn.LIZ;
    }

    public static Executor LIZ(final boolean z) {
        return C786410Ut5.e4(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: X.086C
            public final AtomicInteger LL = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str;
                if (z) {
                    str = "WM.task-";
                } else {
                    str = "androidx.work-";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(this.LL.incrementAndGet());
                return new Thread(runnable, C2188811AlT.LIZIZ(sbLIZ));
            }
        });
    }
}
