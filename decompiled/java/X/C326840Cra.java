package X;

import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel$extendFoldedList$1", f = "PoiReviewsListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C326840Cra extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiReviewsListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326840Cra(PoiReviewsListViewModel poiReviewsListViewModel, InterfaceC1364105Vn<? super C326840Cra> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiReviewsListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326840Cra(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiReviewsListViewModel@e0d9.extendFoldedList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PoiReviewsListViewModel poiReviewsListViewModel = this.LL;
        poiReviewsListViewModel.manualListLoadMore(C2286608xc.LJFF(poiReviewsListViewModel.LLJJJJ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.extendFoldedList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
