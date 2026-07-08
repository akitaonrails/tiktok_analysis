package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;

/* JADX INFO: renamed from: X.0wzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801950wzZ {
    public static EnumC1799930wwJ LIZ(Activity activity, String str, C07ZA c07za, IMinisRevisitMissionService iMinisRevisitMissionService) {
        C07ZA c07zaLJII;
        C1801930wzX c1801930wzX = C1801930wzX.LIZ;
        if (C1801930wzX.LIZIZ(c1801930wzX, activity, c07za)) {
            if (iMinisRevisitMissionService != null) {
                iMinisRevisitMissionService.LIZLLL(c07za.LIZ, c07za.LIZIZ);
            }
            return c07za.LIZ;
        }
        if (iMinisRevisitMissionService == null || (c07zaLJII = iMinisRevisitMissionService.LJII(str)) == null || c07zaLJII.LIZ == c07za.LIZ || !C1801930wzX.LIZIZ(c1801930wzX, activity, c07zaLJII)) {
            return null;
        }
        iMinisRevisitMissionService.LIZLLL(c07zaLJII.LIZ, c07zaLJII.LIZIZ);
        return c07zaLJII.LIZ;
    }
}
