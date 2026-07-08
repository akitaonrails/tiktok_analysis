package X;

import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService;
import com.ss.android.ugc.aweme.service.Social2TabServiceImpl;

/* JADX INFO: renamed from: X.0rcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595430rcT implements ISocial2TabService {
    public static final C1595430rcT LIZIZ = new C1595430rcT();
    public final /* synthetic */ ISocial2TabService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final InterfaceC1564570qoh LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final ISocial2TabRedDotService LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final ISocial2TabDelegateService LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C1595430rcT() {
        ISocial2TabService iSocial2TabService;
        Object objLIZ = C04TD.LIZ(ISocial2TabService.class, false);
        if (objLIZ != null) {
            iSocial2TabService = (ISocial2TabService) objLIZ;
        } else {
            if (C04TD.n4 == null) {
                synchronized (ISocial2TabService.class) {
                    if (C04TD.n4 == null) {
                        C04TD.n4 = new Social2TabServiceImpl();
                    }
                }
            }
            iSocial2TabService = C04TD.n4;
        }
        this.LIZ = iSocial2TabService;
    }
}
