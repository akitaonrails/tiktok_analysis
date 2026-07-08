package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.CouponCache;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.02ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C732802ta {
    public static final Map<String, CouponCache> LIZ = new LinkedHashMap();

    public static List LIZ(SkuVoucher skuVoucher) {
        List<String> list;
        Integer numValueOf;
        ArrayList arrayList = null;
        if (skuVoucher != null && (list = skuVoucher.bestVoucherTypeIds) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                if (C703302op.LIZ(str)) {
                    arrayList2.add(str);
                }
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                CouponCache couponCache = (CouponCache) ((LinkedHashMap) LIZ).get(obj);
                if (couponCache == null || (numValueOf = Integer.valueOf(couponCache.getClaimStatus())) == null || (numValueOf.intValue() != 3 && numValueOf.intValue() != 4)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static List LIZIZ(SkuVoucher skuVoucher) {
        List<VoucherMeta> list;
        Integer numValueOf;
        ArrayList arrayList = null;
        if (skuVoucher != null && (list = skuVoucher.bestVoucherMetas) != null) {
            arrayList = new ArrayList();
            for (VoucherMeta voucherMeta : list) {
                VoucherMeta voucherMeta2 = voucherMeta;
                String str = voucherMeta2.voucherTypeId;
                if (str != null && !a0.LJJJIL(str)) {
                    CouponCache couponCache = (CouponCache) ((LinkedHashMap) LIZ).get(LIZJ(voucherMeta2.voucherTypeId, voucherMeta2.instanceKey));
                    if (couponCache == null || (numValueOf = Integer.valueOf(couponCache.getClaimStatus())) == null || (numValueOf.intValue() != 3 && numValueOf.intValue() != 4)) {
                        arrayList.add(voucherMeta);
                    }
                }
            }
        }
        return arrayList;
    }

    public static String LIZJ(String str, String str2) {
        if (str2 != null && !a0.LJJJIL(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LIZLLL(int i, String str, String str2, String str3) {
        LIZ.put(LIZJ(str, str2), new CouponCache(str3, str, i, System.currentTimeMillis()));
    }
}
