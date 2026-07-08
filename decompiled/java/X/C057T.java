package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.multiapp.IRecommendUsersExService;

/* JADX INFO: renamed from: X.057T, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C057T implements IRecommendUsersExService {
    public static final C057T LIZIZ = new C057T();
    public final /* synthetic */ IRecommendUsersExService LIZ;

    @Override // com.ss.android.ugc.aweme.multiapp.IRecommendUsersExService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    public C057T() {
        IRecommendUsersExService iRecommendUsersExService = (IRecommendUsersExService) PluggableExtentionKt.pluggableSpi$default(IRecommendUsersExService.class, false, false, false, 14, null);
        if (iRecommendUsersExService != null) {
            this.LIZ = iRecommendUsersExService;
        } else {
            "no implementation IRecommendUsersExService".toString();
            throw new IllegalStateException("no implementation IRecommendUsersExService");
        }
    }
}
