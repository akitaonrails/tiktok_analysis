package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS1S0203000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import android.view.SurfaceHolder;

/* JADX INFO: renamed from: X.0jEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class SurfaceHolderCallbackC1273170jEh implements SurfaceHolder.Callback {
    public final /* synthetic */ C1273190jEj LL;

    public SurfaceHolderCallbackC1273170jEh(C1273190jEj c1273190jEj) {
        this.LL = c1273190jEj;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder.getSurface() != null) {
            C1273190jEj c1273190jEj = this.LL;
            Handler handler = c1273190jEj.LLILLL.LIZIZ;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(c1273190jEj, surfaceHolder, 202));
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1273190jEj c1273190jEj = this.LL;
        Handler handler = c1273190jEj.LLILLL.LIZIZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1273190jEj, 331));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C1273190jEj c1273190jEj = this.LL;
        Handler handler = c1273190jEj.LLILLL.LIZIZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS1S0203000_20(surfaceHolder, i, i2, i3, c1273190jEj, 1));
        }
    }
}
