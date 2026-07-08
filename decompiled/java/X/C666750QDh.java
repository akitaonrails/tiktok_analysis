package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;

/* JADX INFO: renamed from: X.0QDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666750QDh {
    public static final int LIZ;

    static {
        LIZ = LIZ() ? 8 : 0;
    }

    public static boolean LIZ() {
        IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
        return !(iFamilyPairingServiceLJIIL != null && iFamilyPairingServiceLJIIL.showEngagementCount());
    }
}
