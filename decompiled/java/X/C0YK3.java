package X;

/* JADX INFO: renamed from: X.0YK3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {1547, 327, 1557, 335, 363, 378}, m = "processQueueAndNotify")
public final class C0YK3 extends AbstractC23140094w {
    public C0Y3I LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C872150YJh LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK3(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C0YK3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.processQueueAndNotify$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIJ = this.LLIZ.LJIJ(null, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.processQueueAndNotify$1");
        return objLJIJ;
    }
}
