package X;

import com.ss.android.ugc.aweme.commercialize.ams.adapter.di.MeasurementDependencyModulesImpl;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04TE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TE extends C09AY implements Function0<MeasurementDependencyModules> {
    public C04TE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final MeasurementDependencyModules invoke() {
        ?? LIZ = C04TD.LIZ(MeasurementDependencyModules.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.LLJJJIL == null) {
            synchronized (MeasurementDependencyModules.class) {
                if (C04TD.LLJJJIL == null) {
                    C04TD.LLJJJIL = new MeasurementDependencyModulesImpl();
                }
            }
        }
        return C04TD.LLJJJIL;
    }
}
