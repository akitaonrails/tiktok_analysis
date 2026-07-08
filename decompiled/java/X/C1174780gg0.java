package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM$handleCategoryTabSelected$2", f = "PoiMapModePageVM.kt", l = {183}, m = "invokeSuspend")
public final class C1174780gg0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiMapModePageVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174780gg0(PoiMapModePageVM poiMapModePageVM, InterfaceC1364105Vn<? super C1174780gg0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiMapModePageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1174780gg0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        String string2;
        PoiMapModeTargetData targetPoiData;
        PoiLocation poiLocation;
        Double d;
        PoiMapModeTargetData targetPoiData2;
        PoiLocation poiLocation2;
        Double d2;
        C1C7U.LIZ("PoiMapModePageVM@49e4.handleCategoryTabSelected$2");
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
            EnumC1174760gfy enumC1174760gfy = EnumC1174760gfy.YMAL;
            PoiMapModeDataParams poiMapModeDataParams = poiMapModePageVM.LLILZIL;
            if (poiMapModeDataParams != null && (targetPoiData2 = poiMapModeDataParams.getTargetPoiData()) != null && (poiLocation2 = targetPoiData2.targetPoiLocation) != null && (d2 = poiLocation2.lat) != null) {
                string = d2.toString();
            } else {
                string = null;
            }
            PoiMapModeDataParams poiMapModeDataParams2 = this.LLILLJJLI.LLILZIL;
            if (poiMapModeDataParams2 != null && (targetPoiData = poiMapModeDataParams2.getTargetPoiData()) != null && (poiLocation = targetPoiData.targetPoiLocation) != null && (d = poiLocation.lng) != null) {
                string2 = d.toString();
            } else {
                string2 = null;
            }
            C1174650gfn c1174650gfn = new C1174650gfn(enumC1174760gfy, null, new C1174800gg2(string2, string));
            this.LL = 1;
            if (poiMapModePageVM.zQ2(c1174650gfn, false, this) == objLJFF) {
                C1C7U.LIZIZ("PoiMapModePageVM@49e4.handleCategoryTabSelected$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapModePageVM@49e4.handleCategoryTabSelected$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
