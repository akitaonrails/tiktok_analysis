package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242900iRs {
    public static final C1242900iRs LIZ = new C1242900iRs();
    public static String LIZIZ;
    public static String LIZJ;

    public static String LIZ() {
        String str = LIZJ;
        if (str != null && !a0.LJJJIL(str)) {
            return str;
        }
        C1242820iRk.LIZ.getClass();
        int iLIZLLL = C1242820iRk.LIZ().LIZLLL();
        IECommerceService.LIZ.getClass();
        return iLIZLLL == 0 ? "order_center" : "my_order";
    }

    public static String LIZIZ(Context context) {
        int i;
        String str = LIZIZ;
        if (str != null && !a0.LJJJIL(str)) {
            return str;
        }
        int i2 = 2131850855;
        if (context != null) {
            C1242820iRk.LIZ.getClass();
            int iLIZLLL = C1242820iRk.LIZ().LIZLLL();
            IECommerceService.LIZ.getClass();
            if (iLIZLLL == 0) {
                i = 2131850855;
            } else {
                i = 2131850854;
            }
            String string = context.getString(i);
            if (string != null) {
                return string;
            }
        }
        C1242820iRk.LIZ.getClass();
        int iLIZLLL2 = C1242820iRk.LIZ().LIZLLL();
        IECommerceService.LIZ.getClass();
        if (iLIZLLL2 != 0) {
            i2 = 2131850854;
        }
        return C1216270hkv.LIZJ(i2);
    }
}
