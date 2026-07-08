package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.feature.expriment.CompensationMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510000pOg extends C09AY implements Function0<CompensationMap> {
    public C1510000pOg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CompensationMap invoke() {
        try {
            C0C64.LJIILLIIL().getClass();
            CompensationMap compensationMap = (CompensationMap) C0C64.LJJIFFI(true, "event_tracking_compensation", 31744, CompensationMap.class, 2);
            return compensationMap == null ? C1509990pOf.LIZ : compensationMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1509990pOf.LIZ;
        }
    }
}
