package X;

import com.ss.android.ugc.aweme.base.LsFrequency;
import com.ss.android.ugc.aweme.poi.experiment.PoiReviewsCloseControlTwoEntrances;

/* JADX INFO: renamed from: X.0hOX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202390hOX extends AbstractC1192300h8G {
    public static final C1202390hOX LIZIZ = new C1202390hOX();

    @Override // X.AbstractC1192300h8G
    public final String LJI() {
        return "poi_reviews_friend_profile_unify_close_freq_controller";
    }

    @Override // X.AbstractC1192300h8G
    public final LsFrequency LIZIZ() {
        C01GW c01gw = PoiReviewsCloseControlTwoEntrances.LIZIZ;
        PoiReviewsCloseControlTwoEntrances.Config config = (PoiReviewsCloseControlTwoEntrances.Config) c01gw.getValue();
        Integer num = config != null ? config.frequencyDay : null;
        PoiReviewsCloseControlTwoEntrances.Config config2 = (PoiReviewsCloseControlTwoEntrances.Config) c01gw.getValue();
        return new LsFrequency(num, config2 != null ? config2.frequencyTimes : null);
    }
}
