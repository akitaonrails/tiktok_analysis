package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XX4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XX4 extends AbstractC845940XGm<C0XT7<C0XX6>> {
    public final C0XX6 LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_account_login", null, null, c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
        this.LJIIIIZZ.LJ = jSONObject2;
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ.LJIILJJIL = C0XZS.LIZJ(jSONObject, jSONObject2);
        this.LJIIIIZZ.LJ = jSONObject;
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        return new C0XT7(z, 1016, this.LJIIIIZZ);
    }

    public C0XX4(Context context, C845960XGo c845960XGo, C0XX6 c0xx6, AbstractC850220XWy abstractC850220XWy) {
        super(context, c845960XGo, abstractC850220XWy);
        this.LJIIIIZZ = c0xx6;
    }

    public static C0XX4 LJIIJJI(Context context, String str, String str2, String str3, String str4, Map map, AbstractC850220XWy abstractC850220XWy) {
        String lowerCase = str3;
        if (lowerCase != null) {
            lowerCase = lowerCase.toLowerCase();
        }
        C0XX6 c0xx6 = new C0XX6(0, str2, lowerCase, str, null, str4, null);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/user/login/");
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(c0xx6.LJI)) {
            map2.put("email", C2093608Ic.LIZIZ(c0xx6.LJI));
        }
        if (!TextUtils.isEmpty(c0xx6.LJIIIIZZ)) {
            map2.put("mobile", C2093608Ic.LIZIZ(c0xx6.LJIIIIZZ));
        }
        if (!TextUtils.isEmpty(c0xx6.LJII)) {
            map2.put("username", C2093608Ic.LIZIZ(c0xx6.LJII));
        }
        if (!TextUtils.isEmpty(c0xx6.LJIIIZ)) {
            map2.put("account", C2093608Ic.LIZIZ(c0xx6.LJIIIZ));
        }
        if (!TextUtils.isEmpty(c0xx6.LJIIJJI)) {
            map2.put("token", c0xx6.LJIIJJI);
        }
        if (!TextUtils.isEmpty(c0xx6.LJIIL)) {
            map2.put("captcha", c0xx6.LJIIL);
        }
        int i = c0xx6.LJIILIIL;
        if (i > 0) {
            map2.put(Scene.SCENE_SERVICE, C2093608Ic.LIZIZ(String.valueOf(i)));
        }
        map2.put("password", C2093608Ic.LIZIZ(c0xx6.LJIIJ));
        map2.put("mix_mode", "1");
        c846070XGz.LIZLLL(map2);
        c846070XGz.LIZLLL(map);
        return new C0XX4(context, c846070XGz.LJFF(), c0xx6, abstractC850220XWy);
    }
}
