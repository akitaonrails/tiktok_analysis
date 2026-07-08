package X;

/* JADX INFO: renamed from: X.0YK5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {1547, 233, 1557, 245, 1567, 262, 1577, 273}, m = "consumeEvent")
public final class C0YK5 extends AbstractC23140094w {
    public C0YKN LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C872150YJh LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK5(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C0YK5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.consumeEvent$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.consumeEvent$1");
        return objLJFF;
    }
}
