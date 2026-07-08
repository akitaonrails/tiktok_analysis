package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C888803de {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2, List list, List list2) {
        BankCardRule bankCardRule;
        String str3;
        String str4;
        int[] iArr;
        int[] iArr2;
        int iLJ;
        int[] iArr3;
        Object next;
        C03SY.LIZ.getClass();
        if (C03SY.LJIJI(str)) {
            str = C03SY.LIZIZ(str);
        }
        Integer numValueOf = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((BankCardRule) next).paymentMethodId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            bankCardRule = (BankCardRule) next;
        } else {
            bankCardRule = null;
        }
        PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, list2);
        if (paymentElement != null) {
            str3 = paymentElement.paramValue;
        } else {
            str3 = null;
        }
        PaymentElement paymentElement2 = (PaymentElement) C13LP.LJJJLZIJ(1, list2);
        if (paymentElement2 != null) {
            str4 = paymentElement2.paramValue;
        } else {
            str4 = null;
        }
        if (str2 == null) {
            return false;
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != -1030054939) {
            if (iHashCode != 37481866) {
                if (iHashCode != 2072584063 || !str2.equals("eg_ccdc_global_card_number")) {
                    return false;
                }
                if (bankCardRule != null && (iArr3 = bankCardRule.cardBrandLength) != null && iArr3.length == 1) {
                    if (str3 != null) {
                        numValueOf = Integer.valueOf(str3.length());
                    }
                    return Intrinsics.LJFF(numValueOf, C13LQ.LJJIIJ(0, bankCardRule.cardBrandLength));
                }
                if (str3 == null) {
                    return false;
                }
                int length = str3.length();
                if (bankCardRule == null || (iArr2 = bankCardRule.cardBrandLength) == null || C13LQ.LJJIJ(length, iArr2) < 0) {
                    return false;
                }
                try {
                    SettingsManager.LIZLLL().getClass();
                    iLJ = SettingsManager.LJ("ecom_ccdc_auto_focus_limit", 0);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    iLJ = 0;
                }
                if (length < iLJ) {
                    return false;
                }
                return true;
            }
            if (!str2.equals("eg_ccdc_global_cvv") || bankCardRule == null || (iArr = bankCardRule.cvvLength) == null || iArr.length != 1) {
                return false;
            }
            if (str3 != null) {
                numValueOf = Integer.valueOf(str3.length());
            }
            return Intrinsics.LJFF(numValueOf, C13LQ.LJJIIJ(0, bankCardRule.cvvLength));
        }
        if (!str2.equals("eg_ccdc_global_expiration_date") || str3 == null || str3.length() != 2 || str4 == null || str4.length() != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x015c A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0012, B:8:0x0020, B:9:0x0022, B:11:0x0034, B:15:0x003e, B:17:0x0047, B:19:0x004d, B:21:0x0059, B:22:0x005b, B:24:0x0063, B:25:0x0065, B:27:0x006d, B:28:0x0074, B:30:0x0078, B:31:0x007e, B:33:0x0082, B:40:0x0092, B:44:0x0099, B:47:0x00a1, B:49:0x00a9, B:51:0x00af, B:53:0x00b7, B:54:0x00b9, B:59:0x00cf, B:61:0x00d7, B:62:0x00d9, B:67:0x00ef, B:68:0x00f1, B:71:0x00f9, B:73:0x00fd, B:75:0x0103, B:76:0x0107, B:78:0x010d, B:84:0x0123, B:86:0x0127, B:88:0x012d, B:89:0x0131, B:91:0x0137, B:99:0x0151, B:103:0x015c, B:107:0x016a, B:108:0x016c, B:110:0x0170, B:112:0x017b, B:113:0x017f, B:115:0x0193), top: B:122:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r9, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r10, java.util.List r11, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r12) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C888803de.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.util.List, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData):java.lang.String");
    }
}
