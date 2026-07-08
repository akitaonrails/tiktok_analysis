package X;

import com.ss.android.ugc.aweme.service.ISocInteractionAvatarService;
import com.ss.android.ugc.aweme.service.SocInteractionAvatarServiceImpl;

/* JADX INFO: renamed from: X.0rxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608590rxh implements ISocInteractionAvatarService {
    public static final C1608590rxh LIZIZ = new C1608590rxh();
    public final /* synthetic */ ISocInteractionAvatarService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ISocInteractionAvatarService
    public final AbstractC1608810ry3<?, ?> LIZ() {
        return this.LIZ.LIZ();
    }

    public C1608590rxh() {
        ISocInteractionAvatarService iSocInteractionAvatarService;
        Object objLIZ = C04TD.LIZ(ISocInteractionAvatarService.class, false);
        if (objLIZ != null) {
            iSocInteractionAvatarService = (ISocInteractionAvatarService) objLIZ;
        } else {
            if (C04TD.l4 == null) {
                synchronized (ISocInteractionAvatarService.class) {
                    if (C04TD.l4 == null) {
                        C04TD.l4 = new SocInteractionAvatarServiceImpl();
                    }
                }
            }
            iSocInteractionAvatarService = C04TD.l4;
        }
        this.LIZ = iSocInteractionAvatarService;
    }
}
