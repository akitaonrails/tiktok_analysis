package X;

/* JADX INFO: renamed from: X.1D7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {372, 379, 382}, m = "collect$suspendImpl")
public final class C2250741D7o<T> extends AbstractC23140094w {
    public C2252331DDr LL;
    public InterfaceC346701Wf LLILLJJLI;
    public C2252381DDw LLILLL;
    public C09AE LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C2252331DDr<T> LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250741D7o(C2252331DDr<T> c2252331DDr, InterfaceC1364105Vn<? super C2250741D7o> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c2252331DDr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        return C2252331DDr.LJIIJ(this.LLILZLL, null, this);
    }
}
