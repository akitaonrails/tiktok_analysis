package X;

/* JADX INFO: renamed from: X.0rha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListWithLoadMoreRepo", f = "SkylightListWithLoadMoreRepo.kt", l = {271, 279}, m = "requestGetFeedByPage")
public final class C1598600rha extends AbstractC23140094w {
    public C1598490rhP LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1598550rhV LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598600rha(C1598550rhV c1598550rhV, InterfaceC1364105Vn<? super C1598600rha> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1598550rhV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightListWithLoadMoreRepo@5471.requestGetFeedByPage$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("SkylightListWithLoadMoreRepo@5471.requestGetFeedByPage$1");
        return objLIZJ;
    }
}
