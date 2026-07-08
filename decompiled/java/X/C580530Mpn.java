package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580530Mpn {
    public static List<AnchorTransData> LIZ;
    public static List<String> LIZIZ;
    public static ExtraMentionUserModel LIZJ;

    public static String LIZ(List list) {
        if (!C0C2N.LIZ || list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((AnchorTransData) it2.next()).businessType == 95) {
                return "glip_live_recording_page";
            }
        }
        return null;
    }

    public static void LIZIZ(String str, String str2) {
        JSONObject jSONObject;
        String strLJIJI = str2;
        if (C123100dR.LIZ(str)) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                e = e;
            }
            try {
                jSONObject.put("third_id", str);
            } catch (JSONException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            if (strLJIJI == null || strLJIJI.length() == 0) {
                strLJIJI = C497740JfY.LJIJI(2131853261);
            }
            if (jSONObject != null) {
                AnchorTransData anchorTransData = new AnchorTransData(95, C786410Ut5.J3(jSONObject), strLJIJI, "", 0, str, null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null);
                ArrayList arrayList = new ArrayList();
                LIZ = arrayList;
                arrayList.add(anchorTransData);
            }
        }
    }

    public static void LIZJ(String str, String str2, List list) {
        boolean z;
        LIZIZ = list;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        ExtraMentionUserModel extraMentionUserModel = null;
        if (!z && str2 != null && str2.length() != 0) {
            ExtraMentionUserModel extraMentionUserModel2 = new ExtraMentionUserModel();
            extraMentionUserModel2.addMentionUser(str, str2);
            if (!extraMentionUserModel2.getUserList().isEmpty()) {
                extraMentionUserModel = extraMentionUserModel2;
            }
            LIZJ = extraMentionUserModel;
            return;
        }
        LIZJ = null;
    }
}
