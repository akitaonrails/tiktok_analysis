package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.DisableSparkLynxPrefetchV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D1Y extends C09AY implements Function0<Boolean> {
    public C1D1Y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            DisableSparkLynxPrefetchV2.Model model = DisableSparkLynxPrefetchV2.LIZ;
            DisableSparkLynxPrefetchV2.Model model2 = (DisableSparkLynxPrefetchV2.Model) c0c64LJIILLIIL.LJJIIJ(true, "disable_spark_lynx_prefetch_v2", 31744, DisableSparkLynxPrefetchV2.Model.class, model, 2);
            z = model2 != null ? model2.global : model.global;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = DisableSparkLynxPrefetchV2.LIZ.global;
        }
        return Boolean.valueOf(z);
    }
}
