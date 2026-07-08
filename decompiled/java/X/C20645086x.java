package X;

import com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService;
import com.ss.android.ugc.aweme.opt.BackendApiCallerOptService;

/* JADX INFO: renamed from: X.086x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20645086x implements IBackendApiCallerOptService {
    public static final C20645086x LIZIZ = new C20645086x();
    public final /* synthetic */ IBackendApiCallerOptService LIZ;

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final boolean LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    public C20645086x() {
        IBackendApiCallerOptService iBackendApiCallerOptService;
        Object objLIZ = C04TD.LIZ(IBackendApiCallerOptService.class, false);
        if (objLIZ != null) {
            iBackendApiCallerOptService = (IBackendApiCallerOptService) objLIZ;
        } else {
            if (C04TD.U2 == null) {
                synchronized (IBackendApiCallerOptService.class) {
                    if (C04TD.U2 == null) {
                        C04TD.U2 = new BackendApiCallerOptService();
                    }
                }
            }
            iBackendApiCallerOptService = C04TD.U2;
        }
        this.LIZ = iBackendApiCallerOptService;
    }
}
