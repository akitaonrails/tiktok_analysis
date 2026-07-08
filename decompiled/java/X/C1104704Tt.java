package X;

import com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService;
import com.ss.android.ugc.tiktok.pns.services.PNSFamilyPairingServiceImpl;

/* JADX INFO: renamed from: X.04Tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1104704Tt {
    public static final /* synthetic */ C1104704Tt LIZ = new C1104704Tt();

    public static IPnSFamilyPairingService LIZ() {
        Object objLIZ = C04TD.LIZ(IPnSFamilyPairingService.class, false);
        if (objLIZ != null) {
            return (IPnSFamilyPairingService) objLIZ;
        }
        if (C04TD.b7 == null) {
            synchronized (IPnSFamilyPairingService.class) {
                if (C04TD.b7 == null) {
                    C04TD.b7 = new PNSFamilyPairingServiceImpl();
                }
            }
        }
        return C04TD.b7;
    }
}
