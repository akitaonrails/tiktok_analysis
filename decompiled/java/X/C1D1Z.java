package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.DisableSparkLynxPrefetchV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D1Z extends C09AY implements Function0<Long> {
    public C1D1Z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long j;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            DisableSparkLynxPrefetchV2.Model model = DisableSparkLynxPrefetchV2.LIZ;
            DisableSparkLynxPrefetchV2.Model model2 = (DisableSparkLynxPrefetchV2.Model) c0c64LJIILLIIL.LJJIIJ(true, "disable_spark_lynx_prefetch_v2", 31744, DisableSparkLynxPrefetchV2.Model.class, model, 2);
            j = model2 != null ? model2.maxAliveDuration : model.maxAliveDuration;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = DisableSparkLynxPrefetchV2.LIZ.maxAliveDuration;
        }
        return Long.valueOf(j);
    }
}
