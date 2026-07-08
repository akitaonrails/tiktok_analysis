package X;

/* JADX INFO: renamed from: X.0YJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {1547, 1555}, m = "setUserCursorAndCleanupPendingRetries")
public final class C872270YJt extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public C0YFV LLILLL;
    public InterfaceC383701eN LLILZ;
    public C238400w2 LLILZIL;
    public C0YKK LLILZLL;
    public C1DEV LLIZ;
    public boolean LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C872150YJh LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872270YJt(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C872270YJt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.setUserCursorAndCleanupPendingRetries$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLJIJJLI = this.LLJI.LJIJJLI(0L, null, false, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.setUserCursorAndCleanupPendingRetries$1");
        return objLJIJJLI;
    }
}
