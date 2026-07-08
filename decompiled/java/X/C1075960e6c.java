package X;

import com.ss.android.ugc.aweme.friends.psp.ContactUploadPSPServiceImpl;
import com.ss.android.ugc.aweme.friends.psp.IContactUploadPSPService;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0e6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075960e6c implements IContactUploadPSPService {
    public static final C1075960e6c LIZIZ = new C1075960e6c();
    public final /* synthetic */ IContactUploadPSPService LIZ;

    @Override // com.ss.android.ugc.aweme.friends.psp.IContactUploadPSPService
    public final void LIZ(AFwS204S0000000_16 aFwS204S0000000_16) {
        this.LIZ.LIZ(aFwS204S0000000_16);
    }

    @Override // com.ss.android.ugc.aweme.friends.psp.IContactUploadPSPService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.psp.IContactUploadPSPService
    public final void init() {
        this.LIZ.init();
    }

    public C1075960e6c() {
        IContactUploadPSPService iContactUploadPSPService;
        Object objLIZ = C04TD.LIZ(IContactUploadPSPService.class, false);
        if (objLIZ != null) {
            iContactUploadPSPService = (IContactUploadPSPService) objLIZ;
        } else {
            if (C04TD.I0 == null) {
                synchronized (IContactUploadPSPService.class) {
                    if (C04TD.I0 == null) {
                        C04TD.I0 = new ContactUploadPSPServiceImpl();
                    }
                }
            }
            iContactUploadPSPService = C04TD.I0;
        }
        this.LIZ = iContactUploadPSPService;
    }
}
