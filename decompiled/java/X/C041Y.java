package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.041Y, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C041Y {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(ProductPackStruct productPackStruct, String[] strArr) {
        boolean z;
        SaleProp next;
        List<SalePropValue> list;
        List<Image> list2;
        List<Image> list3;
        int size = 0;
        if (strArr != null && strArr.length != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (productPackStruct.LJIIIIZZ(productPackStruct.bizType)) {
            List<SaleProp> list4 = productPackStruct.saleProps;
            if (list4 != null) {
                Iterator<SaleProp> it2 = list4.iterator();
                boolean z2 = true;
                while (it2.hasNext()) {
                    List<SalePropValue> list5 = it2.next().salePropValueList;
                    if (list5 != null && list5.size() > 1) {
                        Iterator<SalePropValue> it3 = list5.iterator();
                        while (it3.hasNext()) {
                            if (C13LQ.LJJIJIIJI(it3.next().propValueId, strArr) >= 0) {
                                z2 = false;
                            }
                        }
                    }
                }
                if (z2 || C041G.LJ(C13LQ.LJJLL(strArr), false, productPackStruct.saleProps, productPackStruct.skus) == null) {
                    return 0;
                }
                ProductBase productBase = productPackStruct.baseInfo;
                if (productBase != null && (list3 = productBase.images) != null) {
                    size = list3.size();
                }
                return Integer.valueOf(size);
            }
            return 0;
        }
        List<SaleProp> list6 = productPackStruct.saleProps;
        if (list6 != null) {
            Iterator<SaleProp> it4 = list6.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    if (Intrinsics.LJFF(next.hasImage, Boolean.TRUE)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SaleProp saleProp = next;
            if (saleProp != null && (list = saleProp.salePropValueList) != null && list.size() > 1) {
                int i = 0;
                for (SalePropValue salePropValue : list) {
                    if (salePropValue.image != null) {
                        i++;
                    }
                    if (C13LQ.LJJIJIIJI(salePropValue.propValueId, strArr) >= 0) {
                        ProductBase productBase2 = productPackStruct.baseInfo;
                        if (productBase2 != null && (list2 = productBase2.images) != null) {
                            size = list2.size();
                        }
                        return Integer.valueOf((size + i) - 1);
                    }
                }
            }
        }
        return null;
    }
}
