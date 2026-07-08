package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0POL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0POL {
    public static final C0POL LIZ = new C0POL();

    public static void LIZ(boolean z, EnumC643900PNk enumC643900PNk, C0POK c0pok) {
        int i;
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", z ? 1 : 0);
        if (enumC643900PNk != null) {
            jSONObject.put("error_code", enumC643900PNk.getErrorCode());
        }
        if (c0pok != null) {
            Integer num = c0pok.LLLIIII;
            if (num != null) {
                jSONObject.put("cancel_type", num.intValue());
            }
            String str2 = c0pok.LLLIIIIL;
            if (str2 != null) {
                jSONObject.put("cancel_from", str2);
            }
            Long l = c0pok.LLLIIL;
            if (l != null) {
                jSONObject.put("cancel_cost", l.longValue());
            }
        }
        AppLogNewUtils.onEventV3("ttk_search_success_gather", jSONObject);
        if (C0POO.LIZ()) {
            EnumC643900PNk enumC643900PNk2 = EnumC643900PNk.EMPTY_LIST;
            if (enumC643900PNk == enumC643900PNk2 || enumC643900PNk == EnumC643900PNk.FAILED) {
                if (enumC643900PNk == enumC643900PNk2) {
                    i = 610;
                    str = "comp search return empty list";
                } else {
                    i = 611;
                    str = "comp search request failed";
                }
                C0QO8.LIZ.LJII(new C666110QAv(i, str));
            }
        }
    }
}
