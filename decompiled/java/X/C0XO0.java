package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieSyncManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XO0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XO0 implements WeakHandler.IHandler {
    public static final C0XO4[] LLLLII = {new C0XO4("mobile"), new C0XO4("email"), new C0XO4("google"), new C0XO4("facebook"), new C0XO4("twitter"), new C0XO4("instagram"), new C0XO4("line"), new C0XO4("kakaotalk"), new C0XO4("vk"), new C0XO4("tiktok")};
    public static volatile C0XO0 LLLLIIIILLL;
    public static final List<C0XOA> LLLLIIL;
    public final C0XIH LL;
    public int LLILZLL;
    public int LLJ;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public String LLJJJJJIL;
    public long LLJJL;
    public int LLJL;
    public boolean LLJLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public long LLLF;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public boolean LLLIIIIL;
    public C0XO2 LLLIIIL;
    public Set<String> LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public JSONObject LLLILZ;
    public JSONObject LLLILZJ;
    public final C0XO4[] LLLILZLLLI;
    public boolean LLLIZZ;
    public Context LLLJ;
    public final SharedPreferences LLLJL;
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJI = "";
    public String LLJJI = "";
    public String LLJJIII = "";
    public String LLJJIJI = "";
    public String LLJJIJIIJIL = "";
    public String LLJJJJ = "";
    public String LLJJJJLIIL = "";
    public String LLJJLIIIJLLLLLLLZ = "";
    public String LLJLILLLLZIIL = "";
    public String LLJLL = "";
    public String LLJLLIL = "";
    public String LLLFF = "";
    public String LLLFFI = "";
    public final WeakHandler LLLJIL = new WeakHandler(Looper.getMainLooper(), this);
    public final C1519760peQ<C0XN9> LLLL = new C1519760peQ<>();

    static {
        ArrayList arrayList = new ArrayList();
        LLLLIIL = arrayList;
        arrayList.add(new C0XOA() { // from class: X.0XO6
            @Override // X.C0XOA
            public final void LIZ(C0XGA c0xga) {
                C0XO2 userInfo;
                if (c0xga instanceof C0XZV) {
                    userInfo = ((C0XZV) c0xga).LJIIIZ;
                } else if (c0xga instanceof C0XT7) {
                    T t = ((C0XT7) c0xga).LJIIIZ;
                    if (!(t instanceof C0XOE)) {
                        return;
                    } else {
                        userInfo = ((C0XOE) t).getUserInfo();
                    }
                } else {
                    if (!(c0xga instanceof C0XOB)) {
                        return;
                    }
                    c0xga.getClass();
                    return;
                }
                if (userInfo != null) {
                    C0XO0.LLLLIIIILLL.LJIIIIZZ(userInfo, true);
                }
            }
        });
        arrayList.add(new C0XOA() { // from class: X.0XNx
            @Override // X.C0XOA
            public final void LIZ(C0XGA c0xga) {
                String str;
                if (c0xga.LJIIIIZZ == 10001 && c0xga.LIZIZ) {
                    SharedPreferences sharedPreferences = C847880XNy.LIZ;
                    String strValueOf = String.valueOf(C0XO0.LLLLIIIILLL.LLJJL);
                    Map mapLIZ = C847880XNy.LIZ();
                    if (mapLIZ.remove(strValueOf) != null) {
                        C847880XNy.LIZ.edit().putString(C847880XNy.LIZJ, GsonProtectorUtils.toJson(C847880XNy.LIZIZ, mapLIZ)).apply();
                    }
                    TTAccountInit.LIZ();
                    C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(C848000XOk.LIZ());
                    c0xo0LIZLLL.LJ(false);
                    if (c0xga instanceof C848150XOz) {
                        str = ((C848150XOz) c0xga).LJIIIZ;
                    } else {
                        str = "";
                    }
                    C0XGH c0xgh = new C0XGH(1);
                    C0XGH.LIZ(str);
                    c0xo0LIZLLL.LJII(c0xgh);
                }
            }
        });
        arrayList.add(new C0XOA() { // from class: X.0XO1
            @Override // X.C0XOA
            public final void LIZ(C0XGA c0xga) {
                boolean z;
                TTAccountInit.LIZ();
                Context contextLIZ = C848000XOk.LIZ();
                if (c0xga instanceof C1166104hH) {
                    if (c0xga.LIZIZ) {
                        Bundle bundle = new Bundle();
                        c0xga.getClass();
                        C786410Ut5.LJJJI("access_token", null, bundle);
                        bundle.putLong("expires_in", 0L);
                        C786410Ut5.LJJJI("open_id", null, bundle);
                        C786410Ut5.LJJJI("scopes", null, bundle);
                        C0XO0.LIZLLL(contextLIZ).LJIILJJIL(bundle);
                        return;
                    }
                    C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(contextLIZ);
                    c0xga.getClass();
                    if (c0xga.LIZLLL == 1058) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0xo0LIZLLL.getClass();
                    if (TextUtils.isEmpty(null) || !c0xo0LIZLLL.LLJZIJLIL || c0xo0LIZLLL.LLLILZJ == null || c0xo0LIZLLL.LLLIIIL == null) {
                        return;
                    }
                    if (z) {
                        C0XO4 c0xo4 = new C0XO4(null);
                        c0xo4.LLJILJIL = 0;
                        try {
                            JSONArray jSONArrayOptJSONArray = c0xo0LIZLLL.LLLILZJ.optJSONObject("data").optJSONArray("connects");
                            int i = 0;
                            while (true) {
                                if (i >= jSONArrayOptJSONArray.length()) {
                                    break;
                                }
                                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
                                if (TextUtils.equals(jSONObject.optString("platform"), null) && jSONObject.optInt("platform_app_id") == 0) {
                                    JSONObject jSONObjectOptJSONObject = c0xo0LIZLLL.LLLILZJ.optJSONObject("data");
                                    jSONArrayOptJSONArray.remove(i);
                                    jSONObjectOptJSONObject.put("connects", jSONArrayOptJSONArray);
                                    C0XO2 c0xo2 = c0xo0LIZLLL.LLLIIIL;
                                    JSONObject jSONObject2 = c0xo0LIZLLL.LLLILZJ;
                                    c0xo2.LJJIII = jSONObject2;
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    c0xo2.LJJII = jSONObjectOptJSONObject2;
                                    c0xo2.LJJIIJ = jSONObjectOptJSONObject2;
                                    break;
                                }
                                i++;
                            }
                            ((HashMap) c0xo0LIZLLL.LLLIIIL.LIZLLL).put(null, c0xo4);
                            Map map = (Map) ((HashMap) c0xo0LIZLLL.LLLIIIL.LJ).get(null);
                            if (map != null) {
                                map.put(String.valueOf(0), c0xo4);
                            }
                            SharedPreferences.Editor editorEdit = c0xo0LIZLLL.LLLJL.edit();
                            JSONObject jSONObject3 = c0xo0LIZLLL.LLLILZJ;
                            if (jSONObject3 == null) {
                                editorEdit.putString("raw_json", "");
                            } else {
                                editorEdit.putString("raw_json", C786410Ut5.J3(jSONObject3));
                            }
                            editorEdit.apply();
                            c0xo0LIZLLL.LJIIJ(editorEdit);
                            c0xo0LIZLLL.LJIIJJI();
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return;
                        }
                    }
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("access_token", "", bundle2);
                    bundle2.putLong("expires_in", 0L);
                    c0xo0LIZLLL.LJIILJJIL(bundle2);
                }
            }
        });
    }

    public final void LJIIIZ() {
        SharedPreferences.Editor editorEdit = this.LLLJL.edit();
        LJIIJ(editorEdit);
        LJIIJJI();
        editorEdit.remove("session");
        editorEdit.putBoolean("is_login", this.LLJZIJLIL);
        editorEdit.putLong("user_id", this.LLJJL);
        editorEdit.putInt("odin_user_type", this.LLJL);
        editorEdit.putString("sec_user_id", this.LLJJLIIIJLLLLLLLZ);
        editorEdit.putString("session_key", this.LLJLL);
        editorEdit.putString("session_sign", this.LLJLLIL);
        editorEdit.putString("user_name", this.LLJJIII);
        editorEdit.putString("verified_content", this.LLJLILLLLZIIL);
        editorEdit.putInt("user_gender", this.LLJ);
        editorEdit.putString("screen_name", this.LLJJIJI);
        editorEdit.putBoolean("user_verified", this.LLJLIL);
        editorEdit.putString("avatar_url", this.LLILLL);
        editorEdit.putBoolean("is_new_user", this.LLJZ);
        editorEdit.putString("user_email", this.LLIZLLLIL);
        editorEdit.putString("user_mobile", this.LLJJI);
        editorEdit.putInt("is_blocked", this.LLJIJIL);
        editorEdit.putInt("is_blocking", this.LLJILJIL);
        editorEdit.putBoolean("is_toutiao", this.LLJILLL);
        editorEdit.putBoolean("user_has_pwd", this.LLL);
        editorEdit.putInt("country_code", this.LLJLLL);
        editorEdit.putString("area", this.LLILLJJLI);
        editorEdit.putString("user_industry", this.LLJI);
        editorEdit.putString("user_decoration", this.LLJJJJLIIL);
        editorEdit.putString("user_birthday", this.LLILZIL);
        editorEdit.putLong("pgc_mediaid", this.LLLF);
        editorEdit.putString("pgc_avatar_url", this.LLLFF);
        editorEdit.putString("pgc_name", this.LLLFFI);
        editorEdit.putString("user_description", this.LLIZ);
        editorEdit.putBoolean("is_recommend_allowed", this.LLJILJILJ);
        editorEdit.putString("recommend_hint_message", this.LLJJIJIIJIL);
        editorEdit.putInt("can_be_found_by_phone", this.LLILZLL);
        editorEdit.putInt("can_sync_share", this.LLJJIJIL);
        editorEdit.putInt("following_count", this.LLLI);
        editorEdit.putInt("followers_count", this.LLLII);
        editorEdit.putInt("visitors_count", this.LLLIIII);
        editorEdit.putLong("media_id", this.LLJJ);
        editorEdit.putString("bg_img_url", this.LLILZ);
        editorEdit.putInt("display_ocr_entrance", this.LLLFZ);
        editorEdit.putString("user_auth_info", this.LLJJJJ);
        editorEdit.putInt("user_privacy_extend", this.LLJJJ);
        editorEdit.putInt("user_privacy_extend_value", this.LLJJJIL);
        editorEdit.putBoolean("is_visitor_account", this.LLLIIIIL);
        editorEdit.putBoolean("is_kids_mode", this.LLLIILIL);
        editorEdit.putBoolean("is_passkey_signup_account", this.LLLIL);
        JSONObject jSONObject = this.LLLILZJ;
        if (jSONObject == null) {
            editorEdit.putString("raw_json", "");
        } else {
            editorEdit.putString("raw_json", C786410Ut5.J3(jSONObject));
        }
        editorEdit.apply();
        JSONObject jSONObject2 = this.LLLILZ;
        if (jSONObject2 == null) {
            editorEdit.putString("expend_attrs", "");
        } else {
            editorEdit.putString("expend_attrs", C786410Ut5.J3(jSONObject2));
        }
        C1499900p8O.LIZ(editorEdit);
    }

    public final void LJIIJJI() {
        JSONObject jSONObjectLIZIZ;
        if (this.LLLIIIL == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.LLLJL.edit();
        Set<String> stringSet = this.LLLJL.getStringSet("store_key_saved_platform_app_id", null);
        if (stringSet != null) {
            for (String str : stringSet) {
                String strLIZJ = LIZJ(str);
                String string = this.LLLJL.getString(strLIZJ, null);
                if (TextUtils.isEmpty(string)) {
                    editorEdit.remove(strLIZJ);
                } else {
                    try {
                        Map map = (Map) ((HashMap) this.LLLIIIL.LJ).get(new JSONObject(string).optString("mName"));
                        if (map == null || map.isEmpty()) {
                            editorEdit.remove(strLIZJ);
                        } else {
                            C0XO4 c0xo4 = (C0XO4) map.get(str);
                            if (c0xo4 == null || !c0xo4.LLILLJJLI) {
                                editorEdit.remove(strLIZJ);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map map2 : ((HashMap) this.LLLIIIL.LJ).values()) {
            if (map2 != null && !map2.isEmpty()) {
                for (String str2 : map2.keySet()) {
                    C0XO4 c0xo42 = (C0XO4) map2.get(str2);
                    if (c0xo42 != null && c0xo42.LLILLJJLI && (jSONObjectLIZIZ = LIZIZ(c0xo42)) != null) {
                        editorEdit.putString(LIZJ(str2), C786410Ut5.J3(jSONObjectLIZIZ));
                        hashSet.add(str2);
                    }
                }
            }
        }
        editorEdit.putStringSet("store_key_saved_platform_app_id", hashSet);
        editorEdit.apply();
    }

    public final void LJFF() {
        C0XO4 c0xo4LJI;
        if (this.LLLIZZ) {
            return;
        }
        this.LLLIZZ = true;
        try {
            this.LLLILZJ = new JSONObject(this.LLLJL.getString("raw_json", "{}"));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLLILZJ = new JSONObject();
        }
        this.LLJZIJLIL = this.LLLJL.getBoolean("is_login", false);
        this.LLJJL = this.LLLJL.getLong("user_id", 0L);
        this.LLJJLIIIJLLLLLLLZ = this.LLLJL.getString("sec_user_id", "");
        this.LLJL = this.LLLJL.getInt("odin_user_type", 0);
        this.LLJZ = this.LLLJL.getBoolean("is_new_user", false);
        this.LLJLL = this.LLLJL.getString("session_key", "");
        this.LLJLLIL = this.LLLJL.getString("session_sign", "");
        this.LLJJIII = this.LLLJL.getString("user_name", "");
        this.LLJ = this.LLLJL.getInt("user_gender", 0);
        this.LLJJIJI = this.LLLJL.getString("screen_name", "");
        this.LLJLILLLLZIIL = this.LLLJL.getString("verified_content", "");
        this.LLJLIL = this.LLLJL.getBoolean("user_verified", false);
        this.LLILLL = this.LLLJL.getString("avatar_url", "");
        this.LLILZIL = this.LLLJL.getString("user_birthday", "");
        this.LLILLJJLI = this.LLLJL.getString("area", "");
        this.LLJI = this.LLLJL.getString("user_industry", "");
        this.LLIZLLLIL = this.LLLJL.getString("user_email", "");
        this.LLJJI = this.LLLJL.getString("user_mobile", "");
        this.LLJJJJLIIL = this.LLLJL.getString("user_decoration", "");
        this.LLIZ = this.LLLJL.getString("user_description", "");
        this.LLJILJILJ = this.LLLJL.getBoolean("is_recommend_allowed", false);
        this.LLJJIJIIJIL = this.LLLJL.getString("recommend_hint_message", "");
        this.LLJIJIL = this.LLLJL.getInt("is_blocked", 0);
        this.LLJILJIL = this.LLLJL.getInt("is_blocking", 0);
        this.LLJILLL = this.LLLJL.getBoolean("is_toutiao", false);
        this.LLL = this.LLLJL.getBoolean("user_has_pwd", false);
        this.LLJLLL = this.LLLJL.getInt("country_code", 0);
        this.LLLF = this.LLLJL.getLong("pgc_mediaid", 0L);
        this.LLLFF = this.LLLJL.getString("pgc_avatar_url", "");
        this.LLLFFI = this.LLLJL.getString("pgc_name", "");
        this.LLILZLL = this.LLLJL.getInt("can_be_found_by_phone", 1);
        this.LLJJIJIL = this.LLLJL.getInt("can_sync_share", 0);
        this.LLJJJ = this.LLLJL.getInt("user_privacy_extend", 0);
        this.LLJJJIL = this.LLLJL.getInt("user_privacy_extend_value", 2147483646);
        this.LLILZ = this.LLLJL.getString("bg_img_url", "");
        this.LLJJJJJIL = this.LLLJL.getString("multi_sids", "");
        this.LLLI = this.LLLJL.getInt("following_count", 0);
        this.LLLII = this.LLLJL.getInt("followers_count", 0);
        this.LLLIIII = this.LLLJL.getInt("visitors_count", 0);
        this.LLJJ = this.LLLJL.getLong("media_id", 0L);
        this.LLILZ = this.LLLJL.getString("bg_img_url", "");
        this.LLLFZ = this.LLLJL.getInt("display_ocr_entrance", 0);
        this.LLJJJJ = this.LLLJL.getString("user_auth_info", "");
        this.LLLIIIIL = this.LLLJL.getBoolean("is_visitor_account", false);
        this.LLLIIL = this.LLLJL.getStringSet("has_update_sec_uids", new HashSet());
        this.LLLIILIL = this.LLLJL.getBoolean("is_kids_mode", false);
        this.LLLIL = this.LLLJL.getBoolean("is_passkey_signup_account", false);
        if (this.LLJZIJLIL) {
            if (this.LLJJL <= 0) {
                this.LLJZIJLIL = false;
                this.LLJJL = 0L;
                this.LLJJLIIIJLLLLLLLZ = "";
                this.LLJL = 0;
            }
        } else if (this.LLJJL > 0) {
            this.LLJJL = 0L;
            this.LLJJLIIIJLLLLLLLZ = "";
            this.LLJL = 0;
        }
        SharedPreferences sharedPreferences = this.LLLJL;
        int i = 0;
        while (true) {
            C0XO4[] c0xo4Arr = this.LLLILZLLLI;
            if (i >= c0xo4Arr.length) {
                break;
            }
            C0XO4 c0xo4 = c0xo4Arr[i];
            c0xo4.LLILLJJLI = false;
            try {
                if (!TextUtils.isEmpty(c0xo4.LL)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("_platform_");
                    sbLIZ.append(c0xo4.LL);
                    String string = sharedPreferences.getString(C2188811AlT.LIZIZ(sbLIZ), null);
                    if (!TextUtils.isEmpty(string)) {
                        LJI(new JSONObject(string), c0xo4);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            i++;
        }
        if (this.LLJJL > 0) {
            LJIIL(this.LLJLL);
        }
        try {
            this.LLLILZ = new JSONObject(this.LLLJL.getString("expend_attrs", "{}"));
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
            this.LLLILZ = new JSONObject();
        }
        C0XO3 c0xo3 = new C0XO3(this.LLLILZJ);
        c0xo3.LIZ = this.LLJJL;
        c0xo3.LIZJ = this.LLJL;
        c0xo3.LJII = this.LLJZ;
        c0xo3.LJIIIIZZ = this.LLJLL;
        c0xo3.LJJIIJZLJL = this.LLJJIII;
        c0xo3.LJJJJL = this.LLJ;
        c0xo3.LJJIJ = this.LLJJIJI;
        c0xo3.LJJIJIIJI = this.LLJLILLLLZIIL;
        c0xo3.LJJIIZI = this.LLILLL;
        c0xo3.LJJJJLL = this.LLILZIL;
        c0xo3.LJJJJLI = this.LLJLIL;
        c0xo3.LJJJJZ = this.LLILLJJLI;
        c0xo3.LJJJJZI = this.LLJI;
        c0xo3.LJJIZ = this.LLJJJJLIIL;
        c0xo3.LJJIIZ = this.LLIZ;
        c0xo3.LJJIJLIJ = this.LLJILJILJ;
        c0xo3.LJJIL = this.LLJJIJIIJIL;
        c0xo3.LJJJI = this.LLILZLL;
        c0xo3.LJJJIL = this.LLJJIJIL;
        c0xo3.LJJJJJ = this.LLILZ;
        long j = this.LLJJ;
        c0xo3.LJJJJIZL = j;
        c0xo3.LJIIJ = this.LLIZLLLIL;
        c0xo3.LJJJ = this.LLJJJJ;
        c0xo3.LJJJJJL = this.LLLFZ;
        c0xo3.LJJJJI = this.LLJJJIL;
        c0xo3.LJJJJ = this.LLJJJ;
        c0xo3.LJJJLL = this.LLJIJIL;
        c0xo3.LJJJLIIL = this.LLJILJIL;
        c0xo3.LJJJLZIJ = this.LLJILLL;
        c0xo3.LJJJZ = this.LLL;
        c0xo3.LJJIJIL = this.LLLFF;
        c0xo3.LJJIJIIJIL = j;
        c0xo3.LJJIJL = this.LLLFFI;
        c0xo3.LJI = this.LLJLLL;
        c0xo3.LJIIL = this.LLJJLIIIJLLLLLLLZ;
        c0xo3.LJIILJJIL = this.LLLIIIIL;
        c0xo3.LJIILL = this.LLLIILIL;
        c0xo3.LJIILLIIL = this.LLLIL;
        c0xo3.LJJLI = this.LLLILZ;
        for (C0XO4 c0xo42 : this.LLLILZLLLI) {
            if (!TextUtils.isEmpty(c0xo42.LL) && c0xo42.LLILLJJLI) {
                ((HashMap) c0xo3.LIZLLL).put(c0xo42.LL, c0xo42);
            }
        }
        this.LLLIIIL = c0xo3;
        Set<String> stringSet = this.LLLJL.getStringSet("store_key_saved_platform_app_id", null);
        if (stringSet != null) {
            try {
                Iterator<String> it2 = stringSet.iterator();
                while (it2.hasNext()) {
                    String string2 = this.LLLJL.getString(LIZJ(it2.next()), null);
                    if (!TextUtils.isEmpty(string2) && (c0xo4LJI = LJI(new JSONObject(string2), null)) != null) {
                        Map map = (Map) ((HashMap) this.LLLIIIL.LJ).get(c0xo4LJI.LL);
                        if (map == null) {
                            map = new HashMap();
                            ((HashMap) this.LLLIIIL.LJ).put(c0xo4LJI.LL, map);
                        }
                        map.put(String.valueOf(c0xo4LJI.LLJILJIL), c0xo4LJI);
                    }
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        if (this.LLLIIIL != null) {
            TTAccountInit.LIZ().getClass();
            TTAccountInit.LIZ().getClass();
        }
    }

    public C0XO0(Context context) {
        Context contextN3 = C786410Ut5.N3(context);
        this.LLLJ = contextN3;
        this.LLLJL = C810670Vr7.LIZJ(contextN3, 0, "com.bytedance.sdk.account_setting");
        this.LLLIZZ = false;
        this.LLLILZLLLI = LLLLII;
        try {
            LJFF();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0XFF.LIZLLL(6, "BDAccountManager", "loadData fail", e);
        }
        this.LL = C0XIH.LIZJ(this.LLLJ);
    }

    public static JSONObject LIZIZ(C0XO4 c0xo4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mName", c0xo4.LL);
            jSONObject.put("mPlatformId", c0xo4.LLJILJIL);
            jSONObject.put("mNickname", c0xo4.LLILLL);
            jSONObject.put("mAvatar", c0xo4.LLILZ);
            jSONObject.put("mPlatformUid", c0xo4.LLILZIL);
            jSONObject.put("mExpire", c0xo4.LLJ);
            jSONObject.put("mExpireIn", c0xo4.LLJI);
            jSONObject.put("isLogin", c0xo4.LLILLJJLI);
            jSONObject.put("mUserId", c0xo4.LLJIJIL);
            jSONObject.put("mModifyTime", c0xo4.LLIZLLLIL);
            jSONObject.put("mSecPlatformUid", c0xo4.LLILZLL);
            jSONObject.put("mAccessToken", c0xo4.LLJILJILJ);
            jSONObject.put("mOpenId", c0xo4.LLJILLL);
            jSONObject.put("mScope", c0xo4.LLJJ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_platform_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0XO0 LIZLLL(Context context) {
        if (LLLLIIIILLL == null) {
            synchronized (C0XO0.class) {
                try {
                    if (LLLLIIIILLL == null) {
                        LLLLIIIILLL = new C0XO0(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (LLLLIIIILLL.LLLJ == null && C786410Ut5.N3(context) != null) {
            LLLLIIIILLL.LLLJ = C786410Ut5.N3(context);
        }
        return LLLLIIIILLL;
    }

    public static void LJIIL(String str) {
        try {
            ((C848000XOk) TTAccountInit.LIZ()).getClass();
            AppLog.setSessionKey(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ(C0XN9 c0xn9) {
        synchronized (this.LLLL) {
            try {
                this.LLLL.LIZJ(c0xn9);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(boolean z) {
        if (this.LLJZIJLIL) {
            this.LLJZ = false;
            this.LLJZIJLIL = false;
            this.LLJJL = 0L;
            this.LLJL = 0;
            this.LLJLL = "";
            this.LLJLLIL = "";
            this.LLJJLIIIJLLLLLLLZ = "";
            LJIIL("");
            this.LLJJIII = "";
            this.LLJ = 0;
            this.LLJJIJI = "";
            this.LLJLILLLLZIIL = "";
            this.LLIZ = "";
            this.LLILLJJLI = "";
            this.LLJI = "";
            this.LLJIJIL = 0;
            this.LLJILJIL = 0;
            this.LLJJJJLIIL = "";
            this.LLILZIL = "";
            this.LLJLIL = false;
            this.LLJILJILJ = false;
            this.LLJILLL = false;
            this.LLJLLL = 0;
            this.LLLI = 0;
            this.LLLII = 0;
            this.LLLIIII = 0;
            this.LLL = false;
            this.LLJJ = 0L;
            this.LLILZ = "";
            this.LLIZLLLIL = "";
            this.LLJJI = "";
            this.LLLFZ = 0;
            this.LLLFF = "";
            this.LLLF = 0L;
            this.LLLFFI = "";
            this.LLJJJJ = "";
            this.LLLIIIIL = false;
            for (C0XO4 c0xo4 : this.LLLILZLLLI) {
                c0xo4.LIZIZ();
            }
            Iterator it2 = ((HashMap) this.LLLIIIL.LJ).values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((Map) it2.next()).values().iterator();
                while (it3.hasNext()) {
                    ((C0XO4) it3.next()).LIZIZ();
                }
            }
            LJIIIZ();
        }
        if (z) {
            C0XGH c0xgh = new C0XGH(2);
            if (C847630XMz.LIZLLL != null) {
                C847630XMz c847630XMz = C847630XMz.LIZLLL;
                if (c847630XMz.LIZJ != null) {
                    Pair pair = new Pair(Integer.valueOf(c847630XMz.LIZJ.LIZIZ), c847630XMz.LIZJ.LIZ);
                    ((Integer) pair.first).intValue();
                    c0xgh.LIZIZ = (String) pair.second;
                } else {
                    c847630XMz.LIZJ = null;
                }
            }
            synchronized (this.LLLL) {
                try {
                    Iterator<C0XN9> it4 = this.LLLL.iterator();
                    while (it4.hasNext()) {
                        it4.next().LJI(c0xgh);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJII(C0XGH c0xgh) {
        synchronized (this.LLLL) {
            try {
                for (C0XN9 c0xn9 : this.LLLL) {
                    if (c0xn9 != null) {
                        c0xn9.LJI(c0xgh);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJ(SharedPreferences.Editor editor) {
        for (C0XO4 c0xo4 : this.LLLILZLLLI) {
            if (!this.LLJZIJLIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_platform_");
                sbLIZ.append(c0xo4.LL);
                editor.putString(C2188811AlT.LIZIZ(sbLIZ), "");
            } else {
                JSONObject jSONObjectLIZIZ = LIZIZ(c0xo4);
                if (jSONObjectLIZIZ != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("_platform_");
                    sbLIZ2.append(c0xo4.LL);
                    editor.putString(C2188811AlT.LIZIZ(sbLIZ2), C786410Ut5.J3(jSONObjectLIZIZ));
                }
            }
        }
        editor.apply();
    }

    public final void LJIILJJIL(Bundle bundle) {
        if (!TextUtils.isEmpty(null) && !bundle.isEmpty() && this.LLJZIJLIL && this.LLLIIIL != null) {
            String strValueOf = String.valueOf(0);
            Map map = (Map) ((HashMap) this.LLLIIIL.LJ).get(null);
            if (map == null) {
                map = new HashMap();
                ((HashMap) this.LLLIIIL.LJ).put(null, map);
            }
            C0XO4 c0xo4 = (C0XO4) map.get(strValueOf);
            if (c0xo4 == null) {
                c0xo4 = new C0XO4(null);
                c0xo4.LLJILJIL = 0;
                c0xo4.LLILLJJLI = true;
                c0xo4.LLJIJIL = this.LLJJL;
                map.put(strValueOf, c0xo4);
            }
            C0XO4 c0xo42 = (C0XO4) ((HashMap) this.LLLIIIL.LIZLLL).get(null);
            if (c0xo42 == null) {
                ((HashMap) this.LLLIIIL.LIZLLL).put(null, c0xo4);
                c0xo42 = c0xo4;
            }
            if (bundle.containsKey("access_token")) {
                String string = bundle.getString("access_token", null);
                c0xo42.LLJILJILJ = string;
                c0xo4.LLJILJILJ = string;
            }
            if (bundle.containsKey("expires_in")) {
                long j = bundle.getLong("expires_in", 0L);
                c0xo42.LLJI = j;
                c0xo4.LLJI = j;
            }
            if (bundle.containsKey("open_id")) {
                String string2 = bundle.getString("open_id", null);
                c0xo42.LLJILLL = string2;
                c0xo4.LLJILLL = string2;
            }
            if (bundle.containsKey("scopes")) {
                String string3 = bundle.getString("scopes", null);
                c0xo42.LLJJ = string3;
                c0xo4.LLJJ = string3;
            }
            TTAccountInit.LIZ().getClass();
            TTAccountInit.LIZ().getClass();
            HashMap map2 = (HashMap) this.LLLIIIL.LIZLLL;
            if (map2 != null && !map2.isEmpty()) {
                for (C0XO4 c0xo43 : this.LLLILZLLLI) {
                    c0xo43.LLILLJJLI = false;
                    C0XO4 c0xo44 = (C0XO4) map2.get(c0xo43.LL);
                    if (c0xo44 == null) {
                        c0xo43.LIZIZ();
                    } else {
                        if (!c0xo43.LLILLJJLI) {
                            c0xo43.LLILLJJLI = true;
                        }
                        c0xo43.LLJILJIL = c0xo44.LLJILJIL;
                        c0xo43.LLJ = c0xo44.LLJ;
                        c0xo43.LLJI = c0xo44.LLJI;
                        c0xo43.LLILLL = c0xo44.LLILLL;
                        c0xo43.LLILZ = c0xo44.LLILZ;
                        c0xo43.LLILZIL = c0xo44.LLILZIL;
                        c0xo43.LLJIJIL = c0xo44.LLJIJIL;
                        c0xo43.LLIZLLLIL = c0xo44.LLIZLLLIL;
                        c0xo43.LLJILJILJ = c0xo44.LLJILJILJ;
                        c0xo43.LLJILLL = c0xo44.LLJILLL;
                        c0xo43.LLJJ = c0xo44.LLJJ;
                    }
                }
            }
            LJIIJ(this.LLLJL.edit());
            LJIIJJI();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C845970XGp c845970XGp;
        C0XGA c0xga;
        if (message.what == 100 && (HandlerHook.getMessageObj(message.obj) instanceof C845970XGp) && (c0xga = (c845970XGp = (C845970XGp) HandlerHook.getMessageObj(message.obj)).LIZIZ) != null) {
            Iterator it2 = ((ArrayList) LLLLIIL).iterator();
            while (it2.hasNext()) {
                ((C0XOA) it2.next()).LIZ(c0xga);
            }
            boolean zLJI = MethodIDManager.LJI(137805);
            AbstractC846040XGw abstractC846040XGw = c845970XGp.LIZ;
            if (abstractC846040XGw != null) {
                T t = c845970XGp.LIZIZ;
                if (!abstractC846040XGw.LIZIZ) {
                    abstractC846040XGw.LIZ(t);
                }
                AbstractC845940XGm abstractC845940XGm = abstractC846040XGw.LIZ;
                if (abstractC845940XGm != null) {
                    abstractC845940XGm.LJ = null;
                }
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        if (message.what == 1000) {
            this.LLLJIL.removeMessages(LSPassThroughRecordSizeConfig.DEFAULT);
            LJIILIIL("region_polling", null, null);
        }
    }

    public static C0XO4 LJI(JSONObject jSONObject, C0XO4 c0xo4) {
        String strOptString = jSONObject.optString("mName", "");
        if (TextUtils.isEmpty(strOptString)) {
            return c0xo4;
        }
        if (c0xo4 == null) {
            c0xo4 = new C0XO4(strOptString);
        }
        if (!TextUtils.equals(strOptString, c0xo4.LL)) {
            return c0xo4;
        }
        if (jSONObject.has("mPlatformId")) {
            c0xo4.LLJILJIL = jSONObject.optLong("mPlatformId", 0L);
        }
        if (jSONObject.has("mNickname")) {
            c0xo4.LLILLL = jSONObject.optString("mNickname", "");
        }
        if (jSONObject.has("mAvatar")) {
            c0xo4.LLILZ = jSONObject.optString("mAvatar", "");
        }
        if (jSONObject.has("mPlatformUid")) {
            c0xo4.LLILZIL = jSONObject.optString("mPlatformUid", "");
        }
        if (jSONObject.has("mExpire")) {
            c0xo4.LLJ = jSONObject.optLong("mExpire", c0xo4.LLJ);
        }
        if (jSONObject.has("mExpireIn")) {
            c0xo4.LLJI = jSONObject.optLong("mExpireIn", c0xo4.LLJI);
        }
        if (jSONObject.has("isLogin")) {
            c0xo4.LLILLJJLI = jSONObject.optBoolean("isLogin", false);
        }
        if (jSONObject.has("mUserId")) {
            c0xo4.LLJIJIL = jSONObject.optLong("mUserId", 0L);
        }
        if (jSONObject.has("mModifyTime")) {
            c0xo4.LLIZLLLIL = jSONObject.optLong("mModifyTime");
        }
        if (jSONObject.has("mSecPlatformUid")) {
            c0xo4.LLILZLL = jSONObject.optString("mSecPlatformUid");
        }
        if (jSONObject.has("mAccessToken")) {
            c0xo4.LLJILJILJ = jSONObject.optString("mAccessToken");
        }
        if (jSONObject.has("mOpenId")) {
            c0xo4.LLJILLL = jSONObject.optString("mOpenId");
        }
        if (jSONObject.has("mScope")) {
            c0xo4.LLJJ = jSONObject.optString("mScope");
        }
        return c0xo4;
    }

    public final void LJIIIIZZ(C0XO2 c0xo2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C845480XEs c845480XEs;
        C0XGH c0xgh;
        long j = c0xo2.LIZ;
        int i = c0xo2.LIZJ;
        if (i != 0 && i != this.LLJL) {
            this.LLJL = i;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j <= 0) {
            if (this.LLJZIJLIL) {
                this.LLJZ = false;
                this.LLJZIJLIL = false;
                this.LLJJL = 0L;
                this.LLJJLIIIJLLLLLLLZ = "";
                this.LLJL = 0;
                this.LLJJIII = "";
                this.LLJ = 0;
                this.LLJJIJI = "";
                this.LLJLILLLLZIIL = "";
                this.LLILLL = "";
                this.LLILZIL = "";
                this.LLILLJJLI = "";
                this.LLJI = "";
                this.LLJJJJLIIL = "";
                this.LLIZ = "";
                this.LLJLIL = false;
                this.LLJILJILJ = false;
                this.LLJLL = "";
                this.LLLI = 0;
                this.LLLII = 0;
                this.LLLIIII = 0;
                this.LLJIJIL = 0;
                this.LLJILJIL = 0;
                this.LLJILLL = false;
                this.LLL = false;
                this.LLJJ = 0L;
                this.LLILZ = "";
                this.LLLFZ = 0;
                this.LLLFF = "";
                this.LLLF = 0L;
                this.LLLFFI = "";
                this.LLJJJJ = "";
                this.LLLIIIIL = false;
                this.LLLILZJ = null;
                this.LLLILZ = null;
                this.LLLIIIL = null;
                for (C0XO4 c0xo4 : this.LLLILZLLLI) {
                    c0xo4.LIZIZ();
                }
                z2 = true;
            }
            z3 = false;
            z4 = false;
        } else {
            this.LLLIIIL = c0xo2;
            if (!this.LLJZIJLIL) {
                this.LLJZIJLIL = true;
                try {
                    CookieSyncManager.getInstance().sync();
                } catch (Throwable th) {
                }
                z2 = true;
            }
            if (c0xo2.LJII) {
                this.LLJZ = true;
            }
            if (this.LLJJL != j) {
                this.LLJJL = j;
                z2 = true;
                z3 = true;
            } else {
                z3 = false;
            }
            if (!C2093608Ic.LIZJ(this.LLJJLIIIJLLLLLLLZ, c0xo2.LJIIL)) {
                this.LLJJLIIIJLLLLLLLZ = c0xo2.LJIIL;
                final Context context = this.LLLJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0xo2.LIZ);
                sbLIZ.append("");
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                final String str = c0xo2.LJFF;
                AbstractC845510XEv.LIZ.execute(new ARunnableS113S0100000_13(new AbstractC845510XEv<C845530XEx>() { // from class: X.0XEu
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
                    /* JADX WARN: Type inference failed for: r2v1, types: [X.0XEx] */
                    /* JADX WARN: Type inference failed for: r2v3, types: [X.0XEx] */
                    @Override // X.AbstractC845510XEv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C845530XEx LIZ() {
                        /*
                            r8 = this;
                            X.0XEr r7 = X.C845520XEw.LIZ
                            java.lang.String r2 = r2
                            java.lang.String r1 = r3
                            r7.getClass()
                            boolean r0 = android.text.TextUtils.isEmpty(r2)
                            r5 = 0
                            if (r0 != 0) goto L80
                            boolean r0 = android.text.TextUtils.isEmpty(r1)
                            if (r0 != 0) goto L80
                            boolean r0 = r7.LIZ()
                            if (r0 == 0) goto L80
                            android.content.ContentValues r4 = new android.content.ContentValues
                            r4.<init>()
                            java.lang.String r0 = "sec_uid"
                            r4.put(r0, r1)
                            r6 = 1
                            java.lang.String[] r3 = new java.lang.String[r6]
                            r3[r5] = r2
                            android.database.sqlite.SQLiteDatabase r2 = r7.LIZIZ
                            java.lang.String r1 = "login_info"
                            java.lang.String r0 = "uid = ?"
                            int r0 = r2.update(r1, r4, r0, r3)
                            if (r0 == 0) goto L80
                        L38:
                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                            java.lang.String r0 = "updateSecUid res = "
                            r1.append(r0)
                            r1.append(r6)
                            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                            java.lang.String r0 = "SaveService"
                            X.C0XFF.LIZ(r0, r1)
                            if (r6 == 0) goto L82
                            android.content.Context r0 = r1
                            X.0XO0 r3 = X.C0XO0.LIZLLL(r0)
                            java.lang.String r1 = r2
                            java.util.Set<java.lang.String> r0 = r3.LLLIIL
                            if (r0 != 0) goto L63
                            java.util.HashSet r0 = new java.util.HashSet
                            r0.<init>()
                            r3.LLLIIL = r0
                        L63:
                            java.util.Set<java.lang.String> r0 = r3.LLLIIL
                            r0.add(r1)
                            android.content.SharedPreferences r0 = r3.LLLJL
                            android.content.SharedPreferences$Editor r2 = r0.edit()
                            java.lang.String r1 = "has_update_sec_uids"
                            java.util.Set<java.lang.String> r0 = r3.LLLIIL
                            android.content.SharedPreferences$Editor r0 = r2.putStringSet(r1, r0)
                            r0.apply()
                            X.0XEx r2 = new X.0XEx
                            r0 = 0
                            r2.<init>(r5, r0)
                            return r2
                        L80:
                            r6 = 0
                            goto L38
                        L82:
                            X.0XEx r2 = new X.0XEx
                            r1 = -1
                            java.lang.String r0 = "Data update failed or there is no such data"
                            r2.<init>(r1, r0)
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C845500XEu.LIZ():java.lang.Object");
                    }

                    @Override // X.AbstractC845510XEv
                    public final /* bridge */ /* synthetic */ void LIZIZ(C845530XEx c845530XEx) {
                    }
                }, 161));
                z2 = true;
            }
            if (!C2093608Ic.LIZJ(this.LLJLL, c0xo2.LJIIIIZZ)) {
                this.LLJLL = c0xo2.LJIIIIZZ;
                z2 = true;
                z3 = true;
            }
            if (!C2093608Ic.LIZJ(this.LLJJI, c0xo2.LJIIIZ)) {
                this.LLJJI = c0xo2.LJIIIZ;
                z2 = true;
            }
            if (!C2093608Ic.LIZJ(this.LLIZLLLIL, c0xo2.LJIIJ)) {
                this.LLIZLLLIL = c0xo2.LJIIJ;
                z2 = true;
            }
            boolean z5 = this.LLL;
            boolean z6 = c0xo2.LJIILIIL;
            if (z5 != z6) {
                this.LLL = z6;
                z2 = true;
            }
            int i2 = this.LLJLLL;
            int i3 = c0xo2.LJI;
            if (i2 != i3) {
                this.LLJLLL = i3;
                z2 = true;
            }
            boolean z7 = this.LLLIIIIL;
            boolean z8 = c0xo2.LJIILJJIL;
            if (z7 != z8) {
                this.LLLIIIIL = z8;
                z2 = true;
            }
            boolean z9 = this.LLLIILIL;
            boolean z10 = c0xo2.LJIILL;
            if (z9 != z10) {
                this.LLLIILIL = z10;
                z2 = true;
            }
            boolean z11 = this.LLLIL;
            boolean z12 = c0xo2.LJIILLIIL;
            if (z11 != z12) {
                this.LLLIL = z12;
                z2 = true;
            }
            boolean z13 = false;
            for (C0XO4 c0xo42 : this.LLLILZLLLI) {
                C0XO4 c0xo43 = (C0XO4) ((HashMap) c0xo2.LIZLLL).get(c0xo42.LL);
                if (c0xo43 == null) {
                    if (c0xo42.LLILLJJLI) {
                        z13 = true;
                    }
                    c0xo42.LIZIZ();
                } else {
                    if (!c0xo42.LLILLJJLI) {
                        c0xo42.LLILLJJLI = true;
                        z13 = true;
                    }
                    c0xo42.LLJILJIL = c0xo43.LLJILJIL;
                    c0xo42.LLJ = c0xo43.LLJ;
                    c0xo42.LLJI = c0xo43.LLJI;
                    c0xo42.LLILLL = c0xo43.LLILLL;
                    c0xo42.LLILZ = c0xo43.LLILZ;
                    c0xo42.LLILZIL = c0xo43.LLILZIL;
                    c0xo42.LLJIJIL = c0xo43.LLJIJIL;
                    c0xo42.LLIZLLLIL = c0xo43.LLIZLLLIL;
                    c0xo42.LLILZLL = c0xo43.LLILZLL;
                }
            }
            if (z13) {
                z2 = true;
            }
            JSONObject jSONObject = this.LLLILZJ;
            if (jSONObject != null && c0xo2.LJJII != null) {
                jSONObject.optJSONObject("data");
            }
            this.LLLILZJ = c0xo2.LJJIII;
            if (c0xo2 instanceof C0XO3) {
                C0XO3 c0xo3 = (C0XO3) c0xo2;
                if (!C2093608Ic.LIZJ(this.LLJJIII, c0xo3.LJJIIJZLJL)) {
                    this.LLJJIII = c0xo3.LJJIIJZLJL;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLJJIJI, c0xo3.LJJIJ)) {
                    this.LLJJIJI = c0xo3.LJJIJ;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLJLILLLLZIIL, c0xo3.LJJIJIIJI)) {
                    this.LLJLILLLLZIIL = c0xo3.LJJIJIIJI;
                    z2 = true;
                }
                int i4 = this.LLJ;
                int i5 = c0xo3.LJJJJL;
                if (i4 != i5) {
                    this.LLJ = i5;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLIZ, c0xo3.LJJIIZ)) {
                    this.LLIZ = c0xo3.LJJIIZ;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLILLL, c0xo3.LJJIIZI)) {
                    this.LLILLL = c0xo3.LJJIIZI;
                    z2 = true;
                }
                boolean z14 = this.LLJLIL;
                boolean z15 = c0xo3.LJJJJLI;
                if (z14 != z15) {
                    this.LLJLIL = z15;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLILZIL, c0xo3.LJJJJLL)) {
                    this.LLILZIL = c0xo3.LJJJJLL;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLILLJJLI, c0xo3.LJJJJZ)) {
                    this.LLILLJJLI = c0xo3.LJJJJZ;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLJI, c0xo3.LJJJJZI)) {
                    this.LLJI = c0xo3.LJJJJZI;
                    z2 = true;
                }
                boolean z16 = this.LLJILLL;
                boolean z17 = c0xo3.LJJJLZIJ;
                if (z16 != z17) {
                    this.LLJILLL = z17;
                    z2 = true;
                }
                int i6 = this.LLJILJIL;
                int i7 = c0xo3.LJJJLIIL;
                if (i6 != i7) {
                    this.LLJILJIL = i7;
                    z2 = true;
                }
                int i8 = this.LLJIJIL;
                int i9 = c0xo3.LJJJLL;
                if (i8 != i9) {
                    this.LLJIJIL = i9;
                    z2 = true;
                }
                boolean z18 = this.LLJILJILJ;
                boolean z19 = c0xo3.LJJIJLIJ;
                if (z18 != z19) {
                    this.LLJILJILJ = z19;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLJJIJIIJIL, c0xo3.LJJIL)) {
                    this.LLJJIJIIJIL = c0xo3.LJJIL;
                    z2 = true;
                }
                int i10 = this.LLILZLL;
                int i11 = c0xo3.LJJJI;
                if (i10 != i11) {
                    this.LLILZLL = i11;
                    z2 = true;
                }
                int i12 = this.LLJJJ;
                int i13 = c0xo3.LJJJJ;
                if (i12 != i13) {
                    this.LLJJJ = i13;
                    z2 = true;
                }
                int i14 = this.LLJJJIL;
                int i15 = c0xo3.LJJJJI;
                if (i14 != i15) {
                    this.LLJJJIL = i15;
                    z2 = true;
                }
                int i16 = this.LLJJIJIL;
                int i17 = c0xo3.LJJJIL;
                if (i16 != i17) {
                    this.LLJJIJIL = i17;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLJJJJLIIL, c0xo3.LJJIZ)) {
                    this.LLJJJJLIIL = c0xo3.LJJIZ;
                    z2 = true;
                }
                long j2 = this.LLJJ;
                long j3 = c0xo3.LJJJJIZL;
                if (j2 != j3) {
                    this.LLJJ = j3;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLLFF, c0xo3.LJJIJIL)) {
                    this.LLLFF = c0xo3.LJJIJIL;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLLFFI, c0xo3.LJJIJL)) {
                    this.LLLFFI = c0xo3.LJJIJL;
                    z2 = true;
                }
                long j4 = this.LLLF;
                long j5 = c0xo3.LJJIJIIJIL;
                if (j4 != j5) {
                    this.LLLF = j5;
                    z2 = true;
                }
                if ((!TextUtils.isEmpty(this.LLILZ) && !TextUtils.isEmpty(c0xo3.LJJJJJ) && !C2093608Ic.LIZJ(this.LLILZ, c0xo3.LJJJJJ)) || ((TextUtils.isEmpty(this.LLILZ) && !TextUtils.isEmpty(c0xo3.LJJJJJ)) || (!TextUtils.isEmpty(this.LLILZ) && TextUtils.isEmpty(c0xo3.LJJJJJ)))) {
                    this.LLILZ = c0xo3.LJJJJJ;
                    z2 = true;
                }
                int i18 = this.LLLFZ;
                int i19 = c0xo3.LJJJJJL;
                if (i18 != i19) {
                    this.LLLFZ = i19;
                    z2 = true;
                }
                if (!C2093608Ic.LIZJ(this.LLJJJJ, c0xo3.LJJJ)) {
                    this.LLJJJJ = c0xo3.LJJJ;
                    z2 = true;
                }
                this.LLLILZ = c0xo3.LJJLI;
            }
            this.LLJZIJLIL = true;
            z4 = true;
        }
        if (z2) {
            LJIIIZ();
            if (z) {
                if (z4) {
                    c0xgh = new C0XGH() { // from class: X.0XOC
                    };
                } else {
                    c0xgh = new C0XGH(0);
                }
                synchronized (this.LLLL) {
                    try {
                        Iterator<C0XN9> it2 = this.LLLL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LJI(c0xgh);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            try {
            } catch (Exception th2) {
            }
            if (C845550XEz.LIZ != null) {
                C0XO7 c0xo7 = new C0XO7();
                c0xo7.LIZ = new Date().getTime();
                JSONObject jSONObject2 = c0xo2.LJJII;
                if (jSONObject2 != null) {
                    c0xo7.LIZIZ = c0xo2.LIZ;
                    c0xo7.LIZJ = c0xo2.LJFF;
                    String strOptString = jSONObject2.optString("avatar_url");
                    String strOptString2 = c0xo2.LJJII.optString("screen_name");
                    c0xo7.LJFF = c0xo2.LJJII.optString("username");
                    c0xo7.LJ = strOptString2;
                    c0xo7.LIZLLL = strOptString;
                    if (C845550XEz.LIZ.intValue() == 6) {
                        Map<String, C0XO4> map = c0xo2.LIZLLL;
                        if (map != null) {
                            HashMap map2 = (HashMap) map;
                            for (String str2 : map2.keySet()) {
                                if (str2.contains(C845550XEz.LIZIZ)) {
                                    C845550XEz.LIZIZ = str2;
                                    C0XO4 c0xo44 = (C0XO4) map2.get(str2);
                                    if (c0xo44 != null) {
                                        String str3 = c0xo44.LLILLL;
                                        c0xo7.LJI = c0xo44.LLILZ;
                                        c0xo7.LJII = str3;
                                    }
                                }
                            }
                        }
                    } else if (C845550XEz.LIZ.intValue() == 1) {
                        C845550XEz.LIZIZ = c0xo2.LJIIIZ;
                        if (c0xo7.LJIIIIZZ == null) {
                            c0xo7.LJIIIIZZ = new C00Y0();
                        }
                        c0xo7.LJIIIIZZ.getClass();
                    } else if (C845550XEz.LIZ.intValue() == 2 || C845550XEz.LIZ.intValue() == 3) {
                        int i20 = c0xo2.LJI;
                        if (!TextUtils.isEmpty(C845550XEz.LIZIZ) && C845550XEz.LIZIZ.startsWith("+")) {
                            String str4 = C845550XEz.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("+");
                            sbLIZ2.append(i20);
                            C845550XEz.LIZIZ = str4.replace(C2188811AlT.LIZIZ(sbLIZ2), "");
                        }
                        if (c0xo7.LJIIIIZZ == null) {
                            c0xo7.LJIIIIZZ = new C00Y0();
                        }
                        c0xo7.LJIIIIZZ.getClass();
                    }
                }
                c845480XEs = new C845480XEs(c0xo7.LIZ, C845550XEz.LIZ.intValue(), C845550XEz.LIZIZ, c0xo7.LIZIZ, c0xo7.LIZJ, c0xo7.LIZLLL, c0xo7.LJFF, c0xo7.LJ, c0xo7.LJI, c0xo7.LJII, c0xo7.LJIIIIZZ);
            } else {
                c845480XEs = null;
            }
            C845550XEz.LIZ = null;
            C845550XEz.LIZIZ = null;
            if (c845480XEs != null) {
                TTAccountInit.LIZ().getClass();
            }
        }
        if (z3) {
            LJIIL(this.LLJLL);
        }
        if (c0xo2.LJJ != null) {
            SharedPreferences sharedPreferences = C847880XNy.LIZ;
            final String string = Long.toString(c0xo2.LIZ);
            Object obj = new Object(string) { // from class: X.0XOG
            };
            Map mapLIZ = C847880XNy.LIZ();
            mapLIZ.put(string, obj);
            C847880XNy.LIZ.edit().putString(C847880XNy.LIZJ, GsonProtectorUtils.toJson(C847880XNy.LIZIZ, mapLIZ)).apply();
        }
    }

    public final void LJIILIIL(String str, Map map, final C0XOL c0xol) {
        if (!this.LLJZIJLIL) {
            WeakHandler weakHandler = this.LLLJIL;
            if (weakHandler != null) {
                weakHandler.sendEmptyMessageDelayed(LSPassThroughRecordSizeConfig.DEFAULT, 600000L);
                return;
            }
            return;
        }
        C0XIH c0xih = this.LL;
        if (c0xih != null) {
            C0XIE c0xie = new C0XIE() { // from class: X.0XID
                @Override // X.C0XH7
                public final void LJI(C0XGA c0xga) {
                    C0XIE c0xie2 = c0xol;
                    if (c0xie2 != null) {
                        c0xie2.LJI(c0xga);
                    }
                    WeakHandler weakHandler2 = this.LIZLLL.LLLJIL;
                    if (weakHandler2 != null) {
                        weakHandler2.sendEmptyMessageDelayed(LSPassThroughRecordSizeConfig.DEFAULT, 600000L);
                    }
                }

                @Override // X.C0XH7
                public final void LJ(C0XGA c0xga, int i) {
                    C0XIE c0xie2 = c0xol;
                    if (c0xie2 != null) {
                        c0xie2.LJ(c0xga, i);
                    }
                    WeakHandler weakHandler2 = this.LIZLLL.LLLJIL;
                    if (weakHandler2 != null) {
                        weakHandler2.sendEmptyMessageDelayed(LSPassThroughRecordSizeConfig.DEFAULT, 600000L);
                    }
                }
            };
            Context context = c0xih.LIZ;
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C786410Ut5.N3(context), 0, "account_info_device_info");
            C846070XGz c846070XGz = new C846070XGz();
            c846070XGz.LIZ = C0XH1.LIZ("/passport/account/info/v2/");
            c846070XGz.LIZLLL(map);
            c846070XGz.LIZJ(Scene.SCENE_SERVICE, str);
            c846070XGz.LIZJ("device_migrate_time", String.valueOf(sharedPreferencesLIZJ.getLong("device_migrate_time", 0L)));
            if (Arrays.asList("polling", "region_polling", "login", "pushed_message", "otl").contains(str)) {
                c846070XGz.LIZJ("get_info_type", "1");
            }
            new C0XIF(context, c846070XGz.LIZIZ(), c0xie).LJIIIZ();
        }
    }
}
