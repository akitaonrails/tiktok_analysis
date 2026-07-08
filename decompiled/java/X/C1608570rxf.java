package X;

import com.ss.android.ugc.aweme.relation.avatar.FollowAvatarServiceImpl;
import com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService;

/* JADX INFO: renamed from: X.0rxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608570rxf implements IFollowAvatarService {
    public static final C1608570rxf LIZIZ = new C1608570rxf();
    public final /* synthetic */ IFollowAvatarService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService
    public final AbstractC1608810ry3<?, ?> LIZ() {
        return this.LIZ.LIZ();
    }

    public C1608570rxf() {
        IFollowAvatarService iFollowAvatarService;
        Object objLIZ = C04TD.LIZ(IFollowAvatarService.class, false);
        if (objLIZ != null) {
            iFollowAvatarService = (IFollowAvatarService) objLIZ;
        } else {
            if (C04TD.t3 == null) {
                synchronized (IFollowAvatarService.class) {
                    if (C04TD.t3 == null) {
                        C04TD.t3 = new FollowAvatarServiceImpl();
                    }
                }
            }
            iFollowAvatarService = C04TD.t3;
        }
        this.LIZ = iFollowAvatarService;
    }
}
