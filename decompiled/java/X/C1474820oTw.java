package X;

import Y.ARunnableS113S0100000_13;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.IPreciseExpService;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.h;
import com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.mediakit.fetcher.AVMDLURLFetcherBridge;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.mediakit.net.AVMDLNetClient;
import com.ss.mediakit.net.AVMDLNetClientMaker;
import com.ss.mediakit.vcnlib.NetUtils;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tiktok.ttkmedia.configcenter.ConfigCenter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474820oTw {
    public final EnginePreloader LIZ;
    public final C1478300oZY LIZIZ = C1478190oZN.LIZ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v468, types: [X.0ofM] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.0oKz] */
    public final boolean LIZ() {
        boolean zIsDebug;
        RuntimeException runtimeException;
        EnginePreloaderConfig enginePreloaderConfig;
        JSONObject jSONObject;
        if (this.LIZ.LIZIZ || this.LIZ.LIZJ) {
            return false;
        }
        SimRadar.traceGroup("SimKitBGInit").LIZ("EnginePreloaderInit").LIZ();
        SimRadar.keyScan("EnginePreloader", "checkInit-start", new Object[0]);
        this.LIZ.LIZJ = true;
        EnginePreloader enginePreloader = this.LIZ;
        enginePreloader.LJIIZILJ = enginePreloader.LJJZ();
        if (((Boolean) C1474810oTv.LLLLLLL.getValue()).booleanValue()) {
            TTVideoEngineLog.setLogNotifyLevel(2, 0);
            TTVideoEngineLog.setLogNotifyLevel(1, 0);
        }
        if (!TextUtils.isEmpty(this.LIZ.LJIIZILJ)) {
            try {
                AVMDLLog.turnOn(1, this.LIZIZ.getExperiment().PlayerAbEnableDebugLogExp());
                this.LIZIZ.getVideoCachePlugin().LIZ();
                int iVideoCacheLoaderTypeExperiment = this.LIZIZ.getExperiment().VideoCacheLoaderTypeExperiment();
                if (iVideoCacheLoaderTypeExperiment > 0) {
                    TTVideoEngine.LLFII(5, iVideoCacheLoaderTypeExperiment);
                }
                this.LIZ.LIZLLL = this.LIZIZ.getExperiment().PlayerPreloadLazyGetUrlsExperiment().booleanValue() || C1475000oUE.LIZIZ().isDebug();
                int iVideoSpeedQueueSizeExperiment = this.LIZIZ.getExperiment().VideoSpeedQueueSizeExperiment();
                if (this.LIZIZ.getSpeedManager().LJFF() != iVideoSpeedQueueSizeExperiment && iVideoSpeedQueueSizeExperiment > 0) {
                    this.LIZIZ.getSpeedManager().LJI(iVideoSpeedQueueSizeExperiment);
                    this.LIZIZ.getSpeedManager().LIZJ(iVideoSpeedQueueSizeExperiment);
                }
                int iNewUserVodOptDiversion = this.LIZIZ.getExperiment().newUserVodOptDiversion();
                int iNewUserVodOptDiversionV2 = this.LIZIZ.getExperiment().newUserVodOptDiversionV2();
                int iNewUserVodOptDiversionV3 = this.LIZIZ.getExperiment().newUserVodOptDiversionV3();
                this.LIZ.getClass();
                EnginePreloader.LJLIL(iNewUserVodOptDiversion, iNewUserVodOptDiversionV2, iNewUserVodOptDiversionV3);
                TTVideoEngine.LLFII(30, this.LIZIZ.getExperiment().PlayerDataEncryptExperiment());
                if (((Number) C1474810oTv.LLJJI.getValue()).intValue() == 1) {
                    TTVideoEngine.LLFII(9018, 1);
                    TTVideoEngine.LLILLJJLI(9020, "-499896,-5,-499973,-499897,-1094995529");
                }
                if (((Boolean) C1474810oTv.S3.getValue()).booleanValue()) {
                    TTVideoEngine.LLFII(2027, 1);
                }
                int iIntValue = ((Number) C1474810oTv.R3.getValue()).intValue();
                if (iIntValue > 0) {
                    TTVideoEngine.LLFII(2028, iIntValue);
                }
                int iVideoCacheMaxCacheSizeExperiment = this.LIZIZ.getExperiment().VideoCacheMaxCacheSizeExperiment();
                TTVideoEngine.LLFII(1, ((int) (iVideoCacheMaxCacheSizeExperiment > 0 ? iVideoCacheMaxCacheSizeExperiment : 100L)) * 1048576);
                TTVideoEngine.LLFII(1005, this.LIZIZ.getExperiment().DisableVideocacheLocalServerExperiment());
                TTVideoEngine.LLFII(1006, this.LIZIZ.getExperiment().RingBufferSizeMdlExperiment());
                TTVideoEngine.LLFII(15, 0);
                TTVideoEngine.LLFII(93, this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableBenchmarkExp());
                TTVideoEngine.LLFII(94, this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableSpeedCoefficientExp());
                TTVideoEngine.LLFII(3, this.LIZIZ.getExperiment().EnginePreloaderOpenTimeoutExperiment());
                TTVideoEngine.LLFII(1011, this.LIZIZ.getExperiment().EnginePreloaderEnableNetworkChangedListenExperiment());
                TTVideoEngine.LLFII(2, this.LIZIZ.getExperiment().EnginePreloaderRWTimeoutExperiment());
                TTVideoEngine.LLFII(11, this.LIZIZ.getExperiment().EnginePreloaderConcurrentNumExperiment());
                TTVideoEngine.LLFII(80, this.LIZIZ.getExperiment().EnginePreloaderStackOrQueueExperiment());
                TTVideoEngine.LLFII(12, this.LIZIZ.getExperiment().EnginePreloaderPreloadStrategyExperiment());
                TTVideoEngine.LLFII(13, this.LIZIZ.getExperiment().PlayerAbChecksumLevelExp());
                TTVideoEngine.LLFII(14, this.LIZIZ.getExperiment().PlayerAbTestSpeedVersionExp());
                TTVideoEngine.LLFII(90, this.LIZIZ.getExperiment().PlayerAbMainDnsTypeExp());
                TTVideoEngine.LLFII(91, this.LIZIZ.getExperiment().PlayerAbBackupDnsTypeExp());
                TTVideoEngine.LLFII(92, this.LIZIZ.getExperiment().PlayerAbMainDnsDelayTimeExp());
                TTVideoEngine.LLFII(1102, this.LIZIZ.getExperiment().PlayerAbMedialoaderAccessCheckLevelExp());
                TTVideoEngine.LLFII(1101, this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableTaskReuseExp());
                TTVideoEngine.LLFII(1103, this.LIZIZ.getExperiment().PlayerAbMedialoaderTaskReuseParallelNextThresholdExp());
                TTVideoEngine.LLFII(22, this.LIZIZ.getExperiment().enginePreloaderEnableTTnetLoader());
                TTVideoEngine.LLFII(105, this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableDnsRefreshExp());
                TTVideoEngine.LLFII(103, this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableDnsParallelExp());
                TTVideoEngine.LLFII(106, this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableDnsLogExp());
                TTVideoEngine.LLILLJJLI(108, this.LIZIZ.getExperiment().PlayerAbMedialoaderGoogleDnsHostExp());
                TTVideoEngine.LLILLJJLI(107, this.LIZIZ.getExperiment().PlayerAbMedialoaderOwnDnsHostExp());
                TTVideoEngine.LLFII(4, this.LIZIZ.getExperiment().getPreloaderExpModel().LJI);
                this.LIZIZ.getExperiment().getPreloaderExpModel().getClass();
                TTVideoEngine.LLFII(1147, 0);
                TTVideoEngine.LLFII(1146, this.LIZIZ.getExperiment().getPreloaderExpModel().LJIIJ);
                if (!((Boolean) C1474810oTv.t1.getValue()).booleanValue()) {
                    TTVideoEngine.LLILLJJLI(122, this.LIZIZ.getExperiment().getPlayerTraceHost());
                }
                TTVideoEngine.LLFII(1150, ((Number) C1474810oTv.LLZLI.getValue()).intValue());
                TTVideoEngine.LLFII(13000, ((Number) C1474810oTv.LLZLL.getValue()).intValue());
                TTVideoEngine.LLFII(13001, ((Number) C1474810oTv.LLZLLIL.getValue()).intValue());
                TTVideoEngine.LLFII(13002, C1474810oTv.LJJIII());
                TTVideoEngine.LLFII(13003, ((Number) C1474810oTv.LLZZ.getValue()).intValue());
                if (((Boolean) C1474810oTv.f4.getValue()).booleanValue()) {
                    TTVideoEngine.LLFII(13004, 1);
                    C1476410oWV.LIZ();
                }
                if (((Boolean) C1474810oTv.LLZZJLIL.getValue()).booleanValue()) {
                    TTVideoEngine.LJLJLJ(31001, (String) C1474810oTv.g.getValue());
                }
                if (((Boolean) C1474810oTv.LLZZLLIL.getValue()).booleanValue()) {
                    TTVideoEngine.LJLJLJ(31004, (String) C1474810oTv.h.getValue());
                }
                String str = (String) C1474810oTv.LLZZZIL.getValue();
                if (!TextUtils.isEmpty(str)) {
                    TTVideoEngine.LJLJLJ(StrategyCenter.ALGO_CONFIG_SMART_SERVICE_PACKAGE_URL, str);
                }
                C01GW c01gw = C1474810oTv.c;
                if (!TextUtils.isEmpty((String) c01gw.getValue())) {
                    TTVideoEngine.LJLJLJ(31014, (String) c01gw.getValue());
                }
                C01GW c01gw2 = C1474810oTv.d;
                if (!TextUtils.isEmpty((String) c01gw2.getValue())) {
                    TTVideoEngine.LJLJLJ(31015, (String) c01gw2.getValue());
                }
                C01GW c01gw3 = C1474810oTv.e;
                if (!TextUtils.isEmpty((String) c01gw3.getValue())) {
                    TTVideoEngine.LJLJLJ(31016, (String) c01gw3.getValue());
                }
                C01GW c01gw4 = C1474810oTv.a;
                if (!TextUtils.isEmpty((String) c01gw4.getValue())) {
                    TTVideoEngine.LJLJLJ(31005, (String) c01gw4.getValue());
                }
                C01GW c01gw5 = C1474810oTv.b;
                if (!TextUtils.isEmpty((String) c01gw5.getValue())) {
                    TTVideoEngine.LJLJLJ(31010, (String) c01gw5.getValue());
                }
                C01GW c01gw6 = C1474810oTv.f;
                if (!TextUtils.isEmpty((String) c01gw6.getValue())) {
                    TTVideoEngine.LJLJLJ(31018, (String) c01gw6.getValue());
                }
                C01GW c01gw7 = C1474810oTv.U2;
                if (!TextUtils.isEmpty((String) c01gw7.getValue())) {
                    TTVideoEngine.LJLJLJ(31023, (String) c01gw7.getValue());
                }
                C01GW c01gw8 = C1474810oTv.W2;
                if (!TextUtils.isEmpty((String) c01gw8.getValue())) {
                    TTVideoEngine.LJLJLJ(31024, (String) c01gw8.getValue());
                }
                C01GW c01gw9 = C1474810oTv.X2;
                if (!TextUtils.isEmpty((String) c01gw9.getValue())) {
                    TTVideoEngine.LJLJLJ(31025, (String) c01gw9.getValue());
                }
                C01GW c01gw10 = C1474810oTv.Y2;
                if (!TextUtils.isEmpty((String) c01gw10.getValue())) {
                    TTVideoEngine.LJLJLJ(31026, (String) c01gw10.getValue());
                }
                C01GW c01gw11 = C1474810oTv.Z2;
                if (!TextUtils.isEmpty((String) c01gw11.getValue())) {
                    TTVideoEngine.LJLJLJ(31031, (String) c01gw11.getValue());
                }
                TTVideoEngine.LLFII(1009, this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableFileRingBuffer());
                TTVideoEngine.LLFII(1010, this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableFileExtendBuffer());
                if (this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableBackupDnsIPExp() == 1) {
                    TTVideoEngine.LLFII(104, 1);
                    EnginePreloader enginePreloader2 = this.LIZ;
                    Map<String, String> map = enginePreloader2.LJIILL;
                    if (map != null) {
                        enginePreloader2.LJLJJLL(map);
                    }
                } else {
                    TTVideoEngine.LLFII(104, 0);
                }
                EnginePreloader enginePreloader3 = this.LIZ;
                enginePreloader3.LJJJJLL(enginePreloader3.LJJIII.isOpenDataFreeMode());
                TTVideoEngine.LLFII(1001, iNewUserVodOptDiversion != 1 ? this.LIZIZ.getExperiment().PlayerAbMedialoaderEnablePreconneExp() : 1);
                TTVideoEngine.LLFII(1002, iNewUserVodOptDiversion == 1 ? 2 : this.LIZIZ.getExperiment().PlayerAbMedialoaderPreconnectNumExp());
                TTVideoEngine.LLFII(101, iNewUserVodOptDiversion != 1 ? this.LIZIZ.getExperiment().PlayerAbMedialoaderEnableTLSSessionReuseExp() : 1);
                TTVideoEngine.LLFII(100, iNewUserVodOptDiversion == 1 ? 3 : this.LIZIZ.getExperiment().PlayerAbMedialoaderTLSVersionExp());
                TTVideoEngine.LLFII(1111, this.LIZIZ.getExperiment().PlayerAbMediaLoaderCheckPreloadLevelExp());
                TTVideoEngine.LLFII(1118, this.LIZIZ.getExperiment().PlayerAbMedialoaderLazyBufferPoolEnableExp());
                TTVideoEngine.LLFII(99, C1474830oTx.LIZIZ(this.LIZIZ.getExperiment()));
                TTVideoEngine.LLFII(96, C1474830oTx.LJFF(this.LIZIZ.getExperiment()));
                TTVideoEngine.LLFII(98, C1474830oTx.LIZJ(this.LIZIZ.getExperiment()));
                TTVideoEngine.LLFII(97, C1474830oTx.LIZLLL(this.LIZIZ.getExperiment()));
                TTVideoEngine.LLFII(109, C1474830oTx.LJ(this.LIZIZ.getExperiment()));
                TTVideoEngine.LLFII(1110, C1474830oTx.LJI(this.LIZIZ.getExperiment()));
                TTVideoEngine.LLFII(1108, C1474830oTx.LIZ(this.LIZIZ.getExperiment()));
                TTVideoEngine.LLJI(this.LIZIZ.getExperiment().PlayerAbMedialoaderOwnDnsHostExp());
                TTVideoEngine.LLFII(1114, this.LIZIZ.getExperiment().PlayerAbMedialoaderHeaderDataMemCache());
                TTVideoEngine.LLFII(1115, this.LIZIZ.getExperiment().PlayerAbMedialoaderIpv6Num());
                TTVideoEngine.LLFII(1116, this.LIZIZ.getExperiment().PlayerAbMedialoaderIpv4Num());
                NetUtils.setApplicationContext(C1475000oUE.LIZLLL());
                if (this.LIZIZ.getExperiment().isEnginePreloaderForceUseOKHttp() == 1) {
                    this.LIZIZ.getNetClient().LIZIZ();
                }
                TTVideoEngine.LLFII(1119, this.LIZIZ.getExperiment().EnginePreloaderTlsSessionTimeoutExperiment());
                TTVideoEngine.LLFII(1112, 2);
                TTVideoEngine.LLFII(31, this.LIZIZ.getExperiment().isEnginePreloaderForceUseOKHttp());
                TTVideoEngine.LLFII(1127, this.LIZIZ.getExperiment().PlayerMdlLogEnableExperiment());
                TTVideoEngine.LLFII(1128, this.LIZIZ.getExperiment().EnginePreloaderNetSchedulerEnableExperiment());
                TTVideoEngine.LLFII(1130, this.LIZIZ.getExperiment().EnginePreloaderNetSchedulerBlockErrorCountExperiment());
                TTVideoEngine.LLFII(1131, this.LIZIZ.getExperiment().EnginePreloaderNetSchedulerBlockDurationExperiment());
                TTVideoEngine.LLFII(1129, this.LIZIZ.getExperiment().EnginePreloaderNetSchedulerBlockAllNetErrorExperiment());
                TTVideoEngine.LLFII(21, this.LIZIZ.getExperiment().EnableDownloaderLogExpErrorExperiment());
                TTVideoEngine.LLFII(1137, this.LIZIZ.getExperiment().getPreloaderExpModel().LIZ);
                TTVideoEngine.LLFII(1138, this.LIZIZ.getExperiment().getPreloaderExpModel().LIZIZ);
                TTVideoEngine.LLFII(1139, this.LIZIZ.getExperiment().getPreloaderExpModel().LIZJ);
                TTVideoEngine.LLFII(1141, this.LIZIZ.getExperiment().getPreloaderExpModel().LIZLLL);
                TTVideoEngine.LLFII(1140, this.LIZIZ.getExperiment().getPreloaderExpModel().LJ);
                TTVideoEngine.LLIIIILZ(1142, this.LIZIZ.getExperiment().getPreloaderExpModel().LJFF);
                TTVideoEngine.LLFII(1117, this.LIZIZ.forbidBypassCookie() ? 1 : 0);
                TTVideoEngine.LLFII(1145, this.LIZIZ.getExperiment().getPreloaderExpModel().LJII);
                TTVideoEngine.LLIIIILZ(1144, this.LIZIZ.getExperiment().getPreloaderExpModel().LJIIIIZZ);
                TTVideoEngine.LLIL(C1475000oUE.LIZLLL(), this.LIZIZ.getExperiment().getPreloaderExpModel().LJIIIZ);
                TTVideoEngine.LLFII(1148, this.LIZIZ.getExperiment().getPreloaderExpModel().LJIIJJI);
                HashMap<String, Object> map2 = this.LIZIZ.getExperiment().getPreloaderExpModel().LJIIL;
                if (map2 != null) {
                    if ((map2.get("DATALOADER_KEY_STR_VDP_ABTEST_ID") instanceof String) && !TextUtils.isEmpty((String) map2.get("DATALOADER_KEY_STR_VDP_ABTEST_ID"))) {
                        TTVideoEngine.LLILLJJLI(1106, (String) map2.get("DATALOADER_KEY_STR_VDP_ABTEST_ID"));
                    }
                    if ((map2.get("DATALOADER_KEY_STR_VDP_ABGROUP_ID") instanceof String) && !TextUtils.isEmpty((String) map2.get("DATALOADER_KEY_STR_VDP_ABGROUP_ID"))) {
                        TTVideoEngine.LLILLJJLI(1107, (String) map2.get("DATALOADER_KEY_STR_VDP_ABGROUP_ID"));
                    }
                    if (map2.get("DATALOADER_KEY_INT_ENABLE_EARLY_DATA") instanceof Integer) {
                        TTVideoEngine.LLFII(1160, ((Integer) map2.get("DATALOADER_KEY_INT_ENABLE_EARLY_DATA")).intValue());
                    }
                }
                TTVideoEngine.LLIIIILZ(1152, this.LIZIZ.getExperiment().getPreloaderExpModel().LJIILIIL);
                TTVideoEngine.LLIIIILZ(1153, this.LIZIZ.getExperiment().getPreloaderExpModel().LJIILJJIL);
                TTVideoEngine.LLILLJJLI(9010, this.LIZIZ.getExperiment().getPreloaderExpModel().LJIILL);
                TTVideoEngine.LLJJIJIL(this.LIZIZ.getExperiment().getPreloaderExpModel().LJIILLIIL);
                try {
                    enginePreloaderConfig = this.LIZIZ.getExperiment().EnginePreloaderConfigExperiment();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    enginePreloaderConfig = null;
                }
                IAppConfig iAppConfig = (IAppConfig) InjectedConfigManager.getConfig(IAppConfig.class);
                if (((Boolean) C1474810oTv.LLLLZI.getValue()).booleanValue()) {
                    TTVideoEngine.LLF(738, iAppConfig.getDeviceScore());
                }
                if (enginePreloaderConfig == null) {
                    enginePreloaderConfig = new EnginePreloaderConfig();
                }
                TTVideoEngine.LLFII(7, iNewUserVodOptDiversion == 1 ? 1 : enginePreloaderConfig.enableExternDns);
                TTVideoEngine.LLFII(8, iNewUserVodOptDiversion == 1 ? 1 : enginePreloaderConfig.enableSocketReuse);
                TTVideoEngine.LLFII(9, enginePreloaderConfig.enableSocketIdleTimeout);
                TTVideoEngine.LLILLJJLI(0, this.LIZ.LJIIZILJ);
                TTVideoEngine.LLFII(1113, this.LIZIZ.getExperiment().PlayerAbDashPreloadAudioFirstExp() == 1 ? 1 : 0);
                boolean zEnableDetailNotification = this.LIZIZ.getExperiment().EnableDetailNotification();
                TTVideoEngine.LLFII(200, zEnableDetailNotification ? 1 : 0);
                TTVideoEngine.LLFII(1158, this.LIZIZ.getExperiment().EngineEnableMaxFileMemCacheSizeExp());
                TTVideoEngine.LLFII(1159, this.LIZIZ.getExperiment().EngineEnableMaxFileMemCacheNumExp());
                TTVideoEngine.LLILLJJLI(1506, String.valueOf(C1475000oUE.LIZIZ().getAppID()));
                AVMDLDataLoader.initApplicationContext(C1475000oUE.LIZLLL());
                DataLoaderHelper.LJJIIZI().LJJJJL(9017, 1);
                C1474930oU7.LIZIZ(C1474840oTy.LIZ(new ARunnableS113S0100000_13(this, 31)));
                TTVideoEngine.LJLLLLLL(new C1475120oUQ(this.LIZ));
                AVMDLURLFetcherBridge.setFetcherMaker(new C1467930oIp());
                if (this.LIZIZ.getExperiment().EnableTTnetClientInject()) {
                    final C1469900oM0 c1469900oM0 = new C1469900oM0(this);
                    AVMDLDNSParser.setClientMaker(new AVMDLNetClientMaker(c1469900oM0) { // from class: X.0oLz
                        public final InterfaceC1469910oM1 LIZ;

                        @Override // com.ss.mediakit.net.AVMDLNetClientMaker
                        public final AVMDLNetClient getNetClient() {
                            return new AVMDLNetClient(((C1469900oM0) this.LIZ).LIZ.LIZIZ.getNetClient()) { // from class: X.0oLx
                                public final InterfaceC1469840oLu LIZ;

                                @Override // com.ss.mediakit.net.AVMDLNetClient
                                public final void cancel() {
                                    this.LIZ.cancel();
                                }

                                {
                                    this.LIZ = interfaceC1469840oLu;
                                }

                                @Override // com.ss.mediakit.net.AVMDLNetClient
                                public final void startTask(String str2, AVMDLNetClient.CompletionListener completionListener) {
                                    this.LIZ.LIZ(str2, new C1469880oLy(completionListener));
                                }

                                @Override // com.ss.mediakit.net.AVMDLNetClient
                                public final void startTask(String str2, Map<String, String> map3, AVMDLNetClient.CompletionListener completionListener) {
                                    this.LIZ.LIZJ(str2, map3, new C1469880oLy(completionListener));
                                }

                                @Override // com.ss.mediakit.net.AVMDLNetClient
                                public final void startTask(String str2, Map<String, String> map3, JSONObject jSONObject2, int i, AVMDLNetClient.CompletionListener completionListener) {
                                    this.LIZ.LIZLLL(str2, map3, jSONObject2, i, new C1469880oLy(completionListener));
                                }
                            };
                        }

                        {
                            this.LIZ = c1469900oM0;
                        }
                    });
                }
                this.LIZ.LJJLIIIIJ();
                this.LIZ.LJLIIL();
                TTVideoEngine.LLILL(new C1468690oK3(this));
                if (((Boolean) C1474810oTv.LJJI.getValue()).booleanValue()) {
                    this.LIZIZ.getKVStorageProvider();
                    TTVideoEngine.LLFZ(new InterfaceC796980VOe() { // from class: X.0oKz
                    });
                }
                TTVideoEngine.LLIILII(new C1474720oTm());
                this.LIZ.LJIIJJI = this.LIZIZ.isPreloadV3Enabled();
                if (this.LIZ.LJIIJJI) {
                    TTVideoEngine.LLFII(12, 200);
                    TTVideoEngine.LLIILZL();
                    TTVideoEngine.LLIIJI();
                    TTVideoEngine.LLILIL(new C797000VOg(this));
                }
                TTVideoEngine.LLILLJJLI(1506, this.LIZIZ.getExperiment().getMDLUA1());
                C01GW c01gw12 = C1474810oTv.V2;
                if (!TextUtils.isEmpty((String) c01gw12.getValue())) {
                    TTVideoEngine.LLFII(13005, 1);
                    TTVideoEngine.LLFII(55016, 1);
                    TTVideoEngine.LJLJLJ(31028, (String) c01gw12.getValue());
                }
                LIZIZ();
                TTVideoEngine.LLFII(33, 1);
                TTVideoEngine.LLFII(1154, 1);
                this.LIZIZ.getSensitiveSceneTransmitter();
                this.LIZIZ.getSensitiveSceneTransmitter().LIZ();
                String dataLoaderMdlExtensionOpts = this.LIZIZ.getExperiment().getDataLoaderMdlExtensionOpts();
                if (!TextUtils.isEmpty(dataLoaderMdlExtensionOpts)) {
                    TTVideoEngine.LLILLJJLI(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, dataLoaderMdlExtensionOpts);
                }
                String moduleConfigJsonString = this.LIZIZ.getExperiment().getModuleConfigJsonString();
                if (!TextUtils.isEmpty(moduleConfigJsonString)) {
                    TTVideoEngine.LJLJLJ(31008, moduleConfigJsonString);
                    new JSONObject(moduleConfigJsonString);
                }
                String gearStrategyJsonString = this.LIZIZ.getExperiment().getGearStrategyJsonString();
                if (!TextUtils.isEmpty(gearStrategyJsonString)) {
                    JSONObject jSONObject2 = new JSONObject(gearStrategyJsonString);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("bitrate_switch_threshold", this.LIZIZ.getExperiment().getBitrateSwitchThreshold());
                    jSONObject2.put("cache_check", jSONObject3);
                    String str2 = (String) C1474810oTv.LJJIIZ.getValue();
                    if (!TextUtils.isEmpty(str2)) {
                        JSONObject jSONObject4 = new JSONObject(str2);
                        if (!jSONObject4.has("find_cache") && C1474810oTv.LJJLIIIJJIZ()) {
                            jSONObject4.put("find_cache", C1474810oTv.LJJLIIIJJIZ() ? 1 : 0);
                        }
                        jSONObject2.put("extra_config", jSONObject4);
                    }
                    String str3 = (String) C1474810oTv.LJJIIZI.getValue();
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject2.put("select_algo_config", new JSONObject(str3));
                    }
                    String str4 = (String) C1474810oTv.LJJIJ.getValue();
                    if (!TextUtils.isEmpty(str4)) {
                        jSONObject2.put("log_config", new JSONObject(str4));
                    }
                    String str5 = (String) C1474810oTv.LJJIJIIJI.getValue();
                    if (!TextUtils.isEmpty(str5)) {
                        jSONObject2.put("abr_select_config", new JSONObject(str5));
                    }
                    String str6 = (String) C1474810oTv.LJJIJIIJIL.getValue();
                    if (!TextUtils.isEmpty(str6)) {
                        jSONObject2.put("weak_network_select_config", new JSONObject(str6));
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    String strLJIIIIZZ = C1474810oTv.LJIIIIZZ();
                    if (!TextUtils.isEmpty(strLJIIIIZZ)) {
                        jSONObject5.put("audio_label_config", new JSONObject(strLJIIIIZZ));
                    }
                    String str7 = (String) C1474810oTv.U0.getValue();
                    if (!TextUtils.isEmpty(str7)) {
                        jSONObject5.put("skip_audio_label_config", new JSONObject(str7));
                    }
                    String strLLIIII = C1474810oTv.LLIIII();
                    if (!TextUtils.isEmpty(strLLIIII)) {
                        jSONObject5.put("audio_select_config", new JSONObject(strLLIIII));
                    }
                    String strLJIILLIIL = C1474810oTv.LJIILLIIL();
                    if (!TextUtils.isEmpty(strLJIILLIIL)) {
                        jSONObject5.put("cae_audio_select_config", new JSONObject(strLJIILLIIL));
                    }
                    String str8 = (String) C1474810oTv.LJJIJIL.getValue();
                    if (!TextUtils.isEmpty(str8)) {
                        JSONObject jSONObject6 = new JSONObject(str8);
                        Iterator<String> itKeys = jSONObject6.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject5.put(next, jSONObject6.get(next));
                        }
                    }
                    jSONObject5.put("enable", C1474810oTv.LJJLIIIJ());
                    if (jSONObject5.length() > 0) {
                        jSONObject2.put("dash_audio_config", jSONObject5);
                    }
                    String str9 = (String) C1474810oTv.f200a3.getValue();
                    if (!TextUtils.isEmpty(str9)) {
                        jSONObject2.put("ml_gear_config", new JSONObject(str9));
                    }
                    C1468060oJ2.LIZ();
                    if (C790030Uyv.LIZ.LJIIJJI == 1) {
                        IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = C582130MsN.LIZ().getConfig().getDimensionBitrateCurveConfig();
                        if (dimensionBitrateCurveConfig != null && dimensionBitrateCurveConfig.enable()) {
                            C1484380ojM c1484380ojMConfig = dimensionBitrateCurveConfig.config();
                            h hVar = c1484380ojMConfig.LIZ;
                            if (hVar != null && hVar.size() > 0) {
                                jSONObject2.put("curve_global_conditions", new JSONArray(hVar.toString()));
                            }
                            h hVar2 = c1484380ojMConfig.LIZIZ;
                            if (hVar2 != null && hVar2.size() > 0) {
                                jSONObject2.put("curve_additional_conditions", new JSONArray(hVar2.toString()));
                            }
                            h hVar3 = c1484380ojMConfig.LIZLLL;
                            if (hVar3 != null && hVar3.size() > 0) {
                                jSONObject2.put("curve_priority_list", new JSONArray(hVar3.toString()));
                            }
                        }
                        int lastNetworkSpeed = C582130MsN.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed();
                        C582130MsN.LIZ().LJ();
                        C1476910oXJ.LIZJ().LIZLLL(lastNetworkSpeed);
                        jSONObject2.put("initial_speed", lastNetworkSpeed);
                        jSONObject2.put("use_540_for_low_device", C1474810oTv.LLJLLIL());
                        jSONObject2.put("bitrate_for_low_device", C1474810oTv.LJIIIZ());
                    }
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("vod_strategy_select_bitrate", jSONObject2);
                    TTVideoEngine.LJLJLJ(31006, C786410Ut5.J3(jSONObject7));
                }
                String bandWidthJsonString = this.LIZIZ.getExperiment().getBandWidthJsonString();
                if (!TextUtils.isEmpty(bandWidthJsonString)) {
                    JSONObject jSONObject8 = new JSONObject(bandWidthJsonString);
                    if (jSONObject8.has("vod_strategy_bandwidth") && (jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject8, "vod_strategy_bandwidth")) != null && iVideoSpeedQueueSizeExperiment > 0) {
                        jSONObject.put("queue_capacity", iVideoSpeedQueueSizeExperiment);
                    }
                    TTVideoEngine.LJLJLJ(31007, C786410Ut5.J3(jSONObject8));
                }
                if (((Boolean) C1474810oTv.LJJL.getValue()).booleanValue()) {
                    TTVideoEngine.LLIIIZ(new C1468510oJl(this));
                }
                TTVideoEngineLog.turnOn(1, this.LIZIZ.getExperiment().PlayerAbEnableDebugLogExp());
                C1474930oU7.LIZIZ(C1474840oTy.LIZIZ(new ARunnableS113S0100000_13(this, 32)));
                this.LIZ.LJJIJIIJIL.await(30000L, TimeUnit.MILLISECONDS);
                if (((Boolean) C1474810oTv.W4.getValue()).booleanValue()) {
                    System.currentTimeMillis();
                    C1286610jaN.LIZ();
                }
                C1284100jWK.LIZJ().LIZIZ();
                TTVideoEngine.LLJJJ(C1475000oUE.LIZLLL());
                C1284100jWK.LIZJ().LIZ();
                C1469160oKo.LJ().LJIIL(new IPreciseExpService() { // from class: X.0ofM
                    public final IStrategyCenterPreciseExpService LIZ;

                    {
                        IStrategyCenterPreciseExpService iStrategyCenterPreciseExpService = (IStrategyCenterPreciseExpService) InjectedConfigManager.getConfig(IStrategyCenterPreciseExpService.class);
                        this.LIZ = iStrategyCenterPreciseExpService == null ? IStrategyCenterPreciseExpService.LIZ : iStrategyCenterPreciseExpService;
                    }

                    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
                    public final boolean getBooleanValue(String str10) {
                        return this.LIZ.getBooleanValue(str10);
                    }

                    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
                    public final double getDoubleValue(String str10) {
                        return this.LIZ.getDoubleValue(str10);
                    }

                    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
                    public final float getFloatValue(String str10) {
                        return this.LIZ.getFloatValue(str10);
                    }

                    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
                    public final int getIntValue(String str10) {
                        return this.LIZ.getIntValue(str10);
                    }

                    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
                    public final long getLongValue(String str10) {
                        return this.LIZ.getLongValue(str10);
                    }

                    @Override // com.bytedance.vcloud.strategy.IPreciseExpService
                    public final String getStringValue(String str10) {
                        return this.LIZ.getStringValue(str10);
                    }
                });
                SimRadar.keyScan("EnginePreloader", "TTVideoEngine#startDataLoader", new Object[0]);
                if (zEnableDetailNotification) {
                    TTVideoEngine.LLIFFJFJJ(this.LIZ.LJJIJIIJI);
                }
                this.LIZ.LJLJL();
                this.LIZ.getClass();
                EnginePreloader.LJLIIIL();
                this.LIZ.LIZIZ = true;
            } finally {
                if (zIsDebug) {
                }
            }
        }
        if (!((Boolean) C1474810oTv.c3.getValue()).booleanValue()) {
            if ((C1474810oTv.LJLJL() & 1) != 0) {
                ExecutorService executorServiceLJ = C1475000oUE.LJ();
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("TTVideoEngine", "set threadpool");
                EngineThreadPool.setExecutorInstance(executorServiceLJ);
            }
            if (((C1474810oTv.LJLJL() >> 1) & 1) != 0) {
                TTVideoEngine.LLIIL(C1475000oUE.LJ());
            }
            if (((Boolean) C1474810oTv.b4.getValue()).booleanValue()) {
                TTVideoEngine.LLFII(1076, 1);
            }
        }
        this.LIZ.LIZJ = false;
        if (C1474810oTv.LLLII()) {
            this.LIZ.LJFF.countDown();
        }
        SimRadar.keyScan("EnginePreloader", "checkInit-end", new Object[0]);
        SimRadar.traceGroup("SimKitBGInit").LIZ("EnginePreloaderInit").end();
        return this.LIZ.LIZIZ;
    }

    public final void LIZIZ() {
        if (C1474930oU7.LIZLLL) {
            return;
        }
        C1474930oU7.LIZLLL = true;
        if (this.LIZIZ.getExperiment().newVodLibraStaticOptionList() != null) {
            ConfigCenter.LJI().getClass();
            InterfaceC1467440oI2 interfaceC1467440oI2LIZ = ConfigCenter.LIZ(2);
            C1469420oLE.LIZLLL(interfaceC1467440oI2LIZ, this.LIZIZ.getExperiment().newVodLibraStaticOptionList());
            ConfigCenter.LJI().LJIILIIL(4, interfaceC1467440oI2LIZ);
        }
        if (this.LIZIZ.getExperiment().newSharedLibraStaticOptionList() != null) {
            ConfigCenter.LJI().getClass();
            InterfaceC1467440oI2 interfaceC1467440oI2LIZ2 = ConfigCenter.LIZ(1);
            C1469420oLE.LIZLLL(interfaceC1467440oI2LIZ2, this.LIZIZ.getExperiment().newSharedLibraStaticOptionList());
            ConfigCenter.LJI().LJIILL(interfaceC1467440oI2LIZ2);
            ConfigCenter.LJI().LJIILIIL(5, interfaceC1467440oI2LIZ2);
        }
        if (C1474810oTv.LJJJJLL()) {
            ConfigCenter.LJI().getClass();
            InterfaceC1467440oI2 interfaceC1467440oI2LIZ3 = ConfigCenter.LIZ(2);
            C1469420oLE.LIZJ(interfaceC1467440oI2LIZ3, this.LIZIZ.getExperiment().engineStaticOptionList(), true);
            C1469420oLE.LIZJ(interfaceC1467440oI2LIZ3, this.LIZIZ.getExperiment().engineInstanceOptionList(), false);
            ConfigCenter.LJI().LJIILIIL(4, interfaceC1467440oI2LIZ3);
            return;
        }
        if (((Boolean) C1474810oTv.k1.getValue()).booleanValue()) {
            List<C308310C6r> listEngineStaticOptionList = this.LIZIZ.getExperiment().engineStaticOptionList();
            if (listEngineStaticOptionList != null && !listEngineStaticOptionList.isEmpty()) {
                for (C308310C6r c308310C6r : listEngineStaticOptionList) {
                    if (c308310C6r.LIZIZ != null) {
                        C1469420oLE.LIZ(c308310C6r);
                    }
                }
                if (((Boolean) C1474810oTv.l1.getValue()).booleanValue()) {
                    C1469420oLE.LIZ++;
                    if (C1469420oLE.LIZ == 2) {
                        ConfigCenter.LJI().LJIILJJIL(ConfigCenter.LJI().LIZ);
                    }
                } else {
                    ConfigCenter.LJI().LJIILJJIL(ConfigCenter.LJI().LIZ);
                }
            }
            TTVideoEngine.LLFII(4311, 1);
            return;
        }
        List<C308310C6r> listEngineStaticOptionList2 = this.LIZ.LJJIII.getExperiment().engineStaticOptionList();
        if (listEngineStaticOptionList2 != null && listEngineStaticOptionList2.size() > 0) {
            for (C308310C6r c308310C6r2 : listEngineStaticOptionList2) {
                Object obj = c308310C6r2.LIZIZ;
                if (obj != null) {
                    try {
                        int i = c308310C6r2.LIZJ;
                        if (i == 1) {
                            TTVideoEngine.LLFII(c308310C6r2.LIZ, ((Integer) obj).intValue());
                        } else if (i == 2) {
                            TTVideoEngine.LLIIIILZ(c308310C6r2.LIZ, ((Long) obj).longValue());
                        } else if (i == 4) {
                            TTVideoEngine.LLILLJJLI(c308310C6r2.LIZ, (String) obj);
                        } else if (i == 5) {
                            TTVideoEngine.LLILLJJLI(c308310C6r2.LIZ, C786410Ut5.J3((JSONObject) obj));
                        } else if (i == 6) {
                            TTVideoEngine.LLILLJJLI(c308310C6r2.LIZ, ((JSONArray) obj).toString());
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        TTVideoEngine.LLFII(4311, 0);
    }

    public C1474820oTw(EnginePreloader enginePreloader) {
        this.LIZ = enginePreloader;
    }
}
