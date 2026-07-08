package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066040dqc extends C1059920dgk implements InterfaceC1051760dTa {
    public C1066040dqc(WeakReference weakReference) {
        super(weakReference);
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) throws JSONException {
        String string = JSONObjectProtectorUtils.getString(c1058910df7.LIZLLL, "type");
        if (TextUtils.equals("goods_order_share", string)) {
            return;
        }
        c1058910df7.LIZJ = "open";
        c1058910df7.LIZLLL.put("type", "openRecord");
        if (c1058910df7.LIZLLL.has("args")) {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(c1058910df7.LIZLLL, "args");
            jSONObject2.put("recordOrigin", "jsBridge");
            if ("challenge".equals(string)) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("challenge_id"));
                jSONObject2.put("recordParam", "challenge");
            } else if ("music".equals(string)) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("music_id"));
                jSONObject2.put("recordParam", "music");
            } else if ("effect".equals(string)) {
                if (jSONObject2.has("effect_id")) {
                    jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("effect_id"));
                }
                jSONObject2.put("recordParam", "sticker");
                if (jSONObject2.has("effect_meta_info")) {
                    jSONObject2.put("effect_meta_info", C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "effect_meta_info")));
                }
                if (jSONObject2.has("effect_image")) {
                    jSONObject2.put("effect_image", C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "effect_image")));
                }
            } else if ("donation".equals(string)) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("charity_id"));
                jSONObject2.put("recordParam", "donation");
            } else if ("tcm".equals(string)) {
                jSONObject2.put("recordParam", "tcm");
                jSONObject2.put("star_atlas_object", C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(c1058910df7.LIZLLL, "args")));
            } else if ("duet".equals(string)) {
                jSONObject2.put("type", "use_duet");
            } else if ("stitch".equals(string)) {
                jSONObject2.put("type", "use_stitch");
            } else if ("comment".equals(string)) {
                jSONObject2.put("type", "use_comment");
            }
            jSONObject2.put("group", "1");
        }
        jSONObject.put("code", 1);
        LIZJ(c1058910df7.LIZLLL);
    }
}
