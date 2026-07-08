package X;

/* JADX INFO: renamed from: X.0Xsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.markconversationread.MarkConversationReadUseCase", f = "MarkConversationReadUseCase.kt", l = {59}, m = "markConversationRead-0E7RQCE")
public final class C862660Xsm extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C864350XvV LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862660Xsm(C864350XvV c864350XvV, InterfaceC1364105Vn<? super C862660Xsm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c864350XvV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MarkConversationReadUseCase@1841.markConversationRead$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("MarkConversationReadUseCase@1841.markConversationRead$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("MarkConversationReadUseCase@1841.markConversationRead$1");
        return c189200o6M1boximpl;
    }
}
