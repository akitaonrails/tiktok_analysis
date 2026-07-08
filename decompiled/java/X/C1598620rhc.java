package X;

/* JADX INFO: renamed from: X.0rhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListWithLoadMoreRepo", f = "SkylightListWithLoadMoreRepo.kt", l = {127}, m = "requestMixRankSkylightInternally")
public final class C1598620rhc extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1598550rhV LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598620rhc(C1598550rhV c1598550rhV, InterfaceC1364105Vn<? super C1598620rhc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1598550rhV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightListWithLoadMoreRepo@5471.requestMixRankSkylightInternally$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, false, false, false, this);
        C1C7U.LIZIZ("SkylightListWithLoadMoreRepo@5471.requestMixRankSkylightInternally$1");
        return objLJ;
    }
}
