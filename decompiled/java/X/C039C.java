package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.039C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039C extends C1002203vw<OrderSubmitAssemViewModel> implements C039H {
    @Override // X.C039H
    public final int UW() {
        return EnumC882203ca.CONTINUE.ordinal();
    }

    @Override // X.C039H
    public final HashMap<String, Object> hi1(boolean z) {
        HashMap<String, Object> map;
        List<ShopOrderNew> list;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list2;
        MainOrderInfo mainOrderInfo;
        List<PackedSku> list3;
        PackedSku packedSku;
        String str;
        BillInfoData billInfoData = LIZ().LLJJI;
        if (billInfoData != null) {
            map = C7806033c.LJIIIIZZ(billInfoData, LIZ(), z);
        } else {
            map = new HashMap<>();
        }
        BillInfoData billInfoData2 = LIZ().LLJJI;
        if (billInfoData2 != null && (list = billInfoData2.newShopOrders) != null && (shopOrderNew = (ShopOrderNew) C13LP.LJJJLL(list)) != null && (list2 = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) C13LP.LJJJLL(list2)) != null && (list3 = mainOrderInfo.packedSkus) != null && (packedSku = (PackedSku) C13LP.LJJJLL(list3)) != null && (str = packedSku.skuId) != null) {
            map.put("sku_id", str);
        }
        return map;
    }

    @Override // X.C039H
    public final SpannableStringBuilder JZ0(Context context, AnonymousClass0376 anonymousClass0376) {
        return C039F.LIZ(context, anonymousClass0376, EnumC803903Cb.HAS_ICON);
    }
}
