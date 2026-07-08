package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243960iTa {
    public static final void LIZ(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("ec_anchor_data");
        if (strOptString != null && strOptString.length() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                int iOptInt = jSONObject2.optInt("type", 6);
                String strOptString2 = jSONObject2.optString("keyword", "");
                String strOptString3 = jSONObject2.optString("subtype", "");
                String strOptString4 = jSONObject2.optString("url", "");
                String strOptString5 = jSONObject2.optString("anchor_content", "");
                AnchorTransData anchorTransData = new AnchorTransData(iOptInt, strOptString, strOptString2, "", 1, "", null, true, strOptString4, "", Long.valueOf(SystemClock.elapsedRealtime()), "", strOptString3, true, null, null, null, null, 0, -1, null, null);
                if (strOptString5.length() > 0) {
                    anchorTransData.setAnchorContent(strOptString5);
                }
                Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeString("ec_anchor_data", C1741890vQh.LJIIIIZZ(anchorTransData));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
