package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C806903Df {
    public static final void LIZ(C03FC c03fc, DeliveryPanelViewModel deliveryPanelViewModel, String str, DeliveryPanelState deliveryPanelState, String str2, Integer num) {
        int i;
        Float fLJIIIIZZ;
        String currency;
        String priceVal;
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo;
        String str3;
        String str4;
        String str5;
        String str6;
        LogisticDTO logisticDTO;
        List<Object> logisticList = deliveryPanelState.getLogisticList();
        int i2 = -1;
        if (logisticList != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : logisticList) {
                if (obj instanceof LogisticDTO) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((LogisticDTO) it2.next()).logisticsServiceId, c03fc.LIZ.logisticsServiceId)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        String str7 = null;
        if (i == -1) {
            List<Object> logisticList2 = deliveryPanelState.getLogisticList();
            if (logisticList2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : logisticList2) {
                    if (obj2 instanceof C03FC) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C03FC c03fc2 = (C03FC) it3.next();
                    LogisticDTO logisticDTO2 = c03fc2.LIZ;
                    if (logisticDTO2 != null) {
                        str5 = logisticDTO2.logisticsServiceId;
                    } else {
                        str5 = null;
                    }
                    LogisticDTO selectedLogistic = deliveryPanelState.getSelectedLogistic();
                    if (selectedLogistic != null) {
                        str6 = selectedLogistic.logisticsServiceId;
                    } else {
                        str6 = null;
                    }
                    if (Intrinsics.LJFF(str5, str6) && (logisticDTO = c03fc2.LIZ) != null && logisticDTO.logisticsServiceId != null) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
            }
        } else {
            i2 = i;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            num.intValue();
            linkedHashMap.put("is_default", num);
        }
        LogisticTextDTO logisticTextDTO = c03fc.LIZ.logisticText;
        if (logisticTextDTO != null && (str4 = logisticTextDTO.serviceText) != null && !a0.LJJJIL(str4)) {
            linkedHashMap.put("track_status", str4);
        }
        Map<String, String> map = c03fc.LIZ.eventTrackInfo;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "promotion_tag") || Intrinsics.LJFF(entry.getKey(), "spend_more_amount") || Intrinsics.LJFF(entry.getKey(), "spend_more_currency")) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        LogisticDTO logisticDTO3 = c03fc.LIZ;
        String str8 = logisticDTO3.deliveryName;
        Map<String, String> map2 = logisticDTO3.eventTrackInfo;
        if (map2 != null) {
            str8 = map2.get("shipping_type");
        }
        LogisticExpressionArea logisticExpressionArea = c03fc.LIZLLL;
        if (logisticExpressionArea != null && (logisticsExpressionAreaExtraInfo = logisticExpressionArea.extraInfo) != null && (str3 = logisticsExpressionAreaExtraInfo.daInfo) != null) {
            linkedHashMap.put("delivery_flag", str3);
        }
        if (str2 != null) {
            linkedHashMap.put("entrance_zone", str2);
        }
        linkedHashMap.put("enter_method", deliveryPanelViewModel.sR2());
        Set<String> set = C03FA.LIZ;
        String str9 = str8;
        Price price = c03fc.LIZ.shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal);
        } else {
            fLJIIIIZZ = null;
        }
        Price price2 = c03fc.LIZ.shippingFee;
        if (price2 != null) {
            currency = price2.getCurrency();
        } else {
            currency = null;
        }
        LogisticTextDTO logisticTextDTO2 = c03fc.LIZ.logisticText;
        if (logisticTextDTO2 != null) {
            str7 = logisticTextDTO2.thresholdTextEn;
        }
        C03FA.LJI(str, str9, i2, fLJIIIIZZ, currency, str7, linkedHashMap, "shipping", null, null, null);
    }
}
