package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autofill.manager.AdIframeAutofillManager$logIframeLoadInfo$1", f = "AdIframeAutofillManager.kt", l = {}, m = "invokeSuspend")
public final class C2209608lC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1035880d3y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209608lC(C1035880d3y c1035880d3y, InterfaceC1364105Vn<? super C2209608lC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1035880d3y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2209608lC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdIframeAutofillManager@7400.logIframeLoadInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1047720dN4 c1047720dN4 = C1047720dN4.LIZ;
            C1047720dN4.LJI(this.LL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdIframeAutofillManager@7400.logIframeLoadInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
