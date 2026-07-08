package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;

/* JADX INFO: renamed from: X.07on, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1977107on extends LruCache<String, RelatedProductInfo> {
    public C1977107on() {
        super(20);
    }

    public static String LIZ(String str, String str2) {
        if (str2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return String.valueOf(str);
    }
}
