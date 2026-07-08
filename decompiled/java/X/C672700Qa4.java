package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qa4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672700Qa4 {
    public static final /* synthetic */ C672700Qa4 LIZ = new C672700Qa4();

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("words_source", str);
        jSONObject.put("words_position", 0);
        jSONObject.put("words_content", str2);
        jSONObject.put("search_position", str3);
        jSONObject.put("group_id", str4);
        jSONObject.put("impr_id", str5);
        jSONObject.put("enter_group_id", str6);
        jSONObject.put("is_ecom_search", str7);
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("trending_words_click", jSONObject);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("words_source", str);
        jSONObject.put("words_position", 0);
        jSONObject.put("words_content", str2);
        jSONObject.put("search_position", str3);
        jSONObject.put("group_id", str4);
        jSONObject.put("impr_id", str5);
        jSONObject.put("enter_group_id", str6);
        jSONObject.put("is_ecom_search", str7);
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("trending_words_show", jSONObject);
    }
}
