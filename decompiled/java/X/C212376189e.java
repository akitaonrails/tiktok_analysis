package X;

import com.ss.android.ugc.aweme.config.CCAnchorLandingPageSparkOptConfig;

/* JADX INFO: renamed from: X.189e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212376189e {
    public static boolean LIZ() {
        CCAnchorLandingPageSparkOptConfig.EnableConfig enableConfig;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deviceScore = ");
        sbLIZ.append(C2215011Bmd.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("CCAnchorSparkOpt", strLIZIZ);
        CCAnchorLandingPageSparkOptConfig.LIZ.getClass();
        if (CCAnchorLandingPageSparkOptConfig.LIZJ() == null) {
            return false;
        }
        if (C2215011Bmd.LIZ() == 0) {
            return true;
        }
        int iLIZ = C2215011Bmd.LIZ();
        CCAnchorLandingPageSparkOptConfig.SparkReUseModel sparkReUseModelLIZJ = CCAnchorLandingPageSparkOptConfig.LIZJ();
        return iLIZ > ((sparkReUseModelLIZJ == null || (enableConfig = sparkReUseModelLIZJ.enableConfig) == null) ? 4 : enableConfig.androidDeviceScore);
    }
}
