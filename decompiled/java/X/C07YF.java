package X;

import com.ss.android.ugc.aweme.hybridkit.experiment.SparkLargeScreenAdaptationConfig;

/* JADX INFO: renamed from: X.07YF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YF {
    public static final SparkLargeScreenAdaptationConfig LIZ = new SparkLargeScreenAdaptationConfig(true, true, true);
    public static SparkLargeScreenAdaptationConfig LIZIZ;

    public static final SparkLargeScreenAdaptationConfig LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (SparkLargeScreenAdaptationConfig) C0C64.LJIILLIIL().LJJII(SparkLargeScreenAdaptationConfig.class, LIZ, "spark_large_screen_adaptation_config", true);
        }
        SparkLargeScreenAdaptationConfig sparkLargeScreenAdaptationConfig = LIZIZ;
        return sparkLargeScreenAdaptationConfig == null ? LIZ : sparkLargeScreenAdaptationConfig;
    }
}
