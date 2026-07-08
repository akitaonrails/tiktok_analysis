package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.util.SparseIntArray;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simkit.model.FeedCacheStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.LoudnessStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.SceneLoudnessConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oaq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479100oaq {
    public volatile ISimKitConfig LIZ = new ISimKitConfig() { // from class: X.0oaX
        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final /* synthetic */ boolean isEnablePlayerImplRefactor() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final /* synthetic */ boolean isEnableTTKPlayStrategyCenter() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final PlayerSettingService PlayerSettingService() {
            return new PlayerSettingService();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IALog getALog() {
            return new IALog() { // from class: X.0oah
                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
                public final void d(String str) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
                public final void e(String str, String str2) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
                public final boolean isEnabled() {
                    return false;
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final C0BZG getAdaptiveRuleConfig() {
            return new C0BZG();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IAppConfig getAppConfig() {
            return new IAppConfig() { // from class: X.0X1w
                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ Sensor createBpeaLightSensor(SensorManager sensorManager) {
                    return null;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final String defaultHost() {
                    return "";
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final int getAppID() {
                    return 0;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final String getAppName() {
                    return "";
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final String getAppVersion() {
                    return null;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ CopyOnWriteArrayList getBusinessLog(String str) {
                    return null;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final String getChannel() {
                    return "";
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ float getDeviceScore() {
                    return -1.0f;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ String getExtraBusinessLog(String str, int i) {
                    return null;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ int getLastInfo(int i) {
                    return -1;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ Cert getLightSensorCert(boolean z) {
                    return null;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final String getNetworkTypeDetail(Context context) {
                    return null;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ Cert getVideoFrameCert() {
                    return null;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ boolean isAppBackground() {
                    return false;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final boolean isDebug() {
                    return false;
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ void resetLastInfo(int i) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ void saveLastInfo(int i, int i2) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ void setBusinessLog(String str, String str2) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ void setBusinessLogOtherInfo(String str, String str2, int i) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final /* synthetic */ void setExtraBusinessLog(JSONObject jSONObject, String str, int i) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
                public final List<String> redirectHosts() {
                    return new ArrayList();
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final ICommonConfig getCommonConfig() {
            return new ICommonConfig() { // from class: X.0oYO
                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ boolean checkIsBytevc1InCache(SimVideoUrlModel simVideoUrlModel) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ double getBitrateSwitchThreshold() {
                    return 0.75d;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ List getColdBootVideoUrlHooks() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ C0XA1 getCommonParamsProcessor() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ int getDefaultCDNTimeoutTime() {
                    return 2400000;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ RateSettingsResponse getDefaultRateSettingsResponse() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ FeedCacheStrategyConfig getFeedCacheStrategyConfig() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ String getIncompleteLocalVideoPath(SimVideoUrlModel simVideoUrlModel) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ int getLastNetworkSpeed() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ String getLocalVideoPath(SimVideoUrlModel simVideoUrlModel) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ String getLocalVideoPath(String str) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ LoudnessStrategyConfig getLoudnessStrategyConfig() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ RateSettingsResponse getRateSettingsResponse() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ SceneLoudnessConfig getSceneLoudnessConfig() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ float getSrTimeParam() {
                    return 1.0f;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ SuperResolutionStrategyConfigV2 getSuperResolutionStrategyConfigV2() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ List getVideoUrlHooks() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ boolean isCloseSimKitReporter() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ boolean isSkipSelectBitrate(SimVideoUrlModel simVideoUrlModel) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ boolean isUseLastNetworkSpeed() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ boolean onPreGetProperBitrate(SimVideoUrlModel simVideoUrlModel) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ void setForceSuperResolutionListener(InterfaceC1477620oYS interfaceC1477620oYS) {
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final /* synthetic */ boolean simKitStrategyEnabled() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final InterfaceC1477620oYS getForceSuperResolutionListener() {
                    return new InterfaceC1477620oYS() { // from class: X.0oYU
                        @Override // X.InterfaceC1477620oYS
                        public final /* synthetic */ boolean LIZ(SimVideoUrlModel simVideoUrlModel) {
                            return false;
                        }

                        @Override // X.InterfaceC1477620oYS
                        public final /* synthetic */ boolean LIZIZ(String str) {
                            return false;
                        }

                        @Override // X.InterfaceC1477620oYS
                        public final /* synthetic */ boolean LIZJ(SimVideoUrlModel simVideoUrlModel, String str) {
                            return true;
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final InterfaceC1477050oXX getSuperResolutionStrategy() {
                    return new InterfaceC1477050oXX() { // from class: X.0oYN
                        @Override // X.InterfaceC1477050oXX
                        public final /* synthetic */ void LIZ(int i, long j, String str, boolean z) {
                        }

                        @Override // X.InterfaceC1477050oXX
                        public final /* synthetic */ C1476840oXC LIZIZ(SimVideoUrlModel simVideoUrlModel, List list, int i, boolean z, InterfaceC1477040oXW interfaceC1477040oXW) {
                            return null;
                        }

                        @Override // X.InterfaceC1477050oXX
                        public final /* synthetic */ void LIZJ(float f) {
                        }

                        @Override // X.InterfaceC1477050oXX
                        public final /* synthetic */ int LIZLLL(float f, int i, int i2, int i3, long j, InterfaceC1477220oXo interfaceC1477220oXo, SimVideoUrlModel simVideoUrlModel, String str, String str2, boolean z) {
                            return 1;
                        }

                        @Override // X.InterfaceC1477050oXX
                        public final /* synthetic */ void LJ() {
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
                public final InterfaceC1477730oYd getVideoUrlHookHook() {
                    return new InterfaceC1477730oYd() { // from class: X.0oYT
                        @Override // X.InterfaceC1477730oYd
                        public final String LIZ(SimVideoUrlModel simVideoUrlModel) {
                            return null;
                        }
                    };
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IDimensionBitrateCurveConfig getDimensionBitrateCurveConfig() {
            return new C1478950oab();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IDimensionBitrateFilterConfig getDimensionBitrateFilterConfig() {
            return new C1478960oac();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final InterfaceC1475670oVJ getDimensionPickConfig() {
            return new C1479020oai();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IEvent getEvent() {
            return new IEvent() { // from class: X.0oaa
                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent
                public final void onEvent(String str, JSONObject jSONObject) {
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IMonitor getMonitor() {
            return new IMonitor() { // from class: X.0oaY
                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
                public final void ensureNotReachHere(Throwable th) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
                public final void ensureNotReachHere(Throwable th, String str) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
                public final void monitorCommonLog(String str, JSONObject jSONObject) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
                public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
                public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
                }

                @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
                public final /* synthetic */ void onReportBizException(String str, Throwable th, String str2, Map map, boolean z) {
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final PlayerGlobalConfig getPlayerGlobalConfig() {
            return new C1480860odg();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IPreloaderExperiment getPreloaderExperiment() {
            return new IPreloaderExperiment() { // from class: X.09wA
                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int DisableVideocacheLocalServerExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean EnableDetailNotification() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnableDownloaderLogExpErrorExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final boolean EnableGetCDNLogExperiment() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean EnableTTnetClientInject() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ int EngineEnableMaxFileMemCacheNumExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ int EngineEnableMaxFileMemCacheSizeExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderConcurrentNumExperiment() {
                    return 1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final EnginePreloaderConfig EnginePreloaderConfigExperiment() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderEnableNetworkChangedListenExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderNetSchedulerBlockAllNetErrorExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderNetSchedulerBlockDurationExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderNetSchedulerBlockErrorCountExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderNetSchedulerEnableExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderOpenTimeoutExperiment() {
                    return 5;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderPreloadStrategyExperiment() {
                    return 1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderRWTimeoutExperiment() {
                    return 10;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderStackOrQueueExperiment() {
                    return 1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int EnginePreloaderTlsSessionTimeoutExperiment() {
                    return 3600;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int P2pStragetyEnableSyndnsExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int P2pStragetyExpiredTimeExperiment() {
                    return 120;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int P2pStragetyMaxBufferingTimeExperiment() {
                    return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int P2pStragetyMaxLeaveWaitTimeExperiment() {
                    return 600;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int P2pStragetyMinNetSpeedExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int P2pStragetyMinPlayNumberExperiment() {
                    return 5;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int P2pStragetyXyLibValueExperiment() {
                    return 1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbABRAlgoExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbBackupDnsTypeExp() {
                    return 2;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbChecksumLevelExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbDashPreloadAudioFirstExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbEnableDebugLogExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMainDnsDelayTimeExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMainDnsTypeExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMediaLoaderCheckPreloadLevelExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderAccessCheckLevelExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableBackupDnsIPExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableBenchmarkExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableDnsLogExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableDnsParallelExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableDnsRefreshExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableFileExtendBuffer() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableFileRingBuffer() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnablePreconneExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableSpeedCoefficientExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableTLSSessionReuseExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderEnableTaskReuseExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final String PlayerAbMedialoaderGoogleDnsHostExp() {
                    return "dns.google.com";
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderHeaderDataMemCache() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderIpv4Num() {
                    return Integer.MAX_VALUE;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderIpv6Num() {
                    return Integer.MAX_VALUE;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderLazyBufferPoolEnableExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final String PlayerAbMedialoaderOwnDnsHostExp() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderPreconnectNumExp() {
                    return 3;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderTLSVersionExp() {
                    return 2;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbMedialoaderTaskReuseParallelNextThresholdExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbPreloadSizeOffsetThresholdExp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerAbTestSpeedVersionExp() {
                    return 2;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerDataEncryptExperiment() {
                    return 1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int PlayerMdlLogEnableExperiment() {
                    return 1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int RingBufferSizeMdlExperiment() {
                    return -1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int VideoCacheLoaderTypeExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int VideoCacheMaxCacheSizeExperiment() {
                    return -1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int VideoNetworkSpeedAlgorithmExperiment() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int VideoSpeedQueueSizeExperiment() {
                    return 10;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean enableMDLDowngradeWhenBackground() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean enableMDLInitAsync() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean enableMDLInitDelay() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean enableRealTimeSpeedMonitor() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean enableSuperResolution() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean enableUseNewGetCacheMethod() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ List engineInstanceOptionList() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int enginePreloaderEnableTTnetLoader() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final List<C308310C6r> engineStaticOptionList() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ String getBandWidthJsonString() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ double getBitrateSwitchThreshold() {
                    return 0.75d;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ String getDataLoaderMdlExtensionOpts() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ String getGearStrategyJsonString() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ String getMDLUA1() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ String getModuleConfigJsonString() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ String getPlayerTraceHost() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final C07R8 getPreloaderExpModel() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ boolean getUSE_CALLBACK_CACHE_SIZE() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final int isEnginePreloaderForceUseOKHttp() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ List newSharedLibraStaticOptionList() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ int newUserVodOptDiversion() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ int newUserVodOptDiversionV2() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ int newUserVodOptDiversionV3() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final /* synthetic */ List newVodLibraStaticOptionList() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final Map getExCacheDirSizeConfig() {
                    return new HashMap();
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final Boolean EnablePreloaderPreConnect() {
                    return Boolean.FALSE;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final Boolean PlayerPreloadLazyGetUrlsExperiment() {
                    return Boolean.TRUE;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
                public final C0NKF PreloadTypeExperiment() {
                    return C0NKF.MediaLoader;
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IRadarTransmitter getRadarTransmitter() {
            return new IRadarTransmitter() { // from class: X.0oQt
                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ boolean aLogWriteFuncAddrEnabled() {
                    return false;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ boolean analyzerEnabled() {
                    return true;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ boolean enabled() {
                    return false;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ long getALogSimpleWriteFuncAddr() {
                    return -1L;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ int kernelLogLever() {
                    return 5;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ int kernelLogLeverPrecise() {
                    return 50331648;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ int logNotifyLevel() {
                    return 2;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ int networkQualityType() {
                    return -2;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ boolean remoteTransmitEnabled() {
                    return false;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ boolean sdkTransmitEnabled() {
                    return false;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ void startVideo(String str) {
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ void tag(String str) {
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ InterfaceC266480AcQ tracer() {
                    return null;
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ void transmitE(String str, String str2, Exception exc) {
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ void transmitI(String str, String str2) {
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ void transmitW(String str, String str2) {
                }

                @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
                public final /* synthetic */ boolean ttSDKALogOptEnabled() {
                    return false;
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final ISimPlayerConfig getSimPlayerConfig() {
            return new ISimPlayerConfig() { // from class: X.0oak
                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final InterfaceC1477840oYo createAudioUrlProcessor() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final InterfaceC1478020oZ6 createSubUrlProcessor() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final InterfaceC1475250oUd createVideoUrlProcessor() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean disableSleepResume(String str) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final void downloadFile(String str, String str2, String str3, String str4) {
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean enableByteVc1FailCheckCountPolicy() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean enableFileIoOpt(String str) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean enableForceUseH264CheckPolicy() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean enableForceUseH264Global() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final int getAverageSpeedInKBps() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final InterfaceC1477850oYp getBindCpuCore() {
                    return InterfaceC1477850oYp.LIZ;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ C1477160oXi getDashProcessUrlData(String str, boolean z, long j) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ C1477160oXi getProcessUrlData(SimVideoUrlModel simVideoUrlModel, String str) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ int getTTPlayerPlan() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean isCacheAboveOrComplete(SimVideoUrlModel simVideoUrlModel, int i) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean isForceHdrOff() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final boolean isHttpsVideoUrlModel(SimVideoUrlModel simVideoUrlModel) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final boolean isPlayerPreferchTtsAudio() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final boolean isPluginApplied() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final void onRecordFirstFrameTime(String str, long j, String str2, boolean z, int i) {
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2) {
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final void onRecordPrepareTime(String str, long j, String str2, boolean z, int i) {
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2) {
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean perfEventEnabled() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final /* synthetic */ boolean perfEventEnabledInPlayRequest() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final void recordMiscLog(Context context, String str, JSONObject jSONObject) {
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final int getPlayerType() {
                    return EnumC994280bys.ExoPlayer == null ? 1 : 0;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final InterfaceC1483040ohC getPreRenderConfig() {
                    return new C1479050oal(this);
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final C1480730odT getISimPlayerPlaySessionConfig(boolean z) {
                    return new C1480730odT();
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final String getThumbCacheDir(Context context) {
                    if (context == null) {
                        return null;
                    }
                    return C786410Ut5.w2(context).toString();
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final SimVideoUrlModel getVideoPlayAddr(SimVideo simVideo, EnumC1479760obu enumC1479760obu) {
                    if (simVideo != null) {
                        if (C1475150oUT.LIZIZ(simVideo.getPlayAddrBytevc1()) && C1475150oUT.LIZ(enumC1479760obu)) {
                            return simVideo.getPlayAddrBytevc1();
                        }
                        return simVideo.getPlayAddrH264();
                    }
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
                public final C1480980ods getPlayerConfig(EnumC1479760obu enumC1479760obu, boolean z, boolean z2) {
                    int i;
                    C1480980ods c1480980ods = new C1480980ods();
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    if (EnumC994280bys.ExoPlayer == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    sparseIntArray.put(15, i);
                    sparseIntArray.put(3, LSPassThroughRecordSizeConfig.DEFAULT);
                    c1480980ods.LJFF = sparseIntArray;
                    c1480980ods.LIZIZ = enumC1479760obu;
                    c1480980ods.LIZ = C1475000oUE.LIZ;
                    return c1480980ods;
                }
            };
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IPlayerExperiment getSimPlayerExperiment() {
            return new C274570ApT();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final ISimReporterConfig getSimReporterConfig() {
            return new C1481880ofK();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final ISpeedCalculatorConfig getSpeedCalculatorConfig() {
            return new C1478900oaW();
        }

        @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
        public final IVideoPreloadConfig getVideoPreloaderManagerConfig() {
            return new IVideoPreloadConfig(getPreloaderExperiment()) { // from class: X.0oaB
                public final IPreloaderExperiment LIZ;

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final boolean canPreload() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ InterfaceC1475250oUd createVideoUrlProcessor() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ boolean enableLoadMorePreload() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ boolean forbidBypassCookie() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1475350oUn getAppLog() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ InterfaceC1474920oU6 getKVStorageProvider() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1469840oLu getNetClient() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ int getNetworkRttMs() {
                    return -1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ int getNetworkType() {
                    return -1;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final C1476830oXB getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z, int i) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ C1477160oXi getSelectedBitrateForColdBoot(SimVideoUrlModel simVideoUrlModel) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1472690oQV getSensitiveSceneTransmitter() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1474910oU5 getVideoCachePlugin() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final boolean isDashABREnabled() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ boolean isOpenDataFreeMode() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final boolean isPlayerPreferchCaption() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final boolean isPlayerPreferchTtsAudio() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final boolean isPreloadV3Enabled() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final float playerPreferchCaptionSize() {
                    return 0.0f;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final float playerPreferchTtsAudioSize() {
                    return 0.0f;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ String preloadConfigJsonInScene() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final /* synthetic */ boolean useSyncPreloadStyle() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1474890oU3 getMLServiceSpeedModel() {
                    return new InterfaceC1474890oU3() { // from class: X.0oaG
                        @Override // X.InterfaceC1474890oU3
                        public final Integer LIZ() {
                            return 500;
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1475520oV4 getPlayerEventReportService() {
                    return new InterfaceC1475520oV4() { // from class: X.0oaI
                        @Override // X.InterfaceC1475520oV4
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1475520oV4
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1475520oV4
                        public final void LIZJ() {
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1482820ogq getPreloadStrategy() {
                    return new InterfaceC1482820ogq() { // from class: X.0oaE
                        @Override // X.InterfaceC1482820ogq
                        public final /* synthetic */ List LIZ() {
                            return C1478730oaF.LIZ();
                        }

                        @Override // X.InterfaceC1482820ogq
                        public final List LIZIZ() {
                            return C1478730oaF.LIZIZ();
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1471450oOV getQOSSpeedUpService() {
                    return new C1478370oZf(this);
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final InterfaceC1474850oTz getSpeedManager() {
                    return new InterfaceC1474850oTz() { // from class: X.0oaA
                        @Override // X.InterfaceC1474850oTz
                        public final void LIZLLL() {
                        }

                        @Override // X.InterfaceC1474850oTz
                        public final void LIZ() {
                            C1476930oXL.LIZ().LIZ().LJIIIIZZ();
                        }

                        @Override // X.InterfaceC1474850oTz
                        public final void LIZIZ() {
                            C1476930oXL.LIZ().LIZ().LIZIZ();
                        }

                        @Override // X.InterfaceC1474850oTz
                        public final int LJFF() {
                            return C1476930oXL.LIZ().LIZ().LJIIIZ();
                        }

                        @Override // X.InterfaceC1474850oTz
                        public final int getAverageSpeedInKBps() {
                            return C1476930oXL.LIZ().LIZ().LJII();
                        }

                        @Override // X.InterfaceC1474850oTz
                        public final void LIZJ(int i) {
                            C1476930oXL.LIZ().LIZ().LIZJ(i);
                        }

                        @Override // X.InterfaceC1474850oTz
                        public final void LJI(int i) {
                            C1476930oXL.LIZ().LIZ().LIZLLL(i);
                        }

                        @Override // X.InterfaceC1474850oTz
                        public final void LJ(double d, double d2, long j) {
                            C1476930oXL.LIZ().LIZ().LJIIJ(new C1478710oaD(d2 * 8.0d, j));
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final IPreloaderExperiment getExperiment() {
                    return this.LIZ;
                }

                {
                    this.LIZ = iPreloaderExperiment;
                }

                @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
                public final Map getRequestHeader(String str) {
                    return new HashMap();
                }
            };
        }
    };
}
