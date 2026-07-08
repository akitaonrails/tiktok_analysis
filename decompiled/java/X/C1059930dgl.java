package X;

import Y.ARunnableS24S0400000_16;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059930dgl extends C1059920dgk implements InterfaceC1051760dTa {
    public final IESJsBridge LLILLJJLI;
    public String LLILLL;

    @C14EU
    public void onEvent(C848460XQe c848460XQe) {
        String str = c848460XQe.LIZ;
        JSONObject jSONObject = c848460XQe.LIZIZ;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IESJsBridge iESJsBridge = this.LLILLJJLI;
        if (iESJsBridge != null) {
            iESJsBridge.LJ("H5_nativeEvent", jSONObject2);
        }
        EventBus.LIZLLL().LJJI(this);
    }

    public C1059930dgl(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        super(weakReference);
        this.LLILLJJLI = iESJsBridge;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        WeakReference<Context> weakReference;
        String string = JSONObjectProtectorUtils.getString(c1058910df7.LIZLLL, "type");
        c1058910df7.LIZJ = "open";
        c1058910df7.LIZLLL.put("type", string);
        this.LLILLL = c1058910df7.LIZIZ;
        if (!c1058910df7.LIZLLL.has("args") || (jSONObject2 = JSONObjectProtectorUtils.getJSONObject(c1058910df7.LIZLLL, "args")) == null) {
            jSONObject2 = new JSONObject();
            c1058910df7.LIZLLL.put("args", jSONObject2);
        }
        if ("item".equals(string)) {
            jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("item_id"));
        } else if ("profile".equals(string)) {
            jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("user_id"));
        } else if ("challenge".equals(string)) {
            jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("challenge_id"));
        } else if ("music".equals(string)) {
            jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("music_id"));
        } else if ("collection".equals(string)) {
            jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("collection_id"));
        } else {
            if ("live".equals(string)) {
                c1058910df7.LJIIJJI = false;
                C810560Vqw.LJ(new ARunnableS24S0400000_16(jSONObject2, jSONObject, this, c1058910df7, 0));
                return;
            }
            if ("login".equals(string)) {
                String strOptString = jSONObject2.optString("enter_from");
                if (!C0XQ7.LJFF().isLogin() && (weakReference = this.LL) != null) {
                    Activity activityLIZ = C1059920dgk.LIZ(weakReference.get());
                    EventBus.LIZLLL().LJIJJ(this);
                    try {
                        C0XPD.LIZIZ(activityLIZ, strOptString, "", null, null);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        EventBus.LIZLLL().LJJI(this);
                        return;
                    }
                }
                return;
            }
            if ("webview".equals(string)) {
                try {
                    if (TextUtils.equals("1", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c1058910df7.LIZLLL, "args"), "url")), "live_half_charge_dialog"))) {
                        IESJsBridge iESJsBridge = this.LLILLJJLI;
                        if (iESJsBridge != null) {
                            iESJsBridge.LIZ(this.LLILLL, jSONObject);
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        EventBus.LIZLLL().LJIJJ(this);
        jSONObject2.put("group", CardStruct.IStatusCode.DEFAULT);
        LIZJ(c1058910df7.LIZLLL);
        jSONObject.put("code", 1);
    }
}
