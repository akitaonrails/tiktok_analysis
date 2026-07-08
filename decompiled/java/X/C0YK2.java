package X;

/* JADX INFO: renamed from: X.0YK2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {801, 1547}, m = "onProcessingAllPagesEnd")
public final class C0YK2 extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C872150YJh LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK2(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C0YK2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.onProcessingAllPagesEnd$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILZIL.LJIIL(0, null, null, false, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.onProcessingAllPagesEnd$1");
        return objLJIIL;
    }
}
