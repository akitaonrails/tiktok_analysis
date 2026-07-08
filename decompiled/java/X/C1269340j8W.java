package X;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.bytertc.engine.loader.LyraxSoLoadState;
import com.ss.lyrax.augur.AugurAdaptiveWrapper;
import com.ss.lyrax.augur.AugurConfigExtraInfo;
import com.ss.lyrax.augur.AugurConfigSource;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GLTracer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import com.ss.ttlivestreamer.livestreamv2.tinyjson.GsonIncrementalTypeAdapterUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1269340j8W extends C1269160j8E {
    public static String LJZI;
    public final String LJLZ = "opensles";
    public final String LJZ = "opensles";

    @Override // X.C1269160j8E
    public final InterfaceC1266960j4g LJIJI() {
        return this.LJLJI.LJJIIJZLJL;
    }

    public final String LJJZZIII(boolean z) {
        String str;
        LiveSdkSetting liveSdkSetting = this.LIZ;
        if (z) {
            str = liveSdkSetting.LIZJ;
        } else {
            str = liveSdkSetting.LIZLLL;
        }
        if (AudioDeviceModule.isValidAdmApiType(str)) {
            return str;
        }
        if (z) {
            return this.LJLZ;
        }
        return this.LJZ;
    }

    public final void LJL(String str) {
        int i;
        LyraxScene lyraxScene;
        JSONObject jSONObject = null;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    this.LJIJI = str;
                    if (!this.LJLJI.LJJJLIIL) {
                        this.LJIJ = new JSONObject(str);
                    }
                    System.currentTimeMillis();
                    if (LJJJI() && AugurAdaptiveWrapper.getInstance() != null) {
                        LJJZ(str);
                    } else {
                        ((GsonIncrementalTypeAdapterUtils) LJIILLIIL()).LIZ(this.LIZ, str);
                    }
                    if (this.LIZ.LJIILIIL() && !LJJJI() && AugurAdaptiveWrapper.getInstance() != null) {
                        if (this.LJLJI.LJJIII) {
                            lyraxScene = LyraxScene.LIVE;
                        } else {
                            lyraxScene = LyraxScene.LINKMIC;
                        }
                        AugurAdaptiveWrapper.getInstance().updateConfig(str, new AugurConfigExtraInfo(AugurConfigSource.ROOM_CREATE_CONFIG, lyraxScene));
                    }
                    if (C1267520j5a.LIZ() && !LJJJI()) {
                        String strLIZIZ = C1975007oS.LIZIZ(this.LIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("mSdkSetting:");
                        sbLIZ.append(strLIZIZ);
                        AVLog.iow("LiveStreamBuilder", C2188811AlT.LIZIZ(sbLIZ));
                        AVLog.logKibana(5, "LiveStreamBuildersetupsdkParamsObject", strLIZIZ, null);
                    }
                    AVLog.logKibana(5, "LiveStreamBuildersetupsdkParamsConfig", str, null);
                    PushBase pushBase = this.LIZ.mPushBase;
                    if (!this.LJLJI.LJJJLIIL) {
                        pushBase.getClass();
                        C1282600jTu.LIZLLL = new JSONArray();
                    }
                    if (C173500lZ.LIZ(Integer.valueOf(pushBase.LJJJJIZL())) && C173500lZ.LIZ(Integer.valueOf(pushBase.LJJII()))) {
                        C1269140j8C c1269140j8C = this.LJLJI;
                        if (c1269140j8C.LJIILIIL > c1269140j8C.LJIILJJIL) {
                            LJJLJ(Math.max(pushBase.LJJJJIZL(), pushBase.LJJII()), Math.min(pushBase.LJJJJIZL(), pushBase.LJJII()));
                        } else {
                            LJJLJ(Math.min(pushBase.LJJJJIZL(), pushBase.LJJII()), Math.max(pushBase.LJJJJIZL(), pushBase.LJJII()));
                        }
                    }
                    if (!TextUtils.isEmpty(pushBase.LJJIZ())) {
                        if (TextUtils.equals(pushBase.LJJIZ(), "bytevc1")) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        if (pushBase.LIZIZ == -1 || !pushBase.LJIJJ) {
                            pushBase.LIZIZ = i;
                        }
                    }
                    if (TextUtils.equals(pushBase.LJJJJ(), "baseline")) {
                        PushBase pushBase2 = this.LIZ.mPushBase;
                        if (pushBase2.LIZJ == -1 || !pushBase2.LJIJJ) {
                            pushBase2.LIZJ = 1;
                        }
                    } else if (TextUtils.equals(pushBase.LJJJJ(), "high")) {
                        PushBase pushBase3 = this.LIZ.mPushBase;
                        if (pushBase3.LIZJ == -1 || !pushBase3.LJIJJ) {
                            pushBase3.LIZJ = 3;
                        }
                    } else if (TextUtils.equals(pushBase.LJJJJ(), "main")) {
                        PushBase pushBase4 = this.LIZ.mPushBase;
                        if (pushBase4.LIZJ == -1 || !pushBase4.LJIJJ) {
                            pushBase4.LIZJ = 2;
                        }
                    }
                    if (!C216900sZ.LIZ(pushBase.LIZLLL, "MediaCodec") && !C216900sZ.LIZ(pushBase.LIZLLL, "ffmpeg")) {
                        C216900sZ.LIZ(pushBase.LIZLLL, "fdk-aac");
                    }
                    if (!TextUtils.isEmpty(pushBase.LIZJ())) {
                        if (C216900sZ.LIZ(pushBase.LIZJ(), "AAC-HEv2")) {
                            PushBase pushBase5 = this.LIZ.mPushBase;
                            if (pushBase5.LJ == -1 || !pushBase5.LJIJJ) {
                                pushBase5.LJ = 3;
                            }
                        } else if (C216900sZ.LIZ(pushBase.LIZJ(), "AAC-HE")) {
                            PushBase pushBase6 = this.LIZ.mPushBase;
                            if (pushBase6.LJ == -1 || !pushBase6.LJIJJ) {
                                pushBase6.LJ = 2;
                            }
                        } else {
                            PushBase pushBase7 = this.LIZ.mPushBase;
                            if (pushBase7.LJ == -1 || !pushBase7.LJIJJ) {
                                pushBase7.LJ = 1;
                            }
                        }
                    }
                    PushBase pushBase8 = this.LIZ.mPushBase;
                    int i2 = pushBase8.LJII;
                    if (i2 > 0 && i2 < 180) {
                        pushBase8.LJII = i2 * LSPassThroughRecordSizeConfig.DEFAULT;
                    }
                    if (this.LJLJI.LJJJLIIL) {
                        C1269350j8X c1269350j8X = new C1269350j8X();
                        c1269350j8X.LIZ = true;
                        GLThreadManager.initConfig(c1269350j8X);
                    } else {
                        GLThreadManager.enableForceGLFinish(true);
                        GLThreadManager.enableForceGLFence(false, false);
                        GLThreadManager.enableGlobalGlContextMutex(false);
                    }
                    C1269360j8Y.LIZ = 5;
                    if (C173500lZ.LIZ(Integer.valueOf(this.LIZ.mPushBase.LJJIIJZLJL()))) {
                        GLThreadManager.setGLVersion(this.LIZ.mPushBase.LJJIIJZLJL());
                    }
                    C1273730jFb.LIZIZ = false;
                    C1273730jFb.LIZJ = false;
                    C1273730jFb.LJ = 0L;
                    C1273730jFb.LJFF = null;
                    C1273730jFb.LIZLLL = true;
                    if (LJJIZ()) {
                        this.LIZ.mVPassInteractCfg.getClass();
                    }
                    if (this.LJLJI.LJJIFFI) {
                        C1269520j8o.LIZ("setupSdkParams");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1274080jGA.LIZ.LIZ("LiveStreamBuilder.setupSdkParams", e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("parse sdkParams json failed LiveStreamBuilder:");
                    sbLIZ2.append(str);
                    AVLog.logKibana(6, "TinyJson", C2188811AlT.LIZIZ(sbLIZ2), e);
                    if (C1274040jG6.LIZ()) {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        throw new AndroidRuntimeException(e);
                    }
                }
            }
            if (str.isEmpty() || !LyraxSoLoadState.isLyraxNativeReady()) {
                return;
            }
            if (this.LIZ.mVPassInteractCfg.LIZ == null && !this.LJLJI.LJJJLIIL) {
                try {
                    JSONObject jSONObjectLJJ = LJJ();
                    VPassInteractCfg vPassInteractCfg = this.LIZ.mVPassInteractCfg;
                    if (jSONObjectLJJ != null) {
                        jSONObject = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LJIJ, "PushBase"), "mixOnClient");
                    }
                    vPassInteractCfg.LIZ = jSONObject;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    AVLog.ioe("LiveCore", "Don't have a mixOnClient params");
                }
            }
            GLTracer.setEnableGlTracer(false);
        }
    }
}
