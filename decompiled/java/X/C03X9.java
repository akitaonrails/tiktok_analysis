package X;

import android.os.Looper;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.core.ab.DynamicPreloadXmlConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS71S1300000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03X9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03X9 extends C03WA {
    public boolean LIZ;
    public Integer LIZIZ;

    public static void LJII(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
            return;
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C03XC(function0, null), 2);
    }

    public static String LJIIIIZZ(Integer num) {
        int value = C03SW.COMBINED_SKU_FLOW.getValue();
        if (num != null && num.intValue() == value) {
            return "scene_combine_sku_page";
        }
        return "scene_full_page";
    }

    public static void LJIIJ(Integer num, Integer num2) {
        int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num2), "order_submit", null, null, 12);
        C03XA c03xa = C03XA.LIZ;
        Integer numValueOf = Integer.valueOf(iLJIIJJI);
        String strLJIIIIZZ = LJIIIIZZ(num);
        c03xa.getClass();
        SystemClock.elapsedRealtime();
        ((C940303lx) C03XA.LIZIZ.getValue()).LIZIZ(Integer.valueOf(C03XA.LIZIZ()), C03XA.LJ(numValueOf, strLJIIIIZZ));
    }

    @Override // X.C03WA, X.C03W9
    public final void LIZLLL(BillInfoData billInfoData, Integer num) {
        DynamicPreloadXmlConfig dynamicPreloadXmlConfig;
        Integer num2;
        String strLJIIIIZZ = LJIIIIZZ(num);
        if (C03XD.LIZIZ(strLJIIIIZZ) && (dynamicPreloadXmlConfig = C03XD.LIZJ().dynamicPreloadXmlConfig) != null && (num2 = dynamicPreloadXmlConfig.preloadDynamicStrategy) != null) {
            int iIntValue = num2.intValue();
            if (iIntValue == 2 || iIntValue == 4) {
                LJII(new AwS71S1300000_1(this, billInfoData, strLJIIIIZZ, 4));
            }
        }
    }

    @Override // X.C03WA, X.C03W9
    public final void LJ(C03XG c03xg, Integer num) {
        LJII(new AwS245S0300000_1(this, c03xg, num, 28));
    }

    @Override // X.C03WA, X.C03W9
    public final void LJI(Integer num, Integer num2) {
        LJII(new AwS245S0300000_1(this, num, num2, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x040a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r17, java.lang.Integer r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03X9.LJIIIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, java.lang.Integer, java.lang.String):void");
    }

    @Override // X.C03WA, X.C03W9
    public final void LIZJ(Integer num, Integer num2, List list) {
        DynamicPreloadXmlConfig dynamicPreloadXmlConfig;
        Integer num3;
        String strLJIIIIZZ = LJIIIIZZ(num2);
        if (C03XD.LIZIZ(strLJIIIIZZ) && (dynamicPreloadXmlConfig = C03XD.LIZJ().dynamicPreloadXmlConfig) != null && (num3 = dynamicPreloadXmlConfig.preloadDynamicStrategy) != null) {
            int iIntValue = num3.intValue();
            if (iIntValue == 1 || iIntValue == 4) {
                LJII(new AwS71S1300000_1(this, (C03X9) list, (List<InterfaceC1891350zJl>) num, (Integer) strLJIIIIZZ, (String) 5));
            }
        }
    }

    @Override // X.C03WA, X.C03W9
    public final void LJFF(BillInfoData billInfoData, Integer num, Integer num2, Boolean bool) {
        PaymentMethodsData paymentMethodsData;
        DynamicPreloadXmlConfig dynamicPreloadXmlConfig;
        Integer num3;
        int iIntValue;
        String strLJIIIIZZ = LJIIIIZZ(num2);
        if (C03XD.LIZIZ(strLJIIIIZZ) && (dynamicPreloadXmlConfig = C03XD.LIZJ().dynamicPreloadXmlConfig) != null && (num3 = dynamicPreloadXmlConfig.preloadDynamicStrategy) != null && ((iIntValue = num3.intValue()) == 3 || iIntValue == 4)) {
            LJII(new AwS71S1300000_1(this, billInfoData, num, strLJIIIIZZ, 3));
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C03XB(paymentMethodsData, null), 2);
        }
    }
}
