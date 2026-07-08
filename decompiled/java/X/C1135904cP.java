package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragmentProvider;
import com.ss.android.ugc.aweme.feed.ui.IFeedRecommendFragmentProvider;

/* JADX INFO: renamed from: X.04cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1135904cP implements IFeedRecommendFragmentProvider {
    public static final C1135904cP LIZIZ = new C1135904cP();
    public final /* synthetic */ IFeedRecommendFragmentProvider LIZ;

    @Override // com.ss.android.ugc.aweme.feed.ui.IFeedRecommendFragmentProvider
    public final Fragment LIZ() {
        return this.LIZ.LIZ();
    }

    public C1135904cP() {
        IFeedRecommendFragmentProvider iFeedRecommendFragmentProvider;
        Object objLIZ = C04TD.LIZ(IFeedRecommendFragmentProvider.class, false);
        if (objLIZ != null) {
            iFeedRecommendFragmentProvider = (IFeedRecommendFragmentProvider) objLIZ;
        } else {
            if (C04TD.y0 == null) {
                synchronized (IFeedRecommendFragmentProvider.class) {
                    if (C04TD.y0 == null) {
                        C04TD.y0 = new FeedRecommendFragmentProvider();
                    }
                }
            }
            iFeedRecommendFragmentProvider = C04TD.y0;
        }
        this.LIZ = iFeedRecommendFragmentProvider;
    }
}
