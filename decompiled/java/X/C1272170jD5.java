package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS16S1300000_20;
import Y.ARunnableS7S0102000_20;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.SurfaceView;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;

/* JADX INFO: renamed from: X.0jD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272170jD5 implements C0UD1 {
    public final long LIZ;
    public final InterfaceC1272120jD0 LIZIZ;
    public C1272880jEE LIZJ;
    public final Handler LIZLLL;
    public C0UD3 LJ;
    public boolean LJFF = true;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public Matrix LJIIJ;
    public C1271790jCT LJIIJJI;
    public C1271780jCS LJIIL;

    public final void LJFF() {
        if (this.LJ != null) {
            this.LJ = null;
        }
        C1272880jEE c1272880jEE = this.LIZJ;
        if (c1272880jEE != null) {
            c1272880jEE.release();
            this.LIZJ = null;
        }
        if (this.LIZLLL == null) {
            return;
        }
        GLES20.glDeleteTextures(1, new int[]{this.LJI}, 0);
        this.LIZIZ.destroyEffectTrack(this.LIZ);
    }

    @Override // X.C0UD1
    public final int start() {
        Handler handler = this.LIZLLL;
        if (handler == null) {
            return -1;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 173));
        return 0;
    }

    @Override // X.C0UD1
    public final int stop() {
        Handler handler = this.LIZLLL;
        if (handler == null) {
            return -1;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 174));
        return 0;
    }

    @Override // X.C0UD1
    public final void LIZJ(C0UD3 c0ud3) {
        this.LJ = c0ud3;
    }

    public final void LIZLLL(int i, int i2) {
        int iGenerateTexture = GlUtil.generateTexture(3553);
        this.LJI = iGenerateTexture;
        if (iGenerateTexture > 0) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.LJI);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public final void LJ(int i, int i2) {
        RoiInfo roiInfo;
        k kVarLIZ;
        VideoFrame videoFrame;
        if (!this.LJII && (i != this.LJIIIIZZ || i2 != this.LJIIIZ)) {
            GLES20.glDeleteTextures(1, new int[]{this.LJI}, 0);
            LIZLLL(i, i2);
            this.LJIIIIZZ = i;
            this.LJIIIZ = i2;
            Handler handler = this.LIZLLL;
            if (handler != null && this.LIZIZ != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS7S0102000_20(i, this, i2, 3));
                return;
            }
            return;
        }
        C1272880jEE c1272880jEE = this.LIZJ;
        if (c1272880jEE != null) {
            if (this.LJIIJ == null) {
                Matrix matrix = new Matrix();
                this.LJIIJ = matrix;
                matrix.reset();
                this.LJIIJ.preTranslate(0.5f, 0.5f);
                this.LJIIJ.preScale(1.0f, -1.0f);
                this.LJIIJ.preTranslate(-0.5f, -0.5f);
            }
            C1271780jCS c1271780jCS = this.LJIIL;
            if (c1271780jCS != null) {
                roiInfo = null;
                kVarLIZ = c1271780jCS.LJFF(this.LJIIIIZZ, this.LJIIIZ, EnumC1273550jFJ.RGB, this.LJI, this.LJIIJ, null, null, null);
            } else {
                roiInfo = null;
                kVarLIZ = C1271950jCj.LIZ(this.LJIIIIZZ, this.LJIIIZ, EnumC1273550jFJ.RGB, this.LJI, this.LJIIJ, null, null, null);
            }
            if (kVarLIZ == null) {
                return;
            }
            kVarLIZ.updateCaptureMs(TimeUtils.currentTimeMs());
            kVarLIZ.setROIInfo(roiInfo);
            C1271790jCT c1271790jCT = this.LJIIJJI;
            if (c1271790jCT != null) {
                videoFrame = c1271790jCT.LIZLLL(kVarLIZ, 0, TimeUtils.nativeNanoTime());
                if (videoFrame == null) {
                    kVarLIZ.release();
                    return;
                }
            } else {
                videoFrame = new VideoFrame(kVarLIZ, 0, TimeUtils.nativeNanoTime());
            }
            c1272880jEE.onFrame(videoFrame);
            videoFrame.release();
            if (!this.LJFF) {
                return;
            }
            this.LJFF = false;
            C0UD3 c0ud3 = this.LJ;
            if (c0ud3 == null) {
                return;
            }
            c0ud3.onEvent();
        }
    }

    @Override // X.C0UD1
    public final int LIZ(String[] strArr, int[] iArr, String str) {
        Handler handler = this.LIZLLL;
        if (handler == null) {
            return -1;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS16S1300000_20(iArr, this, strArr, str, 3));
        return 0;
    }

    @Override // X.C0UD1
    public final void LIZIZ(SurfaceView surfaceView, int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.LJII = true;
            this.LJIIIIZZ = i;
            this.LJIIIZ = i2;
        }
        this.LIZJ = new C1272880jEE(surfaceView);
    }

    public C1272170jD5(InterfaceC1272120jD0 interfaceC1272120jD0, Handler handler, int i, int i2) {
        this.LIZIZ = interfaceC1272120jD0;
        this.LIZLLL = handler;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        if (interfaceC1272120jD0 != null) {
            long jCreateEffectTrack = interfaceC1272120jD0.createEffectTrack();
            this.LIZ = jCreateEffectTrack;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create effect track success. trackId:");
            sbLIZ.append(jCreateEffectTrack);
            AVLog.ioi("EffectTrack", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
