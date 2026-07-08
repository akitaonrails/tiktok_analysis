package X;

/* JADX INFO: renamed from: X.0Y0L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.session.SessionAwareConversationManager", f = "SessionAwareConversationManager.kt", l = {148}, m = "countConversations")
public final class C0Y0L extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y0K LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y0L(C0Y0K c0y0k, InterfaceC1364105Vn<? super C0Y0L> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y0k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionAwareConversationManager@172d.countConversations$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIJJ = this.LLILLL.LJIJJ(null, this);
        C1C7U.LIZIZ("SessionAwareConversationManager@172d.countConversations$1");
        return objLJIJJ;
    }
}
