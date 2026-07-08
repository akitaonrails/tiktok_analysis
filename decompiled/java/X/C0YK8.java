package X;

/* JADX INFO: renamed from: X.0YK8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {1547}, m = "handleRetryBufferFull")
public final class C0YK8 extends AbstractC23140094w {
    public C1DEV LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C872150YJh LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK8(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C0YK8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.handleRetryBufferFull$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.handleRetryBufferFull$1");
        return objLJII;
    }
}
