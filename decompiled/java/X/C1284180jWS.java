package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284180jWS {
    public int LIZ;
    public SurfaceTexture LIZIZ;
    public boolean LIZJ;
    public int LIZLLL = -1;

    public final void LIZ() {
        if (1 == this.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachToGLContext, texture id = ");
            sbLIZ.append(this.LIZ);
            C2484209oO.LJI("TextureHolder", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZIZ.attachToGLContext(this.LIZ);
            this.LIZLLL = 0;
        }
    }

    public final void LIZLLL() {
        if (this.LIZLLL == 0) {
            this.LIZLLL = 1;
            if (Build.VERSION.SDK_INT < 26 || !this.LIZIZ.isReleased()) {
                this.LIZIZ.detachFromGLContext();
            }
        }
    }

    public final double LJ() {
        if (this.LIZIZ == null) {
            return -1.0d;
        }
        long jAbs = Math.abs(System.nanoTime() - this.LIZIZ.getTimestamp());
        long jAbs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - this.LIZIZ.getTimestamp());
        return (r4 - Math.min(Math.min(jAbs, jAbs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - this.LIZIZ.getTimestamp()))) / 1000000.0d;
    }

    public final void LJII() {
        if (this.LIZJ || this.LIZLLL == 1) {
            try {
                try {
                    LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZLLL = 0;
                    C2484209oO.LJIIIZ(e);
                    if (this.LIZJ) {
                    }
                }
                if (this.LIZJ) {
                    this.LIZJ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (this.LIZJ) {
                    this.LIZJ = false;
                }
                throw th;
            }
        }
        SurfaceTexture surfaceTexture = this.LIZIZ;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final boolean LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createOESTextureIfNeed, mSurfaceTextureStatus = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mSurfaceTextureID = ");
        sbLIZ.append(this.LIZ);
        C2484209oO.LJI("TextureHolder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZLLL != 1 || this.LIZ != 0) {
            return false;
        }
        this.LIZ = C1284190jWT.LIZ();
        return true;
    }

    public final synchronized void LIZJ(boolean z) {
        if (z) {
            this.LIZ = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                this.LIZIZ = new C1284170jWR();
            } else {
                C1284170jWR c1284170jWR = new C1284170jWR(0);
                this.LIZIZ = c1284170jWR;
                c1284170jWR.detachFromGLContext();
            }
            this.LIZLLL = 1;
        } else {
            this.LIZ = C1284190jWT.LIZ();
            this.LIZIZ = new C1284170jWR(this.LIZ);
            this.LIZLLL = 0;
        }
        this.LIZIZ.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jWU
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                this.LL.getClass();
            }
        });
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createSurfaceTexture SurfaceTextureID = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", detachSurfaceTexture = ");
        sbLIZ.append(z);
        C2484209oO.LJI("TextureHolder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy, canRelease = ");
        sbLIZ.append(z);
        C2484209oO.LJI("TextureHolder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ != null) {
            if (z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onDestroy, release SurfaceTexture, mSurfaceTexture = ");
                sbLIZ2.append(this.LIZIZ);
                C2484209oO.LJI("TextureHolder", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZIZ.release();
            }
            this.LIZIZ = null;
            this.LIZLLL = -1;
        }
        int i = this.LIZ;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.LIZ = 0;
        }
    }

    public final void LJI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNeedAttachToGLContext, needAttachToGLContext = ");
        sbLIZ.append(z);
        C2484209oO.LJI("TextureHolder", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = z;
        if (z) {
            this.LIZLLL = 1;
        } else {
            this.LIZLLL = 0;
        }
    }
}
