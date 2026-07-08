package X;

/* JADX INFO: renamed from: X.0i24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.visiblescope.SelectLiveVisibleGroupsDataSourceProtocol", f = "SelectLiveVisibleGroupsDataSourceProtocol.kt", l = {96}, m = "onRefresh")
public final class C1226900i24 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1226870i21 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226900i24(C1226870i21 c1226870i21, InterfaceC1364105Vn<? super C1226900i24> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1226870i21;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectLiveVisibleGroupsDataSourceProtocol@c32e.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIL = this.LLILLJJLI.LJJIL(this);
        C1C7U.LIZIZ("SelectLiveVisibleGroupsDataSourceProtocol@c32e.onRefresh$1");
        return objLJJIL;
    }
}
