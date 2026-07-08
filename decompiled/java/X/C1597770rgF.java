package X;

/* JADX INFO: renamed from: X.0rgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.platform.NoticeSkylightDataFetcher", f = "NoticeSkylightDataFetcher.kt", l = {108}, m = "fetchGrouped")
public final class C1597770rgF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1598680rhi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597770rgF(C1598680rhi c1598680rhi, InterfaceC1364105Vn<? super C1597770rgF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1598680rhi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoticeSkylightDataFetcher@a723.fetchGrouped$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("NoticeSkylightDataFetcher@a723.fetchGrouped$1");
        return objLIZLLL;
    }
}
