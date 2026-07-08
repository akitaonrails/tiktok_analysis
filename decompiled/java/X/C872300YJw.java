package X;

/* JADX INFO: renamed from: X.0YJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {927, 1547, 1019, 1096}, m = "processNewMsgNotify")
public final class C872300YJw extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public long LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C872150YJh LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872300YJw(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C872300YJw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.processNewMsgNotify$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJIIZILJ = this.LLJIJIL.LJIIZILJ(null, null, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.processNewMsgNotify$1");
        return objLJIIZILJ;
    }
}
