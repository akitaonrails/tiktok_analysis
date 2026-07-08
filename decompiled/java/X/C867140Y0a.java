package X;

/* JADX INFO: renamed from: X.0Y0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.session.SessionAwareConversationManager", f = "SessionAwareConversationManager.kt", l = {114}, m = "createSingleConversation")
public final class C867140Y0a extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y0K LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C867140Y0a(C0Y0K c0y0k, InterfaceC1364105Vn<? super C867140Y0a> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y0k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionAwareConversationManager@172d.createSingleConversation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(0, 0L, this);
        C1C7U.LIZIZ("SessionAwareConversationManager@172d.createSingleConversation$1");
        return objLJIIJ;
    }
}
