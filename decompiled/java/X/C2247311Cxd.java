package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: X.1Cxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247311Cxd implements InterfaceC1292140jjI {
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
    public C2247341Cxg LLJJL;
    public Map<String, Map<String, DataSource.Element>> LLJJLIIIJLLLLLLLZ;
    public InterfaceC2247121CxK LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final float[] LL = new float[8];
    public final float[] LLILLJJLI = new float[8];
    public final float[] LLILLL = new float[8];
    public final AtomicBoolean LLJILJILJ = new AtomicBoolean(false);
    public final AtomicBoolean LLJILLL = new AtomicBoolean(false);
    public final AtomicInteger LLJJ = new AtomicInteger(0);
    public DataSource.ScaleType LLJJIJI = DataSource.ScaleType.ScaleAspectFill;
    public final C2247401Cxm LLJL = new C2247401Cxm();

    @Override // X.InterfaceC1292140jjI
    public final void release() {
    }

    public final void LIZLLL() {
        C2247341Cxg c2247341Cxg = this.LLJJL;
        if (c2247341Cxg != null) {
            Iterator it2 = ((HashMap) c2247341Cxg.LJIILL).entrySet().iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) ((Map.Entry) it2.next()).getValue()).intValue();
                if (iIntValue != 0) {
                    GLES20.glDeleteTextures(1, new int[]{iIntValue}, 0);
                }
            }
            Iterator it3 = ((HashMap) c2247341Cxg.LJIILJJIL).entrySet().iterator();
            while (it3.hasNext()) {
                ((MaskSrc) ((Map.Entry) it3.next()).getValue()).getBitmap();
            }
            ((HashMap) c2247341Cxg.LJIILJJIL).clear();
            ((HashMap) c2247341Cxg.LJIILL).clear();
            ((ArrayList) c2247341Cxg.LJIILLIIL).clear();
            this.LLJJL = null;
        }
    }

    @Override // X.InterfaceC1292140jjI
    public final void LJII() {
        this.LLJJ.set(0);
        this.LLJILLL.compareAndSet(false, true);
        this.LLJJIII.requestRender();
        this.LLJLILLLLZIIL = true;
    }

    @Override // X.InterfaceC1292140jjI
    public final void onCompletion() {
        this.LLJILLL.compareAndSet(true, false);
        this.LLJJIII.requestRender();
        LIZLLL();
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    public C2247311Cxd(InterfaceC2246811Cwp interfaceC2246811Cwp) {
        this.LLJJIII = interfaceC2246811Cwp;
    }

    @Override // X.InterfaceC1292140jjI
    public final void LIZ(List<MaskSrc> list) {
        if (this.LLJJLIIIJLLLLLLLZ != null && list != null && !list.isEmpty()) {
            this.LLJJL = new C2247341Cxg(this.LLJJIII.getContext(), list);
            if (this.LLJJIII.LIZIZ()) {
                this.LLJJL.LIZ();
            }
        }
    }

    @Override // X.InterfaceC1292140jjI
    public final void LJ(InterfaceC2247461Cxs interfaceC2247461Cxs) {
        this.LLJJI = interfaceC2247461Cxs;
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC1287560jbu
    public final void onDrawFrame(GL10 gl10) {
        Map<String, DataSource.Element> map;
        if (this.LLJILJILJ.compareAndSet(true, false)) {
            try {
                this.LLJILJIL.updateTexImage();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!this.LLJILLL.get()) {
            if (!this.LLJJIII.getLastFrameHold()) {
                GLES20.glClear(16640);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            }
            GLES20.glFinish();
            return;
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        this.LLJJ.addAndGet(1);
        int i = 4;
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
        if (this.LLJJL != null) {
            int i2 = this.LLJJ.get();
            int iLIZ = this.LLJJI.LIZ();
            if (iLIZ > i2 + 2) {
                this.LLJJ.set(iLIZ);
                i2 = iLIZ;
            }
            Map<String, Map<String, DataSource.Element>> map2 = this.LLJJLIIIJLLLLLLLZ;
            if (map2 != null && (map = map2.get(String.valueOf(i2))) != null) {
                for (Map.Entry<String, DataSource.Element> entry : map.entrySet()) {
                    C2247341Cxg c2247341Cxg = this.LLJJL;
                    if (c2247341Cxg != null) {
                        int i3 = this.LLIZ;
                        int i4 = this.LLJJJIL;
                        int i5 = this.LLJJJJ;
                        int i6 = this.LLJJJJJIL;
                        int i7 = this.LLJJJJLIIL;
                        C2247401Cxm c2247401Cxm = this.LLJL;
                        String key = entry.getKey();
                        DataSource.Element value = entry.getValue();
                        if (value.isValid()) {
                            GLES20.glUseProgram(c2247341Cxg.LJIIIIZZ);
                            C1287350jbZ.LIZ();
                            MaskSrc maskSrc = (MaskSrc) ((HashMap) c2247341Cxg.LJIILJJIL).get(key);
                            if (maskSrc != null) {
                                float f = i4;
                                float f2 = i5;
                                float f3 = i6;
                                float f4 = i7;
                                float width = maskSrc.getWidth();
                                float height = maskSrc.getHeight();
                                if (value.type == 0) {
                                    C2247381Cxk c2247381Cxk = c2247341Cxg.LJII;
                                    int[] iArr = value.renderFrame;
                                    if (iArr.length >= i) {
                                        int i8 = iArr[0];
                                        float f5 = i8 + ((iArr[2] - width) / 2.0f);
                                        float f6 = iArr[1] + ((iArr[3] - height) / 2.0f);
                                        c2247381Cxk.LIZJ(f5, f6, f5 + width, f6 + height, f3, f4);
                                    }
                                } else {
                                    c2247341Cxg.LJII.LIZLLL(f3, f4, value.renderFrame);
                                }
                                C2247371Cxj.LIZ(c2247341Cxg.LJII, c2247401Cxm);
                                C2247371Cxj.LIZIZ(c2247341Cxg.LJII);
                                float[] fArr = c2247341Cxg.LIZIZ;
                                C2247381Cxk c2247381Cxk2 = c2247341Cxg.LJII;
                                C2247371Cxj.LIZJ(fArr, c2247381Cxk2.LIZ, c2247381Cxk2.LIZIZ, c2247381Cxk2.LIZJ, c2247381Cxk2.LIZLLL);
                                c2247341Cxg.LJ.position(0);
                                c2247341Cxg.LJ.put(c2247341Cxg.LIZIZ);
                                C2247381Cxk c2247381Cxk3 = c2247341Cxg.LJII;
                                if (value.fitType != 1) {
                                    c2247381Cxk3.LJ(value.renderFrame);
                                    float f7 = c2247381Cxk3.LIZJ - c2247381Cxk3.LIZ;
                                    float f8 = c2247381Cxk3.LIZLLL - c2247381Cxk3.LIZIZ;
                                    c2247381Cxk3.LIZJ(0.0f, 0.0f, f7, f8, f7, f8);
                                } else {
                                    c2247381Cxk3.LJ(value.renderFrame);
                                    float f9 = c2247381Cxk3.LIZJ - c2247381Cxk3.LIZ;
                                    float f10 = c2247381Cxk3.LIZLLL - c2247381Cxk3.LIZIZ;
                                    if (value.type == 0) {
                                        c2247381Cxk3.LIZJ(0.0f, 0.0f, width, height, width, height);
                                    } else if (f9 <= width && f10 <= height) {
                                        float f11 = (width - f9) / 2.0f;
                                        float f12 = (height - f10) / 2.0f;
                                        c2247381Cxk3.LIZJ(f11, f12, f9 + f11, f10 + f12, width, height);
                                    } else {
                                        float f13 = f9 / f10;
                                        if (f13 > width / height) {
                                            float f14 = width / f13;
                                            float f15 = (height - f14) / 2.0f;
                                            c2247381Cxk3.LIZJ(0.0f, f15, width, f14 + f15, width, height);
                                        } else {
                                            float f16 = f13 * height;
                                            float f18 = (width - f16) / 2.0f;
                                            c2247381Cxk3.LIZJ(f18, 0.0f, f16 + f18, height, width, height);
                                        }
                                    }
                                }
                                float[] fArr2 = c2247341Cxg.LIZJ;
                                C2247381Cxk c2247381Cxk4 = c2247341Cxg.LJII;
                                C2247371Cxj.LIZJ(fArr2, c2247381Cxk4.LIZ, c2247381Cxk4.LIZIZ, c2247381Cxk4.LIZJ, c2247381Cxk4.LIZLLL);
                                c2247341Cxg.LJFF.position(0);
                                c2247341Cxg.LJFF.put(c2247341Cxg.LIZJ);
                                c2247341Cxg.LJII.LIZLLL(f, f2, value.sourceFrame);
                                float[] fArr3 = c2247341Cxg.LIZLLL;
                                C2247381Cxk c2247381Cxk5 = c2247341Cxg.LJII;
                                C2247371Cxj.LIZJ(fArr3, c2247381Cxk5.LIZ, c2247381Cxk5.LIZIZ, c2247381Cxk5.LIZJ, c2247381Cxk5.LIZLLL);
                                c2247341Cxg.LJI.position(0);
                                c2247341Cxg.LJI.put(c2247341Cxg.LIZLLL);
                                c2247341Cxg.LJ.position(0);
                                GLES20.glVertexAttribPointer(c2247341Cxg.LJIIIZ, 2, 5126, false, 0, (Buffer) c2247341Cxg.LJ);
                                C1287350jbZ.LIZ();
                                GLES20.glEnableVertexAttribArray(c2247341Cxg.LJIIIZ);
                                C1287350jbZ.LIZ();
                                c2247341Cxg.LJFF.position(0);
                                GLES20.glVertexAttribPointer(c2247341Cxg.LJIIJ, 2, 5126, false, 0, (Buffer) c2247341Cxg.LJFF);
                                C1287350jbZ.LIZ();
                                GLES20.glEnableVertexAttribArray(c2247341Cxg.LJIIJ);
                                C1287350jbZ.LIZ();
                                GLES20.glActiveTexture(33984);
                                Integer num = (Integer) ((HashMap) c2247341Cxg.LJIILL).get(key);
                                if (num != null && num.intValue() != 0) {
                                    GLES20.glBindTexture(3553, num.intValue());
                                    GLES20.glUniform1i(c2247341Cxg.LJIIL, 0);
                                    c2247341Cxg.LJI.position(0);
                                    GLES20.glVertexAttribPointer(c2247341Cxg.LJIIJJI, 2, 5126, false, 0, (Buffer) c2247341Cxg.LJI);
                                    C1287350jbZ.LIZ();
                                    GLES20.glEnableVertexAttribArray(c2247341Cxg.LJIIJJI);
                                    C1287350jbZ.LIZ();
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(36197, i3);
                                    GLES20.glUniform1i(c2247341Cxg.LJIILIIL, 1);
                                    GLES20.glEnable(3042);
                                    GLES20.glBlendFunc(770, 771);
                                    GLES20.glDrawArrays(5, 0, 4);
                                    C1287350jbZ.LIZ();
                                    GLES20.glDisable(3042);
                                }
                            }
                        }
                    }
                    i = 4;
                }
            }
        }
        GLES20.glFinish();
        InterfaceC2247121CxK interfaceC2247121CxK = this.LLJLIL;
        if (interfaceC2247121CxK != null && this.LLJLILLLLZIIL) {
            interfaceC2247121CxK.LIZ();
            this.LLJLILLLLZIIL = false;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.LLJILJILJ.compareAndSet(false, true);
        this.LLJJIII.requestRender();
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
            this.LLJJLIIIJLLLLLLLZ = dataInfo.getMasks();
        } else {
            this.LLJJLIIIJLLLLLLLZ = null;
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
        C2247401Cxm c2247401Cxm = this.LLJL;
        c2247401Cxm.LIZ = 0.0f;
        c2247401Cxm.LIZIZ = 0.0f;
        c2247401Cxm.LIZJ = 0.0f;
        c2247401Cxm.LIZLLL = 0.0f;
        LIZLLL();
    }

    @Override // X.InterfaceC1292140jjI
    public final void setFirstGLFrameListener(InterfaceC2247121CxK interfaceC2247121CxK) {
        this.LLJLIL = interfaceC2247121CxK;
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
                    if (this.LLJIJIL == -1) {
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
        int i = iArr[0];
        this.LLIZ = i;
        GLES20.glBindTexture(36197, i);
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
        C2247341Cxg c2247341Cxg = this.LLJJL;
        if (c2247341Cxg != null) {
            c2247341Cxg.LIZ();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC1287560jbu
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    public final void LIZIZ(float f, float f2, float f3, float f4) {
        if (this.LLILZIL != null && this.LLJJIJIL != null && this.LLILZLL != null && this.LLJJIJIIJIL != null) {
            float f5 = (1.0f - f3) - f;
            float f6 = (1.0f - f2) - f4;
            this.LLJL.LIZ((-f) / f5, (-f2) / f6, (-f3) / f5, (-f4) / f6);
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

    @Override // X.InterfaceC1292140jjI
    public final void LIZJ(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            float f9 = f / f2;
            float f10 = f3 / f4;
            if (f9 > f10) {
                f6 = (1.0f - (f2 / (f / f10))) / 2.0f;
                f5 = 0.0f;
            } else {
                f5 = (1.0f - (f / (f2 * f10))) / 2.0f;
                f6 = 0.0f;
            }
            switch (C2247511Cxx.LIZ[this.LLJJIJI.ordinal()]) {
                case 1:
                    LIZIZ(0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                case 2:
                    if (f9 > f10) {
                        f7 = 0.0f;
                        f8 = (1.0f - ((f2 * f10) / f)) / 2.0f;
                    } else {
                        f7 = (1.0f - ((f / f10) / f2)) / 2.0f;
                    }
                    LJFF(f8, f7, f8, f7);
                    break;
                case 3:
                    LIZIZ(f5, f6, f5, f6);
                    break;
                case 4:
                    LIZIZ(f5, 0.0f, f5, f6 * 2.0f);
                    break;
                case 5:
                    LIZIZ(f5, f6 * 2.0f, f5, 0.0f);
                    break;
                case 6:
                    LIZIZ(0.0f, f6, f5 * 2.0f, f6);
                    break;
                case 7:
                    LIZIZ(f5 * 2.0f, f6, 0.0f, f6);
                    break;
                case 8:
                    LJFF(0.0f, 0.0f, 0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    LJFF(0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    LJFF(0.0f, 0.0f, ((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    LJFF(((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    break;
            }
        }
    }

    public final void LJFF(float f, float f2, float f3, float f4) {
        if (this.LLILZ == null) {
            return;
        }
        this.LLJL.LIZ(f, f2, f3, f4);
        float[] fArr = this.LL;
        C2247381Cxk c2247381Cxk = this.LLJJJ;
        C2247371Cxj.LIZJ(fArr, c2247381Cxk.LIZ + (f * 2.0f), c2247381Cxk.LIZIZ - (f2 * 2.0f), c2247381Cxk.LIZJ - (f3 * 2.0f), c2247381Cxk.LIZLLL + (f4 * 2.0f));
        this.LLILZ.position(0);
        this.LLILZ.put(this.LL);
    }
}
