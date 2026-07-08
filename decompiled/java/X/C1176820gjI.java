package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0gjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.marker.PoiMapDetailMarkerRender$unHighLightMarker$1", f = "PoiMapDetailMarkerRender.kt", l = {91}, m = "invokeSuspend")
public final class C1176820gjI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C1176630giz> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1176900gjQ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176820gjI(List<C1176630giz> list, String str, C1176900gjQ c1176900gjQ, InterfaceC1364105Vn<? super C1176820gjI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = c1176900gjQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1176820gjI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String poiId;
        C1176630giz next;
        String poiId2;
        C1C7U.LIZ("PoiMapDetailMarkerRender@7f86.unHighLightMarker$1");
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
            List<C1176630giz> list = this.LLILLJJLI;
            if (list != null) {
                String str = this.LLILLL;
                Iterator<C1176630giz> it2 = list.iterator();
                while (true) {
                    poiId = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        PoiGeneralCard poiGeneralCard = next.card;
                        if (poiGeneralCard != null) {
                            poiId2 = poiGeneralCard.getPoiId();
                        } else {
                            poiId2 = null;
                        }
                        if (Intrinsics.LJFF(poiId2, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1176630giz c1176630giz = next;
                if (c1176630giz != null) {
                    C1176900gjQ c1176900gjQ = this.LLILZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unHighLightMarker poiId:");
                    PoiGeneralCard poiGeneralCard2 = c1176630giz.card;
                    if (poiGeneralCard2 != null) {
                        poiId = poiGeneralCard2.getPoiId();
                    }
                    sbLIZ.append(poiId);
                    C2188811AlT.LIZIZ(sbLIZ);
                    float f = c1176900gjQ.LJIIL;
                    c1176900gjQ.LJIIL = 1.0f + f;
                    this.LL = 1;
                    if (c1176900gjQ.LIZJ(c1176630giz, false, f, this) == objLJFF) {
                        C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.unHighLightMarker$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.unHighLightMarker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
