package X;

/* JADX INFO: renamed from: X.0Xxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationKvManager", f = "DefaultConversationKvManager.kt", l = {127}, m = "upsert")
public final class C865790Xxp extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C865770Xxn LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865790Xxp(C865770Xxn c865770Xxn, InterfaceC1364105Vn<? super C865790Xxp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c865770Xxn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationKvManager@9ea8.upsert$3");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZLL.LIZJ(null, null, this);
        C1C7U.LIZIZ("DefaultConversationKvManager@9ea8.upsert$3");
        return objLIZJ;
    }
}
