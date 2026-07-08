package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.0qmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563080qmI extends C09AY implements Function1<C2273241DyM, Unit> {
    public C1563080qmI() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2273241DyM c2273241DyM) {
        float f;
        C2273241DyM c2273241DyM2 = c2273241DyM;
        if (true == C0C64.LJIILLIIL().LJIIIZ(31744, "navigation_monitor_v1", true, false)) {
            f = 0.05f;
        } else {
            f = 0.0f;
        }
        C725430Scv.LIZJ("page_navigation_performance", f, new AwS579S0100000_35(c2273241DyM2, 6));
        return Unit.LIZ;
    }
}
