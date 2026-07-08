package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759570Tqt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ C1103240eoc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759570Tqt(Object obj, C1103240eoc c1103240eoc) {
        super(0);
        this.LL = obj;
        this.LLILLJJLI = c1103240eoc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pin card guide strategy callback, strategy=");
        sbLIZ.append(this.LL);
        C20441214yg.LJIIIZ("PcsToolbarAnchorServicePlusBehavior", C2188811AlT.LIZIZ(sbLIZ));
        C1103240eoc c1103240eoc = this.LLILLJJLI;
        Object obj = this.LL;
        Long l = obj instanceof Long ? (Long) obj : null;
        c1103240eoc.getClass();
        if (l != null) {
            l.longValue();
            if (!Intrinsics.LJFF(InterfaceC1106030et7.Y4.LIZ(), Boolean.TRUE)) {
                if (l.longValue() == 1) {
                    C20441214yg.LJIIIZ("PcsToolbarAnchorServicePlusBehavior", "show pin card guide tooltip, strategyValue=1");
                    C1103240eoc.LIZIZ(c1103240eoc, l, C497740JfY.LJIJI(2131853167), EnumC1120860fH2.GOLIVE_GUIDE_SERVICE_PLUS_PIN_NOTICE);
                } else if (l.longValue() == 2) {
                    C20441214yg.LJIIIZ("PcsToolbarAnchorServicePlusBehavior", "show pin card guide tooltip, strategyValue=2");
                    C1103240eoc.LIZIZ(c1103240eoc, l, C497740JfY.LJIJI(2131851240), EnumC1120860fH2.GOLIVE_GUIDE_SERVICE_PLUS_PIN_NOTICE);
                }
            }
        }
        return Unit.LIZ;
    }
}
