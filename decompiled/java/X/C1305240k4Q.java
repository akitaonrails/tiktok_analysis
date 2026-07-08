package X;

import android.os.SystemClock;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.ILiveFeatureBundle;
import com.bytedance.vcloud.strategy.StrategyCenter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305240k4Q implements InterfaceC1699460uKG {
    public static boolean LIZLLL;
    public int LIZ = 1;
    public volatile boolean LIZIZ;
    public final C1305260k4S LIZJ;

    @Override // X.InterfaceC1699460uKG
    public final synchronized void LIZJ() {
        LIZLLL();
    }

    @Override // X.InterfaceC1699460uKG
    public final void LIZLLL() {
        if (this.LIZIZ) {
            return;
        }
        StrategyCenter.getInstance().setLiveAppInfoBundle(this.LIZJ);
        this.LIZIZ = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0k4S] */
    public C1305240k4Q() {
        JSONObject jSONObject = new JSONObject();
        try {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            jSONObject.put("device_id", iHostAppContext != null ? iHostAppContext.getServerDeviceId() : null);
            jSONObject.put("user_id", String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()));
            IHostAppContext iHostAppContext2 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            jSONObject.put("channel", iHostAppContext2 != null ? iHostAppContext2.getChannel() : null);
            IHostAppContext iHostAppContext3 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            jSONObject.put("host_aid", iHostAppContext3 != null ? Integer.valueOf(iHostAppContext3.appId()) : null);
            IHostAppContext iHostAppContext4 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            jSONObject.put("app_session_id", iHostAppContext4 != null ? iHostAppContext4.getSessionId() : null);
            IHostAppContext iHostAppContext5 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            jSONObject.put("app_version", iHostAppContext5 != null ? iHostAppContext5.getVersionName() : null);
            IHostAppContext iHostAppContext6 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            C189200o6.m2constructorimpl(jSONObject.put("update_version_code", String.valueOf(iHostAppContext6 != null ? Integer.valueOf(iHostAppContext6.getUpdateVersionCode()) : null)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZJ = new ILiveFeatureBundle() { // from class: X.0k4S
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // com.bytedance.vcloud.strategy.ILiveFeatureBundle
            public final <T> T getAppInfoForKey(String str, T t) {
                List<GameTag> list;
                GameTag gameTag;
                Long l;
                String str2;
                String str3;
                LiveMode streamType;
                LiveMode streamType2;
                if (str != null) {
                    int i = 0;
                    Object obj = (T) null;
                    switch (str.hashCode()) {
                        case -1874128162:
                            if (str.equals("SCREEN_RESOLTION")) {
                                C20441214yg.LJ("LiveStrategyManager", "fsllog get SCREEN_RESOLTION");
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    C1305270k4T c1305270k4TLJFF = C1305320k4Y.LJFF(GlobalContext.getApplicationContext());
                                    jSONObject2.put("width", c1305270k4TLJFF.LIZIZ);
                                    jSONObject2.put("height", c1305270k4TLJFF.LIZJ);
                                    jSONObject2.put("dpi", c1305270k4TLJFF.LIZ);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("fsllog deviceInfo: ");
                                    sbLIZ.append(jSONObject2);
                                    C20441214yg.LJ("DeviceInfoParams", C2188811AlT.LIZIZ(sbLIZ));
                                    break;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C20441214yg.LJI("DeviceInfoParams", e);
                                }
                                String strJ3 = C786410Ut5.J3(jSONObject2);
                                if (strJ3 != null) {
                                    obj = (T) strJ3;
                                }
                                return obj != null ? (T) obj : t;
                            }
                            break;
                        case -1724431650:
                            if (str.equals("USER-LIVE_WATCH")) {
                                C1100750ekb c1100750ekbNy0 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).ny0("live_watch");
                                this.LIZ.getClass();
                                return (T) C1305240k4Q.LJ(c1100750ekbNy0);
                            }
                            break;
                        case -1586779251:
                            if (str.equals("USER-LandScapeSwitch")) {
                                try {
                                    if (this.LIZ.LIZ != 1) {
                                        i = 1;
                                    }
                                    try {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("USER-LandScapeSwitch value:");
                                        sbLIZ2.append(i);
                                        C20441214yg.LJIIIZ("LiveStrategyManager", C2188811AlT.LIZIZ(sbLIZ2));
                                        return (T) Integer.valueOf(i);
                                    } catch (Exception e2) {
                                        e = e2;
                                        TryCatchGuardChecker.doCheck(e);
                                        C20441214yg.LJII(e);
                                        return (T) Integer.valueOf(i);
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i = -1;
                                }
                            }
                            break;
                        case -1348907976:
                            if (str.equals("USER-LIVE_PREVIEW_CARD")) {
                                C1100750ekb c1100750ekbNy02 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).ny0("live_preview_card");
                                this.LIZ.getClass();
                                return (T) C1305240k4Q.LJ(c1100750ekbNy02);
                            }
                            break;
                        case -1176416901:
                            if (str.equals("live_stream_strategy_sr_kernal_bin_path")) {
                                String strLIZ = C08P1.LIZ();
                                if (strLIZ != null) {
                                    obj = (T) strLIZ;
                                }
                                return obj != null ? (T) obj : t;
                            }
                            break;
                        case -1163125573:
                            if (str.equals("USER-GameTopic")) {
                                try {
                                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                                    if (room != null && (list = room.gameTags) != null && list.size() > 0) {
                                        List<GameTag> list2 = room.gameTags;
                                        if (list2 != null && (gameTag = list2.get(0)) != null && (l = gameTag.id) != null) {
                                            obj = (T) l.toString();
                                        }
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("USER-GameTopic value:");
                                        sbLIZ3.append((String) obj);
                                        C20441214yg.LIZIZ("LiveStrategyManager", C2188811AlT.LIZIZ(sbLIZ3));
                                        if (obj != null) {
                                            return (T) obj;
                                        }
                                    } else {
                                        return t;
                                    }
                                } catch (Exception e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    C20441214yg.LJII(e4);
                                }
                                return t;
                            }
                            break;
                        case 22974109:
                            if (str.equals("USER-HumanActivityRecognition")) {
                                try {
                                    int iSg2 = ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).Sg2();
                                    if (iSg2 >= 0) {
                                        i = iSg2;
                                    }
                                    return (T) Integer.valueOf(i);
                                } catch (Exception e5) {
                                    TryCatchGuardChecker.doCheck(e5);
                                    C20441214yg.LJII(e5);
                                    return t;
                                }
                            }
                            break;
                        case 190548717:
                            if (str.equals("TTNet_NQE_INFO")) {
                                String strJ32 = C786410Ut5.J3(C1508650pMV.LIZ());
                                if (strJ32 != null) {
                                    obj = (T) strJ32;
                                }
                                return obj != null ? (T) obj : t;
                            }
                            break;
                        case 1097402512:
                            if (str.equals("USER-LIVE_DEFAULT")) {
                                C1100750ekb c1100750ekbNy03 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).ny0("default");
                                this.LIZ.getClass();
                                return (T) C1305240k4Q.LJ(c1100750ekbNy03);
                            }
                            break;
                        case 1858994758:
                            if (str.equals("DEVICE_PERFORMANCE_INFO")) {
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3 = C465520INi.LIZ.JR();
                                    break;
                                } catch (Exception e6) {
                                    TryCatchGuardChecker.doCheck(e6);
                                    C20441214yg.LJI("LivePerformanceInfoParams", e6);
                                }
                                String strJ33 = C786410Ut5.J3(jSONObject3);
                                if (strJ33 != null) {
                                    obj = (T) strJ33;
                                }
                                return obj != null ? (T) obj : t;
                            }
                            break;
                        case 2040952360:
                            if (str.equals("USER-LiveType")) {
                                try {
                                    Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("USER-LiveType value:");
                                    if (room2 == null || (streamType2 = room2.getStreamType()) == null) {
                                        str2 = null;
                                    } else {
                                        str2 = streamType2.logStreamingType;
                                    }
                                    sbLIZ4.append(str2);
                                    C20441214yg.LIZIZ("LiveStrategyManager", C2188811AlT.LIZIZ(sbLIZ4));
                                    if (room2 != null && (streamType = room2.getStreamType()) != null) {
                                        str3 = streamType.logStreamingType;
                                        break;
                                    } else {
                                        str3 = null;
                                    }
                                    if (str3 != null) {
                                        obj = (T) str3;
                                    }
                                    return obj != null ? (T) obj : t;
                                } catch (Exception e7) {
                                    TryCatchGuardChecker.doCheck(e7);
                                    C20441214yg.LJII(e7);
                                    return t;
                                }
                            }
                            break;
                    }
                }
                return (T) C1338270kvh.LIZ(t, str);
            }
        };
    }

    @Override // X.InterfaceC1699460uKG
    public final int getScreenOrientation() {
        return this.LIZ;
    }

    public static Map LJ(C1100750ekb c1100750ekb) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        HashMap map = new HashMap();
        if (c1100750ekb != null) {
            try {
                C491530JPj c491530JPj = c1100750ekb.LIZ.LIZJ.get("fps");
                if (c491530JPj != null) {
                    fValueOf = Float.valueOf(c491530JPj.LIZ);
                } else {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                }
                C491530JPj c491530JPj2 = c1100750ekb.LIZ.LIZJ.get("drop3");
                if (c491530JPj2 != null) {
                    fValueOf2 = Float.valueOf(c491530JPj2.LIZ);
                } else {
                    fValueOf2 = null;
                }
                if (fValueOf2 != null) {
                }
                C491530JPj c491530JPj3 = c1100750ekb.LIZ.LIZJ.get("battery_temp");
                if (c491530JPj3 != null) {
                    fValueOf3 = Float.valueOf(c491530JPj3.LIZ);
                } else {
                    fValueOf3 = null;
                }
                if (fValueOf3 != null) {
                }
                C491530JPj c491530JPj4 = c1100750ekb.LIZ.LIZJ.get("cpu_speed");
                if (c491530JPj4 != null) {
                    fValueOf4 = Float.valueOf(c491530JPj4.LIZ);
                } else {
                    fValueOf4 = null;
                }
                if (fValueOf4 != null) {
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildPerformanceMap mockPerfScore:");
            sbLIZ.append((Object) null);
            sbLIZ.append(", mockFps:");
            sbLIZ.append((Object) null);
            sbLIZ.append(", mockDrapFps:");
            sbLIZ.append((Object) null);
            sbLIZ.append(", mockTemperature:");
            sbLIZ.append((Object) null);
            sbLIZ.append(", mockCpuSpeed:");
            sbLIZ.append((Object) null);
            sbLIZ.append(", +  mockDeviceScore:");
            sbLIZ.append((Object) null);
            C20441214yg.LIZIZ("LiveStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
            return map;
        }
        return map;
    }

    @Override // X.InterfaceC1699460uKG
    public final void LIZ(String str) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            if (!C2104308Mf.LIZIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context())) {
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C20441214yg.LIZIZ("LiveStrategyManager", "startStreamStrategy");
        if (!LIZLLL) {
            LIZLLL();
            LIZLLL = true;
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            long applicationInitTime = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getApplicationInitTime();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_stream_strategy_init");
            c474500IjALIZ.LJJIIZI(C2097608Jq.LJIIIIZZ(new Pair("task_start_exec_delay", String.valueOf(jUptimeMillis - applicationInitTime)), new Pair("task_exec_time", String.valueOf(jUptimeMillis2 - jUptimeMillis)), new Pair("init_source", str)));
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC1699460uKG
    public final void LIZIZ(int i) {
        this.LIZ = i;
    }
}
