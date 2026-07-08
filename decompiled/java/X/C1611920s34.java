package X;

import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;

/* JADX INFO: renamed from: X.0s34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel", f = "SeriesInnerFeedViewModel.kt", l = {1062, 1072, 1081, 1093}, m = "requestDataPagination")
public final class C1611920s34 extends AbstractC23140094w {
    public boolean LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ SeriesInnerFeedViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611920s34(SeriesInnerFeedViewModel seriesInnerFeedViewModel, InterfaceC1364105Vn<? super C1611920s34> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = seriesInnerFeedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesInnerFeedViewModel@ef4a.requestDataPagination$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLQ2 = this.LLILZLL.LQ2(false, 0, false, this);
        C1C7U.LIZIZ("SeriesInnerFeedViewModel@ef4a.requestDataPagination$1");
        return objLQ2;
    }
}
