package X;

import com.ss.android.ugc.aweme.music.vm.ReportListViewModel;

/* JADX INFO: renamed from: X.0OrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.ReportListViewModel", f = "ReportListViewModel.kt", l = {109, 109}, m = "sendRequest")
public final class C632580OrY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ReportListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632580OrY(ReportListViewModel reportListViewModel, InterfaceC1364105Vn<? super C632580OrY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = reportListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportListViewModel@12f0.sendRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(null, this);
        C1C7U.LIZIZ("ReportListViewModel@12f0.sendRequest$1");
        return objVQ2;
    }
}
