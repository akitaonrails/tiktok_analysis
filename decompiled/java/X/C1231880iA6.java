package X;

import kotlin.jvm.internal.AFwS187S0000000_2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231880iA6 {
    public static final C1231880iA6 LIZ = new C1231880iA6();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(768));

    public static boolean LIZJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static void LJ(boolean z) {
        if (!LIZJ()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "edit_username_page");
        jSONObject.put("show_sync_nickname", z ? 1 : 0);
        C20684815ws.LJIJ("show_save_username_confirm_prompt", jSONObject);
    }

    public static void LIZIZ(boolean z, boolean z2) {
        String str;
        if (!LIZJ()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "edit_username_page");
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        jSONObject.put("click_what", str);
        jSONObject.put("allow_sync_nickname", z2 ? 1 : 0);
        C20684815ws.LJIJ("click_save_username_confirm_prompt", jSONObject);
    }

    public static void LIZLLL(String str, boolean z) {
        if (!LIZJ()) {
            return;
        }
        int i = 1;
        if (C1EDI.LJFF()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", "edit_nickname_page");
            jSONObject.put("previous_page", str);
            if (!z) {
                i = 0;
            }
            jSONObject.put("show_sync_username", i);
            C20684815ws.LJIJ("show_save_nickname_confirm_prompt", jSONObject);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_from", "edit_nickname_page");
        if (!z) {
            i = 0;
        }
        jSONObject2.put("show_sync_username", i);
        C20684815ws.LJIJ("show_save_nickname_confirm_prompt", jSONObject2);
    }

    public static void LIZ(String str, boolean z, boolean z2) {
        if (!LIZJ()) {
            return;
        }
        int i = 1;
        String str2 = "confirm";
        if (C1EDI.LJFF()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", "edit_nickname_page");
            jSONObject.put("previous_page", str);
            if (!z) {
                str2 = "cancel";
            }
            jSONObject.put("click_what", str2);
            if (!z2) {
                i = 0;
            }
            jSONObject.put("allow_sync_username", i);
            C20684815ws.LJIJ("click_save_nickname_confirm_prompt", jSONObject);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_from", "edit_nickname_page");
        if (!z) {
            str2 = "cancel";
        }
        jSONObject2.put("click_what", str2);
        if (!z2) {
            i = 0;
        }
        jSONObject2.put("allow_sync_username", i);
        C20684815ws.LJIJ("click_save_nickname_confirm_prompt", jSONObject2);
    }
}
