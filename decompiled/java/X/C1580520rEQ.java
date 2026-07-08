package X;

/* JADX INFO: renamed from: X.0rEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sidebar.data.SidebarRepository", f = "SidebarRepository.kt", l = {39}, m = "refreshSection")
public final class C1580520rEQ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1580480rEM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580520rEQ(C1580480rEM c1580480rEM, InterfaceC1364105Vn<? super C1580520rEQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1580480rEM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SidebarRepository@9a90.refreshSection$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("SidebarRepository@9a90.refreshSection$1");
        return objLIZIZ;
    }
}
