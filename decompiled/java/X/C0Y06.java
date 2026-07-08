package X;

/* JADX INFO: renamed from: X.0Y06, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationExtensionManager", f = "DefaultConversationExtensionManager.kt", l = {193}, m = "getCorePersistentExtDecoded")
public final class C0Y06 extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0Y01 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y06(C0Y01 c0y01, InterfaceC1364105Vn<? super C0Y06> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0y01;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationExtensionManager@ecdd.getCorePersistentExtDecoded$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.getCorePersistentExtDecoded$1");
        return objLIZLLL;
    }
}
