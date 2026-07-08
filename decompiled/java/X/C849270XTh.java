package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849270XTh {
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0XTi] */
    public static C849280XTi LIZ(final Context context, String str, String str2, Map map, final AbstractC849290XTj abstractC849290XTj) {
        final C849260XTg c849260XTg = new C849260XTg(str, str2, map);
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/app/email/code_login/");
        HashMap map2 = new HashMap();
        map2.put("email", C2093608Ic.LIZIZ(c849260XTg.LJI));
        if (c849260XTg.LJII.length() > 0) {
            map2.put("code", C2093608Ic.LIZIZ(c849260XTg.LJII));
        }
        map2.put("type", C2093608Ic.LIZIZ("13"));
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        return new AbstractC845940XGm<C0XT7<C849260XTg>>(context, c845960XGoLJFF, c849260XTg, abstractC849290XTj) { // from class: X.0XTi
            public static final /* synthetic */ int LJIIIZ = 0;
            public final C849260XTg LJIIIIZZ;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                C0XG9.LIZIZ("passport_email_check_code", "email", null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                this.LJIIIIZZ.LJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIIZZ.LJIIIZ = C0XZS.LIZJ(jSONObject, jSONObject2);
                this.LJIIIIZZ.LJ = jSONObject;
                jSONObject2.optString("ticket");
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                return new C0XT7(z, 10046, this.LJIIIIZZ);
            }

            {
                this.LJIIIIZZ = c849260XTg;
            }
        };
    }
}
