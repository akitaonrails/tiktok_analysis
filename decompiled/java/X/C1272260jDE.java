package X;

import Y.ARunnableS0S0100005_20;
import Y.ARunnableS0S0101002_20;
import Y.ARunnableS0S0102104_20;
import Y.ARunnableS0S0130000_20;
import Y.ARunnableS0S1401000_20;
import Y.ARunnableS0S3100001_20;
import Y.ARunnableS0S3322000_20;
import Y.ARunnableS10S2100000_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS13S0301000_20;
import Y.ARunnableS1S1102000_20;
import Y.ARunnableS1S1301000_20;
import Y.ARunnableS24S1200000_20;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS26S0201000_20;
import Y.ARunnableS28S0400000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS5S1110000_20;
import Y.ARunnableS5S1201000_20;
import Y.ARunnableS5S2200000_20;
import Y.ARunnableS7S0100002_20;
import Y.ARunnableS89S0200000_20;
import Y.ARunnableS93S0000000_16;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.effect.NativeAudioStrange;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GLTexture;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272260jDE implements InterfaceC1268640j7O {
    public final AudioDeviceModule LL;
    public final Context LLILLJJLI;
    public final C1267500j5Y LLILLL;
    public final Handler LLILZ;
    public final boolean LLILZIL;
    public C1272130jD1 LLILZLL;
    public C1272100jCy LLIZ;
    public EffectWrapper LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public InterfaceC1272600jDm LLJIJIL;
    public C0UHF LLJJI;
    public InterfaceC1272580jDk LLJILJIL = new InterfaceC1272580jDk() { // from class: X.0jDJ
        @Override // X.InterfaceC1272580jDk
        public final void onError(int i, String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Effect api return error: ");
            sbLIZ.append(i);
            sbLIZ.append(". Calling info: ");
            sbLIZ.append(str);
            AVLog.ioe("EffectManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public final HashMap<String, String> LLJILJILJ = new HashMap<>();
    public int LLJILLL = -9;
    public int LLJJ = -9;
    public final CopyOnWriteArrayList<WeakReference<InterfaceC1272550jDh>> LLJJIII = new CopyOnWriteArrayList<>();
    public final C1272410jDT LLJJIJI = new InterfaceC1272550jDh() { // from class: X.0jDT
        @Override // X.InterfaceC1272550jDh
        public final void onFaceDetectResultCallback(int i) {
            C1272260jDE c1272260jDE = this.LL;
            Handler handler = c1272260jDE.LLILZ;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(i, c1272260jDE, 10));
            }
        }
    };

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJIILL(InterfaceC1269100j88 interfaceC1269100j88) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJIFFI() {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJIII() {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJIIZI(boolean z) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJIJIL(TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJIJL(boolean z) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJJIL(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJJJI(int i) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ int LJJJJIZL() {
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJJLZIJ(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3, boolean z, boolean z2, boolean z3) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ boolean LJJJZ() {
        return false;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ boolean LJJLI() {
        return false;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ InterfaceC1269100j88 LJJLL(Surface surface) {
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJJZZI(int i, boolean z) {
    }

    @Override // X.InterfaceC1268640j7O
    public final int LJLI() {
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ boolean LJLJJLL() {
        return false;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ int LJLJL() {
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJLJLJ() {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJLLI() {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJLLLL(boolean z) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LJZL() {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ JSONObject LLIIII() {
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ int LLIIIL() {
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LLIIIZ(C1267620j5k c1267620j5k) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LLIILII(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ float LLIIZ() {
        return 1.0f;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LLILIL(int i, boolean z) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ boolean LLILLJJLI() {
        return false;
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void LLILZLL(C1268900j7o c1268900j7o) {
    }

    @Override // X.InterfaceC1268640j7O
    /* JADX INFO: renamed from: composerSetNodesWithTags */
    public final /* synthetic */ void mo48composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
    }

    @Override // X.InterfaceC1268640j7O
    public final synchronized void release() {
        if (this.LLJI) {
            return;
        }
        this.LLILLL.LIZ.ttlhABSettingsConfigs.getClass();
        if (TTLHABSettingsConfigs.LJI.enableMemoryLeakOpt) {
            this.LLJJI = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Release filterManager ");
        sbLIZ.append(this);
        AVLog.ioi("EffectManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJI = true;
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 171));
        }
        C1283100jUi.LIZIZ(this.LLILZ, new ARunnableS93S0000000_16(6));
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void setContourInfoIndex(String str) {
    }

    @Override // X.InterfaceC1268640j7O
    public final /* synthetic */ void setServiceManager(InterfaceC1272820jE8 interfaceC1272820jE8) {
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJIJI() {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS25S1100000_20(this, 18));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int LJJLJLI() {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy == null) {
            return 0;
        }
        if (c1272100jCy.LJIIJ()) {
            return c1272100jCy.LLJJJJ.getValue();
        }
        return -(!c1272100jCy.LLJJIJIL.enable ? EnumC1272290jDH.ROI_SWITCH_REASON_SERVER_CONFIG.getValue() : !c1272100jCy.LLJJJ ? EnumC1272290jDH.ROI_SWITCH_REASON_HARDWARE_SUPPORT.getValue() : EnumC1272290jDH.ROI_SWITCH_REASON_SCENE_AVAILABLE.getValue());
    }

    @Override // X.InterfaceC1268640j7O
    public final String LJLLL() {
        this.LLILLL.LIZ.ttlhABSettingsConfigs.getClass();
        String[] strArr = {""};
        C1283100jUi.LIZIZ(this.LLILZ, new ARunnableS89S0200000_20(strArr, this, 116));
        return strArr[0];
    }

    @Override // X.InterfaceC1268640j7O
    public final double LJZ() {
        if (this.LLIZ != null) {
            return r0.LJFF("key_effect_out_fps").getFloat("key_effect_out_fps", 0.0f);
        }
        return 0.0d;
    }

    @Override // X.InterfaceC1268640j7O
    public final String LLFII() {
        String[] strArr = {""};
        if (this.LLIZLLLIL != null) {
            this.LLILLL.LIZ.ttlhABSettingsConfigs.getClass();
            C1283100jUi.LIZIZ(this.LLILZ, new ARunnableS89S0200000_20(strArr, this, 124));
        }
        return strArr[0];
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean LLIIIJ() {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            return c1272100jCy.LJIIJ();
        }
        return false;
    }

    @Override // X.InterfaceC1268640j7O
    public final double LLIIJI() {
        if (this.LLIZ != null) {
            return r0.LJFF("key_effect_avg_time").getFloat("key_effect_avg_time", 0.0f);
        }
        return 0.0d;
    }

    @Override // X.InterfaceC1268640j7O
    public final C0UD1 createEffectTrack() {
        Handler handler;
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy == null || !c1272100jCy.LLJJ || (handler = c1272100jCy.LLILZIL) == null) {
            return null;
        }
        C1272170jD5[] c1272170jD5Arr = new C1272170jD5[1];
        C1283100jUi.LIZIZ(handler, new ARunnableS89S0200000_20(c1272170jD5Arr, c1272100jCy, 113));
        return c1272170jD5Arr[0];
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean isValid() {
        EffectWrapper effectWrapper = this.LLIZLLLIL;
        return effectWrapper != null && effectWrapper.valid();
    }

    @Override // X.InterfaceC1268640j7O
    public final int pauseEffect() {
        Handler handler = this.LLILZ;
        if (handler == null) {
            return 0;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 187));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void prepareEffect() {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 186));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int resumeEffect() {
        Handler handler = this.LLILZ;
        if (handler == null) {
            return 0;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 192));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final String LLFZ() {
        EffectWrapper effectWrapper;
        if (!isValid() || (effectWrapper = this.LLIZLLLIL) == null) {
            return null;
        }
        return effectWrapper.getFrameProgressParams(128);
    }

    @Override // X.InterfaceC1268640j7O
    public final C1272130jD1 LJIIIIZZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1268640j7O
    public final InterfaceC1272120jD0 LJJJLL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1268640j7O
    public final Map<String, String> LJLZ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1268640j7O
    public final boolean isEnable() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LIZ(C0UD1 c0ud1) {
        Handler handler;
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null && c1272100jCy.LLJJ && (handler = c1272100jCy.LLILZIL) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(c0ud1, c1272100jCy, 115));
        }
    }

    public final void LIZIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(str) && a0.LJJIIZI(str, "face_extra_model_name", false)) {
                this.LLJILJILJ.put("face_extra_model_name", jSONObject.optString("face_extra_model_name"));
            }
            if (!TextUtils.isEmpty(str) && a0.LJJIIZI(str, "matting_model_name", false)) {
                this.LLJILJILJ.put("matting_model_name", jSONObject.optString("matting_model_name"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJIIL(InterfaceC1272550jDh interfaceC1272550jDh) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(interfaceC1272550jDh, this, 104));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJJJJ(boolean z) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS39S0110000_20(this, z, 12));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJJJL(int i) {
        this.LLJILLL = i;
    }

    @Override // X.InterfaceC1268640j7O
    public final VideoFrame LJJJJZ(VideoFrame videoFrame) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            VideoFrame[] videoFrameArr = new VideoFrame[1];
            C1283100jUi.LIZIZ(c1272100jCy.LLILZIL, new ARunnableS53S0300000_20(videoFrameArr, c1272100jCy, videoFrame, 29));
            return videoFrameArr[0];
        }
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJLIIIJILLIZJL(C1273620jFQ c1273620jFQ) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            c1272100jCy.LLJJIII = c1273620jFQ;
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJLIIIJLJLI(JSONObject jSONObject) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS24S1200000_20(this, jSONObject, 9));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJLIL(C1266750j4L c1266750j4L) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            c1272100jCy.LLJJLIIIJLLLLLLLZ = c1266750j4L;
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJLJ(C0UHF c0uhf) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(c0uhf, this, 111));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLIIL(boolean z) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setHardwareRoiSceneAvailable: ");
            sbLIZ.append(z);
            AVLog.logKibana(4, "VideoEffectNode", C2188811AlT.LIZIZ(sbLIZ), null);
            c1272100jCy.LLJJJIL = z;
            c1272100jCy.LLJJJJ = EnumC1272290jDH.ROI_SWITCH_REASON_SCENE_AVAILABLE;
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLILLLLZI(InterfaceC1272420jDU interfaceC1272420jDU) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            c1272100jCy.LLJJJJLIIL = interfaceC1272420jDU;
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJLJJI(boolean z) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            c1272100jCy.LLJJ = z;
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final AbstractC768410UCh LLD(AudioDeviceModule audioDeviceModule) {
        if (this.LLILZLL != null) {
            return new NativeAudioStrange(null, 48000, 2, false, audioDeviceModule);
        }
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LLIIIILZ(InterfaceC1272600jDm interfaceC1272600jDm) {
        this.LLJIJIL = interfaceC1272600jDm;
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(interfaceC1272600jDm, this, 114));
        }
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            c1272100jCy.LLJJL = interfaceC1272600jDm;
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void configSequenceCache(long j) {
        EffectWrapper effectWrapper;
        if (isValid() && (effectWrapper = this.LLIZLLLIL) != null) {
            effectWrapper.configSequenceCache(j);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void enable(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(" -> ");
        sbLIZ.append(z);
        AVLog.iod("EffectManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJ = z;
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            c1272100jCy.LLILZLL = z;
            InterfaceC1272420jDU interfaceC1272420jDU = c1272100jCy.LLJJJJLIIL;
            if (interfaceC1272420jDU != null) {
                interfaceC1272420jDU.LIZ();
            }
        }
        C1272130jD1 c1272130jD1 = this.LLILZLL;
        if (c1272130jD1 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enable ");
            sbLIZ2.append(c1272130jD1.LLIZ);
            sbLIZ2.append(" -> ");
            sbLIZ2.append(z);
            AVLog.iod("AudioEffectNode", C2188811AlT.LIZIZ(sbLIZ2));
            c1272130jD1.LLIZ = z;
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int enableMockFace(boolean z) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null && (!c1272100jCy.LLILLL.LIZIZ.LJI)) {
            c1272100jCy.LLJLLIL = z;
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void enableSetMD5ResourceFinder(boolean z) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS39S0110000_20(this, z, 13));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final EffectImageInfo getEffectCapturedImagewithKey(String str) {
        EffectWrapper effectWrapper;
        if (isValid() && (effectWrapper = this.LLIZLLLIL) != null) {
            return effectWrapper.getEffectCapturedImagewithKey(str);
        }
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final int notifyKeyboardHide(boolean z) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS39S0110000_20(this, 14));
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void refreshSequenceCacheStatus(boolean z) {
        EffectWrapper effectWrapper;
        if (isValid() && (effectWrapper = this.LLIZLLLIL) != null) {
            effectWrapper.refreshSequenceCacheStatus(z);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void setClientState(int i) {
        Thread thread;
        Looper looper;
        if (this.LLJJ == i) {
            return;
        }
        ARunnableS31S0101000_20 aRunnableS31S0101000_20 = new ARunnableS31S0101000_20(i, this, 11);
        Thread threadU3 = C786410Ut5.u3();
        Handler handler = this.LLILZ;
        if (handler != null && (looper = handler.getLooper()) != null) {
            thread = looper.getThread();
        } else {
            thread = null;
        }
        if (Intrinsics.LJFF(threadU3, thread)) {
            aRunnableS31S0101000_20.run();
            return;
        }
        Handler handler2 = this.LLILZ;
        if (handler2 == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler2, aRunnableS31S0101000_20);
    }

    @Override // X.InterfaceC1268640j7O
    public final void setEffectLogLevel(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEffectLogLevel : ");
        sbLIZ.append(3);
        AVLog.logKibana(4, "EffectManager", C2188811AlT.LIZIZ(sbLIZ), null);
        EffectWrapper effectWrapper = this.LLIZLLLIL;
        if (effectWrapper != null) {
            effectWrapper.setEffectLogLevel(3);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJII(InterfaceC1269980j9Y interfaceC1269980j9Y, EnumC1272790jE5 enumC1272790jE5) {
        C1272530jDf c1272530jDf;
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null && interfaceC1269980j9Y != null && c1272100jCy.LLJJIJIIJIL.containsKey(enumC1272790jE5) && (c1272530jDf = c1272100jCy.LLJJIJIIJIL.get(enumC1272790jE5)) != null) {
            c1272530jDf.LJIIIIZZ(interfaceC1269980j9Y);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIJLIJ(String str, String str2) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS10S2100000_20(this, str, str2, 7));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final VideoFrame LJJJJLL(GLTexture[] gLTextureArr, GLTexture gLTexture) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            VideoFrame[] videoFrameArr = new VideoFrame[1];
            C1283100jUi.LIZIZ(c1272100jCy.LLILZIL, new ARunnableS28S0400000_20(c1272100jCy, gLTextureArr, gLTexture, videoFrameArr, 12));
            return videoFrameArr[0];
        }
        return null;
    }

    @Override // X.InterfaceC1268640j7O
    public final void LLIIJLIL(boolean z, EnumC1272290jDH enumC1272290jDH) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            c1272100jCy.LLJJJ = z;
            c1272100jCy.LLJJJJ = enumC1272290jDH;
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerAppendNodes(String[] strArr, int i) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            String strLJIIL = C1272100jCy.LJIIL(strArr, 1);
            Handler handler = c1272100jCy.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS5S1201000_20(c1272100jCy, strArr, strLJIIL, 4));
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerRemoveNodes(String[] strArr, int i) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            InterfaceC1272420jDU interfaceC1272420jDU = c1272100jCy.LLJJJJLIIL;
            if (interfaceC1272420jDU != null) {
                interfaceC1272420jDU.LIZLLL(strArr);
            }
            Handler handler = c1272100jCy.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS26S0201000_20(c1272100jCy, i, strArr, 6));
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerSetMode(int i, int i2) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            String strLJIIL = C1272100jCy.LJIIL(1, 0);
            Handler handler = c1272100jCy.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS1S1102000_20(c1272100jCy, strLJIIL, 1));
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerSetNodes(String[] strArr, int i) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            String strLJIIL = C1272100jCy.LJIIL(strArr, Integer.valueOf(i));
            Handler handler = c1272100jCy.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS5S1201000_20(strArr, i, strLJIIL, c1272100jCy, 5));
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void processLongPressEvent(float f, float f2) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS7S0100002_20(this, f, f2, 4));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void processRotationEvent(float f, float f2) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS7S0100002_20(this, f, f2, 5));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void processScaleEvent(float f, float f2) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS7S0100002_20(this, f, f2, 6));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void processTouchEvent(float f, float f2) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS7S0100002_20(this, f, f2, 7));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int setCustomEffect(String str, String str2) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS10S2100000_20(this, str, str2, 8));
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int setEffect(String str, boolean z) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS5S1110000_20(this, str, z, 7));
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void setRenderCacheString(String str, String str2) {
        if (isValid()) {
            if (Intrinsics.LJFF("bone_file_path", str)) {
                LJJIJLIJ(str, str2);
                return;
            }
            EffectWrapper effectWrapper = this.LLIZLLLIL;
            if (effectWrapper != null) {
                effectWrapper.setRenderCacheString(str, str2);
            }
            LIZIZ(str2);
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
        String strJ3;
        int iLIZ;
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            if (strArr.length != strArr2.length) {
                strJ3 = "";
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        jSONArray.put(strArr[i2]);
                        jSONArray2.put(new JSONObject(strArr2[i2]));
                    }
                    jSONObject.put("node_paths", jSONArray);
                    jSONObject.put("node_tags", jSONArray2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C1274040jG6.LIZ()) {
                        throw new RuntimeException(e);
                    }
                }
                strJ3 = C786410Ut5.J3(jSONObject);
            }
            InterfaceC1272600jDm interfaceC1272600jDm = c1272100jCy.LLJJL;
            if (interfaceC1272600jDm != null) {
                InterfaceC1272570jDj interfaceC1272570jDj = c1272100jCy.LLJJLIIIJLLLLLLLZ;
                if (interfaceC1272570jDj != null) {
                    iLIZ = interfaceC1272570jDj.LIZ();
                } else {
                    iLIZ = 0;
                }
                interfaceC1272600jDm.onMessageReceived(4105, iLIZ, 0, strJ3);
            }
            InterfaceC1272420jDU interfaceC1272420jDU = c1272100jCy.LLJJJJLIIL;
            if (interfaceC1272420jDU != null) {
                interfaceC1272420jDU.LIZIZ(strArr);
            }
            c1272100jCy.LLILLL.LIZ.ttlhABSettingsConfigs.getClass();
            Handler handler = c1272100jCy.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS1S1301000_20(i, c1272100jCy, strJ3, strArr2, strArr, 1));
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        if (isValid() && iArr.length != 0 && this.LLIZLLLIL != null) {
            C1283100jUi.LIZIZ(this.LLILZ, new ARunnableS5S2200000_20(this, str, str2, iArr, 0));
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerPreloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy == null) {
            return -1;
        }
        c1272100jCy.LLILLL.LIZ.ttlhABSettingsConfigs.getClass();
        Handler handler = c1272100jCy.LLILZIL;
        if (handler == null) {
            return -1;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS13S0301000_20(i, c1272100jCy, strArr, strArr2, 3));
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            AVLog.logKibana(5, "VideoEffectNode", "composerSetNodesWithTags", null);
            String strLJIIL = C1272100jCy.LJIIL(strArr, Integer.valueOf(i), strArr2);
            Handler handler = c1272100jCy.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS1S1301000_20(i, c1272100jCy, strLJIIL, strArr, strArr2, 2));
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerUpdateNode(String str, String str2, float f) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            String strLJIIL = C1272100jCy.LJIIL(str, str2, Float.valueOf(f));
            Handler handler = c1272100jCy.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS0S3100001_20(c1272100jCy, str, str2, f, strLJIIL, 1));
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void processTouchDownEvent(float f, float f2, int i) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS0S0101002_20(this, i, f, f2, 2));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void processTouchUpEvent(float f, float f2, int i) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS0S0101002_20(this, i, f, f2, 3));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void setEffectAudioGraphCfg(boolean z, boolean z2, boolean z3) {
        C1272130jD1 c1272130jD1 = this.LLILZLL;
        if (c1272130jD1 != null) {
            if (!z && !z2 && !z3) {
                Handler handler = c1272130jD1.LLIZLLLIL;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1272130jD1, 172));
                    return;
                }
                return;
            }
            Handler handler2 = c1272130jD1.LLIZLLLIL;
            if (handler2 == null) {
                return;
            }
            C786410Ut5.LJJZZIII(handler2, new ARunnableS0S0130000_20(c1272130jD1, z, z2, z3, 1));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null) {
            String strLJIIL = C1272100jCy.LJIIL(Integer.valueOf(i), strArr, strArr2, fArr);
            Handler handler = c1272100jCy.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS0S1401000_20(fArr, i, c1272100jCy, strArr, strArr2, strLJIIL, 1));
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int sendEffectMsg(final int i, final int i2, final int i3, final String str) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jDS
                @Override // java.lang.Runnable
                public final void run() {
                    C1272260jDE c1272260jDE = this.LL;
                    int i4 = i;
                    int i5 = i2;
                    int i6 = i3;
                    String str2 = str;
                    C1C7U.LIZ("EffectManager@a3e3.sendEffectMsg$1L");
                    if (c1272260jDE.isValid()) {
                        c1272260jDE.LLIZLLLIL.sendEffectMsg(i4, i5, i6, str2);
                    }
                    C1C7U.LIZIZ("EffectManager@a3e3.sendEffectMsg$1L");
                }
            });
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final int setInputText(final String str, final int i, final int i2, final String str2) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jDO
                @Override // java.lang.Runnable
                public final void run() {
                    int inputText;
                    C1272260jDE c1272260jDE = this.LL;
                    String str3 = str;
                    int i3 = i;
                    int i4 = i2;
                    String str4 = str2;
                    C1C7U.LIZ("EffectManager@a3e3.setInputText$1L");
                    if (c1272260jDE.isValid()) {
                        EffectWrapper effectWrapper = c1272260jDE.LLIZLLLIL;
                        if (effectWrapper != null) {
                            inputText = effectWrapper.setInputText(str3, i3, i4, str4);
                            if (inputText != 0) {
                            }
                        } else {
                            inputText = -1;
                        }
                        c1272260jDE.LLJILJIL.onError(inputText, "setInputText");
                    }
                    C1C7U.LIZIZ("EffectManager@a3e3.setInputText$1L");
                }
            });
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0jDT] */
    public C1272260jDE(AudioDeviceModule audioDeviceModule, Context context, C1267500j5Y c1267500j5Y, Handler handler, boolean z) {
        this.LL = audioDeviceModule;
        this.LLILLJJLI = context;
        this.LLILLL = c1267500j5Y;
        this.LLILZ = handler;
        this.LLILZIL = z;
        C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(this, 180));
    }

    @Override // X.InterfaceC1268640j7O
    public final int composerReplaceNodesWithTags(final String[] strArr, final int i, final String[] strArr2, final int i2, final String[] strArr3) {
        Handler handler;
        final C1272100jCy c1272100jCy = this.LLIZ;
        if (c1272100jCy != null && (handler = c1272100jCy.LLILZIL) != null) {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jDN
                @Override // java.lang.Runnable
                public final void run() {
                    C1272100jCy c1272100jCy2 = c1272100jCy;
                    String[] strArr4 = strArr3;
                    String[] strArr5 = strArr;
                    int i3 = i;
                    String[] strArr6 = strArr2;
                    int i4 = i2;
                    C1C7U.LIZ("VideoEffectNode@5e69.composerReplaceNodesWithTags$1L");
                    if (c1272100jCy2.LJIILIIL()) {
                        c1272100jCy2.LJIIJJI(strArr4);
                        InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy2.LLILZ;
                        if (interfaceC1272120jD0 != null) {
                            interfaceC1272120jD0.composerReplaceNodesWithTags(strArr5, i3, strArr6, i4, strArr4);
                        }
                    }
                    C1C7U.LIZIZ("VideoEffectNode@5e69.composerReplaceNodesWithTags$1L");
                }
            });
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC1268640j7O
    public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS0S0100005_20(this, f, f2, f3, f4, f5, 1));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS0S0102104_20(this, j, f, f2, f3, f4, i, i2, 1));
        }
    }

    @Override // X.InterfaceC1268640j7O
    public final void LJJIJIIJI(int i, int i2, String str, String str2, boolean z, String str3, AssetManager assetManager, Object obj) {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS0S3322000_20(this, obj, assetManager, i, i2, str, str2, z, str3, 0));
        }
    }
}
