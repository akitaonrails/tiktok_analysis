package X;

import android.view.Choreographer;

/* JADX INFO: renamed from: X.1ACp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ChoreographerFrameCallbackC2175611ACp implements Choreographer.FrameCallback {
    public static final ChoreographerFrameCallbackC2175611ACp LL = new ChoreographerFrameCallbackC2175611ACp();

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C1ACY.LIZ.getClass();
        C1ACY.LJIILJJIL();
        if (C1ACY.LJIL) {
            if (C1ACY.LJIJJLI == null) {
                C1ACY.LJIJJLI = RunnableC2175551ACj.LL;
            }
            RunnableC2175551ACj runnableC2175551ACj = C1ACY.LJIJJLI;
            if (runnableC2175551ACj != null) {
                C0IK5.LIZ().removeCallbacks(runnableC2175551ACj);
            }
        }
        C1ACY.LJIJI = null;
        C1ACY.LJIJJLI = null;
    }
}
