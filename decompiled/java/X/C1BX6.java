package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.1BX6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@InterfaceC2206441BXe(name = "boot_finish_provider_v2")
public final class C1BX6 {
    public static void p0Run(C1BXT c1bxt) {
        int[] iArr = C2206591BXt.LIZ;
        c1bxt.LIZLLL.ordinal();
    }

    public static void p1Run(C1BXT c1bxt) {
        if (C2206591BXt.LIZ[c1bxt.LIZLLL.ordinal()] == 1) {
            c1bxt.LIZ("AVCameraInitTaskNew");
            c1bxt.LIZ("TakoInitTaskNew");
            c1bxt.LIZ("OGCLynxDataPreloadTask");
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ms_startup_priority", true)) {
                c1bxt.LIZ("AntispamApiUploadTask");
            }
            c1bxt.LIZ("FeaturePollLegoTask");
            c1bxt.LIZ("ALogNativeOptTaskBootFinish");
        }
    }

    public static void p2Run(C1BXT c1bxt) {
        if (C2206591BXt.LIZ[c1bxt.LIZLLL.ordinal()] == 1) {
            c1bxt.LIZ("AnalysisHprofTask");
            c1bxt.LIZ("LiveRevenueStrategyTask");
            c1bxt.LIZ("PreloadBootFinishABValueTask");
            c1bxt.LIZ("ResourceDispatcherBootFinishTask");
            c1bxt.LIZ("RewardGeckoPrefetchBootFinishTask");
            c1bxt.LIZ("ExploreFeedPreloadTask");
            c1bxt.LIZ("PNSAabEventTask");
            c1bxt.LIZ("TextToImageResourcePreloadTask");
        }
    }

    public static void p3Run(C1BXT c1bxt) {
        int[] iArr = C2206591BXt.LIZ;
        c1bxt.LIZLLL.ordinal();
    }
}
