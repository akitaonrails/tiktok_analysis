package X;

import com.ss.lyrax.augur.command.AugurCommandConstant;

/* JADX INFO: renamed from: X.0j6W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1268100j6W {
    UPDATE_STREAMHD_PARAMS("updateStreamHDParams"),
    UPDATE_DENOISE_PARAMS("updateDenoiseParams"),
    UPDATE_FPS_RESOLUTION("updateFPSAndResolution"),
    EFFECT_MODEL(AugurCommandConstant.COMMAND_UPDATE_EFFECT_MODEL),
    EFFECT_RESOURCE(AugurCommandConstant.COMMAND_UPDATE_EFFECT_RESOURCE),
    EFFECT_STRATEGY("updateEffectStrategy"),
    REPORT_TRACE("reportTrace"),
    SIMULCAST("updateSimulcast"),
    GPU_TURBO("updateEffectGPUTurbo"),
    SUBSCRIBE_SIMULCAST("subscribeRemoteStream"),
    SHOW_TOAST("showToast"),
    UPDATE_GAME_FPS_RESOLUTION("updateGameFPSAndResolution"),
    UPDATE_GAME_STREAMHD_PARAMS("updateGameStreamHDParams"),
    UPDATE_GAME_DUAL_DEVICE_FPS_RESOLUTION("updateDualDeviceFPSAndResolution"),
    UPDATE_VIDEO_STRATEGY_PARAMS("updateEncParams"),
    UPDATE_LINKMIC_VIDEO_PARAMS("updateLinkMicVideoParams"),
    UPDATE_LINKMIC_PERFORMANCE_PARAMS("updateLinkMicPerformanceParams");

    public final String LL;

    public String getCommandName() {
        return this.LL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1268100j6W fromGameString(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2111248075:
                if (!str.equals("updateDualDeviceFPSAndResolution")) {
                    return null;
                }
                return UPDATE_GAME_DUAL_DEVICE_FPS_RESOLUTION;
            case -1630990755:
                if (!str.equals("updateGameStreamHDParams")) {
                    return null;
                }
                return UPDATE_GAME_STREAMHD_PARAMS;
            case 1739498083:
                if (!str.equals("updateFPSAndResolution")) {
                    return null;
                }
                return UPDATE_GAME_FPS_RESOLUTION;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1268100j6W fromString(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1913642710:
                if (!str.equals("showToast")) {
                    return null;
                }
                return SHOW_TOAST;
            case -1512638000:
                if (!str.equals("subscribeRemoteStream")) {
                    return null;
                }
                return SUBSCRIBE_SIMULCAST;
            case -1470754483:
                if (!str.equals("updateEffectStrategy")) {
                    return null;
                }
                return EFFECT_STRATEGY;
            case -775774428:
                if (!str.equals("updateSimulcast")) {
                    return null;
                }
                return SIMULCAST;
            case -718792878:
                if (!str.equals("updateLinkMicPerformanceParams")) {
                    return null;
                }
                return UPDATE_LINKMIC_PERFORMANCE_PARAMS;
            case -677019061:
                if (!str.equals("updateStreamHDParams")) {
                    return null;
                }
                return UPDATE_STREAMHD_PARAMS;
            case -27467818:
                if (!str.equals("updateDenoiseParams")) {
                    return null;
                }
                return UPDATE_DENOISE_PARAMS;
            case 504753039:
                if (!str.equals(AugurCommandConstant.COMMAND_UPDATE_EFFECT_MODEL)) {
                    return null;
                }
                return EFFECT_MODEL;
            case 657754796:
                if (!str.equals("updateEffectGPUTurbo")) {
                    return null;
                }
                return GPU_TURBO;
            case 695349736:
                if (!str.equals(AugurCommandConstant.COMMAND_UPDATE_EFFECT_RESOURCE)) {
                    return null;
                }
                return EFFECT_RESOURCE;
            case 1393968221:
                if (!str.equals("updateLinkMicVideoParams")) {
                    return null;
                }
                return UPDATE_LINKMIC_VIDEO_PARAMS;
            case 1739498083:
                if (!str.equals("updateFPSAndResolution")) {
                    return null;
                }
                return UPDATE_FPS_RESOLUTION;
            case 1823775799:
                if (!str.equals("updateEncParams")) {
                    return null;
                }
                return UPDATE_VIDEO_STRATEGY_PARAMS;
            default:
                return null;
        }
    }

    public static EnumC1268100j6W valueOf(String str) {
        return (EnumC1268100j6W) C08FF.LIZ(EnumC1268100j6W.class, str);
    }

    EnumC1268100j6W(String str) {
        this.LL = str;
    }
}
