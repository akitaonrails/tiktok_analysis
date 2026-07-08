package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView", f = "BoardsDisplayView.kt", l = {530}, m = "awaitBatchInOrder")
public final class C1733910vDp extends AbstractC23140094w {
    public Object LL;
    public Function2 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BoardsDisplayView LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733910vDp(BoardsDisplayView boardsDisplayView, InterfaceC1364105Vn<? super C1733910vDp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = boardsDisplayView;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardsDisplayView@e00c.awaitBatchInOrder$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, this, null);
        C1C7U.LIZIZ("BoardsDisplayView@e00c.awaitBatchInOrder$1");
        return objLIZIZ;
    }
}
