package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09Ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2338609Ei {
    public static final C2338609Ei LIZ = new C2338609Ei();
    public static final Map<Integer, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(100, "100 - CheckCondition fail"), new Pair(200, "200 - Read cursor is empty"), new Pair(201, "201 - Prepare number for normalize is empty"), new Pair(202, "202 - Normalize result is empty"), new Pair(203, "203 - Is not possible number"), new Pair(204, "204 - Is illegal number"), new Pair(205, "205 - Read exception"), new Pair(206, "206 - Contact is invalid"), new Pair(207, "207 - NumberParseException"), new Pair(208, "208 - Parse fail"), new Pair(209, "209 - BPEAException"), new Pair(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), "300 - Transform result is empty"), new Pair(301, "301 - Phone hashed fail"), new Pair(302, "302 - Email hashed fail"), new Pair(401, "401 - Build upload params fail"), new Pair(402, "402 - Api request fail"));

    public static void LIZ(int i, String str, String str2, String str3, String str4, String str5) {
        Integer numValueOf;
        if (str == null && (str = LIZIZ.get(Integer.valueOf(i))) == null) {
            str = "specify key is null";
        }
        if (str2 != null) {
            numValueOf = Integer.valueOf(str2.length());
            if (str2.length() > 3) {
                str2.substring(0, 3);
            }
        } else {
            numValueOf = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "error_code");
        c2344009Gk.LJIIIIZZ("error_message", str);
        c2344009Gk.LJ(numValueOf, "origin_phone_number_length");
        c2344009Gk.LJIIIIZZ("sim_region_code", str3);
        c2344009Gk.LJIIIIZZ("sys_region_code", str4);
        c2344009Gk.LJIIIIZZ("used_region_code", str5);
        c2344009Gk.LIZJ(1, "event_version");
        C20684815ws.LJIILLIIL("process_contact_data", c2344009Gk.LIZ);
    }
}
