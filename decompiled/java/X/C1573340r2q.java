package X;

import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenteSubPageAssemViewModel;

/* JADX INFO: renamed from: X.0r2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenteSubPageAssemViewModel", f = "SeriesCenteSubPageAssemViewModel.kt", l = {327, 336}, m = "requestDataWithPagination")
public final class C1573340r2q extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SeriesCenteSubPageAssemViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573340r2q(SeriesCenteSubPageAssemViewModel seriesCenteSubPageAssemViewModel, InterfaceC1364105Vn<? super C1573340r2q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = seriesCenteSubPageAssemViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesCenteSubPageAssemViewModel@54be.requestDataWithPagination$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZIL.xQ2(null, false, this);
        C1C7U.LIZIZ("SeriesCenteSubPageAssemViewModel@54be.requestDataWithPagination$1");
        return objXQ2;
    }
}
