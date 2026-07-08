package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel$onPrepared$1", f = "PoiRevisitViewModel.kt", l = {126}, m = "invokeSuspend")
public final class C614880O9u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiRevisitViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614880O9u(PoiRevisitViewModel poiRevisitViewModel, InterfaceC1364105Vn<? super C614880O9u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiRevisitViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C614880O9u(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRevisitViewModel@2086.onPrepared$1");
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
            if (!C296960BkU.LIZ()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PoiRevisitViewModel@2086.onPrepared$1");
                return unit;
            }
            InterfaceC346201Wa<C612220Nzo<C614810O9n>> interfaceC346201WaSubscribe = C614860O9s.LIZIZ.subscribe();
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 18);
            this.LL = 1;
            if (interfaceC346201WaSubscribe.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("PoiRevisitViewModel@2086.onPrepared$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiRevisitViewModel@2086.onPrepared$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
