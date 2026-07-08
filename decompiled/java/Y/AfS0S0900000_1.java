package Y;

import X.AnonymousClass0317;
import X.C034S;
import X.C035Q;
import X.C03R6;
import X.C03RS;
import X.C03RT;
import X.C03RV;
import X.C03RW;
import X.C03RX;
import X.C03W6;
import X.C03WX;
import X.C09JN;
import X.C1120604Zw;
import X.C1388190mED;
import X.C189200o6;
import X.C1AQS;
import X.C1C7U;
import X.C23260099m;
import X.C843303Rf;
import X.C914303hl;
import X.C928103jz;
import X.EnumC840403Qc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1748810vbr;
import X.InterfaceC911603hK;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcOspPaymentPreloadOptimizationSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AfS0S0900000_1 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S0900000_1 afS0S0900000_1, Object obj) {
        String str;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        String name;
        PaymentMethodsData paymentMethodsData;
        C1C7U.LIZ("OrderSubmitRepository@9af5.preloadBillInfo$2$2");
        BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
        ModuleManager.LJJJJJL = System.currentTimeMillis();
        C03RT c03rt = C03RT.DONE;
        C03RS c03rs = new C03RS(c03rt, billInfoResponse, (EnumC840403Qc) afS0S0900000_1.l0, (C03RX) afS0S0900000_1.l1, (C03RW) afS0S0900000_1.l2, 8);
        C03RV c03rv = C03RV.LIZ;
        InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) afS0S0900000_1.l3;
        Integer numValueOf = Integer.valueOf(((PreloadBillInfoRequest) ((C03R6) afS0S0900000_1.l4)).LIZ());
        Boolean bool = Boolean.TRUE;
        c03rv.getClass();
        C03RV.LIZ(interfaceC1748810vbr, c03rs, false, c03rt, numValueOf, bool);
        C035Q.LIZ(new AwS367S0200000_1(billInfoResponse, (C03R6) afS0S0900000_1.l4, 2));
        boolean z = C843303Rf.LIZ;
        PaymentMethodsData paymentMethodsData2 = null;
        C843303Rf.LJFF(((C03R6) afS0S0900000_1.l4).genCacheKey(null), c03rs, (Integer) afS0S0900000_1.l5);
        C914303hl c914303hl = C914303hl.LIZ;
        BillInfoData billInfoData = (BillInfoData) billInfoResponse.data;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            str = paymentMethodsData.saleRegion;
        } else {
            str = null;
        }
        c914303hl.getClass();
        C914303hl.LJFF(str, "order_submit");
        if (Intrinsics.LJFF(EcOspPaymentPreloadOptimizationSettings.LIZ().enableGPPreInit, bool)) {
            GooglePayProcess googlePayProcess = GooglePayProcess.LIZ;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z2 = false;
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                }
                String name2 = IActivityStackDependencyService.class.getName();
                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            Activity topActivity = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getTopActivity();
            googlePayProcess.getClass();
            GooglePayProcess.LJFF(topActivity);
            BillInfoData billInfoData2 = (BillInfoData) billInfoResponse.data;
            if (billInfoData2 != null) {
                paymentMethodsData2 = billInfoData2.paymentMethods;
            }
            GooglePayProcess.LJIIJ(Boolean.FALSE, GooglePayProcess.LIZJ(paymentMethodsData2));
        }
        ((C03WX) afS0S0900000_1.l6).getClass();
        C03WX.LJJJJZ(billInfoResponse);
        C03W6 c03w6 = (C03W6) afS0S0900000_1.l7;
        if (c03w6 != null) {
            c03w6.onSuccess();
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS0S0900000_1.l8;
        C189200o6.m2constructorimpl(billInfoResponse);
        interfaceC1364105Vn.resumeWith(billInfoResponse);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.preloadBillInfo$2$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS0S0900000_1 afS0S0900000_1, Object obj) {
        String str;
        IECommerceHostService iECommerceHostService;
        Activity activityLIZ;
        C928103jz c928103jzLIZJ;
        Context context;
        boolean z;
        String name;
        PaymentMethodsData paymentMethodsData;
        C1C7U.LIZ("OrderSubmitRepository@9af5.preloadBillInfo$2$5");
        BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
        ModuleManager.LJJJJJL = System.currentTimeMillis();
        C03RT c03rt = C03RT.DONE;
        C03RS c03rs = new C03RS(c03rt, billInfoResponse, (EnumC840403Qc) afS0S0900000_1.l0, (C03RX) afS0S0900000_1.l1, (C03RW) afS0S0900000_1.l2, 8);
        C03RV c03rv = C03RV.LIZ;
        InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) afS0S0900000_1.l3;
        Integer numValueOf = Integer.valueOf(((BillInfoRequest) ((C03R6) afS0S0900000_1.l4)).countSkuNum());
        Boolean bool = Boolean.TRUE;
        c03rv.getClass();
        C03RV.LIZ(interfaceC1748810vbr, c03rs, false, c03rt, numValueOf, bool);
        C035Q.LIZ(new AwS367S0200000_1(billInfoResponse, (C03R6) afS0S0900000_1.l4, 3));
        boolean z2 = C843303Rf.LIZ;
        PaymentMethodsData paymentMethodsData2 = null;
        C843303Rf.LJFF(((C03R6) afS0S0900000_1.l4).genCacheKey(null), c03rs, (Integer) afS0S0900000_1.l5);
        C914303hl c914303hl = C914303hl.LIZ;
        BillInfoData billInfoData = (BillInfoData) billInfoResponse.data;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            str = paymentMethodsData.saleRegion;
        } else {
            str = null;
        }
        c914303hl.getClass();
        C914303hl.LJFF(str, "order_submit");
        if (Intrinsics.LJFF(EcOspPaymentPreloadOptimizationSettings.LIZ().enableGPPreInit, bool)) {
            GooglePayProcess googlePayProcess = GooglePayProcess.LIZ;
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
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (c928103jzLIZJ = rootPageMonitor.LIZJ()) != null && (context = c928103jzLIZJ.LIZ) != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            googlePayProcess.getClass();
            GooglePayProcess.LJFF(activityLIZ);
            BillInfoData billInfoData2 = (BillInfoData) billInfoResponse.data;
            if (billInfoData2 != null) {
                paymentMethodsData2 = billInfoData2.paymentMethods;
            }
            GooglePayProcess.LJIIJ(Boolean.FALSE, GooglePayProcess.LIZJ(paymentMethodsData2));
        }
        ((C03WX) afS0S0900000_1.l6).getClass();
        C03WX.LJJJJZ(billInfoResponse);
        C03W6 c03w6 = (C03W6) afS0S0900000_1.l7;
        if (c03w6 != null) {
            c03w6.onSuccess();
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS0S0900000_1.l8;
        C189200o6.m2constructorimpl(billInfoResponse);
        interfaceC1364105Vn.resumeWith(billInfoResponse);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.preloadBillInfo$2$5");
    }

    public AfS0S0900000_1(EnumC840403Qc enumC840403Qc, C03RX c03rx, C03RW c03rw, InterfaceC1748810vbr interfaceC1748810vbr, C03R6 c03r6, Integer num, C03WX c03wx, C03W6 c03w6, C23260099m c23260099m, int i) {
        this.$t = i;
        this.l0 = enumC840403Qc;
        this.l1 = c03rx;
        this.l2 = c03rw;
        this.l3 = interfaceC1748810vbr;
        this.l4 = c03r6;
        this.l5 = num;
        this.l6 = c03wx;
        this.l7 = c03w6;
        this.l8 = c23260099m;
    }
}
