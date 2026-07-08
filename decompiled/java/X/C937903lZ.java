package X;

import android.os.SystemClock;
import com.bytedance.pipo.security.IPipoSecuritySdk;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03lZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.security.PaymentSecurityManager$init$1$1", f = "PaymentSecurityManager.kt", l = {37}, m = "invokeSuspend")
public final class C937903lZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C937903lZ(InterfaceC1364105Vn<? super C937903lZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C937903lZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String str3;
        String str4;
        C1C7U.LIZ("PaymentSecurityManager@20fb.init$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C938003la c938003la = C938003la.LIZ;
            this.LL = 1;
            obj = c938003la.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentSecurityManager@20fb.init$1$1");
                return objLJFF;
            }
        }
        final Cashier cashier = (Cashier) obj;
        InterfaceC2174508fX interfaceC2174508fX = C938003la.LIZIZ;
        String name = null;
        if (interfaceC2174508fX != null) {
            if (cashier != null) {
                str3 = cashier.merchantId;
                str4 = cashier.merchantUserId;
            } else {
                str3 = null;
                str4 = null;
            }
            if (interfaceC2174508fX.LIZ(str3, str4)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PaymentSecurityManager@20fb.init$1$1");
                return unit;
            }
        }
        if (cashier != null) {
            str = cashier.merchantId;
            str2 = cashier.merchantUserId;
        } else {
            str = null;
            str2 = null;
        }
        if (C123100dR.LIZ(str) && C123100dR.LIZ(str2)) {
            IPipoSecuritySdk iPipoSecuritySdk = (IPipoSecuritySdk) ServiceManager.get().getService(IPipoSecuritySdk.class);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            C1726500v1s c1726500v1sLIZ = iPipoSecuritySdk.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplicationContext(), str, str2, new InterfaceC1726640v26() { // from class: X.03ko
                @Override // X.InterfaceC1726640v26
                public final String LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1726640v26
                public final String LIZJ() {
                    return "native";
                }

                @Override // X.InterfaceC1726640v26
                public final String LIZ() {
                    String str5 = cashier.pipoHost;
                    if (str5 != null) {
                        return str5;
                    }
                    C1724230uyD.LIZ.getClass();
                    return C1724230uyD.LIZLLL;
                }

                @Override // X.InterfaceC1726640v26
                public final String LIZLLL() {
                    String str5;
                    C914303hl.LIZ.getClass();
                    Cashier cashier2 = C914303hl.LIZIZ;
                    return (cashier2 == null || (str5 = cashier2.nonce) == null) ? "" : str5;
                }
            });
            C938003la.LIZIZ = c1726500v1sLIZ;
            if (c1726500v1sLIZ != null) {
                c1726500v1sLIZ.LJ();
            }
        } else {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PayAuthHelper mid is ");
            sbLIZ.append(str);
            sbLIZ.append(", muid is ");
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PaymentSecurityManager@20fb.init$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C937903lZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
