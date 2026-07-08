package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutTotal;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.payment.CheckoutPipoRefreshParamsConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D9U, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9U {
    public static final /* synthetic */ int LIZ = 0;

    public static CheckoutPipoRefreshParamsConfig LIZJ() {
        return (CheckoutPipoRefreshParamsConfig) C0D5A.LIZIZ.getValue();
    }

    public static String LIZ() {
        String upperCase = a0.LJLIIIL(LIZJ().currency).toString().toUpperCase(Locale.ROOT);
        return upperCase.length() == 0 ? "USD" : upperCase;
    }

    public static C0D9Y LIZIZ(boolean z) {
        boolean z2;
        String str = LIZJ().host;
        String str2 = LIZJ().merchantId;
        String str3 = LIZJ().countryOrRegion;
        Map<String, C0D4U> map = C2273421Dye.LIZ;
        String str4 = C2273421Dye.LIZIZ(LIZ(), Integer.valueOf(LIZJ().amountInCents), 100).plainText;
        String strLIZ = LIZ();
        String str5 = LIZJ().partnerPlatform;
        String str6 = LIZJ().googlePayGateway;
        String str7 = LIZJ().googlePayGatewayMerchantId;
        InterfaceC332180D0m.LIZ.getClass();
        if (Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.checkout_payment_use_row", "false"), "true")) {
            z2 = true;
        } else {
            z2 = LIZJ().needMock;
        }
        return new C0D9Y(str, str2, str3, str4, strLIZ, str5, str6, str7, z2, LIZJ().forceFilterGooglePay, "", z);
    }

    public static String LJ(CheckoutSession checkoutSession) {
        String string;
        String str;
        if (checkoutSession == null || (str = checkoutSession.currency) == null || (string = a0.LJLIIIL(str).toString()) == null) {
            string = "";
        }
        String upperCase = string.toUpperCase(Locale.ROOT);
        if (upperCase.length() == 0) {
            return LIZ();
        }
        return upperCase;
    }

    public static C334590D9t LJFF(CheckoutSession checkoutSession) {
        CheckoutTotal next;
        Integer num;
        List<CheckoutTotal> list = checkoutSession.totals;
        if (list != null) {
            Iterator<CheckoutTotal> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.type, "total")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            CheckoutTotal checkoutTotal = next;
            if (checkoutTotal != null && (num = checkoutTotal.amount) != null) {
                int iIntValue = num.intValue();
                Map<String, C0D4U> map = C2273421Dye.LIZ;
                return C2273421Dye.LIZIZ(LJ(checkoutSession), Integer.valueOf(iIntValue), 100);
            }
        }
        return null;
    }

    public static C0D9Y LIZLLL(C0D9Y c0d9y, String str, String str2, int i) {
        String str3 = str;
        String str4 = null;
        if ((i & 2) != 0) {
            str3 = null;
        }
        if ((i & 8) == 0) {
            str4 = str2;
        }
        if (str3 == null) {
            str3 = c0d9y.LIZLLL;
        }
        String str5 = c0d9y.LIZJ;
        if (str4 == null) {
            str4 = c0d9y.LJIIJ;
        }
        return new C0D9Y(c0d9y.LIZ, c0d9y.LIZIZ, str5, str3, c0d9y.LJ, c0d9y.LJFF, c0d9y.LJI, c0d9y.LJII, c0d9y.LJIIIIZZ, c0d9y.LJIIIZ, str4, c0d9y.LJIIJJI);
    }
}
