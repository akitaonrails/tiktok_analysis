package X;

/* JADX INFO: renamed from: X.0i1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.selectgroup.IMGroupListDataSourceProtocol", f = "IMGroupListDataSourceProtocol.kt", l = {53}, m = "loadPage")
public final class C1226420i1I extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC1226410i1H LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226420i1I(AbstractC1226410i1H abstractC1226410i1H, InterfaceC1364105Vn<? super C1226420i1I> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = abstractC1226410i1H;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMGroupListDataSourceProtocol@54ed.loadPage$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJJ = this.LLILLL.LJJJJJ(0L, this);
        C1C7U.LIZIZ("IMGroupListDataSourceProtocol@54ed.loadPage$1");
        return objLJJJJJ;
    }
}
