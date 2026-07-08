package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733890vDn extends C09AY implements Function2<BoardItem, C07XT, Unit> {
    public final /* synthetic */ BoardsDisplayView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733890vDn(BoardsDisplayView boardsDisplayView) {
        super(2);
        this.LL = boardsDisplayView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BoardItem boardItem, C07XT c07xt) {
        String message;
        BoardItem boardItem2 = boardItem;
        C07XT c07xt2 = c07xt;
        if (c07xt2 instanceof C07XS) {
            this.LL.getViewModel().vQ2(((C07XS) c07xt2).LIZ, this.LL.getContext());
        } else if (c07xt2 instanceof C07XK) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("native pre-render failed itemId=");
            sbLIZ.append(boardItem2.id);
            C07XK c07xk = (C07XK) c07xt2;
            C20441214yg.LJIILIIL("BoardsDisplayView", C2188811AlT.LIZIZ(sbLIZ), c07xk.LIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("batch pre-render failed itemId=");
            sbLIZ2.append(boardItem2.id);
            sbLIZ2.append(" type=");
            sbLIZ2.append(boardItem2.boardItemType);
            sbLIZ2.append(": ");
            Throwable th = c07xk.LIZ;
            if (th != null) {
                message = th.getMessage();
            } else {
                message = null;
            }
            sbLIZ2.append(message);
            C470401sM.LIZIZ(-5003, 5, C2188811AlT.LIZIZ(sbLIZ2));
        } else if (c07xt2 instanceof C1879807Xw) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("native pre-render timeout itemId=");
            sbLIZ3.append(boardItem2.id);
            C20441214yg.LJIIL("BoardsDisplayView", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("batch pre-render timeout itemId=");
            sbLIZ4.append(boardItem2.id);
            sbLIZ4.append(" type=");
            sbLIZ4.append(boardItem2.boardItemType);
            C470401sM.LIZIZ(-5004, 5, C2188811AlT.LIZIZ(sbLIZ4));
        } else if (!(c07xt2 instanceof C07XU)) {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
