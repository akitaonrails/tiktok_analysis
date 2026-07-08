package X;

import android.view.Choreographer;

/* JADX INFO: renamed from: X.1ACj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class RunnableC2175551ACj implements Runnable {
    public static final RunnableC2175551ACj LL = new RunnableC2175551ACj();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        Choreographer choreographer;
        C1C7U.LIZ("LiveCardHelperForColdBoot@43f7.runnableForPlay$1");
        try {
            C1ACY.LIZ.getClass();
            C1ACY.LJIILJJIL();
            if (C1ACY.LJIJJ && (choreographer = C1ACY.LJIJ) != null) {
                if (C1ACY.LJIJI == null) {
                    C1ACY.LJIJI = ChoreographerFrameCallbackC2175611ACp.LL;
                }
                ChoreographerFrameCallbackC2175611ACp choreographerFrameCallbackC2175611ACp = C1ACY.LJIJI;
                if (choreographerFrameCallbackC2175611ACp != null) {
                    choreographer.removeFrameCallback(choreographerFrameCallbackC2175611ACp);
                }
            }
            C1ACY.LJIJI = null;
            C1ACY.LJIJJLI = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCardHelperForColdBoot@43f7.runnableForPlay$1");
    }
}
