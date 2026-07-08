package X;

/* JADX INFO: renamed from: X.0wec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.init.InitChannelAction", f = "InitChannelAction.kt", l = {23}, m = "perform")
public final class C1788960wec extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1788950web LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788960wec(C1788950web c1788950web, InterfaceC1364105Vn<? super C1788960wec> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1788950web;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InitChannelAction@a20c.perform$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("InitChannelAction@a20c.perform$1");
        return objLIZIZ;
    }
}
