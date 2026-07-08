package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloader$initMemoryCallback$cleanPreloadView$1$1$1", f = "ECSparkPreloader.kt", l = {}, m = "invokeSuspend")
public final class C1343105Nl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343105Nl(String str, InterfaceC1364105Vn<? super C1343105Nl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343105Nl(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECSparkPreloader@6865.initMemoryCallback$cleanPreloadView$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LIZIZ("", this.LL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECSparkPreloader@6865.initMemoryCallback$cleanPreloadView$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
