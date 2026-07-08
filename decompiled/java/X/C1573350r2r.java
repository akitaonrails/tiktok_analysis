package X;

import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenteSubPageAssemViewModel;

/* JADX INFO: renamed from: X.0r2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenteSubPageAssemViewModel", f = "SeriesCenteSubPageAssemViewModel.kt", l = {297, 309}, m = "requestRefreshData")
public final class C1573350r2r extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeriesCenteSubPageAssemViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573350r2r(SeriesCenteSubPageAssemViewModel seriesCenteSubPageAssemViewModel, InterfaceC1364105Vn<? super C1573350r2r> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = seriesCenteSubPageAssemViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesCenteSubPageAssemViewModel@54be.requestRefreshData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(null, this);
        C1C7U.LIZIZ("SeriesCenteSubPageAssemViewModel@54be.requestRefreshData$1");
        return objYQ2;
    }
}
