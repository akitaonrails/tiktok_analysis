package X;

import com.ss.android.ugc.aweme.compliance.ComplianceDependServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;

/* JADX INFO: renamed from: X.04Vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1110504Vz {
    public static volatile IComplianceDependService LIZ;

    public static IComplianceDependService LIZ() {
        IComplianceDependService iComplianceDependService;
        if (LIZ == null) {
            Object objLIZ = C04TD.LIZ(IComplianceDependService.class, false);
            if (objLIZ != null) {
                iComplianceDependService = (IComplianceDependService) objLIZ;
            } else {
                if (C04TD.LLLLIILL == null) {
                    synchronized (IComplianceDependService.class) {
                        if (C04TD.LLLLIILL == null) {
                            C04TD.LLLLIILL = new ComplianceDependServiceImpl();
                        }
                    }
                }
                iComplianceDependService = C04TD.LLLLIILL;
            }
            LIZ = iComplianceDependService;
        }
        return LIZ;
    }
}
