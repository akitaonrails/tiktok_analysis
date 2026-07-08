package X;

/* JADX INFO: renamed from: X.0Y3T, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase", f = "RecallMsgUseCase.kt", l = {171, 205, 207}, m = "recallSentMessage-gIAlu-s")
public final class C0Y3T extends AbstractC23140094w {
    public C869590Y9l LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0Y3S LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y3T(C0Y3S c0y3s, InterfaceC1364105Vn<? super C0Y3T> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0y3s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecallMsgUseCase@ca4d.recallSentMessage$5");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZIL.LJI(null, this);
        if (objLJI == C099R.LJFF()) {
            C1C7U.LIZIZ("RecallMsgUseCase@ca4d.recallSentMessage$5");
            return objLJI;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJI);
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.recallSentMessage$5");
        return c189200o6M1boximpl;
    }
}
