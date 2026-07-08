package X;

import com.ss.android.ugc.aweme.service.INewUserReversePopupService;
import com.ss.android.ugc.aweme.service.NewUserReversePopupService;

/* JADX INFO: renamed from: X.1Bda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209401Bda implements INewUserReversePopupService {
    public static final C2209401Bda LIZIZ = new C2209401Bda();
    public final /* synthetic */ INewUserReversePopupService LIZ;

    @Override // com.ss.android.ugc.aweme.service.INewUserReversePopupService
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.INewUserReversePopupService
    public final boolean LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    public C2209401Bda() {
        INewUserReversePopupService iNewUserReversePopupService;
        Object objLIZ = C04TD.LIZ(INewUserReversePopupService.class, false);
        if (objLIZ != null) {
            iNewUserReversePopupService = (INewUserReversePopupService) objLIZ;
        } else {
            if (C04TD.e4 == null) {
                synchronized (INewUserReversePopupService.class) {
                    if (C04TD.e4 == null) {
                        C04TD.e4 = new NewUserReversePopupService();
                    }
                }
            }
            iNewUserReversePopupService = C04TD.e4;
        }
        this.LIZ = iNewUserReversePopupService;
    }
}
