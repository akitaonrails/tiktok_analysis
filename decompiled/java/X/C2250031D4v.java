package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewBroadcastBlockChannel;
import com.bytedance.android.livesdk.livesetting.barrage.AutoSpeedTestingResultSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameLiveAdaptiveSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameRtcAbParams;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHAndroidGameGearAdaptiveConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHProbeAppContextSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSAnchorNetProbeSetting;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.solution.gear_center.LyraxGearCenterConfig;
import com.ss.solution.gear_center.LyraxGearLiveType;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.VideoQualityStrategyManagerV2;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeGameGearSelectConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.StrategyConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS256S0300000_12;
import org.json.JSONObject;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.1D4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250031D4v {
    public C1D4C LIZ;
    public boolean LIZIZ;
    public C1D47 LIZJ;
    public String LIZLLL;
    public C783680Uog LJ;
    public InterfaceC773540UWa LJFF;
    public InterfaceC773540UWa LJI;
    public C11JF LJII;
    public DataChannel LJIIIIZZ;
    public LifecycleOwner LJIIIZ;
    public C2249981D4q LJIIJ;
    public long LJIIL;
    public EnumC776530Ud9 LJIIJJI = EnumC776530Ud9.IDLE;
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(811));

    public static String LIZIZ() {
        String strJ3 = "";
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strValue = GameRtcAbParams.INSTANCE.value();
            Map mapLJ = C2097608Jq.LJ();
            if (C1533950q1J.LJ(strValue)) {
                try {
                    if (strValue == null) {
                        strValue = "";
                    }
                    mapLJ = C2348509Id.LIZIZ(new JSONObject(strValue));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            linkedHashMap.putAll(mapLJ);
            strJ3 = C786410Ut5.J3(new JSONObject(linkedHashMap));
            return strJ3;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return strJ3;
        }
    }

    public static final PushStreamInfo.Quality LIZJ() {
        PushStreamInfo.Quality quality;
        Map<String, String> mapLIZIZ = InterfaceC772390URp.p.LIZIZ();
        if (mapLIZIZ == null || mapLIZIZ.isEmpty()) {
            quality = null;
        } else {
            quality = new PushStreamInfo.Quality();
            quality.name = mapLIZIZ.get("name");
            quality.sdkKey = mapLIZIZ.get("sdk_key");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLastSelectedQuality.lastQuality = ");
        sbLIZ.append(quality);
        sbLIZ.append(" lastQuality.name=");
        sbLIZ.append(quality != null ? quality.name : null);
        sbLIZ.append(", lastQuality.sdkKey=");
        sbLIZ.append(quality != null ? quality.sdkKey : null);
        C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        return quality;
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250031D4v.LJ():void");
    }

    public final void LJIILL() {
        C20441214yg.LIZIZ("StreamQualityCenterImpl", "stopEndSpeedTestCountDown");
        C11JF c11jf = this.LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public final C1D4C LIZLLL() {
        LiveMode liveMode;
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoQualityStrategyManager instance -> ");
        sbLIZ.append(this.LIZ);
        C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        C1D4C c2250001D4s = this.LIZ;
        if (c2250001D4s == null) {
            TTLHVideoQualityStrategyManagerGameSettings tTLHVideoQualityStrategyManagerGameSettings = TTLHVideoQualityStrategyManagerGameSettings.INSTANCE;
            boolean zEnableNewStructure = tTLHVideoQualityStrategyManagerGameSettings.enableNewStructure();
            this.LIZIZ = zEnableNewStructure;
            if (zEnableNewStructure) {
                VideoQualityStrategyManagerV2.LJIILL.getClass();
                c2250001D4s = new VideoQualityStrategyManagerV2();
            } else {
                c2250001D4s = new C2250001D4s();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("videoQualityStrategyManager create report, gearCenter=");
            sbLIZ2.append(this.LIZIZ);
            C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ2));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ttlh_livecore_create");
            c474500IjALIZ.LJIJJLI(this.LJIIIIZZ);
            DataChannel dataChannel = this.LJIIIIZZ;
            if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
                liveMode = LiveMode.VIDEO;
            }
            c474500IjALIZ.LJJII(liveMode.logStreamingType, "live_type");
            c474500IjALIZ.LJJII("VideoQualityStrategyManagerImpl_game", "report_from");
            c474500IjALIZ.LIZ();
            c2250001D4s.LJIIIZ(new C1D41() { // from class: X.0Ud3
                /* JADX WARN: Removed duplicated region for block: B:74:0x01c1  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
                @Override // X.C1D41
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C1D49 r13) {
                    /*
                        Method dump skipped, instruction units count: 642
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C776470Ud3.LIZ(X.1D49):void");
                }

                @Override // X.C1D41
                public final void LIZIZ(C2249361D2g c2249361D2g) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onResult -> ");
                    sbLIZ3.append(c2249361D2g);
                    C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    InterfaceC773540UWa interfaceC773540UWa = this.LIZ.LJI;
                    if (interfaceC773540UWa != null) {
                        interfaceC773540UWa.LIZIZ(c2249361D2g);
                    }
                }

                @Override // X.C1D41
                public final void LIZLLL(C1D47 c1d47) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onVideoQualityResult -> ");
                    sbLIZ3.append(c1d47);
                    C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    if (c1d47 != null) {
                        this.LIZ.LIZJ = c1d47;
                    }
                }

                @Override // X.C1D41
                public final void LJ(JSONObject jSONObject) {
                    this.LIZ.getClass();
                    try {
                        jSONObject.put("live_platform_version", C465680INy.LIZ());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C20441214yg.LJI("StreamLog", th);
                    }
                    ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Xj1().B0(jSONObject, true);
                }

                @Override // X.C1D41
                public final void LIZJ(EnumC773550UWb enumC773550UWb, EnumC783720Uok enumC783720Uok) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onStateChanage -> ");
                    sbLIZ3.append(enumC773550UWb);
                    C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ3));
                }

                @Override // X.C1D41
                public final void onEvent(String str, JSONObject jSONObject) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("getVideoQualityStrategyManager onEvent -> ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", ");
                    sbLIZ3.append(jSONObject);
                    C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    if (str != null) {
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ(str);
                        c474500IjALIZ2.LJIL();
                        if (jSONObject != null) {
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                c474500IjALIZ2.LJJII(jSONObject.get(next), next);
                            }
                        }
                        c474500IjALIZ2.LIZ();
                    }
                }
            });
            if (this.LIZIZ) {
                String configJson = tTLHVideoQualityStrategyManagerGameSettings.getConfigJson();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("createGearCenterConfig rawJson: ");
                sbLIZ3.append(configJson);
                C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ3));
                try {
                    c098200Yq = new JSONObject(configJson);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                JSONObject jSONObject = new JSONObject();
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = jSONObject;
                }
                JSONObject jSONObject2 = (JSONObject) c098200Yq;
                IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                LyraxGearLiveType lyraxGearLiveType = LyraxGearLiveType.Game;
                String strValueOf = String.valueOf(iHostAppContext.appId());
                String anchorNetAppId = TTLSAnchorNetProbeSetting.INSTANCE.getAnchorNetAppId();
                String versionName = iHostAppContext.getVersionName();
                String channel = iHostAppContext.getChannel();
                String serverDeviceId = iHostAppContext.getServerDeviceId();
                JSONObject jSONObject3 = new JSONObject(LIZIZ());
                C1279430jOn c1279430jOn = C1279460jOq.LIZ;
                LyraxGearCenterConfig lyraxGearCenterConfig = new LyraxGearCenterConfig(lyraxGearLiveType, strValueOf, anchorNetAppId, versionName, channel, serverDeviceId, jSONObject3, c1279430jOn.LIZLLL(), c1279430jOn.LIZJ(), TTLHProbeAppContextSwitch.INSTANCE.enableTTLHProbeAppContext() ? iHostAppContext.context() : C176600m4.LIZ(), jSONObject2, AnonymousClass0208.get$arr$(70), TTLHVideoQualityStrategyManagerGameSettings.INSTANCE.getSyncTimeoutMs());
                C20441214yg.LIZIZ("StreamQualityCenterImpl", "createGearCenterConfig created");
                c2250001D4s.LIZLLL(lyraxGearCenterConfig);
            } else {
                c2250001D4s.LJIILJJIL(new C1282670jU1());
                c2250001D4s.LIZIZ(new C1282710jU5());
                int logReportConfig = tTLHVideoQualityStrategyManagerGameSettings.getLogReportConfig();
                C1282680jU2 c1282680jU2 = C0USS.LIZ;
                boolean zIsALogReportEnabled = tTLHVideoQualityStrategyManagerGameSettings.isALogReportEnabled();
                boolean zIsTraceLogReportEnabled = tTLHVideoQualityStrategyManagerGameSettings.isTraceLogReportEnabled();
                if (C1274040jG6.LIZ) {
                    logReportConfig = 17;
                }
                c1282680jU2.LIZIZ = (logReportConfig & 240) >> 4;
                c1282680jU2.LIZJ = zIsALogReportEnabled;
                c1282680jU2.LIZ = logReportConfig & 15;
                c1282680jU2.LIZLLL = zIsTraceLogReportEnabled;
                Map<String, Map<String, BitrateConfig>> bitrateConfig = tTLHVideoQualityStrategyManagerGameSettings.getBitrateConfig();
                Map<String, StrategyConfig> strategyConfig = tTLHVideoQualityStrategyManagerGameSettings.getStrategyConfig();
                Map<String, BwProbeGameGearSelectConfig> gearSelectConfig = tTLHVideoQualityStrategyManagerGameSettings.getGearSelectConfig();
                boolean zEnable = BroadcastGameLiveAdaptiveSwitcherSetting.INSTANCE.enable();
                C2249991D4r c2249991D4r = new C2249991D4r();
                c2249991D4r.LIZIZ = strategyConfig;
                c2249991D4r.LIZ = bitrateConfig;
                c2249991D4r.LIZJ = gearSelectConfig;
                Boolean boolValueOf = Boolean.valueOf(zEnable);
                c2249991D4r.LIZLLL = boolValueOf;
                C2249981D4q c2249981D4q = new C2249981D4q(c2249991D4r.LIZ, c2249991D4r.LIZIZ, c2249991D4r.LIZJ, boolValueOf);
                this.LJIIJ = c2249981D4q;
                c2249981D4q.LJ = EnumC1283150jUn.GAME;
                c2250001D4s.LJIILLIIL(c2249981D4q);
            }
            this.LIZ = c2250001D4s;
        }
        return c2250001D4s;
    }

    public static PushStreamInfo.Quality LJFF(C1D47 c1d47) {
        String sdkKey;
        EnumC2178851APb enumC2178851APb;
        if (c1d47 != null && c1d47.LJJ != null) {
            PushStreamInfo.Quality quality = new PushStreamInfo.Quality();
            quality.max_bitrate = c1d47.LIZ;
            quality.min_bitrate = c1d47.LIZIZ;
            quality.default_bitrate = c1d47.LIZJ;
            quality.width = c1d47.LJIJ;
            quality.height = c1d47.LJIJI;
            quality.fps = c1d47.LJIJJ;
            C1D46 c1d46 = c1d47.LJJ;
            String str = "";
            if (c1d46 == null || (enumC2178851APb = c1d46.LIZLLL) == null || (sdkKey = enumC2178851APb.getSdkKey()) == null) {
                sdkKey = "";
            }
            quality.sdkKey = sdkKey;
            String str2 = c1d47.LJIJJLI;
            if (str2 == null) {
                str2 = "";
            }
            quality.desc = str2;
            String str3 = c1d47.LJIL;
            if (str3 != null) {
                str = str3;
            }
            quality.name = str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mapVideoQualityResult transformResult -> ");
            sbLIZ.append(quality);
            C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
            return quality;
        }
        return null;
    }

    public static C783680Uog LJIIIZ(C783680Uog c783680Uog) {
        PreScheduleStream preScheduleStream;
        Object c098200Yq;
        Object obj = null;
        if (c783680Uog == null || (preScheduleStream = c783680Uog.LIZ) == null) {
            return null;
        }
        try {
            c098200Yq = new C783680Uog(preScheduleStream, c783680Uog.LIZIZ, c783680Uog.LIZJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C783680Uog) obj;
    }

    public final void LJIIL(EnumC783720Uok enumC783720Uok) {
        long jCurrentTimeMillis;
        String str;
        boolean z;
        LifecycleCoroutineScope lifecycleScope;
        PreScheduleStream preScheduleStream;
        InterfaceC783690Uoh interfaceC783690UohLIZ = LIZLLL().LIZ();
        if (interfaceC783690UohLIZ != null) {
            jCurrentTimeMillis = ((C2250051D4x) interfaceC783690UohLIZ).LIZJ();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LJIIL = jCurrentTimeMillis;
        C783680Uog c783680Uog = this.LJ;
        if (c783680Uog != null && (preScheduleStream = c783680Uog.LIZ) != null) {
            str = preScheduleStream.speedProbeUrl;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startSpeedTestInternal startTime ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", preSchedule url empty ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (C176600m4.LIZ() == null) {
            return;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (C500260Jjc.LJJIFFI(Boolean.valueOf(z))) {
                    LJIIIIZZ(jCurrentTimeMillis, "1");
                    LJII(jCurrentTimeMillis, "1");
                    LJIILIIL(enumC783720Uok);
                    return;
                }
                if (C776840Ude.LIZ == null) {
                    C776840Ude.LIZ = new C327470Csb();
                }
                C327470Csb c327470Csb = C776840Ude.LIZ;
                LifecycleOwner lifecycleOwner = this.LJIIIZ;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C783640Uoc(c327470Csb, this, jCurrentTimeMillis, enumC783720Uok, null), 2);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZLLL().LIZJ(EnumC2239251Ckd.NETWORK_ERROR);
        LJIIZILJ(EnumC776530Ud9.STOPPED);
        LJIILL();
        C776550UdB c776550UdB = C776550UdB.LJIIIZ;
        LJI(enumC783720Uok, c776550UdB);
        LJIIJ(enumC783720Uok, c776550UdB);
    }

    public final void LJIILIIL(EnumC783720Uok enumC783720Uok) {
        PreScheduleStream preScheduleStream;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        LifecycleCoroutineScope lifecycleScope;
        Boolean bool;
        Boolean bool2;
        C783680Uog c783680Uog = this.LJ;
        if (c783680Uog != null && (preScheduleStream = c783680Uog.LIZ) != null) {
            String str = preScheduleStream.speedProbeUrl;
            boolean z = false;
            if (str != null && str.length() != 0) {
                DataChannel dataChannel = this.LJIIIIZZ;
                if (dataChannel != null && (bool2 = (Boolean) dataChannel.gg0(PreviewBroadcastBlockChannel.class)) != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                DataChannel dataChannel2 = this.LJIIIIZZ;
                if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(LiveAccessTipsShowChannel.class)) != null) {
                    zBooleanValue2 = bool.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("needStartAutoSpeedDetection isBlocked:");
                sbLIZ.append(zBooleanValue);
                sbLIZ.append(" isAccessRecall:");
                sbLIZ.append(zBooleanValue2);
                C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
                if (C500260Jjc.LJJIFFI(Boolean.valueOf(zBooleanValue)) && C500260Jjc.LJJIFFI(Boolean.valueOf(zBooleanValue2))) {
                    if (TTLHAndroidGameGearAdaptiveConfig.INSTANCE.enableGameGearAdaptive()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateAdaptiveGearPerfInfo. lifecycleOwnerNull:");
                        if (this.LJIIIZ == null) {
                            z = true;
                        }
                        sbLIZ2.append(z);
                        C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ2));
                        LifecycleOwner lifecycleOwner = this.LJIIIZ;
                        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1101210elL(this, null), 2);
                        }
                        C1267200j54 c1267200j54 = new C1267200j54();
                        c1267200j54.LIZ = new LinkedHashMap();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (TtliveGameEnableCategoryGearsSetting.INSTANCE.isEnable()) {
                            String value = C19370910qR.LIZ().getValue();
                            this.LIZLLL = value;
                            linkedHashMap.put("gear_identifier", value);
                        }
                        c1267200j54.LIZIZ = linkedHashMap;
                        C1D4C c1d4c = this.LIZ;
                        if (c1d4c != null) {
                            c1d4c.LJFF(c1267200j54);
                        }
                    }
                    C1D4C c1d4cLIZLLL = LIZLLL();
                    C783730Uol c783730Uol = new C783730Uol();
                    c783730Uol.LIZ = enumC783720Uok;
                    c1d4cLIZLLL.LJIIIIZZ(c783730Uol);
                    return;
                }
                LJIIZILJ(EnumC776530Ud9.STOPPED);
                LJIILL();
                C776550UdB c776550UdB = C776550UdB.LJIIL;
                LJI(enumC783720Uok, c776550UdB);
                LJIIJ(enumC783720Uok, c776550UdB);
            }
        }
    }

    public final C776550UdB LJIILLIIL(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopManualStreamQualityDecision before ");
        sbLIZ.append(this.LJIIJJI);
        C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LJI = null;
        if (this.LJIIJJI != EnumC776530Ud9.MANUAL_TEST_RUNNING) {
            return C776550UdB.LJIIIIZZ;
        }
        LJIIZILJ(EnumC776530Ud9.STOPPED);
        C1D4C c1d4cLIZLLL = LIZLLL();
        C1D45 c1d45 = new C1D45();
        c1d45.LIZJ = C0UWR.MANUAL_PROBE_CANCEL;
        c1d45.LIZ = false;
        c1d45.LIZIZ = EnumC783720Uok.MANUAL;
        c1d4cLIZLLL.LJII(c1d45);
        LJIILL();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIL;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str2 = quality.sdkKey) == null) {
            str2 = "";
        }
        C0UWT.LIZIZ(-1, "cancelled", str, jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT), str2, "", "");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stopManualStreamQualityDecision after ");
        sbLIZ2.append(this.LJIIJJI);
        C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ2));
        return C776550UdB.LIZJ;
    }

    public final void LJIIZILJ(EnumC776530Ud9 enumC776530Ud9) {
        if (this.LJIIJJI != enumC776530Ud9) {
            this.LJIIJJI = enumC776530Ud9;
        }
    }

    public final void LJI(EnumC783720Uok enumC783720Uok, C776550UdB c776550UdB) {
        if (enumC783720Uok == EnumC783720Uok.AUTO) {
            InterfaceC773540UWa interfaceC773540UWa = this.LJFF;
            if (interfaceC773540UWa != null) {
                interfaceC773540UWa.LIZJ(c776550UdB);
                return;
            }
            return;
        }
        if (enumC783720Uok == EnumC783720Uok.MANUAL) {
            InterfaceC773540UWa interfaceC773540UWa2 = this.LJI;
            if (interfaceC773540UWa2 != null) {
                interfaceC773540UWa2.LIZJ(c776550UdB);
                return;
            }
            return;
        }
        InterfaceC773540UWa interfaceC773540UWa3 = this.LJFF;
        if (interfaceC773540UWa3 != null) {
            interfaceC773540UWa3.LIZJ(c776550UdB);
        }
        InterfaceC773540UWa interfaceC773540UWa4 = this.LJI;
        if (interfaceC773540UWa4 != null) {
            interfaceC773540UWa4.LIZJ(c776550UdB);
        }
    }

    public final void LJII(long j, String str) {
        InterfaceC783690Uoh interfaceC783690UohLIZ = LIZLLL().LIZ();
        if (interfaceC783690UohLIZ != null) {
            C2250051D4x c2250051D4x = (C2250051D4x) interfaceC783690UohLIZ;
            c2250051D4x.LIZIZ(EnumC2250061D4y.SPEED_TEST_RESPONSE_TIME, String.valueOf(System.currentTimeMillis() - j));
            c2250051D4x.LIZIZ(EnumC2250061D4y.SPEED_TEST_RESPONSE_RESULT, str);
        }
    }

    public final void LJIIIIZZ(long j, String str) {
        InterfaceC783690Uoh interfaceC783690UohLIZ = LIZLLL().LIZ();
        if (interfaceC783690UohLIZ != null) {
            C2250051D4x c2250051D4x = (C2250051D4x) interfaceC783690UohLIZ;
            c2250051D4x.LIZIZ(EnumC2250061D4y.START_REQUEST_URL_TIME, String.valueOf(System.currentTimeMillis() - j));
            c2250051D4x.LIZIZ(EnumC2250061D4y.START_REQUEST_URL_RESULT, str);
        }
    }

    public final void LJIIJ(EnumC783720Uok enumC783720Uok, C776550UdB c776550UdB) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIL;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str = quality.sdkKey) == null) {
            str = "";
        }
        C0UWT.LIZJ(enumC783720Uok, jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT), jCurrentTimeMillis, "failed", "", str, "", c776550UdB.LIZ, c776550UdB.LIZIZ);
    }

    public final void LJIIJJI(PushStreamInfo.Quality quality, EnumC2249781D3w enumC2249781D3w) {
        int iLevel = EnumC2178851APb.sdkKeyToGameLevel(quality.sdkKey).level();
        LIZLLL().LJIILIIL(iLevel, enumC2249781D3w);
        PushStreamInfo.Quality qualityLIZIZ = C776390Ucv.LIZIZ(quality);
        if (qualityLIZIZ != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
            DataChannelGlobal.LLILZ.HQ2(BroadcastShareScreenDefinition.class, qualityLIZIZ);
            HashMap map2 = new HashMap();
            map2.put("name", qualityLIZIZ.name);
            map2.put("sdk_key", qualityLIZIZ.sdkKey);
            InterfaceC772390URp.p.LJFF(map2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selectQualityDecision quality -> ");
        sbLIZ.append(quality);
        sbLIZ.append(", manualLevel -> ");
        sbLIZ.append(iLevel);
        sbLIZ.append(", qualityChecked -> ");
        sbLIZ.append(qualityLIZIZ);
        C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C776550UdB LJIILJJIL(String str, String str2) {
        String str3;
        PushStreamInfo.Quality qualityLJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopAutoStreamQualityDecision before ");
        sbLIZ.append(this.LJIIJJI);
        C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI != EnumC776530Ud9.AUTO_TEST_RUNNING) {
            return C776550UdB.LJII;
        }
        try {
            String value = C19370910qR.LIZ().getValue();
            this.LIZLLL = value;
            C1D4C c1d4cLIZLLL = LIZLLL();
            C776580UdE c776580UdE = new C776580UdE();
            if (this.LIZIZ) {
                c776580UdE.LIZ = false;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("gear_identifier", value);
                c776580UdE.LIZIZ = linkedHashMap;
            }
            C1D47 c1d47LJ = c1d4cLIZLLL.LJ(c776580UdE);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("stopAutoStreamQualityDecision finalVideoQualityResult ");
            sbLIZ2.append(c1d47LJ);
            C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ2));
            if (AutoSpeedTestingResultSetting.INSTANCE.enabled() && c1d47LJ != null && c1d47LJ.LJIIIIZZ.LJFF && (qualityLJFF = LJFF(c1d47LJ)) != null) {
                C500260Jjc.LJJLIIIJJIZ(new AwS256S0300000_12(qualityLJFF, this, c1d47LJ.LJIIIIZZ, 19));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("stopAutoStreamQualityDecision apply detect success on stop: isProbeRunning=");
                sbLIZ3.append(c1d47LJ.LJIIIIZZ.LJFF);
                sbLIZ3.append(", videoQualityResult=");
                sbLIZ3.append(qualityLJFF);
                C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ3));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJIIZILJ(EnumC776530Ud9.STOPPED);
        C1D4C c1d4cLIZLLL2 = LIZLLL();
        C1D45 c1d45 = new C1D45();
        c1d45.LIZLLL = str;
        c1d45.LIZIZ = EnumC783720Uok.AUTO;
        c1d45.LIZJ = C0UWR.AUTO_PROBE_SWITCH_SCENE;
        c1d45.LIZ = false;
        c1d45.LJFF = c1d45.LJFF;
        c1d4cLIZLLL2.LJII(c1d45);
        LJIILL();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIL;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str3 = quality.sdkKey) == null) {
            str3 = "";
        }
        C0UWT.LIZ(jCurrentTimeMillis, "cancelled", str2, str3, "");
        this.LJFF = null;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("stopAutoStreamQualityDecision after ");
        sbLIZ4.append(this.LJIIJJI);
        C20441214yg.LJIIIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ4));
        return C776550UdB.LIZJ;
    }

    public final void LIZ(int i, String str, String str2, String str3, String str4) {
        String str5;
        C1D4C c1d4cLIZLLL = LIZLLL();
        C1D45 c1d45 = new C1D45();
        c1d45.LIZ = true;
        c1d45.LIZLLL = str2;
        c1d45.LJI = i;
        c1d45.LJII = str4;
        if (str != null) {
            c1d45.LJ = str;
        }
        c1d4cLIZLLL.LJIILL(c1d45);
        EnumC776530Ud9 enumC776530Ud9 = this.LJIIJJI;
        if (enumC776530Ud9 == EnumC776530Ud9.AUTO_TEST_RUNNING || enumC776530Ud9 == EnumC776530Ud9.MANUAL_TEST_RUNNING) {
            EnumC783720Uok enumC783720Uok = EnumC783720Uok.AUTO;
            if (enumC776530Ud9 == EnumC776530Ud9.MANUAL_TEST_RUNNING) {
                enumC783720Uok = EnumC783720Uok.MANUAL;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIL;
            PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LLILZ.gg0(BroadcastShareScreenDefinition.class);
            if (quality == null || (str5 = quality.sdkKey) == null) {
                str5 = "";
            }
            C0UWT.LIZJ(enumC783720Uok, jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT), jCurrentTimeMillis, "cancelled", str3, str5, "", -1, "");
        }
        LJIIZILJ(EnumC776530Ud9.IDLE);
        LJIILL();
        this.LJII = null;
        this.LJ = null;
        this.LIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIL = 0L;
    }
}
