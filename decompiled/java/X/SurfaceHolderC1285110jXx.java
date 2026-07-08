package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: renamed from: X.0jXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class SurfaceHolderC1285110jXx implements SurfaceHolder {
    public Surface LIZ;
    public SurfaceHolder.Callback LIZIZ;
    public final Rect LIZJ = new Rect(0, 0, 0, 0);

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i, int i2) {
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z) {
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
    }

    @Override // android.view.SurfaceHolder
    @InterfaceC1294060jmO
    public final void setType(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return this.LIZ != null;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.LIZ;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return this.LIZJ;
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.LIZIZ = callback;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
        this.LIZIZ = null;
    }
}
