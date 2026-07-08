package X;

import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0vTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743890vTv {
    public static final C1743890vTv LIZ = new C1743890vTv();
    public static final Set<Integer> LIZIZ = new LinkedHashSet();
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("author_id", "product_id", "source_content_id", "room_id", "previous_page", "source_page_type", "live_status", "follow_status", "module_name", "page_name");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("author_id", "product_id", "source_content_id", "room_id", "enter_from_info", "previous_page", "source_page_type", "live_status", "button_name", "follow_status", "page_name");
    public static final List<String> LJ = C1697810uHb.LJIIJJI("author_id", "product_id", "source_content_id", "room_id", "anchor_show_type", "enter_from_info", "item_order", "entrance_form", "track_id", "source_page_type", "follow_status", "page_name", "source_from", "source", "original_price", "sale_price");

    public static Map LIZ(List list, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                linkedHashMap.put(obj, obj2);
            }
        }
        return linkedHashMap;
    }

    public static void LIZIZ(int i, Map map, Map map2, View view) {
        Set<Integer> set = LIZIZ;
        if (!set.contains(Integer.valueOf(i))) {
            Map mapLIZ = LIZ(LIZJ, map);
            mapLIZ.putAll(map2);
            LIZJ(view, "tiktokec_module_click", "a2270.b96658", mapLIZ);
            set.add(Integer.valueOf(i));
        }
    }

    public static void LIZJ(View view, String str, String str2, Map map) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null && view != null) {
            for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str2, PageFinder.via(view), null, 4, null).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                linkedHashMap.put(key, string);
            }
        }
        linkedHashMap.putAll(map);
        C1018703yb.LJ(str, linkedHashMap);
    }
}
