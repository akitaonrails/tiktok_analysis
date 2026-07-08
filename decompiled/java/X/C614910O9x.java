package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel$checkAndRenderLandMarker$2", f = "PoiRevisitViewModel.kt", l = {431}, m = "invokeSuspend")
public final class C614910O9x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C443120HZe<Integer, PoiRevisitApi.PoiRevisitCardModel, C1175060ggS>> LLILLL;
    public final /* synthetic */ PoiRevisitViewModel LLILZ;
    public final /* synthetic */ List<PoiRevisitApi.PoiRevisitCardModel> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614910O9x(List<C443120HZe<Integer, PoiRevisitApi.PoiRevisitCardModel, C1175060ggS>> list, PoiRevisitViewModel poiRevisitViewModel, List<PoiRevisitApi.PoiRevisitCardModel> list2, InterfaceC1364105Vn<? super C614910O9x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = poiRevisitViewModel;
        this.LLILZIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C614910O9x c614910O9x = new C614910O9x(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c614910O9x.LLILLJJLI = obj;
        return c614910O9x;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRevisitViewModel@2086.checkAndRenderLandMarker$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<C443120HZe<Integer, PoiRevisitApi.PoiRevisitCardModel, C1175060ggS>> list = this.LLILLL;
            PoiRevisitViewModel poiRevisitViewModel = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C443120HZe<Integer, PoiRevisitApi.PoiRevisitCardModel, C1175060ggS> c443120HZe : list) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C614920O9y(c443120HZe.getFirst().intValue(), c443120HZe.getSecond(), poiRevisitViewModel, c443120HZe.getThird(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiRevisitViewModel@2086.checkAndRenderLandMarker$2");
                return objLJFF;
            }
        }
        List<Pair> list2 = (List) obj;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PoiRevisitApi.PoiRevisitCardModel) ((Pair) it2.next()).getSecond()).poiId);
        }
        arrayList2.toString();
        List<PoiRevisitApi.PoiRevisitCardModel> list3 = this.LLILZIL;
        for (Pair pair : list2) {
            ListProtector.set(list3, ((Number) pair.getFirst()).intValue(), pair.getSecond());
        }
        PoiRevisitViewModel poiRevisitViewModel2 = this.LLILZ;
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse2 = poiRevisitViewModel2.LLILLL;
        if (poiRevisitCardListResponse2 != null) {
            poiRevisitCardListResponse = new PoiRevisitApi.PoiRevisitCardListResponse(this.LLILZIL, poiRevisitCardListResponse2.distanceIndex);
        }
        poiRevisitViewModel2.LLILLL = poiRevisitCardListResponse;
        this.LLILZ.LLJILJIL.postValue(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiRevisitViewModel@2086.checkAndRenderLandMarker$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
