package X;

import android.os.Looper;

/* JADX INFO: renamed from: X.0ite, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260120ite {
    public static void LIZ(Runnable runnable) {
        C823050WQl.LIZLLL().execute(runnable);
    }

    public static void LIZIZ(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            C0STY.LIZ.execute(runnable);
        }
    }
}
