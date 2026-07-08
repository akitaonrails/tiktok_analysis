package X;

import Y.ARunnableS120S0100000_20;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.media.ttlhadaptive.TTLHAdaptiveConfig;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategySettingConfig;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.lyrax.augur.AugurAdaptiveWrapper;
import com.ss.lyrax.augur.AugurConfigExtraInfo;
import com.ss.lyrax.augur.AugurConfigSource;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.net.LyraxNetworkQuality;
import com.ss.lyrax.ttlh_adapter.TTLHOptionCenter;
import com.ss.lyrax.ttlh_adapter.push_param.SDKSettingsConfig;
import com.ss.lyrax.ttlh_adapter.settings_param.ABSettingsConfigs;
import com.ss.lyrax.video.MemoryConfig;
import com.ss.ttlivestreamer.core.scene_detect.ITTLHSceneDetectResourceHandler;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.SandboxParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsAdaptiveConfigs;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import com.ss.ttlivestreamer.livestreamv2.tinyjson.GsonIncrementalTypeAdapterUtils;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1269160j8E {
    public GsonIncrementalTypeAdapterUtils LIZIZ;
    public boolean LJ;
    public String LJFF;
    public InterfaceC1266360j3i LJI;
    public C1269910j9R LJII;
    public JSONObject LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public C1274010jG3 LJIJJLI;
    public Intent LJJ;
    public boolean LJJI;
    public List<String> LJJII;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public String LJJJJZ;
    public C1269780j9E LJJLIIIIJ;
    public AugurAdaptiveWrapper LJJLIIIJILLIZJL;
    public List<BitrateConfig> LJJLL;
    public ITTLHSceneDetectResourceHandler LJLJLLL;
    public C1267200j54 LJLLLLLL;
    public LiveSdkSetting LIZ = new LiveSdkSetting();
    public String LIZJ = "";
    public final boolean LIZLLL = true;
    public boolean LJIIIIZZ = true;
    public int LJIIIZ = 0;
    public int LJIIJ = -1;
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public int LJIILJJIL = 500;
    public int LJIILL = 0;
    public final int LJIILLIIL = 16;
    public String LJIIZILJ = "";
    public boolean LJIL = false;
    public boolean LJJIFFI = true;
    public String LJJIII = "";
    public String LJJIIJ = "";
    public boolean LJJIJ = false;
    public final int LJJIJIIJI = 9;
    public final int LJJIJIIJIL = 16;
    public int LJJIJIL = 76800;
    public boolean LJJIJL = true;
    public int LJJIJLIJ = LSPassThroughRecordSizeConfig.DEFAULT;
    public Handler LJJIL = null;
    public boolean LJJIZ = false;
    public int LJJJ = 2;
    public int LJJJI = 5;
    public boolean LJJJIL = false;
    public boolean LJJJJ = true;
    public EnumC1269710j97 LJJJJJL = EnumC1269710j97.LIVESTREAM_CREATED;
    public int LJJJJL = 0;
    public int LJJJJLI = 5;
    public int LJJJJLL = 3;
    public boolean LJJJJZI = true;
    public long LJJJLIIL = 600;
    public boolean LJJJLL = false;
    public boolean LJJJLZIJ = false;
    public int LJJJZ = -1;
    public int LJJL = -1;
    public C1266610j47 LJJLI = new C1266610j47();
    public int LJJLIIIJ = 0;
    public boolean LJJLIIIJJI = false;
    public boolean LJJLIIIJJIZ = false;
    public String LJJLIIIJL = "";
    public boolean LJJLIIIJLJLI = false;
    public boolean LJJLIIIJLLLLLLLZ = false;
    public boolean LJJLIIJ = true;
    public boolean LJJLIL = false;
    public boolean LJJLJ = true;
    public int LJJLJLI = 1;
    public int LJJZ = -1;
    public int LJJZZI = -1;
    public Map<String, String> LJJZZIII = null;
    public int LJL = -1;
    public int LJLI = -1;
    public int LJLIIIL = 1;
    public C1266620j48 LJLIIL = new C1266620j48();
    public boolean LJLIL = false;
    public boolean LJLILLLLZI = true;
    public final C1269140j8C LJLJI = new C1269140j8C();
    public EnumC1276810jKZ LJLJJI = EnumC1276810jKZ.VERTICAL;
    public boolean LJLJJL = false;
    public boolean LJLJJLL = false;
    public boolean LJLJL = true;
    public boolean LJLJLJ = false;
    public boolean LJLL = false;
    public int LJLLI = -1;
    public boolean LJLLILLLL = false;
    public boolean LJLLJ = false;
    public int LJLLL = 24;
    public int LJLLLL = 20;

    public InterfaceC1266960j4g LJIJI() {
        return null;
    }

    public final synchronized C1269910j9R LJIJJ() {
        if (this.LJII == null && this.LIZ.mPushBase.LJIILLIIL()) {
            this.LJII = new C1269910j9R();
        }
        return this.LJII;
    }

    public final void LJJJJJ() {
        this.LJLJI.LJIIL = null;
    }

    public final void LJJLIIIJLJLI() {
        this.LJLJI.LJIJI = true;
    }

    public final boolean LIZJ() {
        return this.LJJLIIIJJI || LIZLLL();
    }

    public final boolean LIZLLL() {
        StrategySettingConfig strategySettingConfig;
        TTLHAdaptiveConfig tTLHAdaptiveConfig = this.LIZ.LJIIIIZZ.adaptiveConfig;
        return (tTLHAdaptiveConfig == null || (strategySettingConfig = tTLHAdaptiveConfig.strategySettingConfig) == null || strategySettingConfig.enableTTLHAdaptive != 1) ? false : true;
    }

    public final boolean LJ() {
        StrategySettingConfig strategySettingConfig;
        TTLHAdaptiveConfig tTLHAdaptiveConfig = this.LIZ.LJIIIIZZ.adaptiveConfig;
        return (tTLHAdaptiveConfig == null || (strategySettingConfig = tTLHAdaptiveConfig.strategySettingConfig) == null || strategySettingConfig.enableStarShip != 1) ? false : true;
    }

    public final int LJFF() {
        int i = this.LJLLI;
        return i < 0 ? this.LIZ.mPushBase.LJJ() : i;
    }

    public final String LJI() {
        String str = this.LJLJI.LJJIL.LIZJ;
        return (str == null || str.isEmpty()) ? "5dad71914d894800389238d8" : str;
    }

    public final String LJII() {
        return this.LJLJI.LJJIL.LJ;
    }

    public final C1267540j5c LJIIIIZZ() {
        return this.LIZ.captureBase.audioCapture;
    }

    public final int LJIIIZ() {
        PushBase pushBase = this.LIZ.mPushBase;
        if (pushBase.LJ == -1) {
            pushBase.LJ = 1;
        }
        return pushBase.LJ;
    }

    public final int LJIIJ() {
        return this.LIZ.mPushBase.LIZLLL();
    }

    public final int LJIIJJI() {
        return this.LIZ.mPushBase.LJIIJ;
    }

    public final EnumC1277260jLI LJIIL() {
        return this.LJLJI.LJJIJLIJ.LJIIJJI;
    }

    public final float LJIILL() {
        StrategySettingConfig strategySettingConfig;
        TTLHAdaptiveConfig tTLHAdaptiveConfig = this.LIZ.LJIIIIZZ.adaptiveConfig;
        if (tTLHAdaptiveConfig == null || (strategySettingConfig = tTLHAdaptiveConfig.strategySettingConfig) == null) {
            return 1.0f;
        }
        return strategySettingConfig.enableTTLHAdaptive;
    }

    public final C09D1 LJIILLIIL() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new GsonIncrementalTypeAdapterUtils(this.LIZ);
        }
        return this.LIZIZ;
    }

    public final int LJIIZILJ() {
        return this.LJLJI.LJJJJ;
    }

    public final int LJIJ() {
        return this.LJLJI.LJJJIL;
    }

    public final PushBase LJIJJLI() {
        return this.LIZ.mPushBase;
    }

    public final JSONObject LJJ() {
        if (this.LJIJ == null && this.LJLJI.LJJJLIIL && this.LJIJI != null) {
            try {
                this.LJIJ = new JSONObject(this.LJIJI);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        return this.LJIJ;
    }

    public final String LJJI() {
        if (!TextUtils.isEmpty(this.LJFF)) {
            return this.LJFF;
        }
        if (TextUtils.isEmpty(this.LIZ.LJFF())) {
            this.LJFF = UUID.randomUUID().toString().replace("-", "");
        } else {
            this.LJFF = this.LIZ.LJFF();
        }
        return this.LJFF;
    }

    public final int LJJIFFI() {
        return this.LIZ.mPushBase.LJFF();
    }

    public final CaptureBase.VideoCaptureParams LJJIIZ() {
        return this.LIZ.captureBase.videoCapture;
    }

    public final int LJJIJ() {
        PushBase pushBase = this.LIZ.mPushBase;
        if (pushBase.LIZIZ == -1) {
            pushBase.LIZIZ = 1;
        }
        return pushBase.LIZIZ;
    }

    public final int LJJIJIIJI() {
        return this.LIZ.mPushBase.LJJ();
    }

    public final int LJJIJIL() {
        return this.LIZ.mPushBase.LJJIIZ();
    }

    public final int LJJIJL() {
        return this.LIZ.mPushBase.LJJIIZI();
    }

    public final String LJJIJLIJ() {
        return this.LJLJI.LJJIJLIJ.LJIIL;
    }

    public final boolean LJJIZ() {
        C1268810j7f c1268810j7f = this.LJLJI.LJJIL;
        return c1268810j7f.LIZ && !c1268810j7f.LJFF;
    }

    public final boolean LJJJ() {
        return this.LJLJI.LJJIL.LIZ;
    }

    public final boolean LJJJI() {
        return this.LJJLIIIJJI || this.LJJLIIIJJIZ;
    }

    public final boolean LJJJIL() {
        C1269140j8C c1269140j8C = this.LJLJI;
        C1268810j7f c1268810j7f = c1269140j8C.LJJIL;
        if (!c1268810j7f.LIZ || c1268810j7f.LJFF) {
            return c1269140j8C.LJJIII;
        }
        return true;
    }

    public final void LJJJJI() {
        C1269910j9R c1269910j9R = this.LJII;
        if (c1269910j9R != null) {
            synchronized (c1269910j9R) {
                c1269910j9R.LIZ.clear();
                BPEAHandler bPEAHandler = c1269910j9R.LIZLLL;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacks(c1269910j9R.LJ);
                }
                HandlerThread handlerThread = c1269910j9R.LIZJ;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    c1269910j9R.LIZJ = null;
                }
                c1269910j9R.LIZLLL = null;
                c1269910j9R.LJFF = false;
                c1269910j9R.LIZIZ = new C1269820j9I(0, LyraxNetworkQuality.UNKNOWN.value(), 0);
            }
            this.LJII = null;
        }
        this.LIZ.ttlhABSettingsConfigs.getClass();
        MemoryConfig memoryConfig = TTLHABSettingsConfigs.LJI;
        if (!memoryConfig.getNotSetContextNull()) {
            this.LJLJI.LJIIZILJ = null;
        }
        C1269140j8C c1269140j8C = this.LJLJI;
        c1269140j8C.LJIIL = null;
        c1269140j8C.LJIJJLI = null;
        this.LIZ.ttlhABSettingsConfigs.getClass();
        if (memoryConfig.getEnableMemoryLeakOpt()) {
            C1269140j8C c1269140j8C2 = this.LJLJI;
            c1269140j8C2.LJJIIJ = null;
            c1269140j8C2.LJJIIJZLJL = null;
        } else {
            this.LJLJI.LJJIIJ = new InterfaceC1266880j4Y() { // from class: X.0j8J
                @Override // X.InterfaceC1266880j4Y
                public final void LIZ(JSONObject jSONObject) {
                }
            };
        }
        this.LIZ.ttlhABSettingsConfigs.getClass();
        memoryConfig.getEnableMemoryLeakOpt();
        this.LJJ = null;
    }

    public final void LJJLIIIJ() {
        this.LJLJI.LJJIL.LIZLLL = true;
    }

    public final void LJJLJLI() {
        int i = this.LJL;
        if (i <= 0 || this.LJJLL == null) {
            return;
        }
        String strValueOf = String.valueOf(i);
        for (BitrateConfig bitrateConfig : this.LJJLL) {
            if (TextUtils.equals(bitrateConfig.level, strValueOf)) {
                int i2 = bitrateConfig.width;
                int i3 = bitrateConfig.height;
                if (i2 <= 0 || i3 <= 0) {
                    return;
                }
                LJJLIIIJLLLLLLLZ(i2, i3);
                return;
            }
        }
    }

    public final void LJJLL() {
        int i = this.LJLI;
        if (i > 0 && this.LJJLL != null) {
            String strValueOf = String.valueOf(i);
            Iterator<BitrateConfig> it2 = this.LJJLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BitrateConfig next = it2.next();
                if (TextUtils.equals(next.level, strValueOf)) {
                    int i2 = next.width;
                    int i3 = next.height;
                    if (i2 > 0 && i3 > 0) {
                        LJJJJLL(i2, i3);
                    }
                }
            }
        }
        int iLJIILJJIL = LJIILJJIL(1);
        int iLJIILIIL = LJIILIIL(1);
        C1269140j8C c1269140j8C = this.LJLJI;
        c1269140j8C.LJJJJI = iLJIILJJIL;
        c1269140j8C.LJJJJIZL = iLJIILIIL;
    }

    public final String LJIL() {
        if (LJJIZ()) {
            InterfaceC1266360j3i interfaceC1266360j3i = this.LJI;
            return interfaceC1266360j3i != null ? (interfaceC1266360j3i.LJIIJJI() && this.LJLJI.LIZ.LJIILIIL()) ? "anchor_net_noroom_native" : (interfaceC1266360j3i.LJIIJJI() && this.LJLJI.LIZ.LIZ()) ? "anchor_net_noroom_join_room_once" : interfaceC1266360j3i.LJIIJJI() ? "anchor_net_noroom" : "anchor_net" : "anchor_net";
        }
        C1269140j8C c1269140j8C = this.LJLJI;
        C1268810j7f c1268810j7f = c1269140j8C.LJJIL;
        return c1268810j7f.LJI ? "anchor_net_noroom_fallback" : c1268810j7f.LJFF ? "anchor_net_fallback" : (c1268810j7f.LIZ || c1269140j8C.LJJIII) ? "pusher_v1" : c1269140j8C.LIZ.LJIIJJI() ? "guest_rtc_v2" : "";
    }

    public final int LJJII() {
        return LJJIIZ().LIZ;
    }

    public final int LJJIII() {
        return LJJIIZ().LJ();
    }

    public final int LJJIIJ() {
        return LJJIIZ().LJI();
    }

    public final int LJJIIJZLJL() {
        return LJJIIZ().LIZJ;
    }

    public final int LJJIIZI() {
        return LJJIIZ().LJIIJJI();
    }

    public final boolean LJJJJ() {
        return LJJIIZ().LJIIJ();
    }

    public final void LIZ(ARunnableS120S0100000_20 aRunnableS120S0100000_20) {
        this.LJLJI.LJJJLL.add(aRunnableS120S0100000_20);
    }

    public final int LJIILIIL(int i) {
        int i2;
        PushBase pushBase = this.LIZ.mPushBase;
        int i3 = pushBase.capAdaptedWidth;
        int i4 = pushBase.capAdaptedHeight;
        C1271260jBc c1271260jBc = C1271270jBd.LIZ.LIZ;
        if (i4 > 0) {
            if (c1271260jBc.LJFF(i) && (i3 * 1.0f) / i4 >= c1271260jBc.LIZLLL() && (i2 = c1271260jBc.LJJI) > 0) {
                return (((i4 + i2) - 1) / i2) * i2;
            }
            return i4;
        }
        c1271260jBc.getClass();
        return i4;
    }

    public final int LJIILJJIL(int i) {
        PushBase pushBase = this.LIZ.mPushBase;
        return C1271270jBd.LIZ.LIZ.LJ(pushBase.capAdaptedWidth, pushBase.capAdaptedHeight, i);
    }

    public final int LJJIJIIJIL(int i) {
        int i2;
        C1269140j8C c1269140j8C = this.LJLJI;
        int i3 = c1269140j8C.LJIILIIL;
        int i4 = c1269140j8C.LJIILJJIL;
        C1271260jBc c1271260jBc = C1271270jBd.LIZ.LIZ;
        if (i4 > 0) {
            if (c1271260jBc.LJFF(i) && (i3 * 1.0f) / i4 >= c1271260jBc.LIZLLL() && (i2 = c1271260jBc.LJJI) > 0) {
                return (((i4 + i2) - 1) / i2) * i2;
            }
            return i4;
        }
        c1271260jBc.getClass();
        return i4;
    }

    public final int LJJIL(int i) {
        C1269140j8C c1269140j8C = this.LJLJI;
        return C1271270jBd.LIZ.LIZ.LJ(c1269140j8C.LJIILIIL, c1269140j8C.LJIILJJIL, i);
    }

    public final void LJJJJIZL(List<BitrateConfig> list) {
        String string;
        if (LJJII() == 3) {
            if (list != null) {
                string = list.toString();
            } else {
                string = "null";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setAdaptiveBitrateConfigList:");
            sbLIZ.append(string);
            AVLog.iow("LiveStreamBuilder", C2188811AlT.LIZIZ(sbLIZ));
            AVLog.logKibana(5, "LiveStreamBuildersetBitrateList", string, null);
        }
        this.LJJLL = list;
    }

    public final void LJJJJJL(int i) {
        PushBase pushBase = this.LIZ.mPushBase;
        if (pushBase.LJ == -1 || !pushBase.LJIJJ) {
            pushBase.LJ = i;
        }
    }

    public final void LJJJJL(int i) {
        this.LIZ.mPushBase.LJJJJJL(i);
    }

    public final void LJJJJLI(int i) {
        if (LJJIIZ().cameraLogLevel == -1) {
            LJJIIZ().cameraLogLevel = i;
        }
    }

    public final void LJJJJZI(boolean z) {
        this.LJLL = z;
        SDKSettingsConfig sDKSettingsConfig = this.LIZ.LJIILL;
        if (sDKSettingsConfig != null) {
            sDKSettingsConfig.setIncrementalParsing(z);
        }
        LiveSdkSetting liveSdkSetting = this.LIZ;
        liveSdkSetting.mPushBase.LJIJJ = z;
        CaptureBase captureBase = liveSdkSetting.captureBase;
        captureBase.videoCapture.LJII = z;
        captureBase.audioCapture.getClass();
    }

    public final void LJJJLIIL(String str) {
        String strLIZIZ;
        if (str != null && str.length() > 32) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, 32));
            sbLIZ.append("...");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = str;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("set metadata_encoder: ");
        sbLIZ2.append(strLIZIZ);
        AVLog.logToIODeviceInternal(4, "LiveStreamBuilder", C2188811AlT.LIZIZ(sbLIZ2), new Throwable());
        this.LJIIZILJ = str;
    }

    public final void LJJJLL(int i) {
        this.LJLJI.LJJIJLIJ.LJFF = i;
    }

    public final void LJJJLZIJ(double d) {
        this.LJLJI.LJJIJLIJ.LJIIJ = d;
    }

    public final void LJJJZ(int i) {
        this.LJLJI.LJJIJLIJ.LJIIIZ = i;
    }

    public final void LJJL(String str) {
        if (this.LIZ.mPushBase.LJIIL.LIZIZ() && this.LJLL) {
            return;
        }
        synchronized (this.LIZ.mPushBase.LJIIL) {
            try {
                PushBase.Roi roiLIZ = this.LIZ.mPushBase.LJIIL.LIZ(1, false);
                if (roiLIZ == null) {
                    roiLIZ = new PushBase.Roi();
                }
                roiLIZ.roiAssetDir = str;
                this.LIZ.mPushBase.LJIIL.LIZJ(1, false, roiLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJLIIIJILLIZJL(int i) {
        if (LJJII() != 1 && LJJII() != 2) {
            this.LJJJJJL = EnumC1269710j97.DEFAULT;
        } else {
            this.LJJJJJL = EnumC1269710j97.fromInt(i);
        }
    }

    public final void LJJLIIIJJI(String str) {
        this.LIZ.LJIIIZ.adaptiveABConfigString = str;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("effect_strategy");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("enable") == 1 && jSONObjectOptJSONObject.optInt("enable_effect_model_strategy") == 1) {
                this.LJLJJLL = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJLIIIJL(String str) {
        LyraxScene lyraxScene;
        try {
            if (LJJJI() && AugurAdaptiveWrapper.getInstance() != null) {
                TTLHABSettingsConfigs tTLHABSettingsConfigs = new TTLHABSettingsConfigs();
                tTLHABSettingsConfigs.LIZIZ = true;
                if (this.LJLJI.LJJIII) {
                    lyraxScene = LyraxScene.LIVE;
                } else {
                    lyraxScene = LyraxScene.LINKMIC;
                }
                AugurAdaptiveWrapper.getInstance().updateConfig(str, new AugurConfigExtraInfo(AugurConfigSource.SETTINGS_CONFIG, lyraxScene));
                ABSettingsConfigs aBSettingsConfigsQueryABSettingsConfig = TTLHOptionCenter.getInstance().queryABSettingsConfig();
                if (aBSettingsConfigsQueryABSettingsConfig != null) {
                    tTLHABSettingsConfigs.LIZJ = aBSettingsConfigsQueryABSettingsConfig;
                }
                this.LIZ.ttlhABSettingsConfigs = tTLHABSettingsConfigs;
                if (C1267520j5a.LIZ()) {
                    AVLog.logKibana(5, "LiveStreamBuilderttlhsettingsWithAugur", C1975007oS.LIZIZ(aBSettingsConfigsQueryABSettingsConfig), null);
                    AVLog.logKibana(5, "LiveStreamBuilderttlhsettingsConfig", str, null);
                }
            } else if (this.LJLJI.LJJJLIIL) {
                TTLHABSettingsConfigs tTLHABSettingsConfigs2 = (TTLHABSettingsConfigs) ((GsonIncrementalTypeAdapterUtils) LJIILLIIL()).LIZIZ(str, TTLHABSettingsConfigs.class);
                if (tTLHABSettingsConfigs2 != null) {
                    this.LIZ.ttlhABSettingsConfigs = tTLHABSettingsConfigs2;
                }
            } else {
                ((GsonIncrementalTypeAdapterUtils) LJIILLIIL()).LIZ(this.LIZ.ttlhABSettingsConfigs, str);
            }
            if (C1267520j5a.LIZ() && !LJJJI()) {
                String strLIZIZ = C1975007oS.LIZIZ(this.LIZ.ttlhABSettingsConfigs);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LiveStreamBuilderttlhsettings");
                sbLIZ.append(LJJJI());
                AVLog.logKibana(5, C2188811AlT.LIZIZ(sbLIZ), strLIZIZ, null);
                AVLog.logKibana(5, "LiveStreamBuilderttlhsettingsConfig", str, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.logKibanaEvent(6, "LiveStreamBuilder", "ttlh_live_ab_settings", false, "setTTLHLiveABSettings failed LiveStreamBuilder:", e);
            if (C1274040jG6.LIZ()) {
                throw new AndroidRuntimeException("LiveStreamBuilder ttlh_live_ab_settings setTTLHLiveABSettings failed", e);
            }
        }
    }

    public final void LJJLIIJ(int i) {
        PushBase pushBase = this.LIZ.mPushBase;
        if (pushBase.LIZIZ == -1 || !pushBase.LJIJJ) {
            pushBase.LIZIZ = i;
        }
    }

    public final int LJJLIL(int i) {
        this.LIZ.mPushBase.LJJJJLI(i);
        if (this.LJI != null) {
            return this.LJI.LJIJJLI(new C1269290j8R(this.LIZ.mPushBase.LJJ()));
        }
        return 0;
    }

    public final void LJJZ(String str) {
        LyraxScene lyraxScene;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LJLJI.LJJIII) {
            lyraxScene = LyraxScene.LIVE;
        } else {
            lyraxScene = LyraxScene.LINKMIC;
        }
        AugurAdaptiveWrapper.getInstance().updateConfig(str, new AugurConfigExtraInfo(AugurConfigSource.ROOM_CREATE_CONFIG, lyraxScene));
        LiveSdkSetting liveSdkSetting = new LiveSdkSetting();
        liveSdkSetting.LJIILJJIL = true;
        liveSdkSetting.mPushBase.LJIJ = true;
        liveSdkSetting.mVPassInteractCfg.LJ = true;
        CaptureBase captureBase = liveSdkSetting.captureBase;
        captureBase.videoCapture.LJIIIIZZ = true;
        captureBase.audioCapture.getClass();
        SDKSettingsConfig sDKSettingsConfigQuerySDKSettingsConfig = TTLHOptionCenter.getInstance().querySDKSettingsConfig();
        if (sDKSettingsConfigQuerySDKSettingsConfig != null) {
            liveSdkSetting.LJIILL = sDKSettingsConfigQuerySDKSettingsConfig;
            SandboxParams sandboxParams = liveSdkSetting.sandboxParams;
            if (sandboxParams != null) {
                sandboxParams.LIZIZ(sDKSettingsConfigQuerySDKSettingsConfig.mCommonConfig);
            }
            PushBase pushBase = liveSdkSetting.mPushBase;
            if (pushBase != null) {
                pushBase.LJIJI = sDKSettingsConfigQuerySDKSettingsConfig.mPushBaseConfig;
            }
            VPassInteractCfg vPassInteractCfg = liveSdkSetting.mVPassInteractCfg;
            if (vPassInteractCfg != null) {
                vPassInteractCfg.LJFF = sDKSettingsConfigQuerySDKSettingsConfig.mInteractConfig;
            }
            CaptureBase captureBase2 = liveSdkSetting.captureBase;
            if (captureBase2 != null) {
                captureBase2.videoCapture.LJIIIZ = sDKSettingsConfigQuerySDKSettingsConfig.mCaptureBaseConfig;
                captureBase2.audioCapture.getClass();
            }
        }
        if (C1267520j5a.LIZ()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            String strLIZIZ = C1975007oS.LIZIZ(sDKSettingsConfigQuerySDKSettingsConfig);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveStreamBuildersetupsdkParamsConfigWithAugur, cost:");
            sbLIZ.append(jCurrentTimeMillis2);
            AVLog.logKibana(5, C2188811AlT.LIZIZ(sbLIZ), this.LJIJI, null);
            AVLog.logKibana(5, "LiveStreamBuildersetupsdkParamsObjectWithAugur", strLIZIZ, null);
        }
        this.LIZ = liveSdkSetting;
    }

    public final void LJJJJLL(int i, int i2) {
        PushBase pushBase = this.LIZ.mPushBase;
        pushBase.capAdaptedWidth = i;
        pushBase.capAdaptedHeight = i2;
    }

    public final void LJJLIIIIJ(int i, boolean z) {
        if (!this.LIZ.mPushBase.LJIIL.LIZIZ() || !this.LJLL) {
            if (z) {
                LJJLI(i, 1, true);
                LJJLI(i, 2, true);
            } else {
                LJJLI(i, 1, false);
                LJJLI(i, 2, false);
            }
        }
    }

    public final void LJJLIIIJJIZ(IStarShipStrategy iStarShipStrategy, String str) {
        try {
            if (this.LJLJI.LJJJLIIL) {
                TTLHABSettingsAdaptiveConfigs tTLHABSettingsAdaptiveConfigs = (TTLHABSettingsAdaptiveConfigs) ((GsonIncrementalTypeAdapterUtils) LJIILLIIL()).LIZIZ(str, TTLHABSettingsAdaptiveConfigs.class);
                if (tTLHABSettingsAdaptiveConfigs != null) {
                    this.LIZ.LJIIIIZZ = tTLHABSettingsAdaptiveConfigs;
                }
            } else {
                ((GsonIncrementalTypeAdapterUtils) LJIILLIIL()).LIZ(this.LIZ.LJIIIIZZ, str);
            }
            this.LIZ.LJIIIIZZ.adaptiveConfig.LIZIZ = iStarShipStrategy;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.logKibanaEvent(6, "LiveStreamBuilder", "ttlh_adaptive_config", false, "setTTLHAdaptiveConfigs failed LiveStreamBuilder:", e);
            if (C1274040jG6.LIZ()) {
                throw new AndroidRuntimeException("LiveStreamBuilderttlh_adaptive_config setTTLHAdaptiveConfigs failed", e);
            }
        }
    }

    public final void LJJLIIIJLLLLLLLZ(int i, int i2) {
        LJJIIZ().LJIILL(i);
        LJJIIZ().LJIILIIL(i2);
    }

    public final int LJJLJ(int i, int i2) {
        C1269140j8C c1269140j8C = this.LJLJI;
        c1269140j8C.LJIILIIL = i;
        c1269140j8C.LJIILJJIL = i2;
        int[] iArrLJ = C1271270jBd.LIZ.LJ(i, i2, 2);
        InterfaceC1266360j3i interfaceC1266360j3i = this.LJI;
        if (interfaceC1266360j3i == null) {
            return 0;
        }
        int i3 = iArrLJ[0];
        int i4 = iArrLJ[1];
        int iLJIJJLI = interfaceC1266360j3i.LJIJJLI(new C1278540jNM(i3, i4));
        if (LJJII() == 3 && LIZLLL()) {
            this.LJI.insertStandardLevel(i3, i4, Math.min(this.LJJIIJZLJL, this.LJJIIZ), Math.max(this.LJJIIJZLJL, this.LJJIIZ));
        }
        return iLJIJJLI;
    }

    public final void LJJJJZ(long j, boolean z, boolean z2) {
        this.LJJJJZI = z;
        this.LJJJLIIL = j;
        this.LJJJLL = z2;
    }

    public final void LJJLI(int i, int i2, boolean z) {
        synchronized (this.LIZ.mPushBase.LJIIL) {
            try {
                PushBase.Roi roiLIZ = this.LIZ.mPushBase.LJIIL.LIZ(i2, z);
                if (roiLIZ == null) {
                    roiLIZ = new PushBase.Roi();
                }
                roiLIZ.roiOn = i;
                this.LIZ.mPushBase.LJIIL.LIZJ(i2, z, roiLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int LIZIZ(TEBundle tEBundle, String str, int i, Boolean[] boolArr) {
        int i2;
        str.equals("fps");
        if (tEBundle.contains(str) && i != (i2 = tEBundle.getInt(str))) {
            boolArr[0] = Boolean.TRUE;
            return i2;
        }
        return i;
    }

    public final int LJJZZI(int i, int i2, int i3, int i4, int i5, int i6, boolean z, JSONObject jSONObject) {
        PushBase pushBase = this.LIZ.mPushBase;
        if (pushBase == null) {
            return 102;
        }
        if (pushBase.LJJJJIZL() != i || pushBase.LJJII() != i2) {
            pushBase.LJJL(i);
            pushBase.LJJJJZ(i2);
        }
        int iLJJLJ = LJJLJ(i, i2);
        C1269140j8C c1269140j8C = this.LJLJI;
        c1269140j8C.LJJJJJ = i;
        c1269140j8C.LJJJJJL = i2;
        if (iLJJLJ != 0) {
            return iLJJLJ;
        }
        LJJJJLL(i, i2);
        LJJLL();
        if (pushBase.LJJ() != i3 && (iLJJLJ = LJJLIL(i3)) != 0) {
            return iLJJLJ;
        }
        if (pushBase.LJFF() != i4 || pushBase.LJJIIZI() != i5 || pushBase.LJJIIZ() != i6) {
            this.LIZ.mPushBase.LJJJJL(i4);
            this.LIZ.mPushBase.LJJJLL(i5);
            this.LIZ.mPushBase.LJJJLIIL(i6);
            InterfaceC1266360j3i interfaceC1266360j3i = this.LJI;
            if (interfaceC1266360j3i != null) {
                iLJJLJ = interfaceC1266360j3i.LJIJJLI(new C1270090j9j(i4, i5, i6));
            } else {
                iLJJLJ = 0;
            }
            if (iLJJLJ != 0) {
                return iLJJLJ;
            }
        }
        if (z && this.LJI != null && jSONObject != null) {
            try {
                this.LJI.LJIJJLI(new C1936807iI((n) new Gson().LJII(C786410Ut5.J3(jSONObject), n.class), z));
                return iLJJLJ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return iLJJLJ;
    }
}
