package X;

import com.ss.android.ugc.aweme.commercialize.ams.adapter.di.MeasurementContextModulesImpl;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N8L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N8L extends C09AY implements Function0<MeasurementContextModules> {
    public C0N8L() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final MeasurementContextModules invoke() {
        ?? LIZ = C04TD.LIZ(MeasurementContextModules.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.LLJJJ == null) {
            synchronized (MeasurementContextModules.class) {
                if (C04TD.LLJJJ == null) {
                    C04TD.LLJJJ = new MeasurementContextModulesImpl();
                }
            }
        }
        return C04TD.LLJJJ;
    }
}
