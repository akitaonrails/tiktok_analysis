package X;

import com.ss.android.ugc.aweme.config.CCAnchorLandingPageSparkOptConfig;

/* JADX INFO: renamed from: X.189d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212375189d {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        String str;
        CCAnchorLandingPageSparkOptConfig.LIZ.getClass();
        CCAnchorLandingPageSparkOptConfig.SparkPreloadModel sparkPreloadModelLIZIZ = CCAnchorLandingPageSparkOptConfig.LIZIZ();
        return (sparkPreloadModelLIZIZ == null || (str = sparkPreloadModelLIZIZ.biz) == null) ? "capcut_anchor_biz" : str;
    }

    public static boolean LIZIZ() {
        CCAnchorLandingPageSparkOptConfig.EnableConfig enableConfig;
        CCAnchorLandingPageSparkOptConfig.LIZ.getClass();
        if (CCAnchorLandingPageSparkOptConfig.LIZIZ() == null) {
            return false;
        }
        if (C2215011Bmd.LIZ() == 0) {
            return true;
        }
        int iLIZ = C2215011Bmd.LIZ();
        CCAnchorLandingPageSparkOptConfig.SparkPreloadModel sparkPreloadModelLIZIZ = CCAnchorLandingPageSparkOptConfig.LIZIZ();
        return iLIZ > ((sparkPreloadModelLIZIZ == null || (enableConfig = sparkPreloadModelLIZIZ.enableConfig) == null) ? 4 : enableConfig.androidDeviceScore);
    }
}
