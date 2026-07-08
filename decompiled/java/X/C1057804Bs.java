package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.04Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1057804Bs {
    public static final void LIZ(ProductPackStruct productPackStruct) {
        List<Image> list;
        ProductBase productBase = productPackStruct.baseInfo;
        if (productBase == null || (list = productBase.images) == null || list.isEmpty()) {
            C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_FIELD_VALIDATION_ERROR, null, C2097908Jt.LIZJ(new Pair("product_base_header_image", "empty value")));
        }
    }
}
