package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CheckoutDestinationInput;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D7V, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7V {
    public static final String LIZ(CheckoutSession checkoutSession) {
        Object obj;
        Object obj2;
        String str;
        String string;
        Map map;
        if (checkoutSession != null) {
            obj = checkoutSession.ucp;
        } else {
            obj = null;
        }
        if ((obj instanceof Map) && (map = (Map) obj) != null) {
            obj2 = map.get("jwt_token");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof String) || (str = (String) obj2) == null || (string = a0.LJLIIIL(str).toString()) == null || a0.LJJJIL(string)) {
            return null;
        }
        return string;
    }

    public static final long LIZIZ(CheckoutSession checkoutSession) {
        Object obj;
        Long lLJIILIIL;
        Map map;
        Object obj2 = null;
        if (checkoutSession != null) {
            obj = checkoutSession.ucp;
        } else {
            obj = null;
        }
        if ((obj instanceof Map) && (map = (Map) obj) != null) {
            obj2 = map.get("tiktok_order_id");
        }
        if (obj2 instanceof Number) {
            return ((Number) obj2).longValue();
        }
        if ((obj2 instanceof String) && (lLJIILIIL = C2095008Iq.LJIILIIL((String) obj2)) != null) {
            return lLJIILIIL.longValue();
        }
        return 0L;
    }

    public static final CheckoutDestinationInput LIZJ(CheckoutStoredUserAddress checkoutStoredUserAddress) {
        String str = checkoutStoredUserAddress.firstName;
        String str2 = checkoutStoredUserAddress.lastName;
        String formattedPhoneNumber = checkoutStoredUserAddress.getFormattedPhoneNumber();
        String str3 = checkoutStoredUserAddress.streetAddress;
        String str4 = checkoutStoredUserAddress.extendedAddress;
        String str5 = null;
        if (str4 != null) {
            if (a0.LJJJIL(str4)) {
                str4 = null;
            }
            str5 = str4;
        }
        String str6 = checkoutStoredUserAddress.city;
        String str7 = checkoutStoredUserAddress.state;
        String str8 = checkoutStoredUserAddress.zipCode;
        String str9 = checkoutStoredUserAddress.countryCode;
        String str10 = checkoutStoredUserAddress.email;
        if (str10 == null) {
            str10 = "";
        }
        return new CheckoutDestinationInput(str, str2, formattedPhoneNumber, str3, str5, str6, str7, str8, str9, str10);
    }
}
