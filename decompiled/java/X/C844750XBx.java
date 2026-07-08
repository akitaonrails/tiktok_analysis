package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844750XBx extends C0XB9 {
    public final Context LJ;
    public final C844770XBz LJFF;
    public final C844630XBl LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    @Override // X.C0XB9
    public final boolean LIZ(JSONObject jSONObject) throws JSONException {
        String string;
        String abVersion;
        String string2;
        String string3;
        ?? map;
        String str;
        jSONObject.put("channel", this.LJFF.LJI);
        jSONObject.put("not_request_sender", 1);
        jSONObject.put("aid", this.LJFF.LIZ);
        String str2 = this.LJFF.LJIIIIZZ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("release_build", str2);
        C844770XBz c844770XBz = this.LJFF;
        if (!TextUtils.isEmpty(c844770XBz.LJIIJ)) {
            string = c844770XBz.LJIIJ;
        } else {
            string = C844580XBg.LIZ(c844770XBz.LIZJ, c844770XBz).getString("user_agent", null);
        }
        C2123908Tt.LJFF("user_agent", string, jSONObject);
        InterfaceC844950XCr interfaceC844950XCr = this.LJFF.LJIIIZ;
        if (interfaceC844950XCr != null) {
            abVersion = interfaceC844950XCr.getAbVersion();
        } else {
            abVersion = null;
        }
        C2123908Tt.LJFF("ab_version", abVersion, jSONObject);
        if (!this.LJI.LL) {
            this.LJFF.getClass();
            Pair<String, Boolean> pairLIZ = C0WV3.LIZ(this.LJ, this.LJFF);
            C0XCM c0xcmLIZLLL = C0XC2.LIZJ().LIZLLL(this.LJFF.LIZ);
            if (c0xcmLIZLLL != null) {
                c0xcmLIZLLL.LIZJ = ((Boolean) pairLIZ.second).booleanValue() ? 1 : 0;
                c0xcmLIZLLL.LIZ = 2;
                c0xcmLIZLLL.LIZIZ = !TextUtils.isEmpty((CharSequence) pairLIZ.first) ? 1 : 0;
                C0WV4 c0wv4 = C0WV3.LIZIZ;
                c0xcmLIZLLL.LIZLLL = c0wv4.LIZIZ - c0wv4.LIZ;
            }
            C844770XBz c844770XBz2 = this.LJFF;
            C0XC2.LIZJ().LIZLLL(c844770XBz2.LIZ).LIZIZ(c844770XBz2, "dr_register_param");
            if (TextUtils.isEmpty(null) && pairLIZ != null && !TextUtils.isEmpty((CharSequence) pairLIZ.first)) {
                str = (String) pairLIZ.first;
            } else {
                str = null;
            }
            C2123908Tt.LJFF("google_aid", str, jSONObject);
            if (pairLIZ != null) {
                jSONObject.put("gaid_limited", ((Boolean) pairLIZ.second).booleanValue() ? 1 : 0);
            }
        }
        C844770XBz c844770XBz3 = this.LJFF;
        if (!TextUtils.isEmpty(c844770XBz3.LJIIJJI)) {
            string2 = c844770XBz3.LJIIJJI;
        } else {
            string2 = C844580XBg.LIZ(c844770XBz3.LIZJ, c844770XBz3).getString("app_language", null);
        }
        if (TextUtils.isEmpty(string2)) {
            string2 = this.LJFF.LIZJ().getString("app_language", null);
        }
        C2123908Tt.LJFF("app_language", string2, jSONObject);
        C844770XBz c844770XBz4 = this.LJFF;
        if (!TextUtils.isEmpty(c844770XBz4.LJIIL)) {
            string3 = c844770XBz4.LJIIL;
        } else {
            string3 = C844580XBg.LIZ(c844770XBz4.LIZJ, c844770XBz4).getString("app_region", null);
        }
        if (TextUtils.isEmpty(string3)) {
            string3 = this.LJFF.LIZJ().getString("app_region", null);
        }
        C2123908Tt.LJFF("app_region", string3, jSONObject);
        C844770XBz c844770XBz5 = this.LJFF;
        JSONObject jSONObject2 = c844770XBz5.LJIILIIL;
        if (jSONObject2 == null) {
            String string4 = C844580XBg.LIZ(c844770XBz5.LIZJ, c844770XBz5).getString("app_track", null);
            if (string4 != null) {
                try {
                    jSONObject2 = new JSONObject(string4);
                    jSONObject.put("app_track", jSONObject2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            try {
                jSONObject.put("app_track", jSONObject2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C844830XCf.LIZLLL(th);
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("custom");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(this.LJFF.LJ)) {
            jSONObjectOptJSONObject.put("real_package_name", this.LJFF.LIZJ.getPackageName());
        }
        try {
            C0XDL c0xdl = this.LJFF.LJIL;
            if (c0xdl != null) {
                JSONObject jSONObjectLIZIZ = ((C1BA2) c0xdl).LIZIZ();
                if (jSONObjectLIZIZ == null) {
                    map = Collections.emptyMap();
                    if (map != 0) {
                    }
                } else {
                    map = new HashMap();
                    Iterator<String> itKeys = jSONObjectLIZIZ.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next != null) {
                            map.put(next, jSONObjectLIZIZ.opt(next));
                        }
                    }
                }
                if (map.size() > 0) {
                    for (String str3 : map.keySet()) {
                        jSONObjectOptJSONObject.put(str3, map.get(str3));
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        jSONObject.put("custom", jSONObjectOptJSONObject);
        return true;
    }

    @Override // X.C0XB9
    public final void LIZIZ(JSONObject jSONObject) {
        jSONObject.remove("channel");
        jSONObject.remove("not_request_sender");
        jSONObject.remove("aid");
        jSONObject.remove("release_build");
        jSONObject.remove("user_agent");
        jSONObject.remove("ab_version");
        jSONObject.remove("gaid_limited");
        jSONObject.remove("google_aid");
        jSONObject.remove("app_language");
        jSONObject.remove("app_region");
        jSONObject.remove("app_track");
        jSONObject.remove("custom");
    }

    public C844750XBx(Context context, C844630XBl c844630XBl, C844770XBz c844770XBz) {
        super(false, true);
        this.LJ = context;
        this.LJFF = c844770XBz;
        this.LJI = c844630XBl;
    }
}
