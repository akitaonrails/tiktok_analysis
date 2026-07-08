package X;

import Y.ARunnableS2S2200000_3;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WW5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WW5 extends C0W58 {
    public final Context LIZ;
    public final String LIZIZ;
    public C817470W4z LIZJ;
    public C0WW6 LIZLLL;

    public final boolean LJI() {
        try {
            String str = this.LIZIZ;
            if (str == null) {
                return false;
            }
            String str2 = C786410Ut5.Y3(this.LIZ.getPackageManager(), str, 0).versionName;
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            Map<String, String> map = C1129704bP.LIZ;
            Map<String, String> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("app2web_custom_tabs_browser_support", Map.class, map);
            if (map2 != null) {
                map = map2;
            }
            String str3 = map.get(str);
            if (str3 == null || str2 == null) {
                return false;
            }
            return C236500vj.LIZ(str2, str3) >= 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public C0WW5(Context context) {
        this.LIZ = context;
        this.LIZIZ = C817470W4z.LIZIZ(context, C13BV.INSTANCE);
    }

    @Override // X.C0W58
    public final void LIZJ(Bundle bundle) {
        C0WW6 c0ww6 = this.LIZLLL;
        if (c0ww6 != null) {
            c0ww6.LJIIIZ = true;
            LJIIJ(c0ww6, true, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0WA0
            if (r0 == 0) goto L48
            r4 = r6
            X.0WA0 r4 = (X.C0WA0) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L4e
            X.C155000ia.LIZIZ(r2)
        L22:
            X.0W4z r2 = (X.C817470W4z) r2
            if (r2 == 0) goto L2d
            boolean r0 = r2.LIZLLL()
            java.lang.Boolean.valueOf(r0)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r2)
            r4.LLILLL = r0
            X.0W4z r2 = r5.LIZJ
            if (r2 != 0) goto L45
            X.0WWD r2 = new X.0WWD
            r0 = 0
            r2.<init>(r5, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r4)
        L45:
            if (r2 != r3) goto L22
            return r3
        L48:
            X.0WA0 r4 = new X.0WA0
            r4.<init>(r5, r6)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WW5.LJIIL(X.05Vn):java.lang.Object");
    }

    @Override // X.C0W58
    public final void LIZLLL(int i, Bundle bundle) {
        if (i != 2) {
            if (i == 6) {
                C0WW6 c0ww6 = this.LIZLLL;
                if (c0ww6 != null) {
                    C2296808zG.LIZJ(c0ww6.LIZLLL, null);
                }
                this.LIZLLL = null;
                return;
            }
            return;
        }
        C0WW6 c0ww62 = this.LIZLLL;
        if (c0ww62 == null) {
            return;
        }
        c0ww62.LJIIL = System.currentTimeMillis();
        c0ww62.LJIIJJI = 0;
        C23250099c.LIZLLL(c0ww62.LIZLLL, null, null, new C0W5A(c0ww62, this, null), 3);
    }

    @Override // X.C0W58
    public final void LJ(Bundle bundle, String str) throws JSONException {
        Object c098200Yq;
        C0WW6 c0ww6;
        String strOptString;
        C0WW6 c0ww62 = this.LIZLLL;
        if (c0ww62 == null) {
            return;
        }
        try {
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String strOptString2 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        String str2 = "";
        if (jSONObject == null) {
            LJIIIZ(c0ww62, "", false, "message is not json");
            return;
        }
        String strOptString3 = jSONObject.optString("type");
        if (Intrinsics.LJFF(strOptString3, "OPEN_EXTERNAL_BROWSER")) {
            C0WW6 c0ww63 = this.LIZLLL;
            if (c0ww63 != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("url")) != null) {
                    str2 = strOptString;
                }
                if (str2.length() == 0) {
                    LJIIIZ(c0ww63, strOptString3, false, "url is empty");
                    return;
                } else {
                    c0ww63.LIZ.runOnUiThread(new ARunnableS2S2200000_3(c0ww63, str2, strOptString3, this, 1));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.LJFF(strOptString3, "REQUEST_TOKEN") && (c0ww6 = this.LIZLLL) != null) {
            String strOptString4 = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject2 != null) {
                strOptString2 = jSONObjectOptJSONObject2.optString("hashed_nonce");
            }
            if (!u.LJIJI(C0WI6.LIZIZ(c0ww6.LJIIIIZZ.getBytes(Charsets.UTF_8)), strOptString2, true)) {
                LJIIIIZZ(c0ww6.LIZJ, strOptString4, "nonce not match");
                LJIIIZ(c0ww6, "REQUEST_TOKEN", false, "nonce not match");
                return;
            }
            if (c0ww6.LJIIJ) {
                LJIIIIZZ(c0ww6.LIZJ, strOptString4, "token already sent");
                LJIIIZ(c0ww6, "REQUEST_TOKEN", false, "token already sent");
                return;
            }
            C0W59 c0w59 = c0ww6.LIZJ;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("nonce", c0ww6.LJIIIIZZ);
            jSONObject2.put("id_token", c0ww6.LJII);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(FollowStatusChangeMethod.PARAM_UID, strOptString4);
            jSONObject3.put("type", "REQUEST_TOKEN");
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("data", jSONObject2);
            if (c0w59.LIZIZ(new Bundle(), C786410Ut5.J3(jSONObject3)) == 0) {
                C0WW6 c0ww64 = this.LIZLLL;
                if (c0ww64 != null) {
                    c0ww64.LJIIJ = true;
                }
                LJIIIZ(c0ww6, "REQUEST_TOKEN", true, "");
                return;
            }
            LJIIIZ(c0ww6, "REQUEST_TOKEN", false, "post message failed");
        }
    }

    public static void LJIIIIZZ(C0W59 c0w59, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, str);
        jSONObject.put("type", "REQUEST_TOKEN");
        jSONObject.put("timestamp", System.currentTimeMillis());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("message", str2);
        jSONObject.put("data", jSONObject2);
        c0w59.LIZIZ(new Bundle(), C786410Ut5.J3(jSONObject));
    }

    public static void LJIIJ(C0WW6 c0ww6, boolean z, String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("start_url", c0ww6.LJ);
        c0xgr.LIZLLL("target_url", c0ww6.LJFF);
        c0xgr.LIZ(c0ww6.LJIIJJI, "retry_count");
        long jCurrentTimeMillis = 0;
        if (c0ww6.LJIIL != 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - c0ww6.LJIIL;
        }
        c0xgr.LIZIZ(jCurrentTimeMillis, "duration");
        c0xgr.LIZLLL("is_success", C1529305yl.LIZ(Boolean.valueOf(z)));
        c0xgr.LIZLLL("error_msg", str);
        C20684815ws.LJIILLIIL("web_otl_custom_tab_channel_result", c0xgr.LIZ);
    }

    public static void LJIIIZ(C0WW6 c0ww6, String str, boolean z, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("start_url", c0ww6.LJ);
        c0xgr.LIZLLL("target_url", c0ww6.LJFF);
        c0xgr.LIZLLL("type", str);
        c0xgr.LIZLLL("is_success", C1529305yl.LIZ(Boolean.valueOf(z)));
        c0xgr.LIZLLL("error_msg", str2);
        C20684815ws.LJIILLIIL("web_otl_custom_tab_channel_message", c0xgr.LIZ);
    }

    @Override // X.C0W58
    public final void LJFF(int i, Uri uri, boolean z, Bundle bundle) {
        C0WW6 c0ww6 = this.LIZLLL;
        if (c0ww6 == null) {
            return;
        }
        if (z) {
            LJIIJ(c0ww6, true, "");
        } else {
            LJIIJ(c0ww6, false, "validate relationship failed");
        }
    }

    public static void LJIIJJI(long j, String str, boolean z, String str2, String str3) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("start_url", str);
        c0xgr.LIZLLL("target_url", str2);
        c0xgr.LIZLLL("is_success", C1529305yl.LIZ(Boolean.valueOf(z)));
        c0xgr.LIZLLL("error_msg", str3);
        c0xgr.LIZIZ(System.currentTimeMillis() - j, "duration");
        C20684815ws.LJIILLIIL("web_otl_custom_tab_launch_result", c0xgr.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(android.app.Activity r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, X.InterfaceC1364105Vn<? super java.lang.Boolean> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WW5.LJII(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
