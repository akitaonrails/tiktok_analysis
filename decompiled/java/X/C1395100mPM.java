package X;

import com.ss.android.ugc.aweme.config.CCAnchorLandingPageSecondOpt;
import com.ss.android.ugc.aweme.config.PreloadVideoConfigAndroidScore;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0mPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395100mPM {
    public static final C1395100mPM LIZ = new C1395100mPM();
    public static final CCAnchorLandingPageSecondOpt LIZIZ = new CCAnchorLandingPageSecondOpt(null, null, null, null, null, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(465));

    public static final CCAnchorLandingPageSecondOpt LIZ() {
        LIZ.getClass();
        return (CCAnchorLandingPageSecondOpt) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore;
        PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore2;
        Integer num;
        CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ = LIZ();
        boolean z = (cCAnchorLandingPageSecondOptLIZ == null || (num = cCAnchorLandingPageSecondOptLIZ.lynxAsynLayout) == null || num.intValue() != 1) ? false : true;
        float fLIZ = C2215011Bmd.LIZ();
        CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ2 = LIZ();
        boolean z2 = Float.compare(fLIZ, (cCAnchorLandingPageSecondOptLIZ2 == null || (preloadVideoConfigAndroidScore2 = cCAnchorLandingPageSecondOptLIZ2.androidScore) == null) ? 0.0f : preloadVideoConfigAndroidScore2.lowLevel) < 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxAsynLayout = ");
        CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ3 = LIZ();
        Float fValueOf = null;
        sbLIZ.append(cCAnchorLandingPageSecondOptLIZ3 != null ? cCAnchorLandingPageSecondOptLIZ3.lynxAsynLayout : null);
        sbLIZ.append(" deviceScore = ");
        sbLIZ.append(C2215011Bmd.LIZ());
        sbLIZ.append(" lowLevel = ");
        CCAnchorLandingPageSecondOpt cCAnchorLandingPageSecondOptLIZ4 = LIZ();
        if (cCAnchorLandingPageSecondOptLIZ4 != null && (preloadVideoConfigAndroidScore = cCAnchorLandingPageSecondOptLIZ4.androidScore) != null) {
            fValueOf = Float.valueOf(preloadVideoConfigAndroidScore.lowLevel);
        }
        sbLIZ.append(fValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            return C2215011Bmd.LIZ() == 0 || !z2;
        }
        return false;
    }
}
