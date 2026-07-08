package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733930vDr extends C09AY implements Function1<C443120HZe<? extends Board, ? extends String, ? extends Integer>, Unit> {
    public final /* synthetic */ BoardsDisplayView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733930vDr(BoardsDisplayView boardsDisplayView) {
        super(1);
        this.LL = boardsDisplayView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C443120HZe<? extends Board, ? extends String, ? extends Integer> c443120HZe) {
        C443120HZe<? extends Board, ? extends String, ? extends Integer> c443120HZe2 = c443120HZe;
        this.LL.getViewModel().wQ2(c443120HZe2.getFirst(), c443120HZe2.getSecond(), c443120HZe2.getThird().intValue());
        return Unit.LIZ;
    }
}
