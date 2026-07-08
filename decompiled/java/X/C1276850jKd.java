package X;

import com.bytedance.android.livesdk.livesetting.broadcast.PingAnchorReportStreamInfoSettings;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276850jKd {
    public int LIZ = -1;
    public JSONObject LIZIZ;

    public final void LIZ(JSONObject jSONObject) {
        String strOptString;
        if (PingAnchorReportStreamInfoSettings.INSTANCE.enable() && jSONObject != null && (strOptString = jSONObject.optString("event_key")) != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != 68963397) {
                if (iHashCode != 1724296198) {
                    if (iHashCode != 2011749223 || !strOptString.equals("rtc_push_stream")) {
                        return;
                    }
                } else {
                    if (!strOptString.equals("connect_end")) {
                        return;
                    }
                    this.LIZ = jSONObject.optInt("reconnect_count", -1);
                    return;
                }
            } else if (!strOptString.equals("push_stream")) {
                return;
            }
            this.LIZIZ = jSONObject;
        }
    }
}
