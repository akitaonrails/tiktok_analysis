package X;

/* JADX INFO: renamed from: X.0Xz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager", f = "DefaultConversationManager.kt", l = {389, 106}, m = "createSingleConversation")
public final class C866520Xz0 extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C866340Xyi LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866520Xz0(InterfaceC1364105Vn interfaceC1364105Vn, C866340Xyi c866340Xyi) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c866340Xyi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationManager@5d7d.createSingleConversation$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILZLL.LJIIJ(0, 0L, this);
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.createSingleConversation$1");
        return objLJIIJ;
    }
}
