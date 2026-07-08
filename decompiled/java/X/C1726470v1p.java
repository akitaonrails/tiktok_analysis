package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.security.certificate.SecurityCertManager$getSignHeader$1", f = "SecurityCertManager.kt", l = {}, m = "invokeSuspend")
public final class C1726470v1p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1726500v1s LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726470v1p(C1726500v1s c1726500v1s, Map<String, String> map, InterfaceC1364105Vn<? super C1726470v1p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1726500v1s;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1726470v1p(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecurityCertManager@a909.getSignHeader$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            ((C1726520v1u) this.LL.LJFF.getValue()).LIZ(true, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1726450v1n.LIZLLL("init", e, this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecurityCertManager@a909.getSignHeader$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
