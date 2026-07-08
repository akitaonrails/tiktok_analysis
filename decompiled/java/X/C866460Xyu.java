package X;

/* JADX INFO: renamed from: X.0Xyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager", f = "DefaultConversationManager.kt", l = {389, 347}, m = "dissolveConversation")
public final class C866460Xyu extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C866340Xyi LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866460Xyu(InterfaceC1364105Vn interfaceC1364105Vn, C866340Xyi c866340Xyi) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c866340Xyi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationManager@5d7d.dissolveConversation$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, false, this);
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.dissolveConversation$1");
        return objLIZLLL;
    }
}
