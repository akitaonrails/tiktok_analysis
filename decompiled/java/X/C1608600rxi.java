package X;

import com.ss.android.ugc.aweme.avatar.advance.service.AvatarExtServiceImpl;
import com.ss.android.ugc.aweme.avatar.advance.service.IAvatarExtService;

/* JADX INFO: renamed from: X.0rxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608600rxi implements IAvatarExtService {
    public static final C1608600rxi LIZIZ = new C1608600rxi();
    public final /* synthetic */ IAvatarExtService LIZ;

    @Override // com.ss.android.ugc.aweme.avatar.advance.service.IAvatarExtService
    public final void LIZ(EnumC2006907tb enumC2006907tb, InterfaceC1609110ryX interfaceC1609110ryX) {
        this.LIZ.LIZ(enumC2006907tb, interfaceC1609110ryX);
    }

    @Override // com.ss.android.ugc.aweme.avatar.advance.service.IAvatarExtService
    public final InterfaceC1609110ryX LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1608600rxi() {
        IAvatarExtService iAvatarExtService;
        Object objLIZ = C04TD.LIZ(IAvatarExtService.class, false);
        if (objLIZ != null) {
            iAvatarExtService = (IAvatarExtService) objLIZ;
        } else {
            if (C04TD.LLIIL == null) {
                synchronized (IAvatarExtService.class) {
                    if (C04TD.LLIIL == null) {
                        C04TD.LLIIL = new AvatarExtServiceImpl();
                    }
                }
            }
            iAvatarExtService = C04TD.LLIIL;
        }
        this.LIZ = iAvatarExtService;
    }
}
