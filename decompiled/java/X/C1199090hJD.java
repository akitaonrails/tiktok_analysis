package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0hJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM$sendRequest$2", f = "PoiSearchVM.kt", l = {618}, m = "invokeSuspend")
public final class C1199090hJD extends C09AX implements Function1<InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public int LL;
    public final /* synthetic */ PoiSearchVM LLILLJJLI;
    public final /* synthetic */ C1199140hJI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199090hJD(PoiSearchVM poiSearchVM, C1199140hJI c1199140hJI, InterfaceC1364105Vn<? super C1199090hJD> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = poiSearchVM;
        this.LLILLL = c1199140hJI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1199090hJD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiSearchVM@b8c3.sendRequest$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            PoiSearchVM poiSearchVM = this.LLILLJJLI;
            C1199140hJI c1199140hJI = this.LLILLL;
            Long l = poiSearchVM.LLJILJILJ;
            boolean zFQ2 = poiSearchVM.FQ2();
            this.LL = 1;
            obj = PoiSearchVM.DQ2(c1199140hJI, l, zFQ2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiSearchVM@b8c3.sendRequest$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PoiSearchVM@b8c3.sendRequest$2");
        return obj;
    }
}
