package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12FP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12FP {
    public static final void LIZ(Context context, List<String> list, C12FO c12fo, Map<String, String> map, Map<String, String> map2, Boolean bool, boolean z) throws JSONException {
        if (list.isEmpty()) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//openVideoEdit");
        smartRouteBuildRoute.withParam("shoot_way", "tako");
        smartRouteBuildRoute.withParam("upload_type", "default");
        JSONArray jSONArray = new JSONArray();
        for (String str : list) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str);
            jSONObject.put("urls", jSONArray2);
            if (z) {
                jSONObject.put("ai_generated_source", "tiktok_tako");
            }
            jSONArray.put(jSONObject);
        }
        smartRouteBuildRoute.withParam("assets", jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        if (c12fo != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("text_title", c12fo.LIZ);
            jSONObject3.put("text_description", c12fo.LIZIZ);
            jSONObject2.put("text_info_model", jSONObject3);
            List<String> list2 = c12fo.LIZJ;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : list2) {
                    if (str2.length() > 0) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        jSONArray3.put(it2.next());
                    }
                    smartRouteBuildRoute.withParam("challenge_name", jSONArray3.toString());
                }
            }
        }
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject4 = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject4.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject2.put("tako_create_aweme_api_params", jSONObject4);
        }
        if (map2 != null && !map2.isEmpty()) {
            JSONObject jSONObject5 = new JSONObject();
            if (map2 != null) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    jSONObject5.put(entry2.getKey(), entry2.getValue());
                }
            }
            jSONObject2.put("tako_extra_params", jSONObject5);
        }
        if (bool != null) {
            jSONObject2.put("skip_image_size_check", bool.booleanValue());
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("photo_publish_configuration_model", jSONObject2);
        smartRouteBuildRoute.withParam("creative_initial_model", C786410Ut5.J3(jSONObject6));
        smartRouteBuildRoute.open();
    }
}
