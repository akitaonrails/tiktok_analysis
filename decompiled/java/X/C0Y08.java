package X;

/* JADX INFO: renamed from: X.0Y08, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationExtensionManager", f = "DefaultConversationExtensionManager.kt", l = {193, 63}, m = "putLocalExt")
public final class C0Y08 extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0Y01 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y08(C0Y01 c0y01, InterfaceC1364105Vn<? super C0Y08> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0y01;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationExtensionManager@ecdd.putLocalExt$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.putLocalExt$1");
        return objLIZIZ;
    }
}
