package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Cxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247291Cxb implements InterfaceC1292140jjI, Handler.Callback, InterfaceC2247471Cxt {
    public final InterfaceC2246811Cwp LL;
    public final boolean LLILLJJLI;
    public FloatBuffer LLILZLL;
    public FloatBuffer LLIZ;
    public FloatBuffer LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public SurfaceTexture LLJILLL;
    public InterfaceC2247461Cxs LLJJIJI;
    public C2247381Cxk LLJJIJIL;
    public C2247381Cxk LLJJJ;
    public C2247381Cxk LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public C2247321Cxe LLJL;
    public C1287450jbj LLJLIL;
    public Map<String, Map<String, DataSource.Element>> LLJLILLLLZIIL;
    public List<C2246591CwT> LLJLL;
    public Map<String, float[]> LLJLLIL;
    public BPEAHandler LLJLLL;
    public HandlerThread LLJZ;
    public C2247331Cxf LLJZIJLIL;
    public InterfaceC2247121CxK LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public long LLLI;
    public int LLLII;
    public long LLLIIII;
    public long LLLIIIIL;
    public final float[] LLILLL = new float[8];
    public final float[] LLILZ = new float[8];
    public final float[] LLILZIL = new float[8];
    public final AtomicBoolean LLJJ = new AtomicBoolean(false);
    public final AtomicBoolean LLJJI = new AtomicBoolean(false);
    public final AtomicInteger LLJJIII = new AtomicInteger(0);
    public DataSource.ScaleType LLJJIJIIJIL = DataSource.ScaleType.ScaleAspectFill;
    public final C2247401Cxm LLL = new C2247401Cxm();

    @Override // X.InterfaceC1292140jjI
    public final void LJII() {
        this.LLJJIII.set(0);
        this.LLJJI.compareAndSet(false, true);
        this.LLLI = SystemClock.currentThreadTimeMillis();
        this.LLLIIII = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstFrame startTimeMs : ");
        sbLIZ.append(this.LLLIIII);
        C1141240fnu.LIZLLL("LocalVideoRendererKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLII = 0;
        this.LLLIIIIL = 0L;
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LL;
        if (interfaceC2246811Cwp != null) {
            interfaceC2246811Cwp.requestRender();
        }
        this.LLLFF = true;
        this.LLLFFI = false;
        this.LLLFZ = false;
    }

    @Override // X.InterfaceC1292140jjI
    public final void onCompletion() throws JSONException {
        HashMap<String, String> mapLIZIZ;
        this.LLJJI.compareAndSet(true, false);
        this.LLLIIIIL = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCompletion endtimems : ");
        sbLIZ.append(this.LLLIIIIL);
        C1141240fnu.LIZLLL("LocalVideoRendererKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        float fCurrentThreadTimeMillis = this.LLLII / ((SystemClock.currentThreadTimeMillis() - this.LLLI) / 100.0f);
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_video_fps", 0.0d)) {
            HashMap map = new HashMap();
            map.put("average", String.valueOf(fCurrentThreadTimeMillis));
            map.put("tag", "ttlive_sdk");
            Long lLIZLLL = C1141290fnz.LIZLLL();
            String strLIZIZ = C501590Jll.LIZIZ(String.valueOf(lLIZLLL != null ? lLIZLLL.longValue() : 0L));
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            map.put("user_id", strLIZIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (long) fCurrentThreadTimeMillis);
            InterfaceC1141190fnp interfaceC1141190fnp = (InterfaceC1141190fnp) C2043807zY.LIZ(InterfaceC1141190fnp.class);
            if (interfaceC1141190fnp != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    try {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        InterfaceC1141390fo9 interfaceC1141390fo9 = C1141500foK.LIZ;
                        if (interfaceC1141390fo9 != null) {
                            interfaceC1141390fo9.e("ttlive_gift_render", null, e);
                        }
                    }
                }
                interfaceC1141190fnp.LIZJ("ttlive_gift_video_fps", jSONObject, jSONObject2);
            }
        }
        HashMap map2 = new HashMap();
        map2.put("average", String.valueOf(fCurrentThreadTimeMillis));
        map2.put("tag", "ttlive_sdk");
        Long lLIZLLL2 = C1141290fnz.LIZLLL();
        map2.put("user_id", String.valueOf(lLIZLLL2 != null ? lLIZLLL2.longValue() : 0L));
        new JSONObject().put("duration", (long) fCurrentThreadTimeMillis);
        C1141340fo4 c1141340fo4 = new C1141340fo4("ttlive_gift_video_fps", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c1141340fo4.LIZLLL.putAll(map2);
        InterfaceC1862007Ra interfaceC1862007Ra = (InterfaceC1862007Ra) C2043807zY.LIZ(InterfaceC1862007Ra.class);
        if (interfaceC1862007Ra != null && (mapLIZIZ = interfaceC1862007Ra.LIZIZ()) != null) {
            c1141340fo4.LIZLLL.putAll(mapLIZIZ);
        }
        C823050WQl.LIZIZ().submit(new ARunnableS117S0100000_17(c1141340fo4, 5));
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LL;
        if (interfaceC2246811Cwp != null) {
            interfaceC2246811Cwp.requestRender();
        }
        C2247321Cxe c2247321Cxe = this.LLJL;
        if (c2247321Cxe != null) {
            c2247321Cxe.LIZJ();
            this.LLJL = null;
        }
        this.LLJLILLLLZIIL = null;
    }

    @Override // X.InterfaceC1292140jjI
    public final void release() {
        HandlerThread handlerThread;
        BPEAHandler bPEAHandler;
        if (this.LLILLJJLI && (bPEAHandler = this.LLJLLL) != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        if (this.LLILLJJLI && (handlerThread = this.LLJZ) != null) {
            handlerThread.quit();
            this.LLJZ = null;
        }
        C2247331Cxf c2247331Cxf = this.LLJZIJLIL;
        if (c2247331Cxf != null) {
            ((LinkedHashMap) c2247331Cxf.LIZLLL).clear();
            this.LLJZIJLIL = null;
        }
    }

    @Override // X.InterfaceC1292140jjI
    public final void LIZ(List<MaskSrc> list) {
        Context context;
        C2247321Cxe c2247321Cxe;
        if (this.LLJLILLLLZIIL != null && list != null && !list.isEmpty()) {
            InterfaceC2246811Cwp interfaceC2246811Cwp = this.LL;
            Boolean boolValueOf = null;
            if (interfaceC2246811Cwp != null) {
                context = interfaceC2246811Cwp.getContext();
            } else {
                context = null;
            }
            C2247321Cxe c2247321Cxe2 = new C2247321Cxe(context, list, this);
            this.LLJL = c2247321Cxe2;
            c2247321Cxe2.LJIJI = new C2247351Cxh(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ);
            InterfaceC2246811Cwp interfaceC2246811Cwp2 = this.LL;
            if (interfaceC2246811Cwp2 != null) {
                boolValueOf = Boolean.valueOf(interfaceC2246811Cwp2.LIZIZ());
            }
            if (C176600m4.LIZIZ(boolValueOf) && (c2247321Cxe = this.LLJL) != null) {
                c2247321Cxe.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC2247471Cxt
    public final float[] LIZLLL(String str) {
        Map<String, float[]> map = this.LLJLLIL;
        if (map == null) {
            return null;
        }
        return (float[]) ((HashMap) map).get(str);
    }

    @Override // X.InterfaceC1292140jjI
    public final void LJ(InterfaceC2247461Cxs interfaceC2247461Cxs) {
        this.LLJJIJI = interfaceC2247461Cxs;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1 && this.LL != null) {
            this.LLJJ.compareAndSet(false, true);
            this.LLLII++;
            this.LL.requestRender();
        }
        return false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC1287560jbu
    public final void onDrawFrame(GL10 gl10) {
        int iLIZ;
        DataSource.Element element;
        if (this.LLJILLL != null && this.LLJJ.compareAndSet(true, false)) {
            try {
                SurfaceTexture surfaceTexture = this.LLJILLL;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!this.LLLFZ) {
                    this.LLLFZ = true;
                    C1141240fnu.LIZJ("LocalVideoRendererKt_gift_video_engine", "onDrawFrame, updateTexImage failed", e);
                }
            }
        }
        Map<String, DataSource.Element> map = null;
        Boolean boolValueOf = null;
        if (!this.LLJJI.get()) {
            InterfaceC2246811Cwp interfaceC2246811Cwp = this.LL;
            if (interfaceC2246811Cwp != null) {
                boolValueOf = Boolean.valueOf(interfaceC2246811Cwp.getLastFrameHold());
            }
            if (!C176600m4.LIZIZ(boolValueOf)) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
            }
            GLES20.glFinish();
            return;
        }
        this.LLJJIII.addAndGet(1);
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        InterfaceC2247461Cxs interfaceC2247461Cxs = this.LLJJIJI;
        if (interfaceC2247461Cxs != null) {
            iLIZ = interfaceC2247461Cxs.LIZ();
        } else {
            iLIZ = 0;
        }
        int i = this.LLJJIII.get();
        if (iLIZ > i + 2) {
            this.LLJJIII.set(iLIZ);
        } else {
            iLIZ = i;
        }
        if (this.LLILZLL != null && this.LLIZ != null && this.LLIZLLLIL != null) {
            GLES20.glUseProgram(this.LLJI);
            FloatBuffer floatBuffer = this.LLILZLL;
            if (floatBuffer != null) {
                floatBuffer.position(0);
            }
            GLES20.glVertexAttribPointer(this.LLJIJIL, 2, 5126, false, 0, (Buffer) this.LLILZLL);
            GLES20.glEnableVertexAttribArray(this.LLJIJIL);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.LLJ);
            FloatBuffer floatBuffer2 = this.LLIZ;
            if (floatBuffer2 != null) {
                floatBuffer2.position(0);
            }
            GLES20.glVertexAttribPointer(this.LLJILJIL, 2, 5126, false, 0, (Buffer) this.LLIZ);
            GLES20.glEnableVertexAttribArray(this.LLJILJIL);
            FloatBuffer floatBuffer3 = this.LLIZLLLIL;
            if (floatBuffer3 != null) {
                floatBuffer3.position(0);
            }
            GLES20.glVertexAttribPointer(this.LLJILJILJ, 2, 5126, false, 0, (Buffer) this.LLIZLLLIL);
            GLES20.glEnableVertexAttribArray(this.LLJILJILJ);
            GLES20.glDrawArrays(5, 0, 4);
        }
        Map<String, Map<String, DataSource.Element>> map2 = this.LLJLILLLLZIIL;
        if (map2 != null) {
            map = map2.get(String.valueOf(iLIZ % this.LLJJLIIIJLLLLLLLZ));
        }
        List<C2246591CwT> list = this.LLJLL;
        if (list != null) {
            for (C2246591CwT c2246591CwT : list) {
                int i2 = c2246591CwT.LIZIZ;
                if (i2 != 0 && i2 != 1) {
                    if (i2 == 2) {
                        String str = c2246591CwT.LIZ;
                        C2247331Cxf c2247331Cxf = this.LLJZIJLIL;
                        if (c2247331Cxf != null) {
                            c2247331Cxf.LIZ(str);
                        }
                    }
                } else {
                    String str2 = c2246591CwT.LIZ;
                    C2247321Cxe c2247321Cxe = this.LLJL;
                    if (map != null && c2247321Cxe != null && (element = map.get(str2)) != null) {
                        c2247321Cxe.LIZ(this.LLJ, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJJL, this.LLL, str2, element, c2246591CwT);
                    }
                }
            }
        } else if (map != null && this.LLJJIJI != null) {
            for (Map.Entry<String, DataSource.Element> entry : map.entrySet()) {
                C2247321Cxe c2247321Cxe2 = this.LLJL;
                if (c2247321Cxe2 != null) {
                    c2247321Cxe2.LIZ(this.LLJ, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJJL, this.LLL, entry.getKey(), entry.getValue(), null);
                }
            }
        }
        C1287450jbj c1287450jbj = this.LLJLIL;
        if (c1287450jbj != null && (!c1287450jbj.LIZ.isEmpty())) {
            for (C1287480jbm c1287480jbm : c1287450jbj.LIZ) {
                GLES20.glUseProgram(c1287480jbm.LIZJ);
                C1287350jbZ.LIZ();
                c1287480jbm.LIZ.position(0);
                GLES20.glVertexAttribPointer(c1287480jbm.LIZLLL, 2, 5126, false, 0, (Buffer) c1287480jbm.LIZ);
                C1287350jbZ.LIZ();
                GLES20.glEnableVertexAttribArray(c1287480jbm.LIZLLL);
                C1287350jbZ.LIZ();
                c1287480jbm.LIZIZ.position(0);
                GLES20.glVertexAttribPointer(c1287480jbm.LJ, 2, 5126, false, 0, (Buffer) c1287480jbm.LIZIZ);
                C1287350jbZ.LIZ();
                GLES20.glEnableVertexAttribArray(c1287480jbm.LJ);
                C1287350jbZ.LIZ();
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(0, 770);
                GLES20.glDrawArrays(5, 0, 4);
                C1287350jbZ.LIZ();
                GLES20.glDisable(3042);
            }
        }
        GLES20.glFinish();
        if (this.LLLF != null && this.LLLFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDrawFrame, onFirstGLFrame dispatch, curFrame=");
            sbLIZ.append(this.LLJJIII.get());
            C1141240fnu.LIZLLL("LocalVideoRendererKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC2247121CxK interfaceC2247121CxK = this.LLLF;
            if (interfaceC2247121CxK != null) {
                interfaceC2247121CxK.LIZ();
            }
            this.LLLFF = false;
            return;
        }
        if (!this.LLLFF || this.LLLFFI) {
            return;
        }
        this.LLLFFI = true;
        C1141240fnu.LIZIZ("LocalVideoRendererKt_gift_video_engine", "onDrawFrame, first GL frame ready but firstGLFrameListener is null");
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        HandlerThread handlerThread;
        BPEAHandler bPEAHandler;
        if (this.LLILLJJLI && (handlerThread = this.LLJZ) != null && C176600m4.LIZIZ(Boolean.valueOf(handlerThread.isAlive())) && (bPEAHandler = this.LLJLLL) != null) {
            C786410Ut5.LJLILLLLZI(bPEAHandler, 1);
        } else {
            if (this.LL == null) {
                return;
            }
            this.LLJJ.compareAndSet(false, true);
            this.LLLII++;
            this.LL.requestRender();
        }
    }

    @Override // X.InterfaceC1292140jjI
    public final void setConfigParams(DataSource.DataInfo dataInfo) {
        C1141240fnu.LIZLLL("LocalVideoRendererKt_gift_video_engine", "setConfigParams");
        this.LLJJIJIIJIL = dataInfo.getScaleType();
        this.LLJJJJ = dataInfo.getVideoWidth();
        this.LLJJJJJIL = dataInfo.getVideoHeight();
        this.LLJJJJLIIL = dataInfo.getActualWidth();
        this.LLJJL = dataInfo.getActualHeight();
        if (dataInfo.isSupportZip()) {
            C2247381Cxk rgbArea = dataInfo.getRgbArea();
            rgbArea.LIZIZ(dataInfo.getVideoWidth(), dataInfo.getVideoHeight());
            this.LLJJJ = rgbArea;
            C2247381Cxk alphaArea = dataInfo.getAlphaArea();
            alphaArea.LIZIZ(dataInfo.getVideoWidth(), dataInfo.getVideoHeight());
            this.LLJJIJIL = alphaArea;
        } else {
            this.LLJJJ = new C2247381Cxk(0.5f, 0.0f, 1.0f, 1.0f);
            this.LLJJIJIL = new C2247381Cxk(0.0f, 0.0f, 0.5f, 1.0f);
        }
        this.LLJJJIL = new C2247381Cxk(0.0f, 0.0f, 1.0f, 1.0f);
        if (dataInfo.isSupportMask()) {
            this.LLJLILLLLZIIL = dataInfo.getMasks();
        } else {
            this.LLJLILLLLZIIL = null;
        }
        this.LLJJLIIIJLLLLLLLZ = dataInfo.getTotalFrame();
        if (dataInfo.isSupportLayers()) {
            this.LLJLL = dataInfo.getLayers();
            C2247331Cxf c2247331Cxf = this.LLJZIJLIL;
            if (c2247331Cxf != null) {
                ((LinkedHashMap) c2247331Cxf.LIZLLL).clear();
                this.LLJZIJLIL = null;
            }
            InterfaceC2246811Cwp interfaceC2246811Cwp = this.LL;
            List<C2246591CwT> list = this.LLJLL;
            if (list != null && interfaceC2246811Cwp != null) {
                this.LLJZIJLIL = new C2247331Cxf(interfaceC2246811Cwp.getContext(), list, new C2247351Cxh(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ), this);
            }
        } else {
            this.LLJLL = null;
        }
        C2247381Cxk c2247381Cxk = this.LLJJJIL;
        if (c2247381Cxk != null && this.LLJJJ != null && this.LLJJIJIL != null) {
            C2247371Cxj.LIZIZ(c2247381Cxk);
            C2247381Cxk c2247381Cxk2 = this.LLJJJIL;
            if (c2247381Cxk2 != null) {
                C2247371Cxj.LIZJ(this.LLILLL, c2247381Cxk2.LIZ, c2247381Cxk2.LIZIZ, c2247381Cxk2.LIZJ, c2247381Cxk2.LIZLLL);
            }
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.LLILLL.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBufferAsFloatBuffer.put(this.LLILLL);
            this.LLILZLL = floatBufferAsFloatBuffer;
            floatBufferAsFloatBuffer.position(0);
            C2247381Cxk c2247381Cxk3 = this.LLJJJ;
            if (c2247381Cxk3 != null) {
                C2247371Cxj.LIZJ(this.LLILZ, c2247381Cxk3.LIZ, c2247381Cxk3.LIZIZ, c2247381Cxk3.LIZJ, c2247381Cxk3.LIZLLL);
            }
            FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.LLILZ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBufferAsFloatBuffer2.put(this.LLILZ);
            this.LLIZ = floatBufferAsFloatBuffer2;
            floatBufferAsFloatBuffer2.position(0);
            C2247381Cxk c2247381Cxk4 = this.LLJJIJIL;
            if (c2247381Cxk4 != null) {
                C2247371Cxj.LIZJ(this.LLILZIL, c2247381Cxk4.LIZ, c2247381Cxk4.LIZIZ, c2247381Cxk4.LIZJ, c2247381Cxk4.LIZLLL);
            }
            FloatBuffer floatBufferAsFloatBuffer3 = ByteBuffer.allocateDirect(this.LLILZIL.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBufferAsFloatBuffer3.put(this.LLILZIL);
            this.LLIZLLLIL = floatBufferAsFloatBuffer3;
            floatBufferAsFloatBuffer3.position(0);
            C2247401Cxm c2247401Cxm = this.LLL;
            c2247401Cxm.LIZ = 0.0f;
            c2247401Cxm.LIZIZ = 0.0f;
            c2247401Cxm.LIZJ = 0.0f;
            c2247401Cxm.LIZLLL = 0.0f;
        }
        C2247321Cxe c2247321Cxe = this.LLJL;
        if (c2247321Cxe != null) {
            c2247321Cxe.LIZJ();
            this.LLJL = null;
        }
    }

    @Override // X.InterfaceC1292140jjI
    public final void setFirstGLFrameListener(InterfaceC2247121CxK interfaceC2247121CxK) {
        this.LLLF = interfaceC2247121CxK;
    }

    public C2247291Cxb(InterfaceC2246811Cwp interfaceC2246811Cwp, boolean z) {
        this.LL = interfaceC2246811Cwp;
        this.LLILLJJLI = z;
        if (z && this.LLJZ == null) {
            HandlerThread handlerThread = new HandlerThread("renderWorker");
            this.LLJZ = handlerThread;
            handlerThread.start();
            this.LLJLLL = new BPEAHandler(C786410Ut5.W2(handlerThread), this);
        }
    }

    @Override // X.InterfaceC2247471Cxt
    public final void LIZIZ(String str, float[] fArr) {
        if (this.LLJLLIL == null) {
            this.LLJLLIL = new HashMap();
        }
        Map<String, float[]> map = this.LLJLLIL;
        if (map != null) {
            ((HashMap) map).put(str, fArr);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC1287560jbu
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Resources resources;
        C1141240fnu.LIZLLL("LocalVideoRendererKt_gift_video_engine", "onSurfaceCreated");
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LL;
        Resources resources2 = null;
        if (interfaceC2246811Cwp != null) {
            resources = interfaceC2246811Cwp.getResources();
        } else {
            resources = null;
        }
        String strLIZJ = C1287350jbZ.LIZJ(resources, "video/video_vertex.sh");
        InterfaceC2246811Cwp interfaceC2246811Cwp2 = this.LL;
        if (interfaceC2246811Cwp2 != null) {
            resources2 = interfaceC2246811Cwp2.getResources();
        }
        int iLIZIZ = C1287350jbZ.LIZIZ(strLIZJ, C1287350jbZ.LIZJ(resources2, "video/video_frag.sh"));
        this.LLJI = iLIZIZ;
        if (iLIZIZ == 0) {
            C1141240fnu.LIZLLL("LocalVideoRendererKt_gift_video_engine", "initProgram return, program == 0");
        } else {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(iLIZIZ, "aPosition");
            this.LLJIJIL = iGlGetAttribLocation;
            if (iGlGetAttribLocation != -1) {
                int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.LLJI, "aTextureCoord");
                this.LLJILJIL = iGlGetAttribLocation2;
                if (iGlGetAttribLocation2 != -1) {
                    int iGlGetAttribLocation3 = GLES20.glGetAttribLocation(this.LLJI, "aAlphaTextureCoord");
                    this.LLJILJILJ = iGlGetAttribLocation3;
                    if (iGlGetAttribLocation3 != -1) {
                        C2247331Cxf c2247331Cxf = this.LLJZIJLIL;
                        if (c2247331Cxf != null) {
                            c2247331Cxf.LIZIZ = new C2247351Cxh(this.LLJI, this.LLJIJIL, this.LLJILJIL, iGlGetAttribLocation3);
                        }
                        C2247321Cxe c2247321Cxe = this.LLJL;
                        if (c2247321Cxe != null) {
                            c2247321Cxe.LJIJI = new C2247351Cxh(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ);
                        }
                    } else {
                        C1141240fnu.LIZIZ("LocalVideoRendererKt_gift_video_engine", "initProgram throw error, aAlphaTextureHandle == -1");
                        throw new RuntimeException("Could not get attrib location for aAlphaTextureCoord");
                    }
                } else {
                    C1141240fnu.LIZIZ("LocalVideoRendererKt_gift_video_engine", "initProgram throw error, aTextureHandle == -1");
                    throw new RuntimeException("Could not get attrib location for aTextureCoord");
                }
            } else {
                C1141240fnu.LIZIZ("LocalVideoRendererKt_gift_video_engine", "initProgram throw error, aPositionHandle == -1");
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.LLJ = i;
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.LLJ);
        this.LLJILLL = surfaceTexture;
        InterfaceC2246811Cwp interfaceC2246811Cwp3 = this.LL;
        if (interfaceC2246811Cwp3 != null) {
            surfaceTexture.setDefaultBufferSize(interfaceC2246811Cwp3.getMeasuredWidth(), interfaceC2246811Cwp3.getMeasuredHeight());
        }
        SurfaceTexture surfaceTexture2 = this.LLJILLL;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(this);
        }
        Surface surface = new Surface(this.LLJILLL);
        InterfaceC2247461Cxs interfaceC2247461Cxs = this.LLJJIJI;
        if (interfaceC2247461Cxs != null) {
            interfaceC2247461Cxs.LIZIZ(surface);
        }
        this.LLJJ.compareAndSet(true, false);
        C2247321Cxe c2247321Cxe2 = this.LLJL;
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
        float f8;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        float f9 = 0.0f;
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            C2247331Cxf c2247331Cxf = this.LLJZIJLIL;
            if (c2247331Cxf != null) {
                DataSource.ScaleType scaleType = this.LLJJIJIIJIL;
                float f10 = this.LLJJJJ;
                float f11 = this.LLJJJJJIL;
                float f12 = this.LLJJJJLIIL;
                float f13 = this.LLJJL;
                c2247331Cxf.LJIIJJI = scaleType;
                c2247331Cxf.LJFF = f10;
                c2247331Cxf.LJI = f11;
                c2247331Cxf.LJII = f12;
                c2247331Cxf.LJIIIIZZ = f13;
                c2247331Cxf.LJIIIZ = f;
                c2247331Cxf.LJIIJ = f2;
            }
            float f14 = f / f2;
            float f15 = f3 / f4;
            if (f14 > f15) {
                f6 = (1 - (f2 / (f / f15))) / 2;
                f5 = 0.0f;
            } else {
                f5 = (1 - (f / (f2 * f15))) / 2;
                f6 = 0.0f;
            }
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).w02()) {
                if (C497740JfY.LJIL()) {
                    f8 = 0.6f;
                } else {
                    f8 = 0.4f;
                }
                float f16 = ((f * f8) / f15) / f2;
                float f18 = 1;
                float f19 = 2;
                float f20 = (f18 - f8) / f19;
                LJI(f20, f19 * ((f18 - f16) / f19), f20, 0.0f);
                C1287450jbj c1287450jbj = this.LLJLIL;
                if (c1287450jbj != null) {
                    c1287450jbj.LIZ.clear();
                    float f21 = f8 * (-1.0f);
                    float f22 = 1.0f * f8;
                    float f23 = (2.0f * f16) - 1.0f;
                    float f24 = f8 * 0.2f;
                    float f25 = f21 + f24;
                    float f26 = f22 - f24;
                    Boolean boolValueOf3 = null;
                    try {
                        C1287480jbm c1287480jbmLIZ = C1287450jbj.LIZ("\nprecision mediump float;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, vTextureCoord.y);\n}    \n", f21, f23, f22, f23 - (f16 * 0.2f));
                        if (c1287480jbmLIZ != null) {
                            boolValueOf2 = Boolean.valueOf(c1287450jbj.LIZ.add(c1287480jbmLIZ));
                        } else {
                            boolValueOf2 = null;
                        }
                        C189200o6.m2constructorimpl(boolValueOf2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    try {
                        C1287480jbm c1287480jbmLIZ2 = C1287450jbj.LIZ("\nprecision mediump float;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, vTextureCoord.x);\n}    \n", f21, f23, f25, -1.0f);
                        if (c1287480jbmLIZ2 != null) {
                            boolValueOf = Boolean.valueOf(c1287450jbj.LIZ.add(c1287480jbmLIZ2));
                        } else {
                            boolValueOf = null;
                        }
                        C189200o6.m2constructorimpl(boolValueOf);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                    try {
                        C1287480jbm c1287480jbmLIZ3 = C1287450jbj.LIZ("\nprecision mediump float;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, 1.0 - vTextureCoord.x);\n}    \n", f26, f23, f22, -1.0f);
                        if (c1287480jbmLIZ3 != null) {
                            boolValueOf3 = Boolean.valueOf(c1287450jbj.LIZ.add(c1287480jbmLIZ3));
                        }
                        C189200o6.m2constructorimpl(boolValueOf3);
                        return;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C189200o6.m2constructorimpl(new C098200Yq(th3));
                        return;
                    }
                }
                return;
            }
            switch (C2247501Cxw.LIZ[this.LLJJIJIIJIL.ordinal()]) {
                case 1:
                    LJFF(0.0f, 0.0f, 0.0f, 0.0f);
                    return;
                case 2:
                    if (f14 > f15) {
                        f9 = (1 - ((f2 * f15) / f)) / 2;
                        f7 = 0.0f;
                    } else {
                        f7 = (1 - ((f / f15) / f2)) / 2;
                    }
                    LJI(f9, f7, f9, f7);
                    return;
                case 3:
                    LJFF(f5, f6, f5, f6);
                    return;
                case 4:
                    LJFF(f5, 0.0f, f5, f6 * 2);
                    return;
                case 5:
                    LJFF(f5, f6 * 2, f5, 0.0f);
                    return;
                case 6:
                    LJFF(0.0f, f6, f5 * 2, f6);
                    return;
                case 7:
                    LJFF(f5 * 2, f6, 0.0f, f6);
                    return;
                case 8:
                    float f27 = 2;
                    LJI(0.0f, 0.0f, 0.0f, ((1 - ((f / f15) / f2)) / f27) * f27);
                    return;
                case BdTuring.TYPE_ECAF /* 9 */:
                    float f28 = 2;
                    LJI(0.0f, ((1 - ((f / f15) / f2)) / f28) * f28, 0.0f, 0.0f);
                    return;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    float f29 = 2;
                    LJI(0.0f, 0.0f, ((1 - ((f2 * f15) / f)) / f29) * f29, 0.0f);
                    return;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    float f30 = 2;
                    LJI(((1 - ((f2 * f15) / f)) / f30) * f30, 0.0f, 0.0f, 0.0f);
                    return;
                default:
                    throw new C1954807lC();
            }
        }
    }

    public final void LJFF(float f, float f2, float f3, float f4) {
        if (this.LLIZ != null && this.LLJJJ != null && this.LLIZLLLIL != null && this.LLJJIJIL != null) {
            float f5 = 1;
            float f6 = (f5 - f3) - f;
            float f7 = (f5 - f2) - f4;
            this.LLL.LIZ((-f) / f6, (-f2) / f7, (-f3) / f6, (-f4) / f7);
            C2247381Cxk c2247381Cxk = this.LLJJJ;
            if (c2247381Cxk != null) {
                float[] fArr = this.LLILZ;
                float f8 = c2247381Cxk.LIZ;
                float f9 = c2247381Cxk.LIZJ;
                float f10 = c2247381Cxk.LIZIZ;
                float f11 = c2247381Cxk.LIZLLL;
                C2247371Cxj.LIZJ(fArr, ((f9 - f8) * f) + f8, ((f11 - f10) * f2) + f10, f9 - ((f9 - f8) * f3), f11 - ((f11 - f10) * f4));
            }
            FloatBuffer floatBuffer = this.LLIZ;
            if (floatBuffer != null) {
                floatBuffer.position(0);
            }
            FloatBuffer floatBuffer2 = this.LLIZ;
            if (floatBuffer2 != null) {
                floatBuffer2.put(this.LLILZ);
            }
            C2247381Cxk c2247381Cxk2 = this.LLJJIJIL;
            if (c2247381Cxk2 != null) {
                float[] fArr2 = this.LLILZIL;
                float f12 = c2247381Cxk2.LIZ;
                float f13 = c2247381Cxk2.LIZJ;
                float f14 = c2247381Cxk2.LIZIZ;
                float f15 = c2247381Cxk2.LIZLLL;
                C2247371Cxj.LIZJ(fArr2, (f * (f13 - f12)) + f12, (f2 * (f15 - f14)) + f14, f13 - (f3 * (f13 - f12)), f15 - (f4 * (f15 - f14)));
            }
            FloatBuffer floatBuffer3 = this.LLIZLLLIL;
            if (floatBuffer3 != null) {
                floatBuffer3.position(0);
            }
            FloatBuffer floatBuffer4 = this.LLIZLLLIL;
            if (floatBuffer4 != null) {
                floatBuffer4.put(this.LLILZIL);
            }
        }
    }

    public final void LJI(float f, float f2, float f3, float f4) {
        if (this.LLILZLL != null && this.LLJJJIL != null) {
            this.LLL.LIZ(f, f2, f3, f4);
            C2247381Cxk c2247381Cxk = this.LLJJJIL;
            if (c2247381Cxk != null) {
                float f5 = 2;
                C2247371Cxj.LIZJ(this.LLILLL, c2247381Cxk.LIZ + (f * f5), c2247381Cxk.LIZIZ - (f2 * f5), c2247381Cxk.LIZJ - (f3 * f5), c2247381Cxk.LIZLLL + (f4 * f5));
            }
            FloatBuffer floatBuffer = this.LLILZLL;
            if (floatBuffer != null) {
                floatBuffer.position(0);
            }
            FloatBuffer floatBuffer2 = this.LLILZLL;
            if (floatBuffer2 != null) {
                floatBuffer2.put(this.LLILLL);
            }
        }
    }
}
