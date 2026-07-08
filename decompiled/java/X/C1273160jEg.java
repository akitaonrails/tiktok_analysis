package X;

import android.view.Surface;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273160jEg implements InterfaceC1273290jEt {
    public GLSurface LIZ;
    public final Surface LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final AtomicBoolean LJ = new AtomicBoolean(false);

    @Override // X.InterfaceC1273290jEt
    public final void LIZ() {
        GLSurface gLSurface;
        if (this.LJ.get() || (gLSurface = this.LIZ) == null) {
            return;
        }
        gLSurface.nativeMakeCurrent();
    }

    @Override // X.InterfaceC1273290jEt
    public final void LIZIZ() {
        GLSurface gLSurface;
        if (this.LJ.get() || (gLSurface = this.LIZ) == null) {
            return;
        }
        gLSurface.nativeSwapBuffers();
    }

    public C1273160jEg(Surface surface) {
        this.LIZIZ = surface;
        GLSurface gLSurface = new GLSurface();
        this.LIZ = gLSurface;
        gLSurface.nativeSurfaceCreate(0, 0, surface);
        this.LIZ.nativeMakeCurrent();
        GLSurface gLSurface2 = this.LIZ;
        if (gLSurface2 != null) {
            gLSurface2.nativeSwapBuffers();
        }
    }

    public final void LIZJ(int i, int i2) {
        if (this.LJ.get()) {
            return;
        }
        this.LIZJ = i;
        this.LIZLLL = i2;
        GLSurface gLSurface = this.LIZ;
        if (gLSurface != null) {
            gLSurface.surfaceDestroy();
        }
        GLSurface gLSurface2 = this.LIZ;
        if (gLSurface2 != null) {
            gLSurface2.release();
        }
        GLSurface gLSurface3 = new GLSurface();
        this.LIZ = gLSurface3;
        gLSurface3.nativeSurfaceCreate(i, i2, this.LIZIZ);
        GLSurface gLSurface4 = this.LIZ;
        if (gLSurface4 != null) {
            gLSurface4.nativeMakeCurrent();
        }
        GLSurface gLSurface5 = this.LIZ;
        if (gLSurface5 != null) {
            gLSurface5.nativeSurfaceChanged(i, i2, 0);
        }
    }
}
