package X;

import com.bytedance.pipo.security.IPipoSecuritySdk;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.risk.PaymentSecurityManager$initOrUpdate$1$1", f = "PaymentSecurityManager.kt", l = {}, m = "invokeSuspend")
public final class C2175408fg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175408fg(String str, String str2, InterfaceC1364105Vn<? super C2175408fg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2175408fg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1726500v1s c1726500v1sLIZ;
        C1C7U.LIZ("PaymentSecurityManager@b40f.initOrUpdate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C123100dR.LIZ(this.LL) && C123100dR.LIZ(this.LLILLJJLI)) {
            IPipoSecuritySdk iPipoSecuritySdk = (IPipoSecuritySdk) PluggableExtentionKt.pluggableSpi$default(IPipoSecuritySdk.class, false, false, false, 14, null);
            if (iPipoSecuritySdk != null) {
                c1726500v1sLIZ = iPipoSecuritySdk.LIZ(C1717770unn.LIZJ().getApplicationContext(), this.LL, this.LLILLJJLI, new InterfaceC1726640v26() { // from class: X.08ff
                    @Override // X.InterfaceC1726640v26
                    public final String LIZJ() {
                        return "native";
                    }

                    @Override // X.InterfaceC1726640v26
                    public final String LIZLLL() {
                        return null;
                    }

                    @Override // X.InterfaceC1726640v26
                    public final String LIZ() {
                        String str = C2175208fe.LIZIZ;
                        return str == null ? "" : str;
                    }

                    @Override // X.InterfaceC1726640v26
                    public final String LIZIZ() {
                        return C2175208fe.LIZJ;
                    }
                });
            } else {
                c1726500v1sLIZ = null;
            }
            C2175208fe.LIZ = c1726500v1sLIZ;
            if (c1726500v1sLIZ != null) {
                c1726500v1sLIZ.LJ();
            }
        } else {
            C1708710uZB.LIZ("Cashier").LIZ(6, "init security manager failed");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentSecurityManager@b40f.initOrUpdate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
