package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.GetBillFlowTypeInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03l3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C934703l3 implements InterfaceC1164530gPT {
    public static final C934703l3 LL;
    public static Integer LLILLJJLI;
    public static Boolean LLILLL;
    public static final boolean LLILZ;
    public static final long LLILZIL;
    public static final Keva LLILZLL;
    public static C11JF LLIZ;

    static {
        C934703l3 c934703l3 = new C934703l3();
        LL = c934703l3;
        LLILZ = C928303k1.LIZ();
        LLILZIL = ((long) (((Number) C935203l8.LIZ.getValue()).intValue() * LSPassThroughRecordSizeConfig.DEFAULT * 60)) * 60;
        LLILZLL = C935303l9.LIZ(C935303l9.LIZ);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_address_change", c934703l3);
    }

    public static boolean LIZ() {
        IECommerceHostService iECommerceHostService;
        if (LLILLL == null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Object objLIZ = C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplication()).LIZ("ecom_osp_disable_one_step_checkout");
            if (objLIZ != null) {
                LLILLL = objLIZ instanceof Boolean ? (Boolean) objLIZ : null;
            }
        }
        Boolean bool = LLILLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Integer LIZLLL() {
        IECommerceHostService iECommerceHostService;
        String str;
        if (LLILLJJLI == null) {
            Integer numLJIIJJI = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Object objLIZ = C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplication()).LIZ("ecom_osp_flow_type");
            if (objLIZ != null) {
                if ((objLIZ instanceof String) && (str = (String) objLIZ) != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(str);
                }
                LLILLJJLI = numLJIIJJI;
            }
        }
        return LLILLJJLI;
    }

    public static boolean LJ() {
        Integer numLIZLLL = LIZLLL();
        return numLIZLLL != null && numLIZLLL.intValue() == 2;
    }

    public static Object LIZJ(C935003l6 c935003l6) {
        C11JF c11jf = LLIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LLIZ = null;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c935003l6));
        C859403Xk c859403Xk = OrderSubmitApi.LIZ;
        GetBillFlowTypeInfoRequest getBillFlowTypeInfoRequest = new GetBillFlowTypeInfoRequest(null);
        c859403Xk.getClass();
        LLIZ = (C11JF) ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).LIZIZ(getBillFlowTypeInfoRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(c23260099m, 13), new C516201zk(c23260099m, 14));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c935003l6);
        }
        return objLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C935003l6
            if (r0 == 0) goto L20
            r3 = r8
            X.03l6 r3 = (X.C935003l6) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r2 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 != r6) goto L26
            goto L41
        L20:
            X.03l6 r3 = new X.03l6
            r3.<init>(r7, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = X.C934703l3.LLILZ
            if (r0 != 0) goto L38
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            r3.LLILLL = r6     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r2 = LIZJ(r3)     // Catch: java.lang.Throwable -> L8f
            if (r2 != r1) goto L44
            return r1
        L41:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L8f
        L44:
            X.03l7 r2 = (X.C935103l7) r2     // Catch: java.lang.Throwable -> L8f
            boolean r0 = r2.isCodeOK()     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L9f
            T r1 = r2.data     // Catch: java.lang.Throwable -> L8f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.GetBillFlowTypeInfoResponseData r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.GetBillFlowTypeInfoResponseData) r1     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L9f
            java.lang.Integer r0 = r1.screenType     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L74
            int r5 = r0.intValue()     // Catch: java.lang.Throwable -> L8f
        L5a:
            java.lang.Boolean r0 = r1.disableOneStepCheckout     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L72
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8f
        L62:
            com.bytedance.keva.Keva r3 = X.C934703l3.LLILZLL     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "LAST_OSP_FLOW_TYPE_CACHE_TIME"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8f
            r3.storeLong(r2, r0)     // Catch: java.lang.Throwable -> L8f
            X.03l3 r0 = X.C934703l3.LL     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L78
            goto L76
        L72:
            r4 = 0
            goto L62
        L74:
            r5 = 0
            goto L5a
        L76:
            r1 = 1
            goto L79
        L78:
            r1 = 0
        L79:
            r0.getClass()     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L8f
            X.C934703l3.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L8f
            X.C934703l3.LLILLL = r0     // Catch: java.lang.Throwable -> L8f
            if (r4 != 0) goto L8b
            r6 = 0
        L8b:
            LJFF(r5, r6)     // Catch: java.lang.Throwable -> L8f
            goto L9f
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.09Fh r1 = X.C2341109Fh.LIZ
            java.lang.String r0 = r0.toString()
            r1.getClass()
            X.C2341109Fh.LIZJ(r0)
        L9f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934703l3.LIZIZ(X.05Vn):java.lang.Object");
    }

    public static void LJFF(int i, boolean z) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z2;
        boolean z3;
        String name;
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplication()).LJIIIIZZ(String.valueOf(i), "ecom_osp_flow_type");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService2 != null) {
                name2 = iECommerceHostService2.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService2).getApplication()).LJIIIIZZ(Boolean.valueOf(z), "ecom_osp_disable_one_step_checkout");
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_address_change")) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C934903l5(null), 2);
        }
    }
}
