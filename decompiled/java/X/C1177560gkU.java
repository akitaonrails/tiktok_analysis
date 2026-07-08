package X;

import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0gkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem$initObserver$2$1", f = "PoiRevisitMapAssem.kt", l = {282}, m = "invokeSuspend")
public final class C1177560gkU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiRevisitMapAssem LLILLJJLI;
    public final /* synthetic */ C1177630gkb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177560gkU(PoiRevisitMapAssem poiRevisitMapAssem, C1177630gkb c1177630gkb, InterfaceC1364105Vn<? super C1177560gkU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiRevisitMapAssem;
        this.LLILLL = c1177630gkb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1177560gkU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair<String, C1177960gl8> pair;
        String str;
        C1177620gka c1177620gka;
        C1177620gka c1177620gka2;
        C1C7U.LIZ("PoiRevisitMapAssem@7d74.initObserver$2$1");
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
            C099F c099f = this.LLILLJJLI.LLJI;
            this.LL = 1;
            obj = c099f.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiRevisitMapAssem@7d74.initObserver$2$1");
                return objLJFF;
            }
        }
        InterfaceC1177250gjz interfaceC1177250gjz = (InterfaceC1177250gjz) obj;
        List<InterfaceC1177040gje> markers = interfaceC1177250gjz.getMarkers();
        ArrayList<Pair<String, C1177960gl8>> arrayList = new ArrayList(C15438062q.LJIJJ(markers, 10));
        Iterator<InterfaceC1177040gje> it2 = markers.iterator();
        while (true) {
            C1177960gl8 c1177960gl8 = null;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1177040gje next = it2.next();
            Object tag = next.getTag();
            if ((tag instanceof C1177620gka) && (c1177620gka2 = (C1177620gka) tag) != null) {
                str = c1177620gka2.LIZ;
            } else {
                str = null;
            }
            Object tag2 = next.getTag();
            if ((tag2 instanceof C1177620gka) && (c1177620gka = (C1177620gka) tag2) != null) {
                c1177960gl8 = c1177620gka.LIZIZ;
            }
            arrayList.add(new Pair(str, c1177960gl8));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observe targetPoiData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", rawPoiIdAndLatLonList.size=");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C1177630gkb c1177630gkb = this.LLILLL;
        if ((c1177630gkb == null || c1177630gkb.LIZ == null) && (pair = this.LLILLJJLI.LLJJI) != null) {
            C1177960gl8 second = pair.getSecond();
            if (second != null) {
                PoiRevisitMapAssem.Go(this.LLILLJJLI, second);
            }
            this.LLILLJJLI.LLJJI = null;
        }
        C1177630gkb c1177630gkb2 = this.LLILLL;
        if (c1177630gkb2 != null && c1177630gkb2.LIZIZ) {
            PoiRevisitMapAssem poiRevisitMapAssem = this.LLILLJJLI;
            for (Pair<String, C1177960gl8> pair2 : arrayList) {
                if (Intrinsics.LJFF(pair2.getFirst(), c1177630gkb2.LIZ)) {
                    poiRevisitMapAssem.LLJJI = pair2;
                    C1177960gl8 second2 = pair2.getSecond();
                    if (second2 != null) {
                        PoiRevisitMapAssem.Go(poiRevisitMapAssem, second2);
                        poiRevisitMapAssem.LLJJ = C2286608xc.LIZLLL(interfaceC1177250gjz.LJIJJ());
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiRevisitMapAssem@7d74.initObserver$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
