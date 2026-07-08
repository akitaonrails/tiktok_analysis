package X;

/* JADX INFO: renamed from: X.0rhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightDataFactory", f = "SkylightDataFactory.kt", l = {143}, m = "triggerLoadMore")
public final class C1598380rhE extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1598340rhA LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598380rhE(C1598340rhA c1598340rhA, InterfaceC1364105Vn<? super C1598380rhE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1598340rhA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightDataFactory@bc3b.triggerLoadMore$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(this);
        C1C7U.LIZIZ("SkylightDataFactory@bc3b.triggerLoadMore$1");
        return objLJII;
    }
}
