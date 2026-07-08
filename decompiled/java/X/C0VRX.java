package X;

import com.ss.android.ugc.aweme.friendstab.service.IRepostDislikeService;
import com.ss.android.ugc.aweme.service.RepostDislikeGidsService;
import java.util.List;

/* JADX INFO: renamed from: X.0VRX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VRX implements IRepostDislikeService {
    public static final C0VRX LIZIZ = new C0VRX();
    public final /* synthetic */ IRepostDislikeService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRepostDislikeService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRepostDislikeService
    public final List<C0VNG> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRepostDislikeService
    public final void LIZJ(C0VNG c0vng) {
        this.LIZ.LIZJ(c0vng);
    }

    public C0VRX() {
        IRepostDislikeService iRepostDislikeService;
        Object objLIZ = C04TD.LIZ(IRepostDislikeService.class, false);
        if (objLIZ != null) {
            iRepostDislikeService = (IRepostDislikeService) objLIZ;
        } else {
            if (C04TD.j4 == null) {
                synchronized (IRepostDislikeService.class) {
                    if (C04TD.j4 == null) {
                        C04TD.j4 = new RepostDislikeGidsService();
                    }
                }
            }
            iRepostDislikeService = C04TD.j4;
        }
        this.LIZ = iRepostDislikeService;
    }
}
