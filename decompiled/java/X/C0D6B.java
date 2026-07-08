package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import java.util.Map;

/* JADX INFO: renamed from: X.0D6B, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6B {
    public static final Long LIZ(CheckoutSession checkoutSession) {
        Object obj;
        Object obj2;
        Long lLJIILIIL;
        Map map;
        if (checkoutSession != null) {
            obj = checkoutSession.ucp;
        } else {
            obj = null;
        }
        if ((obj instanceof Map) && (map = (Map) obj) != null) {
            obj2 = map.get("tiktok_order_id");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Number) {
            Long lValueOf = Long.valueOf(((Number) obj2).longValue());
            if (lValueOf.longValue() > 0) {
                return lValueOf;
            }
        } else if ((obj2 instanceof String) && (lLJIILIIL = C2095008Iq.LJIILIIL((String) obj2)) != null && lLJIILIIL.longValue() > 0) {
            return lLJIILIIL;
        }
        return null;
    }

    public static final boolean LIZIZ(CheckoutIntent checkoutIntent) {
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        if (checkoutIntent == null || (map = checkoutIntent.passThrough) == null || (str = map.get("protocol_type")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 1) {
            return false;
        }
        return true;
    }
}
