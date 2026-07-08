package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C839403Ps {
    public static Pair LIZ(BillInfoData billInfoData) {
        boolean z;
        int i;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<ShopOrderNew> list = billInfoData.newShopOrders;
        if (list != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list3 = it3.next().packedSkus;
                        if (list3 != null) {
                            for (PackedSku packedSku : list3) {
                                String str3 = packedSku.productId;
                                if (str3 != null) {
                                    arrayList.add(str3);
                                    PlatformLinkInfo platformLinkInfo = packedSku.platformLinkInfo;
                                    if (platformLinkInfo != null && (str2 = platformLinkInfo.productId) != null) {
                                        str3 = str2;
                                    }
                                    arrayList3.add(str3);
                                    PlatformLinkInfo platformLinkInfo2 = packedSku.platformLinkInfo;
                                    if (platformLinkInfo2 != null && (str = platformLinkInfo2.productId) != null) {
                                        arrayList2.add(str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, null, null, null, 0, null, null, 63);
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList3, null, null, null, 0, null, null, 63);
        if (strLJJLIIIJ != null && strLJJLIIIJ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 0;
        } else if (Intrinsics.LJFF(strLJJLIIIJ, strLJJLIIIJ2)) {
            i = 1;
        } else {
            i = 2;
        }
        return new Pair(C1697810uHb.LJIILJJIL(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63), strLJJLIIIJ, strLJJLIIIJ2), Integer.valueOf(i));
    }

    public static String LIZIZ(BillInfoData billInfoData) {
        StringBuilder sb = new StringBuilder();
        List<ShopOrderNew> list = billInfoData.newShopOrders;
        if (list != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        LIZLLL(sb, it3.next().packedSkus);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String LIZJ(BillInfoData billInfoData) {
        StringBuilder sb = new StringBuilder();
        List<ShopOrderNew> list = billInfoData.newShopOrders;
        if (list != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        LIZLLL(sb, it3.next().packedSkus);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static Integer LJ(BillInfoData billInfoData) {
        List<PackedSku> list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AddonOrder addonOrder = billInfoData.addonOrder;
        if (addonOrder != null && (list = addonOrder.packedSkus) != null) {
            Iterator<PackedSku> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer num = it2.next().bizType;
                if (num != null) {
                    linkedHashSet.add(Integer.valueOf(num.intValue()));
                }
            }
        }
        List<ShopOrderNew> list2 = billInfoData.newShopOrders;
        if (list2 != null) {
            Iterator<ShopOrderNew> it3 = list2.iterator();
            while (it3.hasNext()) {
                List<MainOrderInfo> list3 = it3.next().mainOrderInfos;
                if (list3 != null) {
                    Iterator<MainOrderInfo> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        List<PackedSku> list4 = it4.next().packedSkus;
                        if (list4 != null) {
                            Iterator<PackedSku> it5 = list4.iterator();
                            while (it5.hasNext()) {
                                Integer num2 = it5.next().bizType;
                                if (num2 != null) {
                                    linkedHashSet.add(Integer.valueOf(num2.intValue()));
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean zContains = linkedHashSet.contains(Integer.valueOf(EnumC955203oM.TTS.getBizType()));
        boolean zContains2 = linkedHashSet.contains(Integer.valueOf(EnumC955203oM.TTF.getBizType()));
        if (zContains) {
            if (zContains2) {
                return EnumC839503Pt.HYBRID.getType();
            }
            return EnumC839503Pt.TTS.getType();
        }
        if (zContains2) {
            return EnumC839503Pt.TTF.getType();
        }
        return EnumC839503Pt.DEFAULT.getType();
    }

    public static void LIZLLL(StringBuilder sb, List list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        int i = 0;
        if (size > 0 && sb.length() > 0) {
            sb.append(",");
        }
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = ((PackedSku) obj).productId;
                if (str != null) {
                    sb.append(str);
                    if (i < size - 1) {
                        sb.append(",");
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
