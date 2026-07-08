package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pHZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505590pHZ extends C09AY implements Function0<ExecutorService> {
    public C1505590pHZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        C1602860roS.LIZ.getClass();
        ?? LIZJ = C1492110ovp.LIZJ("FeedAssmethreadOpt", new C0T5V(), new C1505560pHW(C296490Bjj.LIZ(1) ? ((Number) C1505600pHa.LIZ.getValue()).intValue() : 0), !C1602860roS.LJ() && ((Boolean) C2219251BtT.LIZ.getValue()).booleanValue());
        if (LIZJ != 0) {
            return LIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
