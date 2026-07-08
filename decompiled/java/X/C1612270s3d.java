package X;

import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;

/* JADX INFO: renamed from: X.0s3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel", f = "SeriesDetailVideoListViewModel.kt", l = {973}, m = "loadVideoListExp")
public final class C1612270s3d extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SeriesDetailVideoListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612270s3d(SeriesDetailVideoListViewModel seriesDetailVideoListViewModel, InterfaceC1364105Vn<? super C1612270s3d> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = seriesDetailVideoListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.loadVideoListExp$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLILZ.HQ2(0, this);
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.loadVideoListExp$1");
        return objHQ2;
    }
}
