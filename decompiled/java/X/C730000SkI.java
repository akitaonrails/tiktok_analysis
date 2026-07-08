package X;

import com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService;
import com.ss.android.ugc.tiktok.addyours.service.PerformanceServiceImpl;

/* JADX INFO: renamed from: X.0SkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730000SkI implements IFIPerformanceService {
    public static final C730000SkI LIZIZ = new C730000SkI();
    public final /* synthetic */ IFIPerformanceService LIZ;

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZ(int i, Object obj, String str) {
        this.LIZ.LIZ(i, obj, str);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZIZ(int i) {
        this.LIZ.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZJ(int i, int i2) {
        this.LIZ.LIZJ(i, i2);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZLLL(int i, boolean z) {
        this.LIZ.LIZLLL(i, z);
    }

    public C730000SkI() {
        IFIPerformanceService iFIPerformanceService;
        Object objLIZ = C04TD.LIZ(IFIPerformanceService.class, false);
        if (objLIZ != null) {
            iFIPerformanceService = (IFIPerformanceService) objLIZ;
        } else {
            if (C04TD.S6 == null) {
                synchronized (IFIPerformanceService.class) {
                    if (C04TD.S6 == null) {
                        C04TD.S6 = new PerformanceServiceImpl();
                    }
                }
            }
            iFIPerformanceService = C04TD.S6;
        }
        this.LIZ = iFIPerformanceService;
    }
}
