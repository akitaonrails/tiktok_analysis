package X;

import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem$initObserver$8$1", f = "PoiRevisitMapAssem.kt", l = {361}, m = "invokeSuspend")
public final class C1177590gkX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiRevisitMapAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177590gkX(PoiRevisitMapAssem poiRevisitMapAssem, InterfaceC1364105Vn<? super C1177590gkX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiRevisitMapAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1177590gkX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        int size;
        C1C7U.LIZ("PoiRevisitMapAssem@7d74.initObserver$8$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
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
                C1C7U.LIZIZ("PoiRevisitMapAssem@7d74.initObserver$8$1");
                return objLJFF;
            }
        }
        InterfaceC1177250gjz interfaceC1177250gjz = (InterfaceC1177250gjz) obj;
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = this.LLILLJJLI.Jo().wQ2(true, true, true);
        if (poiRevisitCardListResponseWQ2 != null && (list = poiRevisitCardListResponseWQ2.poiCardList) != null && (size = list.size()) <= 3) {
            i = (size * 112) + 14 + 34;
        } else {
            i = 400;
        }
        InterfaceC1177250gjz interfaceC1177250gjz2 = this.LLILLJJLI.LLJIJIL;
        if (interfaceC1177250gjz2 != null) {
            interfaceC1177250gjz2.LJIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(48))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(i))));
        }
        PoiRevisitMapAssem poiRevisitMapAssem = this.LLILLJJLI;
        poiRevisitMapAssem.No(interfaceC1177250gjz, poiRevisitMapAssem.LLJILJILJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiRevisitMapAssem@7d74.initObserver$8$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
