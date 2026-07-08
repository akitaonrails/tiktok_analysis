package X;

import com.ss.android.ugc.aweme.avatar.AvatarInternalServiceImpl;
import com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService;

/* JADX INFO: renamed from: X.0ryq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609300ryq implements IAvatarInternalService {
    public static final C1609300ryq LIZIZ = new C1609300ryq();
    public final /* synthetic */ IAvatarInternalService LIZ;

    @Override // com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService
    public final InterfaceC1609290ryp LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService
    public final InterfaceC1607260rvY LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1609300ryq() {
        IAvatarInternalService iAvatarInternalService;
        Object objLIZ = C04TD.LIZ(IAvatarInternalService.class, false);
        if (objLIZ != null) {
            iAvatarInternalService = (IAvatarInternalService) objLIZ;
        } else {
            if (C04TD.LLIIJLIL == null) {
                synchronized (IAvatarInternalService.class) {
                    if (C04TD.LLIIJLIL == null) {
                        C04TD.LLIIJLIL = new AvatarInternalServiceImpl();
                    }
                }
            }
            iAvatarInternalService = C04TD.LLIIJLIL;
        }
        this.LIZ = iAvatarInternalService;
    }
}
