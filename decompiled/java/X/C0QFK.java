package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QFK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QFK extends C09AY implements Function2<C0QFL, C0QFL, Unit> {
    public C0QFK() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0QFL c0qfl, C0QFL c0qfl2) {
        C0QFR c0qfr;
        C0QFL c0qfl3 = c0qfl2;
        if (c0qfl3 != null) {
            C0QFM.LIZ.getClass();
            C0QFQ c0qfqLIZ = C0QFM.LIZ(c0qfl3);
            if (c0qfqLIZ != null && (c0qfr = c0qfqLIZ.LL) != null) {
                ((ConcurrentHashMap) c0qfr.LIZ.getValue()).clear();
            }
        }
        return Unit.LIZ;
    }
}
