package X;

/* JADX INFO: renamed from: X.0k0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession", f = "CallSession.kt", l = {389}, m = "setInactive")
public final class C1302640k0E extends AbstractC23140094w {
    public C1302520k02 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1302520k02 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302640k0E(C1302520k02 c1302520k02, InterfaceC1364105Vn<? super C1302640k0E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1302520k02;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LJIILLIIL(this);
    }
}
