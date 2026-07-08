package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autofill.manager.AdAutofillManagerV2$registerIframeJSProvider$1", f = "AdAutofillManagerV2.kt", l = {}, m = "invokeSuspend")
public final class C1002480cC6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1541990qEH LL;
    public final /* synthetic */ C1035880d3y LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002480cC6(InterfaceC1541990qEH interfaceC1541990qEH, C1035880d3y c1035880d3y, InterfaceC1364105Vn<? super C1002480cC6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1541990qEH;
        this.LLILLJJLI = c1035880d3y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002480cC6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdAutofillManagerV2@4585.registerIframeJSProvider$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1067990dtl c1067990dtl = C1067990dtl.LIZ;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LL;
        C1035880d3y c1035880d3y = this.LLILLJJLI;
        c1067990dtl.getClass();
        C1067990dtl.LJJIJ(interfaceC1541990qEH, c1035880d3y);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdAutofillManagerV2@4585.registerIframeJSProvider$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
