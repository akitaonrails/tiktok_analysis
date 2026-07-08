package X;

import com.ss.android.ugc.profile.platform.exp.CampusExperimentResponse;

/* JADX INFO: renamed from: X.0iX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246160iX8 {
    public static final CampusExperimentResponse LIZ = new CampusExperimentResponse(false, false);

    public static boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        CampusExperimentResponse campusExperimentResponse = LIZ;
        CampusExperimentResponse campusExperimentResponse2 = (CampusExperimentResponse) c0c64LJIILLIIL.LJJII(CampusExperimentResponse.class, campusExperimentResponse, "campus", false);
        if (campusExperimentResponse2 != null) {
            campusExperimentResponse = campusExperimentResponse2;
        }
        if (!campusExperimentResponse.enabled) {
            return false;
        }
        C1246150iX7.LIZ.getClass();
        return C1246150iX7.LIZ().enabled;
    }
}
