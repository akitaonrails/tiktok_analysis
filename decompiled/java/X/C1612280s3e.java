package X;

import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;

/* JADX INFO: renamed from: X.0s3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel", f = "SeriesDetailVideoListViewModel.kt", l = {860}, m = "requestDataPaginationExp")
public final class C1612280s3e extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeriesDetailVideoListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612280s3e(SeriesDetailVideoListViewModel seriesDetailVideoListViewModel, InterfaceC1364105Vn<? super C1612280s3e> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = seriesDetailVideoListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.requestDataPaginationExp$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objJQ2 = this.LLILLL.JQ2(0, this);
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.requestDataPaginationExp$1");
        return objJQ2;
    }
}
