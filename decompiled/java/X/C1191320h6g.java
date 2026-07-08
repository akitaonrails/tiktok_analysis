package X;

import com.ss.android.ugc.aweme.base.LsFrequency;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;

/* JADX INFO: renamed from: X.0h6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191320h6g extends AbstractC1192300h8G {
    public static final C1191320h6g LIZIZ = new C1191320h6g();

    @Override // X.AbstractC1192300h8G
    public final String LJI() {
        return "poi_reviews_friend_profile_unify_show_freq_controller";
    }

    @Override // X.AbstractC1192300h8G
    public final LsFrequency LIZIZ() {
        PoiReviewFrequencyControl.ProfilePage profilePage;
        PoiReviewFrequencyControl.Frequency frequency;
        PoiReviewFrequencyControl.ProfilePage profilePage2;
        PoiReviewFrequencyControl.Frequency frequency2;
        PoiReviewFrequencyControl.LIZ.getClass();
        PoiReviewFrequencyControl.InnerConfig innerConfigLIZ = PoiReviewFrequencyControl.LIZ();
        Integer numValueOf = null;
        Integer numValueOf2 = (innerConfigLIZ == null || (profilePage2 = innerConfigLIZ.profilePage) == null || (frequency2 = profilePage2.uid) == null) ? null : Integer.valueOf(frequency2.frequencyDay);
        PoiReviewFrequencyControl.InnerConfig innerConfigLIZ2 = PoiReviewFrequencyControl.LIZ();
        if (innerConfigLIZ2 != null && (profilePage = innerConfigLIZ2.profilePage) != null && (frequency = profilePage.uid) != null) {
            numValueOf = Integer.valueOf(frequency.frequencyTimes);
        }
        return new LsFrequency(numValueOf2, numValueOf);
    }
}
