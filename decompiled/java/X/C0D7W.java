package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CheckoutDestinationInput;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D7W, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7W {
    public static final CheckoutDestinationInput LIZ(CheckoutStoredUserAddress checkoutStoredUserAddress) {
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
        return new CheckoutDestinationInput(str, str2, formattedPhoneNumber, str3, str5, checkoutStoredUserAddress.city, checkoutStoredUserAddress.state, checkoutStoredUserAddress.zipCode, checkoutStoredUserAddress.countryCode, null);
    }
}
