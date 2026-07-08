package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.view.WindowInsets;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcOSPCombinedSkuCheckoutTestData;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcOSPMultiMainOrderCombinedSkuCheckoutData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03k0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C928203k0 {
    public static final C928203k0 LIZ = new C928203k0();
    public static final boolean LIZIZ = C928303k1.LIZ();
    public static final List<String> LIZJ;
    public static final List<String> LIZLLL;
    public static final boolean LJ;
    public static final List<String> LJFF;
    public static final List<String> LJI;

    static {
        C01GW c01gw = C928303k1.LIZIZ;
        List<String> arrayList = ((EcOSPCombinedSkuCheckoutTestData) c01gw.getValue()).allowList;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        LIZJ = arrayList;
        List<String> arrayList2 = ((EcOSPCombinedSkuCheckoutTestData) c01gw.getValue()).blockList;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        LIZLLL = arrayList2;
        C01GW c01gw2 = C928403k2.LIZIZ;
        Boolean bool = ((EcOSPMultiMainOrderCombinedSkuCheckoutData) c01gw2.getValue()).enable;
        LJ = bool != null ? bool.booleanValue() : false;
        LJFF = ((EcOSPMultiMainOrderCombinedSkuCheckoutData) c01gw2.getValue()).allowList;
        LJI = ((EcOSPMultiMainOrderCombinedSkuCheckoutData) c01gw2.getValue()).blockList;
    }

    public static final float LJIIJ() {
        LIZ.getClass();
        return LJIIZILJ() * 0.9f;
    }

    public static int LJIIZILJ() throws Exception {
        IECommerceHostService iECommerceHostService;
        Activity activity;
        C928103jz[] c928103jzArrLIZ;
        int length;
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (c928103jzArrLIZ = rootPageMonitor.LIZ()) != null && c928103jzArrLIZ.length - 1 >= 0) {
                while (true) {
                    int i = length - 1;
                    C928103jz c928103jz = c928103jzArrLIZ[length];
                    if (!(c928103jz.LIZLLL instanceof Activity)) {
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    } else {
                        obj = c928103jz.LIZLLL;
                        break;
                    }
                }
            }
            if ((obj instanceof Activity) && (activity = (Activity) obj) != null) {
                C0IKF.LIZ.getClass();
                C465320IMo.LIZ();
                C19738412Ko c19738412KoLIZ = C19738212Km.LIZ(activity);
                C20244914Jj c20244914JjLIZIZ = c19738412KoLIZ.LIZIZ.LIZIZ(WindowInsets.Type.systemBars());
                return (c19738412KoLIZ.LIZ().height() - c20244914JjLIZIZ.LIZLLL) - c20244914JjLIZIZ.LIZIZ;
            }
        }
        return C958103op.LIZJ();
    }

    public static Integer LJII(String str) {
        if (Intrinsics.LJFF(str, "one_step_checkout")) {
            return Integer.valueOf(C03SW.COMBINED_SKU_FLOW.getValue());
        }
        if (Intrinsics.LJFF(str, "mini_checkout")) {
            return Integer.valueOf(C03SW.MINI_FLOW.getValue());
        }
        return null;
    }

    public static int LJIIJJI(C928203k0 c928203k0) {
        double dLIZJ;
        double d;
        c928203k0.getClass();
        if (C00G9.EIGHT_SPLIT.getValue() == 0) {
            dLIZJ = C958103op.LIZJ();
            d = 0.83d;
        } else {
            dLIZJ = C958103op.LIZJ();
            d = 0.73d;
        }
        return (int) (dLIZJ * d);
    }

    public static boolean LJIILIIL(String str) {
        List<String> list;
        if (LJ && str != null && str.length() != 0) {
            List<String> list2 = LJFF;
            if ((list2 == null || list2.isEmpty()) && ((list = LJI) == null || list.isEmpty())) {
                return true;
            }
            List<String> list3 = LJI;
            if (list3 != null && list3.contains(str)) {
                return false;
            }
            if (list2 == null || list2.isEmpty() || list2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILJJIL(String str) {
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "one_step_checkout") && !Intrinsics.LJFF(str, "multi_express_checkout")) {
            return false;
        }
        return true;
    }

    public static boolean LJIILL(String str) {
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "one_step_checkout") && !Intrinsics.LJFF(str, "multi_express_checkout")) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(Integer num) {
        if (num == null) {
            return false;
        }
        if (num.intValue() != C03SW.COMBINED_SKU_FLOW.getValue()) {
            return false;
        }
        return true;
    }

    public static boolean LJIJ(String str) {
        List<String> list;
        if (str == null || str.length() == 0) {
            return false;
        }
        List<String> list2 = LIZJ;
        if ((list2 == null || list2.isEmpty()) && ((list = LIZLLL) == null || list.isEmpty())) {
            return true;
        }
        List<String> list3 = LIZLLL;
        if (list3 != null && list3.contains(str)) {
            return false;
        }
        if (list2 != null && !list2.isEmpty() && !list2.contains(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C03R6 r10, kotlin.jvm.functions.Function1 r11) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C928203k0.LIZ(X.03R6, kotlin.jvm.functions.Function1):boolean");
    }

    public static boolean LJFF(String str, Function0 function0) {
        boolean zBooleanValue;
        if (function0 != null) {
            zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (LJ && LJIILIIL(str)) {
            C934703l3.LL.getClass();
            if (C934703l3.LJ() && zBooleanValue) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(String str, OrderSubmitRequestParam orderSubmitRequestParam, Function1 function1) {
        List<OrderShopDigest> orderShopDigest;
        Integer num;
        if (orderSubmitRequestParam == null || (orderShopDigest = orderSubmitRequestParam.getOrderShopDigest()) == null) {
            return true;
        }
        Iterator<OrderShopDigest> it2 = orderShopDigest.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            List<OrderSKUDTO> list = it2.next().orderSKUs;
            if (list != null) {
                for (OrderSKUDTO orderSKUDTO : list) {
                    if (orderSKUDTO.snsInfo != null && (!C928503k3.LIZ() || Intrinsics.LJFF(str, "shop_cart"))) {
                        if (function1 != null) {
                            function1.invoke(1);
                        }
                        z = false;
                    }
                    if (orderSKUDTO.selectedInsuranceInfo != null) {
                        if (function1 != null) {
                            function1.invoke(2);
                        }
                        z = false;
                    }
                    SkuCardStyleInfo skuCardStyleInfo = orderSKUDTO.skuCardStyleInfo;
                    if (skuCardStyleInfo != null && (num = skuCardStyleInfo.skuCardStyleType) != null && num.intValue() == 5) {
                        if (function1 != null) {
                            function1.invoke(3);
                        }
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public static Integer LJIIL(Float f, String str, String str2) {
        if (str == null) {
            return null;
        }
        if (Intrinsics.LJFF(str, "one_click_pay") && f != null && f.floatValue() > 0.0f) {
            return Integer.valueOf((int) (C958103op.LIZJ() * f.floatValue()));
        }
        if (!Intrinsics.LJFF(str, "one_step_checkout") && !Intrinsics.LJFF(str, "multi_express_checkout")) {
            return null;
        }
        if (str2 == null) {
            return Integer.valueOf((int) LJIIJ());
        }
        if (Intrinsics.LJFF(str2, "live")) {
            return Integer.valueOf((int) C958103op.LIZIZ());
        }
        return Integer.valueOf((int) LJIIJ());
    }

    public static boolean LJ(C928203k0 c928203k0, OrderSubmitRequestParam orderSubmitRequestParam, BillInfoRequest billInfoRequest, int i) {
        Integer flowType;
        Integer flowType2 = null;
        if ((i & 1) != 0) {
            orderSubmitRequestParam = null;
        }
        if ((i & 2) != 0) {
            billInfoRequest = null;
        }
        c928203k0.getClass();
        if (orderSubmitRequestParam != null && (flowType = orderSubmitRequestParam.getFlowType()) != null) {
            flowType2 = flowType;
        } else if (billInfoRequest != null) {
            flowType2 = billInfoRequest.getFlowType();
        }
        int value = C03SW.MINI_FLOW.getValue();
        if (flowType2 != null && flowType2.intValue() == value) {
            return true;
        }
        return false;
    }

    public static boolean LJI(C928203k0 c928203k0, Integer num, RouteIntent routeIntent, int i) {
        Intent extra;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            routeIntent = null;
        }
        c928203k0.getClass();
        if (num == null) {
            if (routeIntent == null || (extra = routeIntent.getExtra()) == null) {
                return false;
            }
            try {
                String stringExtra = extra.getStringExtra("sea_one_step_type");
                if (stringExtra == null || (num = C2095008Iq.LJIIJJI(stringExtra)) == null) {
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        if (num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(int r6, java.lang.Integer r7, java.lang.String r8, kotlin.jvm.functions.Function0 r9, kotlin.jvm.functions.Function1 r10) {
        /*
            r2 = 2
            r5 = 0
            r1 = 1
            if (r7 == 0) goto L7c
            int r0 = r7.intValue()
            if (r0 == 0) goto L11
            int r0 = r7.intValue()
            if (r0 != r2) goto L7c
        L11:
            r4 = 1
        L12:
            if (r9 == 0) goto L7a
            java.lang.Object r0 = r9.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L1e:
            boolean r0 = X.C928203k0.LIZIZ
            if (r0 == 0) goto L78
            if (r4 == 0) goto L4d
            X.03l3 r0 = X.C934703l3.LL
            r0.getClass()
            boolean r0 = X.C934703l3.LJ()
            if (r0 == 0) goto L4d
            boolean r0 = X.C934703l3.LIZ()
            if (r0 != 0) goto L4d
            boolean r0 = LJIILIIL(r8)
            if (r0 != 0) goto L4d
            if (r6 == r1) goto L4d
            boolean r0 = LJIJ(r8)
            if (r0 != 0) goto L4d
            if (r10 == 0) goto L4d
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.invoke(r0)
        L4d:
            boolean r0 = LJIJ(r8)
            if (r0 != 0) goto L75
            if (r6 != r1) goto L78
        L55:
            if (r4 == 0) goto L78
            X.03l3 r0 = X.C934703l3.LL
            r0.getClass()
            boolean r0 = X.C934703l3.LJ()
            if (r0 == 0) goto L78
            if (r3 == 0) goto L78
            boolean r0 = X.C934703l3.LIZ()
            if (r0 != 0) goto L78
            r1 = 1
        L6b:
            boolean r0 = LJFF(r8, r9)
            if (r1 != 0) goto L73
            if (r0 == 0) goto L74
        L73:
            r5 = 1
        L74:
            return r5
        L75:
            if (r6 == r2) goto L78
            goto L55
        L78:
            r1 = 0
            goto L6b
        L7a:
            r3 = 1
            goto L1e
        L7c:
            r4 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C928203k0.LIZJ(int, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):boolean");
    }

    public final Integer LJIIIIZZ(String str, int i, Integer num, Function0<Boolean> function0, int i2, OrderSubmitRequestParam orderSubmitRequestParam, Integer num2) {
        if (i2 != 1) {
            if (LJ(this, orderSubmitRequestParam, null, 2)) {
                return Integer.valueOf(C03SW.MINI_FLOW.getValue());
            }
            getClass();
            if (LIZJ(i, num, str, function0, null) || LJI(this, num2, null, 2)) {
                return Integer.valueOf(C03SW.COMBINED_SKU_FLOW.getValue());
            }
        }
        return null;
    }
}
