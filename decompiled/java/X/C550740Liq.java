package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;

/* JADX INFO: renamed from: X.0Liq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550740Liq {
    public static final AIGCEntranceInfo LIZ(String str, AIGC.AICreationSceneName aICreationSceneName, AIGC.RefPageName refPageName, boolean z) {
        InterfaceC550750Lir interfaceC550750LirG9;
        boolean zLIZ;
        int iLJFF;
        String strLJI;
        AITheaterProfileService aITheaterProfileServiceLIZ;
        InterfaceC546120LbO interfaceC546120LbOLIZIZ;
        InterfaceC1659430tHh interfaceC1659430tHhLIZLLL;
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ2 = C563290M7j.LIZ();
        Integer numLIZ = null;
        if (aITheaterProfileServiceLIZ2 != null) {
            interfaceC550750LirG9 = aITheaterProfileServiceLIZ2.g9();
        } else {
            interfaceC550750LirG9 = null;
        }
        C0LQY c0lqy = C0LQY.AI_THEATER;
        String str2 = refPageName.value;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC1659430tHhLIZLLL = iAITheaterFeatureServiceLIZ.LIZLLL()) != null) {
            zLIZ = interfaceC1659430tHhLIZLLL.LIZ();
        } else {
            zLIZ = false;
        }
        if (interfaceC550750LirG9 != null) {
            iLJFF = interfaceC550750LirG9.LJFF();
            strLJI = interfaceC550750LirG9.LJI();
            if (strLJI == null) {
            }
            String strLJIIIIZZ = C1443560nfW.LJIIIIZZ();
            C1449490np5.LIZ.getClass();
            String strLJ = C1449490np5.LJ(null);
            aITheaterProfileServiceLIZ = C563290M7j.LIZ();
            if (aITheaterProfileServiceLIZ != null && (interfaceC546120LbOLIZIZ = aITheaterProfileServiceLIZ.LIZIZ()) != null && interfaceC546120LbOLIZIZ.LIZ() && interfaceC550750LirG9 != null) {
                numLIZ = interfaceC550750LirG9.LIZ();
            }
            return new AIGCEntranceInfo(c0lqy, str, iLJFF, null, strLJI, numLIZ, z, zLIZ, false, aICreationSceneName, refPageName, str2, null, null, null, false, false, strLJIIIIZZ, strLJ, null);
        }
        iLJFF = 0;
        strLJI = "";
        String strLJIIIIZZ2 = C1443560nfW.LJIIIIZZ();
        C1449490np5.LIZ.getClass();
        String strLJ2 = C1449490np5.LJ(null);
        aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null) {
            numLIZ = interfaceC550750LirG9.LIZ();
        }
        return new AIGCEntranceInfo(c0lqy, str, iLJFF, null, strLJI, numLIZ, z, zLIZ, false, aICreationSceneName, refPageName, str2, null, null, null, false, false, strLJIIIIZZ2, strLJ2, null);
    }
}
