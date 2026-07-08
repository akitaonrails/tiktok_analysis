package X;

import android.view.SurfaceView;

/* JADX INFO: renamed from: X.0bFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC965960bFC implements Runnable {
    public final /* synthetic */ C2181461AZc LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SurfaceView LLILLL;

    public RunnableC965960bFC(C2181461AZc c2181461AZc, String str, SurfaceView surfaceView) {
        this.LL = c2181461AZc;
        this.LLILLJJLI = str;
        this.LLILLL = surfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LinkMicLayoutLayerProxy@8b37.updateAuxRTCViewSafe$1");
        try {
            this.LL.LLJJLIIIJLLLLLLLZ(this.LLILLJJLI, this.LLILLL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LinkMicLayoutLayerProxy@8b37.updateAuxRTCViewSafe$1");
    }
}
