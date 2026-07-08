package X;

import com.ss.android.ugc.aweme.search.ecom.data.Product;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0PpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656620PpE {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Product product) {
        String str;
        String str2;
        Integer num = product.currencyShowMode;
        if (num != null && num.intValue() == 2) {
            str = product.currency;
        } else {
            str = product.currencySymbol;
        }
        if (str == null || product.formatPriceNumber == null || (str2 = product.formatDiscount) == null || a0.LJJJIL(str2)) {
            return false;
        }
        return true;
    }
}
