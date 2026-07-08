package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.SparkIABOptimizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302980BuC extends C09AY implements Function0<SparkIABOptimizeConfig.SparkIABOptimizeConfigModel> {
    public C302980BuC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.settings.SparkIABOptimizeConfig$SparkIABOptimizeConfigModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.ss.android.ugc.aweme.settings.SparkIABOptimizeConfig$SparkIABOptimizeConfigModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SparkIABOptimizeConfig.SparkIABOptimizeConfigModel invoke() {
        if (C1867110ygf.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("spark_iab_optimize_config")) {
            return GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("spark_iab_optimize_config", ""), SparkIABOptimizeConfig.SparkIABOptimizeConfigModel.class);
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SparkIABOptimizeConfig.SparkIABOptimizeConfigModel sparkIABOptimizeConfigModel = SparkIABOptimizeConfig.LIZ;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "spark_iab_optimize_config", 31744, SparkIABOptimizeConfig.SparkIABOptimizeConfigModel.class, sparkIABOptimizeConfigModel, 2);
        return LJJIIJ != 0 ? LJJIIJ : sparkIABOptimizeConfigModel;
    }
}
