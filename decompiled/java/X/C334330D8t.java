package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334330D8t {
    public static final String LIZ(ShopifyEcpCheckout shopifyEcpCheckout) {
        ShopifyEcpCheckout.Payment payment;
        List<ShopifyEcpCheckout.Payment.Instrument> list;
        ShopifyEcpCheckout.Payment.Instrument next;
        String str;
        if (shopifyEcpCheckout != null && (payment = shopifyEcpCheckout.payment) != null && (list = payment.instruments) != null) {
            Iterator<ShopifyEcpCheckout.Payment.Instrument> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.selected, Boolean.TRUE)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ShopifyEcpCheckout.Payment.Instrument instrument = next;
            if (instrument != null && (str = instrument.type) != null && (!a0.LJJJIL(str))) {
                return str;
            }
        }
        return null;
    }
}
