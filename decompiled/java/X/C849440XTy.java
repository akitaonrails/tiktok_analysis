package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849440XTy extends AbstractC845940XGm<C0XT7<C849450XTz>> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C849450XTz LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_email_send_code", "email", this.LIZJ.LIZ("type"), c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
        this.LJIIIIZZ.LJ = jSONObject2;
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C849450XTz c849450XTz = this.LJIIIIZZ;
        c849450XTz.LJ = jSONObject;
        try {
            c849450XTz.LJFF = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject2, "has_account"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        return new C0XT7(z, 1024, this.LJIIIIZZ);
    }

    public C849440XTy(Context context, C845960XGo c845960XGo, C849450XTz c849450XTz, C0XZ0 c0xz0) {
        super(context, c845960XGo, c0xz0);
        this.LJIIIIZZ = c849450XTz;
    }

    public static C849440XTy LJIIJJI(Context context, String str, String str2, int i, Map map, C0XZ0 c0xz0) {
        C849450XTz c849450XTz = new C849450XTz(str, str2, i, map);
        C846070XGz c846070XGz = new C846070XGz();
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(c849450XTz.LJI)) {
            map2.put("email", C2093608Ic.LIZIZ(c849450XTz.LJI));
        }
        if (!TextUtils.isEmpty(null)) {
            map2.put("captcha", null);
        }
        map2.put("type", C2093608Ic.LIZIZ(String.valueOf(c849450XTz.LJII)));
        if (!TextUtils.isEmpty(c849450XTz.LJIIIZ)) {
            map2.put("password", C2093608Ic.LIZIZ(c849450XTz.LJIIIZ));
        }
        if (!TextUtils.isEmpty(null)) {
            map2.put("next", null);
        }
        map2.put("mix_mode", "1");
        c846070XGz.LJ(map2, c849450XTz.LJIIIIZZ);
        c846070XGz.LIZ = C838790WvN.LIZIZ(C0XH1.LIZ("/passport/email/send_code/"), null);
        return new C849440XTy(context, c846070XGz.LJFF(), c849450XTz, c0xz0);
    }
}
