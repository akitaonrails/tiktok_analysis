package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03g5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C903903g5 implements InterfaceC905003gG {
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("eg_pi_vnatmcard_c_d_issue_date_card_number", "eg_pi_vnatmcard_c_d_expiration_date_card_number");
    public final C903703g3 LIZ;

    public C903903g5(C903703g3 c903703g3) {
        this.LIZ = c903703g3;
    }

    @Override // X.InterfaceC905003gG
    public final C904003g6 LIZ(String... strArr) {
        boolean z;
        String str;
        int[] iArr;
        String str2;
        C904003g6 c904003g6 = new C904003g6(0);
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if (!z) {
            str = strArr[0];
        } else {
            str = null;
        }
        BankCardRule bankCardRuleLIZ = this.LIZ.LIZ(str);
        if (bankCardRuleLIZ != null) {
            str3 = bankCardRuleLIZ.paymentMethodId;
        }
        PaymentMethod paymentMethodLIZIZ = this.LIZ.LIZIZ(str);
        if (str != null && str.length() != 0) {
            if (str3 != null && paymentMethodLIZIZ == null) {
                c904003g6.LIZJ("pipo_common_error_card_not_supported", new String[0]);
            } else if (paymentMethodLIZIZ != null) {
                C903703g3 c903703g3 = this.LIZ;
                String str4 = paymentMethodLIZIZ.id;
                ConcurrentHashMap<String, BankCardRule> concurrentHashMap = c903703g3.LIZIZ;
                if (str4 == null) {
                    str4 = "";
                }
                BankCardRule bankCardRule = concurrentHashMap.get(str4);
                if (bankCardRule != null && (iArr = bankCardRule.cardBrandLength) != null && C13LQ.LJJIJ(str.length(), iArr) >= 0) {
                    if (!Pattern.matches("^[0-9]+$", str)) {
                        c904003g6.LIZJ("pipo_common_error_card_check", new String[0]);
                        return c904003g6;
                    }
                    if (!C904903gF.LIZ(str)) {
                        c904003g6.LIZJ("pipo_common_error_card_number", new String[0]);
                        return c904003g6;
                    }
                    Availability availability = paymentMethodLIZIZ.availability;
                    if (availability == null || !Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE)) {
                        PaymentTip paymentTip = paymentMethodLIZIZ.paymentTip;
                        if (paymentTip != null && (str2 = paymentTip.tips) != null && str2.length() != 0) {
                            c904003g6.LIZ = str2;
                            return c904003g6;
                        }
                        c904003g6.LIZJ("pipo_common_error_card_not_supported", new String[0]);
                        return c904003g6;
                    }
                } else {
                    c904003g6.LIZJ("pipo_common_error_card_number_length", new String[0]);
                    return c904003g6;
                }
            } else {
                c904003g6.LIZJ("pipo_common_error_card_number", new String[0]);
                return c904003g6;
            }
            return c904003g6;
        }
        c904003g6.LIZJ("pipo_common_error_required_field", "pipo_common_payin_card_number");
        return c904003g6;
    }
}
