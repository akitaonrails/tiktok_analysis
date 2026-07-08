package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.03zK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1023203zK {
    public static String LIZ(PurchaseLimit purchaseLimit, String str) {
        String strLIZ;
        if (purchaseLimit != null) {
            strLIZ = purchaseLimit.LIZ(str);
        } else {
            strLIZ = null;
        }
        if (C123100dR.LIZ(strLIZ)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
