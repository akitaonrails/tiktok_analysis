package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03FD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FD {
    public static final C03W1 LIZ(LogisticDTO logisticDTO) {
        String str;
        String str2;
        String str3;
        float fFloatValue;
        Float fLJIIIIZZ;
        Float fLJIIIIZZ2;
        LeadMessage leadMessage;
        LogisticTextDTO logisticTextDTO = logisticDTO.logisticText;
        String priceVal = null;
        if (logisticTextDTO != null && (leadMessage = logisticTextDTO.leadMessage) != null) {
            str = leadMessage.fromOverseas;
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            str2 = "overseas";
        } else {
            str2 = "local";
        }
        Map<String, String> map = logisticDTO.eventTrackInfo;
        if (map != null) {
            str3 = map.get("shipping_type");
        } else {
            str3 = null;
        }
        Object obj = logisticDTO.deliveryMinDays;
        if (obj == null) {
            Map<String, String> map2 = logisticDTO.eventTrackInfo;
            if (map2 != null) {
                obj = map2.get("est_delivery_day_min");
            } else {
                obj = null;
            }
        }
        Object obj2 = logisticDTO.deliveryMaxDays;
        if (obj2 == null) {
            Map<String, String> map3 = logisticDTO.eventTrackInfo;
            if (map3 != null) {
                obj2 = map3.get("est_delivery_day_max");
            } else {
                obj2 = null;
            }
        }
        String str4 = logisticDTO.originShippingVal;
        Price price = logisticDTO.shippingFee;
        if (price != null) {
            priceVal = price.getPriceVal();
        }
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair("shipping_from", str2), new Pair("shipping_type", str3), new Pair("est_delivery_day_min", obj), new Pair("est_delivery_day_max", obj2)));
        float fFloatValue2 = 0.0f;
        if (str4 != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(str4)) != null) {
            fFloatValue = fLJIIIIZZ2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Float fValueOf = Float.valueOf(fFloatValue);
        if (priceVal != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal)) != null) {
            fFloatValue2 = fLJIIIIZZ.floatValue();
        }
        return new C03W1(fValueOf, Float.valueOf(fFloatValue2), strLJIIIIZZ);
    }
}
