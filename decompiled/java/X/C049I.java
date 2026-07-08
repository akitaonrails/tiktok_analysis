package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import java.util.List;

/* JADX INFO: renamed from: X.049I, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C049I {
    public static final HeaderBannerDaInfo LIZ(ProductPackStruct productPackStruct) {
        int size;
        String strLIZIZ = "";
        int i = 0;
        if (productPackStruct == null) {
            C1AF0.LIZJ("the user right da info is null");
            return new HeaderBannerDaInfo(0, "");
        }
        List<ProductBannerLabel> list = productPackStruct.productBannerLabel;
        if (list != null) {
            size = list.size();
            for (ProductBannerLabel productBannerLabel : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(productBannerLabel.eventTrackingName);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (i < size - 1) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(',');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            size = 0;
        }
        return new HeaderBannerDaInfo(size, strLIZIZ);
    }
}
