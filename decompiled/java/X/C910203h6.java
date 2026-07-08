package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C910203h6 extends AbstractC916103i3 {
    public String LJFF;
    public String LJI;
    public EnumC934003kw LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Boolean LJIIJJI;
    public final String LJIIL;
    public final ArrayList<C914003hi> LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;

    @Override // X.AbstractC916103i3
    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mErrorCode", this.LJFF);
            jSONObject.put("mErrorMessage", this.LJI);
            jSONObject.put("mAmount", this.LJIIIIZZ);
            jSONObject.put("mCurrency", this.LJIIIZ);
            jSONObject.put("mStatus", this.LJII.getStatus());
            jSONObject.put("mLogId", this.LJIIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C910203h6() {
        this.LJIILIIL = new ArrayList<>();
        this.LJIILL = "";
    }

    public C910203h6(String str) {
        super(str);
        this.LJIILIIL = new ArrayList<>();
        this.LJIILL = "";
        try {
            this.LJII = EnumC934003kw.getOrderStatus(this.LIZ.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
            this.LJFF = this.LIZ.optString("error_code");
            this.LJI = this.LIZ.optString("error_message");
            this.LJIIIIZZ = this.LIZ.optString("amount");
            this.LJIIIZ = this.LIZ.optString("currency");
            this.LJIIL = this.LIZ.optString("logid");
            JSONObject jSONObjectOptJSONObject = this.LIZ.optJSONObject("pin_free_info");
            this.LJIILJJIL = this.LIZ.optString("pipo_error_action");
            if (jSONObjectOptJSONObject != null) {
                this.LJIIJ = jSONObjectOptJSONObject.optString("guided_url");
                this.LJIIJJI = Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("guided_scene_sign_available"));
            }
            JSONObject jSONObjectOptJSONObject2 = this.LIZ.optJSONObject("charge_details");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                this.LJIILL = jSONObjectOptJSONObject2.optString("status_code");
            } else {
                this.LJIILL = "";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910203h6(String str, Object obj) {
        super(str, 0);
        this.LJIILIIL = new ArrayList<>();
        this.LJIILL = "";
        try {
            this.LJIILJJIL = new JSONObject(str).optString("pipo_error_action");
            this.LJII = EnumC934003kw.getOrderStatus(this.LIZ.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
            this.LJFF = this.LIZ.optString("error_code");
            this.LJI = this.LIZ.optString("error_message");
            this.LJIIIIZZ = this.LIZ.optString("amount");
            this.LJIIIZ = this.LIZ.optString("currency");
            this.LJIIL = this.LIZ.optString("logid");
            JSONArray jSONArrayOptJSONArray = this.LIZ.optJSONArray("action_infos");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
                    String strOptString = jSONObject.optString("action", "");
                    String strOptString2 = jSONObject.optString("action_url", "");
                    String strOptString3 = jSONObject.optString("material_content", "");
                    if (!strOptString2.isEmpty() || !strOptString3.isEmpty()) {
                        this.LJIILIIL.add(new C914003hi(strOptString, strOptString2, strOptString3));
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject = this.LIZ.optJSONObject("charge_details");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                this.LJIILL = jSONObjectOptJSONObject.optString("status_code");
            } else {
                this.LJIILL = "";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C910203h6(String str, int i) {
        this.LJIILIIL = new ArrayList<>();
        this.LJIILL = "";
        this.LJII = EnumC934003kw.getOrderStatus(null);
        this.LJFF = "time_out";
        this.LJI = str;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJJI = null;
        this.LJIIJ = null;
        this.LJIIL = null;
        this.LJIILL = "";
    }
}
