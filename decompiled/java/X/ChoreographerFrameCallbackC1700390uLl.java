package X;

import android.os.Handler;
import android.view.Choreographer;

/* JADX INFO: renamed from: X.0uLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class ChoreographerFrameCallbackC1700390uLl implements Choreographer.FrameCallback {
    public final /* synthetic */ C1700360uLi LL;

    public ChoreographerFrameCallbackC1700390uLl(C1700360uLi c1700360uLi) {
        this.LL = c1700360uLi;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Handler handler;
        this.LL.LIZ.run();
        if (this.LL.LJFF) {
            C1700360uLi c1700360uLi = this.LL;
            if (c1700360uLi.LJ == null) {
                c1700360uLi.LJ = new RunnableC1700370uLj(c1700360uLi);
            }
            RunnableC1700370uLj runnableC1700370uLj = c1700360uLi.LJ;
            if (runnableC1700370uLj != null && (handler = this.LL.LIZIZ) != null) {
                handler.removeCallbacks(runnableC1700370uLj);
            }
        }
        C1700360uLi.LJI.getClass();
        C1700320uLe.LIZ();
        this.LL.LIZJ = null;
        this.LL.LJ = null;
    }
}
