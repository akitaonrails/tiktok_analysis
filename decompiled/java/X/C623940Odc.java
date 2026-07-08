package X;

import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel;

/* JADX INFO: renamed from: X.0Odc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel", f = "WorkBenchCardListViewModel.kt", l = {149}, m = "onRefresh")
public final class C623940Odc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ WorkBenchCardListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623940Odc(WorkBenchCardListViewModel workBenchCardListViewModel, InterfaceC1364105Vn<? super C623940Odc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = workBenchCardListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkBenchCardListViewModel@b0a3.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("WorkBenchCardListViewModel@b0a3.onRefresh$1");
        return objOnRefresh;
    }
}
