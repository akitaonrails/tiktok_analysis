package X;

/* JADX INFO: renamed from: X.0Y0V, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.session.SessionAwareConversationManager", f = "SessionAwareConversationManager.kt", l = {156}, m = "getConversationStatistic")
public final class C0Y0V extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y0K LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y0V(C0Y0K c0y0k, InterfaceC1364105Vn<? super C0Y0V> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y0k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionAwareConversationManager@172d.getConversationStatistic$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILLIIL = this.LLILLL.LJIILLIIL(this);
        C1C7U.LIZIZ("SessionAwareConversationManager@172d.getConversationStatistic$1");
        return objLJIILLIIL;
    }
}
