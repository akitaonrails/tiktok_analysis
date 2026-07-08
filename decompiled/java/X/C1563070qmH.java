package X;

import com.ss.android.ugc.aweme.SAFExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563070qmH extends C09AY implements Function0<Unit> {
    public C1563070qmH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (true == C0C64.LJIILLIIL().LJIIIZ(31744, "navigation_monitor_v1", true, false)) {
            if (C21510419Gc.LJFF == null) {
                C21510419Gc c21510419Gc = new C21510419Gc();
                C21510419Gc.LJFF = c21510419Gc;
                SAFExtensionKt.LJIJI(c21510419Gc);
            }
            C725430Scv.LJ(C1561990qkX.LIZ, 1.0f, new C1563080qmI());
            C725430Scv.LJ(new AbstractC725510Sd3<C216700sX>() { // from class: X.0qkW
                @Override // X.AbstractC725500Sd2
                public final String LIZ() {
                    return "SAFReuseEvent";
                }
            }, 1.0f, new C1563060qmG());
        }
        return Unit.LIZ;
    }
}
