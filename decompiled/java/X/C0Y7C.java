package X;

import com.bytedance.im.core.proto.MessageBody;

/* JADX INFO: renamed from: X.0Y7C, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.processmessage.ProcessMessageBodyUseCase", f = "ProcessMessageBodyUseCase.kt", l = {526, 556}, m = "saveNormalMsgListAndNotify")
public final class C0Y7C extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C0Y82 LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public MessageBody LLJ;
    public int LLJI;
    public int LLJIJIL;
    public long LLJILJIL;
    public /* synthetic */ Object LLJILJILJ;
    public final /* synthetic */ C0Y77 LLJILLL;
    public int LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y7C(C0Y77 c0y77, InterfaceC1364105Vn<? super C0Y7C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJILLL = c0y77;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ProcessMessageBodyUseCase@da90.saveNormalMsgListAndNotify$1");
        this.LLJILJILJ = obj;
        this.LLJJ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLJILLL.LIZLLL(null, null, 0, null, null, 0L, 0, null, null, this);
        C1C7U.LIZIZ("ProcessMessageBodyUseCase@da90.saveNormalMsgListAndNotify$1");
        return objLIZLLL;
    }
}
