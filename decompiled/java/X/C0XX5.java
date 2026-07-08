package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XX5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XX5 {
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0XX2] */
    public static C0XX2 LIZ(final Context context, String str, String str2, int i, int i2, final C850210XWx c850210XWx) {
        final C0XX6 c0xx6 = new C0XX6(i, "", "", "", "", str2, "");
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/user/login/");
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(c0xx6.LJI)) {
            map.put("email", C2093608Ic.LIZIZ(c0xx6.LJI));
        }
        if (!TextUtils.isEmpty(c0xx6.LJIIIIZZ)) {
            map.put("mobile", C2093608Ic.LIZIZ(c0xx6.LJIIIIZZ));
        }
        if (!TextUtils.isEmpty(c0xx6.LJII)) {
            map.put("username", C2093608Ic.LIZIZ(c0xx6.LJII));
        }
        if (!TextUtils.isEmpty(c0xx6.LJIIIZ)) {
            map.put("account", C2093608Ic.LIZIZ(c0xx6.LJIIIZ));
        }
        if (!TextUtils.isEmpty(c0xx6.LJIIJJI)) {
            map.put("token", c0xx6.LJIIJJI);
        }
        if (!TextUtils.isEmpty(c0xx6.LJIIL)) {
            map.put("captcha", c0xx6.LJIIL);
        }
        int i3 = c0xx6.LJIILIIL;
        if (i3 > 0) {
            map.put(Scene.SCENE_SERVICE, C2093608Ic.LIZIZ(String.valueOf(i3)));
        }
        map.put("password", C2093608Ic.LIZIZ(c0xx6.LJIIJ));
        map.put("mix_mode", "1");
        if (str != null) {
            map.put("not_login_ticket", str);
        }
        map.put("account_type", String.valueOf(i2));
        c846070XGz.LIZLLL(map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        return new AbstractC845940XGm<C0XT7<C0XX6>>(context, c845960XGoLJFF, c0xx6, c850210XWx) { // from class: X.0XX2
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C0XX6 LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_account_login", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                C0XX6 c0xx62 = this.LJIIIIZZ;
                if (c0xx62 != null) {
                    c0xx62.LJ = jSONObject2;
                }
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XX6 c0xx62 = this.LJIIIIZZ;
                if (c0xx62 != null) {
                    c0xx62.LJIILJJIL = C0XZS.LIZJ(jSONObject, jSONObject2);
                }
                C0XX6 c0xx63 = this.LJIIIIZZ;
                if (c0xx63 != null) {
                    c0xx63.LJ = jSONObject;
                }
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 1016, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c0xx6;
            }
        };
    }
}
