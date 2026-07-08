package X;

import com.ss.android.ugc.aweme.SAFAutoRecycleThresholdConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617820sCa extends C09AY implements Function0<SAFAutoRecycleThresholdConfig> {
    public C1617820sCa() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.SAFAutoRecycleThresholdConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SAFAutoRecycleThresholdConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SAFAutoRecycleThresholdConfig sAFAutoRecycleThresholdConfig = C1617800sCY.LIZIZ;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "single_activity_auto_recycle_threshold", 31744, SAFAutoRecycleThresholdConfig.class, sAFAutoRecycleThresholdConfig, 2);
        return LJJIIJ != 0 ? LJJIIJ : sAFAutoRecycleThresholdConfig;
    }
}
