package X;

import Y.AgS295S0100000_14;

/* JADX INFO: renamed from: X.0Yx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.StarActionKt$updateIsStarred$1$invokeSuspend$$inlined$map$1$2", f = "StarAction.kt", l = {223}, m = "emit")
public final class C890810Yx5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS295S0100000_14 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C890810Yx5(AgS295S0100000_14 agS295S0100000_14, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS295S0100000_14;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return this.LLILLL.emit(null, this);
    }
}
