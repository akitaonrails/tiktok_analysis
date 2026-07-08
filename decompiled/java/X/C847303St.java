package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RecoveryMarketingInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS56S0210000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C847303St {
    public static final C847303St LIZ = new C847303St();

    public static boolean LIZIZ(PaymentMethod paymentMethod) {
        RecoveryMarketingInfo recoveryMarketingInfo;
        String str;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_payment_enable_reimbursement_voucher", true) && paymentMethod != null && (recoveryMarketingInfo = paymentMethod.recoveryMarketingInfo) != null && Intrinsics.LJFF(recoveryMarketingInfo.isNeedReimbursed, Boolean.TRUE)) {
            RecoveryMarketingInfo recoveryMarketingInfo2 = paymentMethod.recoveryMarketingInfo;
            if (recoveryMarketingInfo2 != null) {
                str = recoveryMarketingInfo2.voucherId;
            } else {
                str = null;
            }
            if (C1533950q1J.LJ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZ(Context context, PaymentMethod paymentMethod, boolean z, Function0 function0) {
        String str;
        String str2;
        String str3;
        String strLJJIIZ;
        String str4;
        String str5;
        RecoveryMarketingInfo recoveryMarketingInfo;
        String str6;
        RecoveryMarketingInfo recoveryMarketingInfo2;
        RecoveryMarketingInfo recoveryMarketingInfo3;
        RecoveryMarketingInfo recoveryMarketingInfo4;
        RecoveryMarketingInfo recoveryMarketingInfo5;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        String str7 = "";
        if (paymentMethod == null || (recoveryMarketingInfo5 = paymentMethod.recoveryMarketingInfo) == null || (str = recoveryMarketingInfo5.tipTitle) == null) {
            str = "";
        }
        c1397580mTM.LJI(str);
        if (paymentMethod == null || (recoveryMarketingInfo4 = paymentMethod.recoveryMarketingInfo) == null || (str2 = recoveryMarketingInfo4.tipContent) == null) {
            str2 = "";
        }
        c1397580mTM.LIZIZ(str2);
        C1238130iKB.LIZ(c1397580mTM, new AwS56S0210000_1(paymentMethod, z, context, 5));
        c1397580mTM.LIZLLL(new AwS580S0100000_1(function0, (Function0<Unit>) 192));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C03O0.LIZ.getClass();
        LIZ.getClass();
        if (LIZIZ(paymentMethod)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C03O0.LIZIZ);
            linkedHashMap.put("popup_name", "payment_voucher");
            if (paymentMethod == null || (str3 = paymentMethod.id) == null) {
                str3 = "";
            }
            linkedHashMap.put("payment_method_id", str3);
            if (paymentMethod == null) {
                strLJJIIZ = "";
            } else {
                strLJJIIZ = paymentMethod.LJJIIZ();
            }
            linkedHashMap.put("pay_type", strLJJIIZ);
            if (paymentMethod == null || (recoveryMarketingInfo3 = paymentMethod.recoveryMarketingInfo) == null || (str4 = recoveryMarketingInfo3.voucherId) == null) {
                str4 = "";
            }
            linkedHashMap.put("coupon_id", str4);
            if (paymentMethod == null || (recoveryMarketingInfo2 = paymentMethod.recoveryMarketingInfo) == null || (str5 = recoveryMarketingInfo2.tipTitle) == null) {
                str5 = "";
            }
            linkedHashMap.put("coupon_name", str5);
            if (paymentMethod != null && (recoveryMarketingInfo = paymentMethod.recoveryMarketingInfo) != null && (str6 = recoveryMarketingInfo.tipContent) != null) {
                str7 = str6;
            }
            linkedHashMap.put("content", str7);
            C03O0.LLF("tiktokec_popup_show", linkedHashMap);
        }
    }
}
