package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EBB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EBB extends C09AY implements Function0<GuideOutPushExperiment.MetaData> {
    public C1EBB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushExperiment$MetaData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final GuideOutPushExperiment.MetaData invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        GuideOutPushExperiment.MetaData metaData = GuideOutPushExperiment.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(GuideOutPushExperiment.MetaData.class, metaData, "guide_out_push_experiment_config", true);
        return LJJII != 0 ? LJJII : metaData;
    }
}
