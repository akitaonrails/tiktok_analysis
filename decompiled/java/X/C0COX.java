package X;

import com.ss.android.ugc.aweme.experiment.OptimizeVideoAdaptationStrategySettingsConfig;

/* JADX INFO: renamed from: X.0COX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COX {
    public static final OptimizeVideoAdaptationStrategySettingsConfig LIZ = new OptimizeVideoAdaptationStrategySettingsConfig(0.1f, 0.15f, 0.2f, true, true, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0COW());
    public static final float LIZJ = LIZ().low_loss_max;
    public static final float LIZLLL = LIZ().middle_loss_max;
    public static final float LJ = LIZ().high_loss_max;
    public static final boolean LJFF;
    public static final boolean LJI;

    static {
        LIZ();
        LJFF = LIZ().enable_survey_top_margin;
        LJI = LIZ().enable_top_tab_transparent;
    }

    public static OptimizeVideoAdaptationStrategySettingsConfig LIZ() {
        return (OptimizeVideoAdaptationStrategySettingsConfig) LIZIZ.getValue();
    }
}
