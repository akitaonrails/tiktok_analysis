package X;

import com.ss.android.ugc.aweme.base.LsFrequency;
import com.ss.android.ugc.aweme.poi.experiment.PoiReviewsTightenFreqExp;

/* JADX INFO: renamed from: X.1EMD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EMD extends AbstractC1192300h8G {
    public static final C1EMD LIZIZ = new C1EMD();

    @Override // X.AbstractC1192300h8G
    public final String LJI() {
        return "poi_reviews_tighten_profile_page_weekly_freq_controller";
    }

    @Override // X.AbstractC1192300h8G
    public final LsFrequency LIZIZ() {
        PoiReviewsTightenFreqExp.TimeConfig timeConfig;
        PoiReviewsTightenFreqExp.TimeConfig timeConfig2;
        PoiReviewsTightenFreqExp.PageConfig pageConfig = PoiReviewsTightenFreqExp.LIZ().profilePageConfig;
        Integer num = null;
        Integer num2 = (pageConfig == null || (timeConfig2 = pageConfig.weeklyConfig) == null) ? null : timeConfig2.freqDay;
        PoiReviewsTightenFreqExp.PageConfig pageConfig2 = PoiReviewsTightenFreqExp.LIZ().profilePageConfig;
        if (pageConfig2 != null && (timeConfig = pageConfig2.weeklyConfig) != null) {
            num = timeConfig.freqTime;
        }
        return new LsFrequency(num2, num);
    }
}
