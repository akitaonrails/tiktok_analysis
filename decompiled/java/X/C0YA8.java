package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PropertyItem;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.UrlStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YA8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YA8 {
    public static Map<String, List<C0YA1>> LIZ(MessageBody messageBody, String str, String str2) {
        C0YA1 c0ya1;
        long jLongValue;
        if (messageBody == null || messageBody.property_list == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, PropertyItemList> entry : messageBody.property_list.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                ArrayList arrayList = new ArrayList();
                map.put(key, arrayList);
                PropertyItemList value = entry.getValue();
                List<PropertyItem> list = value.Items;
                if (list != null && !list.isEmpty()) {
                    for (PropertyItem propertyItem : value.Items) {
                        UrlStruct urlStruct = entry.getValue().resource_url;
                        if (propertyItem == null) {
                            c0ya1 = null;
                        } else {
                            c0ya1 = new C0YA1();
                            c0ya1.msgUuid = str;
                            c0ya1.conversationId = str2;
                            c0ya1.uid = propertyItem.uid;
                            c0ya1.sec_uid = propertyItem.sec_uid;
                            c0ya1.idempotent_id = propertyItem.idempotent_id;
                            c0ya1.value = propertyItem.value;
                            Long l = propertyItem.create_time_micro;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            c0ya1.setCreateTime(jLongValue, propertyItem.create_time.longValue());
                            c0ya1.key = key;
                            c0ya1.url = urlStruct;
                            c0ya1.setBizExtra(propertyItem.biz_extra);
                        }
                        arrayList.add(c0ya1);
                    }
                }
            }
        }
        return map;
    }
}
