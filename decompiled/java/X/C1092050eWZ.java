package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092050eWZ extends C09AY implements Function1<C1092100eWe, Unit> {
    public final /* synthetic */ C1092090eWd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092050eWZ(C1092090eWd c1092090eWd) {
        super(1);
        this.LL = c1092090eWd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1092100eWe c1092100eWe) {
        C1092100eWe c1092100eWe2 = c1092100eWe;
        C1092090eWd c1092090eWd = this.LL;
        c1092090eWd.getClass();
        C500260Jjc.LLFFF(c1092090eWd);
        if (c1092100eWe2.LJIL != null && (!(!r0.isValid))) {
            ((ArrayList) c1092090eWd.LLJILJIL).add(c1092100eWe2);
            c1092090eWd.LLJIJIL.removeCallbacks(c1092090eWd.LLJILJILJ);
            C786410Ut5.LJLIIL(100L, c1092090eWd.LLJIJIL, c1092090eWd.LLJILJILJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Batching layout item: debugInfo=");
            sbLIZ.append(c1092100eWe2.LJJIFFI);
            sbLIZ.append(", pending=");
            sbLIZ.append(((ArrayList) c1092090eWd.LLJILJIL).size());
            C20441214yg.LIZIZ("LiveBoardsTipView", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            c1092090eWd.LIZ(c1092100eWe2);
        }
        return Unit.LIZ;
    }
}
