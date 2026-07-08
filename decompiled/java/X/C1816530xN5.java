package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816530xN5 extends C09AY implements Function1<AbstractC1817020xNs, Unit> {
    public final /* synthetic */ BoardItem LL;
    public final /* synthetic */ Function1<InterfaceC395901gL, Unit> LLILLJJLI;
    public final /* synthetic */ BoardsDisplayView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1816530xN5(BoardItem boardItem, Function1<? super InterfaceC395901gL, Unit> function1, BoardsDisplayView boardsDisplayView) {
        super(1);
        this.LL = boardItem;
        this.LLILLJJLI = function1;
        this.LLILLL = boardsDisplayView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1817020xNs abstractC1817020xNs) {
        AbstractC1817020xNs abstractC1817020xNs2 = abstractC1817020xNs;
        abstractC1817020xNs2.getConfig().LJJIIJZLJL = this.LL.fullyCustomizedContent;
        Function1<InterfaceC395901gL, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(abstractC1817020xNs2);
        } else {
            this.LLILLL.getViewModel().vQ2(abstractC1817020xNs2, this.LLILLL.getContext());
        }
        return Unit.LIZ;
    }
}
