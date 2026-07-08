package X;

import com.ss.android.ugc.aweme.app.services.IRegionService;
import com.ss.android.ugc.aweme.app.services.RegionService;

/* JADX INFO: renamed from: X.13yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20186013yc implements InterfaceC1420020n3Y {
    public static final String LIZ() {
        IRegionService iRegionService;
        Object objLIZ = C04TD.LIZ(IRegionService.class, false);
        if (objLIZ != null) {
            iRegionService = (IRegionService) objLIZ;
        } else {
            if (C04TD.LLIIIJ == null) {
                synchronized (IRegionService.class) {
                    if (C04TD.LLIIIJ == null) {
                        C04TD.LLIIIJ = new RegionService();
                    }
                }
            }
            iRegionService = C04TD.LLIIIJ;
        }
        return iRegionService != null ? iRegionService.getRegion() : "";
    }

    public static final Boolean LIZIZ() {
        return Boolean.valueOf(C2222691Bz1.LJIIIIZZ());
    }
}
