package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeMapVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeMapVM$fetchDataFromFindPlaceNearby$1", f = "PoiMapModeMapVM.kt", l = {51}, m = "invokeSuspend")
public final class C1174510gfZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PoiMapModeMapVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174510gfZ(PoiMapModeMapVM poiMapModeMapVM, InterfaceC1364105Vn<? super C1174510gfZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = poiMapModeMapVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1174510gfZ c1174510gfZ = new C1174510gfZ(this.LLILLL, interfaceC1364105Vn);
        c1174510gfZ.LLILLJJLI = obj;
        return c1174510gfZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1174570gff enumC1174570gff;
        C1174480gfW c1174480gfW;
        EnumC1174570gff enumC1174570gff2;
        PoiMapModeResponse poiMapModeResponse;
        List<PoiDiscoveryCard> poiList;
        PoiDiscoveryCard poiDiscoveryCard;
        C1174480gfW c1174480gfW2;
        C1C7U.LIZ("PoiMapModeMapVM@6b82.fetchDataFromFindPlaceNearby$1");
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
            Object obj2 = this.LLILLJJLI;
            PoiMapModePageVM poiMapModePageVM = this.LLILLL.LLILLL;
            if (poiMapModePageVM != null) {
                C1174650gfn c1174650gfn = new C1174650gfn(EnumC1174760gfy.FIND_PLACES_NEARBY, null, null);
                this.LLILLJJLI = obj2;
                this.LL = 1;
                if (poiMapModePageVM.zQ2(c1174650gfn, false, this) == objLJFF) {
                    C1C7U.LIZIZ("PoiMapModeMapVM@6b82.fetchDataFromFindPlaceNearby$1");
                    return objLJFF;
                }
            }
        }
        PoiMapModePageVM poiMapModePageVM2 = this.LLILLL.LLILLL;
        if (poiMapModePageVM2 != null && (c1174480gfW2 = poiMapModePageVM2.LL) != null) {
            enumC1174570gff = c1174480gfW2.LIZIZ;
        } else {
            enumC1174570gff = null;
        }
        if (enumC1174570gff == EnumC1174570gff.CARD_VIEW) {
            if (poiMapModePageVM2 != null && (poiMapModeResponse = poiMapModePageVM2.LLJIJIL) != null && (poiList = poiMapModeResponse.getPoiList()) != null && (poiDiscoveryCard = (PoiDiscoveryCard) C13LP.LJJJLL(poiList)) != null) {
                PoiMapModePageVM poiMapModePageVM3 = this.LLILLL.LLILLL;
                if (poiMapModePageVM3 != null) {
                    poiMapModePageVM3.yQ2(poiDiscoveryCard.poiId, true);
                }
            } else {
                PoiMapModePageVM poiMapModePageVM4 = this.LLILLL.LLILLL;
                if (poiMapModePageVM4 != null && (c1174480gfW = poiMapModePageVM4.LL) != null && (enumC1174570gff2 = c1174480gfW.LIZIZ) != null) {
                    enumC1174570gff2.onFindPlacesNearby(c1174480gfW);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapModeMapVM@6b82.fetchDataFromFindPlaceNearby$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
