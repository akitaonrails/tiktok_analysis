package X;

import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import java.util.Map;

/* JADX INFO: renamed from: X.18Sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21286818Sc {
    public static final DynamicInfoComponent LIZ(C2242071CpB c2242071CpB) {
        DynamicUiLocationType dynamicUiLocationType;
        DynamicCardClientInfoComponent dynamicCardClientInfoComponent;
        String str = c2242071CpB.card_key;
        String str2 = c2242071CpB.schema;
        String str3 = c2242071CpB.card_template;
        String str4 = c2242071CpB.raw_data;
        String str5 = c2242071CpB.business_type;
        String str6 = c2242071CpB.business_id;
        int iIntValue = c2242071CpB.default_height.intValue();
        int iIntValue2 = c2242071CpB.default_width.intValue();
        C18SX c18sx = c2242071CpB.ui_location_type;
        if (c18sx != null) {
            DynamicUiLocationType[] dynamicUiLocationTypeArrValues = DynamicUiLocationType.values();
            int length = dynamicUiLocationTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    dynamicUiLocationType = dynamicUiLocationTypeArrValues[i];
                    if (dynamicUiLocationType.getValue() == c18sx.getValue()) {
                        break;
                    }
                    i++;
                } else {
                    dynamicUiLocationType = DynamicUiLocationType.MESSAGE_NORMAL;
                    if (dynamicUiLocationType == null) {
                    }
                }
            }
        } else {
            dynamicUiLocationType = DynamicUiLocationType.MESSAGE_NORMAL;
        }
        Map<String, String> map = c2242071CpB.biz_params;
        C2242091CpD c2242091CpD = c2242071CpB.dynamic_card_client_info;
        if (c2242091CpD != null) {
            dynamicCardClientInfoComponent = new DynamicCardClientInfoComponent(c2242091CpD.resource_id, c2242091CpD.resource_type, c2242091CpD.resource_cover_url, c2242091CpD.hide_card);
        } else {
            dynamicCardClientInfoComponent = null;
        }
        return new DynamicInfoComponent(str, str2, str3, str4, str5, str6, iIntValue, iIntValue2, dynamicUiLocationType, map, dynamicCardClientInfoComponent);
    }
}
