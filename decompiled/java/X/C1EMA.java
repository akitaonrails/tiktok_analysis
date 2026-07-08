package X;

import com.ss.android.ugc.aweme.base.LsFrequency;
import com.ss.android.ugc.aweme.poi.experiment.PoiReviewsTightenFreqExp;

/* JADX INFO: renamed from: X.1EMA, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EMA extends AbstractC1192300h8G {
    public static final C1EMA LIZIZ = new C1EMA();

    @Override // X.AbstractC1192300h8G
    public final String LJI() {
        return "poi_reviews_tighten_friend_page_daily_freq_controller";
    }

    @Override // X.AbstractC1192300h8G
    public final LsFrequency LIZIZ() {
        PoiReviewsTightenFreqExp.TimeConfig timeConfig;
        PoiReviewsTightenFreqExp.TimeConfig timeConfig2;
        PoiReviewsTightenFreqExp.PageConfig pageConfig = PoiReviewsTightenFreqExp.LIZ().friendPageConfig;
        Integer num = null;
        Integer num2 = (pageConfig == null || (timeConfig2 = pageConfig.dailyConfig) == null) ? null : timeConfig2.freqDay;
        PoiReviewsTightenFreqExp.PageConfig pageConfig2 = PoiReviewsTightenFreqExp.LIZ().friendPageConfig;
        if (pageConfig2 != null && (timeConfig = pageConfig2.dailyConfig) != null) {
            num = timeConfig.freqTime;
        }
        return new LsFrequency(num2, num);
    }
}
