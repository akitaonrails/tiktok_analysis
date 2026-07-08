package X;

import com.bytedance.pipo.security.certificate.interceptor.SignatureVerificationInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.security.certificate.interceptor.SignatureVerificationInterceptor$interceptResponse$1", f = "SignatureVerificationInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C1726540v1w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SignatureVerificationInterceptor LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726540v1w(SignatureVerificationInterceptor signatureVerificationInterceptor, Map<String, String> map, InterfaceC1364105Vn<? super C1726540v1w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = signatureVerificationInterceptor;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1726540v1w(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignatureVerificationInterceptor@2f3b.interceptResponse$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.LLILLJJLI.LIZ(false, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1726450v1n.LIZLLL("init", e, this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignatureVerificationInterceptor@2f3b.interceptResponse$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
