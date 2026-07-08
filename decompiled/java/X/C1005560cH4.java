package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cH4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl$init$1", f = "SmartCheckIntegrateImpl.kt", l = {30}, m = "invokeSuspend")
public final class C1005560cH4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1005560cH4(InterfaceC1364105Vn<? super C1005560cH4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005560cH4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartCheckIntegrateImpl@2b4b.init$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1005620cHA c1005620cHA = C1005620cHA.LIZ;
                this.LL = 1;
                if (c1005620cHA.LIZIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("SmartCheckIntegrateImpl@2b4b.init$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20162213um c20162213um = C20162213um.LIZ;
            String value = EnumC1005690cHH.UNKNOWN.getValue();
            EnumC1005660cHE enumC1005660cHE = EnumC1005660cHE.INIT;
            String message = e.getMessage();
            c20162213um.getClass();
            C20162213um.LIZ("SmartCheck", value, enumC1005660cHE, message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartCheckIntegrateImpl@2b4b.init$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1005560cH4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
