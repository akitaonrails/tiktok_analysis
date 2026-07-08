package X;

/* JADX INFO: renamed from: X.0uZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709040uZi {
    public static final String LIZ(EnumC1709020uZg enumC1709020uZg) {
        int i = C1709030uZh.LIZ[enumC1709020uZg.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "ecp_payment_method";
                        }
                        throw new C1954807lC();
                    }
                    return "one_step_checkout";
                }
                return "secondary_payment_method";
            }
            return "payment_method";
        }
        return "order_submit";
    }
}
