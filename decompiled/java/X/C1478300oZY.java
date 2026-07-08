package X;

import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oZY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478300oZY implements IVideoPreloadConfig {
    public final IVideoPreloadConfig LIZ;

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final /* synthetic */ boolean enableLoadMorePreload() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.canPreload();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1475250oUd createVideoUrlProcessor() {
        InterfaceC1475250oUd interfaceC1475250oUdCreateVideoUrlProcessor;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (interfaceC1475250oUdCreateVideoUrlProcessor = iVideoPreloadConfig.createVideoUrlProcessor()) == null) ? C1476520oWg.LIZ : interfaceC1475250oUdCreateVideoUrlProcessor;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean forbidBypassCookie() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.forbidBypassCookie();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1475350oUn getAppLog() {
        InterfaceC1475350oUn appLog;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (appLog = iVideoPreloadConfig.getAppLog()) == null) ? C1478330oZb.LIZ : appLog;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        IPreloaderExperiment experiment;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (experiment = iVideoPreloadConfig.getExperiment()) == null) ? new C2532509wB() : experiment;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1474920oU6 getKVStorageProvider() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null) {
            return null;
        }
        iVideoPreloadConfig.getKVStorageProvider();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1474890oU3 getMLServiceSpeedModel() {
        InterfaceC1474890oU3 mLServiceSpeedModel;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (mLServiceSpeedModel = iVideoPreloadConfig.getMLServiceSpeedModel()) == null) ? C1478360oZe.LIZ : mLServiceSpeedModel;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1469840oLu getNetClient() {
        InterfaceC1469840oLu netClient;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (netClient = iVideoPreloadConfig.getNetClient()) == null) ? C1469860oLw.LIZ : netClient;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int getNetworkRttMs() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.getNetworkRttMs();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int getNetworkType() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.getNetworkType();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1475520oV4 getPlayerEventReportService() {
        InterfaceC1475520oV4 playerEventReportService;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (playerEventReportService = iVideoPreloadConfig.getPlayerEventReportService()) == null) ? C1478380oZg.LIZ : playerEventReportService;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1482820ogq getPreloadStrategy() {
        return new C1478350oZd(this);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1471450oOV getQOSSpeedUpService() {
        InterfaceC1471450oOV qOSSpeedUpService;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (qOSSpeedUpService = iVideoPreloadConfig.getQOSSpeedUpService()) == null) ? new C1478370oZf(new IVideoPreloadConfig() { // from class: X.0oZa
            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final boolean canPreload() {
                return true;
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
            public final /* synthetic */ InterfaceC1474920oU6 getKVStorageProvider() {
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
            public final InterfaceC1474850oTz getSpeedManager() {
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
            public final IPreloaderExperiment getExperiment() {
                return new C2532509wB();
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final InterfaceC1482820ogq getPreloadStrategy() {
                return new InterfaceC1482820ogq() { // from class: X.0oZc
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
            public final InterfaceC1475250oUd createVideoUrlProcessor() {
                return C1476520oWg.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final InterfaceC1475350oUn getAppLog() {
                return C1478330oZb.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final InterfaceC1474890oU3 getMLServiceSpeedModel() {
                return C1478360oZe.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final InterfaceC1469840oLu getNetClient() {
                return C1469860oLw.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final InterfaceC1475520oV4 getPlayerEventReportService() {
                return C1478380oZg.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final InterfaceC1472690oQV getSensitiveSceneTransmitter() {
                return C1478400oZi.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final InterfaceC1474910oU5 getVideoCachePlugin() {
                return C1478390oZh.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final Map<String, String> getRequestHeader(String str) {
                return new HashMap();
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final C1477160oXi getSelectedBitrateForColdBoot(SimVideoUrlModel simVideoUrlModel) {
                return new C1477160oXi();
            }

            @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
            public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
                return EnumC2281141EQm.Undefine;
            }
        }) : qOSSpeedUpService;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1472690oQV getSensitiveSceneTransmitter() {
        InterfaceC1472690oQV sensitiveSceneTransmitter;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (sensitiveSceneTransmitter = iVideoPreloadConfig.getSensitiveSceneTransmitter()) == null) ? C1478400oZi.LIZ : sensitiveSceneTransmitter;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1474850oTz getSpeedManager() {
        InterfaceC1474850oTz speedManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (speedManager = iVideoPreloadConfig.getSpeedManager()) == null) {
            return null;
        }
        return speedManager;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1474910oU5 getVideoCachePlugin() {
        InterfaceC1474910oU5 videoCachePlugin;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return (iVideoPreloadConfig == null || (videoCachePlugin = iVideoPreloadConfig.getVideoCachePlugin()) == null) ? C1478390oZh.LIZ : videoCachePlugin;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isDashABREnabled();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isOpenDataFreeMode() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        return iVideoPreloadConfig != null && iVideoPreloadConfig.isOpenDataFreeMode();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPlayerPreferchCaption();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPlayerPreferchTtsAudio();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.isPreloadV3Enabled();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchCaptionSize() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.playerPreferchCaptionSize();
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchTtsAudioSize() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.playerPreferchTtsAudioSize();
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final String preloadConfigJsonInScene() {
        String strPreloadConfigJsonInScene;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (strPreloadConfigJsonInScene = iVideoPreloadConfig.preloadConfigJsonInScene()) == null) {
            return null;
        }
        return strPreloadConfigJsonInScene;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig != null) {
            return iVideoPreloadConfig.useSyncPreloadStyle();
        }
        return false;
    }

    public C1478300oZY(IVideoPreloadConfig iVideoPreloadConfig) {
        this.LIZ = iVideoPreloadConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final Map<String, String> getRequestHeader(String str) {
        Map<String, String> requestHeader;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (requestHeader = iVideoPreloadConfig.getRequestHeader(str)) == null) {
            return new HashMap();
        }
        return requestHeader;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final C1477160oXi getSelectedBitrateForColdBoot(SimVideoUrlModel simVideoUrlModel) {
        C1477160oXi selectedBitrateForColdBoot;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (selectedBitrateForColdBoot = iVideoPreloadConfig.getSelectedBitrateForColdBoot(simVideoUrlModel)) == null) {
            return new C1477160oXi();
        }
        return selectedBitrateForColdBoot;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
        EnumC2281141EQm properResolution;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (properResolution = iVideoPreloadConfig.getProperResolution(str, interfaceC1476900oXI)) == null) {
            return EnumC2281141EQm.Undefine;
        }
        return properResolution;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final C1476830oXB getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z, int i) {
        C1476830oXB properBitrateForDash;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (properBitrateForDash = iVideoPreloadConfig.getProperBitrateForDash(simVideoUrlModel, interfaceC1476900oXI, z, 2)) == null) {
            return null;
        }
        return properBitrateForDash;
    }
}
