package X;

/* JADX INFO: renamed from: X.0YKA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {1268}, m = "recordErrorCursorOrSkip")
public final class C0YKA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C872150YJh LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YKA(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C0YKA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.recordErrorCursorOrSkip$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIJI = this.LLILLJJLI.LJIJI(0L, 0L, null, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.recordErrorCursorOrSkip$1");
        return objLJIJI;
    }
}
