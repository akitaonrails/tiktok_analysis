package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel$updateCollectStatusOptimistic$1", f = "PoiRevisitViewModel.kt", l = {}, m = "invokeSuspend")
public final class C614870O9t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C614810O9n LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614870O9t(C614810O9n c614810O9n, InterfaceC1364105Vn<? super C614870O9t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c614810O9n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C614870O9t(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRevisitViewModel@2086.updateCollectStatusOptimistic$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C614860O9s.LIZIZ.LIZLLL(this.LL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiRevisitViewModel@2086.updateCollectStatusOptimistic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
