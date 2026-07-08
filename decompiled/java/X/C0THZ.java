package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0THZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str);
        jSONObject.put("partner_uid", j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("partner avatar missing source=");
        sbLIZ.append(str);
        sbLIZ.append(" uid=");
        sbLIZ.append(j);
        C20441214yg.LJIIL("QuickCohostImPartnerMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C1CC2.LJIIIIZZ("im_partner_avatar_missing", 1, jSONObject);
    }

    public static void LIZIZ(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", str);
        jSONObject.put("partner_uid", j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("partner nickname missing source=");
        sbLIZ.append(str);
        sbLIZ.append(" uid=");
        sbLIZ.append(j);
        C20441214yg.LJIIL("QuickCohostImPartnerMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C1CC2.LJIIIIZZ("im_partner_nickname_missing", 1, jSONObject);
    }
}
