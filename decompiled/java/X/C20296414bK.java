package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import com.bef.effectsdk.BEFEffectNative;
import com.bef.effectsdk.OpenGLUtils;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.experiment.TikTokResolution;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.14bK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20296414bK extends GLSurfaceView implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {
    public boolean LL;
    public int LLILLJJLI;
    public Surface LLILLL;
    public int[] LLILZ;
    public SurfaceTexture LLILZIL;
    public final int[] LLILZLL;
    public final float[] LLIZ;
    public final float[] LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public CameraDevice LLJILLL;
    public CameraCaptureSession LLJJ;
    public boolean LLJJI;
    public String LLJJIII;
    public InterfaceC19429510zt LLJJIJI;
    public long LLJJIJIIJIL;
    public int LLJJIJIL;
    public final boolean LLJJJ;
    public final boolean LLJJJIL;

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        InterfaceC19429510zt interfaceC19429510zt = this.LLJJIJI;
        if (interfaceC19429510zt != null) {
            interfaceC19429510zt.LJIILIIL();
        }
        try {
            if (this.LLJJIII != null) {
                setCameraHW(false);
            }
            this.LLJJIJI.LJJ();
            this.LLJJIJI.LJIIJJI();
            this.LLJJIJI.LIZJ();
            this.LL = false;
            GLES20.glDeleteTextures(1, this.LLILZ, 0);
            Surface surface = this.LLILLL;
            if (surface != null) {
                surface.release();
            }
            this.LLILLL = null;
            SurfaceTexture surfaceTexture = this.LLILZIL;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.LLILZIL = null;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("onPause NPE", e);
        }
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        InterfaceC19429510zt interfaceC19429510zt = this.LLJJIJI;
        if (interfaceC19429510zt != null) {
            C20010313Rd c20010313Rd = C20010313Rd.LIZ;
            Context context = getContext();
            c20010313Rd.getClass();
            interfaceC19429510zt.LJIIJ(C20010313Rd.LIZIZ(context).getResourceFinder());
        }
        setCameraHW(this.LLJIJIL);
    }

    public final int getGLVersion() {
        return this.LLILLJJLI;
    }

    public final InterfaceC19429510zt getNaviManager() {
        return this.LLJJIJI;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (!this.LL) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLJILJIL) {
                    try {
                        this.LLILZIL.updateTexImage();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJI("updateTextImage error", e);
                    }
                    this.LLJILJIL = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            if (this.LLJJJIL) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIIJIL;
                long j = ((long) LSPassThroughRecordSizeConfig.DEFAULT) / ((long) this.LLJJIJIL);
                if (jCurrentTimeMillis < j) {
                    Thread.sleep(j - jCurrentTimeMillis);
                }
                this.LLJJIJIIJIL = System.currentTimeMillis();
            }
            this.LLJJIJI.LIZLLL(this.LLJIJIL, this.LLILZ[0]);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C201955140j.LJI("onDrawFrame error", e2);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.LLJILJIL = true;
        requestRender();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLJI) {
            return super.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i = 0; i < pointerCount; i++) {
            this.LLILZLL[i] = motionEvent.getPointerId(i);
            this.LLIZ[i] = motionEvent.getX(i);
            this.LLIZLLLIL[i] = motionEvent.getY(i);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action == 6) {
                            int action2 = motionEvent.getAction() >> 8;
                            if (this.LLJ || action2 == 0) {
                                LIZIZ(this.LLIZ, this.LLIZLLLIL, pointerCount);
                                this.LLJJIJI.LJIJJ(new float[]{this.LLIZ[action2]}, new float[]{this.LLIZLLLIL[action2]}, new int[]{this.LLILZLL[action2]});
                            }
                        }
                    } else {
                        int action3 = motionEvent.getAction() >> 8;
                        if (this.LLJ || action3 == 0) {
                            LIZIZ(this.LLIZ, this.LLIZLLLIL, pointerCount);
                            this.LLJJIJI.LJIIIZ(new float[]{this.LLIZ[action3]}, new float[]{this.LLIZLLLIL[action3]}, new int[]{this.LLILZLL[action3]});
                            return true;
                        }
                    }
                } else {
                    LIZIZ(this.LLIZ, this.LLIZLLLIL, pointerCount);
                    if (!this.LLJ) {
                        this.LLJJIJI.LJIL(new float[]{this.LLIZ[0]}, new float[]{this.LLIZLLLIL[0]}, new int[]{this.LLILZLL[0]});
                        return true;
                    }
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        this.LLJJIJI.LJIL(new float[]{this.LLIZ[i2]}, new float[]{this.LLIZLLLIL[i2]}, new int[]{this.LLILZLL[i2]});
                    }
                }
                return true;
            }
            LIZIZ(this.LLIZ, this.LLIZLLLIL, 1);
            this.LLJJIJI.LJIJJ(new float[]{this.LLIZ[0]}, new float[]{this.LLIZLLLIL[0]}, new int[]{this.LLILZLL[0]});
            return true;
        }
        LIZIZ(this.LLIZ, this.LLIZLLLIL, 1);
        this.LLJJIJI.LJIIIZ(new float[]{this.LLIZ[0]}, new float[]{this.LLIZLLLIL[0]}, new int[]{this.LLILZLL[0]});
        return true;
    }

    public final void setCamera(boolean z) {
        this.LLJIJIL = z;
        setCameraHW(z);
        C0CNO.LIZLLL(0L, new AwS573S0100000_29(this, 578));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r8.LLJJIII = r2;
        r3 = new X.C089E(((android.hardware.camera2.params.StreamConfigurationMap) r1.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(android.graphics.SurfaceTexture.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r3.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r2 = (android.util.Size) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (1920 != r2.getWidth()) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (1080 != r2.getHeight()) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCameraHW(boolean r9) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20296414bK.setCameraHW(boolean):void");
    }

    public final void setFps(int i) {
        this.LLJJIJIL = i;
    }

    public final void setMultiTouchEnabled(boolean z) {
        this.LLJ = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.LLJI = z;
    }

    public C20296414bK(Context context, AttributeSet attributeSet) {
        int i;
        InterfaceC19429510zt interfaceC19429510zt;
        super(context, attributeSet);
        this.LLILZ = new int[1];
        this.LLILZLL = new int[10];
        this.LLIZ = new float[10];
        this.LLIZLLLIL = new float[10];
        this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJJI = true;
        this.LLJJIJIIJIL = System.currentTimeMillis();
        this.LLJJIJIL = 24;
        boolean z = C2549309yt.LIZ;
        this.LLJJJ = z;
        this.LLJJJIL = C2516309tZ.LIZ;
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) C786410Ut5.H2(context, "activity")).getDeviceConfigurationInfo();
        boolean z2 = context.obtainStyledAttributes(attributeSet, R$styleable.profile_navi_surface).getBoolean(R$styleable.profile_navi_surface_zOrderOnTop, true);
        if (deviceConfigurationInfo.reqGlEsVersion >= 196608) {
            i = 3;
        } else {
            i = 2;
        }
        this.LLILLJJLI = i;
        setEGLContextClientVersion(i);
        setZOrderOnTop(z2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(1);
        setRenderer(this);
        setRenderMode(1);
        if (z) {
            interfaceC19429510zt = new InterfaceC19429510zt() { // from class: X.1DQA
                public static final float[] LJJJLL = {-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
                public static final float[] LJJJLZIJ = {-1.0f, 1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
                public static final short[] LJJJZ = {0, 1, 2, 0, 2, 3};
                public long LIZ;
                public ResourceFinder LIZIZ;
                public String LIZJ;
                public Long LIZLLL;
                public int LJ;
                public int LJFF;
                public int LJI;
                public int LJII;
                public float LJIIJ;
                public float LJIIJJI;
                public float LJIIL;
                public float LJIILIIL;
                public boolean LJIILL;
                public boolean LJIILLIIL;
                public int LJIIZILJ;
                public int LJIJ;
                public int LJIJI;
                public int LJIJJ;
                public int LJIJJLI;
                public int LJIL;
                public int LJJ;
                public int LJJI;
                public int LJJIFFI;
                public int[] LJJII;
                public int[] LJJIII;
                public int[] LJJIIJ;
                public FloatBuffer LJJIIJZLJL;
                public FloatBuffer LJJIIZ;
                public ShortBuffer LJJIIZI;
                public int LJJIJ;
                public int LJJIJIIJI;
                public int LJJIJIIJIL;
                public int LJJIJIL;
                public int LJJIJL;
                public int[] LJJJJIZL;
                public int[] LJJJJJ;
                public int[] LJJJJJL;
                public int[] LJJJJL;
                public int[] LJJJJLI;
                public int[] LJJJJLL;
                public int[] LJJJJZ;
                public int[] LJJJJZI;
                public final int LJIIIIZZ = 480;
                public final int LJIIIZ = 270;
                public final boolean LJIILJJIL = true;
                public final float LJJIJLIJ = 1.0f;
                public final float LJJIL = 0.8314f;
                public final float LJJIZ = 0.8588f;
                public final float LJJJ = 1.0f;
                public final float LJJJI = 0.43f;
                public final float LJJJIL = 0.8f;
                public final float LJJJJ = 0.914f;
                public final float LJJJJI = 1.0f;
                public boolean LJJJLIIL = true;

                @Override // X.InterfaceC19429510zt
                public final void LIZ() {
                    this.LJIILLIIL = true;
                }

                @Override // X.InterfaceC19429510zt
                public final void f2() {
                    this.LJJJLIIL = false;
                }

                @Override // X.InterfaceC19429510zt
                public final void LIZJ() {
                    long j = this.LIZ;
                    if (j != 0) {
                        BEFEffectNative.nativeDestroyHandle(j);
                        this.LIZ = 0L;
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJI() {
                    int iLoadProgram = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "precision mediump float;\nuniform vec4 color1;\nuniform vec4 color2;\nuniform vec2 dir;\nuniform vec2 start;\nvarying vec2 texCoord;\nvoid main(){\nfloat factor = dot(texCoord - start,dir)/(dot(dir,dir));\ngl_FragColor = mix(color1,color2,factor);\n}");
                    this.LJJIJ = iLoadProgram;
                    this.LJJIJIIJI = GLES20.glGetUniformLocation(iLoadProgram, "color1");
                    this.LJJIJIIJIL = GLES20.glGetUniformLocation(this.LJJIJ, "color2");
                    this.LJJIJIL = GLES20.glGetUniformLocation(this.LJJIJ, "dir");
                    this.LJJIJL = GLES20.glGetUniformLocation(this.LJJIJ, "start");
                    GLES20.glGetAttribLocation(this.LJJIJ, "vTexCoord");
                    int iLoadProgram2 = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, texCoord);\n}");
                    this.LJIL = iLoadProgram2;
                    this.LJJ = GLES20.glGetAttribLocation(iLoadProgram2, "vTexCoord");
                    this.LJJI = GLES20.glGetAttribLocation(this.LJIL, "vPosition");
                    this.LJJIFFI = GLES20.glGetUniformLocation(this.LJIL, "sTexture");
                    int iLoadProgram3 = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sCamera;\nuniform float uCamera;\nvarying vec2 texCoord;\nvoid main() {\n  vec2 uv = texCoord;\n  float off = (1.0 - uCamera) / 2.0;\n  uv.x = uv.x * uCamera + off;\n  gl_FragColor = texture2D(sCamera, uv);\n}");
                    this.LJIIZILJ = iLoadProgram3;
                    this.LJIJJ = GLES20.glGetAttribLocation(iLoadProgram3, "vTexCoord");
                    this.LJIJI = GLES20.glGetAttribLocation(this.LJIIZILJ, "vPosition");
                    this.LJIJ = GLES20.glGetUniformLocation(this.LJIIZILJ, "sCamera");
                    this.LJIJJLI = GLES20.glGetUniformLocation(this.LJIIZILJ, "uCamera");
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(80);
                    byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
                    this.LJJIIJZLJL = floatBufferAsFloatBuffer;
                    if (floatBufferAsFloatBuffer != null) {
                        floatBufferAsFloatBuffer.put(LJJJLL);
                    }
                    FloatBuffer floatBuffer = this.LJJIIJZLJL;
                    if (floatBuffer != null) {
                        floatBuffer.position(0);
                    }
                    int[] iArr = new int[1];
                    this.LJJII = iArr;
                    GLES20.glGenBuffers(1, iArr, 0);
                    GLES20.glBindBuffer(34962, this.LJJII[0]);
                    GLES20.glBufferData(34962, 80, this.LJJIIJZLJL, 35044);
                    ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(80);
                    byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
                    FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
                    this.LJJIIZ = floatBufferAsFloatBuffer2;
                    if (floatBufferAsFloatBuffer2 != null) {
                        floatBufferAsFloatBuffer2.put(LJJJLZIJ);
                    }
                    FloatBuffer floatBuffer2 = this.LJJIIZ;
                    if (floatBuffer2 != null) {
                        floatBuffer2.position(0);
                    }
                    int[] iArr2 = new int[1];
                    this.LJJIII = iArr2;
                    GLES20.glGenBuffers(1, iArr2, 0);
                    GLES20.glBindBuffer(34962, this.LJJIII[0]);
                    GLES20.glBufferData(34962, 80, this.LJJIIZ, 35044);
                    ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(12);
                    byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
                    ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
                    this.LJJIIZI = shortBufferAsShortBuffer;
                    if (shortBufferAsShortBuffer != null) {
                        shortBufferAsShortBuffer.put(LJJJZ);
                    }
                    ShortBuffer shortBuffer = this.LJJIIZI;
                    if (shortBuffer != null) {
                        shortBuffer.position(0);
                    }
                    int[] iArr3 = new int[1];
                    this.LJJIIJ = iArr3;
                    GLES20.glGenBuffers(1, iArr3, 0);
                    GLES20.glBindBuffer(34963, this.LJJIIJ[0]);
                    GLES20.glBufferData(34963, 12, this.LJJIIZI, 35044);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIJJI() {
                    int[] iArr = this.LJJJJIZL;
                    if (iArr != null) {
                        GLES20.glDeleteFramebuffers(1, iArr, 0);
                    }
                    int[] iArr2 = this.LJJJJJ;
                    if (iArr2 != null) {
                        GLES20.glDeleteTextures(1, iArr2, 0);
                    }
                    int[] iArr3 = this.LJJJJJL;
                    if (iArr3 != null) {
                        GLES20.glDeleteFramebuffers(1, iArr3, 0);
                    }
                    int[] iArr4 = this.LJJJJL;
                    if (iArr4 != null) {
                        GLES20.glDeleteTextures(1, iArr4, 0);
                    }
                    int[] iArr5 = this.LJJJJLI;
                    if (iArr5 != null) {
                        GLES20.glDeleteFramebuffers(1, iArr5, 0);
                    }
                    int[] iArr6 = this.LJJJJLL;
                    if (iArr6 != null) {
                        GLES20.glDeleteTextures(1, iArr6, 0);
                    }
                    int[] iArr7 = this.LJJJJZ;
                    if (iArr7 != null) {
                        GLES20.glDeleteFramebuffers(1, iArr7, 0);
                    }
                    int[] iArr8 = this.LJJJJZI;
                    if (iArr8 != null) {
                        GLES20.glDeleteTextures(1, iArr8, 0);
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIILIIL() {
                    ResourceFinder resourceFinder = this.LIZIZ;
                    if (resourceFinder != null) {
                        BEFEffectNative.nativeReleaseResourceFinder(this.LIZ, resourceFinder);
                        this.LIZIZ = null;
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIJ() {
                    LJIIJJI();
                    int i2 = this.LJ;
                    int i3 = this.LJFF;
                    int[] iArr = new int[1];
                    this.LJJJJIZL = iArr;
                    this.LJJJJJ = new int[1];
                    GLES20.glGenFramebuffers(1, iArr, 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJIZL[0]);
                    GLES20.glGenTextures(1, this.LJJJJJ, 0);
                    GLES20.glBindTexture(3553, this.LJJJJJ[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LJJJJJ[0], 0);
                    int[] iArr2 = new int[1];
                    this.LJJJJJL = iArr2;
                    this.LJJJJL = new int[1];
                    GLES20.glGenFramebuffers(1, iArr2, 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJJL[0]);
                    GLES20.glGenTextures(1, this.LJJJJL, 0);
                    GLES20.glBindTexture(3553, this.LJJJJL[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LJJJJL[0], 0);
                    int[] iArr3 = new int[1];
                    this.LJJJJLI = iArr3;
                    this.LJJJJLL = new int[1];
                    GLES20.glGenFramebuffers(1, iArr3, 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJLI[0]);
                    GLES20.glGenTextures(1, this.LJJJJLL, 0);
                    GLES20.glBindTexture(3553, this.LJJJJLL[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LJJJJLL[0], 0);
                    int[] iArr4 = new int[1];
                    this.LJJJJZ = iArr4;
                    this.LJJJJZI = new int[1];
                    GLES20.glGenFramebuffers(1, iArr4, 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJZ[0]);
                    GLES20.glGenTextures(1, this.LJJJJZI, 0);
                    GLES20.glBindTexture(3553, this.LJJJJZI[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, this.LJ, this.LJFF, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LJJJJZI[0], 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJIZL[0]);
                    GLES20.glClearColor(this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
                    GLES20.glClear(16384);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIJJLI() {
                    this.LJIILIIL = 1.0f;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJJ() {
                    int i2 = this.LJIL;
                    if (i2 != 0) {
                        GLES20.glDeleteProgram(i2);
                    }
                    int i3 = this.LJIIZILJ;
                    if (i3 != 0) {
                        GLES20.glDeleteProgram(i3);
                    }
                    int i4 = this.LJJIJ;
                    if (i4 != 0) {
                        GLES20.glDeleteProgram(i4);
                    }
                    int[] iArr = this.LJJII;
                    if (iArr != null) {
                        GLES20.glDeleteBuffers(1, iArr, 0);
                    }
                    int[] iArr2 = this.LJJIII;
                    if (iArr2 != null) {
                        GLES20.glDeleteBuffers(1, iArr2, 0);
                    }
                    int[] iArr3 = this.LJJIIJ;
                    if (iArr3 != null) {
                        GLES20.glDeleteBuffers(1, iArr3, 0);
                    }
                }

                public final void finalize() {
                    LJIILIIL();
                    LIZJ();
                    LJIIJJI();
                    LJJ();
                }

                @Override // X.InterfaceC19429510zt
                public final int LJFF() {
                    return this.LJIIIZ;
                }

                @Override // X.InterfaceC19429510zt
                public final int LJIILJJIL() {
                    return this.LJIIIIZZ;
                }

                @Override // X.InterfaceC19429510zt
                public final void LIZIZ(String str) {
                    this.LIZJ = str;
                    this.LIZLLL = Long.valueOf(this.LIZ);
                    BEFEffectNative.nativeSetStickerPath(this.LIZ, this.LIZJ);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJ(float f) {
                    this.LJIIL = f;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIIIZZ(boolean z3) {
                    ResourceFinder resourceFinder;
                    LIZJ();
                    long jNativeCreateHandle = BEFEffectNative.nativeCreateHandle(z3);
                    this.LIZ = jNativeCreateHandle;
                    if (jNativeCreateHandle != 0 && (resourceFinder = this.LIZIZ) != null) {
                        BEFEffectNative.nativeInitResourceFinder(jNativeCreateHandle, resourceFinder, this.LJIIIZ, this.LJIIIIZZ, "android");
                        BEFEffectNative.nativeSetOrientation(this.LIZ, 0);
                        BEFEffectNative.nativeSetFrameOrientation(this.LIZ, 0);
                        BEFEffectNative.nativeSetCameraPosition(this.LIZ, true);
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIJ(DownloadableModelSupportResourceFinder downloadableModelSupportResourceFinder) {
                    this.LIZIZ = downloadableModelSupportResourceFinder;
                }

                @Override // X.InterfaceC19429510zt
                public final Bitmap LJIILL(boolean z3) {
                    GLES20.glBindFramebuffer(36160, this.LJJJJJL[0]);
                    if (z3) {
                        Bitmap bitmapLJJI = LJJI(this.LJ, this.LJFF);
                        int iMin = Math.min(bitmapLJJI.getWidth(), bitmapLJJI.getHeight());
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLJJI, (bitmapLJJI.getWidth() - iMin) / 2, (bitmapLJJI.getHeight() - iMin) / 2, iMin, iMin);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("toSquare bitmap image size = w");
                        sbLIZ.append(bitmapCreateBitmap.getWidth());
                        sbLIZ.append(" x h");
                        sbLIZ.append(bitmapCreateBitmap.getHeight());
                        C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                        return bitmapCreateBitmap;
                    }
                    return LJJI(this.LJ, this.LJFF);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIILLIIL(float f) {
                    this.LJIIJ = f;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIZILJ(float f) {
                    this.LJIIJJI = f;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIJI(boolean z3) {
                    this.LJIILL = z3;
                }

                public static final Bitmap LJJI(int i2, int i3) {
                    int i4 = i2 * i3;
                    int[] iArr = new int[i4];
                    int[] iArr2 = new int[i4];
                    IntBuffer intBufferWrap = IntBuffer.wrap(iArr);
                    intBufferWrap.position(0);
                    GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, intBufferWrap);
                    for (int i5 = 0; i5 < i3; i5++) {
                        int i6 = i5 * i2;
                        for (int i7 = 0; i7 < i2; i7++) {
                            int i8 = iArr[i6 + i7];
                            int i9 = i6 + i7;
                            iArr2[i9] = (i8 & (-16711936)) | ((i8 << 16) & 16711680) | ((i8 >> 16) & 255);
                        }
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, i2, i3, Bitmap.Config.ARGB_8888);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createBitmapFromGLSurface bitmap image size = w");
                    sbLIZ.append(bitmapCreateBitmap.getWidth());
                    sbLIZ.append(" x h");
                    sbLIZ.append(bitmapCreateBitmap.getHeight());
                    C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                    return bitmapCreateBitmap;
                }

                @Override // X.InterfaceC19429510zt
                public final void LIZLLL(boolean z3, int i2) {
                    int i3;
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glClearColor(this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
                    GLES20.glClear(16384);
                    GLES20.glViewport(0, 0, this.LJI, this.LJII);
                    if (this.LJJJLIIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onDraw gradientProg=");
                        sbLIZ.append(this.LJJIJ);
                        C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ));
                        GLES20.glUseProgram(this.LJJIJ);
                        GLES20.glUniform4f(this.LJJIJIIJI, this.LJJIJLIJ, this.LJJIL, this.LJJIZ, this.LJJJ);
                        GLES20.glUniform4f(this.LJJIJIIJIL, this.LJJJI, this.LJJJIL, this.LJJJJ, this.LJJJJI);
                        GLES20.glUniform2f(this.LJJIJIL, -1.0f, 1.0f);
                        GLES20.glUniform2f(this.LJJIJL, 1.0f, 0.0f);
                        GLES20.glBindBuffer(34962, this.LJJII[0]);
                        GLES20.glVertexAttribPointer(this.LJJI, 2, 5126, false, 20, 0);
                        GLES20.glEnableVertexAttribArray(this.LJJI);
                        GLES20.glVertexAttribPointer(this.LJJ, 2, 5126, false, 20, 12);
                        GLES20.glEnableVertexAttribArray(this.LJJ);
                        GLES20.glBindBuffer(34963, this.LJJIIJ[0]);
                        GLES20.glDrawElements(4, 6, 5123, 0);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDraw glProg = ");
                    sbLIZ2.append(this.LJIL);
                    C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ2));
                    if (this.LIZJ != null) {
                        Long l = this.LIZLLL;
                        long j = this.LIZ;
                        if (l == null || l.longValue() != j) {
                            LIZIZ(this.LIZJ);
                        }
                        if (z3) {
                            if (this.LJIILL) {
                                GLES20.glViewport(0, 0, this.LJ, this.LJFF);
                                LJJIFFI(1.0f, i2, this.LJJJJZ[0]);
                            } else {
                                int i4 = this.LJFF;
                                float f = this.LJIIIZ * i4;
                                float f2 = f / (this.LJIIIIZZ * r6);
                                GLES20.glViewport(0, 0, this.LJ, i4);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("crop camera texture: mHeight=");
                                sbLIZ3.append(this.LJFF);
                                sbLIZ3.append(", mWidth=");
                                sbLIZ3.append(this.LJ);
                                sbLIZ3.append(", mCameraHeight=");
                                sbLIZ3.append(this.LJIIIIZZ);
                                sbLIZ3.append(", mCameraWidth=");
                                sbLIZ3.append(this.LJIIIZ);
                                sbLIZ3.append(", cropRatio=");
                                sbLIZ3.append(f2);
                                C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ3));
                                LJJIFFI(f2, i2, this.LJJJJLI[0]);
                            }
                            GLES20.glFlush();
                        }
                        double dNanoTime = System.nanoTime() / 1.0E9d;
                        if (this.LJIILL) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("process algorithm: preview texture dimensions - mPreviewWidth=");
                            sbLIZ4.append(this.LJ);
                            sbLIZ4.append(", mPreviewHeight=");
                            sbLIZ4.append(this.LJFF);
                            C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ4));
                            BEFEffectNative.nativeProcessAlgorithm(this.LIZ, this.LJJJJZI[0], this.LJ, this.LJFF, dNanoTime);
                            BEFEffectNative.nativeProcessFrame(this.LIZ, this.LJJJJZI[0], this.LJJJJL[0], this.LJ, this.LJFF, dNanoTime);
                        } else {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("process algorithm: preview texture dimensions - mWidth=");
                            sbLIZ5.append(this.LJ);
                            sbLIZ5.append(", mHeight=");
                            sbLIZ5.append(this.LJFF);
                            C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ5));
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("process frame: output texture dimensions - mWidth=");
                            sbLIZ6.append(this.LJ);
                            sbLIZ6.append(", mHeight=");
                            sbLIZ6.append(this.LJFF);
                            C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ6));
                            if (!C2548909yp.LIZ) {
                                BEFEffectNative.nativeProcessAlgorithm(this.LIZ, this.LJJJJLL[0], this.LJ, this.LJFF, dNanoTime);
                            }
                            if (this.LJIILLIIL) {
                                i3 = this.LJJJJLL[0];
                            } else {
                                i3 = this.LJJJJJ[0];
                            }
                            BEFEffectNative.nativeProcessFrame(this.LIZ, i3, this.LJJJJL[0], this.LJ, this.LJFF, dNanoTime);
                        }
                    } else {
                        GLES20.glViewport(0, 0, this.LJ, this.LJFF);
                        LJJIFFI(0.0f, this.LJJJJJ[0], this.LJJJJJL[0]);
                    }
                    if (this.LJIILJJIL) {
                        GLES10.glEnable(3042);
                        GLES10.glBlendFunc(770, 771);
                        float f3 = this.LJI;
                        float f4 = this.LJ;
                        float f5 = f3 / f4;
                        float f6 = this.LJII;
                        float f7 = this.LJFF;
                        float f8 = f6 / f7;
                        if (f5 < f8) {
                            f5 = f8;
                        }
                        float f9 = f4 * f5;
                        float f10 = 2;
                        float f11 = f7 * f5;
                        GLES20.glViewport((int) ((f3 - f9) / f10), (int) ((f6 - f11) / f10), (int) f9, (int) f11);
                        LJJIFFI(0.0f, this.LJJJJL[0], 0);
                        GLES20.glFlush();
                        GLES10.glDisable(3042);
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJII(int i2, int i3) {
                    int i4;
                    int i5;
                    if (C2549309yt.LIZ) {
                        C01GW c01gw = TikTokResolution.LIZIZ;
                        i4 = ((TikTokResolution.TiktokResolution) c01gw.getValue()).width;
                        i5 = ((TikTokResolution.TiktokResolution) c01gw.getValue()).height;
                    } else {
                        i4 = i2;
                        i5 = i3;
                    }
                    this.LJ = i4;
                    this.LJFF = i5;
                    this.LJI = i2;
                    this.LJII = i3;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIIZ(float[] fArr, float[] fArr2, int[] iArr) {
                    BEFEffectNative.touchBeginEvent(this.LIZ, iArr, fArr, fArr2);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIJJ(float[] fArr, float[] fArr2, int[] iArr) {
                    BEFEffectNative.touchEndEvent(this.LIZ, iArr, fArr, fArr2);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIL(float[] fArr, float[] fArr2, int[] iArr) {
                    BEFEffectNative.touchMoveEvent(this.LIZ, iArr, fArr, fArr2);
                }

                public final void LJJIFFI(float f, int i2, int i3) {
                    boolean z3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    GLES20.glBindFramebuffer(36160, i3);
                    if (f > 0.0f) {
                        z3 = true;
                        i4 = this.LJIIZILJ;
                        i5 = 36197;
                        i6 = this.LJIJ;
                        i7 = this.LJIJJ;
                        i8 = this.LJIJI;
                        i9 = this.LJJIII[0];
                    } else {
                        z3 = false;
                        i4 = this.LJIL;
                        i5 = 3553;
                        i6 = this.LJJIFFI;
                        i7 = this.LJJ;
                        i8 = this.LJJI;
                        i9 = this.LJJII[0];
                    }
                    GLES20.glUseProgram(i4);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(i5, i2);
                    GLES20.glUniform1i(i6, 0);
                    if (z3) {
                        GLES20.glUniform1f(this.LJIJJLI, f);
                    }
                    GLES20.glBindBuffer(34962, i9);
                    GLES20.glVertexAttribPointer(i8, 2, 5126, false, 20, 0);
                    GLES20.glEnableVertexAttribArray(i8);
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 20, 12);
                    GLES20.glEnableVertexAttribArray(i7);
                    GLES20.glBindBuffer(34963, this.LJJIIJ[0]);
                    GLES20.glDrawElements(4, 6, 5123, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIL(int i2, int i3, int i4, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sendMessage, type=");
                    sbLIZ.append(i2);
                    sbLIZ.append(", arg1=");
                    sbLIZ.append(i3);
                    sbLIZ.append(", arg2=");
                    sbLIZ.append(i4);
                    sbLIZ.append(", arg3=");
                    sbLIZ.append(str);
                    C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                    BEFEffectNative.nativeSendMessage(this.LIZ, i2, i3, i4, str);
                }
            };
        } else {
            interfaceC19429510zt = new InterfaceC19429510zt() { // from class: X.1DQB
                public static final float[] LJJJLL = {-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
                public static final float[] LJJJLZIJ = {-1.0f, 1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
                public static final short[] LJJJZ = {0, 1, 2, 0, 2, 3};
                public long LIZ;
                public ResourceFinder LIZIZ;
                public String LIZJ;
                public Long LIZLLL;
                public int LJ;
                public int LJFF;
                public int LJI;
                public int LJII;
                public float LJIIJ;
                public float LJIIJJI;
                public float LJIIL;
                public float LJIILIIL;
                public boolean LJIILL;
                public boolean LJIILLIIL;
                public int LJIIZILJ;
                public int LJIJ;
                public int LJIJI;
                public int LJIJJ;
                public int LJIJJLI;
                public int LJIL;
                public int LJJ;
                public int LJJI;
                public int LJJIFFI;
                public int[] LJJII;
                public int[] LJJIII;
                public int[] LJJIIJ;
                public FloatBuffer LJJIIJZLJL;
                public FloatBuffer LJJIIZ;
                public ShortBuffer LJJIIZI;
                public int LJJIJ;
                public int LJJIJIIJI;
                public int LJJIJIIJIL;
                public int LJJIJIL;
                public int LJJIJL;
                public int[] LJJJJIZL;
                public int[] LJJJJJ;
                public int[] LJJJJJL;
                public int[] LJJJJL;
                public int[] LJJJJLI;
                public int[] LJJJJLL;
                public int[] LJJJJZ;
                public int[] LJJJJZI;
                public final int LJIIIIZZ = 480;
                public final int LJIIIZ = 270;
                public final boolean LJIILJJIL = true;
                public final float LJJIJLIJ = 1.0f;
                public final float LJJIL = 0.8314f;
                public final float LJJIZ = 0.8588f;
                public final float LJJJ = 1.0f;
                public final float LJJJI = 0.43f;
                public final float LJJJIL = 0.8f;
                public final float LJJJJ = 0.914f;
                public final float LJJJJI = 1.0f;
                public boolean LJJJLIIL = true;

                @Override // X.InterfaceC19429510zt
                public final void LIZ() {
                    this.LJIILLIIL = true;
                }

                @Override // X.InterfaceC19429510zt
                public final void f2() {
                    this.LJJJLIIL = false;
                }

                @Override // X.InterfaceC19429510zt
                public final void LIZJ() {
                    long j = this.LIZ;
                    if (j != 0) {
                        BEFEffectNative.nativeDestroyHandle(j);
                        this.LIZ = 0L;
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJI() {
                    int iLoadProgram = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "precision mediump float;\nuniform vec4 color1;\nuniform vec4 color2;\nuniform vec2 dir;\nuniform vec2 start;\nvarying vec2 texCoord;\nvoid main(){\nfloat factor = dot(texCoord - start,dir)/(dot(dir,dir));\ngl_FragColor = mix(color1,color2,factor);\n}");
                    this.LJJIJ = iLoadProgram;
                    this.LJJIJIIJI = GLES20.glGetUniformLocation(iLoadProgram, "color1");
                    this.LJJIJIIJIL = GLES20.glGetUniformLocation(this.LJJIJ, "color2");
                    this.LJJIJIL = GLES20.glGetUniformLocation(this.LJJIJ, "dir");
                    this.LJJIJL = GLES20.glGetUniformLocation(this.LJJIJ, "start");
                    GLES20.glGetAttribLocation(this.LJJIJ, "vTexCoord");
                    int iLoadProgram2 = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, texCoord);\n}");
                    this.LJIL = iLoadProgram2;
                    this.LJJ = GLES20.glGetAttribLocation(iLoadProgram2, "vTexCoord");
                    this.LJJI = GLES20.glGetAttribLocation(this.LJIL, "vPosition");
                    this.LJJIFFI = GLES20.glGetUniformLocation(this.LJIL, "sTexture");
                    int iLoadProgram3 = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sCamera;\nuniform float uCamera;\nvarying vec2 texCoord;\nvoid main() {\n  vec2 uv = texCoord;\n  float off = (1.0 - uCamera) / 2.0;\n  uv.x = uv.x * uCamera + off;\n  gl_FragColor = texture2D(sCamera, uv);\n}");
                    this.LJIIZILJ = iLoadProgram3;
                    this.LJIJJ = GLES20.glGetAttribLocation(iLoadProgram3, "vTexCoord");
                    this.LJIJI = GLES20.glGetAttribLocation(this.LJIIZILJ, "vPosition");
                    this.LJIJ = GLES20.glGetUniformLocation(this.LJIIZILJ, "sCamera");
                    this.LJIJJLI = GLES20.glGetUniformLocation(this.LJIIZILJ, "uCamera");
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(80);
                    byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
                    this.LJJIIJZLJL = floatBufferAsFloatBuffer;
                    if (floatBufferAsFloatBuffer != null) {
                        floatBufferAsFloatBuffer.put(LJJJLL);
                    }
                    FloatBuffer floatBuffer = this.LJJIIJZLJL;
                    if (floatBuffer != null) {
                        floatBuffer.position(0);
                    }
                    int[] iArr = new int[1];
                    this.LJJII = iArr;
                    GLES20.glGenBuffers(1, iArr, 0);
                    GLES20.glBindBuffer(34962, this.LJJII[0]);
                    GLES20.glBufferData(34962, 80, this.LJJIIJZLJL, 35044);
                    ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(80);
                    byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
                    FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
                    this.LJJIIZ = floatBufferAsFloatBuffer2;
                    if (floatBufferAsFloatBuffer2 != null) {
                        floatBufferAsFloatBuffer2.put(LJJJLZIJ);
                    }
                    FloatBuffer floatBuffer2 = this.LJJIIZ;
                    if (floatBuffer2 != null) {
                        floatBuffer2.position(0);
                    }
                    int[] iArr2 = new int[1];
                    this.LJJIII = iArr2;
                    GLES20.glGenBuffers(1, iArr2, 0);
                    GLES20.glBindBuffer(34962, this.LJJIII[0]);
                    GLES20.glBufferData(34962, 80, this.LJJIIZ, 35044);
                    ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(12);
                    byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
                    ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
                    this.LJJIIZI = shortBufferAsShortBuffer;
                    if (shortBufferAsShortBuffer != null) {
                        shortBufferAsShortBuffer.put(LJJJZ);
                    }
                    ShortBuffer shortBuffer = this.LJJIIZI;
                    if (shortBuffer != null) {
                        shortBuffer.position(0);
                    }
                    int[] iArr3 = new int[1];
                    this.LJJIIJ = iArr3;
                    GLES20.glGenBuffers(1, iArr3, 0);
                    GLES20.glBindBuffer(34963, this.LJJIIJ[0]);
                    GLES20.glBufferData(34963, 12, this.LJJIIZI, 35044);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIJJI() {
                    int[] iArr = this.LJJJJIZL;
                    if (iArr != null) {
                        GLES20.glDeleteFramebuffers(1, iArr, 0);
                    }
                    int[] iArr2 = this.LJJJJJ;
                    if (iArr2 != null) {
                        GLES20.glDeleteTextures(1, iArr2, 0);
                    }
                    int[] iArr3 = this.LJJJJJL;
                    if (iArr3 != null) {
                        GLES20.glDeleteFramebuffers(1, iArr3, 0);
                    }
                    int[] iArr4 = this.LJJJJL;
                    if (iArr4 != null) {
                        GLES20.glDeleteTextures(1, iArr4, 0);
                    }
                    int[] iArr5 = this.LJJJJLI;
                    if (iArr5 != null) {
                        GLES20.glDeleteFramebuffers(1, iArr5, 0);
                    }
                    int[] iArr6 = this.LJJJJLL;
                    if (iArr6 != null) {
                        GLES20.glDeleteTextures(1, iArr6, 0);
                    }
                    int[] iArr7 = this.LJJJJZ;
                    if (iArr7 != null) {
                        GLES20.glDeleteFramebuffers(1, iArr7, 0);
                    }
                    int[] iArr8 = this.LJJJJZI;
                    if (iArr8 != null) {
                        GLES20.glDeleteTextures(1, iArr8, 0);
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIILIIL() {
                    ResourceFinder resourceFinder = this.LIZIZ;
                    if (resourceFinder != null) {
                        BEFEffectNative.nativeReleaseResourceFinder(this.LIZ, resourceFinder);
                        this.LIZIZ = null;
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIJ() {
                    LJIIJJI();
                    int i2 = this.LJ;
                    int i3 = this.LJFF;
                    int[] iArr = new int[1];
                    this.LJJJJIZL = iArr;
                    this.LJJJJJ = new int[1];
                    GLES20.glGenFramebuffers(1, iArr, 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJIZL[0]);
                    GLES20.glGenTextures(1, this.LJJJJJ, 0);
                    GLES20.glBindTexture(3553, this.LJJJJJ[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LJJJJJ[0], 0);
                    int[] iArr2 = new int[1];
                    this.LJJJJJL = iArr2;
                    this.LJJJJL = new int[1];
                    GLES20.glGenFramebuffers(1, iArr2, 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJJL[0]);
                    GLES20.glGenTextures(1, this.LJJJJL, 0);
                    GLES20.glBindTexture(3553, this.LJJJJL[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LJJJJL[0], 0);
                    int[] iArr3 = new int[1];
                    this.LJJJJLI = iArr3;
                    this.LJJJJLL = new int[1];
                    GLES20.glGenFramebuffers(1, iArr3, 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJLI[0]);
                    GLES20.glGenTextures(1, this.LJJJJLL, 0);
                    GLES20.glBindTexture(3553, this.LJJJJLL[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LJJJJLL[0], 0);
                    int[] iArr4 = new int[1];
                    this.LJJJJZ = iArr4;
                    this.LJJJJZI = new int[1];
                    this.LJI = (this.LJIIIZ * i3) / this.LJIIIIZZ;
                    this.LJII = i3;
                    GLES20.glGenFramebuffers(1, iArr4, 0);
                    GLES20.glBindFramebuffer(36160, this.LJJJJZ[0]);
                    GLES20.glGenTextures(1, this.LJJJJZI, 0);
                    GLES20.glBindTexture(3553, this.LJJJJZI[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, this.LJI, this.LJII, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LJJJJZI[0], 0);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIJJLI() {
                    this.LJIILIIL = 1.0f;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJJ() {
                    int i2 = this.LJIL;
                    if (i2 != 0) {
                        GLES20.glDeleteProgram(i2);
                    }
                    int i3 = this.LJIIZILJ;
                    if (i3 != 0) {
                        GLES20.glDeleteProgram(i3);
                    }
                    int i4 = this.LJJIJ;
                    if (i4 != 0) {
                        GLES20.glDeleteProgram(i4);
                    }
                    int[] iArr = this.LJJII;
                    if (iArr != null) {
                        GLES20.glDeleteBuffers(1, iArr, 0);
                    }
                    int[] iArr2 = this.LJJIII;
                    if (iArr2 != null) {
                        GLES20.glDeleteBuffers(1, iArr2, 0);
                    }
                    int[] iArr3 = this.LJJIIJ;
                    if (iArr3 != null) {
                        GLES20.glDeleteBuffers(1, iArr3, 0);
                    }
                }

                public final void finalize() {
                    LJIILIIL();
                    LIZJ();
                    LJIIJJI();
                    LJJ();
                }

                @Override // X.InterfaceC19429510zt
                public final int LJFF() {
                    return this.LJIIIZ;
                }

                @Override // X.InterfaceC19429510zt
                public final int LJIILJJIL() {
                    return this.LJIIIIZZ;
                }

                @Override // X.InterfaceC19429510zt
                public final void LIZIZ(String str) {
                    this.LIZJ = str;
                    this.LIZLLL = Long.valueOf(this.LIZ);
                    BEFEffectNative.nativeSetStickerPath(this.LIZ, this.LIZJ);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJ(float f) {
                    this.LJIIL = f;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIIIZZ(boolean z3) {
                    ResourceFinder resourceFinder;
                    LIZJ();
                    long jNativeCreateHandle = BEFEffectNative.nativeCreateHandle(z3);
                    this.LIZ = jNativeCreateHandle;
                    if (jNativeCreateHandle != 0 && (resourceFinder = this.LIZIZ) != null) {
                        BEFEffectNative.nativeInitResourceFinder(jNativeCreateHandle, resourceFinder, this.LJIIIZ, this.LJIIIIZZ, "android");
                        BEFEffectNative.nativeSetOrientation(this.LIZ, 0);
                        BEFEffectNative.nativeSetFrameOrientation(this.LIZ, 0);
                        BEFEffectNative.nativeSetCameraPosition(this.LIZ, true);
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIJ(DownloadableModelSupportResourceFinder downloadableModelSupportResourceFinder) {
                    this.LIZIZ = downloadableModelSupportResourceFinder;
                }

                @Override // X.InterfaceC19429510zt
                public final Bitmap LJIILL(boolean z3) {
                    GLES20.glBindFramebuffer(36160, this.LJJJJJL[0]);
                    if (z3) {
                        Bitmap bitmapLJJI = LJJI(this.LJ, this.LJFF);
                        int iMin = Math.min(bitmapLJJI.getWidth(), bitmapLJJI.getHeight());
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLJJI, (bitmapLJJI.getWidth() - iMin) / 2, (bitmapLJJI.getHeight() - iMin) / 2, iMin, iMin);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("toSquare bitmap image size = w");
                        sbLIZ.append(bitmapCreateBitmap.getWidth());
                        sbLIZ.append(" x h");
                        sbLIZ.append(bitmapCreateBitmap.getHeight());
                        C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                        return bitmapCreateBitmap;
                    }
                    return LJJI(this.LJ, this.LJFF);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIILLIIL(float f) {
                    this.LJIIJ = f;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIZILJ(float f) {
                    this.LJIIJJI = f;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIJI(boolean z3) {
                    this.LJIILL = z3;
                }

                public static final Bitmap LJJI(int i2, int i3) {
                    int i4 = i2 * i3;
                    int[] iArr = new int[i4];
                    int[] iArr2 = new int[i4];
                    IntBuffer intBufferWrap = IntBuffer.wrap(iArr);
                    intBufferWrap.position(0);
                    GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, intBufferWrap);
                    for (int i5 = 0; i5 < i3; i5++) {
                        int i6 = i5 * i2;
                        for (int i7 = 0; i7 < i2; i7++) {
                            int i8 = iArr[i6 + i7];
                            int i9 = i6 + i7;
                            iArr2[i9] = (i8 & (-16711936)) | ((i8 << 16) & 16711680) | ((i8 >> 16) & 255);
                        }
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, i2, i3, Bitmap.Config.ARGB_8888);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createBitmapFromGLSurface bitmap image size = w");
                    sbLIZ.append(bitmapCreateBitmap.getWidth());
                    sbLIZ.append(" x h");
                    sbLIZ.append(bitmapCreateBitmap.getHeight());
                    C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                    return bitmapCreateBitmap;
                }

                @Override // X.InterfaceC19429510zt
                public final void LIZLLL(boolean z3, int i2) {
                    int i3;
                    GLES20.glBindFramebuffer(36160, this.LJJJJIZL[0]);
                    GLES20.glClearColor(this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
                    GLES20.glClear(16384);
                    if (this.LJJJLIIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onDraw gradientProg=");
                        sbLIZ.append(this.LJJIJ);
                        C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ));
                        GLES20.glUseProgram(this.LJJIJ);
                        GLES20.glUniform4f(this.LJJIJIIJI, this.LJJIJLIJ, this.LJJIL, this.LJJIZ, this.LJJJ);
                        GLES20.glUniform4f(this.LJJIJIIJIL, this.LJJJI, this.LJJJIL, this.LJJJJ, this.LJJJJI);
                        GLES20.glUniform2f(this.LJJIJIL, -1.0f, 1.0f);
                        GLES20.glUniform2f(this.LJJIJL, 1.0f, 0.0f);
                        GLES20.glBindBuffer(34962, this.LJJII[0]);
                        GLES20.glVertexAttribPointer(this.LJJI, 2, 5126, false, 20, 0);
                        GLES20.glEnableVertexAttribArray(this.LJJI);
                        GLES20.glVertexAttribPointer(this.LJJ, 2, 5126, false, 20, 12);
                        GLES20.glEnableVertexAttribArray(this.LJJ);
                        GLES20.glBindBuffer(34963, this.LJJIIJ[0]);
                        GLES20.glDrawElements(4, 6, 5123, 0);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDraw glProg = ");
                    sbLIZ2.append(this.LJIL);
                    C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ2));
                    if (this.LIZJ != null) {
                        Long l = this.LIZLLL;
                        long j = this.LIZ;
                        if (l == null || l.longValue() != j) {
                            LIZIZ(this.LIZJ);
                        }
                        if (z3) {
                            if (this.LJIILL) {
                                GLES20.glViewport(0, 0, this.LJI, this.LJII);
                                LJJIFFI(1.0f, i2, this.LJJJJZ[0]);
                            } else {
                                int i4 = this.LJFF;
                                float f = this.LJIIIZ * i4;
                                float f2 = f / (this.LJIIIIZZ * r6);
                                GLES20.glViewport(0, 0, this.LJ, i4);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("crop camera texture: mHeight=");
                                sbLIZ3.append(this.LJFF);
                                sbLIZ3.append(", mWidth=");
                                sbLIZ3.append(this.LJ);
                                sbLIZ3.append(", mCameraHeight=");
                                sbLIZ3.append(this.LJIIIIZZ);
                                sbLIZ3.append(", mCameraWidth=");
                                sbLIZ3.append(this.LJIIIZ);
                                sbLIZ3.append(", cropRatio=");
                                sbLIZ3.append(f2);
                                C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ3));
                                LJJIFFI(f2, i2, this.LJJJJLI[0]);
                            }
                            GLES20.glFlush();
                        }
                        double dNanoTime = System.nanoTime() / 1.0E9d;
                        if (this.LJIILL) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("process algorithm: preview texture dimensions - mPreviewWidth=");
                            sbLIZ4.append(this.LJI);
                            sbLIZ4.append(", mPreviewHeight=");
                            sbLIZ4.append(this.LJII);
                            C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ4));
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("process frame: output texture dimensions - mPreviewWidth=");
                            sbLIZ5.append(this.LJI);
                            sbLIZ5.append(", mPreviewHeight=");
                            sbLIZ5.append(this.LJII);
                            C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ5));
                            BEFEffectNative.nativeProcessAlgorithm(this.LIZ, this.LJJJJZI[0], this.LJI, this.LJII, dNanoTime);
                            BEFEffectNative.nativeProcessFrame(this.LIZ, this.LJJJJZI[0], this.LJJJJL[0], this.LJI, this.LJII, dNanoTime);
                        } else {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("process algorithm: preview texture dimensions - mWidth=");
                            sbLIZ6.append(this.LJ);
                            sbLIZ6.append(", mHeight=");
                            sbLIZ6.append(this.LJFF);
                            C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ6));
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("process frame: output texture dimensions - mWidth=");
                            sbLIZ7.append(this.LJ);
                            sbLIZ7.append(", mHeight=");
                            sbLIZ7.append(this.LJFF);
                            C201955140j.LIZIZ("NaviRender", C2188811AlT.LIZIZ(sbLIZ7));
                            BEFEffectNative.nativeProcessAlgorithm(this.LIZ, this.LJJJJLL[0], this.LJ, this.LJFF, dNanoTime);
                            if (this.LJIILLIIL) {
                                i3 = this.LJJJJLL[0];
                            } else {
                                i3 = this.LJJJJJ[0];
                            }
                            BEFEffectNative.nativeProcessFrame(this.LIZ, i3, this.LJJJJL[0], this.LJ, this.LJFF, dNanoTime);
                        }
                    } else {
                        GLES20.glViewport(0, 0, this.LJ, this.LJFF);
                        LJJIFFI(0.0f, this.LJJJJJ[0], this.LJJJJJL[0]);
                    }
                    if (this.LJIILJJIL) {
                        GLES20.glViewport(0, 0, this.LJ, this.LJFF);
                        LJJIFFI(0.0f, this.LJJJJL[0], 0);
                        GLES20.glFlush();
                    }
                }

                @Override // X.InterfaceC19429510zt
                public final void LJII(int i2, int i3) {
                    this.LJ = i2;
                    this.LJFF = i3;
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIIZ(float[] fArr, float[] fArr2, int[] iArr) {
                    BEFEffectNative.touchBeginEvent(this.LIZ, iArr, fArr, fArr2);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIJJ(float[] fArr, float[] fArr2, int[] iArr) {
                    BEFEffectNative.touchEndEvent(this.LIZ, iArr, fArr, fArr2);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIL(float[] fArr, float[] fArr2, int[] iArr) {
                    BEFEffectNative.touchMoveEvent(this.LIZ, iArr, fArr, fArr2);
                }

                public final void LJJIFFI(float f, int i2, int i3) {
                    boolean z3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    GLES20.glBindFramebuffer(36160, i3);
                    if (f > 0.0f) {
                        z3 = true;
                        i4 = this.LJIIZILJ;
                        i5 = 36197;
                        i6 = this.LJIJ;
                        i7 = this.LJIJJ;
                        i8 = this.LJIJI;
                        i9 = this.LJJIII[0];
                    } else {
                        z3 = false;
                        i4 = this.LJIL;
                        i5 = 3553;
                        i6 = this.LJJIFFI;
                        i7 = this.LJJ;
                        i8 = this.LJJI;
                        i9 = this.LJJII[0];
                    }
                    GLES20.glUseProgram(i4);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(i5, i2);
                    GLES20.glUniform1i(i6, 0);
                    if (z3) {
                        GLES20.glUniform1f(this.LJIJJLI, f);
                    }
                    GLES20.glBindBuffer(34962, i9);
                    GLES20.glVertexAttribPointer(i8, 2, 5126, false, 20, 0);
                    GLES20.glEnableVertexAttribArray(i8);
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 20, 12);
                    GLES20.glEnableVertexAttribArray(i7);
                    GLES20.glBindBuffer(34963, this.LJJIIJ[0]);
                    GLES20.glDrawElements(4, 6, 5123, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                }

                @Override // X.InterfaceC19429510zt
                public final void LJIIL(int i2, int i3, int i4, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sendMessage, type=");
                    sbLIZ.append(i2);
                    sbLIZ.append(", arg1=");
                    sbLIZ.append(i3);
                    sbLIZ.append(", arg2=");
                    sbLIZ.append(i4);
                    sbLIZ.append(", arg3=");
                    sbLIZ.append(str);
                    C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                    BEFEffectNative.nativeSendMessage(this.LIZ, i2, i3, i4, str);
                }
            };
        }
        this.LLJJIJI = interfaceC19429510zt;
        interfaceC19429510zt.LIZ();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        boolean z;
        if (!this.LL) {
            this.LLJJIJI.LJI();
            this.LLJJIJI.LJIJ();
            InterfaceC19429510zt interfaceC19429510zt = this.LLJJIJI;
            if (this.LLILLJJLI == 3) {
                z = true;
            } else {
                z = false;
            }
            interfaceC19429510zt.LJIIIIZZ(z);
            this.LLILZ = new int[1];
            gl10.glDisable(3024);
            gl10.glHint(3152, 4353);
            gl10.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            gl10.glEnable(2884);
            gl10.glShadeModel(7425);
            gl10.glEnable(2929);
            GLES20.glGenTextures(1, this.LLILZ, 0);
            GLES20.glBindTexture(36197, this.LLILZ[0]);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.LLILZ[0]);
            this.LLILZIL = surfaceTexture;
            if (this.LLJJJ) {
                C01GW c01gw = TikTokResolution.LIZIZ;
                surfaceTexture.setDefaultBufferSize(((TikTokResolution.TiktokResolution) c01gw.getValue()).height, ((TikTokResolution.TiktokResolution) c01gw.getValue()).width);
            } else {
                surfaceTexture.setDefaultBufferSize(1920, 1080);
            }
            this.LLILZIL.setOnFrameAvailableListener(this);
            this.LLILLL = new Surface(this.LLILZIL);
            this.LL = true;
            setCameraHW(this.LLJIJIL);
        }
    }

    public final void LIZIZ(float[] fArr, float[] fArr2, int i) {
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            float f2 = fArr2[i2];
            fArr[i2] = f / width;
            fArr2[i2] = 1.0f - (f2 / height);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.LLJJIJI.LJII(i, i2);
        this.LLJJIJI.LJIJ();
    }
}
