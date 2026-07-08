package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849510XUf implements InterfaceC849540XUi {
    public static volatile C849510XUf LIZIZ;
    public final Context LIZ;

    public static InterfaceC849540XUi LJIIL() {
        if (LIZIZ == null) {
            synchronized (C849510XUf.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C849510XUf();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C849510XUf() {
        TTAccountInit.LIZ();
        this.LIZ = C848000XOk.LIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LIZLLL(String str, Map map, final C850100XWm c850100XWm) {
        final Context context = this.LIZ;
        final C849580XUm c849580XUm = new C849580XUm(str, map);
        C846070XGz c846070XGz = new C846070XGz();
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(c849580XUm.LJI)) {
            map2.put("email", C2093608Ic.LIZIZ(c849580XUm.LJI));
        }
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, c849580XUm.LJII);
        c846070XGz.LIZ = C838790WvN.LIZIZ(C0XH1.LIZ("/passport/user/check_email_registered"), "");
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C849580XUm>>(context, c845960XGoLJFF, c849580XUm, c850100XWm) { // from class: X.0XUl
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C849580XUm LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_email_check_register", "email", this.LIZJ.LIZ("type"), c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ.LJIIIIZZ = jSONObject2.optInt("is_registered");
                this.LJIIIIZZ.LJIIIZ = jSONObject2.optInt("need_verify_email");
                this.LJIIIIZZ.LJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 1026, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c849580XUm;
            }
        }.LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LJ(String str, Map map, C0XUY c0xuy) {
        Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/account/switch/");
        c846070XGz.LIZJ("to_user_id", str);
        c846070XGz.LIZLLL(map);
        new C849470XUb(context, c846070XGz.LJFF(), c0xuy).LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LIZ(String str, String str2, Map map, C850200XWw c850200XWw) {
        C845550XEz.LIZ = 4;
        C845550XEz.LIZIZ = str;
        C0XX4.LJIIJJI(this.LIZ, null, str, null, str2, map, c850200XWw).LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LIZIZ(String str, String str2, Map map, C0XWP c0xwp) {
        Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C838790WvN.LIZIZ(C0XH1.LIZ("/passport/password/reset_by_email_ticket/"), null);
        HashMap map2 = new HashMap();
        map2.put("password", C2093608Ic.LIZIZ(str));
        map2.put("ticket", str2);
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, map);
        new C849620XUq(context, c846070XGz.LJFF(), "email", c0xwp).LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LIZJ(String str, String str2, Map map, final C850230XWz c850230XWz) {
        C845550XEz.LIZ = 4;
        C845550XEz.LIZIZ = str;
        final Context context = this.LIZ;
        final C849560XUk c849560XUk = new C849560XUk(str, str2);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/email/register/v2/");
        HashMap map2 = new HashMap();
        map2.put("email", C2093608Ic.LIZIZ(c849560XUk.LJI));
        if (!TextUtils.isEmpty(c849560XUk.LJIIIIZZ)) {
            map2.put("code", C2093608Ic.LIZIZ(c849560XUk.LJIIIIZZ));
        }
        map2.put("password", C2093608Ic.LIZIZ(c849560XUk.LJII));
        if (!TextUtils.isEmpty(c849560XUk.LJIIIZ)) {
            map2.put("recaptcha_token", c849560XUk.LJIIIZ);
        }
        map2.put("mix_mode", "1");
        map2.put("fixed_mix_mode", "1");
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C849560XUk>>(context, c845960XGoLJFF, c849560XUk, c850230XWz) { // from class: X.0XUh
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C849560XUk LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_email_register", "email", null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ.LJIIJ = C0XZS.LIZJ(jSONObject, jSONObject2);
                this.LJIIIIZZ.LJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 1009, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c849560XUk;
            }
        }.LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LJI(int i, String str, Map map, final C0XWR c0xwr) {
        final Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/email/verify/");
        c846070XGz.LIZJ("mix_mode", "1");
        c846070XGz.LIZJ("type", C2093608Ic.LIZIZ(String.valueOf(i)));
        c846070XGz.LIZJ("code", C2093608Ic.LIZIZ(str));
        c846070XGz.LIZLLL(map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C849670XUv>(context, c845960XGoLJFF, c0xwr) { // from class: X.0XUu
            public static final /* synthetic */ int LJIIJ = 0;
            public String LJIIIIZZ;
            public JSONObject LJIIIZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_email_verify", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIZ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIZ = jSONObject;
                this.LJIIIIZZ = jSONObject2.optString("ticket");
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                C849670XUv c849670XUv = new C849670XUv(z);
                if (z) {
                    c849670XUv.LJIIIZ = this.LJIIIIZZ;
                } else {
                    c849670XUv.LIZLLL = c845980XGq.LIZIZ;
                    c849670XUv.LJFF = c845980XGq.LIZJ;
                }
                c849670XUv.LJII = this.LJIIIZ;
                return c849670XUv;
            }
        }.LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LJIIIZ(String str, String str2, Map map, final C849190XSz c849190XSz) {
        C845550XEz.LIZ = 5;
        C845550XEz.LIZIZ = str;
        final Context context = this.LIZ;
        final C849250XTf c849250XTf = new C849250XTf(str, str2);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/username/register/");
        HashMap map2 = new HashMap();
        map2.put("username", C2093608Ic.LIZIZ(c849250XTf.LJI));
        map2.put("password", C2093608Ic.LIZIZ(c849250XTf.LJII));
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C849250XTf>>(context, c845960XGoLJFF, c849250XTf, c849190XSz) { // from class: X.0XT8
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C849250XTf LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_account_register", null, null, c0xga, null);
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
                return new C0XT7(z, 1023, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c849250XTf;
            }
        }.LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LJFF(String str, String str2, int i, Map map, C0XWN c0xwn) {
        Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C838790WvN.LIZIZ(C0XH1.LIZ("/passport/email/check_code/"), null);
        HashMap map2 = new HashMap();
        map2.put("email", C2093608Ic.LIZIZ(str));
        map2.put("code", C2093608Ic.LIZIZ(str2));
        map2.put("type", C2093608Ic.LIZIZ(String.valueOf(i)));
        map2.put("mix_mode", "1");
        map2.put("fixed_mix_mode", "1");
        c846070XGz.LJ(map2, map);
        new C849590XUn(context, c846070XGz.LJFF(), c0xwn).LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LJIIIIZZ(String str, String str2, int i, Map map, final C850000XWc c850000XWc) {
        C845550XEz.LIZ = 4;
        C845550XEz.LIZIZ = str;
        final Context context = this.LIZ;
        final C849550XUj c849550XUj = new C849550XUj(i, map, str, str2);
        C846070XGz c846070XGz = new C846070XGz();
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(c849550XUj.LJI)) {
            map2.put("email", C2093608Ic.LIZIZ(c849550XUj.LJI));
        }
        map2.put("type", C2093608Ic.LIZIZ(String.valueOf(c849550XUj.LJIIIIZZ)));
        if (!TextUtils.isEmpty(c849550XUj.LJII)) {
            map2.put("code", C2093608Ic.LIZIZ(c849550XUj.LJII));
        }
        map2.put("mix_mode", "1");
        map2.put("fixed_mix_mode", "1");
        c846070XGz.LJ(map2, c849550XUj.LJIIIZ);
        c846070XGz.LIZ = C838790WvN.LIZIZ(C0XH1.LIZ("/passport/email/register_verify_login/"), null);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XT7<C849550XUj>>(context, c845960XGoLJFF, c849550XUj, c850000XWc) { // from class: X.0XUg
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C849550XUj LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_email_register_verify", "email", this.LIZJ.LIZ("type"), c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ.LJIIJ = C0XZS.LIZJ(jSONObject, jSONObject2);
                this.LJIIIIZZ.LJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 1025, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c849550XUj;
            }
        }.LJIIIZ();
    }

    public final void LJIIJJI(String str, String str2, int i, Map map, C0XZ0 c0xz0) {
        C849440XTy.LJIIJJI(this.LIZ, str, str2, i, map, c0xz0).LJIIIZ();
    }

    @Override // X.InterfaceC849540XUi
    public final void LJII(String str, String str2, String str3, String str4, Map map, C0XUZ c0xuz) {
        Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/account/switch/v2/");
        c846070XGz.LIZJ("user_id", str);
        c846070XGz.LIZLLL(map);
        C845840XGc c845840XGc = new C845840XGc("target-session-key", str2);
        if (c846070XGz.LIZJ == null) {
            c846070XGz.LIZJ = new ArrayList();
        }
        ((ArrayList) c846070XGz.LIZJ).add(c845840XGc);
        if (str3 != null) {
            c846070XGz.LIZJ("vdc", str3);
        }
        if (str4 != null) {
            c846070XGz.LIZJ("target_region", str4);
        }
        new C849470XUb(context, c846070XGz.LJFF(), c0xuz).LJIIIZ();
    }

    public final void LJIIJ(String str, String str2, int i, int i2, Map map, C0XZ0 c0xz0) {
        Context context = this.LIZ;
        map.put("email_logic_type", String.valueOf(i2));
        C849440XTy.LJIIJJI(context, str, str2, i, map, c0xz0).LJIIIZ();
    }
}
