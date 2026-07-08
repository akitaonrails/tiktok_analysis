package X;

/* JADX INFO: renamed from: X.0YO5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.statusmessages.DefaultStatusMessagesReceivingCompletenessUseCase", f = "DefaultStatusMessagesReceivingCompletenessUseCase.kt", l = {80}, m = "checkStatusMessagesInternal-bMdYcbs")
public final class C0YO5 extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public Object LLILZIL;
    public C0YFV LLILZLL;
    public C238400w2 LLIZ;
    public Object LLIZLLLIL;
    public C013C LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C0YO4 LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YO5(C0YO4 c0yo4, InterfaceC1364105Vn<? super C0YO5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = c0yo4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStatusMessagesReceivingCompletenessUseCase@20f5.checkStatusMessagesInternal$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLJIJIL.LIZIZ(0, 0L, 0L, 0, null, null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("DefaultStatusMessagesReceivingCompletenessUseCase@20f5.checkStatusMessagesInternal$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("DefaultStatusMessagesReceivingCompletenessUseCase@20f5.checkStatusMessagesInternal$1");
        return c189200o6M1boximpl;
    }
}
