package X;

/* JADX INFO: renamed from: X.0Xso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.markconversationread.MarkConversationReadUseCase", f = "MarkConversationReadUseCase.kt", l = {306}, m = "sendNetworkRequest")
public final class C862680Xso extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C864350XvV LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862680Xso(C864350XvV c864350XvV, InterfaceC1364105Vn<? super C862680Xso> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c864350XvV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MarkConversationReadUseCase@1841.sendNetworkRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(null, this);
        C1C7U.LIZIZ("MarkConversationReadUseCase@1841.sendNetworkRequest$1");
        return objLJ;
    }
}
