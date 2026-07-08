package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.Matrix;
import android.opengl.GLES30;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.buffer.RoiInfo;
import com.ss.pusher.core.buffer.SurfaceTextureHelper;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.opengl.GlUtil;
import com.ss.pusher.core.opengl.YuvConverter;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.TimeUtils;

/* JADX INFO: renamed from: X.0jM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1277790jM9 implements InterfaceC1278160jMk {
    public final int LIZ;
    public final int LIZIZ;
    public final EnumC1277800jMA LIZJ;
    public final int LIZLLL;
    public final Matrix LJ;
    public final SurfaceTextureHelper LJFF;
    public final Runnable LJI;
    public final Object LJII;
    public int LJIIIIZZ;
    public InterfaceC1279260jOW LJIIIZ;
    public RoiInfo LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final InterfaceC1279250jOV getExtData() {
        return null;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final boolean isTexture() {
        return true;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public void release() {
        synchronized (this.LJII) {
            try {
                int i = this.LJIIIIZZ - 1;
                this.LJIIIIZZ = i;
                if (i <= 0) {
                    Runnable runnable = this.LJI;
                    if (runnable != null) {
                        runnable.run();
                    }
                    RoiInfo roiInfo = this.LJIIJ;
                    if (roiInfo != null) {
                        roiInfo.release();
                        this.LJIIJ = null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public void retain() {
        synchronized (this.LJII) {
            try {
                this.LJIIIIZZ++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        long jLIZ = LIZ();
        if (jLIZ != 0 && GLES30.glIsSync(jLIZ)) {
            GLES30.glClientWaitSync(jLIZ, 1, -1L);
            GlUtil.LIZIZ("glClientWaitSync");
        }
        SurfaceTextureHelper surfaceTextureHelper = this.LJFF;
        if (surfaceTextureHelper != null) {
            return surfaceTextureHelper.textureToYuv(this);
        }
        InterfaceC1279260jOW interfaceC1279260jOW = this.LJIIIZ;
        if (interfaceC1279260jOW == null) {
            throw new AndroidRuntimeException("BUG, Fixed me");
        }
        C1277960jMQ c1277960jMQ = (C1277960jMQ) interfaceC1279260jOW;
        if (c1277960jMQ.LIZ.get()) {
            return null;
        }
        if (c1277960jMQ.LIZIZ == null) {
            c1277960jMQ.LIZIZ = new YuvConverter();
        }
        try {
            return c1277960jMQ.LIZIZ.LIZ(this);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convert to I420 failed: ");
            sbLIZ.append(e.getMessage());
            AVLog.iod("YuvConverter", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    @Override // X.InterfaceC1278160jMk
    public long LIZ() {
        return this.LJIILJJIL;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getCaptureMs() {
        return this.LJIIJJI;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getCaptureTimeStampMs() {
        return this.LJIIL;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getEffectTimeStampMs() {
        return this.LJIILIIL;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final int getHeight() {
        return this.LIZIZ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final RoiInfo getROIInfo() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1278160jMk
    public final int getTextureId() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1278160jMk
    public final Matrix getTransformMatrix() {
        return this.LJ;
    }

    @Override // X.InterfaceC1278160jMk
    public final EnumC1277800jMA getType() {
        return this.LIZJ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final int getWidth() {
        return this.LIZ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setCaptureTimeStampMs(long j) {
        this.LJIIL = j;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setEffecTimeStampMs(long j) {
        this.LJIILIIL = j;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.LJIIJ;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.LJIIJ = roiInfo;
        }
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void updateCaptureMs(long j) {
        this.LJIIJJI = j;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.LJ);
        matrix.preTranslate(i / this.LIZ, i2 / this.LIZIZ);
        matrix.preScale(i3 / this.LIZ, i4 / this.LIZIZ);
        C1277790jM9 c1277790jM9 = new C1277790jM9(i5, i6, this.LIZJ, this.LIZLLL, matrix, this.LJFF, new ARunnableS120S0100000_20(this, 91));
        c1277790jM9.LJIIIZ = this.LJIIIZ;
        c1277790jM9.setROIInfo(this.LJIIJ);
        this.LJIIJ = null;
        c1277790jM9.LJIIJJI = this.LJIIJJI;
        return c1277790jM9;
    }

    public C1277790jM9(int i, int i2, EnumC1277800jMA enumC1277800jMA, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, Runnable runnable) {
        this(i, i2, enumC1277800jMA, i3, matrix, null, surfaceTextureHelper, runnable);
    }

    public C1277790jM9(int i, int i2, EnumC1277800jMA enumC1277800jMA, int i3, Matrix matrix, C1277960jMQ c1277960jMQ, SurfaceTextureHelper surfaceTextureHelper, Runnable runnable) {
        this.LJII = new Object();
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = enumC1277800jMA;
        this.LIZLLL = i3;
        this.LJ = matrix;
        this.LJFF = surfaceTextureHelper;
        this.LJI = runnable;
        this.LJIIIZ = c1277960jMQ;
        this.LJIIJJI = TimeUtils.LIZ();
        this.LJIIIIZZ = 1;
    }
}
