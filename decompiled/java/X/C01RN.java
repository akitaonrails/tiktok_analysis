package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailPreDecodeManager$doPoiLynxPreDecodeInSingleThread$1", f = "PoiDetailPreDecodeManager.kt", l = {}, m = "invokeSuspend")
public final class C01RN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RN(List<String> list, InterfaceC1364105Vn<? super C01RN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01RN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiDetailPreDecodeManager@8220.doPoiLynxPreDecodeInSingleThread$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C680150Qm5.LIZ(this.LL, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailPreDecodeManager@8220.doPoiLynxPreDecodeInSingleThread$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
