package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0PQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644740PQq {
    public static final C644740PQq LIZ = new C644740PQq();

    public static Map LIZ(String str, Map map, boolean z) {
        String str2;
        String appLanguage;
        if (z) {
            str2 = "result_ai_highlight_dashed_blue";
        } else {
            str2 = "result_ai_highlight_dashed";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("words_source", str2);
        linkedHashMap.put("words_content", str);
        linkedHashMap.put("button_type", "click_ai_highlight_words");
        linkedHashMap.put("search_position", "visual_search");
        Object obj = map.get("search_id");
        String str3 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("search_id", obj);
        Object obj2 = map.get("last_from_group_id");
        if (obj2 == null) {
            obj2 = "";
        }
        linkedHashMap.put("last_from_group_id", obj2);
        Object obj3 = map.get("last_feed_group_id");
        if (obj3 == null) {
            obj3 = "";
        }
        linkedHashMap.put("last_feed_group_id", obj3);
        ISettingService iSettingService = (ISettingService) PluggableExtentionKt.pluggableSpi$default(ISettingService.class, false, false, false, 14, null);
        if (iSettingService != null && (appLanguage = iSettingService.getAppLanguage()) != null) {
            str3 = appLanguage;
        }
        linkedHashMap.put("query_lang", str3);
        C662670Pyz.LIZ.getClass();
        String strLIZ = C662670Pyz.LIZ();
        if (strLIZ != null) {
            linkedHashMap.put("end_to_end_search_session_id", strLIZ);
        }
        c2344009Gk.LJII(linkedHashMap);
        return c2344009Gk.LIZ;
    }
}
