package X;

import com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService;
import com.ss.android.ugc.aweme.service.RecentGidsCacheServiceImpl;
import java.util.List;

/* JADX INFO: renamed from: X.0hlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216540hlM implements IRecentGidsCacheService {
    public static final C1216540hlM LIZIZ = new C1216540hlM();
    public final /* synthetic */ IRecentGidsCacheService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService
    public final List LIZ(Integer num, long j) {
        return this.LIZ.LIZ(num, j);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService
    public final void LIZIZ(C0VR0 c0vr0) {
        this.LIZ.LIZIZ(c0vr0);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService
    public final void LIZJ(C0VR0 c0vr0) {
        this.LIZ.LIZJ(c0vr0);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsCacheService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    public C1216540hlM() {
        IRecentGidsCacheService iRecentGidsCacheService;
        Object objLIZ = C04TD.LIZ(IRecentGidsCacheService.class, false);
        if (objLIZ != null) {
            iRecentGidsCacheService = (IRecentGidsCacheService) objLIZ;
        } else {
            if (C04TD.i4 == null) {
                synchronized (IRecentGidsCacheService.class) {
                    if (C04TD.i4 == null) {
                        C04TD.i4 = new RecentGidsCacheServiceImpl();
                    }
                }
            }
            iRecentGidsCacheService = C04TD.i4;
        }
        this.LIZ = iRecentGidsCacheService;
    }
}
