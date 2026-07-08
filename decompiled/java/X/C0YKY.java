package X;

import com.bytedance.im.core.proto.BatchAckMessageRequestBody;

/* JADX INFO: renamed from: X.0YKY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.ackmessage.MessageBatchAckUseCase", f = "MessageBatchAckUseCase.kt", l = {144}, m = "sendBatchAck")
public final class C0YKY extends AbstractC23140094w {
    public BatchAckMessageRequestBody LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0YKU LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YKY(C0YKU c0yku, InterfaceC1364105Vn<? super C0YKY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0yku;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageBatchAckUseCase@4aa.sendBatchAck$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(0, null, this);
        C1C7U.LIZIZ("MessageBatchAckUseCase@4aa.sendBatchAck$1");
        return objLJFF;
    }
}
