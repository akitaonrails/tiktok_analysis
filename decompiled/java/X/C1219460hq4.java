package X;

import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody;

/* JADX INFO: renamed from: X.0hq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel", f = "AuditRequestListViewModel.kt", l = {156, 161}, m = "convertAuditListResult")
public final class C1219460hq4 extends AbstractC23140094w {
    public GetAuditListResponseBody LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AuditRequestListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219460hq4(AuditRequestListViewModel auditRequestListViewModel, InterfaceC1364105Vn<? super C1219460hq4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = auditRequestListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuditRequestListViewModel@a39e.convertAuditListResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(null, this);
        C1C7U.LIZIZ("AuditRequestListViewModel@a39e.convertAuditListResult$1");
        return objYQ2;
    }
}
