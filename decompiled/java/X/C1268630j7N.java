package X;

import Y.ARunnableS0S1102100_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS12S1000000_20;
import Y.ARunnableS13S0301000_20;
import Y.ARunnableS1S2101000_20;
import Y.ARunnableS21S0100100_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.AudioManager;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.VideoFrameStatistics;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.scene_detect.ITTLHSceneDetectResourceHandler;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.core.statics.VideoFrameStaticsManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.player.AVPlayerV2;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import com.ss.ttlivestreamer.livestreamv2.strategy.EffectModelStrategy;
import com.ss.ttlivestreamer.livestreamv2.strategy.TTLHPerfAdaptiveConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DataFormatException;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268630j7N extends AbstractC1273900jFs implements AudioDeviceModule.Observer, InterfaceC1268830j7h, InterfaceC1267860j68, InterfaceC1269020j80, InterfaceC1268500j7A {
    public static final ConcurrentLinkedQueue<String> LLLLII = new ConcurrentLinkedQueue<>();
    public AudioDeviceModule LLILLL;
    public final Handler LLILZ;
    public volatile InterfaceC1268920j7q LLILZIL;
    public C1268910j7p LLILZLL;
    public SafeHandlerThread LLIZ;
    public final Handler LLIZLLLIL;
    public GLThread LLJ;
    public C1266350j3h LLJI;
    public InterfaceC1272730jDz LLJILJIL;
    public InterfaceC775290Ub9 LLJILJILJ;
    public C1268670j7R LLJILLL;
    public final C1268760j7a LLJJ;
    public final C1266390j3l LLJJIII;
    public final InterfaceC1268640j7O LLJJIJI;
    public ViewOnTouchListenerC1268840j7i LLJJIJIL;
    public C589900NBs<C0UHD> LLJJJJLIIL;
    public C589900NBs<InterfaceC1267860j68> LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public C1268850j7j LLJLIL;
    public C1268510j7B LLJLILLLLZIIL;
    public C1269780j9E LLL;
    public String LLLF;
    public View LLLFF;
    public InterfaceC1269030j81 LLLFFI;
    public C1272210jD9 LLLFZ;
    public int LLLII;
    public C1268710j7V LLLIIII;
    public C1268710j7V LLLIIIIL;
    public final C1271430jBt LLLIIIL;
    public C1274130jGF LLLIIL;
    public C1275410jIJ LLLIILIL;
    public C1269090j87 LLLIL;
    public final C1267500j5Y LLLILZ;
    public final C1269300j8S LLLILZJ;
    public final C1268970j7v LLLILZLLLI;
    public final AtomicBoolean LLLIZZ;
    public final ITTLHSceneDetectResourceHandler LLLJ;
    public TTLHSceneDetector LLLJIL;
    public final C1268750j7Z LLLJL;
    public final C1269340j8W LLLL;
    public final C1266700j4G LLJIJIL = new C1266700j4G();
    public InterfaceC1269980j9Y LLJJI = null;
    public long LLJJIJIIJIL = 0;
    public final List<C0UHD> LLJJJ = new ArrayList();
    public final List<InterfaceC1267860j68> LLJJJIL = new ArrayList();
    public final Object LLJJJJ = new Object();
    public final Object LLJJJJJIL = new Object();
    public boolean LLJLL = true;
    public boolean LLJLLIL = false;
    public C1269240j8M LLJLLL = new C1269240j8M();
    public final Object LLJZ = new Object();
    public long LLJZIJLIL = 0;
    public boolean LLLI = false;

    public static final EffectModelStrategy LLLLZLLIL(String str) {
        return null;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJJIZL(DnsOptimizer dnsOptimizer) {
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LJJZZI() {
        AVLog.logKibana(4, "LiveCoreImpl", "releaseAllMediaPlayers", null);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJZZI();
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLIFFJFJJ() {
    }

    @Override // X.AbstractC1273900jFs
    public final C012U LLIIJI(String str) {
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final void LLIIL() {
    }

    @Override // X.AbstractC1273900jFs
    public final void LLILLL(TTLHPerfAdaptiveConfig tTLHPerfAdaptiveConfig) {
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLILZIL() {
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJILLL() {
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJJLIIIJLLLLLLLZ() {
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJLLL() {
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLJIL() {
    }

    public final synchronized void LLLZZ() {
        C1272810jE7 c1272810jE7;
        C1269240j8M c1269240j8M;
        Looper looper;
        Thread thread;
        this.LLLIZZ.set(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("begin release ");
        sbLIZ.append(this);
        AVLog.ioi("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ));
        LLLZIL(false);
        LJJI();
        this.LLLILZ.LIZIZ.LJJIJL = null;
        this.LLLFF = null;
        boolean z = this.LLLL.LJLJI.LJJIFFI;
        TTLHSceneDetector tTLHSceneDetector = this.LLLJIL;
        if (tTLHSceneDetector != null) {
            tTLHSceneDetector.release();
            this.LLLJIL = null;
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJJJZ(null);
            this.LLJI.LJIJI(null);
            this.LLJI.LLLLJI(null);
            InterfaceC1268640j7O interfaceC1268640j7O = this.LLJI.LLJLILLLLZIIL;
            if (interfaceC1268640j7O != null) {
                interfaceC1268640j7O.LLILZLL(null);
            }
        }
        if (this.LLJL) {
            this.LLJJJJLIIL = null;
            this.LLJJL = null;
        } else {
            synchronized (this.LLJJJJ) {
                try {
                    ((ArrayList) this.LLJJJ).clear();
                } finally {
                }
            }
            synchronized (this.LLJJJJJIL) {
                try {
                    ((ArrayList) this.LLJJJIL).clear();
                } finally {
                }
            }
        }
        LLZLL();
        LJIILL();
        stop();
        C1266350j3h c1266350j3h2 = this.LLJI;
        if (c1266350j3h2 != null) {
            c1266350j3h2.LLLI();
        }
        C1269260j8O.LIZIZ(this.LLLILZ);
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS120S0100000_20(this, 6));
        Object obj = new Object();
        boolean[] zArr = {true};
        synchronized (obj) {
            try {
                C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS89S0200000_20(zArr, obj, 5));
                obj.wait(500L);
            } catch (InterruptedException th) {
            } finally {
            }
            if (zArr[0] && (looper = this.LLILZ.getLooper()) != null && (thread = looper.getThread()) != null) {
                C1266350j3h.LLF(thread, "LiveCoreImpl");
            }
        }
        if (!LLIZLLLIL()) {
            SafeHandlerThread safeHandlerThread = this.LLIZ;
            if (safeHandlerThread != null) {
                C1273730jFb.LIZLLL(safeHandlerThread);
                this.LLIZ = null;
            }
            GLThread gLThread = this.LLJ;
            if (gLThread != null) {
                C1273730jFb.LIZLLL(gLThread);
                this.LLJ = null;
            }
        }
        ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = this.LLJJIJIL;
        if (viewOnTouchListenerC1268840j7i != null) {
            viewOnTouchListenerC1268840j7i.LJ();
            this.LLJJIJIL = null;
        }
        C1268510j7B c1268510j7B = this.LLJLILLLLZIIL;
        if (c1268510j7B != null) {
            c1268510j7B.release();
            this.LLJLILLLLZIIL = null;
        }
        this.LLIZ = null;
        this.LLJ = null;
        this.LLJILLL = null;
        this.LLJILJILJ = null;
        this.LLJILJIL = null;
        this.LLJI = null;
        synchronized (this.LLJZ) {
            try {
                if (this.LLJJLIIIJLLLLLLLZ && (c1269240j8M = this.LLJLLL) != null) {
                    c1269240j8M.release();
                    this.LLJLLL = null;
                }
            } finally {
            }
        }
        this.LLL.LIZJ();
        GLThreadManager.dispose();
        if (AVLog.isLogIODeviceEnabled(4)) {
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = LLLLII;
            synchronized (concurrentLinkedQueue) {
                try {
                    String str = this.LLLF;
                    if (str != null) {
                        concurrentLinkedQueue.remove(str);
                        this.LLLF = null;
                    }
                    for (String str2 : concurrentLinkedQueue) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("current remain livecores:");
                        sbLIZ2.append(str2);
                        AVLog.ioi("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } finally {
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("end release ");
            sbLIZ3.append(this);
            sbLIZ3.append(": ");
            sbLIZ3.append(LLLLII.size());
            AVLog.ioi("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (LLIZLLLIL() && (c1272810jE7 = this.LLLILZ.LIZJ) != null) {
            c1272810jE7.LIZIZ();
        }
        if (z) {
            C1269520j8o.LIZ("release");
        }
        AVLog.logKibana(4, "LiveCoreImpl", "LiveCoreImpl release finished", null);
    }

    @Override // X.C0UHD
    public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
    }

    @Override // X.InterfaceC1273910jFt
    public final void LIZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LIZ();
        }
        C1274130jGF c1274130jGF = this.LLLIIL;
        if (c1274130jGF != null) {
            c1274130jGF.LIZ();
        }
        if (this.LLLIILIL != null && this.LLJI != null) {
            if (!LLJ()) {
                this.LLJI.LLLL(this.LLLIILIL.LIZ(EnumC1270450jAJ.kAbnormalDetectNodeCapture));
            }
            if (LLIZLLLIL()) {
                InterfaceC1266410j3n interfaceC1266410j3n = this.LLJI.LLJJJ;
                if (interfaceC1266410j3n != null) {
                    interfaceC1266410j3n.LJJIL(this.LLLIILIL);
                    interfaceC1266410j3n.LJJJJJL(EnumC1270450jAJ.kAbnormalDetectNodeEffect);
                    if (LLJ()) {
                        interfaceC1266410j3n.LJJJJJL(EnumC1270450jAJ.kAbnormalDetectNodeCapture);
                    }
                }
            } else {
                InterfaceC1268640j7O interfaceC1268640j7O = this.LLJI.LLJLILLLLZIIL;
                if (interfaceC1268640j7O != null) {
                    interfaceC1268640j7O.LJJIJIL(this.LLLIILIL.LIZ(EnumC1270450jAJ.kAbnormalDetectNodeEffect));
                }
            }
        }
        if (this.LLLJIL == null || this.LLJI == null) {
            return;
        }
        if (!LLJ()) {
            this.LLJI.LLLLII(this.LLLJIL);
            return;
        }
        InterfaceC1266410j3n interfaceC1266410j3n2 = this.LLJI.LLJJJ;
        if (interfaceC1266410j3n2 != null) {
            interfaceC1266410j3n2.LJLIIIL(this.LLLJIL);
            this.LLLJIL.setEnableArchOptPhase2(true);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final AbstractC765580U1k LJII() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return null;
        }
        return c1266350j3h.LLJLLIL;
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJIIIZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJIIIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1268640j7O LJIIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return null;
        }
        return c1266350j3h.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIILL() {
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS120S0100000_20(this, 3));
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJIILL();
        }
        C1274130jGF c1274130jGF = this.LLLIIL;
        if (c1274130jGF != null) {
            c1274130jGF.LIZIZ();
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final boolean LJIILLIIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJIILLIIL();
        }
        return false;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIJJ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJIJJ();
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1268690j7T LJIJJLI() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return null;
        }
        return c1266350j3h.LJIJJLI();
    }

    @Override // X.InterfaceC1273910jFt
    public final long LJJ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJJ();
        }
        return -1L;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJI() {
        AVLog.logKibana(4, "LiveCoreImpl", "unregisterScreenAudioPlayBack", null);
        if (this.LLLFZ != null) {
            C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS120S0100000_20(this, 7));
        }
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final boolean LJJII() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.p;
        }
        return false;
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1270540jAS LJJIJ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return null;
        }
        return c1266350j3h.LLJLLL;
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1274500jGq LJJJJJL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return null;
        }
        return c1266350j3h.W;
    }

    @Override // X.InterfaceC1273910jFt
    public final C1266510j3x LJJJJL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJJJJL();
        }
        return null;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJLIIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJJLIIL();
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJZ() {
        C1274130jGF c1274130jGF = this.LLLIIL;
        if (c1274130jGF != null) {
            c1274130jGF.LIZIZ();
        }
        this.LLLIIL = new C1274130jGF(this, this.LLILZ);
    }

    @Override // X.InterfaceC1273910jFt
    public final InterfaceC1274500jGq LJJZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJLZ(null);
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJLLL();
        }
    }

    @Override // X.AbstractC1273900jFs
    public final InterfaceC774130UYh LJLJI() {
        if (this.LLILLL != null) {
            if (C1269260j8O.LIZIZ(this.LLLILZ)) {
                return new AVPlayerV2(this.LLILLL, this.LLLILZ.LIZIZ.LJJJZ, true);
            }
            try {
                return (InterfaceC774130UYh) Class.forName("com.ss.ttlivestreamer.livestreamv2.player.AVPlayerV2").getConstructor(AudioDeviceModule.class).newInstance(this.LLILLL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("LiveCoreImpl", "Not found AVPlayerV2", e);
            }
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LJLJJI() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLFF();
        }
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final C1267280j5C LJLLJ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLZZZZ;
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final JSONObject LJLLLL() {
        AudioDeviceModule audioDeviceModule = this.LLILLL;
        if (audioDeviceModule != null) {
            return audioDeviceModule.getAudioDiagnosisScore();
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final float LJLLLLLL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLIFFJFJJ();
        }
        return 0.0f;
    }

    @Override // X.AbstractC1273900jFs
    public final JSONObject LJLZ() {
        JSONObject jSONObjectLLII;
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null && (jSONObjectLLII = c1266350j3h.LLII()) != null) {
            return jSONObjectLLII;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectLJ = this.LLLILZ.LIZ.mPushBase.LJ();
        if (jSONObjectLJ != null) {
            try {
                jSONObject.put("colorCorrectionSetting", jSONObjectLJ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.logKibana(4, "LiveCoreImpl", "bmf get color correction put error. ", e);
            }
        } else {
            AVLog.logKibana(4, "LiveCoreImpl", "bmf get color correction default value is null. ", null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bmf get color correction setting is : ");
        sbLIZ.append(jSONObject);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        return jSONObject;
    }

    @Override // X.AbstractC1273900jFs
    public final int LJZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return -1;
        }
        return c1266350j3h.q;
    }

    @Override // X.AbstractC1273900jFs
    public final int LL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return -1;
        }
        return c1266350j3h.LLIIIJ();
    }

    @Override // X.AbstractC1273900jFs
    public final int LLF() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return 24;
        }
        return c1266350j3h.LLILZLL.LJLLL;
    }

    @Override // X.AbstractC1273900jFs
    public final JSONObject LLFII() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLIIL();
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final float LLFZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLIILZL();
        }
        return 0.0f;
    }

    @Override // X.AbstractC1273900jFs
    public final Map<String, String> LLI() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLIIZ();
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final C1273620jFQ LLII() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJLL;
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final EnumC1267980j6K LLIIII() {
        C1266350j3h c1266350j3h = this.LLJI;
        return c1266350j3h != null ? c1266350j3h.LLLLZ : EnumC1267980j6K.NORMAL_LIVE;
    }

    @Override // X.AbstractC1273900jFs
    public final int LLIIIJ() {
        C1272210jD9 c1272210jD9 = this.LLLFZ;
        if (c1272210jD9 != null) {
            return c1272210jD9.LJ;
        }
        return 0;
    }

    @Override // X.AbstractC1273900jFs
    public final InterfaceC1272820jE8 LLIIIL() {
        return this.LLLILZ.LIZJ;
    }

    @Override // X.AbstractC1273900jFs
    public final int LLIIIZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return 20;
        }
        return c1266350j3h.LLILZLL.LJLLLL;
    }

    @Override // X.AbstractC1273900jFs
    public final String LLIIJLIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        return c1266350j3h != null ? c1266350j3h.LLILIL() : "";
    }

    @Override // X.AbstractC1273900jFs
    public final List<String> LLIILII() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String str = c1266350j3h.LLLFF;
        if (str != null) {
            arrayList.add(str);
        } else {
            List<String> list = c1266350j3h.LLLFFI;
            if (list != null && !list.isEmpty()) {
                return c1266350j3h.LLLFFI;
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC1273900jFs
    public final C1269410j8d LLIILZL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLILL();
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final JSONObject LLIIZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLILLIZIL();
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final InterfaceC1266410j3n LLILII() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJJJ;
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final JSONObject LLILIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        return c1266350j3h != null ? c1266350j3h.LLILLJJLI() : new JSONObject();
    }

    @Override // X.AbstractC1273900jFs
    public final Bundle LLILL() {
        C1266350j3h c1266350j3h = this.LLJI;
        return c1266350j3h == null ? new Bundle() : c1266350j3h.LLILLL();
    }

    @Override // X.AbstractC1273900jFs
    public final IVideoStrategyRunner LLILLJJLI() {
        return this.LLJI.L;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLILZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return false;
        }
        return c1266350j3h.r;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLILZLL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return false;
        }
        return c1266350j3h.LLJILJIL();
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLIZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return false;
        }
        return c1266350j3h.LLJILJILJ();
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLIZLLLIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJILLL();
        }
        if (!this.LLLILZ.LIZ.LJIIIZ() || !this.LLLILZ.LIZ.mPushBase.LJIJJLI()) {
            return false;
        }
        this.LLLILZ.LIZ.ttlhABSettingsConfigs.getClass();
        return !TTLHABSettingsConfigs.LJFF.getVideoFramePoolConfig().getEnable() && this.LLLILZ.LIZ.enableNewVideoBufferPool;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJJ();
        }
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJI() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJJI();
        }
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJIJIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return false;
        }
        return c1266350j3h.LLILZLL.LJLLJ;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJILJIL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJJIJI();
        }
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJILJILJ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJJIJIIJIL();
        }
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJJ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJJIJIL();
        }
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJJI() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJJJJ();
        }
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final boolean LLJJIII() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLJJJJJIL();
        }
        return false;
    }

    @Override // X.AbstractC1273900jFs
    public final int LLJZIJLIL() {
        return (!(this.LLJI instanceof C1266350j3h) || this.LLLFF == null) ? LyraxErrorCode.NOT_SUPPORT.value() : !LLZL() ? LyraxErrorCode.NOT_SUPPORT.value() : this.LLJI.LLLLILI(this.LLLFF);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLF() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLIL();
        }
    }

    @Override // X.AbstractC1273900jFs
    public final JSONObject LLLLLJLJLL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLLLLLZZ();
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLLZ();
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLLJ() {
        InterfaceC1268950j7t interfaceC1268950j7t;
        InterfaceC1268950j7t interfaceC1268950j7t2;
        C1268710j7V c1268710j7V = this.LLLIIII;
        if (c1268710j7V != null && (interfaceC1268950j7t2 = c1268710j7V.LJ) != null) {
            interfaceC1268950j7t2.onReset();
        }
        C1268710j7V c1268710j7V2 = this.LLLIIIIL;
        if (c1268710j7V2 == null || (interfaceC1268950j7t = c1268710j7V2.LJ) == null) {
            return;
        }
        interfaceC1268950j7t.onReset();
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLLL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.f150X = null;
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLLLLL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLZLLIL();
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLZ() throws Exception {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLZLL();
        }
    }

    public final InterfaceC1268820j7g LLLLZ() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return null;
        }
        return c1266350j3h.LJLLLLLL();
    }

    public final InterfaceC1268820j7g LLLLZLLLI() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return null;
        }
        return c1266350j3h.V;
    }

    public final void LLLZIIL() {
        if (this.LLJJLIIIJLLLLLLLZ && this.LLLIZZ.get()) {
            return;
        }
        AVLog.ioi("LiveCoreImpl", "begin pause");
        this.LLJLLIL = true;
        C1274130jGF c1274130jGF = this.LLLIIL;
        if (c1274130jGF != null) {
            c1274130jGF.LIZIZ();
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLF();
        }
        AVLog.ioi("LiveCoreImpl", "end pause");
    }

    public final void LLLZL() {
        List<String> list;
        C1269340j8W c1269340j8W = this.LLLL;
        try {
            System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{");
            sbLIZ.append(this.LLILLL.getDiagnosisFinalResult());
            sbLIZ.append("}");
            JSONObject jSONObjectPut = jSONObject.put("audio_metrics_end_info", C2188811AlT.LIZIZ(sbLIZ));
            C1266350j3h c1266350j3h = this.LLJI;
            c1266350j3h.getClass();
            ArrayList arrayList = new ArrayList();
            String str = c1266350j3h.LLLFF;
            if (str != null) {
                arrayList.add(str);
                list = arrayList;
            } else {
                List<String> list2 = c1266350j3h.LLLFFI;
                list = arrayList;
                if (list2 != null) {
                    list = arrayList;
                    if (!list2.isEmpty()) {
                        list = c1266350j3h.LLLFFI;
                    }
                }
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("url", list).put("mode", "push").put("event_key", "push_audiometrics_end_event");
            C1271010jBD c1271010jBD = c1269340j8W.LJLJI.LJJIIJZLJL;
            if (c1271010jBD != null) {
                c1271010jBD.LIZ("live_client_monitor_log", jSONObjectPut2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Create postSAMIDiagnosis log error: ");
            sbLIZ2.append(e.toString());
            AVLog.ioe("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LLLZLL() {
        C1266390j3l c1266390j3l;
        C1266390j3l c1266390j3l2;
        if (this.LLJI == null) {
            return;
        }
        this.LLLILZ.LIZ.getClass();
        if (this.LLLILZ.LIZ.LJII) {
            if (this.LLJJIII != null) {
                InterfaceC1268640j7O interfaceC1268640j7O = this.LLJJIJI;
                if (interfaceC1268640j7O != null) {
                    interfaceC1268640j7O.isEnable();
                }
                if (!LJJII()) {
                    this.LLJJIII.LJIIJ(EnumC1267970j6J.TYPE_RENDER, this.LLJLILLLLZIIL);
                } else {
                    this.LLJJIII.LJIILIIL(EnumC1267970j6J.TYPE_RENDER);
                }
            }
            InterfaceC1269980j9Y interfaceC1269980j9Y = !LJJII() ? this.LLJLILLLLZIIL : this.LLJJI;
            InterfaceC1268640j7O interfaceC1268640j7O2 = this.LLJJIJI;
            if (interfaceC1268640j7O2 != null) {
                interfaceC1268640j7O2.LJJII(interfaceC1269980j9Y, EnumC1272790jE5.SELFSIDE_RENDER_CHAIN);
            }
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null || !c1266350j3h.p) {
            InterfaceC1269980j9Y interfaceC1269980j9Y2 = this.LLJJI;
            if (interfaceC1269980j9Y2 == null || (c1266390j3l = this.LLJJIII) == null) {
                return;
            }
            c1266390j3l.LJIIIIZZ(interfaceC1269980j9Y2);
            return;
        }
        InterfaceC1269980j9Y interfaceC1269980j9Y3 = this.LLJJI;
        if (interfaceC1269980j9Y3 == null || (c1266390j3l2 = this.LLJJIII) == null) {
            return;
        }
        c1266390j3l2.LJI(interfaceC1269980j9Y3);
    }

    public final void LLZ() {
        if (this.LLJJLIIIJLLLLLLLZ && this.LLLIZZ.get()) {
            return;
        }
        AVLog.ioi("LiveCoreImpl", "begin resume");
        this.LLJLLIL = false;
        C1274130jGF c1274130jGF = this.LLLIIL;
        if (c1274130jGF != null) {
            c1274130jGF.LIZ();
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLILZ();
        }
        AVLog.ioi("LiveCoreImpl", "end resume");
    }

    public final boolean LLZL() {
        C1269340j8W c1269340j8W;
        LiveSdkSetting liveSdkSetting;
        return (this.LLJI instanceof C1266350j3h) && (c1269340j8W = this.LLLL) != null && (liveSdkSetting = c1269340j8W.LIZ) != null && liveSdkSetting.LJIJJ() >= 2;
    }

    public final void LLZLL() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLLLLLLL();
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void i0() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.i0();
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void startAudioCapture() {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.startAudioCapture();
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void stop() {
        HashMap map = (HashMap) C1268890j7n.LIZ;
        Timer timer = (Timer) map.get("ReportNetworkQuality");
        if (timer != null) {
            timer.cancel();
            map.remove("ReportNetworkQuality");
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.stop();
        }
    }

    public final void LLZLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startReportNetworkQuality switch:");
        sbLIZ.append(!this.LLLL.LJJJJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLLL.LJJJJ) {
            return;
        }
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 5);
        Map<String, Timer> map = C1268890j7n.LIZ;
        HashMap map2 = (HashMap) map;
        Timer timer = (Timer) map2.get("ReportNetworkQuality");
        if (timer != null) {
            timer.cancel();
            map2.remove("ReportNetworkQuality");
        }
        PthreadTimer pthreadTimer = new PthreadTimer("imerTaskUtils");
        long j = 2000;
        pthreadTimer.schedule(new C391480FWo(aRunnableS120S0100000_20, 4), j, j);
        ((HashMap) map).put("ReportNetworkQuality", pthreadTimer);
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final C1267500j5Y LJJIIJZLJL() {
        return this.LLLILZ;
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJJJLZIJ() {
        return this.LLLII;
    }

    @Override // X.AbstractC1273900jFs
    public final AudioDeviceModule LJLLI() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1273900jFs
    public final C1275410jIJ LJLLILLLL() {
        return this.LLLIILIL;
    }

    @Override // X.AbstractC1273900jFs
    public final View LJZL() {
        return this.LLLFF;
    }

    @Override // X.AbstractC1273900jFs
    public final C1269340j8W LLD() {
        return this.LLLL;
    }

    @Override // X.AbstractC1273900jFs
    public final InterfaceC1272980jEO LLFF() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1273900jFs
    public final TTLHSceneDetector LLIIIILZ() {
        return this.LLLJIL;
    }

    @Override // X.AbstractC1273900jFs
    public final Handler LLIL() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03b7  */
    /* JADX WARN: Type inference failed for: r0v70, types: [X.0j87] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1268630j7N(X.C1269340j8W r20) {
        /*
            Method dump skipped, instruction units count: 2103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268630j7N.<init>(X.0j8W):void");
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LIZIZ(String str) {
        InterfaceC1269030j81 interfaceC1269030j81;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseMediaPlayer streamID:");
        sbLIZ.append(str);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            EnumC1269640j90 enumC1269640j90LLIILII = c1266350j3h.LLIILII(str);
            if (enumC1269640j90LLIILII != null && enumC1269640j90LLIILII == EnumC1269640j90.LOCAL_RENDER_AND_REMOTE_MIX && (interfaceC1269030j81 = this.LLLFFI) != null) {
                ((C1274850jHP) interfaceC1269030j81).LJIILIIL(40010, 0, str);
            }
            this.LLJI.LIZIZ(str);
        }
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopMediaPlayer streamID:");
        sbLIZ.append(str);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LIZLLL(str);
        }
        InterfaceC1269030j81 interfaceC1269030j81 = this.LLLFFI;
        if (interfaceC1269030j81 != null) {
            ((C1274850jHP) interfaceC1269030j81).LJIILIIL(40012, 0, str);
        }
    }

    @Override // X.InterfaceC1268500j7A
    public final void LJ(String str) {
        LLLZZIL(9, 0, new Exception(str));
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJFF(C0UHL c0uhl) {
        C1268670j7R c1268670j7R = new C1268670j7R(this, c0uhl);
        this.LLJILLL = c1268670j7R;
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLJJIJI = c1268670j7R;
        }
        C1268970j7v c1268970j7v = this.LLLILZLLLI;
        if (c1268970j7v != null) {
            c1268970j7v.LL = c1268670j7R;
        }
    }

    @Override // X.InterfaceC1274510jGr
    public final InterfaceC1274490jGp LJIILIIL(String str) {
        ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = this.LLJJIJIL;
        if (viewOnTouchListenerC1268840j7i != null) {
            C1268850j7j c1268850j7jLIZ = viewOnTouchListenerC1268840j7i.LIZ(str, VideoMixer.VideoMixerDescription.INVISIABLE(), 0, 0, 2);
            if (c1268850j7jLIZ instanceof C1268850j7j) {
                return c1268850j7jLIZ;
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIILJJIL(InterfaceC775290Ub9 interfaceC775290Ub9) {
        this.LLJILJILJ = interfaceC775290Ub9;
        InterfaceC775290Ub9 interfaceC775290Ub92 = new InterfaceC775290Ub9() { // from class: X.0j76
            @Override // X.InterfaceC775300UbA
            public final void V3(int i, int i2, Exception exc) {
                String string;
                C1269780j9E c1269780j9E = this.LL.LLL;
                if (c1269780j9E != null) {
                    C1269140j8C c1269140j8C = c1269780j9E.LLJ.LIZIZ;
                    C1268810j7f c1268810j7f = c1269140j8C.LJJIL;
                    if (((!c1268810j7f.LIZ || c1268810j7f.LJFF) && !c1269140j8C.LJJIII) || i < 100 || i > 110) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (exc != null) {
                            string = exc.toString();
                        } else {
                            string = null;
                        }
                        C786410Ut5.LJJZZIII(c1269780j9E.LL, new ARunnableS0S1102100_20(c1269780j9E, jCurrentTimeMillis, i, i2, string, 3));
                    }
                }
                this.LL.LLLZZIL(i, i2, exc);
            }
        };
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLJJIII = interfaceC775290Ub92;
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIIZILJ(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("updateSdkParams", jSONObject);
        if (str == null) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS12S1000000_20(str, 1));
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJIIZILJ(str);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIJI(C0UHD c0uhd) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJIJI(c0uhd);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final LyraxPreProcessVideoNodeStats LJIL(JSONObject jSONObject) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJIL(jSONObject);
        }
        return null;
    }

    @Override // X.InterfaceC1273910jFt
    public final double LJJIFFI(String str) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJJIFFI(str);
        }
        return -1.0d;
    }

    @Override // X.AbstractC1273900jFs
    public final void LJJIII(C1271090jBL c1271090jBL) {
        if (this.LLJL) {
            C589900NBs<InterfaceC1267860j68> c589900NBs = this.LLJJL;
            if (c589900NBs != null) {
                c589900NBs.LIZIZ(c1271090jBL);
                return;
            }
            return;
        }
        synchronized (this.LLJJJJJIL) {
            try {
                if (!((ArrayList) this.LLJJJIL).contains(c1271090jBL)) {
                    ((ArrayList) this.LLJJJIL).add(c1271090jBL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIIZI(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJIIZI(audioRecordingCallback);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIJIIJI(boolean z) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJIJIIJI(z);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIJIL(int i) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJIJIL(i);
        }
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LJJIJL(boolean z) throws JSONException {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return;
        }
        c1266350j3h.LJJIJL(z);
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIJLIJ(Bitmap bitmap) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJIJLIJ(bitmap);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final boolean LJJIL(C1269240j8M c1269240j8M) {
        boolean z;
        int i;
        C1270620jAa c1270620jAa;
        C1269190j8H c1269190j8H;
        float realRatePerSecond;
        if (c1269240j8M == null) {
            return false;
        }
        C1266350j3h c1266350j3h = this.LLJI;
        boolean z2 = true;
        if (this.LLJJLIIIJLLLLLLLZ) {
            z = !this.LLLIZZ.get();
        } else {
            z = true;
        }
        synchronized (this.LLJZ) {
            if (c1266350j3h != null && z) {
                try {
                    if (this.LLJLLL != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - this.LLJZIJLIL >= 1000) {
                            this.LLJZIJLIL = jCurrentTimeMillis;
                            boolean zLJJIL = c1266350j3h.LJJIL(this.LLJLLL);
                            ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = this.LLJJIJIL;
                            if (viewOnTouchListenerC1268840j7i != null) {
                                C1269240j8M c1269240j8M2 = this.LLJLLL;
                                C1272880jEE c1272880jEE = viewOnTouchListenerC1268840j7i.LLILLJJLI;
                                if (c1272880jEE != null) {
                                    VideoFrameStatics videoFrameStatics = c1272880jEE.LLLLJ;
                                    if (videoFrameStatics != null) {
                                        realRatePerSecond = videoFrameStatics.getRealRatePerSecond();
                                    } else {
                                        realRatePerSecond = -1.0f;
                                    }
                                } else {
                                    realRatePerSecond = 0.0f;
                                }
                                c1269240j8M2.setDouble("mini_game_render_fps", realRatePerSecond);
                            }
                            if (LLJ()) {
                                C1266350j3h c1266350j3h2 = this.LLJI;
                                if (c1266350j3h2 instanceof C1266350j3h) {
                                    C1266420j3o c1266420j3o = c1266350j3h2.LLJJJIL;
                                    if (c1266420j3o != null && (c1270620jAa = c1266420j3o.LJI) != null && (c1269190j8H = c1270620jAa.LLJ) != null) {
                                        double d = c1269190j8H.LJ;
                                        this.LLJLLL.setLong("camera_average_exposure_time", c1269190j8H.LIZ);
                                        this.LLJLLL.setLong("camera_average_fps", c1269190j8H.LIZLLL);
                                        this.LLJLLL.setLong("camera_iso_info", c1269190j8H.LIZIZ);
                                        this.LLJLLL.setInt("camera_capture_width", c1269190j8H.LJFF);
                                        this.LLJLLL.setInt("camera_capture_height", c1269190j8H.LJI);
                                        this.LLJLLL.setDouble("camera_avg_result_fps", d);
                                        this.LLJLLL.setInt("camera_type", c1269190j8H.LJIIJJI);
                                        this.LLJLLL.setString("camera_fps_range", c1269190j8H.LJII);
                                        this.LLJLLL.setInt("camera_target_fps_min", c1269190j8H.LJIIIIZZ);
                                        this.LLJLLL.setInt("camera_target_fps", c1269190j8H.LJIIIZ);
                                        if (d > 0.0d) {
                                            C1274170jGJ.LIZJ(d);
                                        }
                                    }
                                    this.LLJLLL.setInt("current_capture_device", this.LLLL.LJJII());
                                    double dLLILL = c1266350j3h2.LJIJJLI().LLILL();
                                    if (dLLILL > 0.0d) {
                                        C1274170jGJ.LIZIZ(dLLILL);
                                    }
                                }
                            } else {
                                InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI = c1266350j3h.LJIJJLI();
                                if (interfaceC1268690j7TLJIJJLI != null) {
                                    this.LLJLLL.setLong("camera_average_exposure_time", interfaceC1268690j7TLJIJJLI.LLIL());
                                    this.LLJLLL.setLong("camera_average_fps", interfaceC1268690j7TLJIJJLI.LLFF());
                                    this.LLJLLL.setLong("camera_iso_info", interfaceC1268690j7TLJIJJLI.LLILZ());
                                    this.LLJLLL.setInt("camera_capture_width", interfaceC1268690j7TLJIJJLI.LJJL());
                                    this.LLJLLL.setInt("camera_capture_height", interfaceC1268690j7TLJIJJLI.LJJJJ());
                                    double dLJIJ = interfaceC1268690j7TLJIJJLI.LJIJ();
                                    this.LLJLLL.setDouble("camera_avg_result_fps", dLJIJ);
                                    if (dLJIJ > 0.0d) {
                                        C1274170jGJ.LIZJ(dLJIJ);
                                    }
                                    C1269240j8M c1269240j8M3 = this.LLJLLL;
                                    if (interfaceC1268690j7TLJIJJLI.LLIFFJFJJ()) {
                                        i = 2;
                                    } else {
                                        i = 1;
                                    }
                                    c1269240j8M3.setInt("camera_type", i);
                                    this.LLJLLL.setInt("current_capture_device", interfaceC1268690j7TLJIJJLI.LL());
                                    this.LLJLLL.setString("camera_fps_range", interfaceC1268690j7TLJIJJLI.LJJIJ());
                                    this.LLJLLL.setInt("camera_target_fps", interfaceC1268690j7TLJIJJLI.LJIL());
                                    if (interfaceC1268690j7TLJIJJLI.LL() == 1 || interfaceC1268690j7TLJIJJLI.LL() == 2) {
                                        double dLLILL2 = interfaceC1268690j7TLJIJJLI.LLILL();
                                        if (dLLILL2 > 0.0d) {
                                            C1274170jGJ.LIZIZ(dLLILL2);
                                        }
                                    }
                                    if (c1269240j8M.getLong("camera_average_exposure_time") > 0) {
                                        C1274170jGJ.LIZ(c1269240j8M.getLong("camera_average_exposure_time"));
                                    }
                                }
                            }
                            InterfaceC1268640j7O interfaceC1268640j7O = c1266350j3h.LLJLILLLLZIIL;
                            if (interfaceC1268640j7O != null) {
                                this.LLJLLL.setBool("skip_effect", interfaceC1268640j7O.LLILLJJLI());
                            }
                            AudioDeviceModule audioDeviceModule = this.LLILLL;
                            if (audioDeviceModule != null) {
                                this.LLJLLL.setInt("adm_mic_rec_db", (int) audioDeviceModule.getMicVolumedB());
                            }
                            C1275410jIJ c1275410jIJ = this.LLLIILIL;
                            if (c1275410jIJ != null) {
                                c1275410jIJ.LIZJ(this.LLJLLL, false);
                            }
                            TTLHSceneDetector tTLHSceneDetector = this.LLLJIL;
                            if (tTLHSceneDetector != null) {
                                tTLHSceneDetector.updateStatisticBundle(this.LLJLLL);
                            }
                            z2 = zLJJIL;
                        }
                        if (c1269240j8M != this.LLJLLL) {
                            c1269240j8M.clear();
                            c1269240j8M.updateFrom(this.LLJLLL);
                        }
                        return z2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return false;
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJ(InterfaceC1268540j7E interfaceC1268540j7E) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJJ(interfaceC1268540j7E);
        }
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LJJJJLL(C1267140j4y c1267140j4y) throws JSONException {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return;
        }
        c1266350j3h.LJJJJLL(c1267140j4y);
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJJZ(InterfaceC1267860j68 interfaceC1267860j68) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJJJZ(interfaceC1267860j68);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final boolean LJJLI(int[] iArr) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJJLI(iArr);
        }
        return false;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJ(C151O c151o) {
        LJJLJLI(c151o, 1, null);
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJJLIIIJILLIZJL(boolean z) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LJJLIIIJILLIZJL(z);
        }
        return 0;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJJI(C774490UZr c774490UZr) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJLIIIJJI(c774490UZr);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJL(int i) {
        this.LLIZ.post(new ARunnableS31S0101000_20(i, this, 0));
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJLJLI(List<String> list) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJLIIIJLJLI(list);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIJ(TEBundle tEBundle) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJLIIJ(tEBundle);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIL(int i) {
        if (this.LLJLLIL) {
            AVLog.iow("LiveCoreImpl", "can't switchVideoCapture when pause.");
            return;
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJLIL(i);
        }
        C1274130jGF c1274130jGF = this.LLLIIL;
        if (c1274130jGF != null) {
            c1274130jGF.LIZIZ();
            if (i == 1 || i == 2) {
                this.LLLIIL.LIZ();
            }
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LJJLJ(C0UHD c0uhd) {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL2;
        if (this.LLJL) {
            C589900NBs<C0UHD> c589900NBs = this.LLJJJJLIIL;
            if (c589900NBs != null) {
                if (((ArrayList) c589900NBs.LIZ()).isEmpty() && (interfaceC1268640j7OLJIIL2 = LJIIL()) != null) {
                    interfaceC1268640j7OLJIIL2.LJJIJL(true);
                }
                c589900NBs.LIZIZ(c0uhd);
                return;
            }
            return;
        }
        synchronized (this.LLJJJJ) {
            if (c0uhd != null) {
                try {
                    if (!this.LLJJJ.contains(c0uhd)) {
                        if (this.LLJJJ.isEmpty() && (interfaceC1268640j7OLJIIL = LJIIL()) != null) {
                            interfaceC1268640j7OLJIIL.LJJIJL(true);
                        }
                        this.LLJJJ.add(c0uhd);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLL(boolean z) {
        this.LLIZ.post(new ARunnableS39S0110000_20(this, z, 1));
    }

    @Override // X.AbstractC1273900jFs
    public final void LJL(C1274330jGZ c1274330jGZ) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJLIL(c1274330jGZ);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLI(C1269610j8x c1269610j8x) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJLILLLLZI(c1269610j8x);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLIIL(int i) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJLLI(i);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final int LJLILLLLZI(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("faceStrategy");
        if (jSONObjectOptJSONObject != null) {
            this.LLLIIII = LLLLZI("faceStrategy", jSONObjectOptJSONObject);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mattingStrategy");
        if (jSONObjectOptJSONObject2 != null) {
            this.LLLIIIIL = LLLLZI("mattingStrategy", jSONObjectOptJSONObject2);
            return 0;
        }
        return 0;
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLJJLL(boolean z) {
        AudioDeviceModule audioDeviceModule = this.LLILLL;
        if (audioDeviceModule != null) {
            audioDeviceModule.enableANS(z);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLJL(boolean z) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLFFF(z);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLJLJ(boolean z) {
        C1266350j3h c1266350j3h;
        InterfaceC1269030j81 interfaceC1269030j81;
        if (this.LLLL == null || (c1266350j3h = this.LLJI) == null) {
            return;
        }
        EnumC1267980j6K enumC1267980j6K = c1266350j3h.LLLLZ;
        if (enumC1267980j6K != EnumC1267980j6K.LINKMIC_CO_HOST && enumC1267980j6K != EnumC1267980j6K.LINKMIC_MULTI_GUEST) {
            return;
        }
        this.LLJI.LLFII(z);
        if (!LLIZ() && this.LLLL != null && (interfaceC1269030j81 = this.LLLFFI) != null) {
            ((C1274850jHP) interfaceC1269030j81).LJIILIIL(40008, 0, Boolean.valueOf(z), Float.valueOf(2.0f));
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLJLLL(boolean z) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLI(z);
        }
        LLLZLL();
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLL(boolean z) {
        AudioDeviceModule audioDeviceModule = this.LLILLL;
        if (audioDeviceModule != null) {
            audioDeviceModule.fallbackToMicCaptureForScreenAudio(true);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final Map<String, String> LJLLL(long j) {
        C1268750j7Z c1268750j7Z = this.LLLJL;
        if (c1268750j7Z != null) {
            c1268750j7Z.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1269850j9L c1269850j9L = c1268750j7Z.LL;
            if (c1269850j9L != null) {
                VideoFrameStaticsManager videoFrameStaticsManager = c1269850j9L.LLILZ;
                if (videoFrameStaticsManager != null) {
                    videoFrameStaticsManager.getRecordInfos(linkedHashMap, j);
                }
                String str = c1268750j7Z.LLILLJJLI;
                if (str != null) {
                    linkedHashMap.put("stream_name", str);
                }
                String str2 = c1268750j7Z.LLILLL;
                if (str2 != null) {
                    linkedHashMap.put("stream_id", str2);
                }
            }
            return linkedHashMap;
        }
        return null;
    }

    @Override // X.AbstractC1273900jFs
    public final void LLFFF(C1269240j8M c1269240j8M) {
        VideoFrameStatistics videoFrameStatistics;
        if (c1269240j8M == null) {
            return;
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h instanceof C1266350j3h) {
            if (c1266350j3h.LLILZLL != null && (videoFrameStatistics = c1266350j3h.LLJILJIL) != null) {
                videoFrameStatistics.getStaticsReport(c1269240j8M);
            }
            LJJIL(c1269240j8M);
            int i = 0;
            if (!c1266350j3h.LLJILLL()) {
                InterfaceC1268640j7O interfaceC1268640j7O = c1266350j3h.LLJLILLLLZIIL;
                if (interfaceC1268640j7O instanceof C1272090jCx) {
                    C1272090jCx c1272090jCx = (C1272090jCx) interfaceC1268640j7O;
                    int i2 = c1272090jCx.LLLLZIL;
                    c1272090jCx.LLLLZIL = 0;
                    i = i2;
                }
            }
            c1269240j8M.setLong("nobuffercnt", i);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJJIJI(JSONObject jSONObject) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLJLILLLLZIIL(jSONObject);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJJJ(EnumC1267980j6K enumC1267980j6K) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLJLLIL(enumC1267980j6K);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJJJIL(Cert cert) {
        C1270290jA3.LIZIZ().LIZJ(EnumC1270240j9y.AUDIO_START, cert);
        C1269500j8m.LIZJ().LJ(1, "LiveCoreImpl.pause", cert);
        C1269500j8m.LIZJ().LJ(0, "LiveCoreImpl.pause", cert);
        LLLZIIL();
        C1269500j8m.LIZJ().LIZLLL(0);
        C1269500j8m.LIZJ().LIZLLL(1);
    }

    @Override // X.AbstractC1273900jFs
    public final Bundle LLJJJJJIL(String str) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLLFFI(str);
        }
        return new Bundle();
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJJJJLIIL(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        LLLZLZ(audioRecordingCallback);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0j7p] */
    @Override // X.AbstractC1273900jFs
    public final void LLJJL(C1273930jFv c1273930jFv) {
        C1268910j7p c1268910j7p;
        this.LLILZIL = c1273930jFv;
        if (this.LLILZLL == null) {
            this.LLILZLL = new AudioDeviceModule.AudioEventObserver() { // from class: X.0j7p
                @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.AudioEventObserver
                public final void onAudioDeviceCaptureStateChanged(int i, int i2) {
                    InterfaceC1268920j7q interfaceC1268920j7q = this.LL.LLILZIL;
                    if (interfaceC1268920j7q != null) {
                        interfaceC1268920j7q.LIZ(EnumC1274000jG2.fromId(i), i2);
                    }
                }
            };
        }
        AudioDeviceModule audioDeviceModule = this.LLILLL;
        if (audioDeviceModule != null) {
            if (c1273930jFv != null) {
                c1268910j7p = this.LLILZLL;
            } else {
                c1268910j7p = null;
            }
            audioDeviceModule.setAudioEventObserver(c1268910j7p);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJL(C1274850jHP c1274850jHP) {
        this.LLLFFI = c1274850jHP;
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJLIL(InterfaceC1266830j4T interfaceC1266830j4T) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.f150X = interfaceC1266830j4T;
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJLILLLLZIIL(Cert cert) {
        C1270290jA3.LIZIZ().LIZJ(EnumC1270240j9y.AUDIO_STOP, cert);
        C1269500j8m.LIZJ().LJ(0, "LiveCoreImpl.release", cert);
        C1269500j8m.LIZJ().LJ(1, "LiveCoreImpl.release", cert);
        LLLZZ();
        C1269500j8m.LIZJ().LIZLLL(0);
        C1269500j8m.LIZJ().LIZLLL(1);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJLL(InterfaceC1267860j68 interfaceC1267860j68) {
        if (this.LLJL) {
            C589900NBs<InterfaceC1267860j68> c589900NBs = this.LLJJL;
            if (c589900NBs != null) {
                c589900NBs.LIZJ(interfaceC1267860j68);
                return;
            }
            return;
        }
        synchronized (this.LLJJJJJIL) {
            try {
                this.LLJJJIL.remove(interfaceC1267860j68);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJLLIL(C1274330jGZ c1274330jGZ) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLII(c1274330jGZ);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJZ(C0UHD c0uhd) {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL2;
        if (this.LLJL) {
            C589900NBs<C0UHD> c589900NBs = this.LLJJJJLIIL;
            if (c589900NBs != null) {
                c589900NBs.LIZJ(c0uhd);
                if (((ArrayList) c589900NBs.LIZ()).isEmpty() && (interfaceC1268640j7OLJIIL2 = LJIIL()) != null) {
                    interfaceC1268640j7OLJIIL2.LJJIJL(false);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.LLJJJJ) {
            if (c0uhd != null) {
                try {
                    this.LLJJJ.remove(c0uhd);
                    if (this.LLJJJ.isEmpty() && (interfaceC1268640j7OLJIIL = LJIIL()) != null) {
                        interfaceC1268640j7OLJIIL.LJJIJL(false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLL(JSONObject jSONObject) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLIIIL(jSONObject);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLFF(Cert cert) {
        C1270290jA3.LIZIZ().LIZJ(EnumC1270240j9y.AUDIO_START, cert);
        C1269500j8m.LIZJ().LJ(1, "LiveCoreImpl.resume", cert);
        C1269500j8m.LIZJ().LJ(0, "LiveCoreImpl.resume", cert);
        LLZ();
        C1269500j8m.LIZJ().LIZLLL(0);
        C1269500j8m.LIZJ().LIZLLL(1);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLFZ(JSONObject jSONObject) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLJ(jSONObject);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLI(int i) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLJIL(i);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLIIII(float f) {
        C1272880jEE c1272880jEE;
        ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = this.LLJJIJIL;
        if (viewOnTouchListenerC1268840j7i != null && (c1272880jEE = viewOnTouchListenerC1268840j7i.LLILLJJLI) != null) {
            c1272880jEE.setCornerRadius(f);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLIIIIL(C923980a9U c923980a9U) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLIIIILLL(c923980a9U);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0j7B] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1273900jFs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIIIL(final android.view.View r31) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268630j7N.LLLIIIL(android.view.View):void");
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLIIL(boolean z) {
        this.LLLI = z;
        this.LLIZ.post(new ARunnableS39S0110000_20(this, z, 0));
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLIILIL(boolean z) {
        C1272880jEE c1272880jEE;
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableFixedSizeOpt:");
        sbLIZ.append(z);
        sbLIZ.append(" mLayerControl:");
        sbLIZ.append(this.LLJJIJIL);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = this.LLJJIJIL;
        if (viewOnTouchListenerC1268840j7i != null && (c1272880jEE = viewOnTouchListenerC1268840j7i.LLILLJJLI) != null) {
            C1268800j7e c1268800j7e = c1272880jEE.LLJJJIL;
            if (z) {
                j = 600;
            } else {
                j = 0;
            }
            c1268800j7e.LJFF = j;
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLIL(List<LyraxTranscoderFeature> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (LyraxTranscoderFeature lyraxTranscoderFeature : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("featureName", lyraxTranscoderFeature.getFeatureName());
                    jSONObject2.put("projectKey", lyraxTranscoderFeature.getProjectKey());
                    jSONObject2.put("options", lyraxTranscoderFeature.getOptions());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("features", jSONArray);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("setFeatures", jSONObject);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLIIL(list);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLILZ(C1273190jEj c1273190jEj) {
        this.LLJJI = c1273190jEj;
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            InterfaceC1266410j3n interfaceC1266410j3n = c1266350j3h.LLJJJ;
            if (interfaceC1266410j3n != null) {
                interfaceC1266410j3n.LJIIZILJ(c1273190jEj);
            }
            this.LLJI.LLLLIILL(c1273190jEj);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLILZJ(C0UHH c0uhh) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.m = c0uhh;
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLILZLLLI(InterfaceC1272020jCq interfaceC1272020jCq) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLIILLL(interfaceC1272020jCq);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLIZZ(C923790a9B c923790a9B) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLIL(c923790a9B);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLJ(C1267580j5g c1267580j5g) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLJ(c1267580j5g);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLJL(InterfaceC1268200j6g interfaceC1268200j6g) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return;
        }
        c1266350j3h.LLLLL(interfaceC1268200j6g);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLL(InterfaceC1272730jDz interfaceC1272730jDz) {
        this.LLJILJIL = interfaceC1272730jDz;
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLII(VideoSink videoSink) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLLIL(videoSink);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLIIIILLL(EnumC1267980j6K enumC1267980j6K) {
        boolean z;
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLLILLIL(enumC1267980j6K);
            if (this.LLLJIL != null) {
                if (!this.LLLL.LIZ.mPushBase.LJJIJLIJ().enableLinkmicDetect && enumC1267980j6K != EnumC1267980j6K.NORMAL_LIVE) {
                    z = false;
                } else {
                    z = true;
                }
                this.LLLJIL.setEnableSceneDetect(z);
            }
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLIIL(float f) {
        if (!this.LLLL.LJJIZ() && !this.LLLL.LJLJL) {
            C1272210jD9 c1272210jD9 = this.LLLFZ;
            if (c1272210jD9 != null) {
                InterfaceC1268820j7g interfaceC1268820j7g = c1272210jD9.LIZ;
                if (interfaceC1268820j7g != null) {
                    AudioMixer.AudioMixerDescription audioMixerDescriptionLIZ = interfaceC1268820j7g.LIZ();
                    audioMixerDescriptionLIZ.volumeCoeff = f;
                    c1272210jD9.LIZ.LIZLLL(audioMixerDescriptionLIZ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("interal auido volume:");
                sbLIZ.append(f);
                AVLog.ioi("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        AudioDeviceModule audioDeviceModule = this.LLILLL;
        if (audioDeviceModule == null) {
            return;
        }
        audioDeviceModule.setAudioScreenVolume(f);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLIILL(float f) {
        if (!this.LLLL.LJJIZ() && !this.LLLL.LJLJL) {
            InterfaceC1268820j7g interfaceC1268820j7gLLLLZLLLI = LLLLZLLLI();
            if (interfaceC1268820j7gLLLLZLLLI != null) {
                AudioMixer.AudioMixerDescription audioMixerDescriptionLIZ = interfaceC1268820j7gLLLLZLLLI.LIZ();
                audioMixerDescriptionLIZ.volumeCoeff = f;
                interfaceC1268820j7gLLLLZLLLI.LIZLLL(audioMixerDescriptionLIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("interal auido volume:");
                sbLIZ.append(f);
                AVLog.ioi("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        AudioDeviceModule audioDeviceModule = this.LLILLL;
        if (audioDeviceModule == null) {
            return;
        }
        audioDeviceModule.setAudioCaptureVolume(f);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLIILLL(InterfaceC1274230jGP interfaceC1274230jGP) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.d = interfaceC1274230jGP;
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLJ(Cert cert) {
        C1270290jA3.LIZIZ().LIZJ(EnumC1270240j9y.AUDIO_START, cert);
        C1269500j8m.LIZJ().LJ(1, "LiveCoreImpl.startAudioCapture", cert);
        startAudioCapture();
        C1269500j8m.LIZJ().LIZLLL(1);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLJI(Cert cert) {
        C1269500j8m.LIZJ().LJ(0, "LiveCoreImpl.startVideoCapture", cert);
        LIZ();
        C1269500j8m.LIZJ().LIZLLL(0);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLIL(Cert cert) {
        C1270290jA3.LIZIZ().LIZJ(EnumC1270240j9y.AUDIO_STOP, cert);
        C1269500j8m.LIZJ().LJ(1, "LiveCoreImpl.stopAudioCapture", cert);
        LLZLL();
        C1269500j8m.LIZJ().LIZLLL(1);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLILLIL(Cert cert) {
        C1269500j8m.LIZJ().LJ(0, "LiveCoreImpl.stopVideoCapture", cert);
        LJIILL();
        C1269500j8m.LIZJ().LIZLLL(0);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLLLLLL(Intent intent) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLZLLLI(intent);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final int LLLLLLLZIL(String str) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLLZ(str);
        }
        return 0;
    }

    @Override // X.AbstractC1273900jFs
    public final int LLLLLLZ(String str) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLLZI(str);
        }
        return 0;
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLLZZ(C1267110j4v c1267110j4v) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLZL(c1267110j4v);
        }
    }

    public final void LLLZ(String str) {
        C1266350j3h c1266350j3h;
        C1269340j8W c1269340j8W = this.LLLL;
        if ((c1269340j8W == null || !c1269340j8W.LJLJJLL) && (c1266350j3h = this.LLJI) != null) {
            c1266350j3h.LLJLIL(str);
        }
    }

    public final void LLLZI(String str) {
        if (this.LLLJL != null && !TextUtils.isEmpty(str)) {
            int iIndexOf = str.indexOf("stream-");
            int iIndexOf2 = str.indexOf("?");
            if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf2 > iIndexOf) {
                try {
                    String strSubstring = str.substring(iIndexOf, iIndexOf2);
                    String strSubstring2 = str.substring(iIndexOf + 7, iIndexOf2);
                    C1268750j7Z c1268750j7Z = this.LLLJL;
                    c1268750j7Z.LLILLJJLI = strSubstring;
                    c1268750j7Z.LLILLL = strSubstring2;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final void LLLZIL(boolean z) {
        C1269340j8W c1269340j8W = this.LLLL;
        if (c1269340j8W == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObjectPut = new JSONObject().put("report_version", 5).put("product_line", "live").put("timestamp", jCurrentTimeMillis).put("mode", "push").put("project_key", c1269340j8W.LIZJ);
            if (z) {
                this.LLJJIJIIJIL = jCurrentTimeMillis;
                jSONObjectPut.put("event_key", "live_core_start");
            } else {
                jSONObjectPut.put("event_key", "live_core_end");
                long j = this.LLJJIJIIJIL;
                if (j != 0) {
                    jSONObjectPut.put("push_duration", jCurrentTimeMillis - j);
                }
                if (this.LLJI != null) {
                    jSONObjectPut.put("create_encode_count", 0L);
                    jSONObjectPut.put("change_video_fps_count", 0);
                }
                LLLZL();
            }
            C1271010jBD c1271010jBD = c1269340j8W.LJLJI.LJJIIJZLJL;
            if (c1271010jBD != null) {
                c1271010jBD.LIZ("live_client_monitor_log", jSONObjectPut);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Create live core log error: ");
            sbLIZ.append(e.toString());
            AVLog.ioe("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LLLZLZ(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null && audioRecordingCallback != null) {
            c1266350j3h.LLLFZ(audioRecordingCallback);
        }
    }

    public final void LLZIL(boolean z) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLIZZ(z);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void k3(List<String> list) {
        LLLLIL(list, true, false);
    }

    @Override // X.InterfaceC1273910jFt
    public final void setSeiCurrentShiftDiffTime(long j) {
        if (this.LLJI != null) {
            C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS21S0100100_20(j, this, 0));
        }
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LIZJ(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startMediaPlayer streamID:");
        sbLIZ.append(str);
        sbLIZ.append(" offset:");
        sbLIZ.append(j);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LIZJ(j, str);
        }
        InterfaceC1269030j81 interfaceC1269030j81 = this.LLLFFI;
        if (interfaceC1269030j81 != null) {
            ((C1274850jHP) interfaceC1269030j81).LJIILIIL(40011, 0, str, Long.valueOf(j));
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIJ(Bundle bundle, C0UH1 c0uh1) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJLJLLL(bundle, c0uh1);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIIJ(boolean z, boolean z2) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJIIJ(z, true);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJIIZ(boolean z, boolean z2) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJIIZ(z, z2);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final int LJJIJIIJIL(String str, String str2) {
        return LJJIZ(str, true, true, str2, -1, null);
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LJJJI(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMediaPlayerDataSource streamID:");
        sbLIZ.append(str);
        sbLIZ.append(" videoPath:");
        sbLIZ.append(str2);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJJI(str, str2);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJJJI(EnumC775870Uc5 enumC775870Uc5, JSONObject jSONObject) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJJJI(enumC775870Uc5, jSONObject);
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJL(int i, int i2) {
        LLLLLZL(i, i2, 0);
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIJJIZ(Bundle bundle, C1152850g6d c1152850g6d) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJLIIIJJIZ(bundle, c1152850g6d);
        }
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LJJLIIIJLLLLLLLZ(String str, EnumC1269700j96 enumC1269700j96) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVideoPreviewMode streamID:");
        sbLIZ.append(str);
        sbLIZ.append(" previewMode:");
        sbLIZ.append(enumC1269700j96);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJLIIIJLLLLLLLZ(str, enumC1269700j96);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLJJL(int i, int i2) {
        AudioDeviceModule audioDeviceModule = this.LLILLL;
        if (audioDeviceModule != null) {
            audioDeviceModule.enableAudioNoiseDetection(i, i2);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJJIJIIJIL(int i, Object... objArr) {
        boolean z;
        InterfaceC1268640j7O interfaceC1268640j7O;
        boolean z2;
        C1266650j4B c1266650j4B;
        WeakReference<C1266350j3h> weakReference;
        String strValueOf = "";
        if (objArr.length > 0) {
            strValueOf = String.valueOf(objArr[0]);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i == 6) {
                        LLZILL(strValueOf, false);
                        return;
                    }
                    return;
                }
                LLZILL(strValueOf, true);
                return;
            }
            z = false;
        } else {
            z = true;
        }
        C1268760j7a c1268760j7a = this.LLJJ;
        if (c1268760j7a != null) {
            int iHashCode = hashCode();
            synchronized (c1268760j7a.LIZIZ) {
                try {
                    if (z) {
                        c1268760j7a.LIZIZ.add(Integer.valueOf(iHashCode));
                    } else {
                        c1268760j7a.LIZIZ.remove(Integer.valueOf(iHashCode));
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c1268760j7a.LIZ();
        }
        C1266350j3h c1266350j3h = this.LLJI;
        InterfaceC1268640j7O interfaceC1268640j7O2 = null;
        if ((c1266350j3h instanceof C1266350j3h) && (c1266650j4B = c1266350j3h.LLLLLLLZIL) != null && (weakReference = c1266650j4B.LIZ) != null && weakReference.get() != null) {
            c1266650j4B.LIZIZ.getClass();
        }
        C1269340j8W c1269340j8W = this.LLLL;
        if ((this.LLJI instanceof C1266350j3h) && c1269340j8W != null) {
            try {
                if (this.LLJJLIIIJLLLLLLLZ) {
                    this.LLLILZ.LIZ.mPushBase.getClass();
                } else {
                    JSONObject jSONObjectOptJSONObject = c1269340j8W.LJJ().optJSONObject("PushBase");
                    if (jSONObjectOptJSONObject != null && JSONObjectProtectorUtils.getBoolean(jSONObjectOptJSONObject, "enable_siti") && c1269340j8W.LIZ.mPushBase.LIZ.getInteractDisableSiti()) {
                        TEBundle tEBundle = new TEBundle();
                        if (!z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        tEBundle.setBool("enable_siti", z2);
                        tEBundle.setString("from", "siti");
                        this.LLJI.LJJLIIJ(tEBundle);
                        tEBundle.release();
                    }
                }
            } catch (Throwable th) {
            }
        }
        C1269340j8W c1269340j8W2 = this.LLLL;
        C1266350j3h c1266350j3h2 = this.LLJI;
        if (c1266350j3h2 != null) {
            interfaceC1268640j7O = c1266350j3h2.LLJLILLLLZIIL;
        } else {
            interfaceC1268640j7O = null;
        }
        if ((c1266350j3h2 instanceof C1266350j3h) && c1269340j8W2 != null && (interfaceC1268640j7O instanceof C1272090jCx)) {
            try {
                c1269340j8W2.LIZ.mPushBase.getClass();
            } catch (Throwable th2) {
            }
        }
        C1269340j8W c1269340j8W3 = this.LLLL;
        if (c1269340j8W3.LIZ.mPushBase.LJIIJJI()) {
            return;
        }
        C1266350j3h c1266350j3h3 = this.LLJI;
        if (c1266350j3h3 != null) {
            interfaceC1268640j7O2 = c1266350j3h3.LLJLILLLLZIIL;
        }
        if (!(c1266350j3h3 instanceof C1266350j3h) || !(interfaceC1268640j7O2 instanceof C1272090jCx)) {
            return;
        }
        try {
            JSONObject jSONObjectLJJJI = c1269340j8W3.LIZ.mPushBase.LJJJI();
            if (jSONObjectLJJJI == null || !jSONObjectLJJJI.optBoolean("interact_disable_video_denoise", true)) {
                return;
            }
            c1266350j3h3.getClass();
            ((C1272090jCx) interfaceC1268640j7O2).LLILIL(4, !z);
        } catch (Throwable th22) {
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLFFI(Cert cert, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCoreImpl.setAudioMute(");
        sbLIZ.append(z);
        sbLIZ.append(")");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1270290jA3.LIZIZ().LIZJ(EnumC1270240j9y.AUDIO_START, cert);
        C1269500j8m.LIZJ().LJ(1, strLIZIZ, cert);
        LLZIL(z);
        C1269500j8m.LIZJ().LIZLLL(1);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLII(int i, int i2) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLJL(i, i2);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLILI(String str, boolean z) {
        LLLZI(str);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLLLIL(str, z);
        }
        LLZLI();
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLL(String str, boolean z) {
        HashMap map = (HashMap) C1268890j7n.LIZ;
        Timer timer = (Timer) map.get("ReportNetworkQuality");
        if (timer != null) {
            timer.cancel();
            map.remove("ReportNetworkQuality");
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLLLL(str, false);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLLJIL(int i, Cert cert) {
        if (this.LLJJLIIIJLLLLLLLZ && this.LLLIZZ.get()) {
            return;
        }
        C1269500j8m.LIZJ().LJ(0, "LiveCoreImpl.switchVideoCapture", cert);
        LJJLIL(i);
        C1269500j8m.LIZJ().LIZLLL(0);
    }

    @Override // X.AbstractC1273900jFs
    public final int LLLLLLIL(int i, int i2) {
        C1268710j7V c1268710j7V;
        int i3;
        C1268710j7V c1268710j7V2 = this.LLLIIII;
        if (c1268710j7V2 == null) {
            if (this.LLLIIIIL == null) {
                return 2;
            }
        } else if (!c1268710j7V2.LIZIZ && (c1268710j7V = this.LLLIIIIL) != null && !c1268710j7V.LIZIZ) {
            return 3;
        }
        if (i > 0 && i2 > 0) {
            C1268710j7V c1268710j7V3 = this.LLLIIIIL;
            if (c1268710j7V3 != null && c1268710j7V3.LIZIZ) {
                if (i * i2 <= c1268710j7V3.LIZJ * c1268710j7V3.LIZLLL) {
                    InterfaceC1268950j7t interfaceC1268950j7t = c1268710j7V3.LJ;
                    if (interfaceC1268950j7t != null) {
                        interfaceC1268950j7t.LIZ();
                    }
                    i3 = 0;
                } else {
                    InterfaceC1268950j7t interfaceC1268950j7t2 = c1268710j7V3.LJ;
                    if (interfaceC1268950j7t2 != null) {
                        interfaceC1268950j7t2.onReset();
                    }
                    i3 = 1;
                }
            } else {
                i3 = -1;
            }
            C1268710j7V c1268710j7V4 = this.LLLIIII;
            if (c1268710j7V4 != null && c1268710j7V4.LIZIZ) {
                if (i * i2 <= c1268710j7V4.LIZJ * c1268710j7V4.LIZLLL) {
                    InterfaceC1268950j7t interfaceC1268950j7t3 = c1268710j7V4.LJ;
                    if (interfaceC1268950j7t3 != null) {
                        interfaceC1268950j7t3.LIZ();
                    }
                    return 0;
                }
                InterfaceC1268950j7t interfaceC1268950j7t4 = c1268710j7V4.LJ;
                if (interfaceC1268950j7t4 != null) {
                    interfaceC1268950j7t4.onReset();
                    return 1;
                }
                return 1;
            }
            return i3;
        }
        return 4;
    }

    @Override // X.AbstractC1273900jFs
    public final int LLLLLZIL(float f, C1271210jBX c1271210jBX) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            return c1266350j3h.LLLZZ(f, c1271210jBX);
        }
        return -1;
    }

    public final C1268710j7V LLLLZI(String str, JSONObject jSONObject) {
        C1268710j7V c1268710j7V = new C1268710j7V();
        c1268710j7V.LIZ = str;
        c1268710j7V.LIZIZ = jSONObject.optBoolean("isEnable", false);
        c1268710j7V.LIZJ = jSONObject.optInt("resolutionThreshold_w", 0);
        c1268710j7V.LIZLLL = jSONObject.optInt("resolutionThreshold_h", 0);
        if ("faceStrategy".equals(str)) {
            c1268710j7V.LJ = new InterfaceC1268950j7t() { // from class: X.0j7b
                @Override // X.InterfaceC1268950j7t
                public final void LIZ() {
                    if (C1268630j7N.LLLLZLLIL("FaceModelStrategy") != null) {
                        throw null;
                    }
                    this.LIZ.LLLLZIL("face_extra_model_name", "tt_face_extra_multiguest");
                    this.LIZ.LLLZ("face_extra_model_name");
                }

                @Override // X.InterfaceC1268950j7t
                public final void onReset() {
                    EffectModelStrategy effectModelStrategyLLLLZLLIL = C1268630j7N.LLLLZLLIL("FaceModelStrategy");
                    if (effectModelStrategyLLLLZLLIL != null) {
                        effectModelStrategyLLLLZLLIL.LIZJ();
                    } else {
                        this.LIZ.LLLLZIL("face_extra_model_name", "");
                        this.LIZ.LLLZ("face_extra_model_name");
                    }
                }
            };
        } else if ("mattingStrategy".equals(str)) {
            c1268710j7V.LJ = new InterfaceC1268950j7t() { // from class: X.0j7c
                @Override // X.InterfaceC1268950j7t
                public final void LIZ() {
                    if (C1268630j7N.LLLLZLLIL("MattingModelStrategy") != null) {
                        throw null;
                    }
                    this.LIZ.LLLLZIL("matting_model_name", "tt_matting_multiguest");
                    this.LIZ.LLLZ("matting_model_name");
                }

                @Override // X.InterfaceC1268950j7t
                public final void onReset() {
                    EffectModelStrategy effectModelStrategyLLLLZLLIL = C1268630j7N.LLLLZLLIL("MattingModelStrategy");
                    if (effectModelStrategyLLLLZLLIL != null) {
                        effectModelStrategyLLLLZLLIL.LIZJ();
                    } else {
                        this.LIZ.LLLLZIL("matting_model_name", "");
                        this.LIZ.LLLZ("matting_model_name");
                    }
                }
            };
            return c1268710j7V;
        }
        return c1268710j7V;
    }

    public final void LLLLZIL(String str, String str2) {
        InterfaceC1268640j7O interfaceC1268640j7O;
        C1269340j8W c1269340j8W = this.LLLL;
        if (c1269340j8W != null && c1269340j8W.LJLJJLL) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            C1266350j3h c1266350j3h = this.LLJI;
            if (c1266350j3h != null) {
                interfaceC1268640j7O = c1266350j3h.LLJLILLLLZIIL;
            } else {
                interfaceC1268640j7O = null;
            }
            if (interfaceC1268640j7O != null) {
                interfaceC1268640j7O.setRenderCacheString("GradedOptConfig", C786410Ut5.J3(jSONObject));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LLZILL(String str, boolean z) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h instanceof C1266350j3h) {
            if (!z) {
                c1266350j3h.LLILZLL.LIZ.mVPassInteractCfg.getClass();
            }
            c1266350j3h.getClass();
        }
        if (!z) {
            this.LLLL.LIZ.mVPassInteractCfg.getClass();
        }
    }

    public final void LLZLLIL(Object obj, String str) {
        InterfaceC1269030j81 interfaceC1269030j81 = this.LLLFFI;
        if (interfaceC1269030j81 != null) {
            ((C1274850jHP) interfaceC1269030j81).LJIILIIL(4, 0, str, obj);
        }
    }

    @Override // X.InterfaceC1274510jGr
    public final InterfaceC1274490jGp LJI(View view, Handler handler, boolean z) {
        if (!(view instanceof SurfaceView) && !(view instanceof TextureView)) {
            return null;
        }
        C1269180j8G c1269180j8GLIZ = C1269170j8F.LIZ(this.LLLL, z, this.LLLILZ.LIZJ, false);
        c1269180j8GLIZ.LJI = this.LLLL.LIZ.ttlhABSettingsConfigs.LJIILL().enable;
        C1268800j7e c1268800j7e = new C1268800j7e();
        c1268800j7e.LIZ = false;
        c1268800j7e.LIZIZ = this.LLLL.LIZ.LJIILLIIL();
        c1268800j7e.LIZJ = true;
        c1268800j7e.LIZLLL = true;
        c1268800j7e.LJ = LLJ();
        return new C1272880jEE(view, handler, false, z, c1269180j8GLIZ, c1268800j7e);
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJIIIIZZ(String str, String str2, int i) {
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS1S2101000_20(this, str, str2, i, 0));
        if (this.LLLFFI != null && str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && i == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, new JSONObject(str2));
                ((C1274850jHP) this.LLLFFI).LJIILIIL(3, 2, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("LiveCoreImpl", "send interact encrypt metadata failed", e);
            }
        }
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1274510jGr
    public final InterfaceC1274490jGp LJIIJ(View view, Handler handler, boolean z) {
        final C1268850j7j c1268850j7j;
        if (this.LLJJIJIL != null && (c1268850j7j = this.LLJLIL) != null) {
            if (view == null || view == this.LLLFF) {
                return new InterfaceC1274490jGp(c1268850j7j) { // from class: X.0jCM
                    public static final AtomicInteger LLILLJJLI = new AtomicInteger();
                    public static final AtomicInteger LLILLL = new AtomicInteger();
                    public final InterfaceC1268960j7u LL;

                    @Override // X.InterfaceC1274490jGp
                    public final /* synthetic */ boolean LJJLIIIIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final /* synthetic */ boolean LJLLLLLL() {
                        return false;
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final /* synthetic */ long getLatestRenderCostMs() {
                        return 0L;
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final void release() {
                    }

                    public final InterfaceC1274490jGp LIZ() {
                        InterfaceC1268960j7u interfaceC1268960j7u = this.LL;
                        if (interfaceC1268960j7u instanceof InterfaceC1274490jGp) {
                            return (InterfaceC1274490jGp) interfaceC1268960j7u;
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final void LJJIIJ() {
                        InterfaceC1274490jGp interfaceC1274490jGpLIZ = LIZ();
                        if (interfaceC1274490jGpLIZ != null) {
                            interfaceC1274490jGpLIZ.LJJIIJ();
                        }
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final Handler LJJLIIIJJI() {
                        InterfaceC1274490jGp interfaceC1274490jGpLIZ = LIZ();
                        if (interfaceC1274490jGpLIZ != null) {
                            return interfaceC1274490jGpLIZ.LJJLIIIJJI();
                        }
                        return null;
                    }

                    {
                        this.LL = c1268850j7j;
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final void LJLLJ(boolean z2) {
                        InterfaceC1274490jGp interfaceC1274490jGpLIZ = LIZ();
                        if (interfaceC1274490jGpLIZ != null) {
                            interfaceC1274490jGpLIZ.LJLLJ(false);
                        }
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final void setCornerRadius(float f) {
                        InterfaceC1274490jGp interfaceC1274490jGpLIZ = LIZ();
                        if (interfaceC1274490jGpLIZ != null) {
                            interfaceC1274490jGpLIZ.setCornerRadius(f);
                        }
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final void setEnable(boolean z2) {
                        this.LL.setEnable(z2);
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final int LLI(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, long j, RunnableC1275220jI0 runnableC1275220jI0, int i3, C1271970jCl c1271970jCl, Map map) {
                        return LLILLL(byteBufferArr, iArr, i, i2, i3, 0, j, runnableC1275220jI0, c1271970jCl, 0, map);
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final int LLIILZL(int i, boolean z2, int i2, int i3, int i4, float[] fArr, long j, C1274550jGv c1274550jGv, RunnableC1275220jI0 runnableC1275220jI0, Map map) {
                        return LJII(i, z2, i2, i3, i4, fArr, j, c1274550jGv, runnableC1275220jI0, 0, map);
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final int LJII(int i, boolean z2, int i2, int i3, int i4, float[] fArr, long j, C1274550jGv c1274550jGv, Runnable runnable, int i5, Map map) {
                        ARunnableS120S0100000_20 aRunnableS120S0100000_20;
                        Matrix matrixLIZJ;
                        EnumC1273550jFJ enumC1273550jFJ;
                        long jLongValue;
                        if (i2 > 0 && i3 > 0) {
                            if (c1274550jGv == null) {
                                aRunnableS120S0100000_20 = null;
                            } else {
                                c1274550jGv.retain();
                                aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1274550jGv, 8);
                            }
                            if (fArr == null) {
                                matrixLIZJ = new Matrix();
                            } else {
                                matrixLIZJ = C1273010jER.LIZJ(0, fArr);
                            }
                            if (z2) {
                                enumC1273550jFJ = EnumC1273550jFJ.OES;
                            } else {
                                enumC1273550jFJ = EnumC1273550jFJ.RGB;
                            }
                            Object obj = ((HashMap) map).get("lyrax_gl_sync");
                            if (obj instanceof Long) {
                                jLongValue = ((Long) obj).longValue();
                            } else {
                                jLongValue = 0;
                            }
                            k kVar = new k(i2, i3, enumC1273550jFJ, i, matrixLIZJ, aRunnableS120S0100000_20, jLongValue) { // from class: X.0jCL
                                public final long LIZ;

                                @Override // com.ss.ttlivestreamer.core.buffer.k, X.InterfaceC1271560jC6
                                public final boolean isFenceValid() {
                                    long j2 = this.LIZ;
                                    return j2 > 0 && GLES30.glIsSync(j2);
                                }

                                @Override // com.ss.ttlivestreamer.core.buffer.k, X.InterfaceC1271560jC6
                                public final void waitGlFence() {
                                    if (isFenceValid()) {
                                        GLES30.glWaitSync(this.LIZ, 0, -1L);
                                        try {
                                            GLES20.glGetError();
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            GlUtil.clearAllGLError();
                                        }
                                    }
                                }

                                @Override // com.ss.ttlivestreamer.core.buffer.k, X.InterfaceC1271560jC6
                                public final long getFence() {
                                    return this.LIZ;
                                }

                                {
                                    this.LIZ = jLongValue;
                                }
                            };
                            LLILLL.incrementAndGet();
                            kVar.setRenderType(i5);
                            if (fArr != null) {
                                kVar.setTransformMatrixArray(fArr);
                            }
                            this.LL.LIZ(new VideoFrame(kVar, i4, 1000 * j));
                            kVar.release();
                            runnable.run();
                            return 0;
                        }
                        return -1;
                    }

                    @Override // X.InterfaceC1274490jGp
                    public final int LLILLL(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, int i4, long j, Runnable runnable, C1271970jCl c1271970jCl, int i5, Map map) {
                        C1271900jCe c1271900jCeLJ;
                        if (byteBufferArr != null && i > 0 && i2 > 0) {
                            com.ss.bytertc.engine.video.VideoFrame videoFrame = c1271970jCl.LIZ;
                            if (videoFrame != null) {
                                videoFrame.retain();
                            }
                            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1271970jCl, 9);
                            try {
                            } catch (IllegalArgumentException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (byteBufferArr.length == 1) {
                                ByteBuffer byteBuffer = byteBufferArr[0];
                                if (byteBuffer == null) {
                                    aRunnableS120S0100000_20.run();
                                    return -1;
                                }
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
                                c1271900jCeLJ = C1271900jCe.LJ(byteBufferSlice, i, byteBufferSlice2, i2, byteBuffer.slice(), i, i6, i6, i3, aRunnableS120S0100000_20);
                            } else {
                                if (byteBufferArr.length >= 3 && iArr != null && iArr.length >= 3) {
                                    ByteBuffer byteBuffer2 = byteBufferArr[0];
                                    int i10 = iArr[0];
                                    c1271900jCeLJ = C1271900jCe.LJ(byteBuffer2, i, byteBufferArr[1], i2, byteBufferArr[2], i10, iArr[1], iArr[2], i3, aRunnableS120S0100000_20);
                                }
                                aRunnableS120S0100000_20.run();
                                return -1;
                            }
                            if (c1271900jCeLJ != null) {
                                LLILLJJLI.incrementAndGet();
                                c1271900jCeLJ.LJIILLIIL = i4;
                                c1271900jCeLJ.setRenderType(i5);
                                this.LL.LIZ(new VideoFrame(c1271900jCeLJ, 0, 1000 * j));
                                c1271900jCeLJ.release();
                                runnable.run();
                                return 0;
                            }
                            return -1;
                        }
                        return -1;
                    }
                };
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLIIIIJ(int i, int i2, int i3) {
        boolean zLIZ;
        AndroidRuntimeException androidRuntimeException;
        C1268670j7R c1268670j7R = this.LLJILLL;
        if (c1268670j7R != null) {
            try {
                c1268670j7R.LIZLLL(i, i2, i3);
            } finally {
                if (zLIZ) {
                }
            }
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final void LJJLJLI(InterfaceC1272460jDY interfaceC1272460jDY, int i, Cert cert) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerScreenAudioPlayBack, flag: ");
        sbLIZ.append(i);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS13S0301000_20(i, interfaceC1272460jDY, cert, this, 1));
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final void LJJZZIII(String str, EnumC1269640j90 enumC1269640j90, C947150akr c947150akr) {
        InterfaceC1269030j81 interfaceC1269030j81;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createMediaPlayer streamID:");
        sbLIZ.append(str);
        sbLIZ.append(" mediaPlayerMode:");
        sbLIZ.append(enumC1269640j90);
        AVLog.logKibana(4, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJJZZIII(str, enumC1269640j90, c947150akr);
        }
        if (enumC1269640j90 == EnumC1269640j90.LOCAL_RENDER_AND_REMOTE_MIX && (interfaceC1269030j81 = this.LLLFFI) != null) {
            ((C1274850jHP) interfaceC1269030j81).LJIILIIL(40009, 0, str);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LJLIIIL(Bundle bundle, C777170UeB c777170UeB, InterfaceC1270140j9o interfaceC1270140j9o) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJLL(bundle, c777170UeB, interfaceC1270140j9o);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJJIJIL(int i, int i2, int i3) {
        C1268670j7R c1268670j7R = this.LLJILLL;
        if (c1268670j7R != null) {
            c1268670j7R.LIZLLL(i, i2, i3);
        }
    }

    @Override // X.AbstractC1273900jFs
    public final void LLLLIL(List<String> list, boolean z, boolean z2) {
        if (list != null && list.size() > 0) {
            LLLZI((String) ListProtector.get(list, 0));
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLLL(list, z, z2);
        }
        LLZLI();
    }

    public final void LLLLLZL(int i, int i2, int i3) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h != null) {
            c1266350j3h.LJLI(i, i2, i3);
        }
    }

    public final void LLLZZIL(int i, int i2, Exception exc) {
        boolean zLIZ;
        AndroidRuntimeException androidRuntimeException;
        InterfaceC775290Ub9 interfaceC775290Ub9 = this.LLJILJILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportLiveCoreError: code1 ");
        sbLIZ.append(i);
        sbLIZ.append(" code2:");
        sbLIZ.append(i2);
        sbLIZ.append(" listener：");
        sbLIZ.append(interfaceC775290Ub9);
        AVLog.logKibana(6, "LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ), exc);
        if (interfaceC775290Ub9 != null) {
            try {
                interfaceC775290Ub9.V3(i, i2, exc);
            } finally {
                if (zLIZ) {
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.Observer
    public final void onADMInfo(int i, int i2, long j) {
        Handler handler;
        if (i == 5) {
            C1266350j3h c1266350j3h = this.LLJI;
            if (c1266350j3h != null) {
                if ((!C1268530j7D.LIZ() && c1266350j3h.LLJJIJIIJIL == null) || (handler = c1266350j3h.LLILLJJLI) == null) {
                    return;
                }
                C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(c1266350j3h, i2, 30));
                return;
            }
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 7) {
                            if (i != 100) {
                                if (i != 10) {
                                    if (i == 11) {
                                        LJJLIIIIJ(36, i2, (int) j);
                                        return;
                                    }
                                    return;
                                }
                                LJJLIIIIJ(31, i2, (int) j);
                                return;
                            }
                            LJJLIIIIJ(46, i2, (int) j);
                            return;
                        }
                        LJJLIIIIJ(26, i2, 0);
                        return;
                    }
                    LJJLIIIIJ(24, i2, 0);
                    return;
                }
                LJJLIIIIJ(23, i2, 0);
                return;
            }
            LJJLIIIIJ(32, i2, (int) j);
            return;
        }
        LJJLIIIIJ(33, i2, (int) j);
    }

    @Override // X.InterfaceC1267860j68
    public final void LLILLIZIL(Buffer buffer, int i, int i2, int i3, long j) {
        ArrayList arrayList;
        if (this.LLJL) {
            C589900NBs<InterfaceC1267860j68> c589900NBs = this.LLJJL;
            if (c589900NBs != null) {
                Iterator it2 = ((ArrayList) c589900NBs.LIZ()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1267860j68) it2.next()).LLILLIZIL(buffer, i, i2, i3, j);
                }
                return;
            }
            return;
        }
        synchronized (this.LLJJJJJIL) {
            try {
                arrayList = new ArrayList(this.LLJJJIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC1267860j68) it3.next()).LLILLIZIL(buffer, i, i2, i3, j);
        }
    }

    @Override // X.InterfaceC1268830j7h
    public final void q0(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr) {
        ArrayList<C0UHD> arrayList;
        if (this.LLJL) {
            C589900NBs<C0UHD> c589900NBs = this.LLJJJJLIIL;
            if (c589900NBs != null) {
                for (C0UHD c0uhd : (ArrayList) c589900NBs.LIZ()) {
                    if (c0uhd instanceof InterfaceC1268830j7h) {
                        ((InterfaceC1268830j7h) c0uhd).q0(byteBuffer, i, i2, j, objArr);
                    }
                }
                return;
            }
            return;
        }
        synchronized (this.LLJJJJ) {
            try {
                arrayList = new ArrayList(this.LLJJJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (C0UHD c0uhd2 : arrayList) {
            if (c0uhd2 instanceof InterfaceC1268830j7h) {
                ((InterfaceC1268830j7h) c0uhd2).q0(byteBuffer, i, i2, j, objArr);
            }
        }
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final int LJJIZ(String str, boolean z, boolean z2, String str2, int i, Object obj) {
        return LJJJLL(str, obj, i, z, z2, 0, str2);
    }

    @Override // X.AbstractC1273900jFs
    public final int LJJJJLI(String str, Object obj, int i, boolean z, boolean z2, String str2) {
        InterfaceC1269030j81 interfaceC1269030j81 = this.LLLFFI;
        if (interfaceC1269030j81 != null) {
            ((C1274850jHP) interfaceC1269030j81).LJIILIIL(40007, 0, new Object[0]);
        }
        return LJJJLL(str, obj, i, z, z2, 0, str2);
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final int LJJJJZI(String str, boolean z, boolean z2, String str2, int i, Object obj) {
        return LJJJJLI(str, obj, i, z, z2, str2);
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJIIJJI(long j, int i, int i2, int i3, float[] fArr, int i4, boolean z) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return 0;
        }
        return c1266350j3h.LJIIJJI(j, i, i2, i3, fArr, i4, z);
    }

    @Override // X.AbstractC1273900jFs, X.InterfaceC1273910jFt
    public final int LJJJLL(String str, Object obj, int i, boolean z, boolean z2, int i2, String str2) {
        int iLIZ;
        if (C1274040jG6.LIZ() && str2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dfId must not be null, key:");
            sbLIZ.append(str);
            sbLIZ.append(" value:");
            sbLIZ.append(obj);
            throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1271430jBt c1271430jBt = this.LLLIIIL;
        if (c1271430jBt != null && (iLIZ = c1271430jBt.LIZ(obj, str, str2)) != 0) {
            if (!C1274040jG6.LIZ()) {
                return iLIZ;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pls check sei dfId, key:");
            sbLIZ2.append(str);
            sbLIZ2.append(" value:");
            sbLIZ2.append(obj);
            sbLIZ2.append(" dfId:");
            sbLIZ2.append(str2);
            throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (obj != null && i2 == 0) {
            LLZLLIL(obj, str);
        }
        if (str != null && !str.isEmpty() && obj != null && i2 == 1 && this.LLLFFI != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                ((C1274850jHP) this.LLLFFI).LJIILIIL(3, 3, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("LiveCoreImpl", "send interact encrypt sei failed", e);
            }
        }
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return 0;
        }
        return c1266350j3h.LJJJLL(str, obj, i, z, z2, i2, str2);
    }

    @Override // X.AbstractC1273900jFs
    public final void LLJJJJ(final int i, final String str, int i2, int i3, int i4, long j, final ByteBuffer byteBuffer) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jDw
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1272730jDz interfaceC1272730jDz;
                    String strNativeParseStringFromByteBuffer;
                    C1268630j7N c1268630j7N = this.LL;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    int i5 = i;
                    String str2 = str;
                    c1268630j7N.getClass();
                    C1C7U.LIZ("LiveCoreImpl@e164.pushRtcSeiData$1L");
                    C1266350j3h c1266350j3h = c1268630j7N.LLJI;
                    if (c1266350j3h == null) {
                        C1C7U.LIZIZ("LiveCoreImpl@e164.pushRtcSeiData$1L");
                        return;
                    }
                    C1269340j8W c1269340j8W = c1268630j7N.LLLL;
                    InterfaceC1268640j7O interfaceC1268640j7O = c1266350j3h.LLJLILLLLZIIL;
                    if (interfaceC1268640j7O != null && interfaceC1268640j7O.LJJJZ() && byteBuffer2 != null && C1272780jE4.LIZ(byteBuffer2)) {
                        c1269340j8W.getClass();
                        C1271430jBt c1271430jBt = c1268630j7N.LLLIIIL;
                        if (c1271430jBt != null && c1271430jBt.LIZ(byteBuffer2, null, "1610612746") == 0) {
                            c1266350j3h.LJJIZ(null, false, false, "1610612746", 1, byteBuffer2);
                        }
                        int iRemaining = byteBuffer2.remaining();
                        byte[] bArr = new byte[iRemaining];
                        byteBuffer2.get(bArr);
                        byteBuffer2.position(0);
                        if (iRemaining >= 4) {
                            byte[] bArr2 = new byte[4];
                            int i6 = 0;
                            do {
                                bArr2[i6] = bArr[i6];
                                i6++;
                            } while (i6 < 4);
                            String str3 = new String(bArr2);
                            if (str3.equals("APDT") || str3.equals("MATN")) {
                                int i7 = iRemaining - 4;
                                byte[] bArr3 = new byte[i7];
                                for (int i8 = 0; i8 < i7; i8++) {
                                    bArr3[i8] = bArr[i8 + 4];
                                }
                                byte[] bArrLIZIZ = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                                try {
                                    bArrLIZIZ = C1272780jE4.LIZIZ(bArr3);
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                } catch (DataFormatException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(bArrLIZIZ.length).order(ByteOrder.nativeOrder());
                                byteBufferOrder.put(bArrLIZIZ);
                                byteBufferOrder.flip();
                                C1272710jDx c1272710jDx = new C1272710jDx();
                                if ((byteBufferOrder.get() & 255) == 1) {
                                    byteBufferOrder.getShort();
                                    byteBufferOrder.getShort();
                                    short s = 65535;
                                    int i9 = byteBufferOrder.getShort() & 65535;
                                    String strLIZIZ = "";
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        char c = (char) byteBufferOrder.get();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(strLIZIZ);
                                        sbLIZ.append(c);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                    int i11 = byteBufferOrder.get() & 255;
                                    int i12 = byteBufferOrder.getShort() & 65535;
                                    if (i12 == 4 && (i11 == 0 || i11 == 1)) {
                                        byteBufferOrder.getShort();
                                        byteBufferOrder.getShort();
                                    } else {
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            byteBufferOrder.get();
                                        }
                                    }
                                    int i14 = byteBufferOrder.get() & 255;
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        int i16 = byteBufferOrder.getShort() & s;
                                        C1272720jDy c1272720jDy = new C1272720jDy();
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if (i17 == 0) {
                                                byteBufferOrder.getShort();
                                                byteBufferOrder.getShort();
                                            } else {
                                                byteBufferOrder.getShort();
                                                byteBufferOrder.getShort();
                                            }
                                            ((ArrayList) c1272720jDy.LIZ).add(new Object() { // from class: X.0jE0
                                            });
                                        }
                                        ((ArrayList) c1272710jDx.LIZ).add(c1272720jDy);
                                        i15++;
                                        s = 65535;
                                    }
                                }
                            }
                        }
                        interfaceC1268640j7O.LJJIFFI();
                    }
                    if (c1269340j8W != null && i5 == 9999) {
                        C1271430jBt c1271430jBt2 = c1268630j7N.LLLIIIL;
                        if (c1271430jBt2 != null && c1271430jBt2.LIZ(byteBuffer2, null, "1610612746") == 0) {
                            c1266350j3h.LJJIZ(null, false, false, "1610612746", 1, byteBuffer2);
                        }
                    } else if (i5 != 9999 && (interfaceC1272730jDz = c1268630j7N.LLJILJIL) != null && byteBuffer2 != null && (strNativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(0, byteBuffer2)) != null) {
                        interfaceC1272730jDz.LIZ(str2, strNativeParseStringFromByteBuffer);
                        if (C1267520j5a.LIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Receive SEI ");
                            sbLIZ2.append(strNativeParseStringFromByteBuffer);
                            sbLIZ2.append(" on RTC");
                            AVLog.w("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    C1C7U.LIZIZ("LiveCoreImpl@e164.pushRtcSeiData$1L");
                }
            });
        }
    }

    @Override // X.InterfaceC1273910jFt
    public final int LJJJJ(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        C1266350j3h c1266350j3h = this.LLJI;
        if (c1266350j3h == null) {
            return 0;
        }
        return c1266350j3h.LJJJJ(i, z, i2, i3, i4, fArr, j, bundle);
    }

    @Override // X.C0UHD
    public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        ArrayList<C0UHD> arrayList;
        if (this.LLJL) {
            C589900NBs<C0UHD> c589900NBs = this.LLJJJJLIIL;
            if (c589900NBs != null) {
                Iterator it2 = ((ArrayList) c589900NBs.LIZ()).iterator();
                while (it2.hasNext()) {
                    ((C0UHD) it2.next()).LLLLZLL(eGLContext, i, z, interfaceC1272490jDb, i2, i3, j, fArr, j2, objArr);
                }
            }
        } else {
            synchronized (this.LLJJJJ) {
                try {
                    arrayList = new ArrayList(this.LLJJJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            for (C0UHD c0uhd : arrayList) {
                if (c0uhd != null) {
                    c0uhd.LLLLZLL(eGLContext, i, z, interfaceC1272490jDb, i2, i3, j, fArr, j2, objArr);
                }
            }
        }
        LLD();
    }
}
