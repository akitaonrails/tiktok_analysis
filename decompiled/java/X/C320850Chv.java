package X;

/* JADX INFO: renamed from: X.0Chv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageOperatorHandler", f = "MessageOperatorHandler.kt", l = {120}, m = "waitReply")
public final class C320850Chv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C320830Cht LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320850Chv(C320830Cht c320830Cht, InterfaceC1364105Vn<? super C320850Chv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c320830Cht;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@3dad.waitReply$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIZILJ = this.LLILLJJLI.LJIIZILJ(null, this);
        C1C7U.LIZIZ("MessageOperatorHandler@3dad.waitReply$1");
        return objLJIIZILJ;
    }
}
