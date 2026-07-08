package X;

import com.ss.android.ugc.aweme.base.LsFrequency;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;

/* JADX INFO: renamed from: X.0h6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191310h6f extends AbstractC1192300h8G {
    public static final C1191310h6f LIZIZ = new C1191310h6f();

    @Override // X.AbstractC1192300h8G
    public final String LJI() {
        return "poi_reviews_friend_profile_unify_show_freq_controller";
    }

    @Override // X.AbstractC1192300h8G
    public final LsFrequency LIZIZ() {
        PoiReviewFrequencyControl.FriendPage friendPage;
        PoiReviewFrequencyControl.Frequency frequency;
        PoiReviewFrequencyControl.FriendPage friendPage2;
        PoiReviewFrequencyControl.Frequency frequency2;
        PoiReviewFrequencyControl.LIZ.getClass();
        PoiReviewFrequencyControl.InnerConfig innerConfigLIZ = PoiReviewFrequencyControl.LIZ();
        Integer numValueOf = null;
        Integer numValueOf2 = (innerConfigLIZ == null || (friendPage2 = innerConfigLIZ.friendPage) == null || (frequency2 = friendPage2.uid) == null) ? null : Integer.valueOf(frequency2.frequencyDay);
        PoiReviewFrequencyControl.InnerConfig innerConfigLIZ2 = PoiReviewFrequencyControl.LIZ();
        if (innerConfigLIZ2 != null && (friendPage = innerConfigLIZ2.friendPage) != null && (frequency = friendPage.uid) != null) {
            numValueOf = Integer.valueOf(frequency.frequencyTimes);
        }
        return new LsFrequency(numValueOf2, numValueOf);
    }
}
