package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.ecommerce.service.HostAddressSnapshot;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334940DBc {
    public static final /* synthetic */ int LIZ = 0;

    public static CheckoutStoredUserAddress LIZ(HostAddressSnapshot hostAddressSnapshot) {
        String str;
        if (hostAddressSnapshot != null && (str = hostAddressSnapshot.email) != null && !a0.LJJJIL(str)) {
            return new CheckoutStoredUserAddress(hostAddressSnapshot.id, hostAddressSnapshot.firstName, hostAddressSnapshot.lastName, hostAddressSnapshot.streetAddress, hostAddressSnapshot.extendedAddress, hostAddressSnapshot.city, hostAddressSnapshot.state, hostAddressSnapshot.zipCode, hostAddressSnapshot.countryCode, hostAddressSnapshot.phoneCountryCallingCode, hostAddressSnapshot.phoneNumber, hostAddressSnapshot.email, Boolean.valueOf(hostAddressSnapshot.isDefault()), hostAddressSnapshot.deliveryInstructions, Long.valueOf(System.currentTimeMillis()));
        }
        return null;
    }
}
