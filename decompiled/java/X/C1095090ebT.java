package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ebT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095090ebT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, int i, long j, long j2, C1095010ebL c1095010ebL, C1095010ebL c1095010ebL2, int i2, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        C0K04.LJFF("abnormal_place", str, jSONObject2);
        C0K04.LJ("cur_level", j, jSONObject4);
        C0K04.LJ("new_level", j2, jSONObject4);
        C0K04.LIZLLL(i2, "room_channel_times", jSONObject4);
        C0K04.LJFF("cur_log_data", C1095080ebS.LIZ(c1095010ebL), jSONObject4);
        C0K04.LJFF("new_log_data", C1095080ebS.LIZ(c1095010ebL2), jSONObject4);
        C0K04.LIZLLL(i, "cur_fans_status", jSONObject4);
        if (jSONObject != null) {
            C0K04.LJFF("other_info", C786410Ut5.J3(jSONObject), jSONObject4);
        }
        C0K04.LJII("extra", jSONObject5, jSONObject4);
        C1CC2.LJ("ttlive_level_inconsistent_event", jSONObject2, jSONObject3, jSONObject5);
    }
}
