package X;

import Y.ARunnableS31S0101000_20;
import Y.ARunnableS6S0202000_20;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271330jBj {
    public final Handler LIZ;
    public Surface LIZIZ;
    public SurfaceTexture LIZJ;
    public InterfaceC1271380jBo LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public final Object LJII = new Object();
    public boolean LJIIIIZZ = false;

    public final synchronized void LIZ() {
        synchronized (this.LJII) {
            try {
                if (this.LJIIIIZZ) {
                    return;
                }
                this.LJIIIIZZ = true;
                AVLog.iow("SurfaceWrapper", "release()");
                Surface surface = this.LIZIZ;
                if (surface != null) {
                    surface.release();
                    this.LIZIZ = null;
                }
                SurfaceTexture surfaceTexture = this.LIZJ;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.LIZJ = null;
                }
                int i = this.LJ;
                if (i > 0) {
                    C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS31S0101000_20(i, this, 23));
                    this.LJ = 0;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void finalize() {
        LIZ();
    }

    public C1271330jBj(Handler handler, C1271290jBf c1271290jBf) {
        AVLog.logKibana(4, "SurfaceWrapper", "SurfaceWrapper actor", null);
        this.LIZ = handler;
        SurfaceTexture[] surfaceTextureArr = new SurfaceTexture[1];
        C1283100jUi.LIZIZ(handler, new ARunnableS6S0202000_20(this, surfaceTextureArr, 3));
        SurfaceTexture surfaceTexture = surfaceTextureArr[0];
        this.LIZJ = surfaceTexture;
        if (surfaceTexture != null) {
            this.LIZIZ = new Surface(this.LIZJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createSurface(");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(")");
            AVLog.w("SurfaceWrapper", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZLLL = c1271290jBf;
        }
    }

    public final void LIZIZ(int i, int i2) {
        synchronized (this.LJII) {
            try {
                if (this.LJIIIIZZ) {
                    return;
                }
                this.LJFF = i;
                this.LJI = i2;
                SurfaceTexture surfaceTexture = this.LIZJ;
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(i, i2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("resizeSurface ");
                    sbLIZ.append(i);
                    sbLIZ.append("x");
                    sbLIZ.append(i2);
                    AVLog.logKibana(4, "SurfaceWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
