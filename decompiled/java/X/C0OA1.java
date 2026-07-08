package X;

import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OA1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel$handleFirstFetch$1", f = "PoiRevisitViewModel.kt", l = {178}, m = "invokeSuspend")
public final class C0OA1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiRevisitViewModel LLILLJJLI;
    public final /* synthetic */ LocationData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OA1(PoiRevisitViewModel poiRevisitViewModel, LocationData locationData, InterfaceC1364105Vn<? super C0OA1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiRevisitViewModel;
        this.LLILLL = locationData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OA1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRevisitViewModel@2086.handleFirstFetch$1");
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
            PoiRevisitViewModel poiRevisitViewModel = this.LLILLJJLI;
            LocationData locationData = this.LLILLL;
            this.LL = 1;
            if (poiRevisitViewModel.vQ2(locationData, this) == objLJFF) {
                C1C7U.LIZIZ("PoiRevisitViewModel@2086.handleFirstFetch$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiRevisitViewModel@2086.handleFirstFetch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
