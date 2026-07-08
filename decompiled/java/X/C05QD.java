package X;

import android.os.Looper;

/* JADX INFO: renamed from: X.05QD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05QD {
    public static final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);

    public static void LIZ(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            C23250099c.LIZLLL(LIZ, null, null, new C13055058z(runnable, null), 3);
        } else {
            runnable.run();
        }
    }
}
