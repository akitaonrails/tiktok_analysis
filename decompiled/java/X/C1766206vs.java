package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1766206vs extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ BoardsDisplayView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1766206vs(BoardsDisplayView boardsDisplayView) {
        super(1);
        this.LL = boardsDisplayView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        c062p2.LIZ = new C291301Ax(null, this.LL.getDataChannel(), 5);
        c062p2.LIZIZ = "intelligent_save_data";
        return Unit.LIZ;
    }
}
