package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0qmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563060qmG extends C09AY implements Function1<C216700sX, Unit> {
    public C1563060qmG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C216700sX c216700sX) {
        float f;
        C216700sX c216700sX2 = c216700sX;
        if (true == C0C64.LJIILLIIL().LJIIIZ(31744, "navigation_monitor_v1", true, false)) {
            f = 0.05f;
        } else {
            f = 0.0f;
        }
        C725430Scv.LIZJ("saf_reuse_performance", f, new AwS568S0100000_24(c216700sX2, 10));
        return Unit.LIZ;
    }
}
