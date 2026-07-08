package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.account.TTAccountInit;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XU0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XU0 implements C0XU1 {
    public static volatile C0XU0 LIZIZ;
    public final Context LIZ;

    public C0XU0() {
        TTAccountInit.LIZ();
        this.LIZ = C848000XOk.LIZ();
    }

    @Override // X.C0XU1
    public final void LIZ(String str, String str2, String str3, Map map, final C850140XWq c850140XWq) {
        final Context context = this.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/account/verify/");
        HashMap map2 = new HashMap();
        map2.put("mix_mode", "1");
        if (!TextUtils.isEmpty(null)) {
            map2.put("username", C2093608Ic.LIZIZ(null));
        }
        if (!TextUtils.isEmpty(str)) {
            map2.put("mobile", C2093608Ic.LIZIZ(str));
        }
        if (!TextUtils.isEmpty(null)) {
            map2.put("email", C2093608Ic.LIZIZ(null));
        }
        if (!TextUtils.isEmpty(str2)) {
            map2.put("password", C2093608Ic.LIZIZ(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            map2.put("verify_ticket", str3);
        }
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        new AbstractC845940XGm<C0XU3>(context, c845960XGoLJFF, c850140XWq) { // from class: X.0XU2
            public static final /* synthetic */ int LJIIJ = 0;
            public String LJIIIIZZ;
            public JSONObject LJIIIZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_account_verify", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                jSONObject.optString("captcha");
                this.LJIIIZ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ = jSONObject2.optString("ticket");
                jSONObject2.optString("verify_ticket");
                this.LJIIIZ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                C0XU3 c0xu3 = new C0XU3(z);
                if (z) {
                    c0xu3.LJIIIZ = this.LJIIIIZZ;
                } else {
                    c0xu3.LIZLLL = c845980XGq.LIZIZ;
                    c0xu3.LJFF = c845980XGq.LIZJ;
                }
                c0xu3.LJII = this.LJIIIZ;
                return c0xu3;
            }
        }.LJIIIZ();
    }
}
