package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Srl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734630Srl {
    public static final void LIZ(JSONObject jSONObject, C2189821An6 c2189821An6) throws JSONException {
        Map<String, String> extra = c2189821An6.getExtra();
        if (extra != null) {
            String str = extra.get("game_bottom_bar_scene");
            if (str != null) {
                jSONObject.put("game_bottom_bar_scene", str);
            }
            jSONObject.put("related_live_tag", extra.get("related_live_tag"));
        }
    }

    public static final void LIZIZ(AbstractC1386130mAt abstractC1386130mAt, C2189821An6 c2189821An6) {
        Map<String, String> extra;
        if (c2189821An6 != null && (extra = c2189821An6.getExtra()) != null) {
            String str = extra.get("game_bottom_bar_scene");
            if (str != null) {
                abstractC1386130mAt.LJ("game_bottom_bar_scene", str);
            }
            abstractC1386130mAt.LJ("related_live_tag", extra.get("related_live_tag"));
        }
    }
}
