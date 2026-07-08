package X;

import com.ss.android.ugc.aweme.feed.consumption.impl.RecommendConsumeServiceImpl;
import com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService;
import com.ss.android.ugc.aweme.utils.RecommendConsumeParams;

/* JADX INFO: renamed from: X.0pPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510770pPv implements IFeedRecommendConsumeService {
    public static final C1510770pPv LIZIZ = new C1510770pPv();
    public final /* synthetic */ IFeedRecommendConsumeService LIZ;

    @Override // com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService
    public final RecommendConsumeParams LIZ() {
        return this.LIZ.LIZ();
    }

    public C1510770pPv() {
        IFeedRecommendConsumeService iFeedRecommendConsumeService;
        Object objLIZ = C04TD.LIZ(IFeedRecommendConsumeService.class, false);
        if (objLIZ != null) {
            iFeedRecommendConsumeService = (IFeedRecommendConsumeService) objLIZ;
        } else {
            if (C04TD.s0 == null) {
                synchronized (IFeedRecommendConsumeService.class) {
                    if (C04TD.s0 == null) {
                        C04TD.s0 = new RecommendConsumeServiceImpl();
                    }
                }
            }
            iFeedRecommendConsumeService = C04TD.s0;
        }
        this.LIZ = iFeedRecommendConsumeService;
    }
}
