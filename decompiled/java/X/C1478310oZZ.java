package X;

import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0oZZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478310oZZ implements IVideoPreloadConfig {
    public final IVideoPreloadConfig LIZ;

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        return this.LIZ.canPreload();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1475350oUn getAppLog() {
        return this.LIZ.getAppLog();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        return this.LIZ.getExperiment();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1474890oU3 getMLServiceSpeedModel() {
        return this.LIZ.getMLServiceSpeedModel();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1469840oLu getNetClient() {
        return this.LIZ.getNetClient();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1475520oV4 getPlayerEventReportService() {
        return this.LIZ.getPlayerEventReportService();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final C1476830oXB getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC1476900oXI interfaceC1476900oXI, boolean z, int i) {
        return this.LIZ.getProperBitrateForDash(simVideoUrlModel, interfaceC1476900oXI, z, 2);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
        return this.LIZ.getProperResolution(str, interfaceC1476900oXI);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1474850oTz getSpeedManager() {
        return this.LIZ.getSpeedManager();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1474910oU5 getVideoCachePlugin() {
        return this.LIZ.getVideoCachePlugin();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        return this.LIZ.isDashABREnabled();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        return this.LIZ.isPreloadV3Enabled();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1475250oUd createVideoUrlProcessor() {
        InterfaceC1475250oUd interfaceC1475250oUdCreateVideoUrlProcessor = this.LIZ.createVideoUrlProcessor();
        return interfaceC1475250oUdCreateVideoUrlProcessor != null ? interfaceC1475250oUdCreateVideoUrlProcessor : C1477740oYe.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean enableLoadMorePreload() {
        return this.LIZ.enableLoadMorePreload();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean forbidBypassCookie() {
        return this.LIZ.forbidBypassCookie();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1474920oU6 getKVStorageProvider() {
        this.LIZ.getKVStorageProvider();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int getNetworkRttMs() {
        return this.LIZ.getNetworkRttMs();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int getNetworkType() {
        return this.LIZ.getNetworkType();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1482820ogq getPreloadStrategy() {
        return this.LIZ.getPreloadStrategy();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1471450oOV getQOSSpeedUpService() {
        return this.LIZ.getQOSSpeedUpService();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC1472690oQV getSensitiveSceneTransmitter() {
        return this.LIZ.getSensitiveSceneTransmitter();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        return this.LIZ.isPlayerPreferchCaption();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return this.LIZ.isPlayerPreferchTtsAudio();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchCaptionSize() {
        return this.LIZ.playerPreferchCaptionSize();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchTtsAudioSize() {
        return this.LIZ.playerPreferchTtsAudioSize();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final String preloadConfigJsonInScene() {
        return this.LIZ.preloadConfigJsonInScene();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        return this.LIZ.useSyncPreloadStyle();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isOpenDataFreeMode() {
        C582130MsN.LIZ().LJ().getClass();
        return EnumC590140NCq.INS.isEnable();
    }

    public C1478310oZZ(IVideoPreloadConfig iVideoPreloadConfig) {
        this.LIZ = iVideoPreloadConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final Map<String, String> getRequestHeader(String str) {
        return this.LIZ.getRequestHeader(str);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final C1477160oXi getSelectedBitrateForColdBoot(SimVideoUrlModel simVideoUrlModel) {
        return C1477140oXg.LIZ(simVideoUrlModel, null);
    }
}
