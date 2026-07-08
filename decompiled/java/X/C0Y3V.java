package X;

/* JADX INFO: renamed from: X.0Y3V, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase", f = "RecallMsgUseCase.kt", l = {228}, m = "markRecalledKeepContent")
public final class C0Y3V extends AbstractC23140094w {
    public C869590Y9l LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y3S LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y3V(C0Y3S c0y3s, InterfaceC1364105Vn<? super C0Y3V> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y3s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecallMsgUseCase@ca4d.markRecalledKeepContent$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, null, this);
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.markRecalledKeepContent$1");
        return objLIZJ;
    }
}
