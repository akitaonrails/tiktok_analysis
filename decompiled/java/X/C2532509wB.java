package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09wB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2532509wB implements IPreloaderExperiment {
    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int DisableVideocacheLocalServerExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableDetailNotification() {
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
    public final boolean EnableTTnetClientInject() {
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
    public final /* bridge */ /* synthetic */ EnginePreloaderConfig EnginePreloaderConfigExperiment() {
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
        return 10;
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
    public final String getPlayerTraceHost() {
        return "";
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
    public final C07R8 getPreloaderExpModel() {
        return new C07R8();
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
}
