package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService;

/* JADX INFO: renamed from: X.0rAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578310rAr {
    public static final /* synthetic */ C1578310rAr LIZ = new C1578310rAr();

    public static DramaFeedRecommendService LIZ() {
        DramaFeedRecommendService dramaFeedRecommendService = (DramaFeedRecommendService) PluggableExtentionKt.pluggableSpi$default(DramaFeedRecommendService.class, false, false, false, 14, null);
        return dramaFeedRecommendService == null ? new DramaFeedRecommendService() { // from class: X.0rAs
            @Override // com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService
            public final String LIZ() {
                return "";
            }

            @Override // com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService
            public final boolean LIZIZ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService
            public final long LIZJ(boolean z) {
                return 0L;
            }

            @Override // com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService
            public final SeriesFeedResp LIZLLL(String str, String str2, String str3) {
                return null;
            }
        } : dramaFeedRecommendService;
    }
}
