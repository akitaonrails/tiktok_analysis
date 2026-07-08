package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.02tR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C731902tR {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(List list, String[] strArr) {
        int iIntValue;
        ArrayList arrayList;
        int iIntValue2 = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (!Intrinsics.LJFF(strArr[i], "")) {
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        SkuItem skuItem = (SkuItem) obj;
                        List<SkuSaleProp> list2 = skuItem.skuSalePropList;
                        if (list2 != null && !list2.isEmpty()) {
                            List<SkuSaleProp> list3 = skuItem.skuSalePropList;
                            String str = strArr[i];
                            Iterator<SkuSaleProp> it2 = list3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (Intrinsics.LJFF(it2.next().propValueId, str)) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                list = arrayList;
            }
        }
        if (list != null) {
            iIntValue2 = 0;
            for (SkuItem skuItem2 : list) {
                Integer num = skuItem2.minBuyQuantity;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer num2 = skuItem2.stockNum;
                if (num2 != null && num2.intValue() >= iIntValue) {
                    iIntValue2 += skuItem2.stockNum.intValue();
                }
            }
        }
        return iIntValue2;
    }

    public static Skc LIZIZ(String str, SkcInfo skcInfo) {
        boolean z;
        List<Skc> list;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Skc skc = null;
        if (z || skcInfo == null || (list = skcInfo.skcList) == null) {
            return null;
        }
        Iterator<Skc> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Skc next = it2.next();
            if (Intrinsics.LJFF(next.skcId, str)) {
                skc = next;
                break;
            }
        }
        return skc;
    }

    public static SkuItem LIZJ(String str, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (u.LJIJI(((SkuItem) next).salePropValueIds, str, false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (SkuItem) next;
    }
}
