package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1DiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class SurfaceHolderC2263421DiW implements SurfaceHolder {
    public final SurfaceHolder LIZ;
    public boolean LIZIZ;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public final List<SurfaceHolder.Callback> LJFF = new ArrayList();

    @Override // android.view.SurfaceHolder
    public final void setType(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.LIZ.getSurface();
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return this.LIZ.getSurfaceFrame();
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return this.LIZ.isCreating();
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        return this.LIZ.lockCanvas();
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
        this.LIZ.setSizeFromLayout();
    }

    public SurfaceHolderC2263421DiW(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = new SurfaceHolder.Callback() { // from class: X.1DiX
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder2) {
                SurfaceHolderC2263421DiW surfaceHolderC2263421DiW = this.LL;
                surfaceHolderC2263421DiW.LIZIZ = true;
                Iterator it2 = ((ArrayList) surfaceHolderC2263421DiW.LJFF).iterator();
                while (it2.hasNext()) {
                    ((SurfaceHolder.Callback) it2.next()).surfaceCreated(surfaceHolder2);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder2) {
                SurfaceHolderC2263421DiW surfaceHolderC2263421DiW = this.LL;
                surfaceHolderC2263421DiW.LIZIZ = false;
                Iterator it2 = ((ArrayList) surfaceHolderC2263421DiW.LJFF).iterator();
                while (it2.hasNext()) {
                    ((SurfaceHolder.Callback) it2.next()).surfaceDestroyed(surfaceHolder2);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder2, int i, int i2, int i3) {
                SurfaceHolderC2263421DiW surfaceHolderC2263421DiW = this.LL;
                surfaceHolderC2263421DiW.LIZJ = i;
                surfaceHolderC2263421DiW.LIZLLL = i2;
                surfaceHolderC2263421DiW.LJ = i3;
                Iterator it2 = ((ArrayList) surfaceHolderC2263421DiW.LJFF).iterator();
                while (it2.hasNext()) {
                    ((SurfaceHolder.Callback) it2.next()).surfaceChanged(surfaceHolder2, i, i2, i3);
                }
            }
        };
        this.LIZ = surfaceHolder;
        surfaceHolder.addCallback(callback);
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
        int i;
        int i2;
        if (!((ArrayList) this.LJFF).contains(callback)) {
            ((ArrayList) this.LJFF).add(callback);
        }
        if (this.LIZIZ) {
            callback.surfaceCreated(this);
            int i3 = this.LIZJ;
            if (i3 != -1 && (i = this.LIZLLL) != -1 && (i2 = this.LJ) != -1) {
                callback.surfaceChanged(this, i3, i, i2);
            }
        }
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        return this.LIZ.lockCanvas(rect);
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
        ((ArrayList) this.LJFF).remove(callback);
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i) {
        this.LIZ.setFormat(i);
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z) {
        this.LIZ.setKeepScreenOn(z);
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
        this.LIZ.unlockCanvasAndPost(canvas);
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i, int i2) {
        this.LIZ.setFixedSize(i, i2);
    }
}
