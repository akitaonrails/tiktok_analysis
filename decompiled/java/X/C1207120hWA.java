package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207120hWA {
    public static final C1207120hWA LIZ = new C1207120hWA();

    public static void LIZIZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("previous_page", str3);
        }
        C20684815ws.LJIILLIIL("precise_location_inapp_conversion_show", linkedHashMap);
    }

    public static void LJI(C1207120hWA c1207120hWA, String str, String str2, String str3) {
        c1207120hWA.getClass();
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "enter_from", str);
        C2365509Or.LIZLLL(jSONObject, "enter_method", str2);
        C2365509Or.LIZLLL(jSONObject, "previous_page", str3);
        C20684815ws.LJIJ("precise_location_system_conversion_show", jSONObject);
    }

    public static void LIZ(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Object obj;
        Object obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("previous_page", str3);
        }
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_allow", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("system_is_precise", obj2);
        if (!z3) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("inapp_is_precise", str4);
        C20684815ws.LJIILLIIL("precise_location_inapp_conversion_result", linkedHashMap);
    }

    public static void LIZJ(String str, String str2, String str3, boolean z, boolean z2, boolean z3, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C2365509Or.LIZLLL(jSONObject, "enter_from", str);
        C2365509Or.LIZLLL(jSONObject, "enter_method", str2);
        C2365509Or.LIZLLL(jSONObject, "previous_page", str3);
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        C2365509Or.LIZLLL(jSONObject, "is_allow", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        C2365509Or.LIZLLL(jSONObject, "system_is_precise", obj2);
        if (!z3) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        C2365509Or.LIZLLL(jSONObject, "inapp_is_precise", str4);
        C20684815ws.LJIJ("precise_location_permission_result", jSONObject);
    }

    public static void LJ(String str, String str2, String str3, boolean z, boolean z2, boolean z3, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C2365509Or.LIZLLL(jSONObject, "enter_from", str);
        C2365509Or.LIZLLL(jSONObject, "enter_method", str2);
        C2365509Or.LIZLLL(jSONObject, "previous_page", str3);
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        C2365509Or.LIZLLL(jSONObject, "is_allow", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        C2365509Or.LIZLLL(jSONObject, "system_is_precise", obj2);
        if (!z3) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        C2365509Or.LIZLLL(jSONObject, "inapp_is_precise", str4);
        C20684815ws.LJIJ("precise_location_system_conversion_result", jSONObject);
    }
}
