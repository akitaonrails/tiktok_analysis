package X;

import com.ss.android.ugc.aweme.commercialize.ams.adapter.di.MeasurementExperimentModulesImpl;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementExperimentModules;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589120N8s extends C09AY implements Function0<MeasurementExperimentModules> {
    public C589120N8s() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementExperimentModules, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final MeasurementExperimentModules invoke() {
        ?? LIZ = C04TD.LIZ(MeasurementExperimentModules.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.LLJJJJ == null) {
            synchronized (MeasurementExperimentModules.class) {
                if (C04TD.LLJJJJ == null) {
                    C04TD.LLJJJJ = new MeasurementExperimentModulesImpl();
                }
            }
        }
        return C04TD.LLJJJJ;
    }
}
