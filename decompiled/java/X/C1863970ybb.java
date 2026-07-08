package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ybb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$getTakoSearchLandingPage$1", f = "TakoServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1863970ybb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863970ybb(String str, InterfaceC1364105Vn<? super C1863970ybb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863970ybb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl@d56d.getTakoSearchLandingPage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1864000ybe.LIZIZ = null;
        C1864000ybe.LIZIZ = C1864000ybe.LIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoServiceImpl@d56d.getTakoSearchLandingPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
