package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.039A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039A extends C1002203vw<OrderSubmitAssemViewModel> implements C039H {
    @Override // X.C039H
    public final int UW() {
        return EnumC882203ca.SAVE.ordinal();
    }

    @Override // X.C039H
    public final HashMap<String, Object> hi1(boolean z) {
        HashMap<String, Object> map;
        PlatformPromotion platformPromotion;
        PromotionBanner promotionBanner;
        BillInfoData billInfoData = LIZ().LLJJI;
        if (billInfoData != null) {
            map = C7806033c.LJIIIIZZ(billInfoData, LIZ(), z);
        } else {
            map = new HashMap<>();
        }
        BillInfoData billInfoData2 = LIZ().LLJJI;
        String str = null;
        if (billInfoData2 != null && (platformPromotion = billInfoData2.platformPromotion) != null && (promotionBanner = platformPromotion.promotionBanner) != null) {
            str = promotionBanner.daInfo;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = mapLJIIJ.get("currency");
            if (obj != null) {
                linkedHashMap.put("currency", obj);
            }
            Object obj2 = mapLJIIJ.get("discounted_amount");
            if (obj2 != null) {
                linkedHashMap.put("discounted_amount", obj2);
            }
            map.putAll(linkedHashMap);
        }
        return map;
    }

    @Override // X.C039H
    public final SpannableStringBuilder JZ0(Context context, AnonymousClass0376 anonymousClass0376) {
        return new SpannableStringBuilder("");
    }
}
