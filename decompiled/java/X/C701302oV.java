package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02oV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C701302oV {
    public static final /* synthetic */ int LIZ = 0;

    public static SnsInfo LIZ(BillInfoData billInfoData, String str) {
        List<ShopOrderNew> list;
        String str2;
        if (billInfoData != null && (list = billInfoData.newShopOrders) != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list3 = it3.next().packedSkus;
                        if (list3 != null) {
                            for (PackedSku packedSku : list3) {
                                if (packedSku != null && (str2 = packedSku.skuId) != null && Intrinsics.LJFF(str2, str)) {
                                    SnsInfo snsInfo = packedSku.snsInfo;
                                    if (snsInfo == null) {
                                        return new SnsInfo(null, null, null, null, null, null, null, null, null);
                                    }
                                    return snsInfo;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static SnsInfo LIZIZ(String str, String str2, BillInfoData billInfoData) {
        List<ShopOrderNew> list;
        String str3;
        String str4;
        if (billInfoData == null) {
            return null;
        }
        if (str != null && str.length() != 0) {
            return LIZ(billInfoData, str);
        }
        if (str2 != null && str2.length() != 0 && (list = billInfoData.newShopOrders) != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list3 = it3.next().packedSkus;
                        if (list3 != null) {
                            for (PackedSku packedSku : list3) {
                                if (packedSku != null) {
                                    str3 = packedSku.productId;
                                } else {
                                    str3 = null;
                                }
                                if (Intrinsics.LJFF(str3, str2) && ((str4 = packedSku.skuId) == null || str4.length() == 0)) {
                                    SnsInfo snsInfo = packedSku.snsInfo;
                                    if (snsInfo == null) {
                                        return new SnsInfo(null, null, null, null, null, null, null, null, null);
                                    }
                                    return snsInfo;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
