package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.lyrax.video.ILyraxVideoFrameSink;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277550jLl implements ILyraxVideoFrameSink, InterfaceC1279210jOR {
    public Surface LIZ;
    public GlRenderDrawer LIZIZ;
    public GLSurface LIZJ;
    public final Handler LIZLLL;
    public final C1277650jLv LJ;
    public final InterfaceC1278300jMy LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public C1271390jBp LJIIZILJ;
    public float[] LJIJJ;
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final float[] LJIIIZ = new float[16];
    public final boolean LJIILL = true;
    public final boolean LJIILLIIL = true;
    public final boolean LJIJ = true;
    public final int[] LJIJI = {0, 0, 0};

    @Override // com.ss.lyrax.video.ILyraxVideoFrameSink
    public final int getRenderElapse() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap LIZ() {
        final C259800zU c259800zU = new C259800zU();
        final int i = this.LJIIL;
        final int i2 = this.LJIILIIL;
        C1283100jUi.LIZIZ(this.LIZLLL, new Runnable() { // from class: X.0jFf
            /* JADX WARN: Type inference failed for: r0v6, types: [T, android.graphics.Bitmap] */
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                int i4 = i2;
                C259800zU c259800zU2 = c259800zU;
                C1C7U.LIZ("LyraxSurfaceRender@5e9a.getFrameBitmap$1L");
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3 * i4 * 4);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                GLES20.glFinish();
                GLES20.glReadPixels(0, 0, i3, i4, 6408, 5121, byteBufferAllocateDirect);
                GlUtil.checkAnyGLES2Error("getNextFrameBitmap");
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                byteBufferAllocateDirect.rewind();
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f, -1.0f);
                c259800zU2.element = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i3, i4, matrix, true);
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                C1C7U.LIZIZ("LyraxSurfaceRender@5e9a.getFrameBitmap$1L");
            }
        });
        return (Bitmap) c259800zU.element;
    }

    public final void LIZIZ() {
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        C1277650jLv c1277650jLv = this.LJ;
        if (c1277650jLv != null) {
            c1277650jLv.LIZ();
            Handler handler = c1277650jLv.LIZ;
            if (handler != null) {
                handler.removeMessages(c1277650jLv.LJ);
            }
            c1277650jLv.LJFF = false;
        }
    }

    public final void LIZJ() {
        Handler handler = this.LIZLLL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 243));
        }
    }

    public final void LIZLLL() {
        C1277650jLv c1277650jLv;
        Handler handler;
        if (this.LJII) {
            this.LJII = false;
            if (!this.LJI || (c1277650jLv = this.LJ) == null || (handler = c1277650jLv.LIZ) == null || c1277650jLv.LJFF) {
                return;
            }
            c1277650jLv.LJFF = true;
            C786410Ut5.LJLJLJ(handler, handler.obtainMessage(c1277650jLv.LJ), c1277650jLv.LIZLLL);
        }
    }

    @Override // X.InterfaceC1279210jOR
    public final void LJI() {
        InterfaceC1278300jMy interfaceC1278300jMy = this.LJFF;
        if (interfaceC1278300jMy != null) {
            interfaceC1278300jMy.LIZIZ();
        }
    }

    @Override // X.InterfaceC1279210jOR
    public final void LJIIJ() {
        InterfaceC1278300jMy interfaceC1278300jMy = this.LJFF;
        if (interfaceC1278300jMy != null) {
            interfaceC1278300jMy.LIZLLL();
        }
    }

    public final void LJ(Surface surface) {
        Handler handler;
        if (surface != null && surface.isValid() && (handler = this.LIZLLL) != null) {
            C786410Ut5.LJL(handler, new ARunnableS89S0200000_20(surface, this, 157));
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoFrameSink
    public final void onFrame(LyraxVideoFrame lyraxVideoFrame) {
        try {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (lyraxVideoFrame == null) {
                    return;
                }
            }
            if (this.LIZ == null) {
                InterfaceC1278300jMy interfaceC1278300jMy = this.LJFF;
                if (interfaceC1278300jMy != null) {
                    interfaceC1278300jMy.LIZJ(EnumC1277980jMS.RENDER_VIEW_EMPTY.value());
                }
                if (lyraxVideoFrame != null) {
                    lyraxVideoFrame.release();
                    return;
                }
                return;
            }
            if (lyraxVideoFrame != null) {
                C1283100jUi.LIZIZ(this.LIZLLL, new ARunnableS53S0300000_20(this, lyraxVideoFrame, lyraxVideoFrame, 48));
                lyraxVideoFrame.release();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (lyraxVideoFrame != null) {
                lyraxVideoFrame.release();
            }
            throw th;
        }
    }

    public C1277550jLl(GLThread gLThread, Handler handler, C1279410jOl c1279410jOl) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("constructor, glHandler = ");
        sbLIZ.append(handler);
        sbLIZ.append(", glThread.isAlive = ");
        if (gLThread != null) {
            boolValueOf = Boolean.valueOf(gLThread.isAlive());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZLLL = handler;
        this.LJFF = c1279410jOl;
        this.LJ = new C1277650jLv(gLThread, handler, this);
    }
}
