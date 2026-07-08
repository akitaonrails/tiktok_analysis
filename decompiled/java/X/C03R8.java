package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PostOrderDiversionParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PostOrderDivert2MallParams;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.ECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.ECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03R8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03R8 {
    public static PostOrderDiversionParams LIZ(C03JV c03jv, String str, HashMap map, boolean z) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        String str2;
        Integer num;
        Integer numValueOf;
        String strLJJIIZ;
        String str3;
        int i;
        int iIntValue;
        String string;
        Integer numLJIIJJI;
        String string2;
        Integer numLJIIJJI2;
        String string3;
        Integer numLJIIJJI3;
        PaymentMethod paymentMethod;
        int i2;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        String str4 = null;
        if (map != null) {
            int iIntValue2 = 0;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IECUgPayToMallDependencyService iECUgPayToMallDependencyServiceCreateIECUgPayToMallDependencyServicebyMonsterPlugin = ECUgPayToMallDependencyService.createIECUgPayToMallDependencyServicebyMonsterPlugin(false);
                if (iECUgPayToMallDependencyServiceCreateIECUgPayToMallDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name3 = IECUgPayToMallDependencyService.class.getName();
                if (iECUgPayToMallDependencyServiceCreateIECUgPayToMallDependencyServicebyMonsterPlugin != null) {
                    name2 = iECUgPayToMallDependencyServiceCreateIECUgPayToMallDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z3);
                iECommerceHostService = iECUgPayToMallDependencyServiceCreateIECUgPayToMallDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECUgPayToMallDependencyService.class);
            }
            Pair<Integer, Map<String, Object>> pairMallParamsV3 = ((IECUgPayToMallDependencyService) iECommerceHostService).mallParamsV3(map);
            Integer first = pairMallParamsV3.getFirst();
            Map<String, Object> second = pairMallParamsV3.getSecond();
            if (first != null && first.intValue() == 8 && second != null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    IECommerceMallDependencyService iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
                    if (iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name4 = IECommerceMallDependencyService.class.getName();
                    if (iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                        name = iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z2);
                    iECommerceHostService2 = iECommerceMallDependencyServiceCreateIECommerceMallDependencyServicebyMonsterPlugin;
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
                }
                IECommerceMallDependencyService iECommerceMallDependencyService = (IECommerceMallDependencyService) iECommerceHostService2;
                Object obj = map.get("enter_from");
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                Object obj2 = second.get("shop_tab_ab");
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (Intrinsics.LJFF(iECommerceMallDependencyService.shouldShowMall2TabOrTopTab(), Boolean.TRUE)) {
                    if (iECommerceMallDependencyService.hitTopTabExpExperiment()) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    numValueOf = Integer.valueOf(i2);
                } else {
                    numValueOf = null;
                }
                PaymentInfo paymentInfo = c03jv.LLIZ;
                if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                    strLJJIIZ = paymentMethod.LJJIIZ();
                } else {
                    strLJJIIZ = "";
                }
                Integer numValueOf2 = Integer.valueOf(z ? 1 : 0);
                Object obj3 = second.get("pay_to_mall_source");
                if (obj3 instanceof String) {
                    str3 = (String) obj3;
                } else {
                    str3 = null;
                }
                Object obj4 = second.get("back_btn_disable");
                if (obj4 != null && (string3 = obj4.toString()) != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(string3)) != null && numLJIIJJI3.intValue() == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                Integer numValueOf3 = Integer.valueOf(1 ^ i);
                Object obj5 = second.get("pay_to_mall_scroll_to_feed_enable");
                if (obj5 != null && (string2 = obj5.toString()) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string2)) != null) {
                    iIntValue = numLJIIJJI2.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer numValueOf4 = Integer.valueOf(iIntValue);
                Object obj6 = second.get("ec_pay_to_mall_order_bubble_enable");
                if (obj6 != null && (string = obj6.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
                    iIntValue2 = numLJIIJJI.intValue();
                }
                Integer numValueOf5 = Integer.valueOf(iIntValue2);
                if (str2 == null || Intrinsics.LJFF(str2, "null")) {
                    Object obj7 = map.get("enter_from_info");
                    if (obj7 instanceof String) {
                        str4 = (String) obj7;
                    }
                    str2 = str4;
                }
                return new PostOrderDiversionParams(1, new PostOrderDivert2MallParams(num, numValueOf, strLJJIIZ, str, numValueOf2, str3, "ordersubmit", numValueOf3, numValueOf4, numValueOf5, str2));
            }
        }
        return null;
    }
}
