package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XXU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XXU implements C0XXT {
    public static volatile C0XXU LIZIZ;
    public final Context LIZ;

    public static C0XXT LJIILL() {
        if (LIZIZ == null) {
            synchronized (C0XXU.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0XXU();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C0XXU() {
        TTAccountInit.LIZ();
        this.LIZ = C848000XOk.LIZ();
    }

    @Override // X.C0XXT
    public final void LJ(final C591830NJd c591830NJd) {
        final Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/cancel/do/");
        c846070XGz.LIZJ("type", CardStruct.IStatusCode.DEFAULT);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C850420XXs>(context, c845960XGoLJFF, c591830NJd) { // from class: X.0XXh
            public static final /* synthetic */ int LJIIIIZZ = 0;

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
            }

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_cancel_do", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(final boolean z, C845980XGq c845980XGq) {
                C0XGA c0xga = new C0XGA(z) { // from class: X.0XXs
                };
                if (!z) {
                    c0xga.LIZLLL = c845980XGq.LIZIZ;
                    c0xga.LJFF = c845980XGq.LIZJ;
                }
                return c0xga;
            }
        }.LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LIZJ(String str, Map map, final C0XY5 c0xy5) {
        final Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/password/check/");
        HashMap map2 = new HashMap();
        map2.put("password", C2093608Ic.LIZIZ(str));
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C850430XXt>(context, c845960XGoLJFF, c0xy5) { // from class: X.0XXf
            public static final /* synthetic */ int LJIIIZ = 0;
            public C850430XXt LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
            }

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_check_password", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ = new C850430XXt(true);
                jSONObject2.optString("captcha");
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                C850430XXt c850430XXt = this.LJIIIIZZ;
                if (c850430XXt == null) {
                    c850430XXt = new C850430XXt(z);
                } else {
                    c850430XXt.LIZIZ = z;
                }
                if (!z) {
                    c850430XXt.LIZLLL = c845980XGq.LIZIZ;
                    c850430XXt.LJFF = c845980XGq.LIZJ;
                }
                return c850430XXt;
            }
        }.LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJIIIZ(String str, Map map, final AbstractC850450XXv abstractC850450XXv) {
        final Context context = this.LIZ;
        final C850360XXm c850360XXm = new C850360XXm(str);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/password/set/");
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(null)) {
            map2.put("captcha", null);
        }
        map2.put("password", C2093608Ic.LIZIZ(c850360XXm.LJI));
        map2.put("mix_mode", "1");
        map2.putAll(map);
        c846070XGz.LIZLLL(map2);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C850360XXm>>(context, c845960XGoLJFF, c850360XXm, abstractC850450XXv) { // from class: X.0XXc
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C850360XXm LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_mobile_set_password", "mobile", null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ.LJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 10002, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c850360XXm;
            }
        }.LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJIIJJI(String str, String str2, C850210XWx c850210XWx) {
        LJIIJ(str, str2, null, c850210XWx);
    }

    @Override // X.C0XXT
    public final void LIZ(String str, int i, Map map, final C0XXI c0xxi) {
        final Context context = this.LIZ;
        final C850300XXg c850300XXg = new C850300XXg(str, i);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/send_voice_code/");
        HashMap map2 = new HashMap();
        map2.put("mobile", C2093608Ic.LIZIZ(c850300XXg.LJI));
        if (!TextUtils.isEmpty(c850300XXg.LJIIJ)) {
            map2.put("old_mobile", C2093608Ic.LIZIZ(c850300XXg.LJIIJ));
        }
        map2.put("captcha", c850300XXg.LJII);
        map2.put("type", C2093608Ic.LIZIZ(String.valueOf(c850300XXg.LJIIIZ)));
        map2.put("unbind_exist", C2093608Ic.LIZIZ(String.valueOf(0)));
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C850300XXg>>(context, c845960XGoLJFF, c850300XXg, c0xxi) { // from class: X.0XXL
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C850300XXg LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_mobile_send_voice_code", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                C850300XXg c850300XXg2 = this.LJIIIIZZ;
                jSONObject2.optInt("retry_time", 30);
                c850300XXg2.getClass();
                this.LJIIIIZZ.LJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 1002, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c850300XXg;
            }
        }.LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LIZIZ(String str, int i, Map map, C850060XWi c850060XWi) {
        C0XXV.LJIIJJI(this.LIZ, str, i, null, -1, 0, null, null, map, c850060XWi).LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LIZLLL(String str, String str2, Map map, final C850240XXa c850240XXa) {
        C845550XEz.LIZ = 2;
        C845550XEz.LIZIZ = str;
        final Context context = this.LIZ;
        final C850350XXl c850350XXl = new C850350XXl(str, str2);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/sms_login_continue/");
        HashMap map2 = new HashMap();
        map2.put("mobile", C2093608Ic.LIZIZ(c850350XXl.LJI));
        map2.put("sms_code_key", C2093608Ic.LIZIZ(String.valueOf(c850350XXl.LJII)));
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C850350XXl>>(context, c845960XGoLJFF, c850350XXl, c850240XXa) { // from class: X.0XXZ
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C850350XXl LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_mobile_login_continue", "mobile", "login_continue", c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ.LJIIIIZZ = C0XZS.LIZJ(jSONObject, jSONObject2);
                this.LJIIIIZZ.LJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 1022, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c850350XXl;
            }
        }.LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJFF(String str, String str2, Map map, final C0XYE c0xye) {
        final Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/password/update/");
        HashMap map2 = new HashMap();
        map2.put("current_password", C2093608Ic.LIZIZ(str));
        map2.put("password", C2093608Ic.LIZIZ(str2));
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C850440XXu>(context, c845960XGoLJFF, c0xye) { // from class: X.0XXi
            public static final /* synthetic */ int LJIIIIZZ = 0;

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
            }

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_update_pwd", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(final boolean z, C845980XGq c845980XGq) {
                C0XGA c0xga = new C0XGA(z) { // from class: X.0XXu
                };
                if (!z) {
                    c0xga.LIZLLL = c845980XGq.LIZIZ;
                    c0xga.LJFF = c845980XGq.LIZJ;
                }
                return c0xga;
            }
        }.LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJII(String str, String str2, Map map, final C0XY3 c0xy3) {
        C845550XEz.LIZ = 2;
        C845550XEz.LIZIZ = str;
        final Context context = this.LIZ;
        final C850340XXk c850340XXk = new C850340XXk(str, str2);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/sms_login_only/");
        HashMap map2 = new HashMap();
        map2.put("mobile", C2093608Ic.LIZIZ(c850340XXk.LJI));
        if (!TextUtils.isEmpty(c850340XXk.LJIIIIZZ)) {
            map2.put("captcha", c850340XXk.LJIIIIZZ);
        }
        map2.put("code", C2093608Ic.LIZIZ(String.valueOf(c850340XXk.LJII)));
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C850340XXk>>(context, c845960XGoLJFF, c850340XXk, c0xy3) { // from class: X.0XXX
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C850340XXk LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_mobile_login_only", "mobile", "login_only", c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
                try {
                    jSONObject.optString("sms_code_key");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ.LJIIIZ = C0XZS.LIZJ(jSONObject, jSONObject2);
                this.LJIIIIZZ.LJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 1021, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c850340XXk;
            }
        }.LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJIIJ(String str, String str2, Map map, AbstractC850220XWy abstractC850220XWy) {
        C845550XEz.LIZ = 5;
        C845550XEz.LIZIZ = str;
        C0XX4.LJIIJJI(this.LIZ, null, null, str, str2, map, abstractC850220XWy).LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJIIL(String str, String str2, Map map, C850200XWw c850200XWw) {
        C845550XEz.LIZ = 3;
        C845550XEz.LIZIZ = str;
        C0XX4.LJIIJJI(this.LIZ, str, null, null, str2, map, c850200XWw).LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJIILIIL(String str, String str2, Map map, C0XXR c0xxr) {
        Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/password/reset_by_ticket/");
        HashMap map2 = new HashMap();
        map2.put("password", C2093608Ic.LIZIZ(str));
        map2.put("ticket", C2093608Ic.LIZIZ(str2));
        map2.put("mix_mode", "1");
        map2.putAll(map);
        c846070XGz.LIZLLL(map2);
        new C849620XUq(context, c846070XGz.LJFF(), "mobile", c0xxr).LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJIIIIZZ(String str, String str2, int i, Map map, C0XWQ c0xwq) {
        Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/check_code/");
        HashMap map2 = new HashMap();
        map2.put("mobile", C2093608Ic.LIZIZ(str));
        map2.put("code", C2093608Ic.LIZIZ(str2));
        map2.put("type", C2093608Ic.LIZIZ(String.valueOf(i)));
        map2.put("mix_mode", "1");
        map2.put("fixed_mix_mode", "1");
        c846070XGz.LJ(map2, map);
        new C849590XUn(context, c846070XGz.LJFF(), c0xwq).LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJIILJJIL(String str, String str2, String str3, C830490Whz c830490Whz, final C850280XXe c850280XXe) {
        final Context context = this.LIZ;
        final C850330XXj c850330XXj = new C850330XXj(str, str2, str3, c830490Whz);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/change/v1/");
        HashMap map = new HashMap();
        map.put("mobile", C2093608Ic.LIZIZ(c850330XXj.LJI));
        if (!TextUtils.isEmpty(c850330XXj.LJII)) {
            map.put("captcha", c850330XXj.LJII);
        }
        map.put("code", C2093608Ic.LIZIZ(c850330XXj.LJIIIIZZ));
        map.put("mix_mode", "1");
        if (!TextUtils.isEmpty(c850330XXj.LJIIIZ)) {
            map.put("ticket", c850330XXj.LJIIIZ);
        }
        c846070XGz.LJ(map, c850330XXj.LJIIJ);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C850330XXj>>(context, c845960XGoLJFF, c850330XXj, c850280XXe) { // from class: X.0XXY
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C850330XXj LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_mobile_change", "mobile", null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ.LJIIJJI = C0XZS.LIZJ(jSONObject, jSONObject2);
                this.LJIIIIZZ.LJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 1011, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c850330XXj;
            }
        }.LJIIIZ();
    }

    @Override // X.C0XXT
    public final void LJI(String str, int i, int i2, String str2, Map map, final C0XY8 c0xy8) {
        final Context context = this.LIZ;
        final C850390XXp c850390XXp = new C850390XXp(i, i2, str, str2);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/validate_code/v1/");
        HashMap map2 = new HashMap();
        map2.put("mix_mode", "1");
        map2.put("fixed_mix_mode", "1");
        map2.put("code", C2093608Ic.LIZIZ(Uri.encode(str)));
        map2.put("type", C2093608Ic.LIZIZ(String.valueOf(i)));
        map2.put("need_ticket", "1");
        if (i2 > 0) {
            map2.put(Scene.SCENE_SERVICE, String.valueOf(i2));
        }
        if (!TextUtils.isEmpty(str2)) {
            map2.put("shark_ticket", str2);
        }
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C850410XXr>(context, c845960XGoLJFF, c850390XXp, c0xy8) { // from class: X.0XXq
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C850390XXp LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_mobile_validate_code_v1", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZ(this.LJIIIIZZ, jSONObject);
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                if (jSONObject2 != null) {
                    this.LJIIIIZZ.LJFF = jSONObject2.optString("ticket", "");
                }
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                C850410XXr c850410XXr = new C850410XXr(z);
                if (z) {
                    c850410XXr.LJIIIZ = this.LJIIIIZZ.LJFF;
                    return c850410XXr;
                }
                C850390XXp c850390XXp2 = this.LJIIIIZZ;
                c850410XXr.LIZLLL = c850390XXp2.LIZ;
                c850410XXr.LJFF = c850390XXp2.LIZIZ;
                return c850410XXr;
            }

            {
                this.LJIIIIZZ = c850390XXp;
            }
        }.LJIIIZ();
    }

    public final void LJIILLIIL(String str, int i, String str2, int i2, int i3, String str3, String str4, Map map, C0XXH c0xxh) {
        C0XXV.LJIIJJI(this.LIZ, str, i, str2, i2, i3, str3, str4, map, c0xxh).LJIIIZ();
    }
}
