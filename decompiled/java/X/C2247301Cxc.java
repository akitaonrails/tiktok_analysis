package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: X.1Cxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247301Cxc implements InterfaceC1292140jjI, Handler.Callback, InterfaceC2247471Cxt {
    public FloatBuffer LLILZ;
    public FloatBuffer LLILZIL;
    public FloatBuffer LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public SurfaceTexture LLJILJIL;
    public InterfaceC2247461Cxs LLJJI;
    public final InterfaceC2246811Cwp LLJJIII;
    public C2247381Cxk LLJJIJIIJIL;
    public C2247381Cxk LLJJIJIL;
    public C2247381Cxk LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public C2247321Cxe LLJJLIIIJLLLLLLLZ;
    public Map<String, Map<String, DataSource.Element>> LLJL;
    public InterfaceC2247121CxK LLJLLIL;
    public boolean LLJLLL;
    public C2247331Cxf LLJZ;
    public final float[] LL = new float[8];
    public final float[] LLILLJJLI = new float[8];
    public final float[] LLILLL = new float[8];
    public final AtomicBoolean LLJILJILJ = new AtomicBoolean(false);
    public final AtomicBoolean LLJILLL = new AtomicBoolean(false);
    public final AtomicInteger LLJJ = new AtomicInteger(0);
    public DataSource.ScaleType LLJJIJI = DataSource.ScaleType.ScaleAspectFill;
    public List<C2246591CwT> LLJLIL = null;
    public Map<String, float[]> LLJLILLLLZIIL = null;
    public final C2247401Cxm LLJLL = new C2247401Cxm();

    @Override // X.InterfaceC1292140jjI
    public final void LJII() {
        this.LLJJ.set(0);
        this.LLJILLL.compareAndSet(false, true);
        this.LLJJIII.requestRender();
        this.LLJLLL = true;
    }

    @Override // X.InterfaceC1292140jjI
    public final void onCompletion() {
        this.LLJILLL.compareAndSet(true, false);
        this.LLJJIII.requestRender();
        C2247321Cxe c2247321Cxe = this.LLJJLIIIJLLLLLLLZ;
        if (c2247321Cxe != null) {
            c2247321Cxe.LIZJ();
            this.LLJJLIIIJLLLLLLLZ = null;
        }
        this.LLJL = null;
    }

    @Override // X.InterfaceC1292140jjI
    public final void release() {
        C2247331Cxf c2247331Cxf = this.LLJZ;
        if (c2247331Cxf != null) {
            ((LinkedHashMap) c2247331Cxf.LIZLLL).clear();
            this.LLJZ = null;
        }
    }

    public C2247301Cxc(InterfaceC2246811Cwp interfaceC2246811Cwp) {
        this.LLJJIII = interfaceC2246811Cwp;
    }

    @Override // X.InterfaceC1292140jjI
    public final void LIZ(List<MaskSrc> list) {
        if (this.LLJL != null && list != null && !list.isEmpty()) {
            C2247321Cxe c2247321Cxe = new C2247321Cxe(this.LLJJIII.getContext(), list, this);
            this.LLJJLIIIJLLLLLLLZ = c2247321Cxe;
            c2247321Cxe.LJIJI = new C2247351Cxh(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL);
            if (this.LLJJIII.LIZIZ()) {
                this.LLJJLIIIJLLLLLLLZ.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC2247471Cxt
    public final float[] LIZLLL(String str) {
        Map<String, float[]> map = this.LLJLILLLLZIIL;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // X.InterfaceC1292140jjI
    public final void LJ(InterfaceC2247461Cxs interfaceC2247461Cxs) {
        this.LLJJI = interfaceC2247461Cxs;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1 && this.LLJJIII != null) {
            this.LLJILJILJ.compareAndSet(false, true);
            this.LLJJIII.requestRender();
        }
        return false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC1287560jbu
    public final void onDrawFrame(GL10 gl10) {
        Map<String, DataSource.Element> map;
        DataSource.Element element;
        if (this.LLJILJILJ.compareAndSet(true, false)) {
            try {
                this.LLJILJIL.updateTexImage();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!this.LLJILLL.get()) {
            if (!this.LLJJIII.getLastFrameHold()) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
            }
            GLES20.glFinish();
            return;
        }
        this.LLJJ.addAndGet(1);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        int iLIZ = this.LLJJI.LIZ();
        int i = this.LLJJ.get();
        if (iLIZ > i + 2) {
            this.LLJJ.set(iLIZ);
        } else {
            iLIZ = i;
        }
        if (this.LLILZ != null && this.LLILZIL != null && this.LLILZLL != null) {
            GLES20.glUseProgram(this.LLIZLLLIL);
            GLES20.glGetError();
            this.LLILZ.position(0);
            GLES20.glVertexAttribPointer(this.LLJ, 2, 5126, false, 0, (Buffer) this.LLILZ);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.LLJ);
            GLES20.glGetError();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.LLIZ);
            this.LLILZIL.position(0);
            GLES20.glVertexAttribPointer(this.LLJI, 2, 5126, false, 0, (Buffer) this.LLILZIL);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.LLJI);
            GLES20.glGetError();
            this.LLILZLL.position(0);
            GLES20.glVertexAttribPointer(this.LLJIJIL, 2, 5126, false, 0, (Buffer) this.LLILZLL);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.LLJIJIL);
            GLES20.glGetError();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glGetError();
        }
        Map<String, Map<String, DataSource.Element>> map2 = this.LLJL;
        if (map2 != null) {
            map = map2.get(String.valueOf(iLIZ % this.LLJJL));
        } else {
            map = null;
        }
        List<C2246591CwT> list = this.LLJLIL;
        if (list != null) {
            for (C2246591CwT c2246591CwT : list) {
                int i2 = c2246591CwT.LIZIZ;
                if (i2 != 0 && i2 != 1) {
                    if (i2 == 2) {
                        String str = c2246591CwT.LIZ;
                        C2247331Cxf c2247331Cxf = this.LLJZ;
                        if (c2247331Cxf != null) {
                            c2247331Cxf.LIZ(str);
                        }
                    }
                } else {
                    String str2 = c2246591CwT.LIZ;
                    C2247321Cxe c2247321Cxe = this.LLJJLIIIJLLLLLLLZ;
                    if (map != null && c2247321Cxe != null && (element = map.get(str2)) != null) {
                        c2247321Cxe.LIZ(this.LLIZ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJLL, str2, element, c2246591CwT);
                    }
                }
            }
        } else if (map != null) {
            for (Map.Entry<String, DataSource.Element> entry : map.entrySet()) {
                C2247321Cxe c2247321Cxe2 = this.LLJJLIIIJLLLLLLLZ;
                if (c2247321Cxe2 != null) {
                    c2247321Cxe2.LIZ(this.LLIZ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJLL, entry.getKey(), entry.getValue(), null);
                }
            }
        }
        GLES20.glFinish();
        InterfaceC2247121CxK interfaceC2247121CxK = this.LLJLLIL;
        if (interfaceC2247121CxK != null && this.LLJLLL) {
            interfaceC2247121CxK.LIZ();
            this.LLJLLL = false;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.LLJJIII != null) {
            this.LLJILJILJ.compareAndSet(false, true);
            this.LLJJIII.requestRender();
        }
    }

    @Override // X.InterfaceC1292140jjI
    public final void setConfigParams(DataSource.DataInfo dataInfo) {
        this.LLJJIJI = dataInfo.getScaleType();
        this.LLJJJIL = dataInfo.getVideoWidth();
        this.LLJJJJ = dataInfo.getVideoHeight();
        this.LLJJJJJIL = dataInfo.getActualWidth();
        this.LLJJJJLIIL = dataInfo.getActualHeight();
        if (dataInfo.isSupportZip()) {
            C2247381Cxk rgbArea = dataInfo.getRgbArea();
            rgbArea.LIZIZ(dataInfo.getVideoWidth(), dataInfo.getVideoHeight());
            this.LLJJIJIL = rgbArea;
            C2247381Cxk alphaArea = dataInfo.getAlphaArea();
            alphaArea.LIZIZ(dataInfo.getVideoWidth(), dataInfo.getVideoHeight());
            this.LLJJIJIIJIL = alphaArea;
        } else {
            this.LLJJIJIL = new C2247381Cxk(0.5f, 0.0f, 1.0f, 1.0f);
            this.LLJJIJIIJIL = new C2247381Cxk(0.0f, 0.0f, 0.5f, 1.0f);
        }
        this.LLJJJ = new C2247381Cxk(0.0f, 0.0f, 1.0f, 1.0f);
        if (dataInfo.isSupportMask()) {
            this.LLJL = dataInfo.getMasks();
        } else {
            this.LLJL = null;
        }
        this.LLJJL = dataInfo.getTotalFrame();
        if (dataInfo.isSupportLayers()) {
            this.LLJLIL = dataInfo.getLayers();
            C2247331Cxf c2247331Cxf = this.LLJZ;
            if (c2247331Cxf != null) {
                ((LinkedHashMap) c2247331Cxf.LIZLLL).clear();
                this.LLJZ = null;
            }
            if (this.LLJLIL != null) {
                this.LLJZ = new C2247331Cxf(this.LLJJIII.getContext(), this.LLJLIL, new C2247351Cxh(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL), this);
            }
        } else {
            this.LLJLIL = null;
        }
        C2247371Cxj.LIZIZ(this.LLJJJ);
        float[] fArr = this.LL;
        C2247381Cxk c2247381Cxk = this.LLJJJ;
        C2247371Cxj.LIZJ(fArr, c2247381Cxk.LIZ, c2247381Cxk.LIZIZ, c2247381Cxk.LIZJ, c2247381Cxk.LIZLLL);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.LL.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(this.LL);
        this.LLILZ = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.position(0);
        float[] fArr2 = this.LLILLJJLI;
        C2247381Cxk c2247381Cxk2 = this.LLJJIJIL;
        C2247371Cxj.LIZJ(fArr2, c2247381Cxk2.LIZ, c2247381Cxk2.LIZIZ, c2247381Cxk2.LIZJ, c2247381Cxk2.LIZLLL);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.LLILLJJLI.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer2.put(this.LLILLJJLI);
        this.LLILZIL = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.position(0);
        float[] fArr3 = this.LLILLL;
        C2247381Cxk c2247381Cxk3 = this.LLJJIJIIJIL;
        C2247371Cxj.LIZJ(fArr3, c2247381Cxk3.LIZ, c2247381Cxk3.LIZIZ, c2247381Cxk3.LIZJ, c2247381Cxk3.LIZLLL);
        FloatBuffer floatBufferAsFloatBuffer3 = ByteBuffer.allocateDirect(this.LLILLL.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer3.put(this.LLILLL);
        this.LLILZLL = floatBufferAsFloatBuffer3;
        floatBufferAsFloatBuffer3.position(0);
        C2247401Cxm c2247401Cxm = this.LLJLL;
        c2247401Cxm.LIZ = 0.0f;
        c2247401Cxm.LIZIZ = 0.0f;
        c2247401Cxm.LIZJ = 0.0f;
        c2247401Cxm.LIZLLL = 0.0f;
        C2247321Cxe c2247321Cxe = this.LLJJLIIIJLLLLLLLZ;
        if (c2247321Cxe != null) {
            c2247321Cxe.LIZJ();
            this.LLJJLIIIJLLLLLLLZ = null;
        }
    }

    @Override // X.InterfaceC1292140jjI
    public final void setFirstGLFrameListener(InterfaceC2247121CxK interfaceC2247121CxK) {
        this.LLJLLIL = interfaceC2247121CxK;
    }

    @Override // X.InterfaceC2247471Cxt
    public final void LIZIZ(String str, float[] fArr) {
        if (this.LLJLILLLLZIIL == null) {
            this.LLJLILLLLZIIL = new HashMap();
        }
        ((HashMap) this.LLJLILLLLZIIL).put(str, fArr);
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC1287560jbu
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int iLIZIZ = C1287350jbZ.LIZIZ(C1287350jbZ.LIZJ(this.LLJJIII.getResources(), "video/video_vertex.sh"), C1287350jbZ.LIZJ(this.LLJJIII.getResources(), "video/video_frag.sh"));
        this.LLIZLLLIL = iLIZIZ;
        if (iLIZIZ != 0) {
            this.LLJ = GLES20.glGetAttribLocation(iLIZIZ, "aPosition");
            GLES20.glGetError();
            if (this.LLJ != -1) {
                this.LLJI = GLES20.glGetAttribLocation(this.LLIZLLLIL, "aTextureCoord");
                GLES20.glGetError();
                if (this.LLJI != -1) {
                    this.LLJIJIL = GLES20.glGetAttribLocation(this.LLIZLLLIL, "aAlphaTextureCoord");
                    GLES20.glGetError();
                    int i = this.LLJIJIL;
                    if (i != -1) {
                        C2247331Cxf c2247331Cxf = this.LLJZ;
                        if (c2247331Cxf != null) {
                            c2247331Cxf.LIZIZ = new C2247351Cxh(this.LLIZLLLIL, this.LLJ, this.LLJI, i);
                        }
                        C2247321Cxe c2247321Cxe = this.LLJJLIIIJLLLLLLLZ;
                        if (c2247321Cxe != null) {
                            c2247321Cxe.LJIJI = new C2247351Cxh(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL);
                        }
                    } else {
                        throw new RuntimeException("Could not get attrib location for aAlphaTextureCoord");
                    }
                } else {
                    throw new RuntimeException("Could not get attrib location for aTextureCoord");
                }
            } else {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        this.LLIZ = i2;
        GLES20.glBindTexture(36197, i2);
        GLES20.glGetError();
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.LLIZ);
        this.LLJILJIL = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.LLJJIII.getMeasuredWidth(), this.LLJJIII.getMeasuredHeight());
        this.LLJILJIL.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.LLJILJIL);
        InterfaceC2247461Cxs interfaceC2247461Cxs = this.LLJJI;
        if (interfaceC2247461Cxs != null) {
            interfaceC2247461Cxs.LIZIZ(surface);
        }
        this.LLJILJILJ.compareAndSet(true, false);
        C2247321Cxe c2247321Cxe2 = this.LLJJLIIIJLLLLLLLZ;
        if (c2247321Cxe2 != null) {
            c2247321Cxe2.LIZIZ();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC1287560jbu
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // X.InterfaceC1292140jjI
    public final void LIZJ(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            C2247331Cxf c2247331Cxf = this.LLJZ;
            if (c2247331Cxf != null) {
                DataSource.ScaleType scaleType = this.LLJJIJI;
                float f9 = this.LLJJJIL;
                float f10 = this.LLJJJJ;
                float f11 = this.LLJJJJJIL;
                float f12 = this.LLJJJJLIIL;
                c2247331Cxf.LJIIJJI = scaleType;
                c2247331Cxf.LJFF = f9;
                c2247331Cxf.LJI = f10;
                c2247331Cxf.LJII = f11;
                c2247331Cxf.LJIIIIZZ = f12;
                c2247331Cxf.LJIIIZ = f;
                c2247331Cxf.LJIIJ = f2;
            }
            float f13 = f / f2;
            float f14 = f3 / f4;
            if (f13 > f14) {
                f6 = (1.0f - (f2 / (f / f14))) / 2.0f;
                f5 = 0.0f;
            } else {
                f5 = (1.0f - (f / (f2 * f14))) / 2.0f;
                f6 = 0.0f;
            }
            switch (C2247521Cxy.LIZ[this.LLJJIJI.ordinal()]) {
                case 1:
                    LJFF(0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                case 2:
                    if (f13 > f14) {
                        f7 = 0.0f;
                        f8 = (1.0f - ((f2 * f14) / f)) / 2.0f;
                    } else {
                        f7 = (1.0f - ((f / f14) / f2)) / 2.0f;
                    }
                    LJI(f8, f7, f8, f7);
                    break;
                case 3:
                    LJFF(f5, f6, f5, f6);
                    break;
                case 4:
                    LJFF(f5, 0.0f, f5, f6 * 2.0f);
                    break;
                case 5:
                    LJFF(f5, f6 * 2.0f, f5, 0.0f);
                    break;
                case 6:
                    LJFF(0.0f, f6, f5 * 2.0f, f6);
                    break;
                case 7:
                    LJFF(f5 * 2.0f, f6, 0.0f, f6);
                    break;
                case 8:
                    LJI(0.0f, 0.0f, 0.0f, ((1.0f - ((f / f14) / f2)) / 2.0f) * 2.0f);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    LJI(0.0f, ((1.0f - ((f / f14) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    LJI(0.0f, 0.0f, ((1.0f - ((f2 * f14) / f)) / 2.0f) * 2.0f, 0.0f);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    LJI(((1.0f - ((f2 * f14) / f)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    break;
            }
        }
    }

    public final void LJFF(float f, float f2, float f3, float f4) {
        if (this.LLILZIL != null && this.LLJJIJIL != null && this.LLILZLL != null && this.LLJJIJIIJIL != null) {
            float f5 = (1.0f - f3) - f;
            float f6 = (1.0f - f2) - f4;
            this.LLJLL.LIZ((-f) / f5, (-f2) / f6, (-f3) / f5, (-f4) / f6);
            float[] fArr = this.LLILLJJLI;
            C2247381Cxk c2247381Cxk = this.LLJJIJIL;
            float f7 = c2247381Cxk.LIZ;
            float f8 = c2247381Cxk.LIZJ;
            float f9 = c2247381Cxk.LIZIZ;
            float f10 = c2247381Cxk.LIZLLL;
            C2247371Cxj.LIZJ(fArr, ((f8 - f7) * f) + f7, ((f10 - f9) * f2) + f9, f8 - ((f8 - f7) * f3), f10 - ((f10 - f9) * f4));
            this.LLILZIL.position(0);
            this.LLILZIL.put(this.LLILLJJLI);
            float[] fArr2 = this.LLILLL;
            C2247381Cxk c2247381Cxk2 = this.LLJJIJIIJIL;
            float f11 = c2247381Cxk2.LIZ;
            float f12 = c2247381Cxk2.LIZJ;
            float f13 = c2247381Cxk2.LIZIZ;
            float f14 = c2247381Cxk2.LIZLLL;
            C2247371Cxj.LIZJ(fArr2, (f * (f12 - f11)) + f11, (f2 * (f14 - f13)) + f13, f12 - (f3 * (f12 - f11)), f14 - (f4 * (f14 - f13)));
            this.LLILZLL.position(0);
            this.LLILZLL.put(this.LLILLL);
        }
    }

    public final void LJI(float f, float f2, float f3, float f4) {
        if (this.LLILZ == null) {
            return;
        }
        this.LLJLL.LIZ(f, f2, f3, f4);
        float[] fArr = this.LL;
        C2247381Cxk c2247381Cxk = this.LLJJJ;
        C2247371Cxj.LIZJ(fArr, c2247381Cxk.LIZ + (f * 2.0f), c2247381Cxk.LIZIZ - (f2 * 2.0f), c2247381Cxk.LIZJ - (f3 * 2.0f), c2247381Cxk.LIZLLL + (f4 * 2.0f));
        this.LLILZ.position(0);
        this.LLILZ.put(this.LL);
    }
}
