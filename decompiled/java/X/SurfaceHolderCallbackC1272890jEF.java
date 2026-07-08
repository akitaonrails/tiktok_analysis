package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS6S0202000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.render.ANativeWindowWrapper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jEF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class SurfaceHolderCallbackC1272890jEF extends VideoSink implements SurfaceHolder.Callback, View.OnLayoutChangeListener {
    public static GLSurface LLLILZLLLI;
    public final boolean LL;
    public final boolean LLILLJJLI;
    public GLThread LLILLL;
    public GLSurface LLILZ;
    public C1272880jEE LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public Surface LLIZLLLIL;
    public SurfaceView LLJ;
    public C1268470j77 LLJI;
    public boolean LLJIJIL;
    public Handler LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public final C1269180j8G LLJJJ;
    public final C1268800j7e LLJJJIL;
    public final boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final boolean LLJLIL;
    public final BPEAHandler LLJLL;
    public final boolean LLJLLL;
    public ANativeWindowWrapper LLJZ;
    public final boolean LLJZIJLIL;
    public Surface LLLFFI;
    public final boolean LLLFZ;
    public final boolean LLLI;
    public final boolean LLLII;
    public final C1271790jCT LLLIIIIL;
    public final C1271780jCS LLLIIIL;
    public final C1271880jCc LLLIIL;
    public boolean LLLIILIL;
    public final C1269940j9U LLLILZ;
    public InterfaceC1273000jEQ LLLILZJ;
    public long LLJJIJIL = System.currentTimeMillis();
    public boolean LLJJJJ = false;
    public volatile boolean LLJJLIIIJLLLLLLLZ = false;
    public volatile boolean LLJL = false;
    public long LLJLILLLLZIIL = 0;
    public final AtomicBoolean LLJLLIL = new AtomicBoolean(false);
    public boolean LLL = false;
    public boolean LLLF = false;
    public boolean LLLFF = false;
    public long LLLIIII = -1;
    public float LLLIL = 0.0f;

    public void LLIZLLLIL() {
        this.LLILZLL = false;
        if (this.LLJILJIL == null) {
            GLThread gLThreadLIZ = C1271160jBS.LIZ(EnumC1270220j9w.GRK_THREAD, "GLRenderVideoSink");
            this.LLILLL = gLThreadLIZ;
            gLThreadLIZ.start();
            this.LLJILJIL = this.LLILLL.getHandler();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public final void OnDiscardedFrame() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSelfSideRender:");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(" begin release[");
        sbLIZ.append(this);
        sbLIZ.append(e3.f);
        AVLog.ioi("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        SurfaceView surfaceView = this.LLJ;
        if (surfaceView != null && surfaceView.getHolder() != null) {
            this.LLJ.getHolder().removeCallback(this);
            this.LLJ.removeOnLayoutChangeListener(this);
        }
        Handler handler = this.LLJILJIL;
        if (handler != null && !C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 111))) {
            Exception exc = new Exception("Already release at");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isSelfSideRender:");
            sbLIZ2.append(this.LLJLLL);
            sbLIZ2.append(Log.getStackTraceString(exc));
            AVLog.ioe("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("isSelfSideRender:");
        sbLIZ3.append(this.LLJLLL);
        sbLIZ3.append(" end release[");
        sbLIZ3.append(this);
        sbLIZ3.append(e3.f);
        AVLog.ioi("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LLJILJILJ() {
        if (this.LLILZIL != null) {
            if (!GlUtil.nativeIsOpenGlThread()) {
                C1274080jGA.LIZ.LIZ("GLRenderVideoSink.onSurfaceDestroy@2", new AndroidRuntimeException("BUG!!!"));
            }
            this.LLILZIL.LIZLLL();
            C1268470j77 c1268470j77 = this.LLJI;
            if (c1268470j77 != null) {
                c1268470j77.LIZ(1, 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isSelfSideRender:");
                sbLIZ.append(this.LLJLLL);
                sbLIZ.append(" MSG_EGL_SURFACE_DESTROYED from GLRenderVideoSink");
                AVLog.ioi("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public final float getAvgRenderCountAndInvalidate() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = (this.LLJJIJIIJIL * 1.0f) / ((jCurrentTimeMillis - this.LLJJIJIL) / 1000.0f);
        this.LLJJIJIL = jCurrentTimeMillis;
        this.LLJJIJIIJIL = 0;
        return f;
    }

    public Handler LJJLIIIJJI() {
        return this.LLJILJIL;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public final long getLatestRenderCostMs() {
        return this.LLLIIII;
    }

    public static void LLIZ(SurfaceHolderCallbackC1272890jEF surfaceHolderCallbackC1272890jEF) {
        if (surfaceHolderCallbackC1272890jEF.LLILZ != null) {
            GLES20.glFinish();
            Surface surface = surfaceHolderCallbackC1272890jEF.LLIZLLLIL;
            if (surface != null) {
                surface.release();
                surfaceHolderCallbackC1272890jEF.LLIZLLLIL = null;
            }
            GLSurface gLSurface = surfaceHolderCallbackC1272890jEF.LLILZ;
            if (gLSurface != null) {
                gLSurface.surfaceDestroy();
                surfaceHolderCallbackC1272890jEF.LLILZ.release();
                surfaceHolderCallbackC1272890jEF.LLILZ = null;
            }
            ANativeWindowWrapper aNativeWindowWrapper = surfaceHolderCallbackC1272890jEF.LLJZ;
            if (aNativeWindowWrapper != null) {
                aNativeWindowWrapper.release();
                surfaceHolderCallbackC1272890jEF.LLJZ = null;
                surfaceHolderCallbackC1272890jEF.LLL = false;
                surfaceHolderCallbackC1272890jEF.LLLF = false;
            }
            surfaceHolderCallbackC1272890jEF.LLIZ = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSelfSideRender:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJLLL);
            sbLIZ.append(surfaceHolderCallbackC1272890jEF);
            sbLIZ.append(" mSurface is released");
            AVLog.ioi("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
            Handler handlerLJJLIIIJJI = surfaceHolderCallbackC1272890jEF.LJJLIIIJJI();
            if (handlerLJJLIIIJJI != null && C786410Ut5.LJJZZIII(handlerLJJLIIIJJI, new RunnableC514801zW(surfaceHolderCallbackC1272890jEF, 80))) {
                return;
            }
            surfaceHolderCallbackC1272890jEF.LLJILJILJ();
        }
    }

    public void LLJ(SurfaceView surfaceView) {
        LLIZLLLIL();
        this.LLJ = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        surfaceView.addOnLayoutChangeListener(this);
        if (holder.getSurface().isValid() && this.LLJLIL) {
            surfaceCreated(holder);
        }
        surfaceView.getHolder().addCallback(this);
    }

    public void LLJI(TextureView textureView) {
        LLIZLLLIL();
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0jEG
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                this.LL.surfaceDestroyed(null);
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                this.LL.LLIZLLLIL = new Surface(surfaceTexture);
                this.LL.surfaceCreated(null);
                this.LL.surfaceChanged(null, 3, i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                this.LL.surfaceChanged(null, 3, i, i2);
            }
        });
    }

    public final void LLJIJIL(boolean z) {
        AtomicBoolean atomicBoolean = this.LLJLLIL;
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ed, code lost:
    
        if (r20.LLJL != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013e, code lost:
    
        if (r20.LLJJIJI != r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJILJIL(com.ss.ttlivestreamer.core.buffer.VideoFrame r21) {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolderCallbackC1272890jEF.LLJILJIL(com.ss.ttlivestreamer.core.buffer.VideoFrame):void");
    }

    public final void LLJILLL(VideoFrame videoFrame) {
        if (videoFrame == null) {
            return;
        }
        if (!this.LLLII) {
            videoFrame.release();
            return;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (buffer instanceof InterfaceC1271560jC6) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiViewRender_");
            sbLIZ.append(hashCode());
            buffer.release(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        videoFrame.release();
    }

    public final void LLJJ(VideoFrame videoFrame) {
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            C1268470j77 c1268470j77 = this.LLJI;
            if (c1268470j77 != null && videoFrame != null && videoFrame.getBuffer() != null) {
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                long jCurrentTimeMs = TimeUtils.currentTimeMs();
                long captureMs = jCurrentTimeMs - buffer.getCaptureMs();
                if (captureMs < 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Timestamp bug(");
                    sbLIZ.append(buffer.getCaptureMs());
                    sbLIZ.append(" VS ");
                    sbLIZ.append(jCurrentTimeMs);
                    sbLIZ.append(")");
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    C1274080jGA.LIZ.LIZ("GLRenderVideoSink.onFrameAvailable", androidRuntimeException);
                    if (C1274040jG6.LIZ()) {
                        throw androidRuntimeException;
                    }
                }
                c1268470j77.LIZ(3, (int) captureMs);
            }
        }
    }

    public final void LLJJI(boolean z) {
        SurfaceHolder holder;
        int i;
        int i2;
        int i3;
        if ((!this.LLJJLIIIJLLLLLLLZ || !this.LLJJL) && !z) {
            return;
        }
        if (C786410Ut5.u3() != Looper.getMainLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LLJLL, new ARunnableS39S0110000_20(this, z, 7));
            return;
        }
        SurfaceView surfaceView = this.LLJ;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            if ((this.LLJJLIIIJLLLLLLLZ && this.LLJJL) || z) {
                this.LLJJLIIIJLLLLLLLZ = false;
                this.LLJJL = false;
                float fMin = Math.min((this.LLJILLL * 1.0f) / this.LLJJIII, (this.LLJILJILJ * 1.0f) / this.LLJJIJI);
                double d = fMin;
                if (d > 1.0d) {
                    i2 = (int) (this.LLJILLL / fMin);
                    i = (int) (this.LLJILJILJ / fMin);
                } else if (d <= 1.0d) {
                    i2 = this.LLJILLL;
                    i = this.LLJILJILJ;
                } else {
                    i = 0;
                    i2 = 0;
                }
                int i4 = this.LLJJI;
                if (i4 != i2 || this.LLJJ != i) {
                    if (this.LLJJJ.LJFF && i4 != 0 && (i3 = this.LLJJ) != 0 && i != 0) {
                        float f = i2;
                        if (Math.abs(((i4 * 1.0f) / i3) - ((f * 1.0f) / i)) < 0.05f) {
                            float f2 = (this.LLJJI * 1.0f) / f;
                            if (f2 > 0.6f && f2 < 1.6f) {
                                return;
                            }
                        }
                    }
                    if (this.LLJJI == i2 && this.LLJJ == i && this.LLJLIL) {
                        return;
                    }
                    this.LLJJI = i2;
                    this.LLJJ = i;
                    this.LLJL = true;
                    if (this.LLJLIL && this.LLJJI == 0 && this.LLJJ == 0) {
                        this.LLJL = false;
                    }
                    holder.setFixedSize(i2, i);
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.LLLI && !this.LLIZ) {
            return;
        }
        Handler handler = this.LLJILJIL;
        if (handler != null) {
            if (videoFrame != null) {
                if (!this.LLLII) {
                    videoFrame.retain();
                } else {
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    if (buffer instanceof InterfaceC1271560jC6) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MultiViewRender_");
                        sbLIZ.append(hashCode());
                        buffer.retain(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        videoFrame.retain();
                    }
                }
            }
            if (C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(videoFrame, this, 67))) {
                return;
            }
        }
        LLJILLL(videoFrame);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Surface surface;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSelfSideRender:");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(" ");
        sbLIZ.append(this);
        sbLIZ.append(" surfaceCreated");
        AVLog.ioi("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = true;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        } else {
            surface = this.LLIZLLLIL;
        }
        this.LLLFFI = surface;
        Handler handler = this.LLJILJIL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(this, surface, 68));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.LLLFZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this);
            sbLIZ.append(" surfaceDestroyed");
            AVLog.ioi("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILZLL = false;
        this.LLIZ = false;
        Object obj = new Object();
        synchronized (obj) {
            try {
                Handler handler = this.LLJILJIL;
                if (handler != null && C786410Ut5.LJL(handler, new ARunnableS89S0200000_20(this, obj, 69))) {
                    try {
                        obj.wait(3000L);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("isSelfSideRender:");
                        sbLIZ2.append(this.LLJLLL);
                        sbLIZ2.append(" Waited exception ");
                        sbLIZ2.append(th.getMessage());
                        AVLog.ioe("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ2), th);
                    }
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("isSelfSideRender:");
                    sbLIZ3.append(this.LLJLLL);
                    sbLIZ3.append(" already surfaceDestroy");
                    AVLog.w("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ3));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Surface surface;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        } else {
            surface = this.LLIZLLLIL;
        }
        Handler handler = this.LLJILJIL;
        this.LLLFFI = surface;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSelfSideRender:");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(this);
        sbLIZ.append(" surfaceChanged: format ");
        sbLIZ.append(i);
        sbLIZ.append(", width ");
        sbLIZ.append(i2);
        sbLIZ.append(", height ");
        sbLIZ.append(i3);
        AVLog.ioi("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        if (handler != null && C786410Ut5.LJJZZIII(handler, new ARunnableS6S0202000_20(this, i2, i3, surface, 0))) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isSelfSideRender:");
        sbLIZ2.append(this.LLJLLL);
        sbLIZ2.append(this);
        sbLIZ2.append(" surfaceChanged exception! thread already exit.");
        AVLog.iow("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public SurfaceHolderCallbackC1272890jEF(View view, Handler handler, boolean z, C1269180j8G c1269180j8G, C1268800j7e c1268800j7e) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        this.LLJLLL = false;
        this.LLLFZ = false;
        this.LLLI = true;
        this.LLLII = false;
        this.LLLIILIL = false;
        new Stack();
        this.LLJILJIL = handler;
        this.LLILLJJLI = z;
        if (handler != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LL = z2;
        this.LLJJJ = c1269180j8G;
        this.LLJJJIL = c1268800j7e;
        if (z && c1269180j8G != null && c1269180j8G.LIZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJJJJJIL = z3;
        if (z && c1269180j8G != null && c1269180j8G.LIZLLL) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LLJJJJLIIL = z4;
        if (c1269180j8G != null && c1269180j8G.LJIIL) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.LLJLIL = z5;
        if (z4) {
            this.LLJLL = new BPEAHandler(Looper.getMainLooper());
        }
        if (c1269180j8G != null) {
            this.LLJLLL = c1269180j8G.LJIIJJI;
            this.LLJZIJLIL = c1269180j8G.LJI;
            this.LLLFZ = c1269180j8G.LJII;
            this.LLLI = c1269180j8G.LJIIIIZZ;
            this.LLLII = c1269180j8G.LJIILJJIL;
            InterfaceC1272820jE8 interfaceC1272820jE8 = c1269180j8G.LJIIIZ;
            if (interfaceC1272820jE8 != null) {
                this.LLLIIIIL = (C1271790jCT) interfaceC1272820jE8.getService(C1271790jCT.class);
                this.LLLIIIL = (C1271780jCS) interfaceC1272820jE8.getService(C1271780jCS.class);
                this.LLLIIL = (C1271880jCc) interfaceC1272820jE8.getService(C1271880jCc.class);
                this.LLLILZ = (C1269940j9U) interfaceC1272820jE8.getService(C1269940j9U.class);
            }
        }
        if (C1268530j7D.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSelfSideRender:");
            sbLIZ.append(this.LLJLLL);
            sbLIZ.append(" Construct [");
            sbLIZ.append(this);
            sbLIZ.append("] with view ");
            sbLIZ.append(view);
            sbLIZ.append(",enableFixedSize:");
            sbLIZ.append(z);
            sbLIZ.append(". Stack: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            AVLog.iod("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c1268800j7e != null && c1268800j7e.LIZIZ) {
            z6 = true;
        }
        this.LLLIILIL = z6;
        if (view instanceof TextureView) {
            LLJI((TextureView) view);
        } else {
            if (view instanceof SurfaceView) {
                LLJ((SurfaceView) view);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unsupported view ");
            sbLIZ2.append(view);
            throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1269180j8G c1269180j8G;
        int i9;
        boolean zLIZ;
        int i10 = i3 - i;
        int i11 = i4 - i2;
        if (this.LLJILLL != i10 || this.LLJILJILJ != i11) {
            this.LLJILLL = i10;
            this.LLJILJILJ = i11;
            this.LLJJL = true;
        }
        if (this.LLJJJJLIIL) {
            if (this.LLJJIII != 0 && this.LLJJIJI != 0) {
                LLJJI(false);
                return;
            }
            C1269180j8G c1269180j8G2 = this.LLJJJ;
            this.LLJJIII = c1269180j8G2.LIZIZ;
            this.LLJJIJI = c1269180j8G2.LIZJ;
            LLJJI(true);
            return;
        }
        if (this.LLJJJJ || !this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJ = true;
        SurfaceView surfaceView = this.LLJ;
        if (surfaceView == null || (c1269180j8G = this.LLJJJ) == null || (i9 = c1269180j8G.LIZIZ) == 0 || c1269180j8G.LIZJ == 0) {
            return;
        }
        float f = i10;
        float f2 = i11;
        float fMin = Math.min((f * 1.0f) / i9, (1.0f * f2) / c1269180j8G.LIZJ);
        SurfaceHolder holder = surfaceView.getHolder();
        if (fMin <= 1.0d) {
            return;
        }
        int i12 = (int) (f / fMin);
        this.LLJJI = i12;
        int i13 = (int) (f2 / fMin);
        this.LLJJ = i13;
        try {
            holder.setFixedSize(i12, i13);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSelfSideRender:");
            sbLIZ.append(this.LLJLLL);
            sbLIZ.append(" setFixedSize init:");
            sbLIZ.append(this.LLJJI);
            sbLIZ.append("x");
            sbLIZ.append(this.LLJJ);
            AVLog.iow("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (zLIZ) {
            }
        }
    }
}
