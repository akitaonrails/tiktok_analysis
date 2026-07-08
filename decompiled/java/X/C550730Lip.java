package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;

/* JADX INFO: renamed from: X.0Lip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550730Lip {
    public static final AIGCEntranceInfo LIZ(String str, AIGC.AICreationSceneName aICreationSceneName, AIGC.RefPageName refPageName, String str2) {
        InterfaceC550750Lir interfaceC550750LirG9;
        int iLIZIZ;
        String strLJI;
        boolean zLIZ;
        InterfaceC550350LiD interfaceC550350LiDLIZLLL;
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null) {
            interfaceC550750LirG9 = aITheaterProfileServiceLIZ.g9();
        } else {
            interfaceC550750LirG9 = null;
        }
        C0LQY c0lqy = C0LQY.AI_PORTRAIT;
        if (interfaceC550750LirG9 != null) {
            iLIZIZ = interfaceC550750LirG9.LIZIZ();
        } else {
            iLIZIZ = -99;
        }
        if (interfaceC550750LirG9 == null || (strLJI = interfaceC550750LirG9.LJI()) == null) {
            strLJI = "unknown";
        }
        String strLJIIIIZZ = C1443560nfW.LJIIIIZZ();
        C1449490np5.LIZ.getClass();
        String strLJ = C1449490np5.LJ(null);
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && (interfaceC550350LiDLIZLLL = iAIPortraitFeatureServiceLIZ.LIZLLL()) != null) {
            zLIZ = interfaceC550350LiDLIZLLL.LIZ();
        } else {
            zLIZ = false;
        }
        return new AIGCEntranceInfo(c0lqy, str, iLIZIZ, null, strLJI, null, false, zLIZ, false, aICreationSceneName, refPageName, str2, null, null, null, false, false, strLJIIIIZZ, strLJ, null);
    }
}
