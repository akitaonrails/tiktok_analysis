package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XO3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XO3 extends C0XO5 {
    public String LJJIJ;
    public String LJJIJIIJI;
    public long LJJIJIIJIL;
    public String LJJIJIL;
    public String LJJIJL;
    public boolean LJJIJLIJ;
    public String LJJIL;
    public String LJJIZ;
    public String LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public long LJJJJIZL;
    public String LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public boolean LJJJJLI;
    public String LJJJJLL;
    public String LJJJJZ;
    public String LJJJJZI;
    public int LJJJLIIL;
    public int LJJJLL;
    public boolean LJJJLZIJ;
    public boolean LJJJZ;
    public boolean LJJL;
    public JSONObject LJJLI;

    @Override // X.C0XO5, X.C0XO2
    public final void LIZ() {
        super.LIZ();
        JSONObject jSONObject = this.LJJIIJ;
        this.LJJJI = jSONObject.optInt("can_be_found_by_phone");
        this.LJJJIL = jSONObject.optInt("share_to_repost", -1);
        this.LJJJJ = jSONObject.optInt("user_privacy_extend") & 1;
        this.LJJJJI = jSONObject.optInt("user_privacy_extend");
        this.LJJJJL = jSONObject.optInt("gender");
        this.LJJIJ = jSONObject.optString("screen_name");
        this.LJJIJIIJI = jSONObject.optString("verified_content");
        jSONObject.optBoolean("is_generated");
        this.LJJJJLI = jSONObject.optBoolean("user_verified");
        this.LJJIJLIJ = jSONObject.optInt("is_recommend_allowed") != 0;
        this.LJJIL = jSONObject.optString("recommend_hint_message");
        this.LJJIZ = jSONObject.optString("user_decoration");
        this.LJJJ = jSONObject.optString("user_auth_info");
        this.LJJJJLL = jSONObject.optString("birthday");
        this.LJJJJZ = jSONObject.optString("area");
        this.LJJJJZI = jSONObject.optString("industry");
        this.LJJJLL = jSONObject.optInt("is_blocked");
        this.LJJJLIIL = jSONObject.optInt("is_blocking");
        this.LJJJLZIJ = jSONObject.optBoolean("is_toutiao");
        this.LJJJZ = jSONObject.optInt("has_password") != 0;
        this.LJJL = jSONObject.optBoolean("is_password_compromised", false);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("media");
        if (jSONObjectOptJSONObject != null) {
            this.LJJIJIL = jSONObjectOptJSONObject.optString("avatar_url");
            this.LJJIJIIJIL = jSONObjectOptJSONObject.optLong(FollowStatusChangeMethod.PARAM_UID);
            this.LJJIJL = jSONObjectOptJSONObject.optString("name");
            this.LJJJJJL = jSONObjectOptJSONObject.optInt("display_app_ocr_entrance", 0);
        }
        jSONObject.optInt("followings_count");
        jSONObject.optInt("followers_count");
        jSONObject.optInt("visit_count_recent");
        this.LJJJJIZL = jSONObject.optLong("media_id");
        this.LJJJJJ = jSONObject.optString("bg_img_url");
        jSONObject.optInt("app_id");
        this.LJJLI = jSONObject.optJSONObject("expend_attrs");
    }

    public C0XO3() {
    }

    public C0XO3(JSONObject jSONObject) {
        super(jSONObject);
    }

    public C0XO3(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
