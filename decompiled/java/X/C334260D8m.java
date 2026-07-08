package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334260D8m {
    public static final ShopifyEcpCheckout.Fulfillment.Method.Destination LIZ(ShopifyEcpCheckout shopifyEcpCheckout) {
        List<ShopifyEcpCheckout.Fulfillment.Method> list;
        ShopifyEcpCheckout.Fulfillment.Method.Destination destination;
        List<ShopifyEcpCheckout.Fulfillment.Method.Destination> list2;
        ShopifyEcpCheckout.Fulfillment.Method.Destination next;
        ShopifyEcpCheckout.Fulfillment fulfillment;
        if (shopifyEcpCheckout == null || (fulfillment = shopifyEcpCheckout.fulfillment) == null || (list = fulfillment.methods) == null) {
            list = C13BV.INSTANCE;
        }
        for (ShopifyEcpCheckout.Fulfillment.Method method : list) {
            String str = method.selectedDestinationId;
            if (str != null && !a0.LJJJIL(str) && (list2 = method.destinations) != null) {
                Iterator<ShopifyEcpCheckout.Fulfillment.Method.Destination> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.id, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ShopifyEcpCheckout.Fulfillment.Method.Destination destination2 = next;
                if (destination2 != null) {
                    return destination2;
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            List<ShopifyEcpCheckout.Fulfillment.Method.Destination> list3 = ((ShopifyEcpCheckout.Fulfillment.Method) it3.next()).destinations;
            if (list3 != null && (destination = (ShopifyEcpCheckout.Fulfillment.Method.Destination) C13LP.LJJJLL(list3)) != null) {
                return destination;
            }
        }
        return null;
    }

    public static final CheckoutStoredUserAddress LIZIZ(ShopifyEcpCheckout shopifyEcpCheckout) {
        ShopifyEcpCheckout.Buyer buyer;
        ShopifyEcpCheckout.Fulfillment.Method.Destination destinationLIZ = LIZ(shopifyEcpCheckout);
        String str = null;
        if (destinationLIZ == null) {
            return null;
        }
        String str2 = destinationLIZ.id;
        String str3 = destinationLIZ.firstName;
        String str4 = destinationLIZ.lastName;
        String str5 = destinationLIZ.streetAddress;
        String str6 = destinationLIZ.extendedAddress;
        String str7 = destinationLIZ.addressLocality;
        String str8 = destinationLIZ.addressRegion;
        String str9 = destinationLIZ.postalCode;
        String str10 = destinationLIZ.addressCountry;
        if (shopifyEcpCheckout != null && (buyer = shopifyEcpCheckout.buyer) != null) {
            str = buyer.email;
        }
        return new CheckoutStoredUserAddress(str2, str3, str4, str5, str6, str7, str8, str9, str10, null, null, str, null, null, null);
    }
}
