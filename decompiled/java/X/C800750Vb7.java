package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800750Vb7 implements C0VYZ {
    public static JSONArray LIZIZ(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return new JSONArray();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            jSONArray.put(jSONArrayOptJSONArray.get(i));
        }
        return jSONArray;
    }

    @Override // X.C0VYZ
    public final void LIZ(JSONObject jSONObject, C799540VYa c799540VYa) throws JSONException {
        String str;
        int i;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("trigger_id", "10815");
        jSONObject2.put("trigger_biz", "WebRouter");
        jSONObject2.put("report_category", "webview_monitor");
        JSONObject jSONObject3 = new JSONObject();
        C790430UzZ c790430UzZ = C0VZK.LIZ;
        if (c790430UzZ == null || (str = c790430UzZ.LIZJ) == null) {
            str = "";
        }
        jSONObject3.put("release_build", str);
        if (c799540VYa.LIZIZ) {
            jSONObject3.put("webrouter_type", "H5");
            jSONObject3.put("webrouter_jump_times", 0L);
            jSONObject3.put("webrouter_container_type", LIZJ("containerType", "", jSONObject));
            jSONObject3.put("webrouter_container_name", LIZJ("containerName", "", jSONObject));
            jSONObject2.put("webrouter_caller", LIZJ("caller", "", jSONObject));
            jSONObject2.put("webrouter_callee", LIZJ("callee", "", jSONObject));
            jSONObject2.put("webrouter_is_interior", EnumC800450Vad.THIRD.name());
            jSONObject2.put("dfid", LIZJ("dataflowId", CardStruct.IStatusCode.DEFAULT, jSONObject));
        } else {
            if (!c799540VYa.LIZ) {
                jSONObject2.put("scheme", LIZJ("scheme", "", jSONObject));
                jSONObject2.put("domain", LIZJ("url", "", jSONObject));
                jSONObject3.put("path", LIZJ("path", "", jSONObject));
                jSONObject3.put("query_fields", LIZJ("query", "", jSONObject));
                jSONObject3.put("webrouter_pre_url_info", LIZIZ("preUrlInfo", jSONObject).toString());
            }
            jSONObject3.put("webrouter_view_class", LIZJ("relativeView", "", jSONObject));
            jSONObject3.put("webrouter_view_webclient", LIZJ("relativeView_webViewClient", "", jSONObject));
            jSONObject3.put("webrouter_view_chromeclient", LIZJ("relativeView_chromeClient", "", jSONObject));
            jSONObject3.put("webrouter_view_hierarchy", LIZIZ("relativeViewHierarchy", jSONObject).toString());
            jSONObject3.put("webrouter_type", LIZJ("relativeViewType", "", jSONObject));
            jSONObject3.put("webrouter_container_type", LIZJ("containerType", "", jSONObject));
            jSONObject3.put("webrouter_container_name", LIZJ("containerName", "", jSONObject));
            jSONObject2.put("webrouter_caller", LIZJ("caller", "", jSONObject));
            jSONObject2.put("webrouter_callee", LIZJ("callee", "", jSONObject));
            jSONObject3.put("webrouter_caller_component", LIZJ("callerComponent", "", jSONObject));
            jSONObject2.put("dfid", LIZJ("dataflowId", CardStruct.IStatusCode.DEFAULT, jSONObject));
            jSONObject3.put("webrouter_session_id", LIZJ("sessionId", "", jSONObject));
            if (jSONObject.has("jumpTimes")) {
                i = JSONObjectProtectorUtils.getInt(jSONObject, "jumpTimes");
            } else {
                i = 0;
            }
            jSONObject3.put("webrouter_jump_times", i);
            jSONObject2.put("webrouter_is_interior", LIZJ("is_interior", "INTERIOR", jSONObject));
            jSONObject2.put("webrouter_spark_runtime", LIZJ("spark_runtime", "unknown", jSONObject));
            jSONObject2.put("webrouter_spark_uiType", LIZJ("spark_uitype", "unknown", jSONObject));
            jSONObject3.put("webrouter_caller_stack", LIZJ("callingPoint", "", jSONObject));
            jSONObject3.put("pl_page_stack", LIZIZ("pageStack", jSONObject).toString());
        }
        C0VZK.LIZIZ().monitorEvent("pumbaa_standard_event", jSONObject2, null, jSONObject3);
    }

    public static final String LIZJ(String str, String str2, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return JSONObjectProtectorUtils.getString(jSONObject, str);
        }
        return str2;
    }
}
