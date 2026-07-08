package X;

import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18Q8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Q8 {
    public static boolean LIZ(EcUgProduct ecUgProduct) {
        if (ecUgProduct != null) {
            Float f = ecUgProduct.productRating;
            if (f == null || f.floatValue() <= 0.0f) {
                String str = ecUgProduct.soldCountStr;
                if (str != null && !a0.LJJJIL(str)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
