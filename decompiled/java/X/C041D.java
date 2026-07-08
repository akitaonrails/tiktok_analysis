package X;

import java.util.Map;

/* JADX INFO: renamed from: X.041D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C041D {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Integer num, Map map) {
        Object obj;
        String str;
        if (map != null && (obj = map.get("source_button")) != null) {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                return (String) obj;
            }
        }
        if (num != null) {
            if (num.intValue() == 0) {
                return "select_sku_specs";
            }
            if (num.intValue() != 2 && num.intValue() != 8 && num.intValue() != 7) {
                if (num.intValue() == 1) {
                    return "buy_now";
                }
                if (num.intValue() == 3) {
                    return "cart_select_sku_specs";
                }
                if (num.intValue() == 4) {
                    return "recall_box";
                }
                if (num.intValue() == 5) {
                    return "bottom_bar";
                }
                if (num.intValue() == 10) {
                    return "cart_replace_unavailable_sku";
                }
                if (num.intValue() == 9) {
                    return "top_voucher_remind";
                }
                if (num.intValue() == 13) {
                    return "free_shipping_addon";
                }
                if (num.intValue() == 14) {
                    return "set_up_subscription";
                }
                if (num.intValue() == 16) {
                    return "oos_sku";
                }
                return "unknow";
            }
            return "add_to_cart";
        }
        return "unknow";
    }
}
