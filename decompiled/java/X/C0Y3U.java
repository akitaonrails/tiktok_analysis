package X;

/* JADX INFO: renamed from: X.0Y3U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase", f = "RecallMsgUseCase.kt", l = {92, 101, 116}, m = "recallSentMessage")
public final class C0Y3U extends AbstractC23140094w {
    public C869590Y9l LL;
    public InterfaceC863600XuI LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0Y3S LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y3U(C0Y3S c0y3s, InterfaceC1364105Vn<? super C0Y3U> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0y3s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecallMsgUseCase@ca4d.recallSentMessage$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, null, this);
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.recallSentMessage$1");
        return objLJFF;
    }
}
