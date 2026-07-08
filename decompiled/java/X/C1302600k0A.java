package X;

/* JADX INFO: renamed from: X.0k0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession$CallControlScopeImpl", f = "CallSession.kt", l = {539}, m = "disconnect")
public final class C1302600k0A extends AbstractC23140094w {
    public C1302540k04 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1302540k04 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302600k0A(C1302540k04 c1302540k04, InterfaceC1364105Vn<? super C1302600k0A> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1302540k04;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.uL1(null, this);
    }
}
