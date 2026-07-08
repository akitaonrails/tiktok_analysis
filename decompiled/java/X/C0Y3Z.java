package X;

/* JADX INFO: renamed from: X.0Y3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase", f = "RecallMsgUseCase.kt", l = {293}, m = "permanentlyClearRecalledContent$core_release")
public final class C0Y3Z extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y3S LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y3Z(C0Y3S c0y3s, InterfaceC1364105Vn<? super C0Y3Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y3s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecallMsgUseCase@ca4d.permanentlyClearRecalledContent$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.permanentlyClearRecalledContent$1");
        return objLIZLLL;
    }
}
