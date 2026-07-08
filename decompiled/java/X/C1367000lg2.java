package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.INetwork;

/* JADX INFO: renamed from: X.0lg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367000lg2 {
    public static final C1367000lg2 LIZ = new C1367000lg2();

    public static long LIZIZ() {
        new Object() { // from class: X.0lgS
        }.getClass();
        long jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "tt_im_share_panel_usability_improvement_expiry_seconds", true) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (jLJIJJLI != 0) {
            return ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ() - jLJIJJLI;
        }
        return 0L;
    }

    public static int LIZJ() {
        new Object() { // from class: X.0lgT
        }.getClass();
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_share_panel_usability_improvement_threshold", true);
        if (iLJIJ == 0) {
            return Integer.MAX_VALUE;
        }
        return iLJIJ;
    }

    public static boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_share_panel_usability_improvement", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_share_panel_usability_improvement", true) == 3;
    }
}
