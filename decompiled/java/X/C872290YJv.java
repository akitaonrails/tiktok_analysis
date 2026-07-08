package X;

/* JADX INFO: renamed from: X.0YJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {664}, m = "batchHandleNormalMessageBody")
public final class C872290YJv extends AbstractC23140094w {
    public Object LL;
    public C0YKD LLILLJJLI;
    public C0YFV LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C872150YJh LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872290YJv(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C872290YJv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.batchHandleNormalMessageBody$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLJI.LIZLLL(null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.batchHandleNormalMessageBody$1");
        return objLIZLLL;
    }
}
