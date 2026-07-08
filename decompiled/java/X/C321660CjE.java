package X;

/* JADX INFO: renamed from: X.0CjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler", f = "MessageOperatorHandler.kt", l = {597}, m = "waitReply")
public final class C321660CjE extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1863280yaU LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321660CjE(C1863280yaU c1863280yaU, InterfaceC1364105Vn<? super C321660CjE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1863280yaU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.waitReply$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJLIIIJLJLI = this.LLILLJJLI.LJJLIIIJLJLI(null, this);
        C1C7U.LIZIZ("MessageOperatorHandler@b589.waitReply$1");
        return objLJJLIIIJLJLI;
    }
}
