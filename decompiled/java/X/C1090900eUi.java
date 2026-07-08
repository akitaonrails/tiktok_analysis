package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090900eUi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        C0K04.LIZLLL(i, "play_status", jSONObject);
        if (str == null) {
            str = "unkown";
        }
        C0K04.LJFF("channel", str, jSONObject);
        if (str2 == null) {
            str2 = "unkown";
        }
        C0K04.LJFF("videoname", str2, jSONObject);
        C0K04.LJII("extra", jSONObject4, jSONObject3);
        C1CC2.LJ("ttlive_barrage_player_status_event", jSONObject, jSONObject2, jSONObject4);
    }
}
