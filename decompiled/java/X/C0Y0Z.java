package X;

/* JADX INFO: renamed from: X.0Y0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.session.SessionAwareConversationManager", f = "SessionAwareConversationManager.kt", l = {185}, m = "saveDraft")
public final class C0Y0Z extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y0K LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y0Z(C0Y0K c0y0k, InterfaceC1364105Vn<? super C0Y0Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0y0k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionAwareConversationManager@172d.saveDraft$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLL.LJIIIIZZ(null, null, this);
        C1C7U.LIZIZ("SessionAwareConversationManager@172d.saveDraft$1");
        return objLJIIIIZZ;
    }
}
