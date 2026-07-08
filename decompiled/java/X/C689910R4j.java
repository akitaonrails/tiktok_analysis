package X;

import android.os.Handler;

/* JADX INFO: renamed from: X.0R4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C689910R4j {
    public static final C689910R4j LIZ = new C689910R4j();
    public static Handler LIZIZ;
    public static boolean LIZJ;

    public final void LIZ(RunnableC686980Qx6 runnableC686980Qx6) {
        if (!LIZJ) {
            synchronized (this) {
                if (!LIZJ) {
                    LIZJ = true;
                    LIZIZ = C799570VYd.LIZIZ();
                }
            }
        }
        Handler handler = LIZIZ;
        if (handler == null) {
            handler = null;
        }
        C786410Ut5.LJJZZIII(handler, runnableC686980Qx6);
    }
}
