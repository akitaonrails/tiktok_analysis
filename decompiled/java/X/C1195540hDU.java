package X;

import com.ss.android.ugc.aweme.base.LsFrequency;
import com.ss.android.ugc.aweme.poi.experiment.PoiReviewsTightenCloseFreqExp;

/* JADX INFO: renamed from: X.0hDU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195540hDU extends AbstractC1192300h8G {
    public static final C1195540hDU LIZIZ = new C1195540hDU();

    @Override // X.AbstractC1192300h8G
    public final String LJI() {
        return "poi_reviews_tighten_close_freq_controller";
    }

    @Override // X.AbstractC1192300h8G
    public final LsFrequency LIZIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PoiReviewsTightenCloseFreqExp.Config config = PoiReviewsTightenCloseFreqExp.LIZ;
        PoiReviewsTightenCloseFreqExp.Config config2 = (PoiReviewsTightenCloseFreqExp.Config) c0c64LJIILLIIL.LJJII(PoiReviewsTightenCloseFreqExp.Config.class, config, "poi_review_optimize_close_frequency_control", true);
        if (config2 == null) {
            config2 = config;
        }
        Integer num = config2.freqDay;
        PoiReviewsTightenCloseFreqExp.Config config3 = (PoiReviewsTightenCloseFreqExp.Config) C0C64.LJIILLIIL().LJJII(PoiReviewsTightenCloseFreqExp.Config.class, config, "poi_review_optimize_close_frequency_control", true);
        if (config3 != null) {
            config = config3;
        }
        return new LsFrequency(num, config.freqTime);
    }
}
