package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SESMetric;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.03wC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1003803wC {
    public static final Map<String, Object> LIZ(ShopPerformance shopPerformance) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<SESMetric> list = shopPerformance.metricsList;
        if (list != null) {
            for (SESMetric sESMetric : list) {
                Integer num = sESMetric.detailedMetricType;
                int value = EnumC1004003wE.SHIPS_WITHIN_2_DAYS.getValue();
                if (num != null && num.intValue() == value) {
                    str = "delivery_rate";
                } else {
                    int value2 = EnumC1004003wE.RESPONDS_WITHIN_24_HOURS.getValue();
                    if (num != null && num.intValue() == value2) {
                        str = "response_rate";
                    } else {
                        int value3 = EnumC1004003wE.FOUR_STAR_RATING.getValue();
                        if (num != null && num.intValue() == value3) {
                            str = "positive_feedback_rate";
                        } else {
                            str = "";
                        }
                    }
                }
                Integer num2 = sESMetric.rate;
                if (num2 != null) {
                    linkedHashMap.put(str, Integer.valueOf(num2.intValue()));
                }
            }
        }
        Integer num3 = shopPerformance.value;
        if (num3 != null) {
            linkedHashMap.put("outperform_rate", Integer.valueOf(num3.intValue()));
        }
        return C2097608Jq.LJIIZILJ(linkedHashMap);
    }
}
