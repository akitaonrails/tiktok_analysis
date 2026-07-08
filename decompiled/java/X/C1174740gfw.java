package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM$handleCategoryTabSelected$5", f = "PoiMapModePageVM.kt", l = {220}, m = "invokeSuspend")
public final class C1174740gfw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiMapModePageVM LLILLJJLI;
    public final /* synthetic */ PoiLandmark LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174740gfw(PoiMapModePageVM poiMapModePageVM, PoiLandmark poiLandmark, InterfaceC1364105Vn<? super C1174740gfw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiMapModePageVM;
        this.LLILLL = poiLandmark;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1174740gfw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapModePageVM@49e4.handleCategoryTabSelected$5");
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
            PoiMapModePageVM poiMapModePageVM = this.LLILLJJLI;
            C1174650gfn c1174650gfn = new C1174650gfn(EnumC1174760gfy.LANDMARK_FILTER, null, new C1174800gg2(String.valueOf(C1175120ggY.LIZ(this.LLILLL.getLongitude())), String.valueOf(C1175120ggY.LIZ(this.LLILLL.getLatitude()))));
            this.LL = 1;
            if (poiMapModePageVM.zQ2(c1174650gfn, true, this) == objLJFF) {
                C1C7U.LIZIZ("PoiMapModePageVM@49e4.handleCategoryTabSelected$5");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapModePageVM@49e4.handleCategoryTabSelected$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
