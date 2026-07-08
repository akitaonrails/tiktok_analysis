package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayTrackInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS183S0400000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03Y0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03Y0 {
    public static final C03Y0 LIZ = new C03Y0();

    public static C860903Xz LJ(C860903Xz c860903Xz, C03Y7 c03y7) {
        PaymentMethodInfo paymentMethodInfoCopy;
        if (c860903Xz.LIZ != C03Y2.SUCCESS) {
            return c860903Xz;
        }
        PaymentMethodInfo paymentMethodInfo = c860903Xz.LIZIZ;
        if (paymentMethodInfo != null) {
            paymentMethodInfoCopy = paymentMethodInfo.copy(paymentMethodInfo.id, paymentMethodInfo.token, paymentMethodInfo.paymentElements, paymentMethodInfo.isChooseSave, paymentMethodInfo.tenure, paymentMethodInfo.installmentPlanId, paymentMethodInfo.installmentOptionId, c03y7.LIZ, Boolean.TRUE, c03y7.LIZIZ, paymentMethodInfo.bankCode, paymentMethodInfo.bankName, paymentMethodInfo.installmentPlan, paymentMethodInfo.hideMarketingAmount, paymentMethodInfo.tenureCycle, paymentMethodInfo.paymentPriceParam, paymentMethodInfo.isAnchored);
        } else {
            paymentMethodInfoCopy = null;
        }
        return new C860903Xz(c860903Xz.LIZ, paymentMethodInfoCopy, c860903Xz.LIZJ, c860903Xz.LIZLLL);
    }

    public static PaymentMethodInfo LIZLLL(C834300Wo8 c834300Wo8, String str, String str2) {
        if (c834300Wo8.LIZ == C03YA.Success) {
            try {
                List<PaymentElement> list = (List) C1280004ze.LIZIZ(String.valueOf(c834300Wo8.LIZJ), new TypeToken<List<? extends PaymentElement>>() { // from class: X.03Y5
                }.getType());
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (PaymentElement paymentElement : list) {
                    arrayList.add(paymentElement.copy(paymentElement.element, paymentElement.paramName, paymentElement.paramValue, Boolean.FALSE, paymentElement.isEncrypted));
                }
                return new PaymentMethodInfo(str, str2, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GooglePayProcess.mergePaymentInfo:Google Pay merge PaymentInfo error : ");
                sbLIZ.append(th.getMessage());
                sbLIZ.append(' ');
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        return null;
    }

    public static void LIZ(Context context, PaymentMethodsData paymentMethodsData, String str, String str2, Function1 function1) {
        GooglePayProcess.LIZ.getClass();
        GooglePayProcess.LJFF(context);
        GooglePayProcess.LJIIJ(Boolean.FALSE, GooglePayProcess.LIZJ(paymentMethodsData));
        GooglePayProcess.LJIIIZ(new C03Y9(str, null, str2, null, 2042), function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[PHI: r8
      0x0096: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v6 java.lang.String) binds: [B:31:0x0093, B:8:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r16, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r17, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function1 r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Y0.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    public static void LIZJ(Context context, BillInfoData billInfoData, HashMap map, boolean z, PaymentInfo paymentInfo, Function1 function1) {
        Address address;
        String priceVal;
        String currency;
        HashMap map2;
        FragmentManager supportFragmentManager;
        PayTrackInfo payTrackInfo;
        String str;
        Price price;
        Price price2;
        PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        paymentCacheHelper.getClass();
        PaymentCacheHelper.LJIIJ(c19egLIZIZ);
        ShippingAddress shippingAddress = billInfoData.shippingAddress;
        if (shippingAddress != null) {
            address = shippingAddress.shippingAddress;
        } else {
            address = null;
        }
        Summary summary = billInfoData.summary;
        if (summary != null && (price2 = summary.total) != null) {
            priceVal = price2.getPriceVal();
        } else {
            priceVal = null;
        }
        Summary summary2 = billInfoData.summary;
        if (summary2 != null && (price = summary2.total) != null) {
            currency = price.getCurrency();
        } else {
            currency = null;
        }
        PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
        PaymentHalfFragment paymentHalfFragment = new PaymentHalfFragment();
        paymentHalfFragment.LLJJI = new AwS545S0100000_1(function1, (Function1<? super Boolean, Unit>) 1536);
        paymentHalfFragment.LLJJIII = null;
        int iOrdinal = EnumC882203ca.PAY_NOW.ordinal();
        if (map == null) {
            map2 = new HashMap();
        } else {
            map2 = map;
        }
        EnterParams enterParams = new EnterParams(null, null, Integer.valueOf(iOrdinal), paymentMethodsData, null, true, paymentInfo, map2, null, billInfoData.summary, address, priceVal, currency, "orderdetail", null, null, null, null, null, null, false, billInfoData.preRiskParam, null, Boolean.FALSE, null, null, Boolean.valueOf(z), false, context.getResources().getString(2131833063), billInfoData.ospButtonInfo, null, null, billInfoData, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
        enterParams.LJJIJIIJI = EnumC837803Pc.OCP;
        if (paymentMethodsData != null && (payTrackInfo = paymentMethodsData.payTrackInfo) != null && (str = payTrackInfo.mainTrackId) != null && map != null) {
            map.put("cashier_original_track_id", str);
            map.put("rendering_num", 1);
        }
        paymentHalfFragment.LLJIJIL = enterParams;
        paymentHalfFragment.LLJILJIL = new AwS183S0400000_1(context, (Context) billInfoData, (BillInfoData) function1, (Function1<? super C860903Xz, Unit>) paymentHalfFragment, (PaymentHalfFragment) 2);
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ2 != null && (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) != null) {
            paymentHalfFragment.show(supportFragmentManager, "payment_fragment");
        }
    }
}
