package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS7S0102000_20;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.render.ANativeWindowRenderDrawer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jEE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1272880jEE extends SurfaceHolderCallbackC1272890jEF implements InterfaceC1272990jEP, InterfaceC1274490jGp, InterfaceC1268620j7M {
    public GlRenderDrawer LLLIZZ;
    public int LLLJ;
    public int LLLJIL;
    public final C1269760j9C LLLJL;
    public int LLLL;
    public int LLLLII;
    public boolean LLLLIIIILLL;
    public C1272870jED LLLLIIL;
    public final float[] LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public final VideoFrameStatics LLLLJ;
    public long LLLLJI;
    public int LLLLL;
    public boolean LLLLLIL;
    public int[] LLLLLILLIL;
    public InterfaceC1272960jEM LLLLLJIL;
    public C1272970jEN LLLLLJLJLL;
    public long LLLLLL;
    public boolean LLLLLLIL;
    public boolean LLLLLLJ;
    public boolean LLLLLLL;
    public final boolean LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public final View LLLLLLLZIL;
    public C1269650j91 LLLLLLZ;
    public ANativeWindowRenderDrawer LLLLLLZZ;
    public C1272860jEC LLLLLZ;
    public boolean LLLLLZIL;
    public Matrix LLLLLZL;
    public final C1272940jEK LLLLZ;
    public int LLLLZI;
    public int LLLLZIL;
    public int LLLLZLL;
    public final boolean LLLLZLLIL;
    public final boolean LLLLZLLLI;
    public C1267500j5Y LLLZ;

    @Override // X.InterfaceC1274490jGp
    public final void LJJIIJ() {
        AVLog.logKibana(4, "RenderView", "releaseExtraEffctNode", null);
        C1269650j91 c1269650j91 = this.LLLLLLZ;
        if (c1269650j91 != null) {
            c1269650j91.release();
            this.LLLLLLZ = null;
        }
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        AVLog.iow("RenderView", "RenderView released.");
        C1269650j91 c1269650j91 = this.LLLLLLZ;
        if (c1269650j91 != null) {
            c1269650j91.release();
            this.LLLLLLZ = null;
        }
        super.release();
    }

    public void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onSurfaceDestroy");
        AVLog.iow("RenderView", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.LLLJL) {
            try {
                C1269760j9C c1269760j9C = this.LLLJL;
                c1269760j9C.LIZ = 0;
                c1269760j9C.LIZIZ = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        GlRenderDrawer glRenderDrawer = this.LLLIZZ;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.LLLIZZ = null;
        }
        ANativeWindowRenderDrawer aNativeWindowRenderDrawer = this.LLLLLLZZ;
        if (aNativeWindowRenderDrawer != null) {
            aNativeWindowRenderDrawer.release();
            this.LLLLLLZZ = null;
        }
        C1272870jED c1272870jED = this.LLLLIIL;
        if (c1272870jED != null) {
            c1272870jED.LIZJ();
            this.LLLLIIL = null;
        }
        this.LLLLLZ = null;
        this.LLLLLLIL = false;
    }

    public void LJJIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onSurfaceCreated");
        AVLog.iow("RenderView", C2188811AlT.LIZIZ(sbLIZ));
        GlRenderDrawer glRenderDrawer = new GlRenderDrawer();
        this.LLLIZZ = glRenderDrawer;
        boolean z = this.LLLIILIL;
        if (z) {
            glRenderDrawer.setEnableRoundedCorner(z);
            this.LLLIZZ.setCornerRadius(this.LLLIL);
        }
        C1272870jED c1272870jED = new C1272870jED();
        this.LLLLIIL = c1272870jED;
        c1272870jED.LIZLLL = this.LLLLLLLLL;
        c1272870jED.LJIIL = this.LLLLZLLIL;
        c1272870jED.LJIILIIL = this.LLLLZLLLI;
        C1268800j7e c1268800j7e = this.LLJJJIL;
        if (c1268800j7e != null && c1268800j7e.LIZ) {
            c1272870jED.LJ = true;
        }
        this.LLLLLLIL = true;
        if (this.LLJZIJLIL) {
            if (this.LLLLLLZZ == null) {
                ANativeWindowRenderDrawer aNativeWindowRenderDrawer = new ANativeWindowRenderDrawer();
                this.LLLLLLZZ = aNativeWindowRenderDrawer;
                aNativeWindowRenderDrawer.bindANativeWindow(this.LLJZ);
            }
            this.LLLLLLZZ.setRoundCornerToWidthRadius(this.LLLIILIL ? this.LLLIL : 0.0f);
            if (this.LLLLLZ == null) {
                this.LLLLLZ = new C1272860jEC();
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" onSurfaceCreated");
        AVLog.logKibana(4, "RenderView", C2188811AlT.LIZIZ(sbLIZ2), null);
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF
    public void LLIZLLLIL() {
        super.LLIZLLLIL();
        this.LLILZIL = this;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" setRenderer");
        AVLog.iod("RenderView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1274490jGp
    public final boolean LJJLIIIIJ() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1274490jGp
    public final boolean LJLLLLLL() {
        return this.LLLIILIL;
    }

    public C1272880jEE(View view) {
        this(view, null, false, false, null, null);
    }

    public static String LLJJIJI(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("0x");
        sbLIZ.append(Integer.toHexString(i));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1274490jGp
    public void LJLLJ(boolean z) {
        this.LLLLIILLL = z;
        this.LLLLIIIILLL = true;
    }

    @Override // X.InterfaceC1272990jEP
    public void LLILII(VideoFrame videoFrame) {
        LLJJIJIIJIL(videoFrame, false);
    }

    @Override // X.SurfaceHolderCallbackC1272890jEF, com.ss.ttlivestreamer.core.engine.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        float realRatePerSecond;
        this.LLLLL++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLLLJI >= 30000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[repeat ");
            sbLIZ.append(this.LLLLL);
            sbLIZ.append(" times] ");
            sbLIZ.append(this);
            sbLIZ.append(" onFrame videoFps is: ");
            VideoFrameStatics videoFrameStatics = this.LLLLJ;
            if (videoFrameStatics != null) {
                realRatePerSecond = videoFrameStatics.getRealRatePerSecond();
            } else {
                realRatePerSecond = -1.0f;
            }
            sbLIZ.append(realRatePerSecond);
            AVLog.iow("RenderView", C2188811AlT.LIZIZ(sbLIZ));
            this.LLLLJI = jCurrentTimeMillis;
            this.LLLLL = 0;
        }
        super.onFrame(videoFrame);
    }

    @Override // X.InterfaceC1274490jGp
    public final void setCornerRadius(float f) {
        float f2;
        Handler handler;
        Handler handlerLJJLIIIJJI;
        C1269180j8G c1269180j8G = this.LLJJJ;
        if (c1269180j8G != null && c1269180j8G.LJIIJ) {
            if (this.LLLLLLZZ != null && (handlerLJJLIIIJJI = LJJLIIIJJI()) != null) {
                C786410Ut5.LJJZZIII(handlerLJJLIIIJJI, new ARunnableS120S0100000_20(this, 357));
            }
        } else {
            ANativeWindowRenderDrawer aNativeWindowRenderDrawer = this.LLLLLLZZ;
            if (aNativeWindowRenderDrawer != null) {
                if (this.LLLIILIL) {
                    f2 = this.LLLIL;
                } else {
                    f2 = 0.0f;
                }
                aNativeWindowRenderDrawer.setRoundCornerToWidthRadius(f2);
            }
        }
        if (!this.LLLIILIL || f == this.LLLIL) {
            return;
        }
        this.LLLIL = f;
        GlRenderDrawer glRenderDrawer = this.LLLIZZ;
        if (glRenderDrawer != null) {
            C1268800j7e c1268800j7e = this.LLJJJIL;
            if (c1268800j7e != null && c1268800j7e.LIZJ && (handler = this.LLJILJIL) != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 360));
            } else {
                glRenderDrawer.setCornerRadius(f);
            }
        }
        C1268800j7e c1268800j7e2 = this.LLJJJIL;
        if (c1268800j7e2 != null) {
            if (f > 0.0d) {
                this.LLLLLZIL = c1268800j7e2.LIZ;
                c1268800j7e2.LIZ = false;
            } else {
                c1268800j7e2.LIZ = this.LLLLLZIL;
            }
        }
    }

    @Override // X.InterfaceC1274490jGp
    public final void setEnable(boolean z) {
        this.LLLLLIL = z;
    }

    @Override // X.InterfaceC1268620j7M
    public final VideoFrame.I420Buffer toI420(InterfaceC1271560jC6 interfaceC1271560jC6) {
        throw new AndroidRuntimeException("BUG! Should not be here.");
    }

    public C1272880jEE(View view, C1268800j7e c1268800j7e) {
        this(view, null, false, false, null, c1268800j7e);
    }

    public static String LLJJIJIL(int i, int i2) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4);
        GLES20.glReadPixels(i, i2, 1, 1, 6408, 5121, byteBufferAllocateDirect);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(byteBufferAllocateDirect.get(0) & 255);
        sbLIZ.append(",");
        sbLIZ.append(byteBufferAllocateDirect.get(1) & 255);
        sbLIZ.append(",");
        sbLIZ.append(byteBufferAllocateDirect.get(2) & 255);
        sbLIZ.append(",");
        sbLIZ.append(byteBufferAllocateDirect.get(3) & 255);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public void LJLL(int i, int i2) {
        this.LLLJ = i;
        this.LLLJIL = i2;
        C1268800j7e c1268800j7e = this.LLJJJIL;
        if (c1268800j7e != null && c1268800j7e.LIZ) {
            synchronized (this.LLLJL) {
                try {
                    C1269760j9C c1269760j9C = this.LLLJL;
                    c1269760j9C.LIZ = i;
                    c1269760j9C.LIZIZ = i2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LLLLIIIILLL = true;
        C1272970jEN c1272970jEN = this.LLLLLJLJLL;
        if (c1272970jEN != null) {
            C786410Ut5.LJJZZIII(((C1275150jHt) c1272970jEN.LIZ.l1).LJIILLIIL, new ARunnableS7S0102000_20(i, c1272970jEN, i2, 7));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onSurfaceChanged (");
        sbLIZ.append(i);
        sbLIZ.append(",");
        sbLIZ.append(i2);
        sbLIZ.append(")");
        AVLog.iow("RenderView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LLJJIII(int i, int i2) {
        boolean z = this.LLLLIILLL;
        this.LLLLII = i2;
        this.LLLL = i;
        android.opengl.Matrix.setIdentityM(this.LLLLIILL, 0);
        C1273010jER.LIZ(z, this.LLLLIL, this.LLLLILI, this.LLLJ, this.LLLJIL, i, i2, this.LLLLIILL);
    }

    public final void LLJJIJIIJIL(VideoFrame videoFrame, boolean z) {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        Throwable th;
        int i6;
        boolean zLIZ;
        C1267500j5Y c1267500j5Y;
        int height;
        int width;
        int i7;
        int bufferType;
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        InterfaceC1272960jEM interfaceC1272960jEM;
        char c2;
        Matrix matrixLIZJ;
        C1269650j91 c1269650j91;
        VideoFrame videoFrameLJIIJ;
        VideoFrame videoFrame2;
        C1268800j7e c1268800j7e = this.LLJJJIL;
        if (c1268800j7e != null && c1268800j7e.LIZ) {
            synchronized (this.LLLJL) {
                try {
                    C1269760j9C c1269760j9C = this.LLLJL;
                    i = c1269760j9C.LIZ;
                    i2 = c1269760j9C.LIZIZ;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if (this.LLLIZZ == null) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this);
                sbLIZ.append(" mDrawer is null");
                AVLog.logToIODevice2(5, "RenderView", C2188811AlT.LIZIZ(sbLIZ), null, 45, 10000);
            }
            if (this.LLLLZLLIL) {
                if (this.LLLLZI % 150 == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this);
                    sbLIZ2.append(" mDrawer is null, count:");
                    sbLIZ2.append(this.LLLLZI + 1);
                    AVLog.logKibana(6, "RenderView", C2188811AlT.LIZIZ(sbLIZ2), null);
                    this.LLLLZI -= 150;
                }
                this.LLLLZI++;
                return;
            }
            return;
        }
        videoFrame.getTextureId();
        VideoFrameStatics videoFrameStatics = this.LLLLJ;
        if (videoFrameStatics != null) {
            videoFrameStatics.add();
        }
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (this.LLLLIIIILLL || rotatedHeight != this.LLLLII || rotatedWidth != this.LLLL) {
            LLJJIII(rotatedWidth, rotatedHeight);
            this.LLLLIIIILLL = false;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (z) {
            if (this.LLLLLLZZ != null && this.LLLLLZ != null) {
                if (buffer.getBufferType() != 3 && buffer.getBufferType() != 8) {
                    if (buffer.getBufferType() == 1 && (c1269650j91 = this.LLLLLLZ) != null && c1269650j91.LLJILJIL && (videoFrameLJIIJ = c1269650j91.LJIIJ(videoFrame)) != null) {
                        int rotatedWidth2 = videoFrameLJIIJ.getRotatedWidth();
                        int rotatedHeight2 = videoFrameLJIIJ.getRotatedHeight();
                        long captureMs = videoFrame.getBuffer().getCaptureMs();
                        int textureId = videoFrameLJIIJ.getTextureId();
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth2 * rotatedHeight2 * 4);
                        byteBufferAllocateDirect.clear();
                        int[] iArr = new int[1];
                        GLES20.glGenFramebuffers(1, iArr, 0);
                        int i8 = iArr[0];
                        int[] iArr2 = new int[1];
                        GLES20.glGetIntegerv(36006, IntBuffer.wrap(iArr2));
                        int i9 = iArr2[0];
                        GLES20.glBindFramebuffer(36160, i8);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureId, 0);
                        GLES20.glReadPixels(0, 0, rotatedWidth2, rotatedHeight2, 6408, 5121, byteBufferAllocateDirect);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        GLES20.glBindFramebuffer(36160, i9);
                        byteBufferAllocateDirect.clear();
                        C1272850jEB c1272850jEB = new C1272850jEB(byteBufferAllocateDirect, rotatedWidth2, rotatedHeight2, new ARunnableS120S0100000_20(videoFrameLJIIJ, 351), captureMs);
                        C1271790jCT c1271790jCT = this.LLLIIIIL;
                        if (c1271790jCT != null) {
                            videoFrame2 = c1271790jCT.LIZLLL(c1272850jEB, 0, captureMs);
                            if (videoFrame2 == null) {
                                c1272850jEB.release();
                            }
                        } else {
                            videoFrame2 = new VideoFrame(c1272850jEB, 0, captureMs);
                        }
                        C1272860jEC c1272860jEC = this.LLLLLZ;
                        ANativeWindowRenderDrawer aNativeWindowRenderDrawer = this.LLLLLLZZ;
                        c1272860jEC.getClass();
                        boolean zLIZ2 = C1272860jEC.LIZ(aNativeWindowRenderDrawer, videoFrame2);
                        videoFrame2.release();
                        if (!zLIZ2) {
                            this.LLLFF = true;
                        }
                    }
                } else {
                    C1272860jEC c1272860jEC2 = this.LLLLLZ;
                    ANativeWindowRenderDrawer aNativeWindowRenderDrawer2 = this.LLLLLLZZ;
                    c1272860jEC2.getClass();
                    if (!C1272860jEC.LIZ(aNativeWindowRenderDrawer2, videoFrame)) {
                        this.LLLFF = true;
                    }
                }
            }
            c = 3;
        } else {
            C1272870jED c1272870jED = this.LLLLIIL;
            GlRenderDrawer glRenderDrawer = this.LLLIZZ;
            if (c1272870jED != null && glRenderDrawer != null) {
                C1269650j91 c1269650j912 = this.LLLLLLZ;
                if (c1269650j912 != null && c1269650j912.LLJILJIL && (videoFrame.getBuffer() instanceof InterfaceC1271560jC6)) {
                    VideoFrame videoFrameLJIIJ2 = this.LLLLLLZ.LJIIJ(videoFrame);
                    if (videoFrameLJIIJ2 != null) {
                        zLIZ = c1272870jED.LIZ(videoFrameLJIIJ2, glRenderDrawer, this.LLLLIILL, this.LLLJ, this.LLLJIL);
                        videoFrameLJIIJ2.release();
                    } else {
                        zLIZ = false;
                    }
                    i3 = 36160;
                    i5 = 3553;
                    i6 = 6;
                    i4 = 1;
                    th = null;
                    c = 3;
                } else {
                    C1268800j7e c1268800j7e2 = this.LLJJJIL;
                    if (c1268800j7e2 != null && c1268800j7e2.LIZ) {
                        if (GLThreadManager.getConfigGLVersion() == 3 && (videoFrame.getBuffer() instanceof InterfaceC1271560jC6) && ((InterfaceC1271560jC6) videoFrame.getBuffer()).getType() == EnumC1273550jFJ.RGB && i > 0 && i2 > 0 && this.LLLLLLLLLL) {
                            InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) videoFrame.getBuffer();
                            float width2 = (interfaceC1271560jC6.getWidth() * 1.0f) / interfaceC1271560jC6.getHeight();
                            float f = (i * 1.0f) / i2;
                            if (width2 < f) {
                                height = (interfaceC1271560jC6.getHeight() - ((int) (interfaceC1271560jC6.getWidth() / f))) / 2;
                                i7 = 1;
                                width = 0;
                            } else {
                                if (width2 > f) {
                                    width = (interfaceC1271560jC6.getWidth() - ((int) (interfaceC1271560jC6.getHeight() * f))) / 2;
                                    height = 0;
                                } else {
                                    height = 0;
                                    width = 0;
                                }
                                i7 = 1;
                            }
                            int[] iArr3 = new int[i7];
                            GLES30.glGenFramebuffers(i7, iArr3, 0);
                            int i10 = iArr3[0];
                            GLES30.glBindFramebuffer(36160, i10);
                            GLES30.glFramebufferTexture2D(36160, 36064, 3553, interfaceC1271560jC6.getTextureId(), 0);
                            GLES30.glBindFramebuffer(36008, i10);
                            GLES30.glBindFramebuffer(36009, 0);
                            int iGlCheckFramebufferStatus = GLES30.glCheckFramebufferStatus(36008);
                            int iGlCheckFramebufferStatus2 = GLES30.glCheckFramebufferStatus(36009);
                            if (iGlCheckFramebufferStatus == 36053 && iGlCheckFramebufferStatus2 == 36053) {
                                i3 = 36160;
                                c = 3;
                                GLES30.glBlitFramebuffer(width, height, interfaceC1271560jC6.getWidth() - width, interfaceC1271560jC6.getHeight() - height, 0, i2, i, 0, 16384, 9729);
                                GLES30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                GLES30.glBindFramebuffer(36008, 0);
                                GLES30.glBindFramebuffer(36009, 0);
                                GLES30.glBindFramebuffer(36160, 0);
                                i4 = 1;
                                GLES30.glDeleteFramebuffers(1, iArr3, 0);
                                zLIZ = true;
                            } else {
                                i3 = 36160;
                                i4 = 1;
                                c = 3;
                                GLES30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                GLES30.glBindFramebuffer(36008, 0);
                                GLES30.glBindFramebuffer(36009, 0);
                                GLES30.glBindFramebuffer(36160, 0);
                                GLES30.glDeleteFramebuffers(1, iArr3, 0);
                                zLIZ = false;
                            }
                            i5 = 3553;
                            i6 = 6;
                            th = null;
                            c1267500j5Y = this.LLLZ;
                            if (c1267500j5Y != null && c1267500j5Y.LIZJ.getService(C1266790j4P.class) != null) {
                                videoFrame.getBuffer();
                            }
                        } else {
                            c = 3;
                            i3 = 36160;
                            i4 = 1;
                        }
                    } else {
                        i3 = 36160;
                        i4 = 1;
                        c = 3;
                    }
                    i5 = 3553;
                    th = null;
                    i6 = 6;
                    zLIZ = c1272870jED.LIZ(videoFrame, glRenderDrawer, this.LLLLIILL, this.LLLJ, this.LLLJIL);
                    c1267500j5Y = this.LLLZ;
                    if (c1267500j5Y != null) {
                        videoFrame.getBuffer();
                    }
                }
                if (!zLIZ) {
                    if (AVLog.enableLogToIODevice2()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(this);
                        sbLIZ3.append(" Render frame failed timestamp ");
                        sbLIZ3.append(videoFrame.getTimestampNs());
                        AVLog.logToIODevice2(5, "RenderView", C2188811AlT.LIZIZ(sbLIZ3), th, 46, 10000);
                    }
                    if (this.LLLLZLLIL) {
                        if (this.LLLLZIL % 150 == 0) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(this);
                            sbLIZ4.append(" Render frame failed timestamp ");
                            sbLIZ4.append(videoFrame.getTimestampNs());
                            sbLIZ4.append(", count: ");
                            sbLIZ4.append(this.LLLLZIL + 1);
                            AVLog.logKibana(i6, "RenderView", C2188811AlT.LIZIZ(sbLIZ4), th);
                            this.LLLLZIL -= 150;
                        }
                        this.LLLLZIL++;
                    }
                }
                long jCurrentTimeMs = TimeUtils.currentTimeMs();
                if (jCurrentTimeMs - this.LLLLLL >= 2000) {
                    this.LLLLLL = jCurrentTimeMs;
                    VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
                    int textureId2 = videoFrame.getTextureId();
                    if (buffer2 != null) {
                        bufferType = buffer2.getBufferType();
                    } else {
                        bufferType = -1;
                    }
                    int iGlGetError = GLES20.glGetError();
                    EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("LyraxCapturePreviewRender phase=render_view draw_result=");
                    sbLIZ5.append(zLIZ);
                    sbLIZ5.append(", texture_id=");
                    sbLIZ5.append(textureId2);
                    sbLIZ5.append(", buffer_type=");
                    sbLIZ5.append(bufferType);
                    sbLIZ5.append(", frame_size=");
                    sbLIZ5.append(videoFrame.getRotatedWidth());
                    sbLIZ5.append("x");
                    sbLIZ5.append(videoFrame.getRotatedHeight());
                    sbLIZ5.append(", window_size=");
                    sbLIZ5.append(this.LLLJ);
                    sbLIZ5.append("x");
                    sbLIZ5.append(this.LLLJIL);
                    sbLIZ5.append(", surface_size=");
                    sbLIZ5.append(i);
                    sbLIZ5.append("x");
                    sbLIZ5.append(i2);
                    sbLIZ5.append(", gl_error=");
                    sbLIZ5.append(iGlGetError);
                    sbLIZ5.append(", current_egl=");
                    if (eGLContextEglGetCurrentContext == null) {
                        strLIZIZ = "null";
                    } else {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(eGLContextEglGetCurrentContext);
                        sbLIZ6.append("/native=");
                        sbLIZ6.append(eGLContextEglGetCurrentContext.getNativeHandle());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                    }
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append(", input_sample=");
                    if (!(buffer2 instanceof InterfaceC1271560jC6)) {
                        strLIZIZ3 = "skip_non_texture";
                    } else {
                        InterfaceC1271560jC6 interfaceC1271560jC62 = (InterfaceC1271560jC6) buffer2;
                        if (interfaceC1271560jC62.getType() != EnumC1273550jFJ.RGB) {
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("skip_");
                            sbLIZ7.append(interfaceC1271560jC62.getType());
                            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
                        } else {
                            int[] iArr4 = new int[i4];
                            int[] iArr5 = new int[i4];
                            GLES20.glGetIntegerv(36006, iArr4, 0);
                            GLES20.glGenFramebuffers(i4, iArr5, 0);
                            GLES20.glBindFramebuffer(i3, iArr5[0]);
                            GLES20.glFramebufferTexture2D(i3, 36064, i5, interfaceC1271560jC62.getTextureId(), 0);
                            int iGlCheckFramebufferStatus3 = GLES20.glCheckFramebufferStatus(i3);
                            if (iGlCheckFramebufferStatus3 == 36053) {
                                int iMax = Math.max(0, interfaceC1271560jC62.getWidth() / 2);
                                int iMax2 = Math.max(0, interfaceC1271560jC62.getHeight() / 2);
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("status=");
                                sbLIZ8.append(LLJJIJI(iGlCheckFramebufferStatus3));
                                sbLIZ8.append(", rgba=");
                                sbLIZ8.append(LLJJIJIL(iMax, iMax2));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
                            } else {
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("status=");
                                sbLIZ9.append(LLJJIJI(iGlCheckFramebufferStatus3));
                                sbLIZ9.append(", rgba=unavailable");
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ9);
                            }
                            GLES20.glFramebufferTexture2D(i3, 36064, i5, 0, 0);
                            GLES20.glBindFramebuffer(i3, iArr4[0]);
                            GLES20.glDeleteFramebuffers(1, iArr5, 0);
                            int iGlGetError2 = GLES20.glGetError();
                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                            sbLIZ10.append(strLIZIZ2);
                            sbLIZ10.append(", error=");
                            sbLIZ10.append(LLJJIJI(iGlGetError2));
                            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ10);
                        }
                    }
                    sbLIZ5.append(strLIZIZ3);
                    sbLIZ5.append(", framebuffer_sample=");
                    int[] iArr6 = new int[1];
                    int[] iArr7 = new int[4];
                    GLES20.glGetIntegerv(36006, iArr6, 0);
                    GLES20.glGetIntegerv(2978, iArr7, 0);
                    GLES20.glBindFramebuffer(i3, 0);
                    String strLLJJIJIL = LLJJIJIL(iArr7[0] + (Math.max(1, iArr7[2]) / 2), iArr7[1] + (Math.max(1, iArr7[c]) / 2));
                    GLES20.glBindFramebuffer(i3, iArr6[0]);
                    int iGlGetError3 = GLES20.glGetError();
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("viewport=");
                    sbLIZ11.append(iArr7[2]);
                    sbLIZ11.append("x");
                    sbLIZ11.append(iArr7[c]);
                    sbLIZ11.append(", rgba=");
                    sbLIZ11.append(strLLJJIJIL);
                    sbLIZ11.append(", error=");
                    sbLIZ11.append(LLJJIJI(iGlGetError3));
                    sbLIZ5.append(C2188811AlT.LIZIZ(sbLIZ11));
                    sbLIZ5.append(", is_main_renderer=");
                    sbLIZ5.append(this.LLLLLLLLLL);
                    sbLIZ5.append(", enable=");
                    sbLIZ5.append(this.LLLLLIL);
                    C2188811AlT.LIZIZ(sbLIZ5);
                }
            } else {
                c = 3;
                if (AVLog.enableLogToIODevice2()) {
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append(this);
                    sbLIZ12.append(" Render frame failed: render ");
                    sbLIZ12.append(c1272870jED);
                    sbLIZ12.append(", drawer ");
                    sbLIZ12.append(glRenderDrawer);
                    AVLog.logToIODevice2(5, "RenderView", C2188811AlT.LIZIZ(sbLIZ12), null, 47, 10000);
                }
                if (this.LLLLZLLIL) {
                    if (this.LLLLZLL % 150 == 0) {
                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                        sbLIZ13.append(this);
                        sbLIZ13.append(" Render frame failed: render ");
                        sbLIZ13.append(c1272870jED);
                        sbLIZ13.append(", drawer ");
                        sbLIZ13.append(glRenderDrawer);
                        sbLIZ13.append(", count: ");
                        sbLIZ13.append(this.LLLLZLL + 1);
                        AVLog.logKibana(6, "RenderView", C2188811AlT.LIZIZ(sbLIZ13), null);
                        this.LLLLZLL -= 150;
                    }
                    this.LLLLZLL++;
                }
            }
        }
        int[] iArr8 = this.LLLLLILLIL;
        if (iArr8 != null && (interfaceC1272960jEM = this.LLLLLJIL) != null) {
            if (iArr8[2] != 0 && iArr8[c] != 0) {
                if (C1273520jFG.LIZJ) {
                    if (this.LLLLLZL == null) {
                        Matrix matrix = new Matrix();
                        this.LLLLLZL = matrix;
                        matrix.preTranslate(0.0f, 1.0f);
                        this.LLLLLZL.preScale(1.0f, -1.0f);
                    }
                    matrixLIZJ = this.LLLLLZL;
                    c2 = 1;
                } else {
                    c2 = 1;
                    matrixLIZJ = C1273520jFG.LIZJ(true);
                    matrixLIZJ.preTranslate(0.0f, 1.0f);
                    matrixLIZJ.preScale(1.0f, -1.0f);
                }
                int[] iArr9 = this.LLLLLILLIL;
                int i11 = iArr9[0];
                int i12 = iArr9[c2];
                int i13 = iArr9[2];
                int i14 = iArr9[c];
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i13 * i14 * 4);
                GLES20.glReadPixels(i11, i12, i13, i14, 6408, 5121, byteBufferAllocate);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrixLIZJ, false);
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                this.LLLLLJIL.LIZLLL(bitmapCreateBitmap2);
                this.LLLLLILLIL = null;
                return;
            }
            new Exception("catch region is invalid");
            interfaceC1272960jEM.LIZJ();
            this.LLLLLILLIL = null;
        }
    }

    public void LLJJJ(boolean z, boolean z2) {
        if (z2) {
            this.LLLLIL = z;
        } else {
            this.LLLLILI = z;
        }
        this.LLLLIIIILLL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1272880jEE(android.view.View r12, android.os.Handler r13, boolean r14, boolean r15, X.C1269180j8G r16, X.C1268800j7e r17) {
        /*
            r11 = this;
            r10 = r17
            r8 = r15
            r7 = r13
            r6 = r12
            r9 = r16
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            X.0j9C r0 = new X.0j9C
            r3 = 0
            r0.<init>(r3, r3)
            r5.LLLJL = r0
            r5.LLLLIIIILLL = r3
            r0 = 16
            float[] r2 = new float[r0]
            r5.LLLLIILL = r2
            r5.LLLLIILLL = r3
            r5.LLLLIL = r3
            r5.LLLLILI = r3
            r0 = 0
            r5.LLLLJI = r0
            r5.LLLLL = r3
            r4 = 1
            r5.LLLLLIL = r4
            r0 = 0
            r5.LLLLLILLIL = r0
            r5.LLLLLLIL = r3
            r5.LLLLLLJ = r3
            r5.LLLLLLL = r3
            r5.LLLLLLLLL = r3
            r5.LLLLLLLLLL = r3
            r5.LLLLLLZ = r0
            r5.LLLLLZIL = r3
            X.0jEK r0 = new X.0jEK
            r0.<init>()
            r5.LLLLZ = r0
            r5.LLLLZI = r3
            r5.LLLLZIL = r3
            r5.LLLLZLL = r3
            r5.LLLLZLLIL = r4
            r5.LLLLZLLLI = r3
            android.opengl.Matrix.setIdentityM(r2, r3)
            X.0jED r0 = new X.0jED
            r0.<init>()
            r5.LLLLIIL = r0
            android.content.Context r0 = r6.getContext()
            boolean r0 = com.ss.ttlivestreamer.core.opengl.GlUtil.isGLES3Support(r0)
            r5.LLLLLLLLL = r0
            X.0jED r2 = r5.LLLLIIL
            r2.LIZLLL = r0
            r5.LLLLLLLZIL = r6
            X.0j7e r1 = r5.LLJJJIL
            if (r1 == 0) goto L9e
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L70
            r2.LJ = r4
        L70:
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L76
            r2.LJFF = r4
        L76:
            boolean r0 = r1.LIZLLL
            if (r0 != 0) goto L7c
            r5.LLLLZLLIL = r3
        L7c:
            boolean r0 = r1.LJ
            if (r0 == 0) goto L9e
            r1 = 1
        L81:
            r5.LLLLZLLLI = r1
            boolean r0 = r5.LLLLZLLIL
            r2.LJIIL = r0
            r2.LJIILIIL = r1
            if (r14 == 0) goto L94
            com.ss.ttlivestreamer.core.utils.VideoFrameStatics r1 = new com.ss.ttlivestreamer.core.utils.VideoFrameStatics
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r0)
            r5.LLLLJ = r1
        L94:
            if (r10 == 0) goto L9b
            boolean r0 = r10.LIZ
            if (r0 == 0) goto L9b
            r3 = 1
        L9b:
            r5.LLLLLZIL = r3
            return
        L9e:
            r1 = 0
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1272880jEE.<init>(android.view.View, android.os.Handler, boolean, boolean, X.0j8G, X.0j7e):void");
    }

    @Override // X.InterfaceC1274490jGp
    public final int LLI(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, long j, RunnableC1275220jI0 runnableC1275220jI0, int i3, C1271970jCl c1271970jCl, Map map) {
        return LLILLL(byteBufferArr, iArr, i, i2, i3, 0, j, runnableC1275220jI0, c1271970jCl, 0, map);
    }

    @Override // X.InterfaceC1274490jGp
    public final int LLIILZL(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, C1274550jGv c1274550jGv, RunnableC1275220jI0 runnableC1275220jI0, Map map) {
        return LJII(i, z, i2, i3, i4, fArr, j, c1274550jGv, runnableC1275220jI0, 0, map);
    }

    @Override // X.InterfaceC1274490jGp
    public final int LJII(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, C1274550jGv c1274550jGv, final Runnable runnable, int i5, Map map) {
        Matrix matrixLIZJ;
        boolean z2;
        EnumC1273550jFJ enumC1273550jFJ;
        k kVarLIZ;
        VideoFrame videoFrame;
        EnumC1273550jFJ enumC1273550jFJ2;
        float[] fArrCopyOf;
        if (!this.LLLLLIL) {
            return -1;
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = null;
        if (C1273520jFG.LIZJ) {
            C1272940jEK c1272940jEK = this.LLLLZ;
            if (c1272940jEK.LIZIZ == null || ((fArr != null || c1272940jEK.LIZ != null) && !Arrays.equals(fArr, c1272940jEK.LIZ))) {
                if (fArr == null) {
                    fArrCopyOf = null;
                } else {
                    fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                }
                c1272940jEK.LIZ = fArrCopyOf;
                if (fArr == null) {
                    c1272940jEK.LIZIZ = new Matrix();
                } else {
                    c1272940jEK.LIZIZ = C1273010jER.LIZJ(0, fArr);
                }
            }
            matrixLIZJ = this.LLLLZ.LIZIZ;
        } else if (fArr == null) {
            matrixLIZJ = new Matrix();
        } else {
            matrixLIZJ = C1273010jER.LIZJ(0, fArr);
        }
        if (c1274550jGv != null && (this.LLLLLLJ || this.LLJZIJLIL || this.LLLIIIL != null)) {
            z2 = true;
            c1274550jGv.retain();
            aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1274550jGv, 352);
        } else {
            z2 = false;
        }
        C1271780jCS c1271780jCS = this.LLLIIIL;
        if (c1271780jCS != null) {
            if (z) {
                enumC1273550jFJ2 = EnumC1273550jFJ.OES;
            } else {
                enumC1273550jFJ2 = EnumC1273550jFJ.RGB;
            }
            kVarLIZ = c1271780jCS.LJ(i2, i3, enumC1273550jFJ2, i, matrixLIZJ, this, aRunnableS120S0100000_20);
        } else {
            if (z) {
                enumC1273550jFJ = EnumC1273550jFJ.OES;
            } else {
                enumC1273550jFJ = EnumC1273550jFJ.RGB;
            }
            kVarLIZ = C1271950jCj.LIZ(i2, i3, enumC1273550jFJ, i, matrixLIZJ, this, aRunnableS120S0100000_20, null);
        }
        if (kVarLIZ == null) {
            if (z2) {
                aRunnableS120S0100000_20.run();
            }
            return -1;
        }
        if (this.LLLLZLLLI) {
            kVarLIZ.setTransformMatrixArray(fArr);
        }
        kVarLIZ.setRenderType(i5);
        this.LLLILZJ = new InterfaceC1273000jEQ() { // from class: X.0jEI
            @Override // X.InterfaceC1273000jEQ
            public final void onRendered() {
                Runnable runnable2 = runnable;
                C1C7U.LIZ("RenderView@e1fb.pushVideoFrame$2L");
                runnable2.run();
                C1C7U.LIZIZ("RenderView@e1fb.pushVideoFrame$2L");
            }
        };
        kVarLIZ.updateCaptureMs(TimeUtils.currentTimeMs());
        long j2 = 1000 * j;
        C1271790jCT c1271790jCT = this.LLLIIIIL;
        if (c1271790jCT != null) {
            videoFrame = c1271790jCT.LIZLLL(kVarLIZ, i4, j2);
            if (videoFrame != null) {
            }
            kVarLIZ.release();
            return 0;
        }
        videoFrame = new VideoFrame(kVarLIZ, i4, j2);
        HashMap map2 = (HashMap) map;
        if (map2.containsKey("render_start_server_ntp_ms")) {
            videoFrame.setRenderStartServerNtpMs(((Long) map2.get("render_start_server_ntp_ms")).longValue());
        }
        onFrame(videoFrame);
        kVarLIZ.release();
        return 0;
    }

    @Override // X.InterfaceC1274490jGp
    public final int LLILLL(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, int i4, long j, final Runnable runnable, C1271970jCl c1271970jCl, int i5, Map map) {
        boolean z;
        ARunnableS120S0100000_20 aRunnableS120S0100000_20;
        VideoFrame videoFrame;
        if (!this.LLLLLIL) {
            return -1;
        }
        if (!this.LLLLLLL && !this.LLJZIJLIL && this.LLLIIL == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            com.ss.bytertc.engine.video.VideoFrame videoFrame2 = c1271970jCl.LIZ;
            if (videoFrame2 != null) {
                videoFrame2.retain();
            }
            aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1271970jCl, 355);
        } else {
            aRunnableS120S0100000_20 = null;
        }
        C1271900jCe[] c1271900jCeArr = {null};
        if (byteBufferArr.length == 1) {
            ByteBuffer byteBuffer = byteBufferArr[0];
            int i6 = (i + 1) / 2;
            int i7 = i * i2;
            int i8 = ((i2 + 1) / 2) * i6;
            int i9 = i7 + i8;
            byteBuffer.position(0);
            byteBuffer.limit(i7);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBuffer.position(i7);
            byteBuffer.limit(i9);
            ByteBuffer byteBufferSlice2 = byteBuffer.slice();
            byteBuffer.position(i9);
            byteBuffer.limit(i9 + i8);
            ByteBuffer byteBufferSlice3 = byteBuffer.slice();
            C1271880jCc c1271880jCc = this.LLLIIL;
            if (c1271880jCc != null) {
                c1271900jCeArr[0] = c1271880jCc.LJ(byteBufferSlice, i, byteBufferSlice2, i2, byteBufferSlice3, i, i6, i6, i3, aRunnableS120S0100000_20);
            } else {
                c1271900jCeArr[0] = C1271900jCe.LJ(byteBufferSlice, i, byteBufferSlice2, i2, byteBufferSlice3, i, i6, i6, i3, aRunnableS120S0100000_20);
            }
        } else {
            C1271880jCc c1271880jCc2 = this.LLLIIL;
            if (c1271880jCc2 != null) {
                c1271900jCeArr[0] = c1271880jCc2.LJ(byteBufferArr[0], i, byteBufferArr[1], i2, byteBufferArr[2], iArr[0], iArr[1], iArr[2], i3, aRunnableS120S0100000_20);
            } else {
                c1271900jCeArr[0] = C1271900jCe.LJ(byteBufferArr[0], i, byteBufferArr[1], i2, byteBufferArr[2], iArr[0], iArr[1], iArr[2], i3, aRunnableS120S0100000_20);
            }
        }
        C1271900jCe c1271900jCe = c1271900jCeArr[0];
        if (c1271900jCe == null) {
            if (aRunnableS120S0100000_20 != null) {
                aRunnableS120S0100000_20.run();
            }
            return -1;
        }
        c1271900jCe.LJIILLIIL = i4;
        c1271900jCe.setRenderType(i5);
        this.LLLILZJ = new InterfaceC1273000jEQ() { // from class: X.0jEJ
            @Override // X.InterfaceC1273000jEQ
            public final void onRendered() {
                Runnable runnable2 = runnable;
                C1C7U.LIZ("RenderView@e1fb.pushVideoFrame$4L");
                runnable2.run();
                C1C7U.LIZIZ("RenderView@e1fb.pushVideoFrame$4L");
            }
        };
        C1271790jCT c1271790jCT = this.LLLIIIIL;
        if (c1271790jCT != null) {
            videoFrame = c1271790jCT.LIZLLL(c1271900jCeArr[0], 0, 0L);
            if (videoFrame != null) {
            }
            c1271900jCeArr[0].release();
            return 0;
        }
        videoFrame = new VideoFrame(c1271900jCeArr[0], 0, 0L);
        HashMap map2 = (HashMap) map;
        if (map2.containsKey("render_start_server_ntp_ms")) {
            videoFrame.setRenderStartServerNtpMs(((Long) map2.get("render_start_server_ntp_ms")).longValue());
        }
        onFrame(videoFrame);
        c1271900jCeArr[0].release();
        return 0;
    }
}
