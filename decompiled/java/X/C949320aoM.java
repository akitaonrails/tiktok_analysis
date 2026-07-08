package X;

/* JADX INFO: renamed from: X.0aoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.tiktok.kmp.live.socialgamebusiness.internal.DefaultStateMachine", f = "DefaultStateMachine.kt", l = {113, 85, 86}, m = "dispatch")
public final class C949320aoM extends AbstractC23140094w {
    public Object LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public C013C LLILZ;
    public C1DEV LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C949310aoL<Object, Object> LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C949320aoM(C949310aoL<Object, Object> c949310aoL, InterfaceC1364105Vn<? super C949320aoM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c949310aoL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStateMachine@d252.dispatch$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(null, this);
        C1C7U.LIZIZ("DefaultStateMachine@d252.dispatch$1");
        return objLIZIZ;
    }
}
