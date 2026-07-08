package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XXV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XXV extends AbstractC845940XGm<C0XT7<C850300XXg>> {
    public final C850300XXg LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_mobile_sendcode", "mobile", this.LIZJ.LIZ("type"), c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
        this.LJIIIIZZ.LJ = jSONObject2;
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C850300XXg c850300XXg = this.LJIIIIZZ;
        jSONObject2.optInt("retry_time", 30);
        c850300XXg.getClass();
        C850300XXg c850300XXg2 = this.LJIIIIZZ;
        c850300XXg2.LJ = jSONObject;
        try {
            c850300XXg2.LJFF = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject2, "has_account"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        if (z) {
            C850300XXg c850300XXg = this.LJIIIIZZ;
            c850300XXg.LIZ = 0;
            c850300XXg.LIZJ = "";
            c850300XXg.LIZIZ = 0;
        }
        return new C0XT7(z, 1002, this.LJIIIIZZ);
    }

    public C0XXV(Context context, C845960XGo c845960XGo, C850300XXg c850300XXg, C0XXH c0xxh) {
        super(context, c845960XGo, c0xxh);
        this.LJIIIIZZ = c850300XXg;
    }

    public static C0XXV LJIIJJI(Context context, String str, int i, String str2, int i2, int i3, String str3, String str4, Map map, C0XXH c0xxh) {
        C850300XXg c850300XXg = new C850300XXg(i, i2, i3, str, str2, str3, str4, map);
        C846070XGz c846070XGz = new C846070XGz();
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(c850300XXg.LJI)) {
            map2.put("mobile", C2093608Ic.LIZIZ(c850300XXg.LJI));
        }
        if (!TextUtils.isEmpty(c850300XXg.LJIIJ)) {
            map2.put("old_mobile", C2093608Ic.LIZIZ(c850300XXg.LJIIJ));
        }
        if (!TextUtils.isEmpty(null)) {
            map2.put("captcha", null);
        }
        map2.put("type", C2093608Ic.LIZIZ(String.valueOf(c850300XXg.LJIIIZ)));
        map2.put("unbind_exist", C2093608Ic.LIZIZ(String.valueOf(0)));
        map2.put("mix_mode", "1");
        int i4 = c850300XXg.LJIILLIIL;
        if (i4 == 1) {
            map2.put("check_register", "1");
        } else if (i4 == 0) {
            map2.put("check_register", CardStruct.IStatusCode.DEFAULT);
        }
        if (!TextUtils.isEmpty(c850300XXg.LJIIJJI)) {
            map2.put("ticket", c850300XXg.LJIIJJI);
        }
        map2.put("auto_read", String.valueOf(c850300XXg.LJIIL));
        if (!TextUtils.isEmpty(c850300XXg.LJIILIIL)) {
            map2.put("shark_ticket", c850300XXg.LJIILIIL);
        }
        if (!TextUtils.isEmpty(null)) {
            map2.put("auth_token", null);
        }
        if (!TextUtils.isEmpty(c850300XXg.LJIILJJIL)) {
            map2.put("unusable_mobile_ticket", c850300XXg.LJIILJJIL);
        }
        c846070XGz.LJ(map2, c850300XXg.LJIILL);
        c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/send_code/v1/");
        return new C0XXV(context, c846070XGz.LJFF(), c850300XXg, c0xxh);
    }
}
