package X;

import android.view.Choreographer;

/* JADX INFO: renamed from: X.0uLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1700370uLj implements Runnable {
    public final /* synthetic */ C1700360uLi LL;

    public RunnableC1700370uLj(C1700360uLi c1700360uLi) {
        this.LL = c1700360uLi;
    }

    public final void LIZ() {
        Choreographer choreographer;
        this.LL.LIZ.run();
        if (this.LL.LIZLLL && (choreographer = C1700360uLi.LJIIIIZZ) != null) {
            C1700360uLi c1700360uLi = this.LL;
            if (c1700360uLi.LIZJ == null) {
                c1700360uLi.LIZJ = new ChoreographerFrameCallbackC1700390uLl(c1700360uLi);
            }
            ChoreographerFrameCallbackC1700390uLl choreographerFrameCallbackC1700390uLl = c1700360uLi.LIZJ;
            if (choreographerFrameCallbackC1700390uLl != null) {
                choreographer.removeFrameCallback(choreographerFrameCallbackC1700390uLl);
            }
        }
        C1700360uLi.LJI.getClass();
        C1700320uLe.LIZ();
        this.LL.LIZJ = null;
        this.LL.LJ = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LivePlayerMessageOptTask@c9ee.runnableForPlayerMessage$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePlayerMessageOptTask@c9ee.runnableForPlayerMessage$1");
    }
}
