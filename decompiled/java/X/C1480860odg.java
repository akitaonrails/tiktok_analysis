package X;

import android.content.Context;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;

/* JADX INFO: renamed from: X.0odg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480860odg implements PlayerGlobalConfig {
    public static Context LIZ;

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean forceHttps() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ float getAdjustedVolume() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final String getAudioRoute() {
        return "";
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean getAutoAudioFocus() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getBitrateSelectMode() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getEnableSAMISDKAB() {
        return -1;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final String getGraphJson() {
        return "";
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ C0CJP getLiveGlobalConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlaybackAbility() {
        return -1;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerBackgroundSleepStrategy() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPlayerFramesWait() {
        return 1;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ String getPredictLabelResult() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getPreloadType() {
        return 2;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final int getRenderType() {
        return 0;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ C00UI getVideoEffectInfo(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isAsyncInit() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isCallbackCompletionFix() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDynamicBitrateEnable() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isDynamicConfigAvailable() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isEnableByteVC1AutoRetry() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnableBytevc1BlackList() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isEnablePlayerLogV2() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isEnableSurfaceLifeCycleNotification() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isMultiPlayer() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isPowerModeHandlerEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isPrepareAhead() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isPrerenderSurfaceSlowSetFix() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isSurfaceViewLogOpt() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean isUseOptimizedSurfaceView() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceControl() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseSurfaceView() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final boolean isUseVideoTextureRenderer() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean optGlobalAppAnr() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ boolean optSpecialAppAnr() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ void setAutoAudioFocus(boolean z, String str) {
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final /* synthetic */ void setForceHttps(boolean z) {
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final InterfaceC1479910oc9 prepareConfig() {
        return new C1480870odh();
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final Context context() {
        return LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.model.PlayerGlobalConfig
    public final EnumC1479760obu getPlayerType() {
        return EnumC1479760obu.TT;
    }
}
