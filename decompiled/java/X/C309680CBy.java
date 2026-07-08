package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.SparkLynxPrefetchFallbackToV1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309680CBy extends C09AY implements Function0<Boolean> {
    public C309680CBy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SparkLynxPrefetchFallbackToV1.Model model = SparkLynxPrefetchFallbackToV1.LIZ;
            SparkLynxPrefetchFallbackToV1.Model model2 = (SparkLynxPrefetchFallbackToV1.Model) c0c64LJIILLIIL.LJJIIJ(true, "spark_lynx_prefetch_fallback_to_v1", 31744, SparkLynxPrefetchFallbackToV1.Model.class, model, 2);
            z = model2 != null ? model2.fallback : model.fallback;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = SparkLynxPrefetchFallbackToV1.LIZ.fallback;
        }
        return Boolean.valueOf(z);
    }
}
