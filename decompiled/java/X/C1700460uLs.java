package X;

import Y.ARunnableS126S0100000_26;
import android.view.Surface;
import com.bytedance.android.alog.Alog;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.performance.degrade.PullStreamDownOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvoidTwiceFristFrameExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveIgnoreSmoothEnterFirstFrameExp;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveColdStartSurfaceCoverExp;
import com.bytedance.android.livesdk.settings.LivePlayerLoggerDisableExp;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1700460uLs {
    public C1700410uLn LL;
    public InterfaceC1700400uLm LLILLJJLI;
    public final InterfaceC1491060ou8 LLILLL;
    public volatile long LLILZ;
    public volatile String LLILZIL;

    public C1700460uLs(InterfaceC1491060ou8 interfaceC1491060ou8) {
        this.LLILLL = interfaceC1491060ou8;
    }

    public final void LJFF(boolean z) {
        boolean z2;
        if (z) {
            C0IX5.LJIILL(0, this.LLILZIL, "", false);
            C465050ILn.LJ(this.LLILZ, "live_sdk_player_first_frame");
        }
        InterfaceC1700400uLm interfaceC1700400uLm = this.LLILLJJLI;
        if (interfaceC1700400uLm != null) {
            C1APH c1aph = (C1APH) interfaceC1700400uLm;
            C827750WdZ.LIZ("LivePlayController", "player callback onFirstFrame()");
            if (LiveColdStartSurfaceCoverExp.getEnable() && z && !c1aph.LLJILJILJ) {
                c1aph.LLJILJILJ = true;
                if (!c1aph.LLJILJIL.isEmpty()) {
                    Iterator<C0IIY> it2 = c1aph.LLJILJIL.iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().onFirstFrameRender();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
            InterfaceC480650It5 interfaceC480650It5 = c1aph.LLJJL;
            if (interfaceC480650It5 instanceof InterfaceC485640J2s) {
                try {
                    ((InterfaceC485640J2s) interfaceC480650It5).LLLLLLIL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (LiveIgnoreSmoothEnterFirstFrameExp.isExp()) {
                C827750WdZ.LIZ("LivePlayController", "LiveIgnoreSmoothEnterFirstFrameExp  ignore");
            } else if (LiveAvoidTwiceFristFrameExp.isExp() && (z || c1aph.LLLF)) {
                C786410Ut5.LJL(c1aph.LLLIIIL, new ARunnableS126S0100000_26(c1aph, 5));
            }
            ConcurrentHashMap<String, Boolean> concurrentHashMap = C465150ILx.LIZ;
            String str = c1aph.LLJZ;
            C1699360uK6 c1699360uK6 = c1aph.LLLLII;
            if (c1699360uK6 != null) {
                z2 = c1699360uK6.LIZLLL;
            } else {
                z2 = false;
            }
            C465150ILx.LIZ(str, z2, c1aph.LLLF);
        }
        if (LiveAvoidTwiceFristFrameExp.isDisableExp() || LiveIgnoreSmoothEnterFirstFrameExp.isExp()) {
            LIZ(EnumC1700470uLt.RENDERING_START, 0, "player start render");
        }
    }

    public final void LJIIIIZZ(Surface surface) {
        C827750WdZ.LIZ("TTLivePlayerListenerBaseWrapper", "doOnTextureRenderDrawFrame");
        C1700410uLn c1700410uLn = this.LL;
        if (c1700410uLn == null) {
            return;
        }
        EnumC1700470uLt enumC1700470uLt = EnumC1700470uLt.TEXTURE_RENDER_DRAW_FRAME;
        if (c1700410uLn.LJJIL(enumC1700470uLt)) {
            this.LL.LJIILJJIL(enumC1700470uLt, 0, surface);
        }
    }

    public final void LJII(String str, JSONObject jSONObject) {
        boolean z;
        InterfaceC480660It6 interfaceC480660It6;
        if (LivePlayerLoggerDisableExp.INSTANCE.isEventDisable(jSONObject.optString("event_key"))) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("player==>liveLogSender==null is ");
        int i = 0;
        if (this.LLILLL == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LiveAppBundleUtils", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("player==>player info ");
        sbLIZ2.append("event is not null");
        C20441214yg.LIZIZ("LiveAppBundleUtils", C2188811AlT.LIZIZ(sbLIZ2));
        Alog alogLIZ = C827610WdL.LIZ().LIZ();
        if (alogLIZ != null) {
            try {
                String strJ3 = C786410Ut5.J3(jSONObject);
                int iMin = Math.min(SpeechEngineDefines.TTS_WORK_MODE_BOTH, strJ3.length());
                while (i < strJ3.length()) {
                    alogLIZ.LJIILL(2, "LiveOnMonitorLog", strJ3.substring(i, iMin));
                    i = iMin;
                    iMin = Math.min(iMin + SpeechEngineDefines.TTS_WORK_MODE_BOTH, strJ3.length());
                }
                C20441214yg.LIZIZ("LiveOnMonitorLog", strJ3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("LiveOnMonitorLog_error", e);
            }
        }
        if (this.LLILLL != null && !"live_local_monitor_log".equals(str)) {
            C20441214yg.LIZIZ("PlayerLogger", jSONObject.optString("event_key"));
            C1APH c1aph = ((C1502390pCP) this.LLILLL).LIZ;
            c1aph.getClass();
            PullStreamDownOptSetting pullStreamDownOptSetting = PullStreamDownOptSetting.INSTANCE;
            if (!pullStreamDownOptSetting.isDowngradeAll() && !pullStreamDownOptSetting.isDowngradeAppMonitor()) {
                SoftReference<InterfaceC480660It6> softReference = c1aph.LLJLL;
                if (softReference != null && (interfaceC480660It6 = softReference.get()) != null) {
                    interfaceC480660It6.LIZ(str, jSONObject);
                } else {
                    c1aph.LLJLILLLLZIIL.LIZ(str, jSONObject);
                }
            }
            C0IXC c0ixc = c1aph.LLLIIIIL;
            if (c0ixc != null) {
                c0ixc.LIZ(jSONObject);
            }
            try {
                if ("live_client_monitor_log".equals(str) && "playing".equals(jSONObject.optString("event_key"))) {
                    ((IHostMonitorAndLog) C1161920gLG.LIZJ(IHostMonitorAndLog.class)).Wp2(jSONObject);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJI("LivePlayController", e2);
            }
        }
    }

    public final void LJIIIZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("videoSizeChanged, width: ");
        sbLIZ.append(i);
        sbLIZ.append(", height: ");
        sbLIZ.append(i2);
        LIZ(EnumC1700470uLt.VIDEO_SIZE_CHANGED, (i2 << 16) | i, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ(EnumC1700470uLt enumC1700470uLt, int i, String str) {
        C1700410uLn c1700410uLn = this.LL;
        if (c1700410uLn == null) {
            return;
        }
        c1700410uLn.LJIILJJIL(enumC1700470uLt, i, str);
    }

    public final void LIZJ(int i, boolean z, Map map) {
        HashMap map2;
        EnumC1700470uLt enumC1700470uLt;
        String str;
        C465050ILn.LJ(this.LLILZ, "live_sdk_player_pull_fail");
        Gson gson = C19748512Ol.LIZJ;
        if (map == null) {
            map2 = new HashMap(2);
        } else {
            map2 = new HashMap(map);
        }
        map2.put("error_code", String.valueOf(i));
        if (i != 0) {
            enumC1700470uLt = EnumC1700470uLt.PREPARE_FAILED;
        } else {
            enumC1700470uLt = EnumC1700470uLt.MEDIA_ERROR;
        }
        map2.put("error_description", enumC1700470uLt.name());
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("play_forbidden", str);
        String json = GsonProtectorUtils.toJson(gson, map2);
        if (i != 0) {
            EnumC1700470uLt enumC1700470uLt2 = EnumC1700470uLt.PREPARE_FAILED;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepare failed.code:");
            sbLIZ.append(i);
            LIZ(enumC1700470uLt2, i, C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZ(EnumC1700470uLt.MEDIA_ERROR, i, json);
        C0IX5.LJIILL(i, this.LLILZIL, json, z);
    }
}
