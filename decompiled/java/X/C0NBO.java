package X;

import android.os.Handler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0NBO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBO {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0NBN());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0NBP());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C589420N9w());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C589740NBc());
    public static final C01GW LJ = C452501pT.LIZIZ(new C0NBR());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C0NAO());
    public static C0NBQ LJI;

    public static Handler LIZIZ() {
        return (Handler) LJFF.getValue();
    }

    public static void LIZ(Runnable runnable) {
        C0NBQ c0nbq;
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LJIJJ && (c0nbq = LJI) != null) {
            c0nbq.LIZ(new RunnableC584540MwG(runnable), "default-single");
        } else {
            ((ExecutorService) LIZJ.getValue()).execute(new RunnableC584540MwG(runnable));
        }
    }

    public static void LIZLLL(Runnable runnable) {
        C0NBQ c0nbq;
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LJIJJ && (c0nbq = LJI) != null) {
            c0nbq.LIZIZ(new RunnableC584540MwG(runnable));
        } else {
            ((ExecutorService) LIZ.getValue()).submit(new RunnableC584540MwG(runnable));
        }
    }

    public static void LIZJ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, LIZIZ(), new RunnableC584540MwG(runnable));
    }
}
