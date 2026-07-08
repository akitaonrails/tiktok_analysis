package X;

import com.ss.android.ugc.aweme.skylight.ISocialSkylightService;
import com.ss.android.ugc.aweme.skylight.SocialSkylightServiceImpl;

/* JADX INFO: renamed from: X.0rvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607400rvm implements ISocialSkylightService {
    public static final C1607400rvm LIZIZ = new C1607400rvm();
    public final /* synthetic */ ISocialSkylightService LIZ;

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final void LIZ(C1608370rxL c1608370rxL, EnumC1606080rte enumC1606080rte, boolean z) {
        this.LIZ.LIZ(c1608370rxL, enumC1606080rte, z);
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final void LIZIZ(EnumC1606080rte enumC1606080rte, C1608320rxG c1608320rxG, boolean z) {
        this.LIZ.LIZIZ(enumC1606080rte, c1608320rxG, z);
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final int LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final void LIZLLL(C1607440rvq c1607440rvq, EnumC1606080rte enumC1606080rte, boolean z) {
        this.LIZ.LIZLLL(c1607440rvq, enumC1606080rte, z);
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final void LJ(EnumC1606080rte enumC1606080rte, C1608320rxG c1608320rxG, boolean z) {
        this.LIZ.LJ(enumC1606080rte, c1608320rxG, z);
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISocialSkylightService
    public final C1608360rxK LJFF(EnumC1606080rte enumC1606080rte, boolean z) {
        return this.LIZ.LJFF(enumC1606080rte, z);
    }

    public C1607400rvm() {
        ISocialSkylightService iSocialSkylightService;
        Object objLIZ = C04TD.LIZ(ISocialSkylightService.class, false);
        if (objLIZ != null) {
            iSocialSkylightService = (ISocialSkylightService) objLIZ;
        } else {
            if (C04TD.p5 == null) {
                synchronized (ISocialSkylightService.class) {
                    if (C04TD.p5 == null) {
                        C04TD.p5 = new SocialSkylightServiceImpl();
                    }
                }
            }
            iSocialSkylightService = C04TD.p5;
        }
        this.LIZ = iSocialSkylightService;
    }
}
