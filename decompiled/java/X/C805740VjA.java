package X;

import com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService;
import com.ss.android.ugc.aweme.service.FriendsUnreadGidsService;
import java.util.List;

/* JADX INFO: renamed from: X.0VjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805740VjA implements IFriendsUnreadService {
    public static final C805740VjA LIZIZ = new C805740VjA();
    public final /* synthetic */ IFriendsUnreadService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService
    public final void LIZ(C0VNP c0vnp) {
        this.LIZ.LIZ(c0vnp);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService
    public final List<C0VNP> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService
    public final void LIZJ(List<C0VNP> list) {
        this.LIZ.LIZJ(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsUnreadService
    public final void clear() {
        this.LIZ.clear();
    }

    public C805740VjA() {
        IFriendsUnreadService iFriendsUnreadService;
        Object objLIZ = C04TD.LIZ(IFriendsUnreadService.class, false);
        if (objLIZ != null) {
            iFriendsUnreadService = (IFriendsUnreadService) objLIZ;
        } else {
            if (C04TD.c4 == null) {
                synchronized (IFriendsUnreadService.class) {
                    if (C04TD.c4 == null) {
                        C04TD.c4 = new FriendsUnreadGidsService();
                    }
                }
            }
            iFriendsUnreadService = C04TD.c4;
        }
        this.LIZ = iFriendsUnreadService;
    }
}
