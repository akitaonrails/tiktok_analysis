package X;

import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ClK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel$manualListLoadMore$1", f = "PoiHeaderTopVideosSharedViewModel.kt", l = {329}, m = "invokeSuspend")
public final class C322960ClK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiHeaderTopVideosSharedViewModel LLILLJJLI;
    public final /* synthetic */ C1187410h0N LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322960ClK(PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel, C1187410h0N c1187410h0N, InterfaceC1364105Vn<? super C322960ClK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiHeaderTopVideosSharedViewModel;
        this.LLILLL = c1187410h0N;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322960ClK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiHeaderTopVideosSharedViewModel@aafc.manualListLoadMore$1");
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
            PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel = this.LLILLJJLI;
            C1187410h0N c1187410h0N = this.LLILLL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            AbstractC329610Cw3<C1187410h0N> config = poiHeaderTopVideosSharedViewModel.getConfig();
            if (c1187410h0N == null) {
                c1187410h0N = poiHeaderTopVideosSharedViewModel.LLJIJIL;
            }
            config.onLoadMore(c2252611DEt, c1187410h0N);
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("PoiHeaderTopVideosSharedViewModel@aafc.manualListLoadMore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiHeaderTopVideosSharedViewModel@aafc.manualListLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
