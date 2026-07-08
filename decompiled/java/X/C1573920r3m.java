package X;

import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;

/* JADX INFO: renamed from: X.0r3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel", f = "SeriesListAssemViewModel.kt", l = {115}, m = "requestDataWithPagination")
public final class C1573920r3m extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeriesListAssemViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573920r3m(SeriesListAssemViewModel seriesListAssemViewModel, InterfaceC1364105Vn<? super C1573920r3m> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = seriesListAssemViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesListAssemViewModel@f8d6.requestDataWithPagination$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLL.zQ2(0, 0L, 0L, this);
        C1C7U.LIZIZ("SeriesListAssemViewModel@f8d6.requestDataWithPagination$1");
        return objZQ2;
    }
}
