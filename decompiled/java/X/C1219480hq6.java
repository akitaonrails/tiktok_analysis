package X;

import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;

/* JADX INFO: renamed from: X.0hq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel", f = "AuditRequestListViewModel.kt", l = {130, 140}, m = "onLoadMore")
public final class C1219480hq6 extends AbstractC23140094w {
    public C099F LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AuditRequestListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219480hq6(AuditRequestListViewModel auditRequestListViewModel, InterfaceC1364105Vn<? super C1219480hq6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = auditRequestListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuditRequestListViewModel@a39e.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0L, this);
        C1C7U.LIZIZ("AuditRequestListViewModel@a39e.onLoadMore$1");
        return objOnLoadMore;
    }
}
