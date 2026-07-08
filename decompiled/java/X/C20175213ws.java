package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20175213ws {
    public static final C20175213ws LIZ = new C20175213ws();

    public static void LIZ(C20175213ws c20175213ws, EnumC2215301Bn6 enumC2215301Bn6, EnumC20175313wt enumC20175313wt, Long l, String str, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        c20175213ws.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        String strName = enumC2215301Bn6.name();
        Locale locale = Locale.ROOT;
        c2344009Gk.LJFF("key", strName.toLowerCase(locale));
        c2344009Gk.LJFF("aigc_type", str);
        c2344009Gk.LJ(l, "duration");
        c2344009Gk.LJFF("error_code", str2);
        c2344009Gk.LIZJ(enumC20175313wt.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (str3 != null) {
            c2344009Gk.LJFF("error_desc", str3);
        }
        C20684815ws.LJIILLIIL("aigc_performance", c2344009Gk.LIZ);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", enumC2215301Bn6.name().toLowerCase(locale));
            jSONObject.put("aigc_type", str);
            jSONObject.put("duration", l);
            jSONObject.put("error_code", str2);
            if (str3 != null) {
                jSONObject.put("error_desc", str3);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[AIGCPerformance] - aweme_aigc_performance extra : ");
            sbLIZ.append(jSONObject);
            sbLIZ.append(" status: ");
            sbLIZ.append(enumC20175313wt.name());
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            C1637890six.LJ("aweme_aigc_performance", enumC20175313wt.getValue(), jSONObject);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
