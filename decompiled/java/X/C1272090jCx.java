package X;

import Y.ARunnableS0S0100005_20;
import Y.ARunnableS0S0101002_20;
import Y.ARunnableS0S0102104_20;
import Y.ARunnableS0S0130000_20;
import Y.ARunnableS0S1401000_20;
import Y.ARunnableS0S3100001_20;
import Y.ARunnableS0S3322000_20;
import Y.ARunnableS10S2100000_20;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS13S0301000_20;
import Y.ARunnableS1S1102000_20;
import Y.ARunnableS1S1301000_20;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS28S0400000_20;
import Y.ARunnableS2S1101000_13;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS3S0111000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS5S1110000_20;
import Y.ARunnableS5S1201000_20;
import Y.ARunnableS5S2200000_20;
import Y.ARunnableS7S0100002_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.OrientationEventListener;
import android.view.Surface;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.effect.NativeAudioStrange;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.VideoProcessor;
import com.ss.ttlivestreamer.core.opengl.GLTexture;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272090jCx extends VideoProcessor implements InterfaceC1268640j7O, InterfaceC1267860j68, InterfaceC1268620j7M, InterfaceC1271470jBx {
    public static final /* synthetic */ int d = 0;
    public final C1271230jBZ LL;
    public final C1271230jBZ LLILLJJLI;
    public final C1271230jBZ LLILLL;
    public GLThread LLILZIL;
    public Handler LLILZLL;
    public AudioDeviceModule LLIZLLLIL;
    public RunnableC1271220jBY LLJ;
    public C1267810j63 LLJI;
    public k LLJIJIL;
    public k LLJILJIL;
    public GlRenderDrawer LLJILJILJ;
    public RunnableC1271220jBY LLJILLL;
    public RunnableC1271220jBY LLJJ;
    public YuvConverter LLJJI;
    public GLThread LLJJIII;
    public Handler LLJJIJI;
    public InterfaceC1272120jD0 LLJJIJIIJIL;
    public C1273620jFQ LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public InterfaceC1268820j7g LLJLLIL;
    public C1272280jDG LLJLLL;
    public InterfaceC1272600jDm LLJZ;
    public InterfaceC1272580jDk LLJZIJLIL;
    public int[] LLL;
    public int LLLF;
    public int LLLFF;
    public AbstractC1272690jDv LLLI;
    public AbstractC1272680jDu LLLII;
    public C1271450jBv LLLIIII;
    public C1271450jBv LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public long LLLIILIL;
    public boolean LLLIL;
    public InterfaceC1267390j5N LLLILZ;
    public InterfaceC1270140j9o LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public final boolean LLLLIIL;
    public ARunnableS113S0100000_13 LLLLIILLL;
    public C1266910j4b LLLLIL;
    public C0UHF LLLLL;
    public int LLLLLJIL;
    public C1266390j3l LLLLLL;
    public final C1273370jF1 LLLLLLIL;
    public boolean LLLLLZL;
    public int LLLLZIL;
    public C1267620j5k LLLLZLL;
    public final C1267500j5Y LLLLZLLLI;
    public C1271420jBs LLLZ;
    public InterfaceC1272420jDU LLLZIIL;
    public InterfaceC1272570jDj LLLZZ;
    public InterfaceC1272820jE8 LLZILL;
    public C1271790jCT LLZL;
    public C1271780jCS LLZLI;
    public final C1269300j8S LLZLL;
    public final C1269940j9U LLZLLIL;
    public final C1269850j9L a;
    public boolean b;
    public final Object LLIZ = new Object();
    public boolean LLJJJIL = false;
    public long LLJJJJ = 0;
    public int LLJJJJJIL = 0;
    public int LLJJJJLIIL = 0;
    public boolean LLJL = false;
    public final C2315961Fl4[] LLLFFI = new C2315961Fl4[2];
    public final Map<String, String> LLLFZ = new HashMap();
    public final Map<C0UD1, C1272170jD5> LLLJIL = new HashMap();
    public final Map<InterfaceC1269100j88, C1272520jDe> LLLJL = new HashMap();
    public int LLLL = 0;
    public int LLLLII = 0;
    public boolean LLLLIIIILLL = false;
    public boolean LLLLIILL = false;
    public final List<C1269610j8x> LLLLILI = new LinkedList();
    public boolean LLLLJ = false;
    public final CopyOnWriteArrayList<WeakReference<InterfaceC1272550jDh>> LLLLJI = new CopyOnWriteArrayList<>();
    public String LLLLLIL = "";
    public final Map<EnumC1272790jE5, C1272530jDf> LLLLLILLIL = new LinkedHashMap();
    public final C1272370jDP LLLLLJLJLL = new C1272370jDP(this);
    public final float LLLLLLJ = 1.0f;
    public boolean LLLLLLL = false;
    public InterfaceC1269690j95 LLLLLLLLL = null;
    public boolean LLLLLLLLLL = false;
    public boolean LLLLLLLZIL = true;
    public final int LLLLLLZ = 1;
    public final int LLLLLLZZ = 2;
    public int LLLLLZ = -1;
    public int LLLLLZIL = 0;
    public boolean LLLLZ = false;
    public boolean LLLLZI = false;
    public int LLLLZLLIL = 0;
    public int LLLZI = 0;
    public final AtomicReference<TTLHAbnormalDetectorJava> LLLZIL = new AtomicReference<>(null);
    public boolean LLLZL = false;
    public final C1271580jC8 LLLZLL = new C1271580jC8();
    public final C1272480jDa LLLZLZ = new C1272480jDa();
    public boolean LLLZZIL = false;
    public int LLZ = 0;
    public int LLZIL = 0;
    public PushBase.HardwareRoi LLZLLLL = new PushBase.HardwareRoi();
    public boolean LLZZ = false;
    public boolean LLZZJLIL = false;
    public EnumC1272290jDH LLZZLLIL = EnumC1272290jDH.ROI_SWITCH_REASON_DEFAULT;
    public int LLZZZIL = -9;
    public int LLZZZZ = -9;
    public Matrix c = null;
    public final int LLILZ = 1;

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ C1272130jD1 LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIFFI() {
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIII() {
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLJLJ() {
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLLI() {
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJZL() {
    }

    @Override // X.InterfaceC1268640j7O
    public final int pauseEffect() {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS25S1100000_20(this, LLJJI(new Object[0]), 15));
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        Handler handler;
        if (this.LLJLIL) {
            return;
        }
        this.LLLLZLLLI.LIZ.ttlhABSettingsConfigs.getClass();
        if (TTLHABSettingsConfigs.LJI.getEnableMemoryLeakOpt()) {
            this.LLLLL = null;
            this.LLLLIL = null;
            this.LLLZ = null;
            this.LLLZIIL = null;
        }
        if (this.LLLLLLLLLL) {
            enableFindContour(false, null);
        }
        if (((HashMap) this.LLLJIL).size() > 0) {
            Iterator it2 = ((HashMap) this.LLLJIL).entrySet().iterator();
            while (it2.hasNext()) {
                C1272170jD5 c1272170jD5 = (C1272170jD5) ((Map.Entry) it2.next()).getValue();
                if (c1272170jD5 != null) {
                    c1272170jD5.LJFF();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("release effect track ");
                    sbLIZ.append(c1272170jD5.toString());
                    AVLog.ioe("FilterManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        ((HashMap) this.LLLJIL).clear();
        if (((HashMap) this.LLLJL).size() > 0) {
            Iterator it3 = ((HashMap) this.LLLJL).entrySet().iterator();
            while (it3.hasNext()) {
                C1272520jDe c1272520jDe = (C1272520jDe) ((Map.Entry) it3.next()).getValue();
                if (c1272520jDe != null) {
                    C1273830jFl c1273830jFl = c1272520jDe.LIZ;
                    c1272520jDe.LIZ = null;
                    if (c1273830jFl != null) {
                        c1273830jFl.release();
                    }
                }
            }
        }
        ((HashMap) this.LLLJL).clear();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Release filterManager ");
        sbLIZ2.append(this);
        AVLog.ioi("FilterManager", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLJLIL = true;
        YuvConverter yuvConverter = this.LLJJI;
        this.LLJJI = null;
        if (yuvConverter != null && ((handler = this.LLJJIJI) == null || this.LLJJIII == null || !C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(yuvConverter, 183)))) {
            AVLog.ioe("FilterManager", "YuvConverter mem leak!");
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("YuvConverter mem leak!");
            C1274080jGA.LIZ.LIZ("FilterManager.release", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        GLThread gLThread = this.LLJJIII;
        if (gLThread != null) {
            C1273730jFb.LIZLLL(gLThread);
            this.LLJJIII = null;
        }
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS120S0100000_20(this, 167));
        GLThread gLThread2 = this.LLILZIL;
        if (gLThread2 != null) {
            C1273730jFb.LIZLLL(gLThread2);
            this.LLILZIL = null;
        } else {
            C1283100jUi.LIZIZ(this.LLILZLL, new ARunnableS120S0100000_20(this, 169));
        }
        C1272280jDG c1272280jDG = this.LLJLLL;
        if (c1272280jDG != null) {
            c1272280jDG.disable();
            this.LLJLLL = null;
        }
        InterfaceC1268820j7g interfaceC1268820j7g = this.LLJLLIL;
        if (interfaceC1268820j7g != null) {
            interfaceC1268820j7g.release();
            this.LLJLLIL = null;
        }
        if (this.LLLLLLLLL != null) {
            this.LLLLLLLLL = null;
        }
        if (this.LLIZLLLIL != null) {
            this.LLIZLLLIL = null;
        }
        C1271230jBZ c1271230jBZ = this.LL;
        if (c1271230jBZ != null) {
            ((ConcurrentHashMap) c1271230jBZ.LIZJ).clear();
        }
        super.release();
    }

    @Override // X.InterfaceC1268640j7O
    public final int resumeEffect() {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS25S1100000_20(this, LLJJI(new Object[0]), 16));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJIJI() {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS25S1100000_20(this, 17));
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean LJJLI() {
        return this.LLLZI == 5;
    }

    @Override // X.InterfaceC1268640j7O
    public final int LJLI() {
        C1271230jBZ c1271230jBZ = this.LL;
        if (c1271230jBZ != null && c1271230jBZ.LJI) {
            return c1271230jBZ.LJFF.getAndSet(0);
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int LJLJL() {
        C1271230jBZ c1271230jBZ = this.LL;
        if (c1271230jBZ != null && c1271230jBZ.LJI) {
            return c1271230jBZ.LJFF.get();
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final String LJLLL() {
        String[] strArr = {""};
        C1283100jUi.LIZIZ(this.LLILZLL, new ARunnableS89S0200000_20(this, strArr, 106));
        return strArr[0];
    }

    @Override // X.InterfaceC1268640j7O
    public final String LLFII() {
        String[] strArr = {""};
        C1283100jUi.LIZIZ(this.LLILZLL, new ARunnableS89S0200000_20(this, strArr, 105));
        return strArr[0];
    }

    @Override // X.InterfaceC1268640j7O
    public final JSONObject LLIIII() {
        AbstractC1272680jDu abstractC1272680jDu = this.LLLII;
        if (abstractC1272680jDu != null) {
            return abstractC1272680jDu.getBMFColorCorrectionSetting();
        }
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final int LLIIIL() {
        return this.LLLZZIL ? 1 : 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final float LLIIZ() {
        C1267620j5k c1267620j5k = this.LLLLZLL;
        if (c1267620j5k != null) {
            return c1267620j5k.LJFF;
        }
        return 1.0f;
    }

    public final boolean LLJ() {
        PushBase.HardwareRoi hardwareRoi;
        return this.LLZZ && (hardwareRoi = this.LLZLLLL) != null && hardwareRoi.enable && this.LLZZJLIL;
    }

    public final boolean LLJJIJIIJIL() {
        this.LLLLZLLLI.LIZ.ttlhABSettingsConfigs.getClass();
        return this.LLLLZLLLI.LIZ.enableNewVideoBufferPool && !TTLHABSettingsConfigs.LJFF.getVideoFramePoolConfig().getEnable() && (this.LLLLZLLLI.LIZ.mPushBase.LJIILIIL() && this.LLLLZLLLI.LIZ.mPushBase.LJIJJLI());
    }

    @Override // X.InterfaceC1268640j7O
    public final C0UD1 createEffectTrack() {
        Handler handler;
        if (!this.LLLLIIIILLL || (handler = this.LLILZLL) == null) {
            return null;
        }
        C1272170jD5[] c1272170jD5Arr = new C1272170jD5[1];
        C1283100jUi.LIZIZ(handler, new ARunnableS89S0200000_20(c1272170jD5Arr, this, 121));
        return c1272170jD5Arr[0];
    }

    public final JSONObject getStatus() {
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC1272690jDv abstractC1272690jDv = this.LLLI;
            if (abstractC1272690jDv != null) {
                JSONObject status = abstractC1272690jDv.getStatus();
                status.put("setting", 1);
                jSONObject.put("video_denoise", status);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("setting", 0);
                jSONObject.put("video_denoise", jSONObject2);
            }
            AbstractC1272680jDu abstractC1272680jDu = this.LLLII;
            if (abstractC1272680jDu != null) {
                JSONObject status2 = abstractC1272680jDu.getStatus();
                status2.put("setting", 2);
                jSONObject.put("video_streamhd", status2);
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("setting", 0);
                jSONObject.put("video_streamhd", jSONObject3);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean isValid() {
        InterfaceC1272120jD0 interfaceC1272120jD0 = this.LLJJIJIIJIL;
        return interfaceC1272120jD0 != null && interfaceC1272120jD0.valid();
    }

    @Override // X.InterfaceC1268640j7O
    public final void prepareEffect() {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS120S0100000_20(this, 168));
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ani");
        sbLIZ.append("moji");
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            LoadSoLancet.LIZJ("effect");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("effect");
            LoadSoLancet.LJ(jUptimeMillis, "effect");
            LoadSoLancet.LIZLLL(jUptimeMillis, "effect");
            LoadSoLancet.LIZIZ("effect");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int LJJLJLI() {
        if (LLJ()) {
            return this.LLZZLLIL.getValue();
        }
        this.LLZZLLIL.getValue();
        PushBase.HardwareRoi hardwareRoi = this.LLZLLLL;
        return -((hardwareRoi == null || !hardwareRoi.enable) ? EnumC1272290jDH.ROI_SWITCH_REASON_SERVER_CONFIG.getValue() : !this.LLZZ ? EnumC1272290jDH.ROI_SWITCH_REASON_HARDWARE_SUPPORT.getValue() : EnumC1272290jDH.ROI_SWITCH_REASON_SCENE_AVAILABLE.getValue());
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean LJLJJLL() {
        if (isValid()) {
            return this.LLJJIJIIJIL.isEffectGpuTurboEnable();
        }
        return false;
    }

    @Override // X.InterfaceC1268640j7O
    public final double LJZ() {
        C1266910j4b c1266910j4b;
        if (!isValid() || (c1266910j4b = this.LLLLIL) == null) {
            return 0.0d;
        }
        return c1266910j4b.LIZ.LLIILZL();
    }

    @Override // X.InterfaceC1268640j7O
    public final String LLFZ() {
        if (isValid()) {
            return this.LLJJIJIIJIL.getFrameProgressParams(128);
        }
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean LLIIIJ() {
        return LLJ();
    }

    @Override // X.InterfaceC1268640j7O
    public final double LLIIJI() {
        C1266910j4b c1266910j4b;
        C1273620jFQ c1273620jFQ;
        if (!isValid() || (c1266910j4b = this.LLLLIL) == null || (c1273620jFQ = c1266910j4b.LIZ.LLJLL) == null) {
            return 0.0d;
        }
        return c1273620jFQ.LIZ();
    }

    @Override // X.InterfaceC1268640j7O
    public final int LJJJJIZL() {
        return this.LLLLZLLIL;
    }

    @Override // X.InterfaceC1268640j7O
    public final InterfaceC1272120jD0 LJJJLL() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean LJJJZ() {
        return this.LLLLLLLLLL;
    }

    @Override // X.InterfaceC1268640j7O
    public final Map<String, String> LJLZ() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean LLILLJJLI() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean isEnable() {
        return this.LLJJJ;
    }

    public static final String LLJJI(Object... objArr) {
        String str;
        if (!C1267520j5a.LIZ()) {
            return "";
        }
        String strLIZIZ = e3.h;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(ThreadMethodProxy.getStackTrace(C786410Ut5.u3())[3].getMethodName());
            sbLIZ.append(e3.h);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        for (int i = 0; i < objArr.length; i++) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(objArr[i]);
            if (i == objArr.length - 1) {
                str = "";
            } else {
                str = ", ";
            }
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(")");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static void LLJJJ(C1271230jBZ c1271230jBZ) {
        if (c1271230jBZ != null && ((ArrayList) c1271230jBZ.LIZIZ).size() > 0) {
            RunnableC1271220jBY runnableC1271220jBY = (RunnableC1271220jBY) ListProtector.remove(c1271230jBZ.LIZIZ, 0);
            while (runnableC1271220jBY != null) {
                if (runnableC1271220jBY.LLILLL.get() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Texture buffer(");
                    sbLIZ.append(runnableC1271220jBY.toString());
                    sbLIZ.append(") not release");
                    AVLog.e("FilterManager", C2188811AlT.LIZIZ(sbLIZ));
                }
                C1271390jBp c1271390jBp = runnableC1271220jBY.LL;
                runnableC1271220jBY.LL = null;
                c1271390jBp.LIZJ();
                EffectWrapper.AlgorithmResult algorithmResult = runnableC1271220jBY.LLILLJJLI;
                if (algorithmResult != null) {
                    algorithmResult.release();
                }
                if (((ArrayList) c1271230jBZ.LIZIZ).size() > 0) {
                    runnableC1271220jBY = (RunnableC1271220jBY) ListProtector.remove(c1271230jBZ.LIZIZ, 0);
                } else {
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LIZ(C0UD1 c0ud1) {
        Handler handler;
        if (this.LLLLIIIILLL && (handler = this.LLILZLL) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(c0ud1, this, 123));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJIIL(InterfaceC1272550jDh interfaceC1272550jDh) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS53S0300000_20(this, interfaceC1272550jDh, 28));
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJIILL(InterfaceC1269100j88 interfaceC1269100j88) {
        if (this.LLLLIIL && this.LLILZLL != null && isValid()) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS89S0200000_20(interfaceC1269100j88, this, 119));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIIZI(boolean z) {
        this.b = z;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIJIL(TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava) {
        this.LLLZIL.set(tTLHAbnormalDetectorJava);
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIJL(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJJJI(int i) {
        this.LLLZI = i;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJJJJ(boolean z) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS39S0110000_20(this, z, 10));
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJJJL(int i) {
        this.LLZZZIL = i;
    }

    @Override // X.InterfaceC1268640j7O
    public final VideoFrame LJJJJZ(VideoFrame videoFrame) {
        return process(videoFrame);
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJLIIIJILLIZJL(C1273620jFQ c1273620jFQ) {
        this.LLJJIJIL = c1273620jFQ;
    }

    @Override // X.InterfaceC1271470jBx
    public final void LJJLIIIJJIZ(C1271450jBv c1271450jBv) {
        InterfaceC1270140j9o interfaceC1270140j9o = this.LLLILZJ;
        if (interfaceC1270140j9o != null) {
            if (c1271450jBv == this.LLLIIII) {
                interfaceC1270140j9o.LIZ(false, c1271450jBv);
            } else {
                if (c1271450jBv != this.LLLIIIIL) {
                    return;
                }
                interfaceC1270140j9o.LIZ(true, c1271450jBv);
            }
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJLIIIJLJLI(JSONObject jSONObject) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS5S2200000_20(this, jSONObject, LLJJI(C786410Ut5.J3(jSONObject), "live"), 1));
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJLIL(C1266750j4L c1266750j4L) {
        this.LLLZZ = c1266750j4L;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJLJ(C0UHF c0uhf) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS89S0200000_20(this, c0uhf, 108));
    }

    @Override // X.InterfaceC1268640j7O
    public final InterfaceC1269100j88 LJJLL(Surface surface) {
        if (this.LLLLIIL && this.LLILZLL != null && isValid()) {
            C1272520jDe c1272520jDe = new C1272520jDe();
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS89S0200000_20(c1272520jDe, this, 118));
            if (c1272520jDe.LIZ == null) {
                c1272520jDe.LIZ = new C1273830jFl(surface);
            }
            return c1272520jDe;
        }
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLIIL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setHardwareRoiSceneAvailable: ");
        sbLIZ.append(z);
        AVLog.logKibana(4, "FilterManager", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LLZZJLIL = z;
        this.LLZZLLIL = EnumC1272290jDH.ROI_SWITCH_REASON_SCENE_AVAILABLE;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLILLLLZI(InterfaceC1272420jDU interfaceC1272420jDU) {
        this.LLLZIIL = interfaceC1272420jDU;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLJJI(boolean z) {
        this.LLLLIIIILLL = z;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLLLL(boolean z) {
        AbstractC1272680jDu abstractC1272680jDu = this.LLLII;
        if (abstractC1272680jDu != null) {
            abstractC1272680jDu.forceEnable(z, 1);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final AbstractC768410UCh LLD(AudioDeviceModule audioDeviceModule) {
        InterfaceC1272120jD0 interfaceC1272120jD0 = this.LLJJIJIIJIL;
        if (interfaceC1272120jD0 == null || !(interfaceC1272120jD0 instanceof EffectWrapper)) {
            return null;
        }
        return new NativeAudioStrange(null, 48000, 2, false, audioDeviceModule);
    }

    @Override // X.InterfaceC1268640j7O
    public final void LLIIIILZ(InterfaceC1272600jDm interfaceC1272600jDm) {
        this.LLJZ = interfaceC1272600jDm;
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS89S0200000_20(this, interfaceC1272600jDm, 107));
    }

    @Override // X.InterfaceC1268640j7O
    public final void LLIIIZ(C1267620j5k c1267620j5k) {
        this.LLLLZLL = c1267620j5k;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LLIILII(JSONObject jSONObject) {
        AbstractC1272680jDu abstractC1272680jDu = this.LLLII;
        if (abstractC1272680jDu != null) {
            abstractC1272680jDu.setBMFColorCorrectionSetting(jSONObject);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LLILZLL(C1268900j7o c1268900j7o) {
        this.LLLLLLLLL = c1268900j7o;
    }

    public final void LLIZ(VideoFrame videoFrame) {
        if (this.LLLLIIL && ((HashMap) this.LLLJL).size() > 0) {
            Iterator it2 = ((HashMap) this.LLLJL).entrySet().iterator();
            while (it2.hasNext()) {
                C1273830jFl c1273830jFl = ((C1272520jDe) ((Map.Entry) it2.next()).getValue()).LIZ;
                if (c1273830jFl != null) {
                    c1273830jFl.onFrame(videoFrame);
                }
            }
        }
    }

    public final void LLJILLL(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.LLLLLIL = new JSONObject(str).optString("effect_id", "");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final VideoFrame LLJJJIL(VideoFrame videoFrame) {
        RunnableC1271220jBY runnableC1271220jBY;
        if (this.LLLLLZ > 0) {
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (this.LLLZZIL) {
                rotatedWidth = this.LLZ;
                rotatedHeight = this.LLZIL;
                C1271230jBZ c1271230jBZ = this.LLILLL;
                int i = this.LLLLLZ;
                runnableC1271220jBY = (RunnableC1271220jBY) ((ConcurrentHashMap) c1271230jBZ.LIZJ).get(Integer.valueOf(i));
            } else {
                C1271230jBZ c1271230jBZ2 = this.LL;
                int i2 = this.LLLLLZ;
                runnableC1271220jBY = (RunnableC1271220jBY) ((ConcurrentHashMap) c1271230jBZ2.LIZJ).get(Integer.valueOf(i2));
            }
            if (runnableC1271220jBY != null) {
                return LLJL(runnableC1271220jBY, videoFrame, rotatedWidth, rotatedHeight, null, null);
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! recycle is null");
            C1274080jGA.LIZ.LIZ("FilterManager.returnCurrent2dTex", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        return videoFrame;
    }

    public final void LLJJJJJIL(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(str) && str.contains("face_extra_model_name")) {
                ((HashMap) this.LLLFZ).put("face_extra_model_name", jSONObject.optString("face_extra_model_name"));
            }
            if (!TextUtils.isEmpty(str) && str.contains("matting_model_name")) {
                ((HashMap) this.LLLFZ).put("matting_model_name", jSONObject.optString("matting_model_name"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LLJJJJLIIL(JSONObject jSONObject) {
        if (C786410Ut5.u3() != this.LLILZLL.getLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS89S0200000_20(jSONObject, this, 122));
            return;
        }
        AbstractC1272690jDv abstractC1272690jDv = this.LLLI;
        if (abstractC1272690jDv != null) {
            abstractC1272690jDv.updateParams(jSONObject);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void configSequenceCache(long j) {
        if (this.LLJJIJIIJIL != null && isValid()) {
            this.LLJJIJIIJIL.configSequenceCache(j);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void enable(boolean z) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        InterfaceC1272420jDU interfaceC1272420jDU;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable ");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(" -> ");
        sbLIZ.append(z);
        AVLog.iod("FilterManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJ = z;
        C1267500j5Y c1267500j5Y = this.LLLLZLLLI;
        if (c1267500j5Y != null && c1267500j5Y.LIZ.LJII && (interfaceC1272420jDU = this.LLLZIIL) != null) {
            interfaceC1272420jDU.LIZ();
        }
        InterfaceC1272120jD0 interfaceC1272120jD0 = this.LLJJIJIIJIL;
        if (interfaceC1272120jD0 != null && (effectAudioRender = interfaceC1272120jD0.getEffectAudioRender()) != null) {
            RunnableC1267570j5f runnableC1267570j5f = new RunnableC1267570j5f(effectAudioRender, !z);
            if (effectAudioRender.LLILZ) {
                effectAudioRender.LLIZLLLIL(effectAudioRender.LL, runnableC1267570j5f);
            } else {
                runnableC1267570j5f.run();
            }
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int enableMockFace(boolean z) {
        C1267500j5Y c1267500j5Y = this.LLLLZLLLI;
        if (c1267500j5Y == null || !c1267500j5Y.LIZIZ.LJI) {
            this.LLJJL = z;
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void enableSetMD5ResourceFinder(boolean z) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS39S0110000_20(this, z, 11));
    }

    @Override // X.InterfaceC1268640j7O
    public final EffectImageInfo getEffectCapturedImagewithKey(String str) {
        InterfaceC1272120jD0 interfaceC1272120jD0;
        if (isValid() && (interfaceC1272120jD0 = this.LLJJIJIIJIL) != null && (interfaceC1272120jD0 instanceof EffectWrapper)) {
            return ((EffectWrapper) interfaceC1272120jD0).getEffectCapturedImagewithKey(str);
        }
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final int notifyKeyboardHide(boolean z) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS5S1110000_20(this, LLJJI(Boolean.TRUE), 6));
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02c3  */
    @Override // com.ss.ttlivestreamer.core.engine.VideoProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ttlivestreamer.core.buffer.VideoFrame process(com.ss.ttlivestreamer.core.buffer.VideoFrame r18) {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1272090jCx.process(com.ss.ttlivestreamer.core.buffer.VideoFrame):com.ss.ttlivestreamer.core.buffer.VideoFrame");
    }

    @Override // X.InterfaceC1268640j7O
    public final void refreshSequenceCacheStatus(boolean z) {
        if (this.LLJJIJIIJIL != null && isValid()) {
            this.LLJJIJIIJIL.refreshSequenceCacheStatus(z);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void setClientState(int i) {
        if (this.LLZZZZ == i) {
            return;
        }
        ARunnableS31S0101000_20 aRunnableS31S0101000_20 = new ARunnableS31S0101000_20(i, this, 9);
        if (C786410Ut5.u3() == this.LLILZLL.getLooper().getThread()) {
            aRunnableS31S0101000_20.run();
        } else {
            C786410Ut5.LJJZZIII(this.LLILZLL, aRunnableS31S0101000_20);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void setContourInfoIndex(String str) {
        this.LLJJIJIIJIL.setContourInfoIndex(str);
    }

    @Override // X.InterfaceC1268640j7O
    public final void setEffectLogLevel(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEffectLogLevel : ");
        sbLIZ.append(3);
        AVLog.logKibana(4, "FilterManager", C2188811AlT.LIZIZ(sbLIZ), null);
        InterfaceC1272120jD0 interfaceC1272120jD0 = this.LLJJIJIIJIL;
        if (interfaceC1272120jD0 != null) {
            interfaceC1272120jD0.setEffectLogLevel(3);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void setServiceManager(InterfaceC1272820jE8 interfaceC1272820jE8) {
        this.LLZILL = interfaceC1272820jE8;
        if (interfaceC1272820jE8 != null) {
            C1272810jE7 c1272810jE7 = (C1272810jE7) interfaceC1272820jE8;
            this.LLZL = (C1271790jCT) c1272810jE7.getService(C1271790jCT.class);
            this.LLZLI = (C1271780jCS) c1272810jE7.getService(C1271780jCS.class);
            this.LLJI = (C1267810j63) c1272810jE7.getService(C1267810j63.class);
        }
    }

    @Override // X.InterfaceC1268620j7M
    public final VideoFrame.I420Buffer toI420(InterfaceC1271560jC6 interfaceC1271560jC6) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        if (this.LLJJIII == null && this.LLJJIJI == null) {
            GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "YuvConvertThread");
            this.LLJJIII = gLThreadLIZ;
            gLThreadLIZ.start();
            this.LLJJIJI = this.LLJJIII.getHandler();
        }
        Handler handler = this.LLJJIJI;
        if (handler != null && this.LLJJIII != null) {
            C1283100jUi.LIZIZ(handler, new ARunnableS53S0300000_20(this, i420BufferArr, interfaceC1271560jC6, 37));
        }
        if (i420BufferArr[0] == null) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG, Please fixed me");
            C1274080jGA.LIZ.LIZ("FilterManager.toI420", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        return i420BufferArr[0];
    }

    public static final String LLJIJIL(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length == strArr2.length) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < strArr.length; i++) {
                    jSONArray.put(strArr[i]);
                    jSONArray2.put(new JSONObject(strArr2[i]));
                }
                jSONObject.put("node_paths", jSONArray);
                jSONObject.put("node_tags", jSONArray2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                if (C1274040jG6.LIZ()) {
                    throw new RuntimeException(e);
                }
            }
            return C786410Ut5.J3(jSONObject);
        }
        return "";
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJII(InterfaceC1269980j9Y interfaceC1269980j9Y, EnumC1272790jE5 enumC1272790jE5) {
        if (interfaceC1269980j9Y != null && this.LLLLLILLIL.containsKey(enumC1272790jE5)) {
            ((C1269960j9W) ((LinkedHashMap) this.LLLLLILLIL).get(enumC1272790jE5)).LJIIIIZZ(interfaceC1269980j9Y);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIJLIJ(String str, String str2) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS10S2100000_20(this, str, str2, 6));
    }

    @Override // X.InterfaceC1268640j7O
    public final VideoFrame LJJJJLL(GLTexture[] gLTextureArr, GLTexture gLTexture) {
        VideoFrame[] videoFrameArr = new VideoFrame[1];
        C1283100jUi.LIZIZ(this.LLILZLL, new ARunnableS28S0400000_20(gLTextureArr, gLTexture, videoFrameArr, this, 5));
        return videoFrameArr[0];
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJZZI(int i, boolean z) {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableVideoStreamHD enable:");
        sbLIZ.append(z);
        sbLIZ.append(" mask:");
        sbLIZ.append(i);
        sbLIZ.append(" mVideoStreamHDFilter:");
        sbLIZ.append(this.LLLII);
        AVLog.logKibana(6, "FilterManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (C786410Ut5.u3() != this.LLILZLL.getLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS3S0111000_20(this, z, i, 3));
            return;
        }
        AbstractC1272680jDu abstractC1272680jDu = this.LLLII;
        if (abstractC1272680jDu != null) {
            if (z && this.LLLLZLLLI.LIZ.mPushBase.LJIL()) {
                z2 = true;
            } else {
                z2 = false;
            }
            abstractC1272680jDu.setEnable(z2, i);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LLIIJLIL(boolean z, EnumC1272290jDH enumC1272290jDH) {
        this.LLZZ = z;
        this.LLZZLLIL = enumC1272290jDH;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LLILIL(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableVideoDenoise enable:");
        sbLIZ.append(z);
        sbLIZ.append(" mask:");
        sbLIZ.append(i);
        sbLIZ.append(" mVideoDenoiseFilter:");
        sbLIZ.append(this.LLLI);
        AVLog.logKibana(6, "FilterManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!this.LLLJ) {
            AbstractC1272690jDv abstractC1272690jDv = this.LLLI;
            if (abstractC1272690jDv != null) {
                abstractC1272690jDv.enable(z, i);
                return;
            }
            return;
        }
        if (C786410Ut5.u3() != this.LLILZLL.getLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS3S0111000_20(this, z, i, 4));
            return;
        }
        AbstractC1272690jDv abstractC1272690jDv2 = this.LLLI;
        if (abstractC1272690jDv2 == null) {
            return;
        }
        abstractC1272690jDv2.setEnable(z, i);
    }

    public final void LLJILJILJ(int i, VideoFrame videoFrame) {
        boolean z;
        float[] fArr;
        boolean z2;
        boolean z3;
        C1273620jFQ c1273620jFQ;
        C1273620jFQ c1273620jFQ2;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (buffer instanceof InterfaceC1271560jC6) {
            if (this.LLLLLJIL == 0) {
                this.LLLLLJIL = GlUtil.createFrameBuffer();
            }
            InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) buffer;
            int textureId = interfaceC1271560jC6.getTextureId();
            if (interfaceC1271560jC6.getType() == EnumC1273550jFJ.OES) {
                z = true;
            } else {
                z = false;
            }
            this.LLLZLL.LIZ(videoFrame.getRotation(), interfaceC1271560jC6.getTransformMatrix());
            float[] fArr2 = this.LLLZLL.LIZ;
            int[] iArr = {i};
            AbstractC1272690jDv abstractC1272690jDv = this.LLLI;
            if (abstractC1272690jDv != null && !abstractC1272690jDv.isInplaceProcess2D()) {
                fArr = fArr2;
                if (this.LLLI.process(textureId, z, rotatedWidth, rotatedHeight, fArr2, iArr) == 0 && iArr[0] == i) {
                    z2 = true;
                    C1267500j5Y c1267500j5Y = this.LLLLZLLLI;
                    if (c1267500j5Y != null && c1267500j5Y.LIZ.LJIL() && (c1273620jFQ2 = this.LLJJIJIL) != null) {
                        videoFrame.getBuffer().getCaptureMs();
                        c1273620jFQ2.LIZLLL(c1273620jFQ2.LJIL, null);
                    }
                } else {
                    z2 = false;
                }
            } else {
                fArr = fArr2;
                z2 = false;
            }
            AbstractC1272680jDu abstractC1272680jDu = this.LLLII;
            if (abstractC1272680jDu != null && abstractC1272680jDu.process(textureId, z, rotatedWidth, rotatedHeight, fArr, iArr) == 0 && iArr[0] == i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 && !z3) {
                GLES20.glBindFramebuffer(36160, this.LLLLLJIL);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                if (z) {
                    this.LLJILJILJ.drawOes(interfaceC1271560jC6.getTextureId(), null, fArr, 0, 0, rotatedWidth, rotatedHeight);
                } else {
                    this.LLJILJILJ.drawRgb(interfaceC1271560jC6.getTextureId(), null, fArr, 0, 0, rotatedWidth, rotatedHeight);
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            GLES20.glFinish();
            C1267500j5Y c1267500j5Y2 = this.LLLLZLLLI;
            if (c1267500j5Y2 != null && c1267500j5Y2.LIZ.LJIL() && (c1273620jFQ = this.LLJJIJIL) != null) {
                videoFrame.getBuffer().getCaptureMs();
                c1273620jFQ.LIZLLL(c1273620jFQ.LJIJJ, null);
            }
            C1269940j9U c1269940j9U = this.LLZLLIL;
            if (c1269940j9U != null) {
                c1269940j9U.LIZ(5, videoFrame.getBuffer().getCaptureMs());
            }
        }
    }

    public final boolean LLJJ(int i, int i2) {
        RunnableC1271220jBY runnableC1271220jBYLIZ = this.LL.LIZ(i, i2);
        this.LLJ = runnableC1271220jBYLIZ;
        if (runnableC1271220jBYLIZ == null) {
            AVLog.ioe("FilterManager", "No enough in buffer space and drop frame");
            this.LLLLZIL++;
            return false;
        }
        if (this.LLJJJ || this.LLJJLIIIJLLLLLLLZ) {
            if (this.LLLZZIL) {
                this.LLJILLL = this.LLILLL.LIZ(this.LLZ, this.LLZIL);
            } else {
                this.LLJILLL = this.LL.LIZ(i, i2);
            }
            if (this.LLJILLL == null) {
                AVLog.ioe("FilterManager", "No enough out buffer space and drop frame");
                this.LLLLZIL++;
                return false;
            }
        }
        return true;
    }

    public final void LLJJJJ(int i, String str) {
        if (C786410Ut5.u3() != this.LLILZLL.getLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS2S1101000_13(i, str, this, 0));
            return;
        }
        C1271450jBv c1271450jBv = this.LLLIIII;
        if (c1271450jBv != null) {
            c1271450jBv.LJIIIIZZ(i);
            this.LLLIIII = null;
        }
        C1271450jBv c1271450jBv2 = this.LLLIIIIL;
        if (c1271450jBv2 != null) {
            c1271450jBv2.LJIIIIZZ(i);
            this.LLLIIIIL = null;
        }
        InterfaceC1267390j5N interfaceC1267390j5N = this.LLLILZ;
        if (interfaceC1267390j5N != null) {
            if (i == 0) {
                interfaceC1267390j5N.onComplete();
            } else {
                interfaceC1267390j5N.onError(i, str);
            }
            this.LLLILZ = null;
        }
        this.LLLIIIL = 0;
    }

    public final VideoFrame LLJJL(InterfaceC1271560jC6 interfaceC1271560jC6, VideoFrame videoFrame) {
        if (this.c == null) {
            Matrix matrix = new Matrix();
            this.c = matrix;
            matrix.reset();
            this.c.preTranslate(0.5f, 0.5f);
            this.c.preScale(1.0f, -1.0f);
            this.c.preTranslate(-0.5f, -0.5f);
        }
        interfaceC1271560jC6.setTransformMatrix(this.c);
        return C1271570jC7.LIZ(interfaceC1271560jC6, videoFrame, null);
    }

    public final VideoFrame LLJJLIIIJLLLLLLLZ(RunnableC1271220jBY runnableC1271220jBY, VideoFrame videoFrame) {
        return LLJL(runnableC1271220jBY, videoFrame, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), null, null);
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerAppendNodes(String[] strArr, int i) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS5S1201000_20(this, strArr, LLJJI(strArr, 1), 2));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerRemoveNodes(String[] strArr, int i) {
        String strLLJJI = LLJJI(strArr, Integer.valueOf(i));
        InterfaceC1272420jDU interfaceC1272420jDU = this.LLLZIIL;
        if (interfaceC1272420jDU != null) {
            interfaceC1272420jDU.LIZLLL(strArr);
        }
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS5S1201000_20(this, i, strLLJJI, strArr, 3));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerSetMode(int i, int i2) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS1S1102000_20(this, LLJJI(1, 0), 0));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerSetNodes(String[] strArr, int i) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS5S1201000_20(this, i, LLJJI(strArr, Integer.valueOf(i)), strArr, 1));
        return 0;
    }

    public final int enableFindContour(boolean z, String str) {
        if (!this.LLLLLLLZIL) {
            return -2;
        }
        if (isValid()) {
            int iEnableFindContour = this.LLJJIJIIJIL.enableFindContour(false, null);
            if (iEnableFindContour == 0) {
                this.LLLLLLLLLL = false;
                int i = this.LLLLLLZ - 1;
                this.LLJJJJ |= 8;
                if (i >= 0 && i < this.LLJJJJJIL) {
                    this.LLJJJJJIL = i;
                }
                this.LLJJJJJIL = i;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enableExtData ");
                sbLIZ.append(8L);
                sbLIZ.append(" gop ");
                sbLIZ.append(i);
                AVLog.iod("FilterManager", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("enableFindContour. enable = ");
                sbLIZ2.append(false);
                AVLog.ioi("FilterManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return iEnableFindContour;
        }
        return -1;
    }

    @Override // X.InterfaceC1271470jBx
    public final void onError(int i, String str) {
        LLJJJJ(i, str);
    }

    @Override // X.InterfaceC1268640j7O
    public final void processLongPressEvent(float f, float f2) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS7S0100002_20(this, f, f2, 1));
    }

    @Override // X.InterfaceC1268640j7O
    public final void processRotationEvent(float f, float f2) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS7S0100002_20(this, f, f2, 3));
    }

    @Override // X.InterfaceC1268640j7O
    public final void processScaleEvent(float f, float f2) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS7S0100002_20(this, f, f2, 2));
    }

    @Override // X.InterfaceC1268640j7O
    public final void processTouchEvent(float f, float f2) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS7S0100002_20(this, f, f2, 0));
    }

    @Override // X.InterfaceC1268640j7O
    public final int setCustomEffect(final String str, final String str2) {
        final String strLLJJI = LLJJI(str, str2);
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jDB
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                int customEffect;
                C1C7U.LIZ("FilterManager@d45d.setCustomEffect$1");
                try {
                    if (this.LLILZ.isValid() && (customEffect = this.LLILZ.LLJJIJIIJIL.setCustomEffect(str, str2)) != 0) {
                        this.LLILZ.LLJZIJLIL.onError(customEffect, strLLJJI);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.setCustomEffect$1");
            }
        });
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int setEffect(final String str, final boolean z) {
        final String strLLJJI = LLJJI(str, Boolean.valueOf(z));
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jD4
            public final void LIZ() {
                if (this.LLILZ.isValid()) {
                    C1272090jCx c1272090jCx = this.LLILZ;
                    C1267500j5Y c1267500j5Y = c1272090jCx.LLLLZLLLI;
                    if (c1267500j5Y == null || !c1267500j5Y.LIZIZ.LJI) {
                        c1272090jCx.LLJJL = z;
                    }
                    int effect = c1272090jCx.LLJJIJIIJIL.setEffect(str);
                    if (effect != 0) {
                        this.LLILZ.LLJZIJLIL.onError(effect, strLLJJI);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FilterManager@d45d.setEffect$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.setEffect$1");
            }
        });
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void setRenderCacheString(String str, String str2) {
        if (isValid()) {
            this.LLJJIJIIJIL.setRenderCacheString(str, str2);
            LLJJJJJIL(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLJILJIL(X.RunnableC1271220jBY r26, com.ss.ttlivestreamer.core.buffer.VideoFrame r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1272090jCx.LLJILJIL(X.0jBY, com.ss.ttlivestreamer.core.buffer.VideoFrame, boolean):int");
    }

    public final void LLJJIII(Context context, JSONObject jSONObject, InterfaceC1283880jVy interfaceC1283880jVy) {
        if (C786410Ut5.u3() != this.LLILZLL.getLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS28S0400000_20(this, context, jSONObject, interfaceC1283880jVy, 10));
            return;
        }
        if (this.LLLI == null) {
            if (jSONObject != null) {
                try {
                    jSONObject.put("enableDenoiseOpt", this.LLLJ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }
            AbstractC1272690jDv abstractC1272690jDvCreate = AbstractC1272690jDv.Create(context, jSONObject, interfaceC1283880jVy);
            this.LLLI = abstractC1272690jDvCreate;
            if (this.LLLJ && abstractC1272690jDvCreate != null) {
                abstractC1272690jDvCreate.setHandler(this.LLILZLL);
            }
        }
    }

    public final void LLJJIJI(Context context, JSONObject jSONObject, InterfaceC1273880jFq interfaceC1273880jFq) {
        if (C786410Ut5.u3() != this.LLILZLL.getLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS28S0400000_20(this, context, jSONObject, interfaceC1273880jFq, 8));
        } else if (this.LLLII == null) {
            this.LLLII = AbstractC1272680jDu.Create(context, jSONObject, interfaceC1273880jFq, this.LLILZLL, EnumC1267980j6K.NORMAL_LIVE, this.LLLLZLLLI);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
        String strLLJIJIL;
        C1267500j5Y c1267500j5Y = this.LLLLZLLLI;
        if (c1267500j5Y != null && c1267500j5Y.LIZ.ttlhABSettingsConfigs.LIZ) {
            strLLJIJIL = LLJIJIL(strArr, strArr2);
        } else {
            strLLJIJIL = "";
        }
        LLJI(strArr, i, strArr2, strLLJIJIL, true);
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerCheckNodeExclusion(final String str, final String str2, final int[] iArr) {
        final String strLLJJI = LLJJI(str, str2, iArr);
        if (isValid() && iArr.length > 0) {
            C1283100jUi.LIZIZ(this.LLILZLL, new Runnable() { // from class: X.0jDC
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FilterManager@d45d.composerCheckNodeExclusion$1");
                    try {
                        int iComposerCheckNodeExclusion = this.LLILZIL.LLJJIJIIJIL.composerCheckNodeExclusion(str, str2, iArr);
                        if (iComposerCheckNodeExclusion != 0) {
                            this.LLILZIL.LLJZIJLIL.onError(iComposerCheckNodeExclusion, strLLJJI);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FilterManager@d45d.composerCheckNodeExclusion$1");
                }
            });
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerPreloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        Handler handler = this.LLILZLL;
        if (isValid() && handler != null) {
            ARunnableS13S0301000_20 aRunnableS13S0301000_20 = new ARunnableS13S0301000_20(i, this, strArr, strArr2, 4);
            if (C786410Ut5.u3() == handler.getLooper().getThread()) {
                aRunnableS13S0301000_20.run();
                return 0;
            }
            C786410Ut5.LJJZZIII(handler, aRunnableS13S0301000_20);
            return 0;
        }
        return -1;
    }

    @Override // X.InterfaceC1268640j7O
    /* JADX INFO: renamed from: composerSetNodesWithTags */
    public final void mo48composerSetNodesWithTags(final String[] strArr, final int i, final String[] strArr2) {
        LLJJI(strArr, Integer.valueOf(i), strArr2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("composerSetNodesWithTags, inMic: ");
        sbLIZ.append(true);
        sbLIZ.append(" inMusic: ");
        sbLIZ.append(false);
        sbLIZ.append(" useOutput: ");
        sbLIZ.append(false);
        AVLog.logKibana(5, "FilterManager", C2188811AlT.LIZIZ(sbLIZ), null);
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jD6
            public final /* synthetic */ boolean LL = true;
            public final /* synthetic */ boolean LLILLJJLI = false;
            public final /* synthetic */ boolean LLILLL = false;

            public final void LIZ() {
                if (this.LLIZ.isValid()) {
                    boolean z = this.LL;
                    if (z || this.LLILLJJLI || this.LLILLL) {
                        C1272090jCx c1272090jCx = this.LLIZ;
                        C786410Ut5.LJJZZIII(c1272090jCx.LLILZLL, new ARunnableS0S0130000_20(c1272090jCx, z, this.LLILLJJLI, this.LLILLL, 0));
                        this.LLIZ.composerSetNodesWithTags(strArr, i, strArr2);
                    } else {
                        this.LLIZ.composerSetNodesWithTags(strArr, i, strArr2);
                    }
                    this.LLIZ.LLJJIJIIJIL.setEffectAudioGraphCfg(this.LL, this.LLILLJJLI, this.LLILLL);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FilterManager@d45d.composerSetNodesWithTags$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.composerSetNodesWithTags$1");
            }
        });
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerUpdateNode(String str, String str2, float f) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS0S3100001_20(this, str, str2, f, LLJJI(str, str2, Float.valueOf(f)), 0));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void processTouchDownEvent(float f, float f2, int i) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS0S0101002_20(this, i, f, f2, 0));
    }

    @Override // X.InterfaceC1268640j7O
    public final void processTouchUpEvent(float f, float f2, int i) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS0S0101002_20(this, i, f, f2, 1));
    }

    @Override // X.InterfaceC1268640j7O
    public final void setEffectAudioGraphCfg(boolean z, boolean z2, boolean z3) {
        if (!z && !z2 && !z3) {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS120S0100000_20(this, 170));
        } else {
            C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS0S0130000_20(this, z, z2, z3, 0));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
        AVLog.logKibana(5, "FilterManager", "composerSetNodesWithTags", null);
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS1S1301000_20(this, strArr, i, strArr2, LLJJI(strArr, Integer.valueOf(i), strArr2), 0));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0243  */
    /* JADX WARN: Type inference failed for: r25v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r28v3, types: [com.ss.ttlivestreamer.core.effect.EffectWrapper$AlgorithmResult] */
    /* JADX WARN: Type inference failed for: r34v0, types: [X.0jCx] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ttlivestreamer.core.buffer.VideoFrame LLJJIJIL(int r35, int r36, com.ss.ttlivestreamer.core.buffer.VideoFrame r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1272090jCx.LLJJIJIL(int, int, com.ss.ttlivestreamer.core.buffer.VideoFrame, boolean):com.ss.ttlivestreamer.core.buffer.VideoFrame");
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS0S1401000_20(this, i, strArr, strArr2, fArr, LLJJI(Integer.valueOf(i), strArr, strArr2, fArr), 0));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int sendEffectMsg(final int i, final int i2, final int i3, final String str) {
        final String strLLJJI = LLJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jDD
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                int iSendEffectMsg;
                C1C7U.LIZ("FilterManager@d45d.sendEffectMsg$1");
                try {
                    if (this.LLILZLL.isValid() && (iSendEffectMsg = this.LLILZLL.LLJJIJIIJIL.sendEffectMsg(i, i2, i3, str)) != 0) {
                        this.LLILZLL.LLJZIJLIL.onError(iSendEffectMsg, strLLJJI);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.sendEffectMsg$1");
            }
        });
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int setInputText(final String str, final int i, final int i2, final String str2) {
        final String strLLJJI = LLJJI(str, Integer.valueOf(i), Integer.valueOf(i2), str2);
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jDA
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                int inputText;
                C1C7U.LIZ("FilterManager@d45d.setInputText$1");
                try {
                    if (this.LLILZLL.isValid() && (inputText = this.LLILZLL.LLJJIJIIJIL.setInputText(str, i, i2, str2)) != 0) {
                        this.LLILZLL.LLJZIJLIL.onError(inputText, strLLJJI);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.setInputText$1");
            }
        });
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.0jDG] */
    public C1272090jCx(C1266600j46 c1266600j46, final Context context, Handler handler, final AudioDeviceModule audioDeviceModule, final C1267500j5Y c1267500j5Y) {
        this.LLLLIIL = false;
        this.LLLLLZL = false;
        this.LLLLZLLLI = c1267500j5Y;
        this.LLLLLLIL = (C1273370jF1) c1267500j5Y.LIZJ.getService(C1273370jF1.class);
        this.LLILZLL = handler;
        if (handler != null && !c1267500j5Y.LIZIZ.LJJJLIIL) {
            C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(this, 175));
        }
        if (this.LLILZLL == null) {
            GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "LiveFilterThread");
            this.LLILZIL = gLThreadLIZ;
            gLThreadLIZ.start();
            this.LLILZLL = this.LLILZIL.getHandler();
        }
        this.LLIZLLLIL = audioDeviceModule;
        this.LLJLLIL = c1266600j46;
        this.LLJLLL = new OrientationEventListener(context) { // from class: X.0jDG
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                if (i == -1) {
                    return;
                }
                int i2 = (((i + 45) / 90) * 90) % 360;
                C1272090jCx c1272090jCx = this.LIZ;
                if (i2 != c1272090jCx.LLJLL) {
                    c1272090jCx.LLJLL = i2;
                }
            }

            {
                try {
                    if (canDetectOrientation()) {
                        enable();
                    } else {
                        AVLog.e("FilterManager", "Can't Detect Orientation");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVLog.logKibana(6, "FilterManager", "AlbumOrientationEventListener register failed:", e);
                }
            }
        };
        this.LLJZIJLIL = new InterfaceC1272580jDk() { // from class: X.0jDL
            @Override // X.InterfaceC1272580jDk
            public final void onError(int i, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Effect api return error: ");
                sbLIZ.append(i);
                sbLIZ.append(". Calling info: ");
                sbLIZ.append(str);
                AVLog.ioe("FilterManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        C1283100jUi.LIZIZ(this.LLILZLL, new Runnable() { // from class: X.0jCz
            public final /* synthetic */ InterfaceC1272120jD0 LLILLJJLI = null;
            public final /* synthetic */ boolean LLILZ = false;

            /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[PHI: r1
              0x0057: PHI (r1v3 boolean) = (r1v5 boolean), (r1v6 boolean) binds: [B:16:0x0038, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r9 = this;
                    X.0j5Y r0 = r3
                    boolean r8 = X.C1269260j8O.LIZIZ(r0)
                    X.0jD0 r1 = r9.LLILLJJLI
                    r6 = 0
                    if (r1 == 0) goto L26
                    X.0jCx r0 = r9.LLILZIL
                    r0.LLJJIJIIJIL = r1
                Lf:
                    X.0jCx r0 = r9.LLILZIL
                    X.0jD0 r0 = r0.LLJJIJIIJIL
                    boolean r0 = r0.valid()
                    if (r0 != 0) goto L5b
                    X.0jCx r0 = r9.LLILZIL
                    X.0jD0 r0 = r0.LLJJIJIIJIL
                    r0.release()
                    X.0jCx r1 = r9.LLILZIL
                    r0 = 0
                    r1.LLJJIJIIJIL = r0
                    return
                L26:
                    X.0j5Y r2 = r3
                    r7 = 1
                    if (r2 == 0) goto L3f
                    X.0j8C r0 = r2.LIZIZ
                    boolean r0 = r0.LJII
                    if (r0 != 0) goto L59
                    r1 = 1
                    if (r2 == 0) goto L57
                L34:
                    X.0j8C r0 = r2.LIZIZ
                    boolean r0 = r0.LJIIIIZZ
                    if (r0 == 0) goto L57
                    r0 = 0
                L3b:
                    if (r1 == 0) goto L55
                    if (r0 == 0) goto L55
                L3f:
                    r5 = 0
                L40:
                    X.0jCx r4 = r9.LLILZIL
                    com.ss.ttlivestreamer.core.effect.EffectWrapper r3 = new com.ss.ttlivestreamer.core.effect.EffectWrapper
                    com.ss.ttlivestreamer.core.engine.AudioDeviceModule r2 = r4
                    boolean r1 = r9.LLILZ
                    X.0j5Y r0 = r3
                    if (r0 == 0) goto L4f
                    if (r5 != 0) goto L4f
                    r7 = 0
                L4f:
                    r3.<init>(r2, r1, r7, r8)
                    r4.LLJJIJIIJIL = r3
                    goto Lf
                L55:
                    r5 = 1
                    goto L40
                L57:
                    r0 = 1
                    goto L3b
                L59:
                    r1 = 0
                    goto L34
                L5b:
                    X.0jCx r0 = r9.LLILZIL
                    X.0jD0 r1 = r0.LLJJIJIIJIL
                    X.0j5Y r0 = r3
                    if (r0 == 0) goto L67
                    X.0j8C r0 = r0.LIZIZ
                    int r6 = r0.LJIIIZ
                L67:
                    r1.setFaceDetectSkipStep(r6)
                    X.0jCx r2 = r9.LLILZIL
                    boolean r0 = r2.isValid()
                    if (r0 == 0) goto L92
                    X.0jD0 r0 = r2.LLJJIJIIJIL
                    com.ss.ttlivestreamer.core.engine.AudioDeviceModule$AudioRenderSink r1 = r0.getEffectAudioRender()
                    if (r1 == 0) goto L92
                    X.0j7g r0 = r2.LLJLLIL
                    if (r0 == 0) goto L92
                    float r0 = r2.LLLLLLJ
                    r1.LLJJ(r0)
                    X.0j7g r0 = r2.LLJLLIL
                    com.ss.ttlivestreamer.core.mixer.AudioMixer$AudioMixerDescription r1 = r0.LIZ()
                    float r0 = r2.LLLLLLJ
                    r1.volumeCoeff = r0
                    X.0j7g r0 = r2.LLJLLIL
                    r0.start()
                L92:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r0 = "Using Effect info "
                    r1.<init>(r0)
                    X.0jCx r0 = r9.LLILZIL
                    X.0jD0 r0 = r0.LLJJIJIIJIL
                    java.lang.String r0 = r0.name()
                    r1.append(r0)
                    java.lang.String r0 = " "
                    r1.append(r0)
                    X.0jCx r0 = r9.LLILZIL
                    X.0jD0 r0 = r0.LLJJIJIIJIL
                    java.lang.String r0 = r0.getEffectVersion()
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r0 = "FilterManager"
                    com.ss.ttlivestreamer.core.utils.AVLog.iow(r0, r1)
                    X.0jCx r1 = r9.LLILZIL
                    com.ss.ttlivestreamer.core.opengl.GlRenderDrawer r0 = new com.ss.ttlivestreamer.core.opengl.GlRenderDrawer
                    r0.<init>()
                    r1.LLJILJILJ = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1272110jCz.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FilterManager@d45d.<init>$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.<init>$2");
            }
        });
        int iMax = Math.max(4, 4);
        int iMax2 = Math.max(3, 3);
        C1272810jE7 c1272810jE7 = c1267500j5Y.LIZJ;
        this.LLZLL = (C1269300j8S) c1272810jE7.getService(C1269300j8S.class);
        this.LLZLLIL = (C1269940j9U) c1272810jE7.getService(C1269940j9U.class);
        this.a = (C1269850j9L) c1272810jE7.getService(C1269850j9L.class);
        this.LLLLLZL = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableThreeBuffer : ");
        sbLIZ.append(false);
        AVLog.logKibana(4, "FilterManager", C2188811AlT.LIZIZ(sbLIZ), null);
        InterfaceC1272120jD0 interfaceC1272120jD0 = this.LLJJIJIIJIL;
        if (interfaceC1272120jD0 != null) {
            interfaceC1272120jD0.setEnableThreeBuffer(false);
        }
        int iLIZ = C1269110j89.LIZ(c1267500j5Y.LIZ, c1267500j5Y.LIZIZ);
        if (this.LLLLLZL) {
            iMax2 += iLIZ;
        } else {
            iMax += iLIZ;
        }
        this.LLLLIIL = c1267500j5Y.LIZIZ.LJIIJ;
        if (!LLJJIJIIJIL()) {
            this.LL = new C1271230jBZ(iMax, true);
            this.LLILLJJLI = null;
            this.LLILLL = new C1271230jBZ(iMax2, false);
        }
    }

    public static void LLIZLLLIL(C1271450jBv c1271450jBv, VideoFrame videoFrame, int i, int i2, int i3) {
        if (c1271450jBv != null && videoFrame != null) {
            int i4 = c1271450jBv.LLJILJILJ;
            if (i4 == 0) {
                c1271450jBv.LIZJ(videoFrame);
            } else {
                if (i4 != 1) {
                    return;
                }
                GLES20.glBindFramebuffer(36160, i);
                c1271450jBv.LIZLLL(i2, i3);
                GLES20.glBindFramebuffer(36160, 0);
            }
        }
    }

    @Override // X.InterfaceC1267860j68
    public final void LLILLIZIL(Buffer buffer, int i, int i2, int i3, long j) {
        int iEffectAudioProcessData;
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        int iStartAudioRecognize;
        if ((buffer instanceof ByteBuffer) && buffer.isDirect()) {
            if (i * 100 == i2) {
                if (!this.LLLILZLLLI) {
                    return;
                }
                if (isValid() && this.LLJJIJIIJIL.isAudioRecognizeAvailable() && (iStartAudioRecognize = this.LLJJIJIIJIL.startAudioRecognize((ByteBuffer) buffer, i, i2, i3)) != 0) {
                    InterfaceC1272580jDk interfaceC1272580jDk = this.LLJZIJLIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startAudioRecognize(ByteBuffer, ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", ");
                    sbLIZ.append(i3);
                    sbLIZ.append(")");
                    interfaceC1272580jDk.onError(iStartAudioRecognize, C2188811AlT.LIZIZ(sbLIZ));
                }
                synchronized (this.LLIZ) {
                    try {
                        if (isValid() && this.LLLILZLLLI) {
                            if (this.LLLLJ) {
                                iEffectAudioProcessData = this.LLJJIJIIJIL.effectAudioProcessDataV2((ByteBuffer) buffer, i, i2, i3);
                            } else {
                                iEffectAudioProcessData = this.LLJJIJIIJIL.effectAudioProcessData((ByteBuffer) buffer, i, i2, i3);
                            }
                            if (iEffectAudioProcessData != 0) {
                                this.LLJZIJLIL.onError(iEffectAudioProcessData, "");
                            }
                            if (this.LLLIZZ && !this.LLJLILLLLZIIL && (effectAudioRender = this.LLJJIJIIJIL.getEffectAudioRender()) != null) {
                                effectAudioRender.onData(buffer, 441, 44100, i3, j);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            throw new AndroidRuntimeException("Audio data should be 10ms per frame!");
        }
        throw new AndroidRuntimeException("Audio buffer should be a direct byte buffer!");
    }

    public final void LLJI(final String[] strArr, final int i, final String[] strArr2, final String str, boolean z) {
        final boolean z2;
        InterfaceC1272600jDm interfaceC1272600jDm;
        int iLIZ;
        final String strLLJJI = LLJJI(strArr, strArr2);
        C1267500j5Y c1267500j5Y = this.LLLLZLLLI;
        if (c1267500j5Y != null && c1267500j5Y.LIZ.ttlhABSettingsConfigs.LIZ) {
            z2 = true;
            if (z && (interfaceC1272600jDm = this.LLJZ) != null) {
                InterfaceC1272570jDj interfaceC1272570jDj = this.LLLZZ;
                if (interfaceC1272570jDj == null) {
                    iLIZ = 0;
                } else {
                    iLIZ = interfaceC1272570jDj.LIZ();
                }
                interfaceC1272600jDm.onMessageReceived(4105, iLIZ, 0, str);
            }
        } else {
            z2 = false;
        }
        InterfaceC1272420jDU interfaceC1272420jDU = this.LLLZIIL;
        if (interfaceC1272420jDU != null) {
            interfaceC1272420jDU.LIZIZ(strArr);
        }
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jD3
            public final void LIZ() {
                if (this.LLIZ.isValid()) {
                    this.LLIZ.LLJILLL(strArr2);
                    int iComposerAppendNodesWithTags = this.LLIZ.LLJJIJIIJIL.composerAppendNodesWithTags(strArr, i, strArr2);
                    if (iComposerAppendNodesWithTags != 0) {
                        this.LLIZ.LLJZIJLIL.onError(iComposerAppendNodesWithTags, strLLJJI);
                    }
                    if (z2) {
                        C1272090jCx c1272090jCx = this.LLIZ;
                        String str2 = str;
                        InterfaceC1272600jDm interfaceC1272600jDm2 = c1272090jCx.LLJZ;
                        if (interfaceC1272600jDm2 != null) {
                            InterfaceC1272570jDj interfaceC1272570jDj2 = c1272090jCx.LLLZZ;
                            interfaceC1272600jDm2.onMessageReceived(4106, interfaceC1272570jDj2 == null ? 0 : interfaceC1272570jDj2.LIZ(), iComposerAppendNodesWithTags, str2);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FilterManager@d45d.composerAppendNodesWithTags$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.composerAppendNodesWithTags$3");
            }
        });
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerReplaceNodesWithTags(final String[] strArr, final int i, final String[] strArr2, final int i2, final String[] strArr3) {
        final String strLLJJI = LLJJI(strArr, Integer.valueOf(i), strArr2, Integer.valueOf(i2), strArr3);
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jD8
            public final void LIZ() {
                if (this.LLIZ.isValid()) {
                    this.LLIZ.LLJILLL(strArr3);
                    int iComposerReplaceNodesWithTags = this.LLIZ.LLJJIJIIJIL.composerReplaceNodesWithTags(strArr, i, strArr2, i2, strArr3);
                    if (iComposerReplaceNodesWithTags != 0) {
                        this.LLIZ.LLJZIJLIL.onError(iComposerReplaceNodesWithTags, strLLJJI);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FilterManager@d45d.composerReplaceNodesWithTags$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.composerReplaceNodesWithTags$1");
            }
        });
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS0S0100005_20(this, f, f2, f3, f4, f5, 0));
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJJIL(final String[] strArr, final int i, final String[] strArr2, final boolean z, final boolean z2, final boolean z3) {
        final String strLLJIJIL;
        int iLIZ;
        LLJJI(strArr, Integer.valueOf(i), strArr2);
        InterfaceC1272420jDU interfaceC1272420jDU = this.LLLZIIL;
        if (interfaceC1272420jDU != null) {
            interfaceC1272420jDU.LIZJ(strArr);
        }
        C1267500j5Y c1267500j5Y = this.LLLLZLLLI;
        if (c1267500j5Y != null && c1267500j5Y.LIZ.ttlhABSettingsConfigs.LIZ) {
            strLLJIJIL = LLJIJIL(strArr, strArr2);
            InterfaceC1272600jDm interfaceC1272600jDm = this.LLJZ;
            if (interfaceC1272600jDm != null) {
                InterfaceC1272570jDj interfaceC1272570jDj = this.LLLZZ;
                if (interfaceC1272570jDj == null) {
                    iLIZ = 0;
                } else {
                    iLIZ = interfaceC1272570jDj.LIZ();
                }
                interfaceC1272600jDm.onMessageReceived(4105, iLIZ, 0, strLLJIJIL);
            }
        } else {
            strLLJIJIL = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("composerAppendNodesWithTags, inMic: ");
        sbLIZ.append(z);
        sbLIZ.append(" inMusic: ");
        sbLIZ.append(z2);
        sbLIZ.append(" useOutput: ");
        sbLIZ.append(z3);
        AVLog.logKibana(4, "FilterManager", C2188811AlT.LIZIZ(sbLIZ), null);
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jD7
            public final void LIZ() {
                if (this.LLIZLLLIL.isValid()) {
                    boolean z4 = z;
                    if (z4 || z2 || z3) {
                        C1272090jCx c1272090jCx = this.LLIZLLLIL;
                        C786410Ut5.LJJZZIII(c1272090jCx.LLILZLL, new ARunnableS0S0130000_20(c1272090jCx, z4, z2, z3, 0));
                    }
                    this.LLIZLLLIL.LLJI(strArr, i, strArr2, strLLJIJIL, false);
                    this.LLIZLLLIL.LLJJIJIIJIL.setEffectAudioGraphCfg(z, z2, z3);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FilterManager@d45d.composerAppendNodesWithTags$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.composerAppendNodesWithTags$1");
            }
        });
    }

    public final VideoFrame LLJL(RunnableC1271220jBY runnableC1271220jBY, VideoFrame videoFrame, int i, int i2, RoiInfo roiInfo, EffectWrapper.AlgorithmResult algorithmResult) {
        Matrix matrix;
        k kVarLIZ;
        if (C1273520jFG.LIZJ) {
            if (this.c == null) {
                Matrix matrix2 = new Matrix();
                this.c = matrix2;
                matrix2.reset();
                this.c.preTranslate(0.5f, 0.5f);
                this.c.preScale(1.0f, -1.0f);
                this.c.preTranslate(-0.5f, -0.5f);
            }
            matrix = this.c;
        } else {
            matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        }
        int i3 = runnableC1271220jBY.LL.LIZIZ;
        runnableC1271220jBY.LIZ();
        C1271780jCS c1271780jCS = this.LLZLI;
        if (c1271780jCS != null) {
            kVarLIZ = c1271780jCS.LJFF(i, i2, EnumC1273550jFJ.RGB, i3, matrix, this, runnableC1271220jBY, algorithmResult);
        } else {
            kVarLIZ = C1271950jCj.LIZ(i, i2, EnumC1273550jFJ.RGB, i3, matrix, this, runnableC1271220jBY, algorithmResult);
        }
        if (kVarLIZ == null) {
            runnableC1271220jBY.run();
            return null;
        }
        kVarLIZ.updateCaptureMs(videoFrame.getBuffer().getCaptureMs());
        kVarLIZ.updateCaptureServerNtpMs(videoFrame.getBuffer().getCaptureServerNtpMs());
        kVarLIZ.updateEffectServerNtpMs(videoFrame.getBuffer().getEffectServerNtpMs());
        kVarLIZ.setROIInfo(roiInfo);
        C1271790jCT c1271790jCT = this.LLZL;
        if (c1271790jCT != null) {
            VideoFrame videoFrameLIZLLL = c1271790jCT.LIZLLL(kVarLIZ, 0, videoFrame.getTimestampNs());
            if (videoFrameLIZLLL == null) {
                kVarLIZ.release();
            }
            return videoFrameLIZLLL;
        }
        return new VideoFrame(kVarLIZ, 0, videoFrame.getTimestampNs());
    }

    @Override // X.InterfaceC1268640j7O
    public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS0S0102104_20(this, j, f, f2, f3, f4, i, i2, 0));
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIJIIJI(int i, int i2, String str, String str2, boolean z, String str3, AssetManager assetManager, Object obj) {
        C786410Ut5.LJJZZIII(this.LLILZLL, new ARunnableS0S3322000_20(this, obj, assetManager, i, i2, str, str2, z, str3, 1));
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJJLZIJ(final String[] strArr, final int i, final String[] strArr2, final int i2, final String[] strArr3, final boolean z, final boolean z2, final boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("composerReplaceNodesWithTags, inMic: ");
        sbLIZ.append(z);
        sbLIZ.append(" inMusic: ");
        sbLIZ.append(z2);
        sbLIZ.append(" useOutput: ");
        sbLIZ.append(z3);
        AVLog.logKibana(4, "FilterManager", C2188811AlT.LIZIZ(sbLIZ), null);
        final String strLLJJI = LLJJI(strArr, Integer.valueOf(i), strArr2, Integer.valueOf(i2), strArr3);
        C786410Ut5.LJJZZIII(this.LLILZLL, new Runnable() { // from class: X.0jD2
            public final void LIZ() {
                if (this.LLJI.isValid()) {
                    boolean z4 = z;
                    if (z4 || z2 || z3) {
                        C1272090jCx c1272090jCx = this.LLJI;
                        C786410Ut5.LJJZZIII(c1272090jCx.LLILZLL, new ARunnableS0S0130000_20(c1272090jCx, z4, z2, z3, 0));
                        this.LLJI.LLJJIJIIJIL.setEffectAudioGraphCfg(z, z2, z3);
                    } else {
                        C1272090jCx c1272090jCx2 = this.LLJI;
                        C786410Ut5.LJJZZIII(c1272090jCx2.LLILZLL, new ARunnableS120S0100000_20(c1272090jCx2, 170));
                    }
                    int iComposerReplaceNodesWithTags = this.LLJI.LLJJIJIIJIL.composerReplaceNodesWithTags(strArr, i, strArr2, i2, strArr3);
                    if (iComposerReplaceNodesWithTags != 0) {
                        this.LLJI.LLJZIJLIL.onError(iComposerReplaceNodesWithTags, strLLJJI);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FilterManager@d45d.composerReplaceNodesWithTags$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterManager@d45d.composerReplaceNodesWithTags$2");
            }
        });
    }
}
