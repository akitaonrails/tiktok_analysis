package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.security.certificate.SecurityCertManager$initCert$1", f = "SecurityCertManager.kt", l = {}, m = "invokeSuspend")
public final class C1726480v1q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1726500v1s LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726480v1q(C1726500v1s c1726500v1s, InterfaceC1364105Vn<? super C1726480v1q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1726500v1s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1726480v1q(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecurityCertManager@a909.initCert$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = false;
        try {
            ((C1726520v1u) this.LL.LJFF.getValue()).LIZ(true, false);
            z = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1726450v1n.LIZLLL("init", e, this.LL.LIZLLL());
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SecurityCertManager@a909.initCert$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
