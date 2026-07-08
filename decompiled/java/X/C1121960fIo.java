package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121960fIo {
    public static void LIZ(DataChannel dataChannel, JSONObject jSONObject) {
        long jLongValue;
        C1121950fIn c1121950fIn = new C1121950fIn();
        c1121950fIn.LLILLJJLI = jSONObject.optInt("route_smb", 0);
        String strOptString = jSONObject.optString("pcs_scheme", "");
        c1121950fIn.LLILZ = strOptString;
        if (c1121950fIn.LLILLJJLI <= 0 && strOptString.length() == 0) {
            return;
        }
        c1121950fIn.LLILLL = jSONObject.optString("show_entrance", "");
        if (jSONObject.optString("previous_page", "").length() == 0) {
            jSONObject.optString("request_from", "");
        }
        c1121950fIn.LLILZIL = jSONObject.optInt("opt_in_guidance", 0);
        c1121950fIn.LLILZLL = jSONObject.optInt("setting_guidance", 0);
        Long lLJJLIL = C500260Jjc.LJJLIL(jSONObject.optString("click_go_live_time_stamp", ""));
        if (lLJJLIL != null) {
            jLongValue = lLJJLIL.longValue();
        } else {
            jLongValue = 0;
        }
        c1121950fIn.LLIZ = jLongValue;
        c1121950fIn.LLJ = jSONObject.optInt("smb_opt_in_status", -1);
        c1121950fIn.LLIZLLLIL = jSONObject.optString("pcs_track_context", "");
        c1121950fIn.LL = dataChannel;
        if (dataChannel == null) {
            return;
        }
        C2659011d.LIZIZ(dataChannel, C1121950fIn.class, c1121950fIn, false);
    }
}
