package X;

import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import java.util.List;

/* JADX INFO: renamed from: X.18PV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18PV {
    public static int LIZ(VSACardsResponse.VSACardData vSACardData) {
        List<EcUgProduct> list;
        int size;
        int iIntValue;
        Integer num;
        if (vSACardData == null || (list = vSACardData.productList) == null || (size = list.size()) <= 0) {
            return 0;
        }
        if (vSACardData != null && (num = vSACardData.maxShowNum) != null && num.intValue() > 0 && num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 3;
        }
        if (iIntValue < size) {
            return iIntValue;
        }
        return size;
    }
}
