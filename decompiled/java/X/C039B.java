package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.039B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C039B extends C1002203vw<OrderSubmitAssemViewModel> implements C039H {
    @Override // X.C039H
    public final int UW() {
        return EnumC882203ca.SAVE.ordinal();
    }

    @Override // X.C039H
    public final HashMap<String, Object> hi1(boolean z) {
        HashMap<String, Object> map;
        String strValueOf;
        Integer num;
        Integer num2;
        PlatformPromotion platformPromotion;
        PromotionBanner promotionBanner;
        String str;
        BillInfoData billInfoData = LIZ().LLJJI;
        if (billInfoData != null) {
            map = C7806033c.LJIIIIZZ(billInfoData, LIZ(), z);
        } else {
            map = new HashMap<>();
        }
        C03JV c03jv = (C03JV) LIZ().vmDispatcher.getState();
        C720002rW c720002rW = c03jv.LLL;
        int iIntValue = 0;
        if (c720002rW != null && (str = c720002rW.LLJILLL) != null && str.length() > 0) {
            strValueOf = "all_applied";
        } else {
            C720002rW c720002rW2 = c03jv.LLL;
            if (c720002rW2 != null && (num = c720002rW2.LLJILJILJ) != null && num.intValue() > 0) {
                C720002rW c720002rW3 = c03jv.LLL;
                if (c720002rW3 != null && (num2 = c720002rW3.LLJILJILJ) != null) {
                    iIntValue = num2.intValue();
                }
                strValueOf = String.valueOf(iIntValue);
            } else {
                strValueOf = "no_coupon";
            }
        }
        map.put("coupon_applied_status", strValueOf);
        BillInfoData billInfoData2 = LIZ().LLJJI;
        String str2 = null;
        if (billInfoData2 != null && (platformPromotion = billInfoData2.platformPromotion) != null && (promotionBanner = platformPromotion.promotionBanner) != null) {
            str2 = promotionBanner.daInfo;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
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
        SpannableStringBuilder spannableStringBuilderLIZ = C039F.LIZ(context, anonymousClass0376, EnumC803903Cb.NO_ICON);
        int iLJJJ = a0.LJJJ(spannableStringBuilderLIZ, "\n", 0, false, 6);
        if (iLJJJ != -1) {
            return spannableStringBuilderLIZ.replace(iLJJJ, iLJJJ + 1, (CharSequence) ", ");
        }
        return spannableStringBuilderLIZ;
    }
}
