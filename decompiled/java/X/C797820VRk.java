package X;

import com.ss.android.ugc.aweme.friendstab.service.IFriendsRedDotService;
import com.ss.android.ugc.aweme.service.FriendsRedDotGidsService;
import java.util.List;

/* JADX INFO: renamed from: X.0VRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797820VRk implements IFriendsRedDotService {
    public static final C797820VRk LIZIZ = new C797820VRk();
    public final /* synthetic */ IFriendsRedDotService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsRedDotService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsRedDotService
    public final void LIZIZ(C0VNJ c0vnj) {
        this.LIZ.LIZIZ(c0vnj);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsRedDotService
    public final List<C0VNJ> LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C797820VRk() {
        IFriendsRedDotService iFriendsRedDotService;
        Object objLIZ = C04TD.LIZ(IFriendsRedDotService.class, false);
        if (objLIZ != null) {
            iFriendsRedDotService = (IFriendsRedDotService) objLIZ;
        } else {
            if (C04TD.b4 == null) {
                synchronized (IFriendsRedDotService.class) {
                    if (C04TD.b4 == null) {
                        C04TD.b4 = new FriendsRedDotGidsService();
                    }
                }
            }
            iFriendsRedDotService = C04TD.b4;
        }
        this.LIZ = iFriendsRedDotService;
    }
}
