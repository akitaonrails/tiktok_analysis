package X;

/* JADX INFO: renamed from: X.0i1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.groupmanage.GroupMemberContentTabDataSourceProtocol", f = "GroupMemberContentTabDataSourceProtocol.kt", l = {125}, m = "onRefresh")
public final class C1226820i1w extends AbstractC23140094w {
    public C1226810i1v LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1226810i1v LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226820i1w(C1226810i1v c1226810i1v, InterfaceC1364105Vn<? super C1226820i1w> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1226810i1v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupMemberContentTabDataSourceProtocol@6249.onRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIL = this.LLILLL.LJJIL(this);
        C1C7U.LIZIZ("GroupMemberContentTabDataSourceProtocol@6249.onRefresh$1");
        return objLJJIL;
    }
}
