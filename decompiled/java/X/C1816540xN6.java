package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xN6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816540xN6 extends C09AY implements Function1<AbstractC1817030xNt, Unit> {
    public final /* synthetic */ Function1<InterfaceC395901gL, Unit> LL;
    public final /* synthetic */ BoardsDisplayView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816540xN6(C1733900vDo c1733900vDo, BoardsDisplayView boardsDisplayView) {
        super(1);
        this.LL = c1733900vDo;
        this.LLILLJJLI = boardsDisplayView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1817030xNt abstractC1817030xNt) {
        AbstractC1817030xNt abstractC1817030xNt2 = abstractC1817030xNt;
        Function1<InterfaceC395901gL, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(abstractC1817030xNt2);
        } else {
            this.LLILLJJLI.getViewModel().vQ2(abstractC1817030xNt2, this.LLILLJJLI.getContext());
        }
        return Unit.LIZ;
    }
}
