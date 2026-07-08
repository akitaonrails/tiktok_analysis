package X;

/* JADX INFO: renamed from: X.0i4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.visiblescope.SelectLiveVisibleFriendsDataSourceProtocol", f = "SelectLiveVisibleFriendsDataSourceProtocol.kt", l = {57}, m = "refreshMuf-IoAF18A")
public final class C1228290i4J extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1228280i4I LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228290i4J(C1228280i4I c1228280i4I, InterfaceC1364105Vn<? super C1228290i4J> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1228280i4I;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.refreshMuf$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJIZL = this.LLILLL.LJJJJIZL(this);
        if (objLJJJJIZL == C099R.LJFF()) {
            C1C7U.LIZIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.refreshMuf$1");
            return objLJJJJIZL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJJJJIZL);
        C1C7U.LIZIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.refreshMuf$1");
        return c189200o6M1boximpl;
    }
}
