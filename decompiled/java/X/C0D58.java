package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutLineItemContext;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D58, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D58 {
    public static String LIZIZ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && (!a0.LJJJIL(string))) {
            return string;
        }
        return null;
    }

    public static C0D53 LIZ(LocalOrderWrapper localOrderWrapper, CheckoutIntent checkoutIntent) {
        Map<String, String> mapLJ;
        CheckoutIntent checkoutIntent2;
        Map<String, String> mapLJ2;
        String strLIZIZ;
        String str;
        List<CheckoutLineItemContext> list;
        CheckoutLineItemContext checkoutLineItemContext;
        List<CheckoutLineItemContext> list2;
        CheckoutLineItemContext checkoutLineItemContext2;
        String trackingOrderId = localOrderWrapper.getTrackingOrderId();
        String str2 = null;
        if (trackingOrderId == null) {
            return null;
        }
        CheckoutIntent resolvedCheckoutIntent = localOrderWrapper.getResolvedCheckoutIntent();
        if (resolvedCheckoutIntent == null || (mapLJ = resolvedCheckoutIntent.passThrough) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if ((checkoutIntent == null || (mapLJ2 = checkoutIntent.passThrough) == null) && ((checkoutIntent2 = localOrderWrapper.checkoutIntent) == null || (mapLJ2 = checkoutIntent2.passThrough) == null)) {
            mapLJ2 = C2097608Jq.LJ();
        }
        String trackingCreativeID = localOrderWrapper.getTrackingCreativeID();
        if (trackingCreativeID == null && (trackingCreativeID = LIZIZ(mapLJ2.get("creative_id"))) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("order:");
            sbLIZ.append(localOrderWrapper.getStableDisplayId());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = trackingCreativeID;
        }
        String trackingLogExtra = localOrderWrapper.getTrackingLogExtra();
        if (trackingLogExtra == null && (trackingLogExtra = LIZIZ(mapLJ2.get("log_extra"))) == null) {
            trackingLogExtra = "";
        }
        if (!mapLJ.isEmpty()) {
            mapLJ2 = mapLJ;
        }
        if (resolvedCheckoutIntent != null && (list2 = resolvedCheckoutIntent.items) != null && (checkoutLineItemContext2 = (CheckoutLineItemContext) C13LP.LJJJLL(list2)) != null) {
            str = checkoutLineItemContext2.productId;
        } else {
            str = null;
        }
        String strLIZIZ2 = LIZIZ(str);
        if (resolvedCheckoutIntent != null && (list = resolvedCheckoutIntent.items) != null && (checkoutLineItemContext = (CheckoutLineItemContext) C13LP.LJJJLL(list)) != null) {
            str2 = checkoutLineItemContext.variantId;
        }
        return new C0D53(strLIZIZ, trackingCreativeID, trackingLogExtra, trackingOrderId, strLIZIZ2, LIZIZ(str2), mapLJ2);
    }
}
