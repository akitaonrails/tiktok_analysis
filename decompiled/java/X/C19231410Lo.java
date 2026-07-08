package X;

import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentServiceImpl;

/* JADX INFO: renamed from: X.10Lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19231410Lo implements IRecommendUsersDependentService {
    public static final C19231410Lo LIZIZ = new C19231410Lo();
    public final /* synthetic */ IRecommendUsersDependentService LIZ;

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    public C19231410Lo() {
        Object objLIZ = C04TD.LIZ(IRecommendUsersDependentService.class, false);
        this.LIZ = objLIZ != null ? (IRecommendUsersDependentService) objLIZ : new IRecommendUsersDependentServiceImpl();
    }
}
