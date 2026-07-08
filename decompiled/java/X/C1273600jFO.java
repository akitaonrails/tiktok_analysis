package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoGLTextureFrameBuilder;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoRotation;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273600jFO extends C1273610jFP {
    public final String LIZLLL = "AuxStreamImageSource";
    public Bitmap LJ;
    public int LJFF;
    public k LJI;

    public final void LIZ() {
        int i;
        int i2;
        Bitmap bitmap = this.LJ;
        int i3 = this.LIZ;
        int i4 = this.LIZIZ;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        float f2 = height;
        float f3 = i3 / i4;
        if (f / f2 > f3) {
            int i5 = (int) (f2 * f3);
            i2 = (width - i5) / 2;
            i = 0;
            width = i5;
        } else {
            int i6 = (int) (f / f3);
            i = (height - i6) / 2;
            height = i6;
            i2 = 0;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i2, i, width, height, matrix, true);
        int[] iArr = new int[1];
        C1283100jUi.LIZIZ(this.LIZJ, new ARunnableS89S0200000_20(bitmapCreateBitmap, iArr, 188));
        this.LJFF = iArr[0];
        C786410Ut5.LJJJJ(bitmapCreateBitmap);
        this.LJI = new k(this.LIZ, this.LIZIZ, EnumC1273550jFJ.RGB, this.LJFF, (Matrix) null, (SurfaceTextureHelper) null, (Runnable) null);
    }

    public final void LIZIZ() {
        if (this.LJI == null) {
            return;
        }
        C1283100jUi.LIZIZ(this.LIZJ, new ARunnableS120S0100000_20(this, 307));
        this.LJFF = 0;
        this.LJI.release();
        this.LJI = null;
    }

    @Override // X.C1273610jFP
    public void start() {
        AVLog.logKibana(4, this.LIZLLL, "start", null);
        LIZ();
    }

    @Override // X.C1273610jFP
    public void stop() {
        AVLog.logKibana(4, this.LIZLLL, "stop", null);
        LIZIZ();
    }

    public final void LIZJ(int i, int i2) {
        if (this.LIZ != i || this.LIZIZ != i2) {
            this.LIZ = i;
            this.LIZIZ = i2;
            LIZIZ();
            LIZ();
        }
    }

    public LyraxVideoFrame getLyraxVideoFrame(int i, int i2) {
        if (this.LIZ != i || this.LIZIZ != i2 || this.LJI == null) {
            LIZJ(i, i2);
        }
        if (this.LJI == null) {
            LIZ();
        }
        k kVar = this.LJI;
        if (kVar == null) {
            return null;
        }
        Matrix transformMatrix = kVar.getTransformMatrix();
        if (transformMatrix == null) {
            transformMatrix = new Matrix();
        }
        float[] fArrLIZIZ = C1273010jER.LIZIZ(transformMatrix);
        EGLContext eGLContext = GLThreadManager.getEGLContext();
        LyraxVideoGLTextureFrameBuilder lyraxVideoGLTextureFrameBuilder = new LyraxVideoGLTextureFrameBuilder(LyraxVideoPixelFormat.TEXTURE_2D);
        lyraxVideoGLTextureFrameBuilder.setWidth(this.LJI.getWidth());
        lyraxVideoGLTextureFrameBuilder.setHeight(this.LJI.getHeight());
        lyraxVideoGLTextureFrameBuilder.setTextureID(this.LJI.getTextureId());
        lyraxVideoGLTextureFrameBuilder.setTextureMatrix(fArrLIZIZ);
        lyraxVideoGLTextureFrameBuilder.setEGLContext(eGLContext);
        long jCurrentTimeMillis = System.currentTimeMillis();
        lyraxVideoGLTextureFrameBuilder.setRotation(LyraxVideoRotation.VIDEO_ROTATION_0);
        lyraxVideoGLTextureFrameBuilder.setTimeStampUs(System.nanoTime() / 1000);
        lyraxVideoGLTextureFrameBuilder.setOriginalCaptureTimestampMs(jCurrentTimeMillis);
        lyraxVideoGLTextureFrameBuilder.setOriginalEffectTimestampMs(jCurrentTimeMillis);
        return lyraxVideoGLTextureFrameBuilder.build();
    }

    public C1273600jFO(C01IM c01im, int i, int i2) {
        this.LJ = c01im.LIZIZ;
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
