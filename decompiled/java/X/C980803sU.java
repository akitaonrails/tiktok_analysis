package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C980803sU {
    public static final C980803sU LIZ = new C980803sU();
    public static final Map<String, List<String>> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("/api/v1/shop/product_info/get", C1697810uHb.LJIIJJI("product_detail", "sku")), new Pair("/api/v1/shop/bill_info/get", C1697810uHb.LJIIJJI("order_submit", "payment_method")), new Pair("/api/v1/shop/shipping_address/get", Collections.singletonList("shipping_info")), new Pair("/api/v1/shop/shipping_address/input_item", Collections.singletonList("shipping_address")), new Pair("/api/v1/shop/logistic/list", Collections.singletonList("logistics")), new Pair("/api/v1/im/shop_creator/creator/conversation_inbox_api/list", Collections.singletonList("shop_message")));
}
