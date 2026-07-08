package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571180qzM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final int i, final String str) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0qzL
            public final void LIZ() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                String str2 = str;
                int i2 = i;
                jSONObject.put("icon_name", C1571300qzY.LIZIZ(str2));
                jSONObject.put("location", (i2 & 8388611) == 8388611 ? "top_left_icon" : "top_right_icon");
                C20684815ws.LJIJ("click_top_icon", jSONObject);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ToolbarIconTrackHelper@ffa6.trackIconClick$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ToolbarIconTrackHelper@ffa6.trackIconClick$1");
            }
        });
    }
}
