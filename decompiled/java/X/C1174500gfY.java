package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeMapVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeMapVM$onSearchClicked$1", f = "PoiMapModeMapVM.kt", l = {71}, m = "invokeSuspend")
public final class C1174500gfY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiMapModeMapVM LLILLJJLI;
    public final /* synthetic */ MapBounds LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174500gfY(PoiMapModeMapVM poiMapModeMapVM, MapBounds mapBounds, InterfaceC1364105Vn<? super C1174500gfY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiMapModeMapVM;
        this.LLILLL = mapBounds;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1174500gfY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1174480gfW c1174480gfW;
        EnumC1174570gff enumC1174570gff;
        C1C7U.LIZ("PoiMapModeMapVM@6b82.onSearchClicked$1");
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
            PoiMapModePageVM poiMapModePageVM = this.LLILLJJLI.LLILLL;
            if (poiMapModePageVM != null && (c1174480gfW = poiMapModePageVM.LL) != null && (enumC1174570gff = c1174480gfW.LIZIZ) != null) {
                enumC1174570gff.onSearchArea(c1174480gfW);
            }
            PoiMapModePageVM poiMapModePageVM2 = this.LLILLJJLI.LLILLL;
            if (poiMapModePageVM2 != null) {
                C1174650gfn c1174650gfn = new C1174650gfn(EnumC1174760gfy.SEARCH_AREA, this.LLILLL, null);
                this.LL = 1;
                if (poiMapModePageVM2.zQ2(c1174650gfn, true, this) == objLJFF) {
                    C1C7U.LIZIZ("PoiMapModeMapVM@6b82.onSearchClicked$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapModeMapVM@6b82.onSearchClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
