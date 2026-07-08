package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel$loadVideoListExp$8", f = "SeriesDetailVideoListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1612190s3V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC19852312lt<PaidCollectionDetailResponse> LL;
    public final /* synthetic */ SeriesDetailVideoListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612190s3V(AbstractC19852312lt<PaidCollectionDetailResponse> abstractC19852312lt, SeriesDetailVideoListViewModel seriesDetailVideoListViewModel, InterfaceC1364105Vn<? super C1612190s3V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC19852312lt;
        this.LLILLJJLI = seriesDetailVideoListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1612190s3V(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CollectionDetailModel collectionDetailModel;
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.loadVideoListExp$8");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PaidCollectionDetailResponse paidCollectionDetailResponseOrNull = this.LL.orNull();
        if (paidCollectionDetailResponseOrNull != null && (collectionDetailModel = paidCollectionDetailResponseOrNull.collectionDetail) != null) {
            this.LLILLJJLI.FQ2(collectionDetailModel);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.loadVideoListExp$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
